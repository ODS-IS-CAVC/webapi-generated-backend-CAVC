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
import net.ouranos.adaptor.digiline.CarrierTransCapacityAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.CarrierTransCapacity;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Tag(name = "carrier_trans_capacity", description = "the carrier_trans_capacity API")
@Slf4j
@RestController
@RequestMapping("/")
public class CarrierTransCapacityApiController implements CarrierTransCapacityApi {

    private final Transform<Object> transform;
    private final CarrierTransCapacityAdaptorImpl carrierTransCapacityAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public CarrierTransCapacityApiController(Transform<Object> transform, @Qualifier("CarrierTransCapacityAdaptor")CarrierTransCapacityAdaptorImpl carrierTransCapacityAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.tokenIntrospection = tokenIntrospection;
        this.carrierTransCapacityAdaptorImpl = carrierTransCapacityAdaptorImpl;
    }

    @Override
    @DeleteMapping("/carrier_trans_capacity")
    public ResponseEntity<Void> carrierTransCapacityDelete(
    UUID xTracking,
    String trspInstructionId,
    String serviceNo,
    String serviceStrtDate,
    String cnsgPrtyHeadOffId,
    String cnsgPrtyBrncOffId,
    String trspRqrPrtyHeadOffId,
    String trspRqrPrtyBrncOffId) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = DataModelCarrierTransCapacity, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Void> response = this.carrierTransCapacityAdaptorImpl.sendDelete(xTracking, queryParam, token);
        return response;
    }


    @Override
    @GetMapping("/carrier_trans_capacity")
    public ResponseEntity<Object> carrierTransCapacityGet(
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
        String minTrspOpPlanDateTrmEndTime){
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = DataModelCarrierTransCapacity, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Object> response = this.carrierTransCapacityAdaptorImpl.sendGet("DataModelCarrierTransCapacity", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. transform = {}, dataModel = DataModelCarrierTransCapacity, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }


    @Override
    @PutMapping("/carrier_trans_capacity")
    public ResponseEntity<Void> carrierTransCapacityPut(UUID xTracking, @Valid CarrierTransCapacity CarrierTransCapacity) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = DataModelCarrierTransCapacity, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = dataModelCarrierTransCapacity, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(CarrierTransCapacity, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = dataModelCarrierTransCapacity, tracking = {}",this.carrierTransCapacityAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.carrierTransCapacityAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
