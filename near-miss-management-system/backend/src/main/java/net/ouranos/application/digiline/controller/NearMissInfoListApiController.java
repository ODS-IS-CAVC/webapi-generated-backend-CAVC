package net.ouranos.application.digiline.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import lombok.extern.slf4j.Slf4j;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.transform.digiline.Transform;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T14:08:30.360621200+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "ヒヤリハット管理システム", description = "the ヒヤリハット管理システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class NearMissInfoListApiController implements NearMissInfoListApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public NearMissInfoListApiController(Transform<Object> transform,@Qualifier("NearMissInfoListAdaptor") Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/nearmissinfolist")
    public ResponseEntity<Object> nearmissinfolistGet(
    UUID xTracking,
    UUID id,
    String name,
    String category,
    String summary,
    OffsetDateTime from,
    OffsetDateTime to,
    Double lat0,
    Double lon0,
    Double lat1,
    Double lon1) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();
        
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = datamodelNearMissInfoList, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = DatamodelNearMissInfoList, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("NearMissInfoList", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = DatamodelNearMissInfoList, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }
}
