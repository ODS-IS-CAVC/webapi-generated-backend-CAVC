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
 * DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner
 */

@JsonTypeName("dataModel_aliveMonitoringInfo_attribute_deviceClassificationAliveInfo_inner_deviceAliveInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner {

  private Integer deviceID;

  private Integer deviceOperationStatus;

  private Integer deviceAliveStatus;

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner(Integer deviceID, Integer deviceOperationStatus, Integer deviceAliveStatus) {
    this.deviceID = deviceID;
    this.deviceOperationStatus = deviceOperationStatus;
    this.deviceAliveStatus = deviceAliveStatus;
  }

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner deviceID(Integer deviceID) {
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

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner deviceOperationStatus(Integer deviceOperationStatus) {
    this.deviceOperationStatus = deviceOperationStatus;
    return this;
  }

  /**
   * 接続機器運用状態
   * minimum: 0
   * maximum: 1
   * @return deviceOperationStatus
  */
  @NotNull @Min(0) @Max(1) 
  @Schema(name = "deviceOperationStatus", example = "0", description = "接続機器運用状態", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceOperationStatus")
  public Integer getDeviceOperationStatus() {
    return deviceOperationStatus;
  }

  public void setDeviceOperationStatus(Integer deviceOperationStatus) {
    this.deviceOperationStatus = deviceOperationStatus;
  }

  public DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner deviceAliveStatus(Integer deviceAliveStatus) {
    this.deviceAliveStatus = deviceAliveStatus;
    return this;
  }

  /**
   * 接続機器稼動状態
   * minimum: 0
   * maximum: 2
   * @return deviceAliveStatus
  */
  @NotNull @Min(0) @Max(2) 
  @Schema(name = "deviceAliveStatus", example = "0", description = "接続機器稼動状態", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceAliveStatus")
  public Integer getDeviceAliveStatus() {
    return deviceAliveStatus;
  }

  public void setDeviceAliveStatus(Integer deviceAliveStatus) {
    this.deviceAliveStatus = deviceAliveStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner = (DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner) o;
    return Objects.equals(this.deviceID, dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner.deviceID) &&
        Objects.equals(this.deviceOperationStatus, dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner.deviceOperationStatus) &&
        Objects.equals(this.deviceAliveStatus, dataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner.deviceAliveStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceID, deviceOperationStatus, deviceAliveStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInnerDeviceAliveInfoInner {\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    deviceOperationStatus: ").append(toIndentedString(deviceOperationStatus)).append("\n");
    sb.append("    deviceAliveStatus: ").append(toIndentedString(deviceAliveStatus)).append("\n");
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

