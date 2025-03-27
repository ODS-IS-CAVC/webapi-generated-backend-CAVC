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
 * DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner
 */

@JsonTypeName("dataModel_semiDynamicInfo_attribute_level1_inner_level2_inner_eventRegulationInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner {

  private String dateTime;

  private String cause;

  private String regulation;

  private String plannedStartTimestamp;

  private String plannedEndTimestamp;

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * 交通規制情報の対象日時。
   * @return dateTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "dateTime", example = "2024/07/01 12:00:00", description = "交通規制情報の対象日時。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner cause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * 事象原因。提供名称か詳細名称のいずれか。
   * @return cause
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "cause", example = "災害", description = "事象原因。提供名称か詳細名称のいずれか。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner regulation(String regulation) {
    this.regulation = regulation;
    return this;
  }

  /**
   * 規制内容。提供名称か詳細名称のいずれか。
   * @return regulation
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "regulation", example = "片側交互通行", description = "規制内容。提供名称か詳細名称のいずれか。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regulation")
  public String getRegulation() {
    return regulation;
  }

  public void setRegulation(String regulation) {
    this.regulation = regulation;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner plannedStartTimestamp(String plannedStartTimestamp) {
    this.plannedStartTimestamp = plannedStartTimestamp;
    return this;
  }

  /**
   * 当該規制の開始予定日時。指定がなければ対象日時時点で発生中の事象とする。
   * @return plannedStartTimestamp
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "plannedStartTimestamp", example = "2024/11/01 12:00:00", description = "当該規制の開始予定日時。指定がなければ対象日時時点で発生中の事象とする。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plannedStartTimestamp")
  public String getPlannedStartTimestamp() {
    return plannedStartTimestamp;
  }

  public void setPlannedStartTimestamp(String plannedStartTimestamp) {
    this.plannedStartTimestamp = plannedStartTimestamp;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner plannedEndTimestamp(String plannedEndTimestamp) {
    this.plannedEndTimestamp = plannedEndTimestamp;
    return this;
  }

  /**
   * 当該規制の終了予定日時。指定がなければ終了日時不明とする。
   * @return plannedEndTimestamp
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "plannedEndTimestamp", example = "2024/11/03 12:00:00", description = "当該規制の終了予定日時。指定がなければ終了日時不明とする。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plannedEndTimestamp")
  public String getPlannedEndTimestamp() {
    return plannedEndTimestamp;
  }

  public void setPlannedEndTimestamp(String plannedEndTimestamp) {
    this.plannedEndTimestamp = plannedEndTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner = (DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner) o;
    return Objects.equals(this.dateTime, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner.dateTime) &&
        Objects.equals(this.cause, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner.cause) &&
        Objects.equals(this.regulation, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner.regulation) &&
        Objects.equals(this.plannedStartTimestamp, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner.plannedStartTimestamp) &&
        Objects.equals(this.plannedEndTimestamp, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner.plannedEndTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, cause, regulation, plannedStartTimestamp, plannedEndTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    regulation: ").append(toIndentedString(regulation)).append("\n");
    sb.append("    plannedStartTimestamp: ").append(toIndentedString(plannedStartTimestamp)).append("\n");
    sb.append("    plannedEndTimestamp: ").append(toIndentedString(plannedEndTimestamp)).append("\n");
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

