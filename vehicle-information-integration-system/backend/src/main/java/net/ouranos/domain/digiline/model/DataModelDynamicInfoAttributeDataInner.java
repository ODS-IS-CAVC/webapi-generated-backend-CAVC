package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeDataInnerTargetInfoInner;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelDynamicInfoAttributeDataInner
 */

@JsonTypeName("dataModel_dynamicInfo_attribute_data_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelDynamicInfoAttributeDataInner {

  private String spatialID;

  @Valid
  private List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox = new ArrayList<>();

  @Valid
  private List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner> vehicleProbeInfo = new ArrayList<>();

  @Valid
  private List<@Valid DataModelDynamicInfoAttributeDataInnerTargetInfoInner> targetInfo = new ArrayList<>();

  @Valid
  private List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner> vehicleIncidentInfo = new ArrayList<>();

  public DataModelDynamicInfoAttributeDataInner spatialID(String spatialID) {
    this.spatialID = spatialID;
    return this;
  }

  /**
   * 空間ID(z/f/x/y)
   * @return spatialID
  */
  
  @Schema(name = "spatialID", example = "22/1/931369/413142", description = "空間ID(z/f/x/y)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spatialID")
  public String getSpatialID() {
    return spatialID;
  }

  public void setSpatialID(String spatialID) {
    this.spatialID = spatialID;
  }

  public DataModelDynamicInfoAttributeDataInner bbox(List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox) {
    this.bbox = bbox;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInner addBboxItem(Double bboxItem) {
    if (this.bbox == null) {
      this.bbox = new ArrayList<>();
    }
    this.bbox.add(bboxItem);
    return this;
  }

  /**
   * バウンディングボックス（矩形領域座標)データモデル。「SW(経度), SW(緯度), NE(経度), NE(緯度)」
   * @return bbox
  */
  @Size(min = 4, max = 4) 
  @Schema(name = "bbox", example = "[139.681994465,35.50676814,139.681985082,35.506773265]", description = "バウンディングボックス（矩形領域座標)データモデル。「SW(経度), SW(緯度), NE(経度), NE(緯度)」", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bbox")
  public List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> getBbox() {
    return bbox;
  }

  public void setBbox(List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox) {
    this.bbox = bbox;
  }

  public DataModelDynamicInfoAttributeDataInner vehicleProbeInfo(List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner> vehicleProbeInfo) {
    this.vehicleProbeInfo = vehicleProbeInfo;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInner addVehicleProbeInfoItem(DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner vehicleProbeInfoItem) {
    if (this.vehicleProbeInfo == null) {
      this.vehicleProbeInfo = new ArrayList<>();
    }
    this.vehicleProbeInfo.add(vehicleProbeInfoItem);
    return this;
  }

  /**
   * 車両プローブ情報
   * @return vehicleProbeInfo
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "vehicleProbeInfo", description = "車両プローブ情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleProbeInfo")
  public List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner> getVehicleProbeInfo() {
    return vehicleProbeInfo;
  }

  public void setVehicleProbeInfo(List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleProbeInfoInner> vehicleProbeInfo) {
    this.vehicleProbeInfo = vehicleProbeInfo;
  }

  public DataModelDynamicInfoAttributeDataInner targetInfo(List<@Valid DataModelDynamicInfoAttributeDataInnerTargetInfoInner> targetInfo) {
    this.targetInfo = targetInfo;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInner addTargetInfoItem(DataModelDynamicInfoAttributeDataInnerTargetInfoInner targetInfoItem) {
    if (this.targetInfo == null) {
      this.targetInfo = new ArrayList<>();
    }
    this.targetInfo.add(targetInfoItem);
    return this;
  }

  /**
   * 物標情報
   * @return targetInfo
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "targetInfo", description = "物標情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetInfo")
  public List<@Valid DataModelDynamicInfoAttributeDataInnerTargetInfoInner> getTargetInfo() {
    return targetInfo;
  }

  public void setTargetInfo(List<@Valid DataModelDynamicInfoAttributeDataInnerTargetInfoInner> targetInfo) {
    this.targetInfo = targetInfo;
  }

  public DataModelDynamicInfoAttributeDataInner vehicleIncidentInfo(List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner> vehicleIncidentInfo) {
    this.vehicleIncidentInfo = vehicleIncidentInfo;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInner addVehicleIncidentInfoItem(DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner vehicleIncidentInfoItem) {
    if (this.vehicleIncidentInfo == null) {
      this.vehicleIncidentInfo = new ArrayList<>();
    }
    this.vehicleIncidentInfo.add(vehicleIncidentInfoItem);
    return this;
  }

  /**
   * 車両インシデント情報
   * @return vehicleIncidentInfo
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "vehicleIncidentInfo", description = "車両インシデント情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleIncidentInfo")
  public List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner> getVehicleIncidentInfo() {
    return vehicleIncidentInfo;
  }

  public void setVehicleIncidentInfo(List<@Valid DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner> vehicleIncidentInfo) {
    this.vehicleIncidentInfo = vehicleIncidentInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttributeDataInner dataModelDynamicInfoAttributeDataInner = (DataModelDynamicInfoAttributeDataInner) o;
    return Objects.equals(this.spatialID, dataModelDynamicInfoAttributeDataInner.spatialID) &&
        Objects.equals(this.bbox, dataModelDynamicInfoAttributeDataInner.bbox) &&
        Objects.equals(this.vehicleProbeInfo, dataModelDynamicInfoAttributeDataInner.vehicleProbeInfo) &&
        Objects.equals(this.targetInfo, dataModelDynamicInfoAttributeDataInner.targetInfo) &&
        Objects.equals(this.vehicleIncidentInfo, dataModelDynamicInfoAttributeDataInner.vehicleIncidentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spatialID, bbox, vehicleProbeInfo, targetInfo, vehicleIncidentInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttributeDataInner {\n");
    sb.append("    spatialID: ").append(toIndentedString(spatialID)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
    sb.append("    vehicleProbeInfo: ").append(toIndentedString(vehicleProbeInfo)).append("\n");
    sb.append("    targetInfo: ").append(toIndentedString(targetInfo)).append("\n");
    sb.append("    vehicleIncidentInfo: ").append(toIndentedString(vehicleIncidentInfo)).append("\n");
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

