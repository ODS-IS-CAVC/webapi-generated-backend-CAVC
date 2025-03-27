package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelSemiDynamicInfoAttributeLevel1Inner
 */

@JsonTypeName("dataModel_semiDynamicInfo_attribute_level1_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeLevel1Inner {

  private String spatialID;

  @Valid
  private List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox = new ArrayList<>();

  private DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo weatherInfo;

  @Valid
  private List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner> level2 = new ArrayList<>();

  public DataModelSemiDynamicInfoAttributeLevel1Inner spatialID(String spatialID) {
    this.spatialID = spatialID;
    return this;
  }

  /**
   * 空間ID(z/f/x/y)
   * @return spatialID
  */
  
  @Schema(name = "spatialID", example = "18/1/931369/413142", description = "空間ID(z/f/x/y)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spatialID")
  public String getSpatialID() {
    return spatialID;
  }

  public void setSpatialID(String spatialID) {
    this.spatialID = spatialID;
  }

  public DataModelSemiDynamicInfoAttributeLevel1Inner bbox(List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true)Double> bbox) {
    this.bbox = bbox;
    return this;
  }

  public DataModelSemiDynamicInfoAttributeLevel1Inner addBboxItem(Double bboxItem) {
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

  public DataModelSemiDynamicInfoAttributeLevel1Inner weatherInfo(DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo weatherInfo) {
    this.weatherInfo = weatherInfo;
    return this;
  }

  /**
   * Get weatherInfo
   * @return weatherInfo
  */
  @Valid 
  @Schema(name = "weatherInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherInfo")
  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo getWeatherInfo() {
    return weatherInfo;
  }

  public void setWeatherInfo(DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo weatherInfo) {
    this.weatherInfo = weatherInfo;
  }

  public DataModelSemiDynamicInfoAttributeLevel1Inner level2(List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner> level2) {
    this.level2 = level2;
    return this;
  }

  public DataModelSemiDynamicInfoAttributeLevel1Inner addLevel2Item(DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner level2Item) {
    if (this.level2 == null) {
      this.level2 = new ArrayList<>();
    }
    this.level2.add(level2Item);
    return this;
  }

  /**
   * 検索内容レベル2
   * @return level2
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "level2", description = "検索内容レベル2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level2")
  public List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner> getLevel2() {
    return level2;
  }

  public void setLevel2(List<@Valid DataModelSemiDynamicInfoAttributeLevel1InnerLevel2Inner> level2) {
    this.level2 = level2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeLevel1Inner dataModelSemiDynamicInfoAttributeLevel1Inner = (DataModelSemiDynamicInfoAttributeLevel1Inner) o;
    return Objects.equals(this.spatialID, dataModelSemiDynamicInfoAttributeLevel1Inner.spatialID) &&
        Objects.equals(this.bbox, dataModelSemiDynamicInfoAttributeLevel1Inner.bbox) &&
        Objects.equals(this.weatherInfo, dataModelSemiDynamicInfoAttributeLevel1Inner.weatherInfo) &&
        Objects.equals(this.level2, dataModelSemiDynamicInfoAttributeLevel1Inner.level2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spatialID, bbox, weatherInfo, level2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeLevel1Inner {\n");
    sb.append("    spatialID: ").append(toIndentedString(spatialID)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
    sb.append("    weatherInfo: ").append(toIndentedString(weatherInfo)).append("\n");
    sb.append("    level2: ").append(toIndentedString(level2)).append("\n");
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

