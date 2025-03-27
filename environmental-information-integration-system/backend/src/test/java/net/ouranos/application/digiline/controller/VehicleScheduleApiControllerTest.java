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
import net.ouranos.adaptor.digiline.VehicleScheduleAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.VehicleSchedule;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class VehicleScheduleApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private VehicleScheduleAdaptorImpl vehicleScheduleAdaptorImpl;

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
     * テスト対象クラス{@link VehicleScheduleApiController} 。
     */    
    @InjectMocks
    private VehicleScheduleApiController vehicleScheduleApiController;
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
        VehicleSchedule vehicleSchedule = new VehicleSchedule();
        ResponseEntity<Void> responseEntity = ResponseEntity.created(null).header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(vehicleSchedule, xTracking, null)).thenReturn(vehicleSchedule);
        when(vehicleScheduleAdaptorImpl.sendPost_Void(vehicleSchedule, xTracking, null, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Void> response = vehicleScheduleApiController.vehicleSchedulePost(xTracking, vehicleSchedule);

        // 検証
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(transform, times(1)).encode(vehicleSchedule, xTracking, null);
        verify(vehicleScheduleAdaptorImpl, times(1)).sendPost_Void(vehicleSchedule, xTracking, null, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
