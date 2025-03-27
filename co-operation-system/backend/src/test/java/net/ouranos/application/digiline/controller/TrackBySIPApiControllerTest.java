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
import net.ouranos.adaptor.digiline.TrackBySIPAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.TrackBySip;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class TrackBySIPApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private TrackBySIPAdaptorImpl TrackBySIPAdaptorImpl;

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
     * テスト対象クラス{@link TrackBySIPApiController} 。
     */    
    @InjectMocks
    private TrackBySIPApiController TrackBySIPApiController;
    private UUID xTracking;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        xTracking = UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testPost_Void() {
        // テストデータ
        TrackBySip trackBySIP = new TrackBySip();
        String X_TENANT_ID = "X_TENANT_ID";
        ResponseEntity<Void> responseEntity = ResponseEntity.created(null).header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(trackBySIP, xTracking, null)).thenReturn(trackBySIP);
        when(TrackBySIPAdaptorImpl.sendPut_Void(trackBySIP, xTracking, null, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Void> response = TrackBySIPApiController.trackBySIPPut(xTracking, X_TENANT_ID, trackBySIP);

        // 検証
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(transform, times(1)).encode(trackBySIP, xTracking, null);
        verify(TrackBySIPAdaptorImpl, times(1)).sendPut_Void(trackBySIP, xTracking, null, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
