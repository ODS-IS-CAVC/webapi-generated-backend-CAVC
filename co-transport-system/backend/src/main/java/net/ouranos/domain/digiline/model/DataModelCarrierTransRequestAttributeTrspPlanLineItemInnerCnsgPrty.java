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
 * 荷送人
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cnsg_prty", description = "荷送人")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cnsg_prty")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty {

  private String cnsgPrtyHeadOffId;

  private String cnsgPrtyBrncOffId;

  private String cnsgPrtyNameTxt;

  private String cnsgSctSpedOrgId;

  private String cnsgSctSpedOrgNameTxt;

  private String cnsgTelCmmCmpNumTxt;

  private String cnsgPstlAdrsLineOneTxt;

  private String cnsgPstcCd;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPrtyHeadOffId(String cnsgPrtyHeadOffId) {
    this.cnsgPrtyHeadOffId = cnsgPrtyHeadOffId;
    return this;
  }

  /**
   * 荷送人コード（本社）
   * @return cnsgPrtyHeadOffId
  */
  
  @Schema(name = "cnsg_prty_head_off_id", description = "荷送人コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_prty_head_off_id")
  public String getCnsgPrtyHeadOffId() {
    return cnsgPrtyHeadOffId;
  }

  public void setCnsgPrtyHeadOffId(String cnsgPrtyHeadOffId) {
    this.cnsgPrtyHeadOffId = cnsgPrtyHeadOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPrtyBrncOffId(String cnsgPrtyBrncOffId) {
    this.cnsgPrtyBrncOffId = cnsgPrtyBrncOffId;
    return this;
  }

  /**
   * 荷送人コード（事業所）
   * @return cnsgPrtyBrncOffId
  */
  
  @Schema(name = "cnsg_prty_brnc_off_id", description = "荷送人コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_prty_brnc_off_id")
  public String getCnsgPrtyBrncOffId() {
    return cnsgPrtyBrncOffId;
  }

  public void setCnsgPrtyBrncOffId(String cnsgPrtyBrncOffId) {
    this.cnsgPrtyBrncOffId = cnsgPrtyBrncOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPrtyNameTxt(String cnsgPrtyNameTxt) {
    this.cnsgPrtyNameTxt = cnsgPrtyNameTxt;
    return this;
  }

  /**
   * 荷送人名（漢字）
   * @return cnsgPrtyNameTxt
  */
  
  @Schema(name = "cnsg_prty_name_txt", description = "荷送人名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_prty_name_txt")
  public String getCnsgPrtyNameTxt() {
    return cnsgPrtyNameTxt;
  }

  public void setCnsgPrtyNameTxt(String cnsgPrtyNameTxt) {
    this.cnsgPrtyNameTxt = cnsgPrtyNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgSctSpedOrgId(String cnsgSctSpedOrgId) {
    this.cnsgSctSpedOrgId = cnsgSctSpedOrgId;
    return this;
  }

  /**
   * 荷送人部門コード
   * @return cnsgSctSpedOrgId
  */
  
  @Schema(name = "cnsg_sct_sped_org_id", description = "荷送人部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_sct_sped_org_id")
  public String getCnsgSctSpedOrgId() {
    return cnsgSctSpedOrgId;
  }

  public void setCnsgSctSpedOrgId(String cnsgSctSpedOrgId) {
    this.cnsgSctSpedOrgId = cnsgSctSpedOrgId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgSctSpedOrgNameTxt(String cnsgSctSpedOrgNameTxt) {
    this.cnsgSctSpedOrgNameTxt = cnsgSctSpedOrgNameTxt;
    return this;
  }

  /**
   * 荷送人部門名（漢字）
   * @return cnsgSctSpedOrgNameTxt
  */
  
  @Schema(name = "cnsg_sct_sped_org_name_txt", description = "荷送人部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_sct_sped_org_name_txt")
  public String getCnsgSctSpedOrgNameTxt() {
    return cnsgSctSpedOrgNameTxt;
  }

  public void setCnsgSctSpedOrgNameTxt(String cnsgSctSpedOrgNameTxt) {
    this.cnsgSctSpedOrgNameTxt = cnsgSctSpedOrgNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgTelCmmCmpNumTxt(String cnsgTelCmmCmpNumTxt) {
    this.cnsgTelCmmCmpNumTxt = cnsgTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 荷送人電話番号
   * @return cnsgTelCmmCmpNumTxt
  */
  
  @Schema(name = "cnsg_tel_cmm_cmp_num_txt", description = "荷送人電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_tel_cmm_cmp_num_txt")
  public String getCnsgTelCmmCmpNumTxt() {
    return cnsgTelCmmCmpNumTxt;
  }

  public void setCnsgTelCmmCmpNumTxt(String cnsgTelCmmCmpNumTxt) {
    this.cnsgTelCmmCmpNumTxt = cnsgTelCmmCmpNumTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPstlAdrsLineOneTxt(String cnsgPstlAdrsLineOneTxt) {
    this.cnsgPstlAdrsLineOneTxt = cnsgPstlAdrsLineOneTxt;
    return this;
  }

  /**
   * 荷送人住所（漢字）
   * @return cnsgPstlAdrsLineOneTxt
  */
  
  @Schema(name = "cnsg_pstl_adrs_line_one_txt", description = "荷送人住所（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_pstl_adrs_line_one_txt")
  public String getCnsgPstlAdrsLineOneTxt() {
    return cnsgPstlAdrsLineOneTxt;
  }

  public void setCnsgPstlAdrsLineOneTxt(String cnsgPstlAdrsLineOneTxt) {
    this.cnsgPstlAdrsLineOneTxt = cnsgPstlAdrsLineOneTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPstcCd(String cnsgPstcCd) {
    this.cnsgPstcCd = cnsgPstcCd;
    return this;
  }

  /**
   * 荷送人郵便番号
   * @return cnsgPstcCd
  */
  
  @Schema(name = "cnsg_pstc_cd", description = "荷送人郵便番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_pstc_cd")
  public String getCnsgPstcCd() {
    return cnsgPstcCd;
  }

  public void setCnsgPstcCd(String cnsgPstcCd) {
    this.cnsgPstcCd = cnsgPstcCd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty) o;
    return Objects.equals(this.cnsgPrtyHeadOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgPrtyHeadOffId) &&
        Objects.equals(this.cnsgPrtyBrncOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgPrtyBrncOffId) &&
        Objects.equals(this.cnsgPrtyNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgPrtyNameTxt) &&
        Objects.equals(this.cnsgSctSpedOrgId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgSctSpedOrgId) &&
        Objects.equals(this.cnsgSctSpedOrgNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgSctSpedOrgNameTxt) &&
        Objects.equals(this.cnsgTelCmmCmpNumTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgTelCmmCmpNumTxt) &&
        Objects.equals(this.cnsgPstlAdrsLineOneTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgPstlAdrsLineOneTxt) &&
        Objects.equals(this.cnsgPstcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty.cnsgPstcCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnsgPrtyHeadOffId, cnsgPrtyBrncOffId, cnsgPrtyNameTxt, cnsgSctSpedOrgId, cnsgSctSpedOrgNameTxt, cnsgTelCmmCmpNumTxt, cnsgPstlAdrsLineOneTxt, cnsgPstcCd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty {\n");
    sb.append("    cnsgPrtyHeadOffId: ").append(toIndentedString(cnsgPrtyHeadOffId)).append("\n");
    sb.append("    cnsgPrtyBrncOffId: ").append(toIndentedString(cnsgPrtyBrncOffId)).append("\n");
    sb.append("    cnsgPrtyNameTxt: ").append(toIndentedString(cnsgPrtyNameTxt)).append("\n");
    sb.append("    cnsgSctSpedOrgId: ").append(toIndentedString(cnsgSctSpedOrgId)).append("\n");
    sb.append("    cnsgSctSpedOrgNameTxt: ").append(toIndentedString(cnsgSctSpedOrgNameTxt)).append("\n");
    sb.append("    cnsgTelCmmCmpNumTxt: ").append(toIndentedString(cnsgTelCmmCmpNumTxt)).append("\n");
    sb.append("    cnsgPstlAdrsLineOneTxt: ").append(toIndentedString(cnsgPstlAdrsLineOneTxt)).append("\n");
    sb.append("    cnsgPstcCd: ").append(toIndentedString(cnsgPstcCd)).append("\n");
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

