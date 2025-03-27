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
import net.ouranos.adaptor.digiline.VehicleIncidentInfoAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.VehicleIncidentInfo;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Tag(name = "vehicleIncidentInfo", description = "the vehicleIncidentInfo API")
@Slf4j
@RestController
@RequestMapping("/")
public class VehicleIncidentInfoApiController implements VehicleIncidentInfoApi {

    private final Transform<Object> transform;
    private final VehicleIncidentInfoAdaptorImpl vehicleIncidentInfoAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public VehicleIncidentInfoApiController(Transform<Object> transform, @Qualifier("VehicleIncidentInfoAdaptor")VehicleIncidentInfoAdaptorImpl vehicleIncidentInfoAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.vehicleIncidentInfoAdaptorImpl = vehicleIncidentInfoAdaptorImpl;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/vehicleIncidentInfo")
    public ResponseEntity<Void> vehicleIncidentInfoPut(UUID xTracking, @Valid VehicleIncidentInfo vehicleIncidentInfo) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = datamodelVehicleIncidentInfo, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = datamodelVehicleIncidentInfo, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(vehicleIncidentInfo, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelVehicleIncidentInfo, tracking = {}",this.vehicleIncidentInfoAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.vehicleIncidentInfoAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
