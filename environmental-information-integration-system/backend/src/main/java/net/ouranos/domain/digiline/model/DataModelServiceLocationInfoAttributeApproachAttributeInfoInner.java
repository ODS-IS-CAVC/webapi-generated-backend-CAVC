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
 * DataModelServiceLocationInfoAttributeApproachAttributeInfoInner
 */

@JsonTypeName("dataModel_serviceLocationInfo_attribute_approachAttributeInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelServiceLocationInfoAttributeApproachAttributeInfoInner {

  private Integer approachID;

  private Integer approachHeading;

  public DataModelServiceLocationInfoAttributeApproachAttributeInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelServiceLocationInfoAttributeApproachAttributeInfoInner(Integer approachID, Integer approachHeading) {
    this.approachID = approachID;
    this.approachHeading = approachHeading;
  }

  public DataModelServiceLocationInfoAttributeApproachAttributeInfoInner approachID(Integer approachID) {
    this.approachID = approachID;
    return this;
  }

  /**
   * 交差点内でユニークに，真北から時計回りに付与される方路のID
   * minimum: 1
   * maximum: 15
   * @return approachID
  */
  @NotNull @Min(1) @Max(15) 
  @Schema(name = "approachID", example = "1", description = "交差点内でユニークに，真北から時計回りに付与される方路のID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approachID")
  public Integer getApproachID() {
    return approachID;
  }

  public void setApproachID(Integer approachID) {
    this.approachID = approachID;
  }

  public DataModelServiceLocationInfoAttributeApproachAttributeInfoInner approachHeading(Integer approachHeading) {
    this.approachHeading = approachHeading;
    return this;
  }

  /**
   * 方路付け根から10m程度上流地点から付け根を結んだ直線の角度 (分解能: 1.5度)
   * minimum: 0
   * maximum: 239
   * @return approachHeading
  */
  @NotNull @Min(0) @Max(239) 
  @Schema(name = "approachHeading", example = "100", description = "方路付け根から10m程度上流地点から付け根を結んだ直線の角度 (分解能: 1.5度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approachHeading")
  public Integer getApproachHeading() {
    return approachHeading;
  }

  public void setApproachHeading(Integer approachHeading) {
    this.approachHeading = approachHeading;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelServiceLocationInfoAttributeApproachAttributeInfoInner dataModelServiceLocationInfoAttributeApproachAttributeInfoInner = (DataModelServiceLocationInfoAttributeApproachAttributeInfoInner) o;
    return Objects.equals(this.approachID, dataModelServiceLocationInfoAttributeApproachAttributeInfoInner.approachID) &&
        Objects.equals(this.approachHeading, dataModelServiceLocationInfoAttributeApproachAttributeInfoInner.approachHeading);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approachID, approachHeading);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelServiceLocationInfoAttributeApproachAttributeInfoInner {\n");
    sb.append("    approachID: ").append(toIndentedString(approachID)).append("\n");
    sb.append("    approachHeading: ").append(toIndentedString(approachHeading)).append("\n");
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

