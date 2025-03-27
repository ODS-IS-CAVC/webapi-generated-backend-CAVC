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
import net.ouranos.domain.digiline.model.BusStops;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class BusStopsApiControllerTest {

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
     * テスト対象クラス{@link BusStopsApiController} 。
     */    @InjectMocks
    private BusStopsApiController busStopsApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
    }

    @Test
    void testGet_query() {
        // テストデータ
        BusStops dataModelBusStops = new BusStops();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelBusStops);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(adaptor.sendGet("BusStops", uuid, "query", "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, "query")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        // 実行
        ResponseEntity<Object> response = busStopsApiController.busStopsGet(uuid);
        
        // 検証
        assertEquals(null, response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("BusStops", uuid, null, "token");
        verify(transform, times(1)).decode(null, uuid, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
