package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInnerShipFromPrtyRqrm;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner
 */

@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_ship_from_prty_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner {

  private String shipFromPrtyHeadOffId;

  private String shipFromPrtyBrncOffId;

  private String shipFromPrtyNameTxt;

  private String shipFromSctId;

  private String shipFromSctNameTxt;

  private String shipFromTelCmmCmpNumTxt;

  private String shipFromPstlAdrsCtyId;

  private String shipFromPstlAdrsId;

  private String shipFromPstlAdrsLineOneTxt;

  private String shipFromPstcCd;

  private String plcCdPrtyId;

  private String glnPrtyId;

  private String jpnUplcCd;

  private String jpnVanSrvcCd;

  private String jpnVanVansCd;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInnerShipFromPrtyRqrm shipFromPrtyRqrm;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner> cutOffInfo = new ArrayList<>();

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPrtyHeadOffId(String shipFromPrtyHeadOffId) {
    this.shipFromPrtyHeadOffId = shipFromPrtyHeadOffId;
    return this;
  }

  /**
   * 出荷場所コード（本社）
   * @return shipFromPrtyHeadOffId
  */
  
  @Schema(name = "ship_from_prty_head_off_id", description = "出荷場所コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_prty_head_off_id")
  public String getShipFromPrtyHeadOffId() {
    return shipFromPrtyHeadOffId;
  }

  public void setShipFromPrtyHeadOffId(String shipFromPrtyHeadOffId) {
    this.shipFromPrtyHeadOffId = shipFromPrtyHeadOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPrtyBrncOffId(String shipFromPrtyBrncOffId) {
    this.shipFromPrtyBrncOffId = shipFromPrtyBrncOffId;
    return this;
  }

  /**
   * 出荷場所コード（事業所）
   * @return shipFromPrtyBrncOffId
  */
  
  @Schema(name = "ship_from_prty_brnc_off_id", description = "出荷場所コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_prty_brnc_off_id")
  public String getShipFromPrtyBrncOffId() {
    return shipFromPrtyBrncOffId;
  }

  public void setShipFromPrtyBrncOffId(String shipFromPrtyBrncOffId) {
    this.shipFromPrtyBrncOffId = shipFromPrtyBrncOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPrtyNameTxt(String shipFromPrtyNameTxt) {
    this.shipFromPrtyNameTxt = shipFromPrtyNameTxt;
    return this;
  }

  /**
   * 出荷場所名（漢字）
   * @return shipFromPrtyNameTxt
  */
  
  @Schema(name = "ship_from_prty_name_txt", description = "出荷場所名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_prty_name_txt")
  public String getShipFromPrtyNameTxt() {
    return shipFromPrtyNameTxt;
  }

  public void setShipFromPrtyNameTxt(String shipFromPrtyNameTxt) {
    this.shipFromPrtyNameTxt = shipFromPrtyNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromSctId(String shipFromSctId) {
    this.shipFromSctId = shipFromSctId;
    return this;
  }

  /**
   * 出荷場所部門コード
   * @return shipFromSctId
  */
  
  @Schema(name = "ship_from_sct_id", description = "出荷場所部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_sct_id")
  public String getShipFromSctId() {
    return shipFromSctId;
  }

  public void setShipFromSctId(String shipFromSctId) {
    this.shipFromSctId = shipFromSctId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromSctNameTxt(String shipFromSctNameTxt) {
    this.shipFromSctNameTxt = shipFromSctNameTxt;
    return this;
  }

  /**
   * 出荷場所部門名（漢字）
   * @return shipFromSctNameTxt
  */
  
  @Schema(name = "ship_from_sct_name_txt", description = "出荷場所部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_sct_name_txt")
  public String getShipFromSctNameTxt() {
    return shipFromSctNameTxt;
  }

  public void setShipFromSctNameTxt(String shipFromSctNameTxt) {
    this.shipFromSctNameTxt = shipFromSctNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromTelCmmCmpNumTxt(String shipFromTelCmmCmpNumTxt) {
    this.shipFromTelCmmCmpNumTxt = shipFromTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 出荷場所電話番号
   * @return shipFromTelCmmCmpNumTxt
  */
  
  @Schema(name = "ship_from_tel_cmm_cmp_num_txt", description = "出荷場所電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_tel_cmm_cmp_num_txt")
  public String getShipFromTelCmmCmpNumTxt() {
    return shipFromTelCmmCmpNumTxt;
  }

  public void setShipFromTelCmmCmpNumTxt(String shipFromTelCmmCmpNumTxt) {
    this.shipFromTelCmmCmpNumTxt = shipFromTelCmmCmpNumTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPstlAdrsCtyId(String shipFromPstlAdrsCtyId) {
    this.shipFromPstlAdrsCtyId = shipFromPstlAdrsCtyId;
    return this;
  }

  /**
   * 出荷場所市区町村コード
   * @return shipFromPstlAdrsCtyId
  */
  
  @Schema(name = "ship_from_pstl_adrs_cty_id", description = "出荷場所市区町村コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_pstl_adrs_cty_id")
  public String getShipFromPstlAdrsCtyId() {
    return shipFromPstlAdrsCtyId;
  }

  public void setShipFromPstlAdrsCtyId(String shipFromPstlAdrsCtyId) {
    this.shipFromPstlAdrsCtyId = shipFromPstlAdrsCtyId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPstlAdrsId(String shipFromPstlAdrsId) {
    this.shipFromPstlAdrsId = shipFromPstlAdrsId;
    return this;
  }

  /**
   * 出荷場所住所コード
   * @return shipFromPstlAdrsId
  */
  
  @Schema(name = "ship_from_pstl_adrs_id", description = "出荷場所住所コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_pstl_adrs_id")
  public String getShipFromPstlAdrsId() {
    return shipFromPstlAdrsId;
  }

  public void setShipFromPstlAdrsId(String shipFromPstlAdrsId) {
    this.shipFromPstlAdrsId = shipFromPstlAdrsId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPstlAdrsLineOneTxt(String shipFromPstlAdrsLineOneTxt) {
    this.shipFromPstlAdrsLineOneTxt = shipFromPstlAdrsLineOneTxt;
    return this;
  }

  /**
   * 出荷場所住所（漢字）
   * @return shipFromPstlAdrsLineOneTxt
  */
  
  @Schema(name = "ship_from_pstl_adrs_line_one_txt", description = "出荷場所住所（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_pstl_adrs_line_one_txt")
  public String getShipFromPstlAdrsLineOneTxt() {
    return shipFromPstlAdrsLineOneTxt;
  }

  public void setShipFromPstlAdrsLineOneTxt(String shipFromPstlAdrsLineOneTxt) {
    this.shipFromPstlAdrsLineOneTxt = shipFromPstlAdrsLineOneTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPstcCd(String shipFromPstcCd) {
    this.shipFromPstcCd = shipFromPstcCd;
    return this;
  }

  /**
   * 出荷場所郵便番号
   * @return shipFromPstcCd
  */
  
  @Schema(name = "ship_from_pstc_cd", description = "出荷場所郵便番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_pstc_cd")
  public String getShipFromPstcCd() {
    return shipFromPstcCd;
  }

  public void setShipFromPstcCd(String shipFromPstcCd) {
    this.shipFromPstcCd = shipFromPstcCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner plcCdPrtyId(String plcCdPrtyId) {
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

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner glnPrtyId(String glnPrtyId) {
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

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner jpnUplcCd(String jpnUplcCd) {
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

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner jpnVanSrvcCd(String jpnVanSrvcCd) {
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

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner jpnVanVansCd(String jpnVanVansCd) {
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

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPrtyRqrm(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInnerShipFromPrtyRqrm shipFromPrtyRqrm) {
    this.shipFromPrtyRqrm = shipFromPrtyRqrm;
    return this;
  }

  /**
   * Get shipFromPrtyRqrm
   * @return shipFromPrtyRqrm
  */
  @Valid 
  @Schema(name = "ship_from_prty_rqrm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_prty_rqrm")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInnerShipFromPrtyRqrm getShipFromPrtyRqrm() {
    return shipFromPrtyRqrm;
  }

  public void setShipFromPrtyRqrm(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInnerShipFromPrtyRqrm shipFromPrtyRqrm) {
    this.shipFromPrtyRqrm = shipFromPrtyRqrm;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner cutOffInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner> cutOffInfo) {
    this.cutOffInfo = cutOffInfo;
    return this;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner addCutOffInfoItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner cutOffInfoItem) {
    if (this.cutOffInfo == null) {
      this.cutOffInfo = new ArrayList<>();
    }
    this.cutOffInfo.add(cutOffInfoItem);
    return this;
  }

  /**
   * カットオフ情報
   * @return cutOffInfo
  */
  @Valid 
  @Schema(name = "cut_off_info", description = "カットオフ情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cut_off_info")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner> getCutOffInfo() {
    return cutOffInfo;
  }

  public void setCutOffInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner> cutOffInfo) {
    this.cutOffInfo = cutOffInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner) o;
    return Objects.equals(this.shipFromPrtyHeadOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPrtyHeadOffId) &&
        Objects.equals(this.shipFromPrtyBrncOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPrtyBrncOffId) &&
        Objects.equals(this.shipFromPrtyNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPrtyNameTxt) &&
        Objects.equals(this.shipFromSctId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromSctId) &&
        Objects.equals(this.shipFromSctNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromSctNameTxt) &&
        Objects.equals(this.shipFromTelCmmCmpNumTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromTelCmmCmpNumTxt) &&
        Objects.equals(this.shipFromPstlAdrsCtyId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPstlAdrsCtyId) &&
        Objects.equals(this.shipFromPstlAdrsId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPstlAdrsId) &&
        Objects.equals(this.shipFromPstlAdrsLineOneTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPstlAdrsLineOneTxt) &&
        Objects.equals(this.shipFromPstcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPstcCd) &&
        Objects.equals(this.plcCdPrtyId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.plcCdPrtyId) &&
        Objects.equals(this.glnPrtyId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.glnPrtyId) &&
        Objects.equals(this.jpnUplcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.jpnUplcCd) &&
        Objects.equals(this.jpnVanSrvcCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.jpnVanSrvcCd) &&
        Objects.equals(this.jpnVanVansCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.jpnVanVansCd) &&
        Objects.equals(this.shipFromPrtyRqrm, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.shipFromPrtyRqrm) &&
        Objects.equals(this.cutOffInfo, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner.cutOffInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipFromPrtyHeadOffId, shipFromPrtyBrncOffId, shipFromPrtyNameTxt, shipFromSctId, shipFromSctNameTxt, shipFromTelCmmCmpNumTxt, shipFromPstlAdrsCtyId, shipFromPstlAdrsId, shipFromPstlAdrsLineOneTxt, shipFromPstcCd, plcCdPrtyId, glnPrtyId, jpnUplcCd, jpnVanSrvcCd, jpnVanVansCd, shipFromPrtyRqrm, cutOffInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner {\n");
    sb.append("    shipFromPrtyHeadOffId: ").append(toIndentedString(shipFromPrtyHeadOffId)).append("\n");
    sb.append("    shipFromPrtyBrncOffId: ").append(toIndentedString(shipFromPrtyBrncOffId)).append("\n");
    sb.append("    shipFromPrtyNameTxt: ").append(toIndentedString(shipFromPrtyNameTxt)).append("\n");
    sb.append("    shipFromSctId: ").append(toIndentedString(shipFromSctId)).append("\n");
    sb.append("    shipFromSctNameTxt: ").append(toIndentedString(shipFromSctNameTxt)).append("\n");
    sb.append("    shipFromTelCmmCmpNumTxt: ").append(toIndentedString(shipFromTelCmmCmpNumTxt)).append("\n");
    sb.append("    shipFromPstlAdrsCtyId: ").append(toIndentedString(shipFromPstlAdrsCtyId)).append("\n");
    sb.append("    shipFromPstlAdrsId: ").append(toIndentedString(shipFromPstlAdrsId)).append("\n");
    sb.append("    shipFromPstlAdrsLineOneTxt: ").append(toIndentedString(shipFromPstlAdrsLineOneTxt)).append("\n");
    sb.append("    shipFromPstcCd: ").append(toIndentedString(shipFromPstcCd)).append("\n");
    sb.append("    plcCdPrtyId: ").append(toIndentedString(plcCdPrtyId)).append("\n");
    sb.append("    glnPrtyId: ").append(toIndentedString(glnPrtyId)).append("\n");
    sb.append("    jpnUplcCd: ").append(toIndentedString(jpnUplcCd)).append("\n");
    sb.append("    jpnVanSrvcCd: ").append(toIndentedString(jpnVanSrvcCd)).append("\n");
    sb.append("    jpnVanVansCd: ").append(toIndentedString(jpnVanVansCd)).append("\n");
    sb.append("    shipFromPrtyRqrm: ").append(toIndentedString(shipFromPrtyRqrm)).append("\n");
    sb.append("    cutOffInfo: ").append(toIndentedString(cutOffInfo)).append("\n");
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

