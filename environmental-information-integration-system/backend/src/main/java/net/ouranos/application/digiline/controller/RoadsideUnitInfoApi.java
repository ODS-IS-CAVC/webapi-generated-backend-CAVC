/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.ouranos.application.digiline.controller;

import net.ouranos.domain.digiline.model.RoadsideUnitInfo;
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
import java.util.UUID;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "環境情報連携システム", description = "the 環境情報連携システム API")
public interface RoadsideUnitInfoApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /roadsideUnitInfo
     * 環境情報連携システムの路側機属性情報データモデルのデータを取得します。
     *
     * @param serviceLocationID サービス地点ID (required)
     * @param roadsideUnitID 路側機ID (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "roadsideUnitInfoGet",
        description = "環境情報連携システムの路側機属性情報データモデルのデータを取得します。",
        tags = { "環境情報連携システム" }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/roadsideUnitInfo",
        produces = { "application/json" }
    )
    
    ResponseEntity<Object> roadsideUnitInfoGet(@Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking,
        @NotNull @Parameter(name = "serviceLocationID", description = "サービス地点ID", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "serviceLocationID", required = true) Long serviceLocationID,
        @NotNull @Parameter(name = "roadsideUnitID", description = "路側機ID", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "roadsideUnitID", required = true) Long roadsideUnitID
    ); 


    /**
     * PUT /roadsideUnitInfo
     * 環境情報連携システムの路側機属性情報データモデルのデータを新規作成or更新します。
     *
     * @param roadsideUnitInfo Request Body (required)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "roadsideUnitInfoPut",
        description = "環境情報連携システムの路側機属性情報データモデルのデータを新規作成or更新します。",
        tags = { "環境情報連携システム" }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/roadsideUnitInfo",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Object> roadsideUnitInfoPut(@Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking,
        @Parameter(name = "RoadsideUnitInfo", description = "Request Body", required = true) @Valid @RequestBody RoadsideUnitInfo roadsideUnitInfo
    ); 

}
