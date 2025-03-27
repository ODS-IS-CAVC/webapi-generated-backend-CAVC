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

import net.ouranos.domain.digiline.model.CarrierTransCapacity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * CarrierTransCapacityAdaptorImplのテストクラス
 */
@RestClientTest(CarrierTransCapacityAdaptorImpl.class)
public class CarrierTransCapacityAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private CarrierTransCapacityAdaptorImpl carrierTransCapacityAdaptorImpl;

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
        ReflectionTestUtils.setField(carrierTransCapacityAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(carrierTransCapacityAdaptorImpl, "baseUrl", "http://localhost:8080/");
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
        Object expectedResponse = new CarrierTransCapacity();
        Object responseDataModelCarrierTransCapacity = new CarrierTransCapacity();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));
        // Act
        ResponseEntity<Object> response = carrierTransCapacityAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(responseDataModelCarrierTransCapacity.toString(), response.getBody());
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
        Object expectedResponse = new CarrierTransCapacity();
        Object responseDataModelCarrierTransCapacity = new CarrierTransCapacity();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity"))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = carrierTransCapacityAdaptorImpl.sendGet("targetDataModel", uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(responseDataModelCarrierTransCapacity.toString(), response.getBody());
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
        Object expectedResponse = new CarrierTransCapacity();
        Object assertDataModelCarrierTransCapacity = new CarrierTransCapacity();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = carrierTransCapacityAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertDataModelCarrierTransCapacity.toString(), response.getBody());
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
        CarrierTransCapacity targetDataModelCarrierTransCapacity = new CarrierTransCapacity();
        CarrierTransCapacity responseDataModelCarrierTransCapacity = new CarrierTransCapacity();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseDataModelCarrierTransCapacity.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = carrierTransCapacityAdaptorImpl.sendPut_Void(targetDataModelCarrierTransCapacity, uuid, null, "Bearer token");

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
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity?" + queryParam))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED).header("X-Tracking", "test").header("link", "link"));
        // Act
        ResponseEntity<Void> response = carrierTransCapacityAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

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
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity"))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = carrierTransCapacityAdaptorImpl.sendDelete(uuid, null, "Bearer token");

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
        mockServer.expect(requestTo("http://localhost:8080/carrier_trans_capacity?" + queryParam))
                  .andExpect(method(HttpMethod.DELETE))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = carrierTransCapacityAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(201));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }
}
