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
import net.ouranos.domain.digiline.model.SemiDynamicInfo;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class SemiDynamicInfoApiControllerTest {

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
     * テスト対象クラス{@link SemiDynamicInfoApiController} 。
     */    @InjectMocks
    private SemiDynamicInfoApiController semiDynamicInfoApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
    }

    @Test
    void testGet_query() {
        // テストデータ
        SemiDynamicInfo dataModelSemiDynamicInfo = new SemiDynamicInfo();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelSemiDynamicInfo);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
        UUID xTracking = UUID.randomUUID();

        String queryParam = "semiDynamicInfoId";

        // モックの設定
        when(adaptor.sendGet("SemiDynamicInfo", xTracking, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, xTracking, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = semiDynamicInfoApiController.semiDynamicInfoGet(xTracking, "semiDynamicInfoId");
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelSemiDynamicInfo), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("SemiDynamicInfo", xTracking, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, xTracking, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
