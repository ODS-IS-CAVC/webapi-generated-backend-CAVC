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
 * DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner
 */

@JsonTypeName("dataModel_useCaseInfo_attribute_useCaseClassificationInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-30T16:07:42.783752+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner {

  private Integer useCaseType;

  private Integer useCaseSupplementaryCode;

  private Integer targetUtilizationType;

  private Integer targetDirection;

  private Integer targetSensorNumber;

  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner(Integer useCaseType, Integer targetUtilizationType) {
    this.useCaseType = useCaseType;
    this.targetUtilizationType = targetUtilizationType;
  }

  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner useCaseType(Integer useCaseType) {
    this.useCaseType = useCaseType;
    return this;
  }

  /**
   * 対象ユースケース類型
   * minimum: 0
   * maximum: 53
   * @return useCaseType
  */
  @NotNull @Min(0) @Max(53) 
  @Schema(name = "useCaseType", example = "1", description = "対象ユースケース類型", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("useCaseType")
  public Integer getUseCaseType() {
    return useCaseType;
  }

  public void setUseCaseType(Integer useCaseType) {
    this.useCaseType = useCaseType;
  }

  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner useCaseSupplementaryCode(Integer useCaseSupplementaryCode) {
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

  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner targetUtilizationType(Integer targetUtilizationType) {
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

  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner targetDirection(Integer targetDirection) {
    this.targetDirection = targetDirection;
    return this;
  }

  /**
   * 物標情報を提供するサービスの場合の対象(センサ検知エリアの主対象)の方路IDの該当ビットを1にする
   * minimum: 0
   * maximum: 65535
   * @return targetDirection
  */
  @Min(0) @Max(65535) 
  @Schema(name = "targetDirection", example = "12345", description = "物標情報を提供するサービスの場合の対象(センサ検知エリアの主対象)の方路IDの該当ビットを1にする", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetDirection")
  public Integer getTargetDirection() {
    return targetDirection;
  }

  public void setTargetDirection(Integer targetDirection) {
    this.targetDirection = targetDirection;
  }

  public DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner targetSensorNumber(Integer targetSensorNumber) {
    this.targetSensorNumber = targetSensorNumber;
    return this;
  }

  /**
   * 物標情報を提供するサービスの場合の対象センサについて，センサ情報の並び順と合致するよう該当ビットを1にする
   * minimum: 0
   * maximum: 15
   * @return targetSensorNumber
  */
  @Min(0) @Max(15) 
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
    DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner dataModelUseCaseInfoAttributeUseCaseClassificationInfoInner = (DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner) o;
    return Objects.equals(this.useCaseType, dataModelUseCaseInfoAttributeUseCaseClassificationInfoInner.useCaseType) &&
        Objects.equals(this.useCaseSupplementaryCode, dataModelUseCaseInfoAttributeUseCaseClassificationInfoInner.useCaseSupplementaryCode) &&
        Objects.equals(this.targetUtilizationType, dataModelUseCaseInfoAttributeUseCaseClassificationInfoInner.targetUtilizationType) &&
        Objects.equals(this.targetDirection, dataModelUseCaseInfoAttributeUseCaseClassificationInfoInner.targetDirection) &&
        Objects.equals(this.targetSensorNumber, dataModelUseCaseInfoAttributeUseCaseClassificationInfoInner.targetSensorNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCaseType, useCaseSupplementaryCode, targetUtilizationType, targetDirection, targetSensorNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelUseCaseInfoAttributeUseCaseClassificationInfoInner {\n");
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

