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
import net.ouranos.adaptor.digiline.VehicleAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.Vehicle;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Tag(name = "vehicle", description = "the vehicle API")
@Slf4j
@RestController
@RequestMapping("/")
public class VehicleApiController implements VehicleApi {

    private final Transform<Object> transform;
    private final VehicleAdaptorImpl vehicleAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public VehicleApiController(Transform<Object> transform, @Qualifier("VehicleAdaptor")VehicleAdaptorImpl vehicleAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.tokenIntrospection = tokenIntrospection;
        this.vehicleAdaptorImpl = vehicleAdaptorImpl;
    }

    @Override
    @DeleteMapping("/vehicle")
    public ResponseEntity<Void> vehicleDelete(UUID xTracking, String giai) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = Vehicle, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Void> response = this.vehicleAdaptorImpl.sendDelete(xTracking, queryParam, token);
        return response;
    }


    @Override
    @GetMapping("/vehicle")
    public ResponseEntity<Object> vehicleGet(UUID xTracking, String vehicleType) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = Vehicle, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Object> response = this.vehicleAdaptorImpl.sendGet("Vehicle", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. transform = {}, dataModel = Vehicle, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }


    @Override
    @PutMapping("/vehicle")
    public ResponseEntity<Void> vehiclePut(UUID xTracking, @Valid Vehicle vehicle) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = Vehicle, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. transform = {}, dataModel = datamodelVehicleIncidentInfo, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(vehicle, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelVehicleIncidentInfo, tracking = {}",this.vehicleAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.vehicleAdaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
