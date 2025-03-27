package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.ouranos.domain.digiline.model.RoutesAttributePointsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * データモデル要素
 */

@Schema(name = "routes_attribute", description = "データモデル要素")
@JsonTypeName("routes_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class RoutesAttribute {

  private UUID routeId;

  @Valid
  private List<@Valid RoutesAttributePointsInner> points = new ArrayList<>();

  private BigDecimal etaSec;

  private BigDecimal distanceMeters;

  public RoutesAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RoutesAttribute(UUID routeId, List<@Valid RoutesAttributePointsInner> points, BigDecimal etaSec, BigDecimal distanceMeters) {
    this.routeId = routeId;
    this.points = points;
    this.etaSec = etaSec;
    this.distanceMeters = distanceMeters;
  }

  public RoutesAttribute routeId(UUID routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * ルートID
   * @return routeId
  */
  @NotNull @Valid
  @Schema(name = "routeId", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "ルートID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("routeId")
  public UUID getRouteId() {
    return routeId;
  }

  public void setRouteId(UUID routeId) {
    this.routeId = routeId;
  }

  public RoutesAttribute points(List<@Valid RoutesAttributePointsInner> points) {
    this.points = points;
    return this;
  }

  public RoutesAttribute addPointsItem(RoutesAttributePointsInner pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * ルートの開始から終了までの走行ポイント配列
   * @return points
  */
  @NotNull @Valid @Size(min = 0, max = 100) 
  @Schema(name = "points", description = "ルートの開始から終了までの走行ポイント配列", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("points")
  public List<@Valid RoutesAttributePointsInner> getPoints() {
    return points;
  }

  public void setPoints(List<@Valid RoutesAttributePointsInner> points) {
    this.points = points;
  }

  public RoutesAttribute etaSec(BigDecimal etaSec) {
    this.etaSec = etaSec;
    return this;
  }

  /**
   * ルートの走行の予想時間[s]
   * @return etaSec
  */
  @NotNull @Valid 
  @Schema(name = "etaSec", example = "60", description = "ルートの走行の予想時間[s]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("etaSec")
  public BigDecimal getEtaSec() {
    return etaSec;
  }

  public void setEtaSec(BigDecimal etaSec) {
    this.etaSec = etaSec;
  }

  public RoutesAttribute distanceMeters(BigDecimal distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

  /**
   * ルートの走行距離[m]
   * @return distanceMeters
  */
  @NotNull @Valid 
  @Schema(name = "distanceMeters", example = "600", description = "ルートの走行距離[m]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("distanceMeters")
  public BigDecimal getDistanceMeters() {
    return distanceMeters;
  }

  public void setDistanceMeters(BigDecimal distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutesAttribute routesAttribute = (RoutesAttribute) o;
    return Objects.equals(this.routeId, routesAttribute.routeId) &&
        Objects.equals(this.points, routesAttribute.points) &&
        Objects.equals(this.etaSec, routesAttribute.etaSec) &&
        Objects.equals(this.distanceMeters, routesAttribute.distanceMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeId, points, etaSec, distanceMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutesAttribute {\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    etaSec: ").append(toIndentedString(etaSec)).append("\n");
    sb.append("    distanceMeters: ").append(toIndentedString(distanceMeters)).append("\n");
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

