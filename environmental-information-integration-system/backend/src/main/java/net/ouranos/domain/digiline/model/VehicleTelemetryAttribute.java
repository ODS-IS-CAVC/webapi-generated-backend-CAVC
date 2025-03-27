package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import net.ouranos.domain.digiline.model.VehicleTelemetryAttributeTelemetry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 自動運転車両のテレメトリーデータモデル
 */

@Schema(name = "vehicle_telemetry_attribute", description = "自動運転車両のテレメトリーデータモデル")
@JsonTypeName("vehicle_telemetry_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class VehicleTelemetryAttribute {

  private UUID vehicleId;

  private String vehicleName;

  private VehicleTelemetryAttributeTelemetry telemetry;

  public VehicleTelemetryAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleTelemetryAttribute(UUID vehicleId, String vehicleName, VehicleTelemetryAttributeTelemetry telemetry) {
    this.vehicleId = vehicleId;
    this.vehicleName = vehicleName;
    this.telemetry = telemetry;
  }

  public VehicleTelemetryAttribute vehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * 自度運転車両を一意に識別するID
   * @return vehicleId
  */
  @NotNull @Valid 
  @Schema(name = "vehicleId", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "自度運転車両を一意に識別するID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleId")
  public UUID getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehicleTelemetryAttribute vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  /**
   * 自動運転車両名
   * @return vehicleName
  */
  @NotNull @Size(min = 1, max = 20) 
  @Schema(name = "vehicleName", example = "vehicle1", description = "自動運転車両名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleName")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public VehicleTelemetryAttribute telemetry(VehicleTelemetryAttributeTelemetry telemetry) {
    this.telemetry = telemetry;
    return this;
  }

  /**
   * Get telemetry
   * @return telemetry
  */
  @NotNull @Valid 
  @Schema(name = "telemetry", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("telemetry")
  public VehicleTelemetryAttributeTelemetry getTelemetry() {
    return telemetry;
  }

  public void setTelemetry(VehicleTelemetryAttributeTelemetry telemetry) {
    this.telemetry = telemetry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTelemetryAttribute vehicleTelemetryAttribute = (VehicleTelemetryAttribute) o;
    return Objects.equals(this.vehicleId, vehicleTelemetryAttribute.vehicleId) &&
        Objects.equals(this.vehicleName, vehicleTelemetryAttribute.vehicleName) &&
        Objects.equals(this.telemetry, vehicleTelemetryAttribute.telemetry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, vehicleName, telemetry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTelemetryAttribute {\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    telemetry: ").append(toIndentedString(telemetry)).append("\n");
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

