package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.UUID;

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
import jakarta.validation.Valid;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.adaptor.digiline.VehicleAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.Vehicle;
import net.ouranos.transform.digiline.Transform;

public class VehicleApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private VehicleAdaptorImpl vehicleAdaptorImpl;

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
     * テスト対象クラス{@link VehicleApiController} 。
     */    
    @InjectMocks
    private VehicleApiController vehicleApiController;
    private UUID xTracking;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        xTracking = UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    /**
     * test DELETEメソッドのテスト
     */
    @Test
    void testDelete() {
        // テストデータ
        @Valid String vehicle = "GIAI-3F5G7H8J9K";
        ResponseEntity<Void> responseEntity = ResponseEntity.ok().header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(vehicle, xTracking, null)).thenReturn(vehicle);
        when(vehicleAdaptorImpl.sendDelete(xTracking, vehicle, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(vehicle);

        // 実行
        ResponseEntity<Void> response = vehicleApiController.vehicleDelete(xTracking, vehicle);

        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(vehicleAdaptorImpl, times(1)).sendDelete(xTracking, vehicle, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

    /**
     * test GETメソッドのテスト
     */
    @Test
    void testGet() {
        // テストデータ
        Object dataModelVehicle = new Vehicle();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelVehicle);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(vehicleAdaptorImpl.sendGet("Vehicle", uuid, "query", "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, "query")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn("query");

        // 実行
        ResponseEntity<Object> response = vehicleApiController.vehicleGet(uuid, "exampleType");
        
        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        verify(vehicleAdaptorImpl, times(1)).sendGet("Vehicle", uuid, "query", "token");
        verify(transform, times(1)).decode(responseEntity, uuid, "query");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

    
    /**
     * test PUTメソッドのテスト
     */
    @Test
    void testPut_void() {
        // テストデータ
        @Valid Vehicle vehicle = new Vehicle();
        ResponseEntity<Void> responseEntity = ResponseEntity.ok().header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(vehicle, xTracking, null)).thenReturn(vehicle);
        when(vehicleAdaptorImpl.sendPut_Void(vehicle, xTracking, null, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Void> response = vehicleApiController.vehiclePut(xTracking, vehicle);

        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(transform, times(1)).encode(vehicle, xTracking, null);
        verify(vehicleAdaptorImpl, times(1)).sendPut_Void(vehicle, xTracking, null, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
    
}
