package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
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

@Schema(name = "dataModel_trsp_ability_line_item_attribute_vehicle_avb_resource", description = "データモデル要素")
@JsonTypeName("dataModel_trsp_ability_line_item_attribute_vehicle_avb_resource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-13T16:38:12.592317500+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelTrspAbilityLineItemAttributeVehicleAvbResource {

  private String trspOpStrtAreaLineOneTxt;

  private String trspOpEndAreaLineOneTxt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate trspOpDateTrmStrtDate;

  private String trspOpPlanDateTrmStrtTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate trspOpDateTrmEndDate;

  private String trspOpPlanDateTrmEndTime;

  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource trspOpStrtAreaLineOneTxt(String trspOpStrtAreaLineOneTxt) {
    this.trspOpStrtAreaLineOneTxt = trspOpStrtAreaLineOneTxt;
    return this;
  }

  /**
   * 運行開始地域
   * @return trspOpStrtAreaLineOneTxt
  */
  @Size(min = 1, max = 20) 
  @Schema(name = "trsp_op_strt_area_line_one_txt", description = "運行開始地域", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_strt_area_line_one_txt")
  public String getTrspOpStrtAreaLineOneTxt() {
    return trspOpStrtAreaLineOneTxt;
  }

  public void setTrspOpStrtAreaLineOneTxt(String trspOpStrtAreaLineOneTxt) {
    this.trspOpStrtAreaLineOneTxt = trspOpStrtAreaLineOneTxt;
  }

  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource trspOpEndAreaLineOneTxt(String trspOpEndAreaLineOneTxt) {
    this.trspOpEndAreaLineOneTxt = trspOpEndAreaLineOneTxt;
    return this;
  }

  /**
   * 運行終了地域
   * @return trspOpEndAreaLineOneTxt
  */
  @Size(min = 1, max = 20) 
  @Schema(name = "trsp_op_end_area_line_one_txt", description = "運行終了地域", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_end_area_line_one_txt")
  public String getTrspOpEndAreaLineOneTxt() {
    return trspOpEndAreaLineOneTxt;
  }

  public void setTrspOpEndAreaLineOneTxt(String trspOpEndAreaLineOneTxt) {
    this.trspOpEndAreaLineOneTxt = trspOpEndAreaLineOneTxt;
  }

  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource trspOpDateTrmStrtDate(LocalDate trspOpDateTrmStrtDate) {
    this.trspOpDateTrmStrtDate = trspOpDateTrmStrtDate;
    return this;
  }

  /**
   * 運行開始日
   * @return trspOpDateTrmStrtDate
  */
  @Valid 
  @Schema(name = "trsp_op_date_trm_strt_date", example = "Fri Jan 31 09:00:00 JST 2020", description = "運行開始日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_date_trm_strt_date")
  public LocalDate getTrspOpDateTrmStrtDate() {
    return trspOpDateTrmStrtDate;
  }

  public void setTrspOpDateTrmStrtDate(LocalDate trspOpDateTrmStrtDate) {
    this.trspOpDateTrmStrtDate = trspOpDateTrmStrtDate;
  }

  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource trspOpPlanDateTrmStrtTime(String trspOpPlanDateTrmStrtTime) {
    this.trspOpPlanDateTrmStrtTime = trspOpPlanDateTrmStrtTime;
    return this;
  }

  /**
   * 運行開始希望時刻 (hh:mm形式)
   * @return trspOpPlanDateTrmStrtTime
  */
  @Pattern(regexp = "^(2[0-3]|[01][0-9]):([0-5][0-9])$") 
  @Schema(name = "trsp_op_plan_date_trm_strt_time", example = "1439", description = "運行開始希望時刻 (hh:mm形式)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_plan_date_trm_strt_time")
  public String getTrspOpPlanDateTrmStrtTime() {
    return trspOpPlanDateTrmStrtTime;
  }

  public void setTrspOpPlanDateTrmStrtTime(String trspOpPlanDateTrmStrtTime) {
    this.trspOpPlanDateTrmStrtTime = trspOpPlanDateTrmStrtTime;
  }

  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource trspOpDateTrmEndDate(LocalDate trspOpDateTrmEndDate) {
    this.trspOpDateTrmEndDate = trspOpDateTrmEndDate;
    return this;
  }

  /**
   * 運行終了日
   * @return trspOpDateTrmEndDate
  */
  @Valid 
  @Schema(name = "trsp_op_date_trm_end_date", example = "Fri Jan 31 09:00:00 JST 2020", description = "運行終了日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_date_trm_end_date")
  public LocalDate getTrspOpDateTrmEndDate() {
    return trspOpDateTrmEndDate;
  }

  public void setTrspOpDateTrmEndDate(LocalDate trspOpDateTrmEndDate) {
    this.trspOpDateTrmEndDate = trspOpDateTrmEndDate;
  }

  public DataModelTrspAbilityLineItemAttributeVehicleAvbResource trspOpPlanDateTrmEndTime(String trspOpPlanDateTrmEndTime) {
    this.trspOpPlanDateTrmEndTime = trspOpPlanDateTrmEndTime;
    return this;
  }

  /**
   * 運行終了希望時刻 (hh:mm形式)
   * @return trspOpPlanDateTrmEndTime
  */
  @Pattern(regexp = "^(2[0-3]|[01][0-9]):([0-5][0-9])$") 
  @Schema(name = "trsp_op_plan_date_trm_end_time", example = "1439", description = "運行終了希望時刻 (hh:mm形式)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_plan_date_trm_end_time")
  public String getTrspOpPlanDateTrmEndTime() {
    return trspOpPlanDateTrmEndTime;
  }

  public void setTrspOpPlanDateTrmEndTime(String trspOpPlanDateTrmEndTime) {
    this.trspOpPlanDateTrmEndTime = trspOpPlanDateTrmEndTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTrspAbilityLineItemAttributeVehicleAvbResource dataModelTrspAbilityLineItemAttributeVehicleAvbResource = (DataModelTrspAbilityLineItemAttributeVehicleAvbResource) o;
    return Objects.equals(this.trspOpStrtAreaLineOneTxt, dataModelTrspAbilityLineItemAttributeVehicleAvbResource.trspOpStrtAreaLineOneTxt) &&
        Objects.equals(this.trspOpEndAreaLineOneTxt, dataModelTrspAbilityLineItemAttributeVehicleAvbResource.trspOpEndAreaLineOneTxt) &&
        Objects.equals(this.trspOpDateTrmStrtDate, dataModelTrspAbilityLineItemAttributeVehicleAvbResource.trspOpDateTrmStrtDate) &&
        Objects.equals(this.trspOpPlanDateTrmStrtTime, dataModelTrspAbilityLineItemAttributeVehicleAvbResource.trspOpPlanDateTrmStrtTime) &&
        Objects.equals(this.trspOpDateTrmEndDate, dataModelTrspAbilityLineItemAttributeVehicleAvbResource.trspOpDateTrmEndDate) &&
        Objects.equals(this.trspOpPlanDateTrmEndTime, dataModelTrspAbilityLineItemAttributeVehicleAvbResource.trspOpPlanDateTrmEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspOpStrtAreaLineOneTxt, trspOpEndAreaLineOneTxt, trspOpDateTrmStrtDate, trspOpPlanDateTrmStrtTime, trspOpDateTrmEndDate, trspOpPlanDateTrmEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTrspAbilityLineItemAttributeVehicleAvbResource {\n");
    sb.append("    trspOpStrtAreaLineOneTxt: ").append(toIndentedString(trspOpStrtAreaLineOneTxt)).append("\n");
    sb.append("    trspOpEndAreaLineOneTxt: ").append(toIndentedString(trspOpEndAreaLineOneTxt)).append("\n");
    sb.append("    trspOpDateTrmStrtDate: ").append(toIndentedString(trspOpDateTrmStrtDate)).append("\n");
    sb.append("    trspOpPlanDateTrmStrtTime: ").append(toIndentedString(trspOpPlanDateTrmStrtTime)).append("\n");
    sb.append("    trspOpDateTrmEndDate: ").append(toIndentedString(trspOpDateTrmEndDate)).append("\n");
    sb.append("    trspOpPlanDateTrmEndTime: ").append(toIndentedString(trspOpPlanDateTrmEndTime)).append("\n");
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

