package net.ouranos.application.digiline.controller;



import io.swagger.v3.oas.annotations.tags.Tag;

import java.math.BigDecimal;
import java.util.List;
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
import net.ouranos.domain.digiline.model.Resources;
import net.ouranos.domain.digiline.model.Voxel;
import net.ouranos.transform.digiline.Transform;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T14:08:30.360621200+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "データ流通システム", description = "the データ流通システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class ResourcesApiController implements ResourcesApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public ResourcesApiController(Transform<Object> transform, @Qualifier("ResourcesAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @DeleteMapping("/resources")
    public ResponseEntity<Void> resourcesDelete(
    UUID xTracking,
    List<Double> bbox,
    Voxel voxel,
    BigDecimal mesh,
    BigDecimal city,
    String roadName,
    String category,
    String keyFilter,
    BigDecimal lowerBound,
    BigDecimal upperBound) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();

        tokenIntrospection.verifyToken(token);
        log.info("Starts a DELETE process. dataModel = datamodelResources, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelResources, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Void> response = this.adaptor.sendDelete(xTracking, queryParam, token);
        return response;
    }

    
    @Override
    @PutMapping("/resources")
    public ResponseEntity<Object> resourcesPut(
    UUID xTracking,
    Resources resources) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = datamodelResources, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = datamodelResources, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(resources, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = datamodelResources, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendPut(encodeData, xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = datamodelResources, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}
