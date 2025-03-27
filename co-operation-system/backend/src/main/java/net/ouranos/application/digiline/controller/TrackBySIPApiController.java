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
import net.ouranos.adaptor.digiline.TrackBySIPAdaptorImpl;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.TrackBySip;
import net.ouranos.transform.digiline.Transform;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Validated
@Tag(name = "ヒヤリハット管理システム", description = "the ヒヤリハット管理システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class TrackBySIPApiController implements TrackBySIPApi {

    private final Transform<Object> transform;
    private final TrackBySIPAdaptorImpl trackBySIPadaptorImpl;
    private final TokenIntrospection tokenIntrospection;

    public TrackBySIPApiController(Transform<Object> transform, @Qualifier("TrackBySIPAdaptor")TrackBySIPAdaptorImpl trackBySIPadaptorImpl, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.trackBySIPadaptorImpl = trackBySIPadaptorImpl;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/trackBySIP")
    public ResponseEntity<Void> trackBySIPPut(UUID xTracking, @NotNull String X_TENANT_ID, @Valid TrackBySip trackBySip) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = TrackBySIP, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = TrackBySIP, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(trackBySip, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = TrackBySIP, tracking = {}",this.trackBySIPadaptorImpl.getClass(), xTracking);
        ResponseEntity<Void> response = this.trackBySIPadaptorImpl.sendPut_Void(encodeData, xTracking, null, token);
        return response;
    }
}
