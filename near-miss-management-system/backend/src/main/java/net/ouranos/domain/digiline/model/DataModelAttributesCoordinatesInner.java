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
 * DataModelAttributesCoordinatesInner
 */

@JsonTypeName("dataModel_attributes_coordinates_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T11:39:44.592576100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelAttributesCoordinatesInner {

  private Double lat;

  private Double lon;

  private Double alt;

  public DataModelAttributesCoordinatesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelAttributesCoordinatesInner(Double lat, Double lon) {
    this.lat = lat;
    this.lon = lon;
  }

  public DataModelAttributesCoordinatesInner lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * 緯度[degree]
   * minimum: -90.0
   * maximum: 90.0
   * @return lat
   */
  @NotNull @DecimalMin("-90.0") @DecimalMax("90.0") 
  @Schema(name = "lat", example = "35.66104767541138", description = "緯度[degree]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public DataModelAttributesCoordinatesInner lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * 経度[degree]
   * minimum: -180.0
   * maximum: 180.0
   * @return lon
   */
  @NotNull @DecimalMin("-180.0") @DecimalMax("180.0") 
  @Schema(name = "lon", example = "139.70993603470313", description = "経度[degree]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public DataModelAttributesCoordinatesInner alt(Double alt) {
    this.alt = alt;
    return this;
  }

  /**
   * 標高[m]
   * minimum: -1.0E+7
   * maximum: 1.0E+7
   * @return alt
   */
  @DecimalMin("-1.0E+7") @DecimalMax("1.0E+7") 
  @Schema(name = "alt", example = "34.4", description = "標高[m]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt")
  public Double getAlt() {
    return alt;
  }

  public void setAlt(Double alt) {
    this.alt = alt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelAttributesCoordinatesInner dataModelAttributesCoordinatesInner = (DataModelAttributesCoordinatesInner) o;
    return Objects.equals(this.lat, dataModelAttributesCoordinatesInner.lat) &&
        Objects.equals(this.lon, dataModelAttributesCoordinatesInner.lon) &&
        Objects.equals(this.alt, dataModelAttributesCoordinatesInner.alt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon, alt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelAttributesCoordinatesInner {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
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

