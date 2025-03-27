package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import net.ouranos.domain.digiline.model.VehiclesAttributeInnerLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * テレメトリーデータオブジェクト
 */

@Schema(name = "vehicle_telemetry_attribute_telemetry", description = "テレメトリーデータオブジェクト")
@JsonTypeName("vehicle_telemetry_attribute_telemetry")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class VehicleTelemetryAttributeTelemetry {

  /**
   * 自動運転車両のステータス
   */
  public enum StatusEnum {
    DISCONNECTED("disconnected"),
    
    CONNECTED("connected"),
    
    INITIALIZING("initializing"),
    
    TASK_ACCEPTABLE("task_acceptable"),
    
    READY("ready"),
    
    DRIVING("driving"),
    
    TASK_COMPLETED("task_completed"),
    
    ABNORMAL("abnormal"),
    
    SHUTDOWN("shutdown");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  /**
   * 自度運転車両の走行モード
   */
  public enum DriveModeEnum {
    AUTO("auto"),
    
    MANUAL("manual");

    private String value;

    DriveModeEnum(String value) {
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
    public static DriveModeEnum fromValue(String value) {
      for (DriveModeEnum b : DriveModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DriveModeEnum driveMode;

  private BigDecimal speed;

  private BigDecimal battery;

  private VehiclesAttributeInnerLocation location;

  private Double heading;

  private String updatedAt;

  public VehicleTelemetryAttributeTelemetry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleTelemetryAttributeTelemetry(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public VehicleTelemetryAttributeTelemetry status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * 自動運転車両のステータス
   * @return status
  */
  
  @Schema(name = "status", example = "driving", description = "自動運転車両のステータス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VehicleTelemetryAttributeTelemetry driveMode(DriveModeEnum driveMode) {
    this.driveMode = driveMode;
    return this;
  }

  /**
   * 自度運転車両の走行モード
   * @return driveMode
  */
  
  @Schema(name = "driveMode", example = "auto", description = "自度運転車両の走行モード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driveMode")
  public DriveModeEnum getDriveMode() {
    return driveMode;
  }

  public void setDriveMode(DriveModeEnum driveMode) {
    this.driveMode = driveMode;
  }

  public VehicleTelemetryAttributeTelemetry speed(BigDecimal speed) {
    this.speed = speed;
    return this;
  }

  /**
   * 自動運転車両速度[m/s]
   * minimum: -255.0
   * maximum: 255.0
   * @return speed
  */
  @Valid @DecimalMin("-255.0") @DecimalMax("255.0") 
  @Schema(name = "speed", example = "10.5", description = "自動運転車両速度[m/s]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("speed")
  public BigDecimal getSpeed() {
    return speed;
  }

  public void setSpeed(BigDecimal speed) {
    this.speed = speed;
  }

  public VehicleTelemetryAttributeTelemetry battery(BigDecimal battery) {
    this.battery = battery;
    return this;
  }

  /**
   * 自度運転車両のバッテリー[%]
   * minimum: 0
   * maximum: 100
   * @return battery
  */
  @Valid @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "battery", example = "75.5", description = "自度運転車両のバッテリー[%]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("battery")
  public BigDecimal getBattery() {
    return battery;
  }

  public void setBattery(BigDecimal battery) {
    this.battery = battery;
  }

  public VehicleTelemetryAttributeTelemetry location(VehiclesAttributeInnerLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public VehiclesAttributeInnerLocation getLocation() {
    return location;
  }

  public void setLocation(VehiclesAttributeInnerLocation location) {
    this.location = location;
  }

  public VehicleTelemetryAttributeTelemetry heading(Double heading) {
    this.heading = heading;
    return this;
  }

  /**
   * 自動運転車両の進行方向を示す角度。ラジアン単位で時計回りに表示され、車両が真北を向いているときはゼロ。
   * @return heading
  */
  
  @Schema(name = "heading", example = "2.863677970952052", description = "自動運転車両の進行方向を示す角度。ラジアン単位で時計回りに表示され、車両が真北を向いているときはゼロ。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heading")
  public Double getHeading() {
    return heading;
  }

  public void setHeading(Double heading) {
    this.heading = heading;
  }

  public VehicleTelemetryAttributeTelemetry updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * テレメトリデータの更新時間
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updatedAt", example = "2014-10-10T04:50:40.000001+00:00", description = "テレメトリデータの更新時間", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTelemetryAttributeTelemetry vehicleTelemetryAttributeTelemetry = (VehicleTelemetryAttributeTelemetry) o;
    return Objects.equals(this.status, vehicleTelemetryAttributeTelemetry.status) &&
        Objects.equals(this.driveMode, vehicleTelemetryAttributeTelemetry.driveMode) &&
        Objects.equals(this.speed, vehicleTelemetryAttributeTelemetry.speed) &&
        Objects.equals(this.battery, vehicleTelemetryAttributeTelemetry.battery) &&
        Objects.equals(this.location, vehicleTelemetryAttributeTelemetry.location) &&
        Objects.equals(this.heading, vehicleTelemetryAttributeTelemetry.heading) &&
        Objects.equals(this.updatedAt, vehicleTelemetryAttributeTelemetry.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, driveMode, speed, battery, location, heading, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTelemetryAttributeTelemetry {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    driveMode: ").append(toIndentedString(driveMode)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    battery: ").append(toIndentedString(battery)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

