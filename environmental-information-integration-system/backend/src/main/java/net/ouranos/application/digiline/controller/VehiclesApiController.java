package net.ouranos.application.digiline.controller;



import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.Objects;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.Vehicles;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;




@Validated
@Tag(name = "vehicles", description = "the vehicles API")
@Slf4j
@RestController
@RequestMapping("/")
public class VehiclesApiController implements VehiclesApi {

    private final Transform<Vehicles> transform;
    private final Adaptor<Vehicles> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public VehiclesApiController(Transform<Vehicles> transform, Adaptor<Vehicles> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/vehicles")
    public ResponseEntity<Vehicles> vehiclesGet(UUID xTracking) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = Vehicles, tracking = {}", xTracking);
        ResponseEntity<Vehicles> response = this.adaptor.sendGet("Vehicles", xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = Vehicles, tracking = {}", this.transform.getClass(), xTracking);
        ResponseEntity<Vehicles> result = this.transform.decode(response, xTracking, null);
        return result;
    }

}
