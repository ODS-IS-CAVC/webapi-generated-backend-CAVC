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
import net.ouranos.domain.digiline.model.AliveMonitoringInfo;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class AliveMonitoringInfoApiControllerTest {

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
     * テスト対象クラス{@link AliveMonitoringInfoApiController} 。
     */
    @InjectMocks
    private AliveMonitoringInfoApiController aliveMonitoringInfoApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testGet_query() {
        // テストデータ
        AliveMonitoringInfo dataModelAliveMonitoringInfo = new AliveMonitoringInfo();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelAliveMonitoringInfo);
        UUID uuid = UUID.randomUUID();
        Long serviceLocationID = 123L;
        Long roadsideUnitID = 234L;
        String queryParam = "roadsideUnitID=" + roadsideUnitID;

        // モックの設定
        when(adaptor.sendGet("AliveMonitoringInfo", uuid, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = aliveMonitoringInfoApiController.aliveMonitoringInfoGet(uuid, serviceLocationID, roadsideUnitID);
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelAliveMonitoringInfo), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("AliveMonitoringInfo", uuid, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

    @Test
    void testPut_query() {
        // テストデータ
        AliveMonitoringInfo dataModelAliveMonitoringInfo = new AliveMonitoringInfo();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelAliveMonitoringInfo);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(transform.encode(dataModelAliveMonitoringInfo, uuid, null)).thenReturn(dataModelAliveMonitoringInfo);
        when(adaptor.sendPut(dataModelAliveMonitoringInfo, uuid, null, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, null)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = aliveMonitoringInfoApiController.aliveMonitoringInfoPut(uuid, dataModelAliveMonitoringInfo);

        // 検証
        assertEquals(ResponseEntity.ok(dataModelAliveMonitoringInfo), response, "レスポンスが期待通りであること");
        verify(transform, times(1)).encode(dataModelAliveMonitoringInfo, uuid, null);
        verify(adaptor, times(1)).sendPut(dataModelAliveMonitoringInfo, uuid, null, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}