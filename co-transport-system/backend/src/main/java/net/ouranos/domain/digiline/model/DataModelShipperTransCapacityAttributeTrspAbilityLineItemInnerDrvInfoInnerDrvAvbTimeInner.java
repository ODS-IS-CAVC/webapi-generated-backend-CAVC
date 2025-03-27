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
 * DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_drv_info_inner_drv_avb_time_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner {

  private String drvAvbFromDate;

  private String drvAvbFromTimeOfWrkgTime;

  private String drvAvbToDate;

  private String drvAvbToTimeOfWrkgTime;

  private String drvWrkgTrmsTxt;

  private String drvFrmrOptgDate;

  private String drvFrmrOpEndTime;

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvAvbFromDate(String drvAvbFromDate) {
    this.drvAvbFromDate = drvAvbFromDate;
    return this;
  }

  /**
   * 稼働開始予定日
   * @return drvAvbFromDate
  */
  
  @Schema(name = "drv_avb_from_date", description = "稼働開始予定日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_avb_from_date")
  public String getDrvAvbFromDate() {
    return drvAvbFromDate;
  }

  public void setDrvAvbFromDate(String drvAvbFromDate) {
    this.drvAvbFromDate = drvAvbFromDate;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvAvbFromTimeOfWrkgTime(String drvAvbFromTimeOfWrkgTime) {
    this.drvAvbFromTimeOfWrkgTime = drvAvbFromTimeOfWrkgTime;
    return this;
  }

  /**
   * 稼働開始予定時間
   * @return drvAvbFromTimeOfWrkgTime
  */
  
  @Schema(name = "drv_avb_from_time_of_wrkg_time", description = "稼働開始予定時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_avb_from_time_of_wrkg_time")
  public String getDrvAvbFromTimeOfWrkgTime() {
    return drvAvbFromTimeOfWrkgTime;
  }

  public void setDrvAvbFromTimeOfWrkgTime(String drvAvbFromTimeOfWrkgTime) {
    this.drvAvbFromTimeOfWrkgTime = drvAvbFromTimeOfWrkgTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvAvbToDate(String drvAvbToDate) {
    this.drvAvbToDate = drvAvbToDate;
    return this;
  }

  /**
   * 稼働終了予定日
   * @return drvAvbToDate
  */
  
  @Schema(name = "drv_avb_to_date", description = "稼働終了予定日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_avb_to_date")
  public String getDrvAvbToDate() {
    return drvAvbToDate;
  }

  public void setDrvAvbToDate(String drvAvbToDate) {
    this.drvAvbToDate = drvAvbToDate;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvAvbToTimeOfWrkgTime(String drvAvbToTimeOfWrkgTime) {
    this.drvAvbToTimeOfWrkgTime = drvAvbToTimeOfWrkgTime;
    return this;
  }

  /**
   * 稼働終了予定時間
   * @return drvAvbToTimeOfWrkgTime
  */
  
  @Schema(name = "drv_avb_to_time_of_wrkg_time", description = "稼働終了予定時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_avb_to_time_of_wrkg_time")
  public String getDrvAvbToTimeOfWrkgTime() {
    return drvAvbToTimeOfWrkgTime;
  }

  public void setDrvAvbToTimeOfWrkgTime(String drvAvbToTimeOfWrkgTime) {
    this.drvAvbToTimeOfWrkgTime = drvAvbToTimeOfWrkgTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvWrkgTrmsTxt(String drvWrkgTrmsTxt) {
    this.drvWrkgTrmsTxt = drvWrkgTrmsTxt;
    return this;
  }

  /**
   * その他稼働条件
   * @return drvWrkgTrmsTxt
  */
  
  @Schema(name = "drv_wrkg_trms_txt", description = "その他稼働条件", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_wrkg_trms_txt")
  public String getDrvWrkgTrmsTxt() {
    return drvWrkgTrmsTxt;
  }

  public void setDrvWrkgTrmsTxt(String drvWrkgTrmsTxt) {
    this.drvWrkgTrmsTxt = drvWrkgTrmsTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvFrmrOptgDate(String drvFrmrOptgDate) {
    this.drvFrmrOptgDate = drvFrmrOptgDate;
    return this;
  }

  /**
   * 直前運行日
   * @return drvFrmrOptgDate
  */
  
  @Schema(name = "drv_frmr_optg_date", description = "直前運行日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_frmr_optg_date")
  public String getDrvFrmrOptgDate() {
    return drvFrmrOptgDate;
  }

  public void setDrvFrmrOptgDate(String drvFrmrOptgDate) {
    this.drvFrmrOptgDate = drvFrmrOptgDate;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvFrmrOpEndTime(String drvFrmrOpEndTime) {
    this.drvFrmrOpEndTime = drvFrmrOpEndTime;
    return this;
  }

  /**
   * 直前運行終了時間
   * @return drvFrmrOpEndTime
  */
  
  @Schema(name = "drv_frmr_op_end_time", description = "直前運行終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_frmr_op_end_time")
  public String getDrvFrmrOpEndTime() {
    return drvFrmrOpEndTime;
  }

  public void setDrvFrmrOpEndTime(String drvFrmrOpEndTime) {
    this.drvFrmrOpEndTime = drvFrmrOpEndTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner) o;
    return Objects.equals(this.drvAvbFromDate, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvAvbFromDate) &&
        Objects.equals(this.drvAvbFromTimeOfWrkgTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvAvbFromTimeOfWrkgTime) &&
        Objects.equals(this.drvAvbToDate, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvAvbToDate) &&
        Objects.equals(this.drvAvbToTimeOfWrkgTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvAvbToTimeOfWrkgTime) &&
        Objects.equals(this.drvWrkgTrmsTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvWrkgTrmsTxt) &&
        Objects.equals(this.drvFrmrOptgDate, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvFrmrOptgDate) &&
        Objects.equals(this.drvFrmrOpEndTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner.drvFrmrOpEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drvAvbFromDate, drvAvbFromTimeOfWrkgTime, drvAvbToDate, drvAvbToTimeOfWrkgTime, drvWrkgTrmsTxt, drvFrmrOptgDate, drvFrmrOpEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner {\n");
    sb.append("    drvAvbFromDate: ").append(toIndentedString(drvAvbFromDate)).append("\n");
    sb.append("    drvAvbFromTimeOfWrkgTime: ").append(toIndentedString(drvAvbFromTimeOfWrkgTime)).append("\n");
    sb.append("    drvAvbToDate: ").append(toIndentedString(drvAvbToDate)).append("\n");
    sb.append("    drvAvbToTimeOfWrkgTime: ").append(toIndentedString(drvAvbToTimeOfWrkgTime)).append("\n");
    sb.append("    drvWrkgTrmsTxt: ").append(toIndentedString(drvWrkgTrmsTxt)).append("\n");
    sb.append("    drvFrmrOptgDate: ").append(toIndentedString(drvFrmrOptgDate)).append("\n");
    sb.append("    drvFrmrOpEndTime: ").append(toIndentedString(drvFrmrOpEndTime)).append("\n");
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

