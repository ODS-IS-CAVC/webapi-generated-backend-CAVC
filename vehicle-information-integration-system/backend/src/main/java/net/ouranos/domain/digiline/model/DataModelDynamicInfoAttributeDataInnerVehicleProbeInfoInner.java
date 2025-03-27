package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner
 */

@JsonTypeName("dataModel_dynamicInfo_attribute_data_inner_vehicleProbeInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner {

  private String vehicleID;

  private String dateTime;

  private Double lat;

  private Double lon;

  private Double height;

  private String vehicleName;

  /**
   * 自動運転車両のステータス
   */
  public enum VehicleStatusEnum {
    DISCONNECTED("disconnected"),
    
    CONNECTED("connected"),
    
    INITIALIZING("initializing"),
    
    TASK_ACCEPTABLE("task_acceptable"),
    
    READY("ready"),
    
    DRIVING("driving"),
    
    TASK_COMPLETED("task_completed"),
    
    PAUSING("pausing"),
    
    ABNORMAL("abnormal"),
    
    SHUTDOWN("shutdown");

    private String value;

    VehicleStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VehicleStatusEnum fromValue(String value) {
      for (VehicleStatusEnum b : VehicleStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VehicleStatusEnum vehicleStatus;

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner vehicleID(String vehicleID) {
    this.vehicleID = vehicleID;
    return this;
  }

  /**
   * 車両ID
   * @return vehicleID
  */
  @Size(min = 36, max = 36) 
  @Schema(name = "vehicleID", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "車両ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleID")
  public String getVehicleID() {
    return vehicleID;
  }

  public void setVehicleID(String vehicleID) {
    this.vehicleID = vehicleID;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * 該当車両プローブ情報の収集日時
   * @return dateTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") @Size(min = 19, max = 19) 
  @Schema(name = "dateTime", example = "2024/01/23 13:23:45", description = "該当車両プローブ情報の収集日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * 車両の位置情報(緯度)
   * minimum: -90
   * maximum: 90
   * @return lat
  */
  @DecimalMin("-90") @DecimalMax("90") 
  @Schema(name = "lat", example = "35.6242681254456", description = "車両の位置情報(緯度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * 車両の位置情報(経度)
   * minimum: -180
   * maximum: 180
   * @return lon
  */
  @DecimalMin("-180") @DecimalMax("180") 
  @Schema(name = "lon", example = "139.74258640456", description = "車両の位置情報(経度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * 車両の位置情報(高度) [m]
   * @return height
  */
  
  @Schema(name = "height", example = "0.01258640981", description = "車両の位置情報(高度) [m]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  /**
   * 自動運転車両の名称
   * @return vehicleName
  */
  @Size(min = 1, max = 20) 
  @Schema(name = "vehicleName", example = "vehicle1", description = "自動運転車両の名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleName")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner vehicleStatus(VehicleStatusEnum vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
    return this;
  }

  /**
   * 自動運転車両のステータス
   * @return vehicleStatus
  */
  
  @Schema(name = "vehicleStatus", example = "driving", description = "自動運転車両のステータス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleStatus")
  public VehicleStatusEnum getVehicleStatus() {
    return vehicleStatus;
  }

  public void setVehicleStatus(VehicleStatusEnum vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner = (DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner) o;
    return Objects.equals(this.vehicleID, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.vehicleID) &&
        Objects.equals(this.dateTime, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.dateTime) &&
        Objects.equals(this.lat, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.lat) &&
        Objects.equals(this.lon, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.lon) &&
        Objects.equals(this.height, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.height) &&
        Objects.equals(this.vehicleName, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.vehicleName) &&
        Objects.equals(this.vehicleStatus, dataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner.vehicleStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleID, dateTime, lat, lon, height, vehicleName, vehicleStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner {\n");
    sb.append("    vehicleID: ").append(toIndentedString(vehicleID)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    vehicleStatus: ").append(toIndentedString(vehicleStatus)).append("\n");
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

