package net.ouranos.application.digiline.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.Resources;
import net.ouranos.domain.digiline.model.Voxel;
import net.ouranos.transform.digiline.Transform;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ResourcesApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private Adaptor<Object> adaptor;

    /**
     * {@link TokenIntrospection} のモック。
     */
    @Mock
    private TokenIntrospection tokenIntrospection;

    /**
     * {@link HttpServletRequest} のモック。
     */
    @Mock
    private HttpServletRequest request;

    /**
     * {@link ServletRequestAttributes} のモック。
     */
    @Mock
    private ServletRequestAttributes servletRequestAttributes;


    /**
     * テスト対象クラス{@link ResourcesApiController} 。
     */
    @InjectMocks
    private ResourcesApiController resourcesApiController;

    private UUID xTracking;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        xTracking = UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testDelete_query() throws Exception {
        // テストデータ
        List<Double> bbox = new ArrayList<Double>();
        Voxel voxel = new Voxel();
        BigDecimal mesh = new BigDecimal(0);
        BigDecimal city= new BigDecimal(0);
        String roadName = "roadName";
        String category = "category";
        String keyFilter = "keyFilter";
        BigDecimal lowerBound= new BigDecimal(0);
        BigDecimal upperBound= new BigDecimal(0);
        bbox.add((double)0);
        bbox.add((double)1);
        String queryParam = bbox+"&"+voxel+"&"+mesh+"&"+city+"&"+roadName+"&"+category+"&"+keyFilter+"&"+lowerBound+"&"+upperBound;
       
        ResponseEntity<Void> responseEntity = ResponseEntity.ok().header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(adaptor.sendDelete(xTracking, queryParam, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Void> response = resourcesApiController.resourcesDelete(xTracking, bbox, voxel, mesh, city, roadName, category, keyFilter, lowerBound, upperBound);

        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが200 OKであること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

    @Test
    void testPut_query() {
        // テストデータ
        Resources dataModelResources = new Resources();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelResources);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(transform.encode(dataModelResources, uuid, null)).thenReturn(dataModelResources);
        when(adaptor.sendPut(dataModelResources, uuid, null, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, null)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = resourcesApiController.resourcesPut(uuid, dataModelResources);

        // 検証
        assertEquals(ResponseEntity.ok(dataModelResources), response, "レスポンスが期待通りであること");
        verify(transform, times(1)).encode(dataModelResources, uuid, null);
        verify(adaptor, times(1)).sendPut(dataModelResources, uuid, null, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

}