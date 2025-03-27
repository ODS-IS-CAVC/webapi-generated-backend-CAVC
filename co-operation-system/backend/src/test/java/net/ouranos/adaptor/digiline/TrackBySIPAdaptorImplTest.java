package net.ouranos.adaptor.digiline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import java.util.List;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import net.ouranos.domain.digiline.model.TrackBySip;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * TrackBySIPAdaptorImplのテストクラス
 */
@RestClientTest(TrackBySIPAdaptorImpl.class)
public class TrackBySIPAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private TrackBySIPAdaptorImpl TrackBySIPAdaptorImpl;

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
        ReflectionTestUtils.setField(TrackBySIPAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(TrackBySIPAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
        MockHttpServletRequest mockRequest = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(mockRequest));
        // Excluded headers setup
        ReflectionTestUtils.setField(TrackBySIPAdaptorImpl, "excludedHeaders", List.of("X-Forwarded-For", "X-amzn-"));
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
        ResponseEntity<Object> response = TrackBySIPAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

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
        TrackBySip targetModelTrackBySIP = new TrackBySip();

        // Act
        ResponseEntity<Object> response = TrackBySIPAdaptorImpl.sendPut(targetModelTrackBySIP, uuid,queryParam, token);

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
        TrackBySip trackBySIP = new TrackBySip();
        TrackBySip responseModelTrackBySIP = new TrackBySip();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/trackBySIP"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED)
                          .contentType(MediaType.APPLICATION_JSON)
                          .body(this.objectmapper.writeValueAsString(responseModelTrackBySIP))
                          .header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Void> response = TrackBySIPAdaptorImpl.sendPut_Void(trackBySIP, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(201));
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
        TrackBySip trackBySIP = new TrackBySip();
        TrackBySip responseModelTrackBySIP = new TrackBySip();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/trackBySIP"))
                  .andExpect(method(HttpMethod.PUT))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withStatus(HttpStatus.CREATED)
                          .contentType(MediaType.APPLICATION_JSON)
                          .body(this.objectmapper.writeValueAsString(responseModelTrackBySIP)));

        // Act
        ResponseEntity<Void> response = TrackBySIPAdaptorImpl.sendPut_Void(trackBySIP, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatusCode.valueOf(201)); 
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
        ResponseEntity<Void> response = TrackBySIPAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }
}
