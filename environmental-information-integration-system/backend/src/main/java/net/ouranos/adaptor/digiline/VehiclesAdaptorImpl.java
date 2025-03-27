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
import net.ouranos.domain.digiline.model.Vehicles;

/**
 * VehiclesAdaptor実装クラス。
 */
@Slf4j
@Component
public class VehiclesAdaptorImpl implements Adaptor<Vehicles>{

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
     * 指定されたデータモデルに対してGETリクエストを送信します。
     *
     * @param targetDataModel 取得対象のデータモデル
     * @param transaction トランザクションID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Vehicles> sendGet(String targetDataModel, UUID tracking, String queryParam, String token) {
        log.info("Send GET to XXX service. Tracking = {}", tracking);
        ResponseEntity<Vehicles> result;
        if(queryParam == null) {
            String url = baseUrl + "/vehicles";
            result = this.restClient.build().get()
                .uri(url)
                .header("X-Tracking", tracking.toString())
                .header("Authorization", token)
                .header("apiKey", apiKey)
                .retrieve()
                .toEntity(Vehicles.class);
        } else {
            String url = baseUrl + "/vehicles";
            URI uri = UriComponentsBuilder.fromUriString(url)
            .query(queryParam).build().toUri();
            result = this.restClient.build().get()
            .uri(uri)
            .header("X-Tracking", tracking.toString())
            .header("Authorization", token)
            .header("apiKey", apiKey)
            .retrieve()
            .toEntity(Vehicles.class);
        }
        HttpStatusCode statusCode = result.getStatusCode();
        Vehicles body = result.getBody();
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
     * API仕様上存在しないので何もしない
     *
     * @param dataModel 送信するデータモデル
     * @param transaction トランザクションID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Vehicles> sendPut(Vehicles dataModel, UUID tracking, String queryParam, String token) {
        return null;
    }

    /**
     * API仕様上存在しないので何もしない
     *
     * @param id 消去するデータのID
     * @param transaction トランザクションID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Void> sendDelete(UUID tracking, String queryParam, String token) {
        return null;
    }
}
