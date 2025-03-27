package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 自動運転車両のスケジュールのデータモデル
 */

@Schema(name = "vehicle_schedule_attribute", description = "自動運転車両のスケジュールのデータモデル")
@JsonTypeName("vehicle_schedule_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-30T11:12:45.058018800+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class VehicleScheduleAttribute {

  private UUID vehicleId;

  @Valid
  private List<Integer> destinationPoints = new ArrayList<>();

  public VehicleScheduleAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleScheduleAttribute(UUID vehicleId, List<Integer> destinationPoints) {
    this.vehicleId = vehicleId;
    this.destinationPoints = destinationPoints;
  }

  public VehicleScheduleAttribute vehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * 自度運転車両のID
   * @return vehicleId
  */
  @NotNull @Valid
  @Schema(name = "vehicleId", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "自度運転車両のID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleId")
  public UUID getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehicleScheduleAttribute destinationPoints(List<Integer> destinationPoints) {
    this.destinationPoints = destinationPoints;
    return this;
  }

  public VehicleScheduleAttribute addDestinationPointsItem(Integer destinationPointsItem) {
    if (this.destinationPoints == null) {
      this.destinationPoints = new ArrayList<>();
    }
    this.destinationPoints.add(destinationPointsItem);
    return this;
  }

  /**
   * 目的地のバス停IDの配列
   * @return destinationPoints
  */
  @NotNull @Size(min = 1, max = 10) 
  @Schema(name = "destinationPoints", description = "目的地のバス停IDの配列", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("destinationPoints")
  public List<Integer> getDestinationPoints() {
    return destinationPoints;
  }

  public void setDestinationPoints(List<Integer> destinationPoints) {
    this.destinationPoints = destinationPoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleScheduleAttribute vehicleScheduleAttribute = (VehicleScheduleAttribute) o;
    return Objects.equals(this.vehicleId, vehicleScheduleAttribute.vehicleId) &&
        Objects.equals(this.destinationPoints, vehicleScheduleAttribute.destinationPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, destinationPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleScheduleAttribute {\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    destinationPoints: ").append(toIndentedString(destinationPoints)).append("\n");
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

