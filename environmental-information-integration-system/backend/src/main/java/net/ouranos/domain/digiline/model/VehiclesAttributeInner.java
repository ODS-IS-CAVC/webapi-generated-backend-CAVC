package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import net.ouranos.domain.digiline.model.VehiclesAttributeInnerLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VehiclesAttributeInner
 */

@JsonTypeName("vehicles_attribute_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-28T13:39:12.345777800+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class VehiclesAttributeInner {

  private UUID vehicleId;

  private String vehicleName;

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

  private VehiclesAttributeInnerLocation location;

  private String updatedAt;

  public VehiclesAttributeInner vehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * 自度運転車両を一意に識別するID
   * @return vehicleId
  */
  @Valid 
  @Schema(name = "vehicleId", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "自度運転車両を一意に識別するID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleId")
  public UUID getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehiclesAttributeInner vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  /**
   * 自動運転車両名
   * @return vehicleName
  */
  @Size(min = 1, max = 20) 
  @Schema(name = "vehicleName", example = "vehicle1", description = "自動運転車両名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleName")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public VehiclesAttributeInner status(StatusEnum status) {
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

  public VehiclesAttributeInner location(VehiclesAttributeInnerLocation location) {
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

  public VehiclesAttributeInner updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * テレメトリデータの更新時間
   * @return updatedAt
  */
  
  @Schema(name = "updatedAt", example = "2014-10-10T04:50:40.000001+00:00", description = "テレメトリデータの更新時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VehiclesAttributeInner vehiclesAttributeInner = (VehiclesAttributeInner) o;
    return Objects.equals(this.vehicleId, vehiclesAttributeInner.vehicleId) &&
        Objects.equals(this.vehicleName, vehiclesAttributeInner.vehicleName) &&
        Objects.equals(this.status, vehiclesAttributeInner.status) &&
        Objects.equals(this.location, vehiclesAttributeInner.location) &&
        Objects.equals(this.updatedAt, vehiclesAttributeInner.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, vehicleName, status, location, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehiclesAttributeInner {\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

