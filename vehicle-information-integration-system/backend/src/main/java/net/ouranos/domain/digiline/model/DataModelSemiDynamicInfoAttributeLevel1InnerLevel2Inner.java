package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner
 */

@JsonTypeName("dataModel_semiDynamicInfo_attribute_level1_inner_level2_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner {

  private String spatialID;

  @Valid
  private List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox = new ArrayList<>();

  private DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo trafficInfo;

  @Valid
  private List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner> eventRegulationInfo = new ArrayList<>();

  private DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo shelterAreaInfo;

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner spatialID(String spatialID) {
    this.spatialID = spatialID;
    return this;
  }

  /**
   * 空間ID(z/f/x/y)
   * @return spatialID
  */
  
  @Schema(name = "spatialID", example = "23/1/931369/413142", description = "空間ID(z/f/x/y)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spatialID")
  public String getSpatialID() {
    return spatialID;
  }

  public void setSpatialID(String spatialID) {
    this.spatialID = spatialID;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner bbox(List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox) {
    this.bbox = bbox;
    return this;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner addBboxItem(Double bboxItem) {
    if (this.bbox == null) {
      this.bbox = new ArrayList<>();
    }
    this.bbox.add(bboxItem);
    return this;
  }

  /**
   * 空間IDに対応するバウンディングボックス（矩形領域座標)データモデル。「SW(経度), SW(緯度), NE(経度), NE(緯度)」
   * @return bbox
  */
  @Size(min = 4, max = 4) 
  @Schema(name = "bbox", example = "[139.681994465,35.50676814,139.681985082,35.506773265]", description = "空間IDに対応するバウンディングボックス（矩形領域座標)データモデル。「SW(経度), SW(緯度), NE(経度), NE(緯度)」", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bbox")
  public List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> getBbox() {
    return bbox;
  }

  public void setBbox(List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox) {
    this.bbox = bbox;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner trafficInfo(DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo trafficInfo) {
    this.trafficInfo = trafficInfo;
    return this;
  }

  /**
   * Get trafficInfo
   * @return trafficInfo
  */
  @Valid 
  @Schema(name = "trafficInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficInfo")
  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo getTrafficInfo() {
    return trafficInfo;
  }

  public void setTrafficInfo(DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerTrafficInfo trafficInfo) {
    this.trafficInfo = trafficInfo;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner eventRegulationInfo(List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner> eventRegulationInfo) {
    this.eventRegulationInfo = eventRegulationInfo;
    return this;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner addEventRegulationInfoItem(DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner eventRegulationInfoItem) {
    if (this.eventRegulationInfo == null) {
      this.eventRegulationInfo = new ArrayList<>();
    }
    this.eventRegulationInfo.add(eventRegulationInfoItem);
    return this;
  }

  /**
   * 交通規制情報
   * @return eventRegulationInfo
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "eventRegulationInfo", description = "交通規制情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventRegulationInfo")
  public List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner> getEventRegulationInfo() {
    return eventRegulationInfo;
  }

  public void setEventRegulationInfo(List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerEventRegulationInfoInner> eventRegulationInfo) {
    this.eventRegulationInfo = eventRegulationInfo;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner shelterAreaInfo(DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo shelterAreaInfo) {
    this.shelterAreaInfo = shelterAreaInfo;
    return this;
  }

  /**
   * Get shelterAreaInfo
   * @return shelterAreaInfo
  */
  @Valid 
  @Schema(name = "shelterAreaInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shelterAreaInfo")
  public DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo getShelterAreaInfo() {
    return shelterAreaInfo;
  }

  public void setShelterAreaInfo(DataModelSemiDynamicInfoAttributeLevel1InnerLevel2InnerShelterAreaInfo shelterAreaInfo) {
    this.shelterAreaInfo = shelterAreaInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner dataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner = (DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner) o;
    return Objects.equals(this.spatialID, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner.spatialID) &&
        Objects.equals(this.bbox, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner.bbox) &&
        Objects.equals(this.trafficInfo, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner.trafficInfo) &&
        Objects.equals(this.eventRegulationInfo, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner.eventRegulationInfo) &&
        Objects.equals(this.shelterAreaInfo, dataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner.shelterAreaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spatialID, bbox, trafficInfo, eventRegulationInfo, shelterAreaInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner {\n");
    sb.append("    spatialID: ").append(toIndentedString(spatialID)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
    sb.append("    trafficInfo: ").append(toIndentedString(trafficInfo)).append("\n");
    sb.append("    eventRegulationInfo: ").append(toIndentedString(eventRegulationInfo)).append("\n");
    sb.append("    shelterAreaInfo: ").append(toIndentedString(shelterAreaInfo)).append("\n");
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

