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
import net.ouranos.domain.digiline.model.CommunicationMediaInfo;
import net.ouranos.transform.digiline.Transform;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class CommunicationMediaInfoApiControllerTest {

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
     * テスト対象クラス{@link CommunicationMediaInfoApiController} 。
     */
    @InjectMocks
    private CommunicationMediaInfoApiController communicationMediaInfoApiController;

    private UUID xTracking;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        xTracking = UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testGet_query() {
        // テストデータ
        CommunicationMediaInfo dataModelCommunicationMediaInfo = new CommunicationMediaInfo();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelCommunicationMediaInfo);
        xTracking = UUID.randomUUID();
        Long serviceLocationID = 123456789L;
        Long roadsideUnitID = 123456789L;
        String queryParam = roadsideUnitID.toString();

        // モックの設定
        when(adaptor.sendGet("CommunicationMediaInfo", xTracking, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, xTracking, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = communicationMediaInfoApiController.communicationMediaInfoGet(xTracking, serviceLocationID,roadsideUnitID);
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelCommunicationMediaInfo), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("CommunicationMediaInfo", xTracking, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, xTracking, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

    @Test
    void testPut_query() {
        // テストデータ
        CommunicationMediaInfo dataModelCommunicationMediaInfo = new CommunicationMediaInfo();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelCommunicationMediaInfo);
        xTracking = UUID.randomUUID();

        // モックの設定
        when(transform.encode(dataModelCommunicationMediaInfo, xTracking, null)).thenReturn(dataModelCommunicationMediaInfo);
        when(adaptor.sendPut(dataModelCommunicationMediaInfo, xTracking, null, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, xTracking, null)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = communicationMediaInfoApiController.communicationMediaInfoPut(xTracking, dataModelCommunicationMediaInfo);

        // 検証
        assertEquals(ResponseEntity.ok(dataModelCommunicationMediaInfo), response, "レスポンスが期待通りであること");
        verify(transform, times(1)).encode(dataModelCommunicationMediaInfo, xTracking, null);
        verify(adaptor, times(1)).sendPut(dataModelCommunicationMediaInfo, xTracking, null, "token");
        verify(transform, times(1)).decode(responseEntity, xTracking, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

}