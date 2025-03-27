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
 * DataModelVehicleAttributeHazardousMaterialInfoInner
 */

@JsonTypeName("dataModel_vehicle_attribute_hazardous_material_info_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:52:03.745534400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class DataModelVehicleAttributeHazardousMaterialInfoInner {

  private String hazardousMaterialItemCode;

  private String hazardousMaterialTextInfo;

  public DataModelVehicleAttributeHazardousMaterialInfoInner hazardousMaterialItemCode(String hazardousMaterialItemCode) {
    this.hazardousMaterialItemCode = hazardousMaterialItemCode;
    return this;
  }

  /**
   * 危険物積載物品名コード
   * @return hazardousMaterialItemCode
  */
  
  @Schema(name = "hazardous_material_item_code", description = "危険物積載物品名コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardous_material_item_code")
  public String getHazardousMaterialItemCode() {
    return hazardousMaterialItemCode;
  }

  public void setHazardousMaterialItemCode(String hazardousMaterialItemCode) {
    this.hazardousMaterialItemCode = hazardousMaterialItemCode;
  }

  public DataModelVehicleAttributeHazardousMaterialInfoInner hazardousMaterialTextInfo(String hazardousMaterialTextInfo) {
    this.hazardousMaterialTextInfo = hazardousMaterialTextInfo;
    return this;
  }

  /**
   * 危険物文字情報
   * @return hazardousMaterialTextInfo
  */
  
  @Schema(name = "hazardous_material_text_info", description = "危険物文字情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardous_material_text_info")
  public String getHazardousMaterialTextInfo() {
    return hazardousMaterialTextInfo;
  }

  public void setHazardousMaterialTextInfo(String hazardousMaterialTextInfo) {
    this.hazardousMaterialTextInfo = hazardousMaterialTextInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelVehicleAttributeHazardousMaterialInfoInner dataModelVehicleAttributeHazardousMaterialInfoInner = (DataModelVehicleAttributeHazardousMaterialInfoInner) o;
    return Objects.equals(this.hazardousMaterialItemCode, dataModelVehicleAttributeHazardousMaterialInfoInner.hazardousMaterialItemCode) &&
        Objects.equals(this.hazardousMaterialTextInfo, dataModelVehicleAttributeHazardousMaterialInfoInner.hazardousMaterialTextInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hazardousMaterialItemCode, hazardousMaterialTextInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleAttributeHazardousMaterialInfoInner {\n");
    sb.append("    hazardousMaterialItemCode: ").append(toIndentedString(hazardousMaterialItemCode)).append("\n");
    sb.append("    hazardousMaterialTextInfo: ").append(toIndentedString(hazardousMaterialTextInfo)).append("\n");
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

