package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeErrorsInnerEventRegulationInfoError;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeErrorsInnerTrafficInfoError;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeErrorsInnerWeatherInfoError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelSemiDynamicInfoAttributeErrorsInner
 */

@JsonTypeName("dataModel_semiDynamicInfo_attribute_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeErrorsInner {

  private DataModelSemiDynamicInfoAttributeErrorsInnerTrafficInfoError trafficInfoError;

  private DataModelSemiDynamicInfoAttributeErrorsInnerEventRegulationInfoError eventRegulationInfoError;

  private DataModelSemiDynamicInfoAttributeErrorsInnerWeatherInfoError weatherInfoError;

  private DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError shelterAreaInfoError;

  public DataModelSemiDynamicInfoAttributeErrorsInner trafficInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerTrafficInfoError trafficInfoError) {
    this.trafficInfoError = trafficInfoError;
    return this;
  }

  /**
   * Get trafficInfoError
   * @return trafficInfoError
  */
  @Valid 
  @Schema(name = "trafficInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficInfoError")
  public DataModelSemiDynamicInfoAttributeErrorsInnerTrafficInfoError getTrafficInfoError() {
    return trafficInfoError;
  }

  public void setTrafficInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerTrafficInfoError trafficInfoError) {
    this.trafficInfoError = trafficInfoError;
  }

  public DataModelSemiDynamicInfoAttributeErrorsInner eventRegulationInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerEventRegulationInfoError eventRegulationInfoError) {
    this.eventRegulationInfoError = eventRegulationInfoError;
    return this;
  }

  /**
   * Get eventRegulationInfoError
   * @return eventRegulationInfoError
  */
  @Valid 
  @Schema(name = "eventRegulationInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventRegulationInfoError")
  public DataModelSemiDynamicInfoAttributeErrorsInnerEventRegulationInfoError getEventRegulationInfoError() {
    return eventRegulationInfoError;
  }

  public void setEventRegulationInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerEventRegulationInfoError eventRegulationInfoError) {
    this.eventRegulationInfoError = eventRegulationInfoError;
  }

  public DataModelSemiDynamicInfoAttributeErrorsInner weatherInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerWeatherInfoError weatherInfoError) {
    this.weatherInfoError = weatherInfoError;
    return this;
  }

  /**
   * Get weatherInfoError
   * @return weatherInfoError
  */
  @Valid 
  @Schema(name = "weatherInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherInfoError")
  public DataModelSemiDynamicInfoAttributeErrorsInnerWeatherInfoError getWeatherInfoError() {
    return weatherInfoError;
  }

  public void setWeatherInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerWeatherInfoError weatherInfoError) {
    this.weatherInfoError = weatherInfoError;
  }

  public DataModelSemiDynamicInfoAttributeErrorsInner shelterAreaInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError shelterAreaInfoError) {
    this.shelterAreaInfoError = shelterAreaInfoError;
    return this;
  }

  /**
   * Get shelterAreaInfoError
   * @return shelterAreaInfoError
  */
  @Valid 
  @Schema(name = "shelterAreaInfoError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shelterAreaInfoError")
  public DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError getShelterAreaInfoError() {
    return shelterAreaInfoError;
  }

  public void setShelterAreaInfoError(DataModelSemiDynamicInfoAttributeErrorsInnerShelterAreaInfoError shelterAreaInfoError) {
    this.shelterAreaInfoError = shelterAreaInfoError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeErrorsInner dataModelSemiDynamicInfoAttributeErrorsInner = (DataModelSemiDynamicInfoAttributeErrorsInner) o;
    return Objects.equals(this.trafficInfoError, dataModelSemiDynamicInfoAttributeErrorsInner.trafficInfoError) &&
        Objects.equals(this.eventRegulationInfoError, dataModelSemiDynamicInfoAttributeErrorsInner.eventRegulationInfoError) &&
        Objects.equals(this.weatherInfoError, dataModelSemiDynamicInfoAttributeErrorsInner.weatherInfoError) &&
        Objects.equals(this.shelterAreaInfoError, dataModelSemiDynamicInfoAttributeErrorsInner.shelterAreaInfoError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trafficInfoError, eventRegulationInfoError, weatherInfoError, shelterAreaInfoError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeErrorsInner {\n");
    sb.append("    trafficInfoError: ").append(toIndentedString(trafficInfoError)).append("\n");
    sb.append("    eventRegulationInfoError: ").append(toIndentedString(eventRegulationInfoError)).append("\n");
    sb.append("    weatherInfoError: ").append(toIndentedString(weatherInfoError)).append("\n");
    sb.append("    shelterAreaInfoError: ").append(toIndentedString(shelterAreaInfoError)).append("\n");
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

