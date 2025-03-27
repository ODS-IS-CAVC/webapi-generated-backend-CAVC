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
import net.ouranos.domain.digiline.model.TrspAbilityLineItem;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * TrspAbilityLineItemAdaptorImplのテストクラス
 */
@RestClientTest(TrspAbilityLineItemAdaptorImpl.class)
public class TrspAbilityLineItemAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private TrspAbilityLineItemAdaptorImpl trspAbilityLineItemAdaptorImpl;

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
        ReflectionTestUtils.setField(trspAbilityLineItemAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(trspAbilityLineItemAdaptorImpl, "baseUrl", "http://localhost:8080/");
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
        ResponseEntity<Object> response = trspAbilityLineItemAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }

    /**
     * sendPutメソッドのテスト response headerにX-tracking, linkが含まれる場合
     * @throws JsonProcessingException 
     */
    @Test
    public void testSendPut_withQuery_withHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam"; // Replace with actual expected response
        TrspAbilityLineItem targetModelTrspAbilityLineItem = new TrspAbilityLineItem();
        TrspAbilityLineItem assertModelTrspAbilityLineItem = new TrspAbilityLineItem();
        TrspAbilityLineItem responseModelTrspAbilityLineItem = new TrspAbilityLineItem();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/trsp_ability_line_item?"+queryParam))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelTrspAbilityLineItem.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = trspAbilityLineItemAdaptorImpl.sendPut(targetModelTrspAbilityLineItem, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTrspAbilityLineItem.toString(), response.getBody());
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
        String queryParam = "queryParam"; // Replace with actual expected response
        TrspAbilityLineItem targetModelTrspAbilityLineItem = new TrspAbilityLineItem();
        TrspAbilityLineItem assertModelTrspAbilityLineItem = new TrspAbilityLineItem();
        TrspAbilityLineItem responseModelTrspAbilityLineItem = new TrspAbilityLineItem();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/trsp_ability_line_item?"+queryParam))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelTrspAbilityLineItem.toString()), MediaType.APPLICATION_JSON));

        // Act
        ResponseEntity<Object> response = trspAbilityLineItemAdaptorImpl.sendPut(targetModelTrspAbilityLineItem, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTrspAbilityLineItem.toString(), response.getBody());
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
        TrspAbilityLineItem targetModelTrspAbilityLineItem = new TrspAbilityLineItem();
        TrspAbilityLineItem assertModelTrspAbilityLineItem = new TrspAbilityLineItem();
        TrspAbilityLineItem responseModelTrspAbilityLineItem = new TrspAbilityLineItem();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/trsp_ability_line_item"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelTrspAbilityLineItem.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = trspAbilityLineItemAdaptorImpl.sendPut(targetModelTrspAbilityLineItem, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelTrspAbilityLineItem.toString(), response.getBody());
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
        ResponseEntity<Void> response = trspAbilityLineItemAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }
}
