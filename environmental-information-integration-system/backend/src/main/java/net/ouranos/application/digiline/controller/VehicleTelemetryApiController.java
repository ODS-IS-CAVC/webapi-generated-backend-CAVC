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
import net.ouranos.transform.digiline.Transform;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "vehicles", description = "the vehicles API")
@Slf4j
@RestController
@RequestMapping("/")
public class VehicleTelemetryApiController implements VehicleTelemetryApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public VehicleTelemetryApiController(Transform<Object> transform, @Qualifier("VehicleTelemetryAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/vehicle-telemetry")
    public ResponseEntity<Object> vehicleTelemetryGet(
        UUID xTracking,
        UUID vehicleId) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = VehicleTelemetry, tracking = {}", xTracking);
        String queryParam = request.getQueryString();
        ResponseEntity<Object> response = this.adaptor.sendGet("VehicleTelemetry", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = VehicleTelemetry, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }
}
