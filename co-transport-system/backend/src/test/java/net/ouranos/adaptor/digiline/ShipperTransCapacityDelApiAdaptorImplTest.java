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

import net.ouranos.domain.digiline.model.ShipperTransCapacityDel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ShipperTransCapacityDelApiAdaptorImpl
 */
@RestClientTest(ShipperTransCapacityDelAdaptorImpl.class)
public class ShipperTransCapacityDelApiAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private ShipperTransCapacityDelAdaptorImpl shipperTransCapacityDelApiAdaptorImpl;

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
        ReflectionTestUtils.setField(shipperTransCapacityDelApiAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(shipperTransCapacityDelApiAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
    }


    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれる場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_void() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        ShipperTransCapacityDel targetDataModelShipperTransCapacityDel = new ShipperTransCapacityDel();
        ShipperTransCapacityDel responseDataModelShipperTransCapacityDel = new ShipperTransCapacityDel();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/shipper_trans_capacity_del"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseDataModelShipperTransCapacityDel.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = shipperTransCapacityDelApiAdaptorImpl.sendPut_Void(targetDataModelShipperTransCapacityDel, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(200));
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link");
        mockServer.verify();
    }
}
