package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelSensorInfoAttributeSensorAttributeInfoInner
 */

@JsonTypeName("dataModel_sensorInfo_attribute_sensorAttributeInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelSensorInfoAttributeSensorAttributeInfoInner {

  private Integer deviceID;

  private Integer latitude;

  private Integer longitude;

  private Integer elevation;

  private Integer sensorDetectionRanges;

  @Valid
  private List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner> sensorDetectionRangeInfo = new ArrayList<>();

  public DataModelSensorInfoAttributeSensorAttributeInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelSensorInfoAttributeSensorAttributeInfoInner(Integer deviceID, Integer latitude, Integer longitude, Integer elevation, Integer sensorDetectionRanges) {
    this.deviceID = deviceID;
    this.latitude = latitude;
    this.longitude = longitude;
    this.elevation = elevation;
    this.sensorDetectionRanges = sensorDetectionRanges;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner deviceID(Integer deviceID) {
    this.deviceID = deviceID;
    return this;
  }

  /**
   * 機器識別ID(センサID)
   * minimum: 0
   * maximum: 16777215
   * @return deviceID
  */
  @NotNull @Min(0) @Max(16777215) 
  @Schema(name = "deviceID", example = "12345678", description = "機器識別ID(センサID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceID")
  public Integer getDeviceID() {
    return deviceID;
  }

  public void setDeviceID(Integer deviceID) {
    this.deviceID = deviceID;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * センサ設置緯度．計測系はWGS84．(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return latitude
  */
  @NotNull @Min(-2147483648) @Max(900000000) 
  @Schema(name = "latitude", example = "123456789", description = "センサ設置緯度．計測系はWGS84．(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner longitude(Integer longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * センサ設置経度．計測系はWGS84．(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return longitude
  */
  @NotNull @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "longitude", example = "1234567890", description = "センサ設置経度．計測系はWGS84．(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner elevation(Integer elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * センサ設置高度(分解能:0.1m)
   * minimum: -4095
   * maximum: 61440
   * @return elevation
  */
  @NotNull @Min(-4095) @Max(61440) 
  @Schema(name = "elevation", example = "123", description = "センサ設置高度(分解能:0.1m)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elevation")
  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner sensorDetectionRanges(Integer sensorDetectionRanges) {
    this.sensorDetectionRanges = sensorDetectionRanges;
    return this;
  }

  /**
   * センサで検出する範囲数
   * minimum: 1
   * maximum: 16
   * @return sensorDetectionRanges
  */
  @NotNull @Min(1) @Max(16) 
  @Schema(name = "sensorDetectionRanges", example = "3", description = "センサで検出する範囲数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sensorDetectionRanges")
  public Integer getSensorDetectionRanges() {
    return sensorDetectionRanges;
  }

  public void setSensorDetectionRanges(Integer sensorDetectionRanges) {
    this.sensorDetectionRanges = sensorDetectionRanges;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner sensorDetectionRangeInfo(List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner> sensorDetectionRangeInfo) {
    this.sensorDetectionRangeInfo = sensorDetectionRangeInfo;
    return this;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInner addSensorDetectionRangeInfoItem(DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner sensorDetectionRangeInfoItem) {
    if (this.sensorDetectionRangeInfo == null) {
      this.sensorDetectionRangeInfo = new ArrayList<>();
    }
    this.sensorDetectionRangeInfo.add(sensorDetectionRangeInfoItem);
    return this;
  }

  /**
   * Get sensorDetectionRangeInfo
   * @return sensorDetectionRangeInfo
  */
  @Valid @Size(min = 1, max = 16) 
  @Schema(name = "sensorDetectionRangeInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensorDetectionRangeInfo")
  public List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner> getSensorDetectionRangeInfo() {
    return sensorDetectionRangeInfo;
  }

  public void setSensorDetectionRangeInfo(List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner> sensorDetectionRangeInfo) {
    this.sensorDetectionRangeInfo = sensorDetectionRangeInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSensorInfoAttributeSensorAttributeInfoInner dataModelSensorInfoAttributeSensorAttributeInfoInner = (DataModelSensorInfoAttributeSensorAttributeInfoInner) o;
    return Objects.equals(this.deviceID, dataModelSensorInfoAttributeSensorAttributeInfoInner.deviceID) &&
        Objects.equals(this.latitude, dataModelSensorInfoAttributeSensorAttributeInfoInner.latitude) &&
        Objects.equals(this.longitude, dataModelSensorInfoAttributeSensorAttributeInfoInner.longitude) &&
        Objects.equals(this.elevation, dataModelSensorInfoAttributeSensorAttributeInfoInner.elevation) &&
        Objects.equals(this.sensorDetectionRanges, dataModelSensorInfoAttributeSensorAttributeInfoInner.sensorDetectionRanges) &&
        Objects.equals(this.sensorDetectionRangeInfo, dataModelSensorInfoAttributeSensorAttributeInfoInner.sensorDetectionRangeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceID, latitude, longitude, elevation, sensorDetectionRanges, sensorDetectionRangeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSensorInfoAttributeSensorAttributeInfoInner {\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    sensorDetectionRanges: ").append(toIndentedString(sensorDetectionRanges)).append("\n");
    sb.append("    sensorDetectionRangeInfo: ").append(toIndentedString(sensorDetectionRangeInfo)).append("\n");
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

