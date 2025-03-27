package net.ouranos.application.digiline.controller;



import io.swagger.v3.oas.annotations.tags.Tag;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.TargetInfo;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


@Validated
@Tag(name = "環境情報連携システム", description = "the 環境情報連携システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class TargetInfoApiController implements TargetInfoApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public TargetInfoApiController(Transform<Object> transform, @Qualifier("TargetInfoAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/targetInfo")
    public ResponseEntity<Object> targetInfoGet(
        UUID xTracking,
        Long serviceLocationID,
        Long roadsideUnitID,
        Integer deviceID,
        String startAt,
        String endAt) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = datamodelTargetInfo, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = DatamodelTargetInfo, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("TargetInfo", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = DatamodelTargetInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }

    @Override
    @PutMapping("/targetInfo")
    public ResponseEntity<Object> targetInfoPut(UUID xTracking, TargetInfo targetInfo) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = datamodelTargetInfo, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = datamodelTargetInfo, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(targetInfo, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelTargetInfo, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendPut(encodeData, xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = datamodelTargetInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}
