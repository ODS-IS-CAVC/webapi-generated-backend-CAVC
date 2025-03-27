package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.DataModelTrspAbilityLineItemAttributeCarInfo;
import net.ouranos.domain.digiline.model.DataModelTrspAbilityLineItemAttributeRoadCarr;
import net.ouranos.domain.digiline.model.DataModelTrspAbilityLineItemAttributeVehicleAvbResource;
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

@Schema(name = "dataModel_trsp_ability_line_item_attribute", description = "データモデル要素")
@JsonTypeName("dataModel_trsp_ability_line_item_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-13T16:38:12.592317500+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelTrspAbilityLineItemAttribute {

  private DataModelTrspAbilityLineItemAttributeRoadCarr roadCarr;

  private DataModelTrspAbilityLineItemAttributeCarInfo carInfo;

  private DataModelTrspAbilityLineItemAttributeVehicleAvbResource vehicleAvbResource;

  public DataModelTrspAbilityLineItemAttribute roadCarr(DataModelTrspAbilityLineItemAttributeRoadCarr roadCarr) {
    this.roadCarr = roadCarr;
    return this;
  }

  /**
   * Get roadCarr
   * @return roadCarr
  */
  @Valid 
  @Schema(name = "road_carr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr")
  public DataModelTrspAbilityLineItemAttributeRoadCarr getRoadCarr() {
    return roadCarr;
  }

  public void setRoadCarr(DataModelTrspAbilityLineItemAttributeRoadCarr roadCarr) {
    this.roadCarr = roadCarr;
  }

  public DataModelTrspAbilityLineItemAttribute carInfo(DataModelTrspAbilityLineItemAttributeCarInfo carInfo) {
    this.carInfo = carInfo;
    return this;
  }

  /**
   * Get carInfo
   * @return carInfo
  */
  @Valid 
  @Schema(name = "car_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_info")
  public DataModelTrspAbilityLineItemAttributeCarInfo getCarInfo() {
    return carInfo;
  }

  public void setCarInfo(DataModelTrspAbilityLineItemAttributeCarInfo carInfo) {
    this.carInfo = carInfo;
  }

  public DataModelTrspAbilityLineItemAttribute vehicleAvbResource(DataModelTrspAbilityLineItemAttributeVehicleAvbResource vehicleAvbResource) {
    this.vehicleAvbResource = vehicleAvbResource;
    return this;
  }

  /**
   * Get vehicleAvbResource
   * @return vehicleAvbResource
  */
  @Valid 
  @Schema(name = "vehicle_avb_resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicle_avb_resource")
  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource getVehicleAvbResource() {
    return vehicleAvbResource;
  }

  public void setVehicleAvbResource(DataModelTrspAbilityLineItemAttributeVehicleAvbResource vehicleAvbResource) {
    this.vehicleAvbResource = vehicleAvbResource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTrspAbilityLineItemAttribute dataModelTrspAbilityLineItemAttribute = (DataModelTrspAbilityLineItemAttribute) o;
    return Objects.equals(this.roadCarr, dataModelTrspAbilityLineItemAttribute.roadCarr) &&
        Objects.equals(this.carInfo, dataModelTrspAbilityLineItemAttribute.carInfo) &&
        Objects.equals(this.vehicleAvbResource, dataModelTrspAbilityLineItemAttribute.vehicleAvbResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roadCarr, carInfo, vehicleAvbResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTrspAbilityLineItemAttribute {\n");
    sb.append("    roadCarr: ").append(toIndentedString(roadCarr)).append("\n");
    sb.append("    carInfo: ").append(toIndentedString(carInfo)).append("\n");
    sb.append("    vehicleAvbResource: ").append(toIndentedString(vehicleAvbResource)).append("\n");
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

