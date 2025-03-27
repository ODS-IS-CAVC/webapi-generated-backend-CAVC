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
 * 荷届先要件
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_ship_to_prty_inner_ship_to_prty_rqrm", description = "荷届先要件")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_ship_to_prty_inner_ship_to_prty_rqrm")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm {

  private String trmsOfCarSizeCd;

  private String trmsOfCarHghtMeas;

  private String trmsOfGtpCertTxt;

  private String trmsOfDelTxt;

  private String trmsOfGodsHndTxt;

  private String ancWrkOfDelTxt;

  private String spclWrkTxt;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm trmsOfCarSizeCd(String trmsOfCarSizeCd) {
    this.trmsOfCarSizeCd = trmsOfCarSizeCd;
    return this;
  }

  /**
   * 車輌種別制限
   * @return trmsOfCarSizeCd
  */
  
  @Schema(name = "trms_of_car_size_cd", description = "車輌種別制限", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_car_size_cd")
  public String getTrmsOfCarSizeCd() {
    return trmsOfCarSizeCd;
  }

  public void setTrmsOfCarSizeCd(String trmsOfCarSizeCd) {
    this.trmsOfCarSizeCd = trmsOfCarSizeCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm trmsOfCarHghtMeas(String trmsOfCarHghtMeas) {
    this.trmsOfCarHghtMeas = trmsOfCarHghtMeas;
    return this;
  }

  /**
   * 車輌高さ制限
   * @return trmsOfCarHghtMeas
  */
  
  @Schema(name = "trms_of_car_hght_meas", description = "車輌高さ制限", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_car_hght_meas")
  public String getTrmsOfCarHghtMeas() {
    return trmsOfCarHghtMeas;
  }

  public void setTrmsOfCarHghtMeas(String trmsOfCarHghtMeas) {
    this.trmsOfCarHghtMeas = trmsOfCarHghtMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm trmsOfGtpCertTxt(String trmsOfGtpCertTxt) {
    this.trmsOfGtpCertTxt = trmsOfGtpCertTxt;
    return this;
  }

  /**
   * 入門条件（漢字）
   * @return trmsOfGtpCertTxt
  */
  
  @Schema(name = "trms_of_gtp_cert_txt", description = "入門条件（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_gtp_cert_txt")
  public String getTrmsOfGtpCertTxt() {
    return trmsOfGtpCertTxt;
  }

  public void setTrmsOfGtpCertTxt(String trmsOfGtpCertTxt) {
    this.trmsOfGtpCertTxt = trmsOfGtpCertTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm trmsOfDelTxt(String trmsOfDelTxt) {
    this.trmsOfDelTxt = trmsOfDelTxt;
    return this;
  }

  /**
   * 荷届条件（漢字）
   * @return trmsOfDelTxt
  */
  
  @Schema(name = "trms_of_del_txt", description = "荷届条件（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_del_txt")
  public String getTrmsOfDelTxt() {
    return trmsOfDelTxt;
  }

  public void setTrmsOfDelTxt(String trmsOfDelTxt) {
    this.trmsOfDelTxt = trmsOfDelTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm trmsOfGodsHndTxt(String trmsOfGodsHndTxt) {
    this.trmsOfGodsHndTxt = trmsOfGodsHndTxt;
    return this;
  }

  /**
   * 荷扱指示（漢字）
   * @return trmsOfGodsHndTxt
  */
  
  @Schema(name = "trms_of_gods_hnd_txt", description = "荷扱指示（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_gods_hnd_txt")
  public String getTrmsOfGodsHndTxt() {
    return trmsOfGodsHndTxt;
  }

  public void setTrmsOfGodsHndTxt(String trmsOfGodsHndTxt) {
    this.trmsOfGodsHndTxt = trmsOfGodsHndTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm ancWrkOfDelTxt(String ancWrkOfDelTxt) {
    this.ancWrkOfDelTxt = ancWrkOfDelTxt;
    return this;
  }

  /**
   * 配達附帯作業（漢字）
   * @return ancWrkOfDelTxt
  */
  
  @Schema(name = "anc_wrk_of_del_txt", description = "配達附帯作業（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anc_wrk_of_del_txt")
  public String getAncWrkOfDelTxt() {
    return ancWrkOfDelTxt;
  }

  public void setAncWrkOfDelTxt(String ancWrkOfDelTxt) {
    this.ancWrkOfDelTxt = ancWrkOfDelTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm spclWrkTxt(String spclWrkTxt) {
    this.spclWrkTxt = spclWrkTxt;
    return this;
  }

  /**
   * 特別作業内容（漢字）
   * @return spclWrkTxt
  */
  
  @Schema(name = "spcl_wrk_txt", description = "特別作業内容（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spcl_wrk_txt")
  public String getSpclWrkTxt() {
    return spclWrkTxt;
  }

  public void setSpclWrkTxt(String spclWrkTxt) {
    this.spclWrkTxt = spclWrkTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm) o;
    return Objects.equals(this.trmsOfCarSizeCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.trmsOfCarSizeCd) &&
        Objects.equals(this.trmsOfCarHghtMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.trmsOfCarHghtMeas) &&
        Objects.equals(this.trmsOfGtpCertTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.trmsOfGtpCertTxt) &&
        Objects.equals(this.trmsOfDelTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.trmsOfDelTxt) &&
        Objects.equals(this.trmsOfGodsHndTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.trmsOfGodsHndTxt) &&
        Objects.equals(this.ancWrkOfDelTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.ancWrkOfDelTxt) &&
        Objects.equals(this.spclWrkTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm.spclWrkTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trmsOfCarSizeCd, trmsOfCarHghtMeas, trmsOfGtpCertTxt, trmsOfDelTxt, trmsOfGodsHndTxt, ancWrkOfDelTxt, spclWrkTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm {\n");
    sb.append("    trmsOfCarSizeCd: ").append(toIndentedString(trmsOfCarSizeCd)).append("\n");
    sb.append("    trmsOfCarHghtMeas: ").append(toIndentedString(trmsOfCarHghtMeas)).append("\n");
    sb.append("    trmsOfGtpCertTxt: ").append(toIndentedString(trmsOfGtpCertTxt)).append("\n");
    sb.append("    trmsOfDelTxt: ").append(toIndentedString(trmsOfDelTxt)).append("\n");
    sb.append("    trmsOfGodsHndTxt: ").append(toIndentedString(trmsOfGodsHndTxt)).append("\n");
    sb.append("    ancWrkOfDelTxt: ").append(toIndentedString(ancWrkOfDelTxt)).append("\n");
    sb.append("    spclWrkTxt: ").append(toIndentedString(spclWrkTxt)).append("\n");
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

