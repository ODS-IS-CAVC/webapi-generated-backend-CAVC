package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.BusStopsAttributeInnerLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 乗降地(バス停)のデータ
 */

@Schema(name = "bus_stops_attribute_inner", description = "乗降地(バス停)のデータ")
@JsonTypeName("bus_stops_attribute_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T15:06:05.622069400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class BusStopsAttributeInner {

  private Integer busStopId;

  private String busStopName;

  private BusStopsAttributeInnerLocation location;

  public BusStopsAttributeInner busStopId(Integer busStopId) {
    this.busStopId = busStopId;
    return this;
  }

  /**
   * バス停ID
   * minimum: 1
   * maximum: 255
   * @return busStopId
  */
  @Min(1) @Max(255) 
  @Schema(name = "busStopId", example = "1", description = "バス停ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("busStopId")
  public Integer getBusStopId() {
    return busStopId;
  }

  public void setBusStopId(Integer busStopId) {
    this.busStopId = busStopId;
  }

  public BusStopsAttributeInner busStopName(String busStopName) {
    this.busStopName = busStopName;
    return this;
  }

  /**
   * バス停名
   * @return busStopName
  */
  
  @Schema(name = "busStopName", example = "FirstBusStop", description = "バス停名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("busStopName")
  public String getBusStopName() {
    return busStopName;
  }

  public void setBusStopName(String busStopName) {
    this.busStopName = busStopName;
  }

  public BusStopsAttributeInner location(BusStopsAttributeInnerLocation location) {
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
  public BusStopsAttributeInnerLocation getLocation() {
    return location;
  }

  public void setLocation(BusStopsAttributeInnerLocation location) {
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
    BusStopsAttributeInner busStopsAttributeInner = (BusStopsAttributeInner) o;
    return Objects.equals(this.busStopId, busStopsAttributeInner.busStopId) &&
        Objects.equals(this.busStopName, busStopsAttributeInner.busStopName) &&
        Objects.equals(this.location, busStopsAttributeInner.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(busStopId, busStopName, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusStopsAttributeInner {\n");
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

