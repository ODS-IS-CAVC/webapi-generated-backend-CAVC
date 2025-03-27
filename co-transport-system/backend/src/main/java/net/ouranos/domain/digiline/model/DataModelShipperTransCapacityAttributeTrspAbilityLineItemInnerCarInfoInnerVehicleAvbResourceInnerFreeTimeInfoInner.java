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
 * DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_car_info_inner_vehicle_avb_resource_inner_free_time_info_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner {

  private String freeTime;

  private String freeTimeFee;

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner freeTime(String freeTime) {
    this.freeTime = freeTime;
    return this;
  }

  /**
   * フリータイム時間
   * @return freeTime
  */
  
  @Schema(name = "free_time", description = "フリータイム時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_time")
  public String getFreeTime() {
    return freeTime;
  }

  public void setFreeTime(String freeTime) {
    this.freeTime = freeTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner freeTimeFee(String freeTimeFee) {
    this.freeTimeFee = freeTimeFee;
    return this;
  }

  /**
   * フリータイム料金
   * @return freeTimeFee
  */
  
  @Schema(name = "free_time_fee", description = "フリータイム料金", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_time_fee")
  public String getFreeTimeFee() {
    return freeTimeFee;
  }

  public void setFreeTimeFee(String freeTimeFee) {
    this.freeTimeFee = freeTimeFee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner) o;
    return Objects.equals(this.freeTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner.freeTime) &&
        Objects.equals(this.freeTimeFee, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner.freeTimeFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeTime, freeTimeFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner {\n");
    sb.append("    freeTime: ").append(toIndentedString(freeTime)).append("\n");
    sb.append("    freeTimeFee: ").append(toIndentedString(freeTimeFee)).append("\n");
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

