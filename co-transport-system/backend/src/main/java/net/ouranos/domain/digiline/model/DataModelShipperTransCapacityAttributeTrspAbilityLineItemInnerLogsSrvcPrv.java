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
 * 物流サービス提供者
 */

@Schema(name = "dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_logs_srvc_prv", description = "物流サービス提供者")
@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_logs_srvc_prv")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv {

  private String logsSrvcPrvPrtyHeadOffId;

  private String logsSrvcPrvPrtyBrncOffId;

  private String logsSrvcPrvPrtyNameTxt;

  private String logsSrvcPrvSctSpedOrgId;

  private String logsSrvcPrvSctSpedOrgNameTxt;

  private String logsSrvcPrvSctPrimCntPersNameTxt;

  private String logsSrvcPrvSctTelCmmCmpNumTxt;

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvPrtyHeadOffId(String logsSrvcPrvPrtyHeadOffId) {
    this.logsSrvcPrvPrtyHeadOffId = logsSrvcPrvPrtyHeadOffId;
    return this;
  }

  /**
   * 物流サービス提供者コード（本社）
   * @return logsSrvcPrvPrtyHeadOffId
  */
  
  @Schema(name = "logs_srvc_prv_prty_head_off_id", description = "物流サービス提供者コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_prty_head_off_id")
  public String getLogsSrvcPrvPrtyHeadOffId() {
    return logsSrvcPrvPrtyHeadOffId;
  }

  public void setLogsSrvcPrvPrtyHeadOffId(String logsSrvcPrvPrtyHeadOffId) {
    this.logsSrvcPrvPrtyHeadOffId = logsSrvcPrvPrtyHeadOffId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvPrtyBrncOffId(String logsSrvcPrvPrtyBrncOffId) {
    this.logsSrvcPrvPrtyBrncOffId = logsSrvcPrvPrtyBrncOffId;
    return this;
  }

  /**
   * 物流サービス提供者コード（事業所）
   * @return logsSrvcPrvPrtyBrncOffId
  */
  
  @Schema(name = "logs_srvc_prv_prty_brnc_off_id", description = "物流サービス提供者コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_prty_brnc_off_id")
  public String getLogsSrvcPrvPrtyBrncOffId() {
    return logsSrvcPrvPrtyBrncOffId;
  }

  public void setLogsSrvcPrvPrtyBrncOffId(String logsSrvcPrvPrtyBrncOffId) {
    this.logsSrvcPrvPrtyBrncOffId = logsSrvcPrvPrtyBrncOffId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvPrtyNameTxt(String logsSrvcPrvPrtyNameTxt) {
    this.logsSrvcPrvPrtyNameTxt = logsSrvcPrvPrtyNameTxt;
    return this;
  }

  /**
   * 物流サービス提供者名（漢字）
   * @return logsSrvcPrvPrtyNameTxt
  */
  
  @Schema(name = "logs_srvc_prv_prty_name_txt", description = "物流サービス提供者名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_prty_name_txt")
  public String getLogsSrvcPrvPrtyNameTxt() {
    return logsSrvcPrvPrtyNameTxt;
  }

  public void setLogsSrvcPrvPrtyNameTxt(String logsSrvcPrvPrtyNameTxt) {
    this.logsSrvcPrvPrtyNameTxt = logsSrvcPrvPrtyNameTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvSctSpedOrgId(String logsSrvcPrvSctSpedOrgId) {
    this.logsSrvcPrvSctSpedOrgId = logsSrvcPrvSctSpedOrgId;
    return this;
  }

  /**
   * 物流サービス提供者部門コード
   * @return logsSrvcPrvSctSpedOrgId
  */
  
  @Schema(name = "logs_srvc_prv_sct_sped_org_id", description = "物流サービス提供者部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_sct_sped_org_id")
  public String getLogsSrvcPrvSctSpedOrgId() {
    return logsSrvcPrvSctSpedOrgId;
  }

  public void setLogsSrvcPrvSctSpedOrgId(String logsSrvcPrvSctSpedOrgId) {
    this.logsSrvcPrvSctSpedOrgId = logsSrvcPrvSctSpedOrgId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvSctSpedOrgNameTxt(String logsSrvcPrvSctSpedOrgNameTxt) {
    this.logsSrvcPrvSctSpedOrgNameTxt = logsSrvcPrvSctSpedOrgNameTxt;
    return this;
  }

  /**
   * 物流サービス提供者部門名（漢字）
   * @return logsSrvcPrvSctSpedOrgNameTxt
  */
  
  @Schema(name = "logs_srvc_prv_sct_sped_org_name_txt", description = "物流サービス提供者部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_sct_sped_org_name_txt")
  public String getLogsSrvcPrvSctSpedOrgNameTxt() {
    return logsSrvcPrvSctSpedOrgNameTxt;
  }

  public void setLogsSrvcPrvSctSpedOrgNameTxt(String logsSrvcPrvSctSpedOrgNameTxt) {
    this.logsSrvcPrvSctSpedOrgNameTxt = logsSrvcPrvSctSpedOrgNameTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvSctPrimCntPersNameTxt(String logsSrvcPrvSctPrimCntPersNameTxt) {
    this.logsSrvcPrvSctPrimCntPersNameTxt = logsSrvcPrvSctPrimCntPersNameTxt;
    return this;
  }

  /**
   * 物流サービス提供者担当者名（漢字）
   * @return logsSrvcPrvSctPrimCntPersNameTxt
  */
  
  @Schema(name = "logs_srvc_prv_sct_prim_cnt_pers_name_txt", description = "物流サービス提供者担当者名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_sct_prim_cnt_pers_name_txt")
  public String getLogsSrvcPrvSctPrimCntPersNameTxt() {
    return logsSrvcPrvSctPrimCntPersNameTxt;
  }

  public void setLogsSrvcPrvSctPrimCntPersNameTxt(String logsSrvcPrvSctPrimCntPersNameTxt) {
    this.logsSrvcPrvSctPrimCntPersNameTxt = logsSrvcPrvSctPrimCntPersNameTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrvSctTelCmmCmpNumTxt(String logsSrvcPrvSctTelCmmCmpNumTxt) {
    this.logsSrvcPrvSctTelCmmCmpNumTxt = logsSrvcPrvSctTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 物流サービス提供者電話番号
   * @return logsSrvcPrvSctTelCmmCmpNumTxt
  */
  
  @Schema(name = "logs_srvc_prv_sct_tel_cmm_cmp_num_txt", description = "物流サービス提供者電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv_sct_tel_cmm_cmp_num_txt")
  public String getLogsSrvcPrvSctTelCmmCmpNumTxt() {
    return logsSrvcPrvSctTelCmmCmpNumTxt;
  }

  public void setLogsSrvcPrvSctTelCmmCmpNumTxt(String logsSrvcPrvSctTelCmmCmpNumTxt) {
    this.logsSrvcPrvSctTelCmmCmpNumTxt = logsSrvcPrvSctTelCmmCmpNumTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv) o;
    return Objects.equals(this.logsSrvcPrvPrtyHeadOffId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvPrtyHeadOffId) &&
        Objects.equals(this.logsSrvcPrvPrtyBrncOffId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvPrtyBrncOffId) &&
        Objects.equals(this.logsSrvcPrvPrtyNameTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvPrtyNameTxt) &&
        Objects.equals(this.logsSrvcPrvSctSpedOrgId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvSctSpedOrgId) &&
        Objects.equals(this.logsSrvcPrvSctSpedOrgNameTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvSctSpedOrgNameTxt) &&
        Objects.equals(this.logsSrvcPrvSctPrimCntPersNameTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvSctPrimCntPersNameTxt) &&
        Objects.equals(this.logsSrvcPrvSctTelCmmCmpNumTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv.logsSrvcPrvSctTelCmmCmpNumTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logsSrvcPrvPrtyHeadOffId, logsSrvcPrvPrtyBrncOffId, logsSrvcPrvPrtyNameTxt, logsSrvcPrvSctSpedOrgId, logsSrvcPrvSctSpedOrgNameTxt, logsSrvcPrvSctPrimCntPersNameTxt, logsSrvcPrvSctTelCmmCmpNumTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv {\n");
    sb.append("    logsSrvcPrvPrtyHeadOffId: ").append(toIndentedString(logsSrvcPrvPrtyHeadOffId)).append("\n");
    sb.append("    logsSrvcPrvPrtyBrncOffId: ").append(toIndentedString(logsSrvcPrvPrtyBrncOffId)).append("\n");
    sb.append("    logsSrvcPrvPrtyNameTxt: ").append(toIndentedString(logsSrvcPrvPrtyNameTxt)).append("\n");
    sb.append("    logsSrvcPrvSctSpedOrgId: ").append(toIndentedString(logsSrvcPrvSctSpedOrgId)).append("\n");
    sb.append("    logsSrvcPrvSctSpedOrgNameTxt: ").append(toIndentedString(logsSrvcPrvSctSpedOrgNameTxt)).append("\n");
    sb.append("    logsSrvcPrvSctPrimCntPersNameTxt: ").append(toIndentedString(logsSrvcPrvSctPrimCntPersNameTxt)).append("\n");
    sb.append("    logsSrvcPrvSctTelCmmCmpNumTxt: ").append(toIndentedString(logsSrvcPrvSctTelCmmCmpNumTxt)).append("\n");
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

