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
import net.ouranos.adaptor.digiline.CarrierTransCapacityDelApiAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.CarrierTransCapacityDel;
import net.ouranos.transform.digiline.Transform;

public class CarrierTransCapacityDelApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private CarrierTransCapacityDelApiAdaptorImpl carrierTransCapacityDelApiAdaptorImpl;

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
     * テスト対象クラス{@link CarrierTransCapacityDelApiController} 。
     */    
    @InjectMocks
    private CarrierTransCapacityDelApiController carrierTransCapacityDelApi;
    private UUID xTracking;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        xTracking = UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }
    
    /**
     * test PUTメソッドのテスト
     */
    @Test
    void testPut_void() {
        // テストデータ
        @Valid CarrierTransCapacityDel carrierTransCapacityDel = new CarrierTransCapacityDel();
        ResponseEntity<Void> responseEntity = ResponseEntity.ok().header("X-Tracking", xTracking.toString()).build();
        
        // モックの設定
        when(transform.encode(carrierTransCapacityDel, xTracking, null)).thenReturn(carrierTransCapacityDel);
        when(carrierTransCapacityDelApiAdaptorImpl.sendPut_Void(carrierTransCapacityDel, xTracking, null, "token")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Void> response = carrierTransCapacityDelApi.carrierTransCapacityDelPut(xTracking, carrierTransCapacityDel);

        // 検証
        assertEquals(HttpStatus.OK, response.getStatusCode(), "ステータスコードが一致すること");
        assertEquals(xTracking.toString(), response.getHeaders().getFirst("X-Tracking"), "トラッキングヘッダーが一致すること");
        assertEquals(null, response.getBody(), "レスポンスボディが期待通りであること");
        verify(transform, times(1)).encode(carrierTransCapacityDel, xTracking, null);
        verify(carrierTransCapacityDelApiAdaptorImpl, times(1)).sendPut_Void(carrierTransCapacityDel, xTracking, null, "token");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
    
}
