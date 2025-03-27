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
import net.ouranos.adaptor.digiline.CarrierTransRequestAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.CarrierTransRequest;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Tag(name = "carrier_trans_request", description = "the carrier_trans_request API")
@Slf4j
@RestController
@RequestMapping("/")
public class CarrierTransRequestApiController implements CarrierTransRequestApi {

    private final Transform<Object> transform;
    private final CarrierTransRequestAdaptorImpl carrierTransRequestAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public CarrierTransRequestApiController(Transform<Object> transform, @Qualifier("CarrierTransRequestAdaptor")CarrierTransRequestAdaptorImpl carrierTransRequestAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.tokenIntrospection = tokenIntrospection;
        this.carrierTransRequestAdaptorImpl = carrierTransRequestAdaptorImpl;
    }

    @Override
    @DeleteMapping("/carrier_trans_request")
    public ResponseEntity<Void> carrierTransRequestDelete(
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
        log.info("Starts a GET process. dataModel = DataModelCarrierTransRequest, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Void> response = this.carrierTransRequestAdaptorImpl.sendDelete(xTracking, queryParam, token);
        return response;
    }



    @Override
    @GetMapping("/carrier_trans_request")
    public ResponseEntity<Object> carrierTransRequestGet(
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
        String minTrspOpPlanDateTrmEndTime)  {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = DataModelCarrierTransRequest, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Object> response = this.carrierTransRequestAdaptorImpl.sendGet("DataModelCarrierTransRequest", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. transform = {}, dataModel = DataModelCarrierTransRequest, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }


    @Override
    @PutMapping("/carrier_trans_request")
    public ResponseEntity<Void> carrierTransRequestPut(UUID xTracking, @Valid CarrierTransRequest CarrierTransRequest) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = DataModelCarrierTransRequest, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = dataModelCarrierTransRequest, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(CarrierTransRequest, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = dataModelCarrierTransRequest, tracking = {}",this.carrierTransRequestAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.carrierTransRequestAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
