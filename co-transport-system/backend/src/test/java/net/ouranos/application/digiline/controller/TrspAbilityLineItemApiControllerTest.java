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
import net.ouranos.domain.digiline.model.TrspAbilityLineItem;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class TrspAbilityLineItemApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<TrspAbilityLineItem> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private Adaptor<TrspAbilityLineItem> adaptor;

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
     * テスト対象クラス{@link TrspAbilityLineItemApiController} 。
     */    @InjectMocks
    private TrspAbilityLineItemApiController trspAbilityLineItemApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testPut_query() {
        // テストデータ
        TrspAbilityLineItem trspAbilityLineItem = new TrspAbilityLineItem();
        ResponseEntity<TrspAbilityLineItem> responseEntity = ResponseEntity.ok(trspAbilityLineItem);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(transform.encode(trspAbilityLineItem, uuid, null)).thenReturn(trspAbilityLineItem);
        when(adaptor.sendPut(trspAbilityLineItem, uuid, null, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, null)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = trspAbilityLineItemApiController.trspAbilityLineItemPut(uuid, trspAbilityLineItem);

        // 検証
        assertEquals(ResponseEntity.ok(trspAbilityLineItem), response, "レスポンスが期待通りであること");
        verify(transform, times(1)).encode(trspAbilityLineItem, uuid, null);
        verify(adaptor, times(1)).sendPut(trspAbilityLineItem, uuid, null, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
