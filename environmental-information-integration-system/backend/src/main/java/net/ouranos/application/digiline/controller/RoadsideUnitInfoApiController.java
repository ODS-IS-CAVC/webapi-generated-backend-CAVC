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
import net.ouranos.domain.digiline.model.RoadsideUnitInfo;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;


@Validated
@Tag(name = "環境情報連携システム", description = "the 環境情報連携システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class RoadsideUnitInfoApiController implements RoadsideUnitInfoApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public RoadsideUnitInfoApiController(Transform<Object> transform, @Qualifier("RoadsideUnitInfoAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/roadsideUnitInfo")
    public ResponseEntity<Object> roadsideUnitInfoGet(UUID xTracking, Long serviceLocationID, Long roadsideUnitID) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = datamodelRoadsideUnitInfo, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = DatamodelRoadsideUnitInfo, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("RoadsideUnitInfo", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = DatamodelRoadsideUnitInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }

    @Override
    @PutMapping("/roadsideUnitInfo")
    public ResponseEntity<Object> roadsideUnitInfoPut(UUID xTracking, RoadsideUnitInfo roadsideUnitInfo) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = datamodelRoadsideUnitInfo, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = datamodelRoadsideUnitInfo, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(roadsideUnitInfo, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelRoadsideUnitInfo, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendPut(encodeData, xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = datamodelRoadsideUnitInfo, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}
