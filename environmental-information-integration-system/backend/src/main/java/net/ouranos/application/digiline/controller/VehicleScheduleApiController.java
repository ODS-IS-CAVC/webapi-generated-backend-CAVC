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
import net.ouranos.adaptor.digiline.VehicleScheduleAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.VehicleSchedule;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Tag(name = "vehicleSchedule", description = "the vehicleSchedule API")
@Slf4j
@RestController
@RequestMapping("/")
public class VehicleScheduleApiController implements VehicleScheduleApi {

    private final Transform<Object> transform;
    private final VehicleScheduleAdaptorImpl vehicleScheduleAdaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public VehicleScheduleApiController(Transform<Object> transform, @Qualifier("VehicleScheduleAdaptor")VehicleScheduleAdaptorImpl vehicleScheduleAdaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.vehicleScheduleAdaptorImpl = vehicleScheduleAdaptorImpl;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PostMapping("/vehicle-schedule")
    public ResponseEntity<Void> vehicleSchedulePost(UUID xTracking, @Valid VehicleSchedule vehicleSchedule) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a POST process.  dataModel = VehicleSchedule, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = VehicleSchedule, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(vehicleSchedule, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = VehicleSchedule, tracking = {}",this.vehicleScheduleAdaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.vehicleScheduleAdaptorImpl.sendPost_Void(encodeData, xTracking, null, token);
        return response;
    }



}
