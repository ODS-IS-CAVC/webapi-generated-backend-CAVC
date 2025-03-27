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
import net.ouranos.domain.digiline.model.Vehicles;

/**
 * VehiclesAdaptorImplのテストクラス
 */
@RestClientTest(VehiclesAdaptorImpl.class)
public class VehiclesAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private VehiclesAdaptorImpl VehiclesAdaptorImpl;

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

    /**
     * テスト前処理
     */
    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(VehiclesAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(VehiclesAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
        
    }

    /**
     * sendGetメソッドのテスト response headerにX-tracking, linkが含まれる場合
     */
    @Test
    public void testSendGet_withQuery_withHeader() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        String expectedResponse = "{\"key\":\"value\"}"; // Replace with actual expected response
        Vehicles assertModelVehicles = new Vehicles();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/vehicles?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(expectedResponse, MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));
        // Act
        ResponseEntity<Vehicles> response = VehiclesAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelVehicles, response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテスト response headerにX-tracking, linkが含まれない場合
     */
    @Test
    public void testSendGet_withQuery_noHeader() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        String expectedResponse = "{\"key\":\"value\"}"; // Replace with actual expected response
        Vehicles assertModelVehicles = new Vehicles();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/vehicles?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(expectedResponse, MediaType.APPLICATION_JSON));
        // Act
        ResponseEntity<Vehicles> response = VehiclesAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelVehicles, response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), uuid.toString()); 
        assertEquals(response.getHeaders().containsKey("Link"), false);
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテスト
     */
    @Test
    public void testSendGet_noQuery() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String expectedResponse = "{\"key\":\"value\"}"; // Replace with actual expected response
        Vehicles assertModelVehicles = new Vehicles();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/vehicles"))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(expectedResponse, MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Vehicles> response = VehiclesAdaptorImpl.sendGet("targetDataModel", uuid,null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelVehicles, response.getBody());
        mockServer.verify();
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
        Vehicles targetModelVehicles = new Vehicles();

        // Act
        ResponseEntity<Vehicles> response = VehiclesAdaptorImpl.sendPut(targetModelVehicles, uuid,queryParam, token);

        // Assert
        assertEquals(response, null);
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
        ResponseEntity<Void> response = VehiclesAdaptorImpl.sendDelete(uuid,queryParam, token);

        // Assert
        assertEquals(response, null);
    }
}
