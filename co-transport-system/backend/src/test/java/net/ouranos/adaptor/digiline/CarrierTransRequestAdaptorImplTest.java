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
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

import net.ouranos.domain.digiline.model.CarrierTransRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * CarrierTransRequestAdaptorImpl
 */
@RestClientTest(CarrierTransRequestAdaptorImpl.class)
public class CarrierTransRequestAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private CarrierTransRequestAdaptorImpl carrierTransRequestAdaptorImpl;

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
        ReflectionTestUtils.setField(carrierTransRequestAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(carrierTransRequestAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
    }

    /**
     * sendGetメソッドのテストクエリパラメータがある場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendGet_withQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        Object expectedResponse = new CarrierTransRequest();
        Object responseDataModelCarrierTransRequest = new CarrierTransRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));
        // Act
        ResponseEntity<Object> response = carrierTransRequestAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(responseDataModelCarrierTransRequest.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテストクエリパラメータがない場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendGet_withoutQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        Object expectedResponse = new CarrierTransRequest();
        Object responseDataModelCarrierTransRequest = new CarrierTransRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request"))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = carrierTransRequestAdaptorImpl.sendGet("targetDataModel", uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(responseDataModelCarrierTransRequest.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
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
        Object expectedResponse = new CarrierTransRequest();
        Object assertDataModelCarrierTransRequest = new CarrierTransRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = carrierTransRequestAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertDataModelCarrierTransRequest.toString(), response.getBody());
        mockServer.verify();
    }

    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれる場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_void() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        CarrierTransRequest targetDataModelCarrierTransRequest = new CarrierTransRequest();
        CarrierTransRequest responseDataModelCarrierTransRequest = new CarrierTransRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseDataModelCarrierTransRequest.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = carrierTransRequestAdaptorImpl.sendPut_Void(targetDataModelCarrierTransRequest, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(200));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
        mockServer.verify();
    }
    
   /**
     * sendDeleteメソッドのテストクエリパラメータがある場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendDelete_withQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request?" + queryParam))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED).header("X-Tracking", "test").header("link", "link"));
        // Act
        ResponseEntity<Void> response = carrierTransRequestAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(201));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }

    /**
     * sendDeleteメソッドのテストクエリパラメータがない場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendDelete_withoutQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request"))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = carrierTransRequestAdaptorImpl.sendDelete(uuid, null, "Bearer token");

        // Assert
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(201));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }

    /**
     * sendDeleteメソッドのテスト(クエリパラメータが[]で囲まれている場合)
     */
    @Test
    public void testSendDelete_withQueryParam_elseif() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "[queryParam]";

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_request?" + queryParam))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = carrierTransRequestAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(201));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }
}
