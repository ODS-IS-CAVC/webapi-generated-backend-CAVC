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
import lombok.extern.slf4j.Slf4j;
import net.ouranos.domain.digiline.model.DataModelFacade;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * FacadeAdaptor実装クラス。
 */
@Slf4j
@Component
public class FacadeAdaptorImpl implements Adaptor<DataModelFacade>{

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
    public ResponseEntity<DataModelFacade> sendGet(String targetDataModel, UUID tracking, String queryParam, String token) {
        log.info("Send GET to XXX service. Tracking = {}", tracking);
        ResponseEntity<DataModelFacade> result;
        if(queryParam == null) {
            String url = baseUrl + "/facade";
            result = this.restClient.build().get()
            .uri(url)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toEntity(DataModelFacade.class);
        } else {
            String url = baseUrl + "/facade";
            URI uri = UriComponentsBuilder.fromUriString(url)
            .query(queryParam).build().toUri();
            result = this.restClient.build().get()
            .uri(uri)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toEntity(DataModelFacade.class);
        }
        HttpStatusCode statusCode = result.getStatusCode();
        DataModelFacade body = result.getBody();
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
    public ResponseEntity<DataModelFacade> sendPut(DataModelFacade dataModel, UUID tracking, String queryParam, String token) {
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
