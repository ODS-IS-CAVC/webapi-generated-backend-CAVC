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
 * 待避エリア情報
 */

@Schema(name = "dataModel_semiDynamicInfo_attribute_level1_inner_level2_inner_shelterAreaInfo", description = "待避エリア情報")
@JsonTypeName("dataModel_semiDynamicInfo_attribute_level1_inner_level2_inner_shelterAreaInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo {

  private String dateTime;

  private String shelterAreaName;

  private String roadType;

  private Integer maxCapacity;

  private Integer currentCount;

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * 待避エリア情報の対象日時。
   * @return dateTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "dateTime", example = "2024/07/01 12:00:00", description = "待避エリア情報の対象日時。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo shelterAreaName(String shelterAreaName) {
    this.shelterAreaName = shelterAreaName;
    return this;
  }

  /**
   * 待避エリアの名称
   * @return shelterAreaName
  */
  @Size(min = 0, max = 256) 
  @Schema(name = "shelterAreaName", example = "zzz待避エリア", description = "待避エリアの名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shelterAreaName")
  public String getShelterAreaName() {
    return shelterAreaName;
  }

  public void setShelterAreaName(String shelterAreaName) {
    this.shelterAreaName = shelterAreaName;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo roadType(String roadType) {
    this.roadType = roadType;
    return this;
  }

  /**
   * 道路属性
   * @return roadType
  */
  @Size(min = 0, max = 256) 
  @Schema(name = "roadType", example = "新東名高速道路上り", description = "道路属性", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadType")
  public String getRoadType() {
    return roadType;
  }

  public void setRoadType(String roadType) {
    this.roadType = roadType;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo maxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  /**
   * 該当待避エリアの最大駐車台数。
   * minimum: 0
   * maximum: 2147483647
   * @return maxCapacity
  */
  @Min(0) @Max(2147483647) 
  @Schema(name = "maxCapacity", example = "1", description = "該当待避エリアの最大駐車台数。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxCapacity")
  public Integer getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo currentCount(Integer currentCount) {
    this.currentCount = currentCount;
    return this;
  }

  /**
   * 該当待避エリアの現在の駐車台数。
   * minimum: 0
   * maximum: 2147483647
   * @return currentCount
  */
  @Min(0) @Max(2147483647) 
  @Schema(name = "currentCount", example = "1", description = "該当待避エリアの現在の駐車台数。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentCount")
  public Integer getCurrentCount() {
    return currentCount;
  }

  public void setCurrentCount(Integer currentCount) {
    this.currentCount = currentCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo = (DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo) o;
    return Objects.equals(this.dateTime, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo.dateTime) &&
        Objects.equals(this.shelterAreaName, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo.shelterAreaName) &&
        Objects.equals(this.roadType, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo.roadType) &&
        Objects.equals(this.maxCapacity, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo.maxCapacity) &&
        Objects.equals(this.currentCount, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo.currentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, shelterAreaName, roadType, maxCapacity, currentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    shelterAreaName: ").append(toIndentedString(shelterAreaName)).append("\n");
    sb.append("    roadType: ").append(toIndentedString(roadType)).append("\n");
    sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
    sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
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

