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
 * 運送車輌条件
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_vehicle_trms", description = "運送車輌条件")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_vehicle_trms")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms {

  private String carClsOfSizeCd;

  private String carClsOfShpCd;

  private String carClsOfTlgLftrExstCd;

  private String carClsOfWingBodyExstCd;

  private String carClsOfRfgExstCd;

  private BigDecimal trmsOfLwrTmpMeas;

  private BigDecimal trmsOfUppTmpMeas;

  private String carClsOfCrnExstCd;

  private String carRmkAboutEqpmTxt;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carClsOfSizeCd(String carClsOfSizeCd) {
    this.carClsOfSizeCd = carClsOfSizeCd;
    return this;
  }

  /**
   * 車輌種別
   * @return carClsOfSizeCd
  */
  
  @Schema(name = "car_cls_of_size_cd", description = "車輌種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_size_cd")
  public String getCarClsOfSizeCd() {
    return carClsOfSizeCd;
  }

  public void setCarClsOfSizeCd(String carClsOfSizeCd) {
    this.carClsOfSizeCd = carClsOfSizeCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carClsOfShpCd(String carClsOfShpCd) {
    this.carClsOfShpCd = carClsOfShpCd;
    return this;
  }

  /**
   * 平ボディ/バンボディ
   * @return carClsOfShpCd
  */
  
  @Schema(name = "car_cls_of_shp_cd", description = "平ボディ/バンボディ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_shp_cd")
  public String getCarClsOfShpCd() {
    return carClsOfShpCd;
  }

  public void setCarClsOfShpCd(String carClsOfShpCd) {
    this.carClsOfShpCd = carClsOfShpCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carClsOfTlgLftrExstCd(String carClsOfTlgLftrExstCd) {
    this.carClsOfTlgLftrExstCd = carClsOfTlgLftrExstCd;
    return this;
  }

  /**
   * パワーゲート有無
   * @return carClsOfTlgLftrExstCd
  */
  
  @Schema(name = "car_cls_of_tlg_lftr_exst_cd", description = "パワーゲート有無", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_tlg_lftr_exst_cd")
  public String getCarClsOfTlgLftrExstCd() {
    return carClsOfTlgLftrExstCd;
  }

  public void setCarClsOfTlgLftrExstCd(String carClsOfTlgLftrExstCd) {
    this.carClsOfTlgLftrExstCd = carClsOfTlgLftrExstCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carClsOfWingBodyExstCd(String carClsOfWingBodyExstCd) {
    this.carClsOfWingBodyExstCd = carClsOfWingBodyExstCd;
    return this;
  }

  /**
   * ウィング有無
   * @return carClsOfWingBodyExstCd
  */
  
  @Schema(name = "car_cls_of_wing_body_exst_cd", description = "ウィング有無", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_wing_body_exst_cd")
  public String getCarClsOfWingBodyExstCd() {
    return carClsOfWingBodyExstCd;
  }

  public void setCarClsOfWingBodyExstCd(String carClsOfWingBodyExstCd) {
    this.carClsOfWingBodyExstCd = carClsOfWingBodyExstCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carClsOfRfgExstCd(String carClsOfRfgExstCd) {
    this.carClsOfRfgExstCd = carClsOfRfgExstCd;
    return this;
  }

  /**
   * 冷凍・冷蔵設備
   * @return carClsOfRfgExstCd
  */
  
  @Schema(name = "car_cls_of_rfg_exst_cd", description = "冷凍・冷蔵設備", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_rfg_exst_cd")
  public String getCarClsOfRfgExstCd() {
    return carClsOfRfgExstCd;
  }

  public void setCarClsOfRfgExstCd(String carClsOfRfgExstCd) {
    this.carClsOfRfgExstCd = carClsOfRfgExstCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms trmsOfLwrTmpMeas(BigDecimal trmsOfLwrTmpMeas) {
    this.trmsOfLwrTmpMeas = trmsOfLwrTmpMeas;
    return this;
  }

  /**
   * 温度範囲（下限）
   * @return trmsOfLwrTmpMeas
  */
  @Valid 
  @Schema(name = "trms_of_lwr_tmp_meas", description = "温度範囲（下限）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_lwr_tmp_meas")
  public BigDecimal getTrmsOfLwrTmpMeas() {
    return trmsOfLwrTmpMeas;
  }

  public void setTrmsOfLwrTmpMeas(BigDecimal trmsOfLwrTmpMeas) {
    this.trmsOfLwrTmpMeas = trmsOfLwrTmpMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms trmsOfUppTmpMeas(BigDecimal trmsOfUppTmpMeas) {
    this.trmsOfUppTmpMeas = trmsOfUppTmpMeas;
    return this;
  }

  /**
   * 温度範囲（上限）
   * @return trmsOfUppTmpMeas
  */
  @Valid 
  @Schema(name = "trms_of_upp_tmp_meas", description = "温度範囲（上限）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_upp_tmp_meas")
  public BigDecimal getTrmsOfUppTmpMeas() {
    return trmsOfUppTmpMeas;
  }

  public void setTrmsOfUppTmpMeas(BigDecimal trmsOfUppTmpMeas) {
    this.trmsOfUppTmpMeas = trmsOfUppTmpMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carClsOfCrnExstCd(String carClsOfCrnExstCd) {
    this.carClsOfCrnExstCd = carClsOfCrnExstCd;
    return this;
  }

  /**
   * クレーン付
   * @return carClsOfCrnExstCd
  */
  
  @Schema(name = "car_cls_of_crn_exst_cd", description = "クレーン付", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_crn_exst_cd")
  public String getCarClsOfCrnExstCd() {
    return carClsOfCrnExstCd;
  }

  public void setCarClsOfCrnExstCd(String carClsOfCrnExstCd) {
    this.carClsOfCrnExstCd = carClsOfCrnExstCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms carRmkAboutEqpmTxt(String carRmkAboutEqpmTxt) {
    this.carRmkAboutEqpmTxt = carRmkAboutEqpmTxt;
    return this;
  }

  /**
   * 車輌設備補足
   * @return carRmkAboutEqpmTxt
  */
  
  @Schema(name = "car_rmk_about_eqpm_txt", description = "車輌設備補足", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_rmk_about_eqpm_txt")
  public String getCarRmkAboutEqpmTxt() {
    return carRmkAboutEqpmTxt;
  }

  public void setCarRmkAboutEqpmTxt(String carRmkAboutEqpmTxt) {
    this.carRmkAboutEqpmTxt = carRmkAboutEqpmTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms) o;
    return Objects.equals(this.carClsOfSizeCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carClsOfSizeCd) &&
        Objects.equals(this.carClsOfShpCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carClsOfShpCd) &&
        Objects.equals(this.carClsOfTlgLftrExstCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carClsOfTlgLftrExstCd) &&
        Objects.equals(this.carClsOfWingBodyExstCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carClsOfWingBodyExstCd) &&
        Objects.equals(this.carClsOfRfgExstCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carClsOfRfgExstCd) &&
        Objects.equals(this.trmsOfLwrTmpMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.trmsOfLwrTmpMeas) &&
        Objects.equals(this.trmsOfUppTmpMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.trmsOfUppTmpMeas) &&
        Objects.equals(this.carClsOfCrnExstCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carClsOfCrnExstCd) &&
        Objects.equals(this.carRmkAboutEqpmTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms.carRmkAboutEqpmTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carClsOfSizeCd, carClsOfShpCd, carClsOfTlgLftrExstCd, carClsOfWingBodyExstCd, carClsOfRfgExstCd, trmsOfLwrTmpMeas, trmsOfUppTmpMeas, carClsOfCrnExstCd, carRmkAboutEqpmTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms {\n");
    sb.append("    carClsOfSizeCd: ").append(toIndentedString(carClsOfSizeCd)).append("\n");
    sb.append("    carClsOfShpCd: ").append(toIndentedString(carClsOfShpCd)).append("\n");
    sb.append("    carClsOfTlgLftrExstCd: ").append(toIndentedString(carClsOfTlgLftrExstCd)).append("\n");
    sb.append("    carClsOfWingBodyExstCd: ").append(toIndentedString(carClsOfWingBodyExstCd)).append("\n");
    sb.append("    carClsOfRfgExstCd: ").append(toIndentedString(carClsOfRfgExstCd)).append("\n");
    sb.append("    trmsOfLwrTmpMeas: ").append(toIndentedString(trmsOfLwrTmpMeas)).append("\n");
    sb.append("    trmsOfUppTmpMeas: ").append(toIndentedString(trmsOfUppTmpMeas)).append("\n");
    sb.append("    carClsOfCrnExstCd: ").append(toIndentedString(carClsOfCrnExstCd)).append("\n");
    sb.append("    carRmkAboutEqpmTxt: ").append(toIndentedString(carRmkAboutEqpmTxt)).append("\n");
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

