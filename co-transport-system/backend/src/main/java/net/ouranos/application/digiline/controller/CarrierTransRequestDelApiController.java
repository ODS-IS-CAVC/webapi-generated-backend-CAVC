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
import net.ouranos.adaptor.digiline.CarrierTransRequestDelApiAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.CarrierTransRequestDel;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;


@Validated
@Tag(name = "C-4 共同配送システム", description = "the C-4 共同配送システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class CarrierTransRequestDelApiController implements CarrierTransRequestDelApi {

    private final Transform<Object> transform;
    private final CarrierTransRequestDelApiAdaptorImpl carrierTransRequestDelApiAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public CarrierTransRequestDelApiController(Transform<Object> transform, @Qualifier("CarrierTransRequestDelApiAdaptor")CarrierTransRequestDelApiAdaptorImpl adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.carrierTransRequestDelApiAdaptorImpl = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/carrier_trans_request_del")
    public ResponseEntity<Void> carrierTransRequestDelPut(UUID xTracking, @Valid  CarrierTransRequestDel carrierTransRequestDel) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = CarrierTransRequestDel, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = carrierTransRequestDel, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(carrierTransRequestDel, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = carrierTransRequestDel, tracking = {}",this.carrierTransRequestDelApiAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.carrierTransRequestDelApiAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
