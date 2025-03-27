package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Location where the event occurred
 */

@Schema(name = "TrspLocation", description = "Location where the event occurred")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrspLocation {

  private Double lat;

  private Double lon;

  public TrspLocation lat(Double lat) {
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

  public TrspLocation lon(Double lon) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrspLocation trspLocation = (TrspLocation) o;
    return Objects.equals(this.lat, trspLocation.lat) &&
        Objects.equals(this.lon, trspLocation.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrspLocation {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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

