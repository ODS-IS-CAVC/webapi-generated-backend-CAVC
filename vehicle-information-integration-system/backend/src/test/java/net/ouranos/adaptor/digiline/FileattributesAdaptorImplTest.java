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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ouranos.domain.digiline.model.Fileattributes;

/**
 * FileattributesAdaptorImplのテストクラス
 */
@RestClientTest(FileattributesAdaptorImpl.class)
public class FileattributesAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private FileattributesAdaptorImpl fileattributesAdaptorImpl;

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
        ReflectionTestUtils.setField(fileattributesAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(fileattributesAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
    }

    /**
     * sendGetメソッドのテスト response headerにX-tracking, linkが含まれる場合
     */
    @Test
    public void testSendGet_withQuery_withHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String fileName = "fileName";
        Object expectedResponse = new Fileattributes();
        Object assertModelFileattributes = new Fileattributes();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/fileattributes?" + fileName))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = fileattributesAdaptorImpl.sendGet("targetDataModel", uuid, fileName, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelFileattributes.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }

    /**
     * sendGetメソッドのテスト response headerにX-tracking, linkが含まれない場合
     */
     @Test
     public void testSendGet_withQuery_noHeader() throws JsonProcessingException {
         // Mock setting
         UUID uuid = UUID.randomUUID();
         String fileName = "fileName";
         Object expectedResponse = new Fileattributes();
         Object assertModelFileattributes = new Fileattributes();
 
         when(mockRestClient.build()).thenReturn(restClient.build());
         mockServer.expect(requestTo("http://localhost:8080/fileattributes?" + fileName))
                   .andExpect(method(HttpMethod.GET))
                   .andExpect(header("X-Tracking", uuid.toString()))
                   .andExpect(header("Authorization", "Bearer token"))
                   .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON));
 
         // Act
         ResponseEntity<Object> response = fileattributesAdaptorImpl.sendGet("targetDataModel", uuid, fileName, "Bearer token");
 
         // Assert
         assertNotNull(response);
         assertEquals(assertModelFileattributes.toString(), response.getBody());
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
        Object expectedResponse = new Fileattributes();
        Object assertModelFileattributes = new Fileattributes();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/fileattributes"))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = fileattributesAdaptorImpl.sendGet("targetDataModel", uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelFileattributes.toString(), response.getBody());
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
        Object expectedResponse = new Fileattributes();
        Object assertFileattributes = new Fileattributes();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/fileattributes?" + queryParam))
                  .andExpect(method(HttpMethod.GET))
                  .andExpect(header("apiKey", "testapiKey"))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(expectedResponse.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = fileattributesAdaptorImpl.sendGet("targetDataModel", uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertFileattributes.toString(), response.getBody());
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
        Object targetModelFileattributes = new Fileattributes();

        // Act
        ResponseEntity<Object> response = fileattributesAdaptorImpl.sendPut(targetModelFileattributes, uuid,queryParam, "Bearer token");

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

        // Act
        ResponseEntity<Void> response = fileattributesAdaptorImpl.sendDelete(uuid,queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }
}
