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
 * DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner
 */

@JsonTypeName("dataModel_useCaseInfo_attribute_useCaseInfo_inner_useCaseClassificationInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner {

  private Integer useCaseType;

  private Integer useCaseSupplementaryCode;

  private Integer targetUtilizationType;

  private Integer targetDirection;

  private Integer targetSensorNumber;

  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner(Integer useCaseType, Integer targetUtilizationType) {
    this.useCaseType = useCaseType;
    this.targetUtilizationType = targetUtilizationType;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner useCaseType(Integer useCaseType) {
    this.useCaseType = useCaseType;
    return this;
  }

  /**
   * 対象ユースケース類型
   * minimum: 0
   * maximum: 255
   * @return useCaseType
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "useCaseType", example = "1", description = "対象ユースケース類型", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("useCaseType")
  public Integer getUseCaseType() {
    return useCaseType;
  }

  public void setUseCaseType(Integer useCaseType) {
    this.useCaseType = useCaseType;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner useCaseSupplementaryCode(Integer useCaseSupplementaryCode) {
    this.useCaseSupplementaryCode = useCaseSupplementaryCode;
    return this;
  }

  /**
   * ユースケースによって類型がさらに分類できる場合の補足情報
   * minimum: 0
   * maximum: 3
   * @return useCaseSupplementaryCode
  */
  @Min(0) @Max(3) 
  @Schema(name = "useCaseSupplementaryCode", example = "1", description = "ユースケースによって類型がさらに分類できる場合の補足情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useCaseSupplementaryCode")
  public Integer getUseCaseSupplementaryCode() {
    return useCaseSupplementaryCode;
  }

  public void setUseCaseSupplementaryCode(Integer useCaseSupplementaryCode) {
    this.useCaseSupplementaryCode = useCaseSupplementaryCode;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner targetUtilizationType(Integer targetUtilizationType) {
    this.targetUtilizationType = targetUtilizationType;
    return this;
  }

  /**
   * 路側センサの性能低下を動的に把握可能な場合，本情報を動的に変化させてもよい
   * minimum: 0
   * maximum: 7
   * @return targetUtilizationType
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "targetUtilizationType", example = "1", description = "路側センサの性能低下を動的に把握可能な場合，本情報を動的に変化させてもよい", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetUtilizationType")
  public Integer getTargetUtilizationType() {
    return targetUtilizationType;
  }

  public void setTargetUtilizationType(Integer targetUtilizationType) {
    this.targetUtilizationType = targetUtilizationType;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner targetDirection(Integer targetDirection) {
    this.targetDirection = targetDirection;
    return this;
  }

  /**
   * 物標情報を提供するサービスの場合の対象(センサ検知エリアの主対象)の方路IDの該当ビットを1にする
   * minimum: 0
   * maximum: 65534
   * @return targetDirection
  */
  @Min(0) @Max(65534) 
  @Schema(name = "targetDirection", example = "12345", description = "物標情報を提供するサービスの場合の対象(センサ検知エリアの主対象)の方路IDの該当ビットを1にする", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetDirection")
  public Integer getTargetDirection() {
    return targetDirection;
  }

  public void setTargetDirection(Integer targetDirection) {
    this.targetDirection = targetDirection;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner targetSensorNumber(Integer targetSensorNumber) {
    this.targetSensorNumber = targetSensorNumber;
    return this;
  }

  /**
   * 物標情報を提供するサービスの場合の対象センサについて，センサ情報の並び順と合致するよう該当ビットを1にする
   * minimum: 0
   * maximum: 65535
   * @return targetSensorNumber
  */
  @Min(0) @Max(65535) 
  @Schema(name = "targetSensorNumber", example = "12", description = "物標情報を提供するサービスの場合の対象センサについて，センサ情報の並び順と合致するよう該当ビットを1にする", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetSensorNumber")
  public Integer getTargetSensorNumber() {
    return targetSensorNumber;
  }

  public void setTargetSensorNumber(Integer targetSensorNumber) {
    this.targetSensorNumber = targetSensorNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner dataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner = (DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner) o;
    return Objects.equals(this.useCaseType, dataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner.useCaseType) &&
        Objects.equals(this.useCaseSupplementaryCode, dataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner.useCaseSupplementaryCode) &&
        Objects.equals(this.targetUtilizationType, dataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner.targetUtilizationType) &&
        Objects.equals(this.targetDirection, dataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner.targetDirection) &&
        Objects.equals(this.targetSensorNumber, dataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner.targetSensorNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCaseType, useCaseSupplementaryCode, targetUtilizationType, targetDirection, targetSensorNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner {\n");
    sb.append("    useCaseType: ").append(toIndentedString(useCaseType)).append("\n");
    sb.append("    useCaseSupplementaryCode: ").append(toIndentedString(useCaseSupplementaryCode)).append("\n");
    sb.append("    targetUtilizationType: ").append(toIndentedString(targetUtilizationType)).append("\n");
    sb.append("    targetDirection: ").append(toIndentedString(targetDirection)).append("\n");
    sb.append("    targetSensorNumber: ").append(toIndentedString(targetSensorNumber)).append("\n");
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

