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
 * DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_car_info_inner_vehicle_avb_resource_inner_cut_off_info_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner {

  private String cutOffTime;

  private String cutOffFee;

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner cutOffTime(String cutOffTime) {
    this.cutOffTime = cutOffTime;
    return this;
  }

  /**
   * カットオフ時間
   * @return cutOffTime
  */
  
  @Schema(name = "cut_off_time", description = "カットオフ時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cut_off_time")
  public String getCutOffTime() {
    return cutOffTime;
  }

  public void setCutOffTime(String cutOffTime) {
    this.cutOffTime = cutOffTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner cutOffFee(String cutOffFee) {
    this.cutOffFee = cutOffFee;
    return this;
  }

  /**
   * カットオフ料金
   * @return cutOffFee
  */
  
  @Schema(name = "cut_off_fee", description = "カットオフ料金", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cut_off_fee")
  public String getCutOffFee() {
    return cutOffFee;
  }

  public void setCutOffFee(String cutOffFee) {
    this.cutOffFee = cutOffFee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner) o;
    return Objects.equals(this.cutOffTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner.cutOffTime) &&
        Objects.equals(this.cutOffFee, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner.cutOffFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cutOffTime, cutOffFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner {\n");
    sb.append("    cutOffTime: ").append(toIndentedString(cutOffTime)).append("\n");
    sb.append("    cutOffFee: ").append(toIndentedString(cutOffFee)).append("\n");
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

