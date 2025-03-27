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
import net.ouranos.adaptor.digiline.VehicleDelApiAdaptorImpl;
import net.ouranos.domain.digiline.model.VehicleDel;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;


@Validated
@Tag(name = "C-4 共同配送システム", description = "the C-4 共同配送システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class VehicleDelApiController implements VehicleDelApi {

    private final Transform<Object> transform;
    private final VehicleDelApiAdaptorImpl vehicleDelApiAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public VehicleDelApiController(Transform<Object> transform, @Qualifier("VehicleDelApiAdaptor")VehicleDelApiAdaptorImpl adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.vehicleDelApiAdaptorImpl = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/vehicle_del")
    public ResponseEntity<Void> vehicleDelPut(UUID xTracking, @Valid  VehicleDel vehicleDel) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = VehicleDel, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = vehicleDel, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(vehicleDel, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = vehicleDel, tracking = {}",this.vehicleDelApiAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.vehicleDelApiAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
