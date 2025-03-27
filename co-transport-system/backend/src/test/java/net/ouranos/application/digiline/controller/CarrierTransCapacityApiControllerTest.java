package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
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
import net.ouranos.adaptor.digiline.CarrierTransCapacityAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.CarrierTransCapacity;
import net.ouranos.transform.digiline.Transform;

public class CarrierTransCapacityApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private CarrierTransCapacityAdaptorImpl carrierTransCapacityAdaptorImpl;

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
     * テスト対象クラス{@link CarrierTransCapacityApiController} 。
     */    
    @InjectMocks
    private CarrierTransCapacityApiController carrierTransCapacityApiController;
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
        String carrierTransCapacity = "GIAI-3F5G7H8J9K";
        String trspInstructionId = "A12345";
        String cnsgPrtyHeadOffId = "B12345";
        String serviceNo = "C12345";
        String serviceStrtDate = "D12345";
        String cnsgPrtyBrncOffId = "E12345";
        String trspRqrPrtyHeadOffId = "F12345";
        String trspRqrPrtyBrncOffId = "G12345";

        ResponseEntity<Void> responseEntity = ResponseEntity.ok().header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(carrierTransCapacity, xTracking, null)).thenReturn(carrierTransCapacity);
        when(carrierTransCapacityAdaptorImpl.sendDelete(xTracking, carrierTransCapacity, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(carrierTransCapacity);

        // 実行
        ResponseEntity<Void> response = carrierTransCapacityApiController.carrierTransCapacityDelete(
        xTracking,
        trspInstructionId,
        serviceNo,
        serviceStrtDate,
        cnsgPrtyHeadOffId,
        cnsgPrtyBrncOffId,
        trspRqrPrtyHeadOffId,
        trspRqrPrtyBrncOffId);

        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(carrierTransCapacityAdaptorImpl, times(1)).sendDelete(xTracking, carrierTransCapacity, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
    /**
     * test GETメソッドのテスト
     */
    @Test
    void testGet() {
        // テストデータ
        Object CarrierTransCapacity = new CarrierTransCapacity();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(CarrierTransCapacity);
        UUID uuid = UUID.randomUUID();
        String serviceNo="123456789012345678901234";
        String serviceName="12345678901234567890";
        BigDecimal carMaxLoadCapacity1Meas=new BigDecimal("1500.75");
        String trspOpStrtAreaLineOneTxt="12345678901234567890";
        String trspOpEndAreaLineOneTxt="12345678901234567890";
        String maxTrspOpDateTrmStrtDate="12345678901234567890";
        String minTrspOpDateTrmStrtDate="12345678901234567890";
        String maxTrspOpDateTrmEndDate="12345678901234567890";
        String minTrspOpDateTrmEndDate="12345678901234567890";
        String maxTrspOpPlanDateTrmStrtTime="0000";
        String minTrspOpPlanDateTrmStrtTime="0000";
        String maxTrspOpPlanDateTrmEndTime="0000";
        String minTrspOpPlanDateTrmEndTime="0000";

        // モックの設定
        when(carrierTransCapacityAdaptorImpl.sendGet("DataModelCarrierTransCapacity", uuid, "query", "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, "query")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn("query");

        // 実行
        ResponseEntity<Object> response = carrierTransCapacityApiController.carrierTransCapacityGet(uuid,serviceNo,serviceName,carMaxLoadCapacity1Meas,trspOpStrtAreaLineOneTxt,trspOpEndAreaLineOneTxt,maxTrspOpDateTrmStrtDate,minTrspOpDateTrmStrtDate,maxTrspOpDateTrmEndDate,minTrspOpDateTrmEndDate,maxTrspOpPlanDateTrmStrtTime,minTrspOpPlanDateTrmStrtTime,maxTrspOpPlanDateTrmEndTime,minTrspOpPlanDateTrmEndTime);
        
        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        verify(carrierTransCapacityAdaptorImpl, times(1)).sendGet("DataModelCarrierTransCapacity", uuid, "query", "token");
        verify(transform, times(1)).decode(responseEntity, uuid, "query");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }

    
    /**
     * test PUTメソッドのテスト
     */
    @Test
    void testPut_void() {
        // テストデータ
        @Valid CarrierTransCapacity dataModelCarrierTransCapacity = new CarrierTransCapacity();
        ResponseEntity<Void> responseEntity = ResponseEntity.ok().header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(dataModelCarrierTransCapacity, xTracking, null)).thenReturn(dataModelCarrierTransCapacity);
        when(carrierTransCapacityAdaptorImpl.sendPut_Void(dataModelCarrierTransCapacity, xTracking, null, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Void> response = carrierTransCapacityApiController.carrierTransCapacityPut(xTracking, dataModelCarrierTransCapacity);

        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(transform, times(1)).encode(dataModelCarrierTransCapacity, xTracking, null);
        verify(carrierTransCapacityAdaptorImpl, times(1)).sendPut_Void(dataModelCarrierTransCapacity, xTracking, null, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
    
}
