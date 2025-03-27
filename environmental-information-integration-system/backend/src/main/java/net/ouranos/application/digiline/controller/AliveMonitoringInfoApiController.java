package net.ouranos.application.digiline.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
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
import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.AliveMonitoringInfo;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-31T15:28:49.786085400+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "環境情報連携システム", description = "the 環境情報連携システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class AliveMonitoringInfoApiController implements AliveMonitoringInfoApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public AliveMonitoringInfoApiController(Transform<Object> transform, @Qualifier("AliveMonitoringInfoAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/aliveMonitoringInfo")
    public ResponseEntity<Object> aliveMonitoringInfoGet(UUID xTracking, Long serviceLocationID, Long roadsideUnitID) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();

        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = AliveMonitoringInfo, tracking = {}", xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("AliveMonitoringInfo", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = AliveMonitoringInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }

    @Override
    @PutMapping("/aliveMonitoringInfo")
    public ResponseEntity<Object> aliveMonitoringInfoPut(UUID xTracking,@Valid @RequestBody AliveMonitoringInfo aliveMonitoringInfo) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process. dataModel = AliveMonitoringInfo, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = AliveMonitoringInfo, tracking = {}", this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(aliveMonitoringInfo, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = AliveMonitoringInfo, tracking = {}", this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendPut(encodeData, xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = AliveMonitoringInfo, tracking = {}", this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}