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
 * DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner
 */

@JsonTypeName("dataModel_sensorInfo_attribute_sensorAttributeInfo_inner_sensorDetectionRangeInfo_inner_verticesPos_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner {

  private Integer verticesLat;

  private Integer verticesLon;

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner(Integer verticesLat, Integer verticesLon) {
    this.verticesLat = verticesLat;
    this.verticesLon = verticesLon;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner verticesLat(Integer verticesLat) {
    this.verticesLat = verticesLat;
    return this;
  }

  /**
   * 計測系はWGS84．頂点緯度(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return verticesLat
  */
  @NotNull @Min(-2147483648) @Max(900000000) 
  @Schema(name = "verticesLat", example = "123456789", description = "計測系はWGS84．頂点緯度(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("verticesLat")
  public Integer getVerticesLat() {
    return verticesLat;
  }

  public void setVerticesLat(Integer verticesLat) {
    this.verticesLat = verticesLat;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner verticesLon(Integer verticesLon) {
    this.verticesLon = verticesLon;
    return this;
  }

  /**
   * 計測系はWGS84．頂点経度(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return verticesLon
  */
  @NotNull @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "verticesLon", example = "1234567890", description = "計測系はWGS84．頂点経度(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("verticesLon")
  public Integer getVerticesLon() {
    return verticesLon;
  }

  public void setVerticesLon(Integer verticesLon) {
    this.verticesLon = verticesLon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner = (DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner) o;
    return Objects.equals(this.verticesLat, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner.verticesLat) &&
        Objects.equals(this.verticesLon, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner.verticesLon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verticesLat, verticesLon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner {\n");
    sb.append("    verticesLat: ").append(toIndentedString(verticesLat)).append("\n");
    sb.append("    verticesLon: ").append(toIndentedString(verticesLon)).append("\n");
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

