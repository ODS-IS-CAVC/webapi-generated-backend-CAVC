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
import net.ouranos.domain.digiline.model.VehicleIncidentInfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * VehicleIncidentInfoAdaptorImplのテストクラス
 */
@RestClientTest(VehicleIncidentInfoAdaptorImpl.class)
public class VehicleIncidentInfoAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private VehicleIncidentInfoAdaptorImpl vehicleIncidentInfoAdaptorImpl;

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
        ReflectionTestUtils.setField(vehicleIncidentInfoAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(vehicleIncidentInfoAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
    }

        /**
     * sendGetメソッドのテスト
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendGet() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        // Act
        ResponseEntity<Object> response = vehicleIncidentInfoAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }

    /**
     * sendPutメソッドのテスト
     */
    @Test
    public void testSendPut() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        String token = "token";
        VehicleIncidentInfo targetModelVehicleIncidentInfo = new VehicleIncidentInfo();

        // Act
        ResponseEntity<Object> response = vehicleIncidentInfoAdaptorImpl.sendPut(targetModelVehicleIncidentInfo, uuid,queryParam, token);

        // Assert
        assertEquals(response, null);
    }

    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれる場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_noQuery_withHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        VehicleIncidentInfo targetModelVehicleIncidentInfo = new VehicleIncidentInfo();
        VehicleIncidentInfo responseModelVehicleIncidentInfo = new VehicleIncidentInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/vehicleIncidentInfo"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelVehicleIncidentInfo.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = vehicleIncidentInfoAdaptorImpl.sendPut_Void(targetModelVehicleIncidentInfo, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(200));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
        mockServer.verify();
    }

    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれない場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_noQuery_noHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        VehicleIncidentInfo targetModelVehicleIncidentInfo = new VehicleIncidentInfo();
        VehicleIncidentInfo responseModelVehicleIncidentInfo = new VehicleIncidentInfo();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/vehicleIncidentInfo"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelVehicleIncidentInfo.toString()), MediaType.APPLICATION_JSON));

        // Act
        ResponseEntity<Void> response = vehicleIncidentInfoAdaptorImpl.sendPut_Void(targetModelVehicleIncidentInfo, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(200));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), uuid.toString()); 
        assertEquals(response.getHeaders().containsKey("Link"), false);
        mockServer.verify();
    }
    
        /**
     * sendDeleteメソッドのテスト
     */
    @Test
    public void testSendDelete_withQuery() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        // Act
        ResponseEntity<Void> response = vehicleIncidentInfoAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }
}
