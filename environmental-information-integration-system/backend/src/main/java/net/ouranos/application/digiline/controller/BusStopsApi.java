package net.ouranos.application.digiline.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import jakarta.annotation.Generated;
import java.util.UUID;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-07T15:02:33.177704+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "busStops", description = "the busStops API")
public interface BusStopsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /bus-stops
     * 乗降地(バス停)モデルの全データを取得します。
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "busStopsGet",
        description = "乗降地(バス停)モデルの全データを取得します。",
        tags = { "busStops" }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/bus-stops",
        produces = { "application/json" }
    )
    
    ResponseEntity<Object> busStopsGet(@Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking
        
    ); 

}
