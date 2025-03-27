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
 * 交通渋滞情報
 */

@Schema(name = "dataModel_semiDynamicInfo_attribute_level1_inner_level2_inner_trafficInfo", description = "交通渋滞情報")
@JsonTypeName("dataModel_semiDynamicInfo_attribute_level1_inner_level2_inner_trafficInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo {

  private String dateTime;

  private Integer severity;

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * 交通渋滞情報の対象日時。
   * @return dateTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "dateTime", example = "2024/07/01 12:00:00", description = "交通渋滞情報の対象日時。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo severity(Integer severity) {
    this.severity = severity;
    return this;
  }

  /**
   * 渋滞度(渋滞＝1,混雑＝2,対象外=0)
   * minimum: 0
   * maximum: 2147483647
   * @return severity
  */
  @Min(0) @Max(2147483647) 
  @Schema(name = "severity", example = "0", description = "渋滞度(渋滞＝1,混雑＝2,対象外=0)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo = (DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo) o;
    return Objects.equals(this.dateTime, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo.dateTime) &&
        Objects.equals(this.severity, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

