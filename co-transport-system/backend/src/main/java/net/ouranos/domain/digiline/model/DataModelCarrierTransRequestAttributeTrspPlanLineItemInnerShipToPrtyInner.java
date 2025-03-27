package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner
 */

@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_ship_to_prty_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner {

  private String shipToPrtyHeadOffId;

  private String shipToPrtyBrncOffId;

  private String shipToPrtyNameTxt;

  private String shipToSctId;

  private String shipToSctNameTxt;

  private String shipToPrimCntId;

  private String shipToPrimCntPersNameTxt;

  private String shipToTelCmmCmpNumTxt;

  private String shipToPstlAdrsCtyId;

  private String shipToPstlAdrsId;

  private String shipToPstlAdrsLineOneTxt;

  private String shipToPstcCd;

  private String plcCdPrtyId;

  private String glnPrtyId;

  private String jpnUplcCd;

  private String jpnVanSrvcCd;

  private String jpnVanVansCd;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner> freeTimeInfo = new ArrayList<>();

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm shipToPrtyRqrm;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrtyHeadOffId(String shipToPrtyHeadOffId) {
    this.shipToPrtyHeadOffId = shipToPrtyHeadOffId;
    return this;
  }

  /**
   * 荷届先コード（本社）
   * @return shipToPrtyHeadOffId
  */
  
  @Schema(name = "ship_to_prty_head_off_id", description = "荷届先コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prty_head_off_id")
  public String getShipToPrtyHeadOffId() {
    return shipToPrtyHeadOffId;
  }

  public void setShipToPrtyHeadOffId(String shipToPrtyHeadOffId) {
    this.shipToPrtyHeadOffId = shipToPrtyHeadOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrtyBrncOffId(String shipToPrtyBrncOffId) {
    this.shipToPrtyBrncOffId = shipToPrtyBrncOffId;
    return this;
  }

  /**
   * 荷届先コード（事業所）
   * @return shipToPrtyBrncOffId
  */
  
  @Schema(name = "ship_to_prty_brnc_off_id", description = "荷届先コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prty_brnc_off_id")
  public String getShipToPrtyBrncOffId() {
    return shipToPrtyBrncOffId;
  }

  public void setShipToPrtyBrncOffId(String shipToPrtyBrncOffId) {
    this.shipToPrtyBrncOffId = shipToPrtyBrncOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrtyNameTxt(String shipToPrtyNameTxt) {
    this.shipToPrtyNameTxt = shipToPrtyNameTxt;
    return this;
  }

  /**
   * 荷届先名（漢字）
   * @return shipToPrtyNameTxt
  */
  
  @Schema(name = "ship_to_prty_name_txt", description = "荷届先名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prty_name_txt")
  public String getShipToPrtyNameTxt() {
    return shipToPrtyNameTxt;
  }

  public void setShipToPrtyNameTxt(String shipToPrtyNameTxt) {
    this.shipToPrtyNameTxt = shipToPrtyNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToSctId(String shipToSctId) {
    this.shipToSctId = shipToSctId;
    return this;
  }

  /**
   * 荷届先部門コード
   * @return shipToSctId
  */
  
  @Schema(name = "ship_to_sct_id", description = "荷届先部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_sct_id")
  public String getShipToSctId() {
    return shipToSctId;
  }

  public void setShipToSctId(String shipToSctId) {
    this.shipToSctId = shipToSctId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToSctNameTxt(String shipToSctNameTxt) {
    this.shipToSctNameTxt = shipToSctNameTxt;
    return this;
  }

  /**
   * 荷届先部門名（漢字）
   * @return shipToSctNameTxt
  */
  
  @Schema(name = "ship_to_sct_name_txt", description = "荷届先部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_sct_name_txt")
  public String getShipToSctNameTxt() {
    return shipToSctNameTxt;
  }

  public void setShipToSctNameTxt(String shipToSctNameTxt) {
    this.shipToSctNameTxt = shipToSctNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrimCntId(String shipToPrimCntId) {
    this.shipToPrimCntId = shipToPrimCntId;
    return this;
  }

  /**
   * 荷届先担当者コード
   * @return shipToPrimCntId
  */
  
  @Schema(name = "ship_to_prim_cnt_id", description = "荷届先担当者コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prim_cnt_id")
  public String getShipToPrimCntId() {
    return shipToPrimCntId;
  }

  public void setShipToPrimCntId(String shipToPrimCntId) {
    this.shipToPrimCntId = shipToPrimCntId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrimCntPersNameTxt(String shipToPrimCntPersNameTxt) {
    this.shipToPrimCntPersNameTxt = shipToPrimCntPersNameTxt;
    return this;
  }

  /**
   * 荷届先担当者名（漢字）
   * @return shipToPrimCntPersNameTxt
  */
  
  @Schema(name = "ship_to_prim_cnt_pers_name_txt", description = "荷届先担当者名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prim_cnt_pers_name_txt")
  public String getShipToPrimCntPersNameTxt() {
    return shipToPrimCntPersNameTxt;
  }

  public void setShipToPrimCntPersNameTxt(String shipToPrimCntPersNameTxt) {
    this.shipToPrimCntPersNameTxt = shipToPrimCntPersNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToTelCmmCmpNumTxt(String shipToTelCmmCmpNumTxt) {
    this.shipToTelCmmCmpNumTxt = shipToTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 荷届先電話番号
   * @return shipToTelCmmCmpNumTxt
  */
  
  @Schema(name = "ship_to_tel_cmm_cmp_num_txt", description = "荷届先電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_tel_cmm_cmp_num_txt")
  public String getShipToTelCmmCmpNumTxt() {
    return shipToTelCmmCmpNumTxt;
  }

  public void setShipToTelCmmCmpNumTxt(String shipToTelCmmCmpNumTxt) {
    this.shipToTelCmmCmpNumTxt = shipToTelCmmCmpNumTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPstlAdrsCtyId(String shipToPstlAdrsCtyId) {
    this.shipToPstlAdrsCtyId = shipToPstlAdrsCtyId;
    return this;
  }

  /**
   * 荷届先市区町村コード
   * @return shipToPstlAdrsCtyId
  */
  
  @Schema(name = "ship_to_pstl_adrs_cty_id", description = "荷届先市区町村コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_pstl_adrs_cty_id")
  public String getShipToPstlAdrsCtyId() {
    return shipToPstlAdrsCtyId;
  }

  public void setShipToPstlAdrsCtyId(String shipToPstlAdrsCtyId) {
    this.shipToPstlAdrsCtyId = shipToPstlAdrsCtyId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPstlAdrsId(String shipToPstlAdrsId) {
    this.shipToPstlAdrsId = shipToPstlAdrsId;
    return this;
  }

  /**
   * 荷届先住所コード
   * @return shipToPstlAdrsId
  */
  
  @Schema(name = "ship_to_pstl_adrs_id", description = "荷届先住所コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_pstl_adrs_id")
  public String getShipToPstlAdrsId() {
    return shipToPstlAdrsId;
  }

  public void setShipToPstlAdrsId(String shipToPstlAdrsId) {
    this.shipToPstlAdrsId = shipToPstlAdrsId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPstlAdrsLineOneTxt(String shipToPstlAdrsLineOneTxt) {
    this.shipToPstlAdrsLineOneTxt = shipToPstlAdrsLineOneTxt;
    return this;
  }

  /**
   * 荷届先住所（漢字）
   * @return shipToPstlAdrsLineOneTxt
  */
  
  @Schema(name = "ship_to_pstl_adrs_line_one_txt", description = "荷届先住所（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_pstl_adrs_line_one_txt")
  public String getShipToPstlAdrsLineOneTxt() {
    return shipToPstlAdrsLineOneTxt;
  }

  public void setShipToPstlAdrsLineOneTxt(String shipToPstlAdrsLineOneTxt) {
    this.shipToPstlAdrsLineOneTxt = shipToPstlAdrsLineOneTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPstcCd(String shipToPstcCd) {
    this.shipToPstcCd = shipToPstcCd;
    return this;
  }

  /**
   * 荷届先郵便番号
   * @return shipToPstcCd
  */
  
  @Schema(name = "ship_to_pstc_cd", description = "荷届先郵便番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_pstc_cd")
  public String getShipToPstcCd() {
    return shipToPstcCd;
  }

  public void setShipToPstcCd(String shipToPstcCd) {
    this.shipToPstcCd = shipToPstcCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner plcCdPrtyId(String plcCdPrtyId) {
    this.plcCdPrtyId = plcCdPrtyId;
    return this;
  }

  /**
   * 場所コード
   * @return plcCdPrtyId
  */
  
  @Schema(name = "plc_cd_prty_id", description = "場所コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plc_cd_prty_id")
  public String getPlcCdPrtyId() {
    return plcCdPrtyId;
  }

  public void setPlcCdPrtyId(String plcCdPrtyId) {
    this.plcCdPrtyId = plcCdPrtyId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner glnPrtyId(String glnPrtyId) {
    this.glnPrtyId = glnPrtyId;
    return this;
  }

  /**
   * GLNコード
   * @return glnPrtyId
  */
  
  @Schema(name = "gln_prty_id", description = "GLNコード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gln_prty_id")
  public String getGlnPrtyId() {
    return glnPrtyId;
  }

  public void setGlnPrtyId(String glnPrtyId) {
    this.glnPrtyId = glnPrtyId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner jpnUplcCd(String jpnUplcCd) {
    this.jpnUplcCd = jpnUplcCd;
    return this;
  }

  /**
   * 位置情報コード
   * @return jpnUplcCd
  */
  
  @Schema(name = "jpn_uplc_cd", description = "位置情報コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jpn_uplc_cd")
  public String getJpnUplcCd() {
    return jpnUplcCd;
  }

  public void setJpnUplcCd(String jpnUplcCd) {
    this.jpnUplcCd = jpnUplcCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner jpnVanSrvcCd(String jpnVanSrvcCd) {
    this.jpnVanSrvcCd = jpnVanSrvcCd;
    return this;
  }

  /**
   * サービス識別コード
   * @return jpnVanSrvcCd
  */
  
  @Schema(name = "jpn_van_srvc_cd", description = "サービス識別コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jpn_van_srvc_cd")
  public String getJpnVanSrvcCd() {
    return jpnVanSrvcCd;
  }

  public void setJpnVanSrvcCd(String jpnVanSrvcCd) {
    this.jpnVanSrvcCd = jpnVanSrvcCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner jpnVanVansCd(String jpnVanVansCd) {
    this.jpnVanVansCd = jpnVanVansCd;
    return this;
  }

  /**
   * 個別管理コード
   * @return jpnVanVansCd
  */
  
  @Schema(name = "jpn_van_vans_cd", description = "個別管理コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jpn_van_vans_cd")
  public String getJpnVanVansCd() {
    return jpnVanVansCd;
  }

  public void setJpnVanVansCd(String jpnVanVansCd) {
    this.jpnVanVansCd = jpnVanVansCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner freeTimeInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner> freeTimeInfo) {
    this.freeTimeInfo = freeTimeInfo;
    return this;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner addFreeTimeInfoItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner freeTimeInfoItem) {
    if (this.freeTimeInfo == null) {
      this.freeTimeInfo = new ArrayList<>();
    }
    this.freeTimeInfo.add(freeTimeInfoItem);
    return this;
  }

  /**
   * フリータイム情報
   * @return freeTimeInfo
  */
  @Valid 
  @Schema(name = "free_time_info", description = "フリータイム情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_time_info")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner> getFreeTimeInfo() {
    return freeTimeInfo;
  }

  public void setFreeTimeInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner> freeTimeInfo) {
    this.freeTimeInfo = freeTimeInfo;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrtyRqrm(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm shipToPrtyRqrm) {
    this.shipToPrtyRqrm = shipToPrtyRqrm;
    return this;
  }

  /**
   * Get shipToPrtyRqrm
   * @return shipToPrtyRqrm
  */
  @Valid 
  @Schema(name = "ship_to_prty_rqrm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prty_rqrm")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm getShipToPrtyRqrm() {
    return shipToPrtyRqrm;
  }

  public void setShipToPrtyRqrm(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInnerShipToPrtyRqrm shipToPrtyRqrm) {
    this.shipToPrtyRqrm = shipToPrtyRqrm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner) o;
    return Objects.equals(this.shipToPrtyHeadOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPrtyHeadOffId) &&
        Objects.equals(this.shipToPrtyBrncOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPrtyBrncOffId) &&
        Objects.equals(this.shipToPrtyNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPrtyNameTxt) &&
        Objects.equals(this.shipToSctId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToSctId) &&
        Objects.equals(this.shipToSctNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToSctNameTxt) &&
        Objects.equals(this.shipToPrimCntId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPrimCntId) &&
        Objects.equals(this.shipToPrimCntPersNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPrimCntPersNameTxt) &&
        Objects.equals(this.shipToTelCmmCmpNumTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToTelCmmCmpNumTxt) &&
        Objects.equals(this.shipToPstlAdrsCtyId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPstlAdrsCtyId) &&
        Objects.equals(this.shipToPstlAdrsId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPstlAdrsId) &&
        Objects.equals(this.shipToPstlAdrsLineOneTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPstlAdrsLineOneTxt) &&
        Objects.equals(this.shipToPstcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPstcCd) &&
        Objects.equals(this.plcCdPrtyId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.plcCdPrtyId) &&
        Objects.equals(this.glnPrtyId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.glnPrtyId) &&
        Objects.equals(this.jpnUplcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.jpnUplcCd) &&
        Objects.equals(this.jpnVanSrvcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.jpnVanSrvcCd) &&
        Objects.equals(this.jpnVanVansCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.jpnVanVansCd) &&
        Objects.equals(this.freeTimeInfo, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.freeTimeInfo) &&
        Objects.equals(this.shipToPrtyRqrm, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner.shipToPrtyRqrm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipToPrtyHeadOffId, shipToPrtyBrncOffId, shipToPrtyNameTxt, shipToSctId, shipToSctNameTxt, shipToPrimCntId, shipToPrimCntPersNameTxt, shipToTelCmmCmpNumTxt, shipToPstlAdrsCtyId, shipToPstlAdrsId, shipToPstlAdrsLineOneTxt, shipToPstcCd, plcCdPrtyId, glnPrtyId, jpnUplcCd, jpnVanSrvcCd, jpnVanVansCd, freeTimeInfo, shipToPrtyRqrm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner {\n");
    sb.append("    shipToPrtyHeadOffId: ").append(toIndentedString(shipToPrtyHeadOffId)).append("\n");
    sb.append("    shipToPrtyBrncOffId: ").append(toIndentedString(shipToPrtyBrncOffId)).append("\n");
    sb.append("    shipToPrtyNameTxt: ").append(toIndentedString(shipToPrtyNameTxt)).append("\n");
    sb.append("    shipToSctId: ").append(toIndentedString(shipToSctId)).append("\n");
    sb.append("    shipToSctNameTxt: ").append(toIndentedString(shipToSctNameTxt)).append("\n");
    sb.append("    shipToPrimCntId: ").append(toIndentedString(shipToPrimCntId)).append("\n");
    sb.append("    shipToPrimCntPersNameTxt: ").append(toIndentedString(shipToPrimCntPersNameTxt)).append("\n");
    sb.append("    shipToTelCmmCmpNumTxt: ").append(toIndentedString(shipToTelCmmCmpNumTxt)).append("\n");
    sb.append("    shipToPstlAdrsCtyId: ").append(toIndentedString(shipToPstlAdrsCtyId)).append("\n");
    sb.append("    shipToPstlAdrsId: ").append(toIndentedString(shipToPstlAdrsId)).append("\n");
    sb.append("    shipToPstlAdrsLineOneTxt: ").append(toIndentedString(shipToPstlAdrsLineOneTxt)).append("\n");
    sb.append("    shipToPstcCd: ").append(toIndentedString(shipToPstcCd)).append("\n");
    sb.append("    plcCdPrtyId: ").append(toIndentedString(plcCdPrtyId)).append("\n");
    sb.append("    glnPrtyId: ").append(toIndentedString(glnPrtyId)).append("\n");
    sb.append("    jpnUplcCd: ").append(toIndentedString(jpnUplcCd)).append("\n");
    sb.append("    jpnVanSrvcCd: ").append(toIndentedString(jpnVanSrvcCd)).append("\n");
    sb.append("    jpnVanVansCd: ").append(toIndentedString(jpnVanVansCd)).append("\n");
    sb.append("    freeTimeInfo: ").append(toIndentedString(freeTimeInfo)).append("\n");
    sb.append("    shipToPrtyRqrm: ").append(toIndentedString(shipToPrtyRqrm)).append("\n");
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

