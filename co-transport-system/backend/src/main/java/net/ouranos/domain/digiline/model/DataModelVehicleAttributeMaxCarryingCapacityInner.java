package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelVehicleAttributeMaxCarryingCapacityInner
 */

@JsonTypeName("dataModel_vehicle_attribute_max_carrying_capacity_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:52:03.745534400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class DataModelVehicleAttributeMaxCarryingCapacityInner {

  private String packageCode;

  private String packageNameKanji;

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal depth;

  private String dimensionUnitCode;

  private BigDecimal maxLoadQuantity;

  public DataModelVehicleAttributeMaxCarryingCapacityInner packageCode(String packageCode) {
    this.packageCode = packageCode;
    return this;
  }

  /**
   * 荷姿コード
   * @return packageCode
  */
  
  @Schema(name = "package_code", description = "荷姿コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package_code")
  public String getPackageCode() {
    return packageCode;
  }

  public void setPackageCode(String packageCode) {
    this.packageCode = packageCode;
  }

  public DataModelVehicleAttributeMaxCarryingCapacityInner packageNameKanji(String packageNameKanji) {
    this.packageNameKanji = packageNameKanji;
    return this;
  }

  /**
   * 荷姿名（漢字）
   * @return packageNameKanji
  */
  
  @Schema(name = "package_name_kanji", description = "荷姿名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package_name_kanji")
  public String getPackageNameKanji() {
    return packageNameKanji;
  }

  public void setPackageNameKanji(String packageNameKanji) {
    this.packageNameKanji = packageNameKanji;
  }

  public DataModelVehicleAttributeMaxCarryingCapacityInner width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * 幅
   * @return width
  */
  @Valid 
  @Schema(name = "width", description = "幅", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public DataModelVehicleAttributeMaxCarryingCapacityInner height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * 高さ
   * @return height
  */
  @Valid 
  @Schema(name = "height", description = "高さ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public DataModelVehicleAttributeMaxCarryingCapacityInner depth(BigDecimal depth) {
    this.depth = depth;
    return this;
  }

  /**
   * 奥行き
   * @return depth
  */
  @Valid 
  @Schema(name = "depth", description = "奥行き", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("depth")
  public BigDecimal getDepth() {
    return depth;
  }

  public void setDepth(BigDecimal depth) {
    this.depth = depth;
  }

  public DataModelVehicleAttributeMaxCarryingCapacityInner dimensionUnitCode(String dimensionUnitCode) {
    this.dimensionUnitCode = dimensionUnitCode;
    return this;
  }

  /**
   * 寸法単位コード
   * @return dimensionUnitCode
  */
  
  @Schema(name = "dimension_unit_code", description = "寸法単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimension_unit_code")
  public String getDimensionUnitCode() {
    return dimensionUnitCode;
  }

  public void setDimensionUnitCode(String dimensionUnitCode) {
    this.dimensionUnitCode = dimensionUnitCode;
  }

  public DataModelVehicleAttributeMaxCarryingCapacityInner maxLoadQuantity(BigDecimal maxLoadQuantity) {
    this.maxLoadQuantity = maxLoadQuantity;
    return this;
  }

  /**
   * 最大積載数
   * @return maxLoadQuantity
  */
  @Valid 
  @Schema(name = "max_load_quantity", description = "最大積載数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_load_quantity")
  public BigDecimal getMaxLoadQuantity() {
    return maxLoadQuantity;
  }

  public void setMaxLoadQuantity(BigDecimal maxLoadQuantity) {
    this.maxLoadQuantity = maxLoadQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelVehicleAttributeMaxCarryingCapacityInner dataModelVehicleAttributeMaxCarryingCapacityInner = (DataModelVehicleAttributeMaxCarryingCapacityInner) o;
    return Objects.equals(this.packageCode, dataModelVehicleAttributeMaxCarryingCapacityInner.packageCode) &&
        Objects.equals(this.packageNameKanji, dataModelVehicleAttributeMaxCarryingCapacityInner.packageNameKanji) &&
        Objects.equals(this.width, dataModelVehicleAttributeMaxCarryingCapacityInner.width) &&
        Objects.equals(this.height, dataModelVehicleAttributeMaxCarryingCapacityInner.height) &&
        Objects.equals(this.depth, dataModelVehicleAttributeMaxCarryingCapacityInner.depth) &&
        Objects.equals(this.dimensionUnitCode, dataModelVehicleAttributeMaxCarryingCapacityInner.dimensionUnitCode) &&
        Objects.equals(this.maxLoadQuantity, dataModelVehicleAttributeMaxCarryingCapacityInner.maxLoadQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageCode, packageNameKanji, width, height, depth, dimensionUnitCode, maxLoadQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleAttributeMaxCarryingCapacityInner {\n");
    sb.append("    packageCode: ").append(toIndentedString(packageCode)).append("\n");
    sb.append("    packageNameKanji: ").append(toIndentedString(packageNameKanji)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    dimensionUnitCode: ").append(toIndentedString(dimensionUnitCode)).append("\n");
    sb.append("    maxLoadQuantity: ").append(toIndentedString(maxLoadQuantity)).append("\n");
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

