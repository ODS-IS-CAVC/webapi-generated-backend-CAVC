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
import net.ouranos.adaptor.digiline.CarrierTransCapacityDelApiAdaptorImpl;
import net.ouranos.domain.digiline.model.CarrierTransCapacityDel;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;


@Validated
@Tag(name = "C-4 共同配送システム", description = "the C-4 共同配送システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class CarrierTransCapacityDelApiController implements CarrierTransCapacityDelApi {

    private final Transform<Object> transform;
    private final CarrierTransCapacityDelApiAdaptorImpl carrierTransCapacityDelApiAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public CarrierTransCapacityDelApiController(Transform<Object> transform, @Qualifier("CarrierTransCapacityDelApiAdaptor")CarrierTransCapacityDelApiAdaptorImpl adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.carrierTransCapacityDelApiAdaptorImpl = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/carrier_trans_capacity_del")
    public ResponseEntity<Void> carrierTransCapacityDelPut(UUID xTracking, @Valid  CarrierTransCapacityDel carrierTransCapacityDel) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = CarrierTransCapacityDel, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = carrierTransCapacityDel, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(carrierTransCapacityDel, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = carrierTransCapacityDel, tracking = {}",this.carrierTransCapacityDelApiAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.carrierTransCapacityDelApiAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
