package net.ouranos.adaptor.digiline;

import java.net.URI;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;

@Component("ShipperTransCapacityDelAdaptor")
@Slf4j
public class ShipperTransCapacityDelAdaptorImpl implements Adaptor<Object>{
    
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
     *
     * @param targetDataModel 取得対象のデータモデル
     * @param transaction トランザクションID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Object> sendGet(String targetDataModel, UUID tracking, String queryParam, String token) {
        return null;
    }

    /**
     * 
     * @param ShipperTransCapacityDel 送信するデータモデル
     * @param transaction トランザクションID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Object> sendPut(Object ShipperTransCapacityDel, UUID tracking, String queryParam, String token) {
        return null;
    }

    /**
     * API仕様上存在しないので何もしない
     *
     * @param transaction トランザクションID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Void> sendDelete(UUID transaction, String queryParam, String token) {
        return null;
    }

    /**
     * Overrideしない用のメソッド定義
     * 
     * @param shipperTransCapacityDel 送信するデータモデル
     * @param tracking トランザクションID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    public ResponseEntity<Void> sendPut_Void(Object shipperTransCapacityDel, UUID tracking, String queryParam, String token) {
        log.info("Send PUT to XXX service. Tracking = {}", tracking);
        ResponseEntity<Void> result;
            String url = baseUrl + "/shipper_trans_capacity_del";
            result = this.restClient.build().put()
            .uri(url)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .header("Content-Type", "application/json")
            .body(shipperTransCapacityDel)
            .retrieve()
            .toBodilessEntity(); 
            HttpStatusCode statusCode = result.getStatusCode();
            HttpHeaders headers = new HttpHeaders();
            if(result.getHeaders().containsKey("X-Tracking")) {
                headers.set("X-tracking", result.getHeaders().getFirst("X-Tracking"));
            } else {
                headers.set("X-Tracking", tracking.toString());
            }
            if(result.getHeaders().containsKey("Link")) {
                headers.set("Link", result.getHeaders().getFirst("Link"));
            }
            return new ResponseEntity<>(headers, statusCode);
    }
}