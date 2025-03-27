package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner
 */

@JsonTypeName("dataModel_sensorInfo_attribute_sensorAttributeInfo_inner_sensorDetectionRangeInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner {

  private Integer detectionRangeID;

  private Integer undetectableRate;

  private Integer vertices;

  @Valid
  private List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner> verticesPos = new ArrayList<>();

  private Integer detectableObjectType;

  private Integer detectionReliability;

  private Integer detectionLimitObjectSize;

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner(Integer detectionRangeID, Integer vertices, List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner> verticesPos, Integer detectableObjectType, Integer detectionReliability, Integer detectionLimitObjectSize) {
    this.detectionRangeID = detectionRangeID;
    this.vertices = vertices;
    this.verticesPos = verticesPos;
    this.detectableObjectType = detectableObjectType;
    this.detectionReliability = detectionReliability;
    this.detectionLimitObjectSize = detectionLimitObjectSize;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner detectionRangeID(Integer detectionRangeID) {
    this.detectionRangeID = detectionRangeID;
    return this;
  }

  /**
   * 検出範囲ID
   * minimum: 1
   * maximum: 16
   * @return detectionRangeID
  */
  @NotNull @Min(1) @Max(16) 
  @Schema(name = "detectionRangeID", example = "4", description = "検出範囲ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectionRangeID")
  public Integer getDetectionRangeID() {
    return detectionRangeID;
  }

  public void setDetectionRangeID(Integer detectionRangeID) {
    this.detectionRangeID = detectionRangeID;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner undetectableRate(Integer undetectableRate) {
    this.undetectableRate = undetectableRate;
    return this;
  }

  /**
   * センサの物体未検出率(分解能: 2.59e-11 ~ 0.206)
   * minimum: 1
   * maximum: 255
   * @return undetectableRate
  */
  @Min(1) @Max(255) 
  @Schema(name = "undetectableRate", example = "1", description = "センサの物体未検出率(分解能: 2.59e-11 ~ 0.206)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("undetectableRate")
  public Integer getUndetectableRate() {
    return undetectableRate;
  }

  public void setUndetectableRate(Integer undetectableRate) {
    this.undetectableRate = undetectableRate;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner vertices(Integer vertices) {
    this.vertices = vertices;
    return this;
  }

  /**
   * 検出範囲を表現する頂点数
   * minimum: 1
   * maximum: 16
   * @return vertices
  */
  @NotNull @Min(1) @Max(16) 
  @Schema(name = "vertices", example = "5", description = "検出範囲を表現する頂点数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vertices")
  public Integer getVertices() {
    return vertices;
  }

  public void setVertices(Integer vertices) {
    this.vertices = vertices;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner verticesPos(List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner> verticesPos) {
    this.verticesPos = verticesPos;
    return this;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner addVerticesPosItem(DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner verticesPosItem) {
    if (this.verticesPos == null) {
      this.verticesPos = new ArrayList<>();
    }
    this.verticesPos.add(verticesPosItem);
    return this;
  }

  /**
   * Get verticesPos
   * @return verticesPos
  */
  @NotNull @Valid @Size(min = 1, max = 16) 
  @Schema(name = "verticesPos", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("verticesPos")
  public List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner> getVerticesPos() {
    return verticesPos;
  }

  public void setVerticesPos(List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInnerVerticesPosInner> verticesPos) {
    this.verticesPos = verticesPos;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner detectableObjectType(Integer detectableObjectType) {
    this.detectableObjectType = detectableObjectType;
    return this;
  }

  /**
   * 検知可能な物体の種別
   * minimum: 0
   * maximum: 255
   * @return detectableObjectType
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "detectableObjectType", example = "0", description = "検知可能な物体の種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectableObjectType")
  public Integer getDetectableObjectType() {
    return detectableObjectType;
  }

  public void setDetectableObjectType(Integer detectableObjectType) {
    this.detectableObjectType = detectableObjectType;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner detectionReliability(Integer detectionReliability) {
    this.detectionReliability = detectionReliability;
    return this;
  }

  /**
   * センサーの検知領域内で検知限界物標サイズより大きい物標の存在を検知できる確率
   * minimum: 0
   * maximum: 101
   * @return detectionReliability
  */
  @NotNull @Min(0) @Max(101) 
  @Schema(name = "detectionReliability", example = "100", description = "センサーの検知領域内で検知限界物標サイズより大きい物標の存在を検知できる確率", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectionReliability")
  public Integer getDetectionReliability() {
    return detectionReliability;
  }

  public void setDetectionReliability(Integer detectionReliability) {
    this.detectionReliability = detectionReliability;
  }

  public DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner detectionLimitObjectSize(Integer detectionLimitObjectSize) {
    this.detectionLimitObjectSize = detectionLimitObjectSize;
    return this;
  }

  /**
   * センサーの検知領域内でこのサイズ以下の物標は見落とす可能性があるというサイズ
   * minimum: 0
   * maximum: 65535
   * @return detectionLimitObjectSize
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "detectionLimitObjectSize", example = "12345", description = "センサーの検知領域内でこのサイズ以下の物標は見落とす可能性があるというサイズ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectionLimitObjectSize")
  public Integer getDetectionLimitObjectSize() {
    return detectionLimitObjectSize;
  }

  public void setDetectionLimitObjectSize(Integer detectionLimitObjectSize) {
    this.detectionLimitObjectSize = detectionLimitObjectSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner = (DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner) o;
    return Objects.equals(this.detectionRangeID, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.detectionRangeID) &&
        Objects.equals(this.undetectableRate, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.undetectableRate) &&
        Objects.equals(this.vertices, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.vertices) &&
        Objects.equals(this.verticesPos, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.verticesPos) &&
        Objects.equals(this.detectableObjectType, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.detectableObjectType) &&
        Objects.equals(this.detectionReliability, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.detectionReliability) &&
        Objects.equals(this.detectionLimitObjectSize, dataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner.detectionLimitObjectSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectionRangeID, undetectableRate, vertices, verticesPos, detectableObjectType, detectionReliability, detectionLimitObjectSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSensorInfoAttributeSensorAttributeInfoInnerSensorDetectionRangeInfoInner {\n");
    sb.append("    detectionRangeID: ").append(toIndentedString(detectionRangeID)).append("\n");
    sb.append("    undetectableRate: ").append(toIndentedString(undetectableRate)).append("\n");
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
    sb.append("    verticesPos: ").append(toIndentedString(verticesPos)).append("\n");
    sb.append("    detectableObjectType: ").append(toIndentedString(detectableObjectType)).append("\n");
    sb.append("    detectionReliability: ").append(toIndentedString(detectionReliability)).append("\n");
    sb.append("    detectionLimitObjectSize: ").append(toIndentedString(detectionLimitObjectSize)).append("\n");
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

