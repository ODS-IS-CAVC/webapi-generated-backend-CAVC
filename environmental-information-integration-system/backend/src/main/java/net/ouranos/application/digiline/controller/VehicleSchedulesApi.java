/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.ouranos.application.digiline.controller;

import java.util.UUID;
import net.ouranos.domain.digiline.model.VehicleSchedules;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "vehicles", description = "the vehicles API")
public interface VehicleSchedulesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /vehicle-schedules
     * 自動運転車両のスケジュールを取得します。
     *
     * @param vehicleId The vehicle identifier to retrieve the vehicle. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "vehicleSchedulesGet",
        description = "自動運転車両のスケジュールを取得します。",
        tags = { "vehicles" }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/vehicle-schedules",
        produces = { "application/json" }
    )
    
    ResponseEntity<Object> vehicleSchedulesGet(@Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking,
        @NotNull @Parameter(name = "vehicle_id", description = "The vehicle identifier to retrieve the vehicle.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "vehicle_id", required = true) UUID vehicleId
    ); 

}
