package net.ouranos.adaptor.digiline;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Component("TrackBySIPAdaptor")
@Slf4j
public class TrackBySIPAdaptorImpl implements Adaptor<Object>{
    
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

    private List<String> excludedHeaders;
    // "excluded-headers.txt" に記載のある文字列を含むヘッダーを除外する
    @PostConstruct
    public void init() {
        try {
            ClassPathResource resource = new ClassPathResource("excluded-headers.txt");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
                excludedHeaders = reader.lines().collect(Collectors.toList());
            }
        } catch (Exception e) {
            log.error("Failed to load excluded headers", e);
            excludedHeaders = new ArrayList<>();
        }
    }

    /**
     * API仕様上存在しないので何もしない
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
     * 独自のPUTメソッド（Void型を返すメソッド）を定義するため、ここでは何もしない
     *
     * @param trackBySIP 送信するデータモデル
     * @param transaction トランザクションID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Object> sendPut(Object trackBySIP, UUID tracking, String queryParam, String token) {
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
     * @param trackBySIP 送信するデータモデル
     * @param tracking トランザクションID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    public ResponseEntity<Void> sendPut_Void(Object trackBySIP, UUID tracking, String queryParam, String token) {
        log.info("Send PUT to C-4 service. Tracking = {}", tracking);

        // リクエストヘッダーを取得
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
            .getRequestAttributes()).getRequest();
        HttpHeaders headers = new HttpHeaders();
        request.getHeaderNames().asIterator().forEachRemaining(headerName -> {
            headers.add(headerName, request.getHeader(headerName));
        });
        // "x-" を含むリクエストヘッダーを抽出
        MultiValueMap<String, String> xheaders = new LinkedMultiValueMap<>();
        headers.forEach((key, values) -> {
            if (key.startsWith("x-")) {
                    xheaders.put(key, values);
                }
            });
        // "x-"を含むリクエストヘッダーで抽出する必要のない（"excluded-headers.txt" に記載のある文字列を含む）ヘッダーを削除
        excludedHeaders.forEach(excludedHeader -> {
            xheaders.keySet().removeIf(key -> key.toLowerCase().contains(excludedHeader.toLowerCase()));
        });

        ResponseEntity<Void> result;
            String url = baseUrl + "/trackBySIP";
            result = this.restClient.build().put()
            .uri(url)
            .headers(httpHeaders -> {
                httpHeaders.add("Content-Type", "application/json");
                httpHeaders.add("Authorization", token);
                httpHeaders.add("apiKey", apiKey);
                xheaders.forEach((key, values) -> values.forEach(value -> httpHeaders.add(key, value)));
            })
            .body(trackBySIP)
            .retrieve()
            .toBodilessEntity();

        HttpStatusCode statusCode = result.getStatusCode();
        
        // "x-" と "link" を含むレスポンスヘッダーを抽出
        HttpHeaders filteredHeaders = new HttpHeaders();
        result.getHeaders().forEach((key, values) -> {
            if (key.toLowerCase().startsWith("x-") || key.toLowerCase().contains("link")) {
                filteredHeaders.put(key, values);
            }
        });
        // "x-"を含むレスポンスヘッダーで抽出する必要のない（"excluded-headers.txt" に記載のある文字列を含む）ヘッダーを削除
        excludedHeaders.forEach(excludedHeader -> {
            filteredHeaders.keySet().removeIf(key -> key.toLowerCase().contains(excludedHeader.toLowerCase()));
        });
            
        return new ResponseEntity<>(filteredHeaders, statusCode);
    }
}
