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
 * 運送依頼者
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_rqr_prty", description = "運送依頼者")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_rqr_prty")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty {

  private String trspRqrPrtyHeadOffId;

  private String trspRqrPrtyBrncOffId;

  private String trspRqrPrtyNameTxt;

  private String trspRqrSctSpedOrgId;

  private String trspRqrSctSpedOrgNameTxt;

  private String trspRqrSctTelCmmCmpNumTxt;

  private String trspRqrPstlAdrsLineOneTxt;

  private String trspRqrPstcCd;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPrtyHeadOffId(String trspRqrPrtyHeadOffId) {
    this.trspRqrPrtyHeadOffId = trspRqrPrtyHeadOffId;
    return this;
  }

  /**
   * 運送依頼者コード（本社）
   * @return trspRqrPrtyHeadOffId
  */
  
  @Schema(name = "trsp_rqr_prty_head_off_id", description = "運送依頼者コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_prty_head_off_id")
  public String getTrspRqrPrtyHeadOffId() {
    return trspRqrPrtyHeadOffId;
  }

  public void setTrspRqrPrtyHeadOffId(String trspRqrPrtyHeadOffId) {
    this.trspRqrPrtyHeadOffId = trspRqrPrtyHeadOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPrtyBrncOffId(String trspRqrPrtyBrncOffId) {
    this.trspRqrPrtyBrncOffId = trspRqrPrtyBrncOffId;
    return this;
  }

  /**
   * 運送依頼者コード（事業所）
   * @return trspRqrPrtyBrncOffId
  */
  
  @Schema(name = "trsp_rqr_prty_brnc_off_id", description = "運送依頼者コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_prty_brnc_off_id")
  public String getTrspRqrPrtyBrncOffId() {
    return trspRqrPrtyBrncOffId;
  }

  public void setTrspRqrPrtyBrncOffId(String trspRqrPrtyBrncOffId) {
    this.trspRqrPrtyBrncOffId = trspRqrPrtyBrncOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPrtyNameTxt(String trspRqrPrtyNameTxt) {
    this.trspRqrPrtyNameTxt = trspRqrPrtyNameTxt;
    return this;
  }

  /**
   * 運送依頼者名（漢字）
   * @return trspRqrPrtyNameTxt
  */
  
  @Schema(name = "trsp_rqr_prty_name_txt", description = "運送依頼者名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_prty_name_txt")
  public String getTrspRqrPrtyNameTxt() {
    return trspRqrPrtyNameTxt;
  }

  public void setTrspRqrPrtyNameTxt(String trspRqrPrtyNameTxt) {
    this.trspRqrPrtyNameTxt = trspRqrPrtyNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrSctSpedOrgId(String trspRqrSctSpedOrgId) {
    this.trspRqrSctSpedOrgId = trspRqrSctSpedOrgId;
    return this;
  }

  /**
   * 運送依頼者部門コード
   * @return trspRqrSctSpedOrgId
  */
  
  @Schema(name = "trsp_rqr_sct_sped_org_id", description = "運送依頼者部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_sct_sped_org_id")
  public String getTrspRqrSctSpedOrgId() {
    return trspRqrSctSpedOrgId;
  }

  public void setTrspRqrSctSpedOrgId(String trspRqrSctSpedOrgId) {
    this.trspRqrSctSpedOrgId = trspRqrSctSpedOrgId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrSctSpedOrgNameTxt(String trspRqrSctSpedOrgNameTxt) {
    this.trspRqrSctSpedOrgNameTxt = trspRqrSctSpedOrgNameTxt;
    return this;
  }

  /**
   * 運送依頼者部門名（漢字）
   * @return trspRqrSctSpedOrgNameTxt
  */
  
  @Schema(name = "trsp_rqr_sct_sped_org_name_txt", description = "運送依頼者部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_sct_sped_org_name_txt")
  public String getTrspRqrSctSpedOrgNameTxt() {
    return trspRqrSctSpedOrgNameTxt;
  }

  public void setTrspRqrSctSpedOrgNameTxt(String trspRqrSctSpedOrgNameTxt) {
    this.trspRqrSctSpedOrgNameTxt = trspRqrSctSpedOrgNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrSctTelCmmCmpNumTxt(String trspRqrSctTelCmmCmpNumTxt) {
    this.trspRqrSctTelCmmCmpNumTxt = trspRqrSctTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 運送依頼者電話番号
   * @return trspRqrSctTelCmmCmpNumTxt
  */
  
  @Schema(name = "trsp_rqr_sct_tel_cmm_cmp_num_txt", description = "運送依頼者電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_sct_tel_cmm_cmp_num_txt")
  public String getTrspRqrSctTelCmmCmpNumTxt() {
    return trspRqrSctTelCmmCmpNumTxt;
  }

  public void setTrspRqrSctTelCmmCmpNumTxt(String trspRqrSctTelCmmCmpNumTxt) {
    this.trspRqrSctTelCmmCmpNumTxt = trspRqrSctTelCmmCmpNumTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPstlAdrsLineOneTxt(String trspRqrPstlAdrsLineOneTxt) {
    this.trspRqrPstlAdrsLineOneTxt = trspRqrPstlAdrsLineOneTxt;
    return this;
  }

  /**
   * 運送依頼者住所（漢字）
   * @return trspRqrPstlAdrsLineOneTxt
  */
  
  @Schema(name = "trsp_rqr_pstl_adrs_line_one_txt", description = "運送依頼者住所（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_pstl_adrs_line_one_txt")
  public String getTrspRqrPstlAdrsLineOneTxt() {
    return trspRqrPstlAdrsLineOneTxt;
  }

  public void setTrspRqrPstlAdrsLineOneTxt(String trspRqrPstlAdrsLineOneTxt) {
    this.trspRqrPstlAdrsLineOneTxt = trspRqrPstlAdrsLineOneTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPstcCd(String trspRqrPstcCd) {
    this.trspRqrPstcCd = trspRqrPstcCd;
    return this;
  }

  /**
   * 運送依頼者郵便番号
   * @return trspRqrPstcCd
  */
  
  @Schema(name = "trsp_rqr_pstc_cd", description = "運送依頼者郵便番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_pstc_cd")
  public String getTrspRqrPstcCd() {
    return trspRqrPstcCd;
  }

  public void setTrspRqrPstcCd(String trspRqrPstcCd) {
    this.trspRqrPstcCd = trspRqrPstcCd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty) o;
    return Objects.equals(this.trspRqrPrtyHeadOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrPrtyHeadOffId) &&
        Objects.equals(this.trspRqrPrtyBrncOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrPrtyBrncOffId) &&
        Objects.equals(this.trspRqrPrtyNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrPrtyNameTxt) &&
        Objects.equals(this.trspRqrSctSpedOrgId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrSctSpedOrgId) &&
        Objects.equals(this.trspRqrSctSpedOrgNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrSctSpedOrgNameTxt) &&
        Objects.equals(this.trspRqrSctTelCmmCmpNumTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrSctTelCmmCmpNumTxt) &&
        Objects.equals(this.trspRqrPstlAdrsLineOneTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrPstlAdrsLineOneTxt) &&
        Objects.equals(this.trspRqrPstcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty.trspRqrPstcCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspRqrPrtyHeadOffId, trspRqrPrtyBrncOffId, trspRqrPrtyNameTxt, trspRqrSctSpedOrgId, trspRqrSctSpedOrgNameTxt, trspRqrSctTelCmmCmpNumTxt, trspRqrPstlAdrsLineOneTxt, trspRqrPstcCd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty {\n");
    sb.append("    trspRqrPrtyHeadOffId: ").append(toIndentedString(trspRqrPrtyHeadOffId)).append("\n");
    sb.append("    trspRqrPrtyBrncOffId: ").append(toIndentedString(trspRqrPrtyBrncOffId)).append("\n");
    sb.append("    trspRqrPrtyNameTxt: ").append(toIndentedString(trspRqrPrtyNameTxt)).append("\n");
    sb.append("    trspRqrSctSpedOrgId: ").append(toIndentedString(trspRqrSctSpedOrgId)).append("\n");
    sb.append("    trspRqrSctSpedOrgNameTxt: ").append(toIndentedString(trspRqrSctSpedOrgNameTxt)).append("\n");
    sb.append("    trspRqrSctTelCmmCmpNumTxt: ").append(toIndentedString(trspRqrSctTelCmmCmpNumTxt)).append("\n");
    sb.append("    trspRqrPstlAdrsLineOneTxt: ").append(toIndentedString(trspRqrPstlAdrsLineOneTxt)).append("\n");
    sb.append("    trspRqrPstcCd: ").append(toIndentedString(trspRqrPstcCd)).append("\n");
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

