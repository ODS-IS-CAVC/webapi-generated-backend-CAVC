package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner
 */

@JsonTypeName("dataModel_aliveMonitoringInfo_attribute_deviceClassificationAliveInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner {

  private Integer deviceClassification;

  private Integer deviceNum;

  @Valid
  private List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner> deviceAliveInfo = new ArrayList<>();

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner(Integer deviceClassification, Integer deviceNum, List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner> deviceAliveInfo) {
    this.deviceClassification = deviceClassification;
    this.deviceNum = deviceNum;
    this.deviceAliveInfo = deviceAliveInfo;
  }

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner deviceClassification(Integer deviceClassification) {
    this.deviceClassification = deviceClassification;
    return this;
  }

  /**
   * 路側機接続機器種別
   * minimum: 0
   * maximum: 2
   * @return deviceClassification
  */
  @NotNull @Min(0) @Max(2) 
  @Schema(name = "deviceClassification", example = "1", description = "路側機接続機器種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceClassification")
  public Integer getDeviceClassification() {
    return deviceClassification;
  }

  public void setDeviceClassification(Integer deviceClassification) {
    this.deviceClassification = deviceClassification;
  }

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner deviceNum(Integer deviceNum) {
    this.deviceNum = deviceNum;
    return this;
  }

  /**
   * 接続機器数
   * minimum: 0
   * maximum: 15
   * @return deviceNum
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "deviceNum", example = "3", description = "接続機器数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceNum")
  public Integer getDeviceNum() {
    return deviceNum;
  }

  public void setDeviceNum(Integer deviceNum) {
    this.deviceNum = deviceNum;
  }

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner deviceAliveInfo(List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner> deviceAliveInfo) {
    this.deviceAliveInfo = deviceAliveInfo;
    return this;
  }

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner addDeviceAliveInfoItem(DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner deviceAliveInfoItem) {
    if (this.deviceAliveInfo == null) {
      this.deviceAliveInfo = new ArrayList<>();
    }
    this.deviceAliveInfo.add(deviceAliveInfoItem);
    return this;
  }

  /**
   * Get deviceAliveInfo
   * @return deviceAliveInfo
  */
  @NotNull @Valid @Size(min = 0, max = 15) 
  @Schema(name = "deviceAliveInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceAliveInfo")
  public List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner> getDeviceAliveInfo() {
    return deviceAliveInfo;
  }

  public void setDeviceAliveInfo(List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner> deviceAliveInfo) {
    this.deviceAliveInfo = deviceAliveInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner = (DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner) o;
    return Objects.equals(this.deviceClassification, dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner.deviceClassification) &&
        Objects.equals(this.deviceNum, dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner.deviceNum) &&
        Objects.equals(this.deviceAliveInfo, dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner.deviceAliveInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceClassification, deviceNum, deviceAliveInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner {\n");
    sb.append("    deviceClassification: ").append(toIndentedString(deviceClassification)).append("\n");
    sb.append("    deviceNum: ").append(toIndentedString(deviceNum)).append("\n");
    sb.append("    deviceAliveInfo: ").append(toIndentedString(deviceAliveInfo)).append("\n");
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

