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
 * DataModelServiceLocationInfoAttributeRoadsideUnitListInner
 */

@JsonTypeName("dataModel_serviceLocationInfo_attribute_roadsideUnitList_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelServiceLocationInfoAttributeRoadsideUnitListInner {

  private Long roadsideUnitID;

  private Integer roadsideUnitClassification;

  public DataModelServiceLocationInfoAttributeRoadsideUnitListInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelServiceLocationInfoAttributeRoadsideUnitListInner(Long roadsideUnitID, Integer roadsideUnitClassification) {
    this.roadsideUnitID = roadsideUnitID;
    this.roadsideUnitClassification = roadsideUnitClassification;
  }

  public DataModelServiceLocationInfoAttributeRoadsideUnitListInner roadsideUnitID(Long roadsideUnitID) {
    this.roadsideUnitID = roadsideUnitID;
    return this;
  }

  /**
   * 路側機ID
   * minimum: 0
   * maximum: 4294967295
   * @return roadsideUnitID
  */
  @NotNull @Min(0L) @Max(4294967295L) 
  @Schema(name = "roadsideUnitID", example = "12345678", description = "路側機ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadsideUnitID")
  public Long getRoadsideUnitID() {
    return roadsideUnitID;
  }

  public void setRoadsideUnitID(Long roadsideUnitID) {
    this.roadsideUnitID = roadsideUnitID;
  }

  public DataModelServiceLocationInfoAttributeRoadsideUnitListInner roadsideUnitClassification(Integer roadsideUnitClassification) {
    this.roadsideUnitClassification = roadsideUnitClassification;
    return this;
  }

  /**
   * 路側機種別
   * minimum: 0
   * maximum: 7
   * @return roadsideUnitClassification
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "roadsideUnitClassification", example = "1", description = "路側機種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadsideUnitClassification")
  public Integer getRoadsideUnitClassification() {
    return roadsideUnitClassification;
  }

  public void setRoadsideUnitClassification(Integer roadsideUnitClassification) {
    this.roadsideUnitClassification = roadsideUnitClassification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelServiceLocationInfoAttributeRoadsideUnitListInner dataModelServiceLocationInfoAttributeRoadsideUnitListInner = (DataModelServiceLocationInfoAttributeRoadsideUnitListInner) o;
    return Objects.equals(this.roadsideUnitID, dataModelServiceLocationInfoAttributeRoadsideUnitListInner.roadsideUnitID) &&
        Objects.equals(this.roadsideUnitClassification, dataModelServiceLocationInfoAttributeRoadsideUnitListInner.roadsideUnitClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roadsideUnitID, roadsideUnitClassification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelServiceLocationInfoAttributeRoadsideUnitListInner {\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    roadsideUnitClassification: ").append(toIndentedString(roadsideUnitClassification)).append("\n");
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

