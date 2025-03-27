package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeErrorsInnerTargetInfoError;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeErrorsInnerVehicleIncidentInfoError;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeErrorsInnerVehicleProbeInfoError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelDynamicInfoAttributeErrorsInner
 */

@JsonTypeName("dataModel_dynamicInfo_attribute_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelDynamicInfoAttributeErrorsInner {

  private DataModelDynamicInfoAttributeErrorsInnerVehicleProbeInfoError vehicleProbeInfoError;

  private DataModelDynamicInfoAttributeErrorsInnerTargetInfoError targetInfoError;

  private DataModelDynamicInfoAttributeErrorsInnerVehicleIncidentInfoError vehicleIncidentInfoError;

  public DataModelDynamicInfoAttributeErrorsInner vehicleProbeInfoError(DataModelDynamicInfoAttributeErrorsInnerVehicleProbeInfoError vehicleProbeInfoError) {
    this.vehicleProbeInfoError = vehicleProbeInfoError;
    return this;
  }

  /**
   * Get vehicleProbeInfoError
   * @return vehicleProbeInfoError
  */
  @Valid 
  @Schema(name = "vehicleProbeInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleProbeInfoError")
  public DataModelDynamicInfoAttributeErrorsInnerVehicleProbeInfoError getVehicleProbeInfoError() {
    return vehicleProbeInfoError;
  }

  public void setVehicleProbeInfoError(DataModelDynamicInfoAttributeErrorsInnerVehicleProbeInfoError vehicleProbeInfoError) {
    this.vehicleProbeInfoError = vehicleProbeInfoError;
  }

  public DataModelDynamicInfoAttributeErrorsInner targetInfoError(DataModelDynamicInfoAttributeErrorsInnerTargetInfoError targetInfoError) {
    this.targetInfoError = targetInfoError;
    return this;
  }

  /**
   * Get targetInfoError
   * @return targetInfoError
  */
  @Valid 
  @Schema(name = "targetInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetInfoError")
  public DataModelDynamicInfoAttributeErrorsInnerTargetInfoError getTargetInfoError() {
    return targetInfoError;
  }

  public void setTargetInfoError(DataModelDynamicInfoAttributeErrorsInnerTargetInfoError targetInfoError) {
    this.targetInfoError = targetInfoError;
  }

  public DataModelDynamicInfoAttributeErrorsInner vehicleIncidentInfoError(DataModelDynamicInfoAttributeErrorsInnerVehicleIncidentInfoError vehicleIncidentInfoError) {
    this.vehicleIncidentInfoError = vehicleIncidentInfoError;
    return this;
  }

  /**
   * Get vehicleIncidentInfoError
   * @return vehicleIncidentInfoError
  */
  @Valid 
  @Schema(name = "vehicleIncidentInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleIncidentInfoError")
  public DataModelDynamicInfoAttributeErrorsInnerVehicleIncidentInfoError getVehicleIncidentInfoError() {
    return vehicleIncidentInfoError;
  }

  public void setVehicleIncidentInfoError(DataModelDynamicInfoAttributeErrorsInnerVehicleIncidentInfoError vehicleIncidentInfoError) {
    this.vehicleIncidentInfoError = vehicleIncidentInfoError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttributeErrorsInner dataModelDynamicInfoAttributeErrorsInner = (DataModelDynamicInfoAttributeErrorsInner) o;
    return Objects.equals(this.vehicleProbeInfoError, dataModelDynamicInfoAttributeErrorsInner.vehicleProbeInfoError) &&
        Objects.equals(this.targetInfoError, dataModelDynamicInfoAttributeErrorsInner.targetInfoError) &&
        Objects.equals(this.vehicleIncidentInfoError, dataModelDynamicInfoAttributeErrorsInner.vehicleIncidentInfoError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleProbeInfoError, targetInfoError, vehicleIncidentInfoError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttributeErrorsInner {\n");
    sb.append("    vehicleProbeInfoError: ").append(toIndentedString(vehicleProbeInfoError)).append("\n");
    sb.append("    targetInfoError: ").append(toIndentedString(targetInfoError)).append("\n");
    sb.append("    vehicleIncidentInfoError: ").append(toIndentedString(vehicleIncidentInfoError)).append("\n");
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

