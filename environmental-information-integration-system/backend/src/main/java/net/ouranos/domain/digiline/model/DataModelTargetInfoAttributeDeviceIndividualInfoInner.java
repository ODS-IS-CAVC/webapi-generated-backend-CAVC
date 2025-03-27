package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelTargetInfoAttributeDeviceIndividualInfoInner
 */

@JsonTypeName("dataModel_targetInfo_attribute_deviceIndividualInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelTargetInfoAttributeDeviceIndividualInfoInner {

  private Integer deviceID;

  private Integer targetNum;

  @Valid
  private List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner> targetIndividualInfo = new ArrayList<>();

  public DataModelTargetInfoAttributeDeviceIndividualInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelTargetInfoAttributeDeviceIndividualInfoInner(Integer deviceID, Integer targetNum, List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner> targetIndividualInfo) {
    this.deviceID = deviceID;
    this.targetNum = targetNum;
    this.targetIndividualInfo = targetIndividualInfo;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInner deviceID(Integer deviceID) {
    this.deviceID = deviceID;
    return this;
  }

  /**
   * 機器識別ID
   * minimum: 0
   * maximum: 16777215
   * @return deviceID
  */
  @NotNull @Min(0) @Max(16777215) 
  @Schema(name = "deviceID", example = "12345678", description = "機器識別ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceID")
  public Integer getDeviceID() {
    return deviceID;
  }

  public void setDeviceID(Integer deviceID) {
    this.deviceID = deviceID;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInner targetNum(Integer targetNum) {
    this.targetNum = targetNum;
    return this;
  }

  /**
   * 取得物標数
   * minimum: 0
   * maximum: 65535
   * @return targetNum
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "targetNum", example = "123", description = "取得物標数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetNum")
  public Integer getTargetNum() {
    return targetNum;
  }

  public void setTargetNum(Integer targetNum) {
    this.targetNum = targetNum;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInner targetIndividualInfo(List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner> targetIndividualInfo) {
    this.targetIndividualInfo = targetIndividualInfo;
    return this;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInner addTargetIndividualInfoItem(DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner targetIndividualInfoItem) {
    if (this.targetIndividualInfo == null) {
      this.targetIndividualInfo = new ArrayList<>();
    }
    this.targetIndividualInfo.add(targetIndividualInfoItem);
    return this;
  }

  /**
   * Get targetIndividualInfo
   * @return targetIndividualInfo
  */
  @NotNull @Valid @Size(min = 0, max = 65535) 
  @Schema(name = "targetIndividualInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetIndividualInfo")
  public List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner> getTargetIndividualInfo() {
    return targetIndividualInfo;
  }

  public void setTargetIndividualInfo(List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner> targetIndividualInfo) {
    this.targetIndividualInfo = targetIndividualInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTargetInfoAttributeDeviceIndividualInfoInner dataModelTargetInfoAttributeDeviceIndividualInfoInner = (DataModelTargetInfoAttributeDeviceIndividualInfoInner) o;
    return Objects.equals(this.deviceID, dataModelTargetInfoAttributeDeviceIndividualInfoInner.deviceID) &&
        Objects.equals(this.targetNum, dataModelTargetInfoAttributeDeviceIndividualInfoInner.targetNum) &&
        Objects.equals(this.targetIndividualInfo, dataModelTargetInfoAttributeDeviceIndividualInfoInner.targetIndividualInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceID, targetNum, targetIndividualInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTargetInfoAttributeDeviceIndividualInfoInner {\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    targetNum: ").append(toIndentedString(targetNum)).append("\n");
    sb.append("    targetIndividualInfo: ").append(toIndentedString(targetIndividualInfo)).append("\n");
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

