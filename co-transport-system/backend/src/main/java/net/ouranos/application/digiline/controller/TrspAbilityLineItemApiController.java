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
import net.ouranos.domain.digiline.model.TrspAbilityLineItem;
import net.ouranos.transform.digiline.Transform;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T14:08:30.360621200+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "共同配送システム", description = "the 共同配送システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class TrspAbilityLineItemApiController implements TrspAbilityLineItemApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public TrspAbilityLineItemApiController(Transform<Object> transform, @Qualifier("TrspAbilityLineItemAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @PutMapping("/trsp_ability_line_item")
    public ResponseEntity<Object> trspAbilityLineItemPut(
        UUID xTracking,
        TrspAbilityLineItem trspAbilityLineItem) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        tokenIntrospection.verifyToken(token);
        log.info("Starts a PUT process.  dataModel = TrspAbilityLineItem, tracking = {}", xTracking);
        log.info("Execute the encode by Transform. adaptor = {} dataModel = TrspAbilityLineItem, tracking = {}",this.transform.getClass(), xTracking);
        Object encodeData = this.transform.encode(trspAbilityLineItem, xTracking, null);
        log.info("Execute the adaptor. adaptor = {} dataModel = TrspAbilityLineItem, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendPut(encodeData, xTracking, null, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = TrspAbilityLineItem, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, null);
        return result;
    }
}
