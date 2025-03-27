package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.RoutesAttributePointsInnerLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RoutesAttributePointsInner
 */

@JsonTypeName("routes_attribute_points_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class RoutesAttributePointsInner {

  private RoutesAttributePointsInnerLocation location;

  public RoutesAttributePointsInner location(RoutesAttributePointsInnerLocation location) {
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
  public RoutesAttributePointsInnerLocation getLocation() {
    return location;
  }

  public void setLocation(RoutesAttributePointsInnerLocation location) {
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
    RoutesAttributePointsInner routesAttributePointsInner = (RoutesAttributePointsInner) o;
    return Objects.equals(this.location, routesAttributePointsInner.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutesAttributePointsInner {\n");
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

