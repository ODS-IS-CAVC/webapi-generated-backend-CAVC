package net.ouranos.adaptor.digiline;

import java.net.URI;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;

@Component("ResourcesAdaptor")
@Slf4j
public class ResourcesAdaptorImpl implements Adaptor<Object>{

    /**
     * 環境変数からapiKeyを取得し保持するフィールド。
    */
    @Value("${apiKey}")
    private String apiKey;

    /**
     * 環境変数からbaseUrlを取得し保持するフィールド。
    */
    @Value("${trustsystem.base-url}")
    private String baseUrl;
    
    /**
     * RestClientのビルダーを保持するフィールド。
    */
    @Autowired
    private RestClient.Builder restClient;

        /**
     * API仕様上存在しないので何もしない
     *
     * @param targetDataModel 取得対象のデータモデル
     * @param transaction トランザクションID
     * @return サーバーからのレスポンス
     */

     @Override
     public ResponseEntity<Object> sendGet(String targetDataModel, UUID tracking, String queryParam, String token) {
         return null;
     }
     
    /**
     * 指定されたデータモデルに対してPUTリクエストを送信します。
     *
     * @param dataModel 送信するデータモデル
     * @param transaction トランザクションID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Object> sendPut(Object dataModelResources, UUID tracking, String queryParam, String token) {
        log.info("Send PUT to XXX service. Tracking = {}", tracking);
        ResponseEntity<Object> result;
        if(queryParam == null) {
            String url = baseUrl + "/resources";
            result = this.restClient.build().put()
            .uri(url)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .header("Content-Type", "application/json")
            .body(dataModelResources)
            .retrieve()
            .toEntity(Object.class);
        } else {
            String url = baseUrl + "/resources";
            URI uri = UriComponentsBuilder.fromUriString(url)
            .query(queryParam).build().toUri();
            result = this.restClient.build().put()
            .uri(uri)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .header("Content-Type", "application/json")
            .body(dataModelResources)
            .retrieve()
            .toEntity(Object.class);
        }
        HttpStatusCode statusCode = result.getStatusCode();
        Object body = result.getBody();
        HttpHeaders headers = new HttpHeaders();
        if(result.getHeaders().containsKey("X-Tracking")) {
            headers.set("X-tracking", result.getHeaders().getFirst("X-Tracking"));
        } else {
            headers.set("X-Tracking", tracking.toString());
        }
        if(result.getHeaders().containsKey("Link")) {
            headers.set("Link", result.getHeaders().getFirst("Link"));
        }
        return new ResponseEntity<>(body, headers, statusCode);
    }

    /**
     * 指定されたデータモデルに対してDELETEリクエストを送信します。
     *
     * @param id 消去するデータのID
     * @param transaction トランザクションID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Void> sendDelete(UUID transaction, String queryParam, String token) {
        log.info("Send DELETE to XXX service. Tracking = {}", transaction);
        ResponseEntity<Void> result;
        if(queryParam == null) {
            String url = baseUrl + "/resources";
            result = this.restClient.build().delete()
            .uri(url)
            .header("X-Tracking", transaction.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toBodilessEntity();
        } else {
            String url = baseUrl + "/resources";
            URI uri = UriComponentsBuilder.fromUriString(url)
            .query(queryParam).build().toUri();
            result = this.restClient.build().delete()
            .uri(uri)
            .header("X-Tracking", transaction.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toBodilessEntity();
        }
        HttpStatusCode statusCode = result.getStatusCode();
        HttpHeaders headers = new HttpHeaders();
        if(result.getHeaders().containsKey("X-Tracking")) {
            headers.set("X-tracking", result.getHeaders().getFirst("X-Tracking"));
        } else {
            headers.set("X-Tracking", transaction.toString());
        }
        if(result.getHeaders().containsKey("Link")) {
            headers.set("Link", result.getHeaders().getFirst("Link"));
        }
        return new ResponseEntity<>(headers, statusCode);
    }
}