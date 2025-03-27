package net.ouranos.application.digiline.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import lombok.extern.slf4j.Slf4j;
import net.ouranos.adaptor.digiline.ShipperTransCapacityAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.ShipperTransCapacity;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Tag(name = "shipper_trans_capacity", description = "the shipper_trans_capacity API")
@Slf4j
@RestController
@RequestMapping("/")
public class ShipperTransCapacityApiController implements ShipperTransCapacityApi {

    private final Transform<Object> transform;
    private final ShipperTransCapacityAdaptorImpl shipperTransCapacityAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public ShipperTransCapacityApiController(Transform<Object> transform, @Qualifier("ShipperTransCapacityAdaptor")ShipperTransCapacityAdaptorImpl shipperTransCapacityAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.tokenIntrospection = tokenIntrospection;
        this.shipperTransCapacityAdaptorImpl = shipperTransCapacityAdaptorImpl;
    }

    // @Override
    // @DeleteMapping("/shipper_trans_capacity")
    // public ResponseEntity<Void> shipperTransCapacityDelete(UUID xTracking, @Valid DataModelShipperTransCapacity dataModelShipperTransCapacity) {
    //     HttpServletRequest request = ((ServletRequestAttributes) Objects
    //         .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    //     String token = request.getHeader("Authorization");
    //     tokenIntrospection.verifyToken(token);
    //     log.info("Starts a DELETE process.  dataModel = DataModelShipperTransCapacity, tracking = {}", xTracking);
    //     log.info("Execute the encode by Transform. transform = {}, dataModel = DataModelShipperTransCapacity, tracking = {}",this.transform.getClass(), xTracking);
    //     Object encodeData = this.transform.encode(dataModelShipperTransCapacity, xTracking, null);
    //     log.info("Execute the adaptor. adaptor = {} dataModel = DataModelShipperTransCapacity, tracking = {}",this.shipperTransCapacityAdaptorImpl.getClass(), xTracking);
    //     ResponseEntity<Void> response = this.shipperTransCapacityAdaptorImpl.sendDelete_RequestBody(encodeData, xTracking, null, token);
    //     return response;
    // }


    @Override
    @DeleteMapping("/shipper_trans_capacity")
    public ResponseEntity<Void> shipperTransCapacityDelete(UUID xTracking, String trspCliPrtyHeadOffId, String trspCliPrtyBrncOffId, String serviceNo, String serviceStrtDate) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = DataModelShipperTransCapacity, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Void> response = this.shipperTransCapacityAdaptorImpl.sendDelete(xTracking, queryParam, token);
        return response;
    }

    @Override
    @GetMapping("/shipper_trans_capacity")
    public ResponseEntity<Object> shipperTransCapacityGet(
        UUID xTracking,
        String serviceNo,
        String serviceName,
        BigDecimal carMaxLoadCapacity1Meas,
        String trspOpStrtAreaLineOneTxt,
        String trspOpEndAreaLineOneTxt,
        String maxTrspOpDateTrmStrtDate,
        String minTrspOpDateTrmStrtDate,
        String maxTrspOpDateTrmEndDate,
        String minTrspOpDateTrmEndDate,
        String maxTrspOpPlanDateTrmStrtTime,
        String minTrspOpPlanDateTrmStrtTime,
        String maxTrspOpPlanDateTrmEndTime,
        String minTrspOpPlanDateTrmEndTime) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = DataModelShipperTransCapacity, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Object> response = this.shipperTransCapacityAdaptorImpl.sendGet("DataModelShipperTransCapacity", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. transform = {}, dataModel = DataModelShipperTransCapacity, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }


    @Override
    @PutMapping("/shipper_trans_capacity")
    public ResponseEntity<Void> shipperTransCapacityPut(UUID xTracking, @Valid ShipperTransCapacity dataModelShipperTransCapacity) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = DataModelShipperTransCapacity, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = dataModelShipperTransCapacity, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(dataModelShipperTransCapacity, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = dataModelShipperTransCapacity, tracking = {}",this.shipperTransCapacityAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.shipperTransCapacityAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
