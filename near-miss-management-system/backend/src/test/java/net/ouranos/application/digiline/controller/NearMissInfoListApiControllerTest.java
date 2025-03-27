package net.ouranos.application.digiline.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import jakarta.servlet.http.HttpServletRequest;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.DataModelNearMissInfoList;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.time.OffsetDateTime;
import java.util.UUID;

public class NearMissInfoListApiControllerTest {

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
     * テスト対象クラス{@link NearMissInfoListApiController} 。
     */    @InjectMocks
    private NearMissInfoListApiController nearMissInfoListApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
    }

    @Test
    void testGet_query() {
        // テストデータ
        Object dataModelNearMissInfoList = new DataModelNearMissInfoList();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelNearMissInfoList);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
        UUID xTracking = UUID.randomUUID();
        UUID id = UUID.randomUUID();
        String name = "name";
        String category = "category";
        String summary = "summary";
        OffsetDateTime from = OffsetDateTime.now();
        OffsetDateTime to =OffsetDateTime.now();
        Double lat0 = (double) 0;
        Double lon0 = (double) 0;
        Double lat1 = (double) 0;
        Double lon1 = (double) 0;
        String queryParam = id+"&"+name+"&"+category+"&"+ summary+"&"+from+"&"+to+"&"+lat0+"&"+lon0+"&"+lat1+"&"+lon1;

        // モックの設定
        when(adaptor.sendGet("NearMissInfoList", xTracking, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, xTracking, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = nearMissInfoListApiController.nearmissinfolistGet(xTracking, id, name, category, summary, from, to, lat0, lon0, lat1, lon1);
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelNearMissInfoList), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("NearMissInfoList", xTracking, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, xTracking, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
