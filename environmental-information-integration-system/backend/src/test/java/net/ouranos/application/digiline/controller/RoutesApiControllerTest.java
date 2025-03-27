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
import net.ouranos.domain.digiline.model.Routes;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class RoutesApiControllerTest {

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
     * テスト対象クラス{@link RoutesApiController} 。
     */
    @InjectMocks
    private RoutesApiController routesApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testGet_query() {
        // テストデータ
        Routes dataModelRoutes = new Routes();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelRoutes);
        UUID uuid = UUID.randomUUID();
        UUID routeId = UUID.randomUUID();
        String queryParam = "route_id="+routeId.toString();

        // モックの設定
        when(adaptor.sendGet("Routes", uuid, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = routesApiController.routesGet(uuid, routeId);
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelRoutes), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("Routes", uuid,queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
