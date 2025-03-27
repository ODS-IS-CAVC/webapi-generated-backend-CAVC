package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.VehicleSchedulesAttributeVehicleScheduleTasksInnerOriginLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 走行開始地点の乗降地(バス停)のデータ
 */

@Schema(name = "vehicle_schedules_attribute_vehicleScheduleTasks_inner_origin", description = "走行開始地点の乗降地(バス停)のデータ")
@JsonTypeName("vehicle_schedules_attribute_vehicleScheduleTasks_inner_origin")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin {

  private Integer busStopId;

  private String busStopName;

  private VehicleSchedulesAttributeVehicleScheduleTasksInnerOriginLocation location;

  public VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin busStopId(Integer busStopId) {
    this.busStopId = busStopId;
    return this;
  }

  /**
   * バス停ID
   * @return busStopId
  */
  
  @Schema(name = "busStopId", example = "1", description = "バス停ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("busStopId")
  public Integer getBusStopId() {
    return busStopId;
  }

  public void setBusStopId(Integer busStopId) {
    this.busStopId = busStopId;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin busStopName(String busStopName) {
    this.busStopName = busStopName;
    return this;
  }

  /**
   * バス停名
   * @return busStopName
  */
  
  @Schema(name = "busStopName", example = "BusStop1", description = "バス停名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("busStopName")
  public String getBusStopName() {
    return busStopName;
  }

  public void setBusStopName(String busStopName) {
    this.busStopName = busStopName;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin location(VehicleSchedulesAttributeVehicleScheduleTasksInnerOriginLocation location) {
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
  public VehicleSchedulesAttributeVehicleScheduleTasksInnerOriginLocation getLocation() {
    return location;
  }

  public void setLocation(VehicleSchedulesAttributeVehicleScheduleTasksInnerOriginLocation location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin vehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin = (VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin) o;
    return Objects.equals(this.busStopId, vehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin.busStopId) &&
        Objects.equals(this.busStopName, vehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin.busStopName) &&
        Objects.equals(this.location, vehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(busStopId, busStopName, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin {\n");
    sb.append("    busStopId: ").append(toIndentedString(busStopId)).append("\n");
    sb.append("    busStopName: ").append(toIndentedString(busStopName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

