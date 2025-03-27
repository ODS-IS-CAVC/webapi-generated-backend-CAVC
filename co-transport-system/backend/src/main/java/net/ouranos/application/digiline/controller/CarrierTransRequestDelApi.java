/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.ouranos.application.digiline.controller;

import net.ouranos.domain.digiline.model.CarrierTransRequestDel;
import java.util.UUID;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-03T10:06:19.201452500+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "C-4 共同配送システム", description = "the C-4 共同配送システム API")
public interface CarrierTransRequestDelApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /carrier_trans_request_del : 運送計画情報（明細型）を削除　暫定対応
     * 運送計画情報（明細型）を削除します。
     *
     * @param carrierTransRequestDel 運送計画情報（明細型） (required)
     * @return 運送計画情報（明細型）を正常に削除しました。 (status code 201)
     *         or HTTP400エラー (status code 400)
     *         or HTTP500エラー (status code 500)
     */
    @Operation(
        operationId = "carrierTransRequestDelPut",
        summary = "運送計画情報（明細型）を削除　暫定対応",
        description = "運送計画情報（明細型）を削除します。",
        tags = { "C-4 共同配送システム" }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/carrier_trans_request_del",
        consumes = { "application/json" }
    )
    
    ResponseEntity<Void> carrierTransRequestDelPut(
        @Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking,
        @Parameter(name = "CarrierTransRequestDel", description = "運送計画情報（明細型）", required = true) @Valid @RequestBody CarrierTransRequestDel carrierTransRequestDel
    ); 

}
