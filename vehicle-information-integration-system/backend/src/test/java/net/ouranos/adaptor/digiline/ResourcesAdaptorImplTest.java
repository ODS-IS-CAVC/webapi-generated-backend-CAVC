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
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

import net.ouranos.domain.digiline.model.Resources;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ResourcesAdaptorImplのテストクラス
 */
@RestClientTest(ResourcesAdaptorImpl.class)
public class ResourcesAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private ResourcesAdaptorImpl resourcesAdaptorImpl;

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
        ReflectionTestUtils.setField(resourcesAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(resourcesAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
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
        Resources targetModelResources = new Resources();
        Resources assertModelResources = new Resources();
        Resources responseModelResources = new Resources();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/resources?"+queryParam))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelResources.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = resourcesAdaptorImpl.sendPut(targetModelResources, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelResources.toString(), response.getBody());
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
        Resources targetModelResources = new Resources();
        Resources assertModelResources = new Resources();
        Resources responseModelResources = new Resources();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/resources?"+queryParam))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelResources.toString()), MediaType.APPLICATION_JSON));

        // Act
        ResponseEntity<Object> response = resourcesAdaptorImpl.sendPut(targetModelResources, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelResources.toString(), response.getBody());
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
        Resources targetModelResources = new Resources();
        Resources assertModelResources = new Resources();
        Resources responseModelResources = new Resources();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/resources"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelResources.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = resourcesAdaptorImpl.sendPut(targetModelResources, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelResources.toString(), response.getBody());
        mockServer.verify();
    }

    /**
     * sendDeleteメソッドのテスト response headerにX-tracking, linkが含まれる場合
     */
    @Test
    public void testSendDelete_withQuery_withHeader() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/resources?" + queryParam))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withNoContent().header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = resourcesAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(204));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }

    /**
     * sendDeleteメソッドのテスト response headerにX-tracking, linkが含まれない場合
     */
    @Test
    public void testSendDelete_withQuery_noHeader() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/resources?" + queryParam))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withNoContent());

        // Act
        ResponseEntity<Void> response = resourcesAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(204));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), uuid.toString()); 
        assertEquals(response.getHeaders().containsKey("Link"), false);
        mockServer.verify();
    }

    /**
     * sendDeleteメソッドのテスト
     */
    @Test
    public void testSendDelete_noQuery() {
        // Mock setting
        UUID uuid = UUID.randomUUID();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/resources"))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withNoContent().header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Void> response = resourcesAdaptorImpl.sendDelete(uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(204));
        mockServer.verify();
    }

}