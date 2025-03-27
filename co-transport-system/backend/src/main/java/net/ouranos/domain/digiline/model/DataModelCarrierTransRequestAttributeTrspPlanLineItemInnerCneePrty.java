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
 * 荷受人
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cnee_prty", description = "荷受人")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cnee_prty")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty {

  private String cneePrtyHeadOffId;

  private String cneePrtyBrncOffId;

  private String cneePrtyNameTxt;

  private String cneeSctId;

  private String cneeSctNameTxt;

  private String cneePrimCntPersNameTxt;

  private String cneeTelCmmCmpNumTxt;

  private String cneePstlAdrsLineOneTxt;

  private String cneePstcCd;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrtyHeadOffId(String cneePrtyHeadOffId) {
    this.cneePrtyHeadOffId = cneePrtyHeadOffId;
    return this;
  }

  /**
   * 荷受人コード（本社）
   * @return cneePrtyHeadOffId
  */
  
  @Schema(name = "cnee_prty_head_off_id", description = "荷受人コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_prty_head_off_id")
  public String getCneePrtyHeadOffId() {
    return cneePrtyHeadOffId;
  }

  public void setCneePrtyHeadOffId(String cneePrtyHeadOffId) {
    this.cneePrtyHeadOffId = cneePrtyHeadOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrtyBrncOffId(String cneePrtyBrncOffId) {
    this.cneePrtyBrncOffId = cneePrtyBrncOffId;
    return this;
  }

  /**
   * 荷受人コード（事業所）
   * @return cneePrtyBrncOffId
  */
  
  @Schema(name = "cnee_prty_brnc_off_id", description = "荷受人コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_prty_brnc_off_id")
  public String getCneePrtyBrncOffId() {
    return cneePrtyBrncOffId;
  }

  public void setCneePrtyBrncOffId(String cneePrtyBrncOffId) {
    this.cneePrtyBrncOffId = cneePrtyBrncOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrtyNameTxt(String cneePrtyNameTxt) {
    this.cneePrtyNameTxt = cneePrtyNameTxt;
    return this;
  }

  /**
   * 荷受人名（漢字）
   * @return cneePrtyNameTxt
  */
  
  @Schema(name = "cnee_prty_name_txt", description = "荷受人名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_prty_name_txt")
  public String getCneePrtyNameTxt() {
    return cneePrtyNameTxt;
  }

  public void setCneePrtyNameTxt(String cneePrtyNameTxt) {
    this.cneePrtyNameTxt = cneePrtyNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneeSctId(String cneeSctId) {
    this.cneeSctId = cneeSctId;
    return this;
  }

  /**
   * 荷受人部門コード
   * @return cneeSctId
  */
  
  @Schema(name = "cnee_sct_id", description = "荷受人部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_sct_id")
  public String getCneeSctId() {
    return cneeSctId;
  }

  public void setCneeSctId(String cneeSctId) {
    this.cneeSctId = cneeSctId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneeSctNameTxt(String cneeSctNameTxt) {
    this.cneeSctNameTxt = cneeSctNameTxt;
    return this;
  }

  /**
   * 荷受人部門名（漢字）
   * @return cneeSctNameTxt
  */
  
  @Schema(name = "cnee_sct_name_txt", description = "荷受人部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_sct_name_txt")
  public String getCneeSctNameTxt() {
    return cneeSctNameTxt;
  }

  public void setCneeSctNameTxt(String cneeSctNameTxt) {
    this.cneeSctNameTxt = cneeSctNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrimCntPersNameTxt(String cneePrimCntPersNameTxt) {
    this.cneePrimCntPersNameTxt = cneePrimCntPersNameTxt;
    return this;
  }

  /**
   * 荷受人担当者名（漢字）
   * @return cneePrimCntPersNameTxt
  */
  
  @Schema(name = "cnee_prim_cnt_pers_name_txt", description = "荷受人担当者名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_prim_cnt_pers_name_txt")
  public String getCneePrimCntPersNameTxt() {
    return cneePrimCntPersNameTxt;
  }

  public void setCneePrimCntPersNameTxt(String cneePrimCntPersNameTxt) {
    this.cneePrimCntPersNameTxt = cneePrimCntPersNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneeTelCmmCmpNumTxt(String cneeTelCmmCmpNumTxt) {
    this.cneeTelCmmCmpNumTxt = cneeTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 荷受人電話番号
   * @return cneeTelCmmCmpNumTxt
  */
  
  @Schema(name = "cnee_tel_cmm_cmp_num_txt", description = "荷受人電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_tel_cmm_cmp_num_txt")
  public String getCneeTelCmmCmpNumTxt() {
    return cneeTelCmmCmpNumTxt;
  }

  public void setCneeTelCmmCmpNumTxt(String cneeTelCmmCmpNumTxt) {
    this.cneeTelCmmCmpNumTxt = cneeTelCmmCmpNumTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePstlAdrsLineOneTxt(String cneePstlAdrsLineOneTxt) {
    this.cneePstlAdrsLineOneTxt = cneePstlAdrsLineOneTxt;
    return this;
  }

  /**
   * 荷受人住所（漢字）
   * @return cneePstlAdrsLineOneTxt
  */
  
  @Schema(name = "cnee_pstl_adrs_line_one_txt", description = "荷受人住所（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_pstl_adrs_line_one_txt")
  public String getCneePstlAdrsLineOneTxt() {
    return cneePstlAdrsLineOneTxt;
  }

  public void setCneePstlAdrsLineOneTxt(String cneePstlAdrsLineOneTxt) {
    this.cneePstlAdrsLineOneTxt = cneePstlAdrsLineOneTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePstcCd(String cneePstcCd) {
    this.cneePstcCd = cneePstcCd;
    return this;
  }

  /**
   * 荷受人郵便番号
   * @return cneePstcCd
  */
  
  @Schema(name = "cnee_pstc_cd", description = "荷受人郵便番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_pstc_cd")
  public String getCneePstcCd() {
    return cneePstcCd;
  }

  public void setCneePstcCd(String cneePstcCd) {
    this.cneePstcCd = cneePstcCd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty) o;
    return Objects.equals(this.cneePrtyHeadOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneePrtyHeadOffId) &&
        Objects.equals(this.cneePrtyBrncOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneePrtyBrncOffId) &&
        Objects.equals(this.cneePrtyNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneePrtyNameTxt) &&
        Objects.equals(this.cneeSctId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneeSctId) &&
        Objects.equals(this.cneeSctNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneeSctNameTxt) &&
        Objects.equals(this.cneePrimCntPersNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneePrimCntPersNameTxt) &&
        Objects.equals(this.cneeTelCmmCmpNumTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneeTelCmmCmpNumTxt) &&
        Objects.equals(this.cneePstlAdrsLineOneTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneePstlAdrsLineOneTxt) &&
        Objects.equals(this.cneePstcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty.cneePstcCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cneePrtyHeadOffId, cneePrtyBrncOffId, cneePrtyNameTxt, cneeSctId, cneeSctNameTxt, cneePrimCntPersNameTxt, cneeTelCmmCmpNumTxt, cneePstlAdrsLineOneTxt, cneePstcCd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty {\n");
    sb.append("    cneePrtyHeadOffId: ").append(toIndentedString(cneePrtyHeadOffId)).append("\n");
    sb.append("    cneePrtyBrncOffId: ").append(toIndentedString(cneePrtyBrncOffId)).append("\n");
    sb.append("    cneePrtyNameTxt: ").append(toIndentedString(cneePrtyNameTxt)).append("\n");
    sb.append("    cneeSctId: ").append(toIndentedString(cneeSctId)).append("\n");
    sb.append("    cneeSctNameTxt: ").append(toIndentedString(cneeSctNameTxt)).append("\n");
    sb.append("    cneePrimCntPersNameTxt: ").append(toIndentedString(cneePrimCntPersNameTxt)).append("\n");
    sb.append("    cneeTelCmmCmpNumTxt: ").append(toIndentedString(cneeTelCmmCmpNumTxt)).append("\n");
    sb.append("    cneePstlAdrsLineOneTxt: ").append(toIndentedString(cneePstlAdrsLineOneTxt)).append("\n");
    sb.append("    cneePstcCd: ").append(toIndentedString(cneePstcCd)).append("\n");
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

