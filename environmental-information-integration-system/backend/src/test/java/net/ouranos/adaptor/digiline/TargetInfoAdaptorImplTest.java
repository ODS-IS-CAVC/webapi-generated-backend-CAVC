package net.ouranos.adaptor.digiline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

import net.ouranos.domain.digiline.model.TargetInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * TargetInfoAdaptorImplのテストクラス
 */
@RestClientTest(TargetInfoAdaptorImpl.class)
public class TargetInfoAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private TargetInfoAdaptorImpl targetInfoAdaptorImpl;

    /**
     * RestClient.Builderのモック
     */
    @Mock
    private RestClient.Builder mockRestClient;

    /**
     * RestClient.Builderのインスタンス
     */
    @Autowired
    private RestClient.Builder restClient;

    /**
     * MockRestServiceServerのインスタンス
     */
    private MockRestServiceServer mockServer;

    @Autowired
    ObjectMapper objectmapper;

    /**
     * テスト前処理
     */
    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(targetInfoAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(targetInfoAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
    }

    /**
     * sendGetメソッドのテスト response headerにX-tracking, linkが含まれる場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendGet_withQuery_withHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        Object expectedResponse = new TargetInfo();
        Object assertModelTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTargetInfo.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテスト response headerにX-tracking, linkが含まれない場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendGet_withQuery_noHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        Object expectedResponse = new TargetInfo();
        Object assertModelTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTargetInfo.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), uuid.toString()); 
        assertEquals(response.getHeaders().containsKey("Link"), false);
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテスト
     */
    @Test
    public void testSendGet_noQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        Object expectedResponse = new TargetInfo();
        Object assertModelTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo"))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendGet("targetDataModel", uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTargetInfo.toString(), response.getBody());
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテスト(クエリパラメータが[]で囲まれている場合)
     */
    @Test
    public void testSendGet_withQueryParam_elseif() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "[queryParam]";
        Object expectedResponse = new TargetInfo();
        Object assertTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertTargetInfo.toString(), response.getBody());
        mockServer.verify();
    }

    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれる場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_withQuery_withHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        TargetInfo targetModelTargetInfo = new TargetInfo();
        TargetInfo assertModelTargetInfo = new TargetInfo();
        TargetInfo responseModelTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo?"+queryParam))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelTargetInfo.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendPut(targetModelTargetInfo, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTargetInfo.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
        mockServer.verify();
    }

    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれない場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_withQuery_noHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        TargetInfo targetModelTargetInfo = new TargetInfo();
        TargetInfo assertModelTargetInfo = new TargetInfo();
        TargetInfo responseModelTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo?"+queryParam))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelTargetInfo.toString()), MediaType.APPLICATION_JSON));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendPut(targetModelTargetInfo, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTargetInfo.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), uuid.toString()); 
        assertEquals(response.getHeaders().containsKey("Link"), false);
        mockServer.verify();
    }

    /**
     * sendPutメソッドのテスト
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_noQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        TargetInfo targetModelTargetInfo = new TargetInfo();
        TargetInfo assertModelTargetInfo = new TargetInfo();
        TargetInfo responseModelTargetInfo = new TargetInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/targetInfo"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelTargetInfo.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = targetInfoAdaptorImpl.sendPut(targetModelTargetInfo, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTargetInfo.toString(), response.getBody());
        mockServer.verify();
    }
    
    /**
     * sendDeleteメソッドのテスト
     */
    @Test
    public void testSendDelete() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        String token = "token";

        // Act
        ResponseEntity<Void> response = targetInfoAdaptorImpl.sendDelete(uuid,queryParam, token);

        // Assert
        assertEquals(response, null);

    }
}
