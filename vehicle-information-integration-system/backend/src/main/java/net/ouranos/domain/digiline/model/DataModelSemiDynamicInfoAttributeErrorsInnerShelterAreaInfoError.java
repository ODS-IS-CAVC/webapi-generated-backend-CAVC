package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 待避エリア情報取得時のエラー
 */

@Schema(name = "dataModel_semiDynamicInfo_attribute_errors_inner_shelterAreaInfoError", description = "待避エリア情報取得時のエラー")
@JsonTypeName("dataModel_semiDynamicInfo_attribute_errors_inner_shelterAreaInfoError")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError {

  private Integer errorCode;

  private String message;

  public DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * エラーコード
   * minimum: -10
   * maximum: 0
   * @return errorCode
  */
  @Min(-10) @Max(0) 
  @Schema(name = "errorCode", example = "0", description = "エラーコード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * 異常内容のメッセージ
   * @return message
  */
  
  @Schema(name = "message", example = "システムエラーが発生しました。", description = "異常内容のメッセージ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError dataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError = (DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError) o;
    return Objects.equals(this.errorCode, dataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError.errorCode) &&
        Objects.equals(this.message, dataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

