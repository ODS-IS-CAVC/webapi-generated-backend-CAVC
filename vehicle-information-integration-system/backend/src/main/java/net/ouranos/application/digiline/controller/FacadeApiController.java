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
import net.ouranos.domain.digiline.model.DataModelFacade;
import net.ouranos.transform.digiline.Transform;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T14:08:30.360621200+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "C-2-2[B] 車両情報連携システム", description = "the C-2-2[B] 車両情報連携システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class FacadeApiController implements FacadeApi {

    private final Transform<DataModelFacade> transform;
    private final Adaptor<DataModelFacade> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public FacadeApiController(Transform<DataModelFacade> transform, Adaptor<DataModelFacade> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/facade")
    public ResponseEntity<DataModelFacade> facadeGet(
        UUID xTracking) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = DatamodelFacade, tracking = {}", xTracking);
        ResponseEntity<DataModelFacade> response = this.adaptor.sendGet("Facade", xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = DatamodelFacade, tracking = {}", this.transform.getClass(), xTracking);
        ResponseEntity<DataModelFacade> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}
