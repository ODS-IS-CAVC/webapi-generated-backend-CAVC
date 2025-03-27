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
import net.ouranos.adaptor.digiline.ShipperTransCapacityDelAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.ShipperTransCapacityDel;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;


@Validated
@Tag(name = "C-4 共同配送システム", description = "the C-4 共同配送システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class ShipperTransCapacityDelApiController implements ShipperTransCapacityDelApi {

    private final Transform<Object> transform;
    private final ShipperTransCapacityDelAdaptorImpl shipperTransCapacityDelAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public ShipperTransCapacityDelApiController(Transform<Object> transform, @Qualifier("ShipperTransCapacityDelAdaptor")ShipperTransCapacityDelAdaptorImpl shipperTransCapacityDelAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.shipperTransCapacityDelAdaptorImpl = shipperTransCapacityDelAdaptorImpl;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/shipper_trans_capacity_del")
    public ResponseEntity<Void> shipperTransCapacityDelPut(UUID xTracking, @Valid  ShipperTransCapacityDel shipperTransCapacityDel) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = ShipperTransCapacityDel, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = shipperTransCapacityDel, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(shipperTransCapacityDel, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = shipperTransCapacityDel, tracking = {}",this.shipperTransCapacityDelAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.shipperTransCapacityDelAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
