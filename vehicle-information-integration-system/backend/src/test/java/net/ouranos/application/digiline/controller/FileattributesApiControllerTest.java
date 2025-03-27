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
import net.ouranos.domain.digiline.model.Fileattributes;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class FileattributesApiControllerTest {

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
     * テスト対象クラス{@link FileattributesApiController} 。
     */
    @InjectMocks
    private FileattributesApiController fileattributesApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testGet_query() {
        // テストデータ
        Fileattributes dataModelFileattributes = new Fileattributes();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelFileattributes);
        UUID uuid = UUID.randomUUID();
        String queryParam = "fileName";

        // モックの設定
        when(adaptor.sendGet("Fileattributes", uuid, "fileName", "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, "fileName")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = fileattributesApiController.fileattributesGet(uuid, "fileName");
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelFileattributes), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("Fileattributes", uuid, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
