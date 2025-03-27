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
 * 自動運転車両の位置情報
 */

@Schema(name = "vehicles_attribute_inner_location", description = "自動運転車両の位置情報")
@JsonTypeName("vehicles_attribute_inner_location")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-28T13:39:12.345777800+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class VehiclesAttributeInnerLocation {

  private Double lat;

  private Double lng;

  private Double height;

  public VehiclesAttributeInnerLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehiclesAttributeInnerLocation(Double lat, Double lng, Double height) {
    this.lat = lat;
    this.lng = lng;
    this.height = height;
  }

  public VehiclesAttributeInnerLocation lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * 緯度
   * minimum: -90
   * maximum: 90
   * @return lat
  */
  @NotNull @DecimalMin("-90") @DecimalMax("90") 
  @Schema(name = "lat", example = "35.6242681254456", description = "緯度", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public VehiclesAttributeInnerLocation lng(Double lng) {
    this.lng = lng;
    return this;
  }

  /**
   * 経度
   * minimum: -180
   * maximum: 180
   * @return lng
  */
  @NotNull @DecimalMin("-180") @DecimalMax("180") 
  @Schema(name = "lng", example = "139.74258640456", description = "経度", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lng")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public VehiclesAttributeInnerLocation height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * 高度[m]
   * @return height
  */
  @NotNull 
  @Schema(name = "height", example = "0.01258640981", description = "高度[m]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehiclesAttributeInnerLocation vehiclesAttributeInnerLocation = (VehiclesAttributeInnerLocation) o;
    return Objects.equals(this.lat, vehiclesAttributeInnerLocation.lat) &&
        Objects.equals(this.lng, vehiclesAttributeInnerLocation.lng) &&
        Objects.equals(this.height, vehiclesAttributeInnerLocation.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehiclesAttributeInnerLocation {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

