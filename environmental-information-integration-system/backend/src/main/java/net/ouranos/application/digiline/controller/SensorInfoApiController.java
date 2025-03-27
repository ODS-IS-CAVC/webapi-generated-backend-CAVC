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
import net.ouranos.domain.digiline.model.SensorInfo;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;


@Validated
@Tag(name = "環境情報連携システム", description = "the 環境情報連携システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class SensorInfoApiController implements SensorInfoApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public SensorInfoApiController(Transform<Object> transform, @Qualifier("SensorInfoAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/sensorInfo")
    public ResponseEntity<Object> sensorInfoGet(UUID xTracking,Long serviceLocationID, Long roadsideUnitID) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = datamodelSensorInfo, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = DatamodelSensorInfo, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("SensorInfo", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = DatamodelSensorInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }

    @Override
    @PutMapping("/sensorInfo")
    public ResponseEntity<Object> sensorInfoPut(UUID xTracking, SensorInfo SensorInfo) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = datamodelSensorInfo, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = datamodelSensorInfo, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(SensorInfo, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelSensorInfo, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendPut(encodeData, xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = datamodelSensorInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}
