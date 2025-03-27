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
 * DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner
 */

@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cns_line_item_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner {

  private String lineItemNumId;

  private String sevOrdNumId;

  private String cnsgCrgItemNumId;

  private String buyAssiItemCd;

  private String sellAssiItemCd;

  private String wrhsAssiItemCd;

  private String itemNameTxt;

  private String godsIdcsInOtsPckeNameTxt;

  private BigDecimal numOfIstdUntlQuan;

  private BigDecimal numOfIstdQuan;

  private String sevNumUntCd;

  private BigDecimal istdPckeWeigMeas;

  private String sevWeigUntCd;

  private BigDecimal istdPckeVolMeas;

  private String sevVolUntCd;

  private BigDecimal istdQuanMeas;

  private String cnteNumUntCd;

  private String dcpvTrpnPckgTxt;

  private String pckeFrmCd;

  private String pckeFrmNameCd;

  private String crgHndTrmsSpclIsrsTxt;

  private String glbRetbAsseId;

  private BigDecimal totlRtiQuanQuan;

  private BigDecimal chrgOfPckeCtrlNumUntAmnt;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner lineItemNumId(String lineItemNumId) {
    this.lineItemNumId = lineItemNumId;
    return this;
  }

  /**
   * 明細番号
   * @return lineItemNumId
  */
  
  @Schema(name = "line_item_num_id", example = "1234567890", description = "明細番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line_item_num_id")
  public String getLineItemNumId() {
    return lineItemNumId;
  }

  public void setLineItemNumId(String lineItemNumId) {
    this.lineItemNumId = lineItemNumId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner sevOrdNumId(String sevOrdNumId) {
    this.sevOrdNumId = sevOrdNumId;
    return this;
  }

  /**
   * 個別注文番号
   * @return sevOrdNumId
  */
  
  @Schema(name = "sev_ord_num_id", description = "個別注文番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sev_ord_num_id")
  public String getSevOrdNumId() {
    return sevOrdNumId;
  }

  public void setSevOrdNumId(String sevOrdNumId) {
    this.sevOrdNumId = sevOrdNumId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner cnsgCrgItemNumId(String cnsgCrgItemNumId) {
    this.cnsgCrgItemNumId = cnsgCrgItemNumId;
    return this;
  }

  /**
   * 運送品Ｎｏ．（荷送人）
   * @return cnsgCrgItemNumId
  */
  
  @Schema(name = "cnsg_crg_item_num_id", description = "運送品Ｎｏ．（荷送人）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_crg_item_num_id")
  public String getCnsgCrgItemNumId() {
    return cnsgCrgItemNumId;
  }

  public void setCnsgCrgItemNumId(String cnsgCrgItemNumId) {
    this.cnsgCrgItemNumId = cnsgCrgItemNumId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner buyAssiItemCd(String buyAssiItemCd) {
    this.buyAssiItemCd = buyAssiItemCd;
    return this;
  }

  /**
   * 発注者品名コード
   * @return buyAssiItemCd
  */
  
  @Schema(name = "buy_assi_item_cd", description = "発注者品名コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buy_assi_item_cd")
  public String getBuyAssiItemCd() {
    return buyAssiItemCd;
  }

  public void setBuyAssiItemCd(String buyAssiItemCd) {
    this.buyAssiItemCd = buyAssiItemCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner sellAssiItemCd(String sellAssiItemCd) {
    this.sellAssiItemCd = sellAssiItemCd;
    return this;
  }

  /**
   * 受注者品名コード
   * @return sellAssiItemCd
  */
  
  @Schema(name = "sell_assi_item_cd", description = "受注者品名コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sell_assi_item_cd")
  public String getSellAssiItemCd() {
    return sellAssiItemCd;
  }

  public void setSellAssiItemCd(String sellAssiItemCd) {
    this.sellAssiItemCd = sellAssiItemCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner wrhsAssiItemCd(String wrhsAssiItemCd) {
    this.wrhsAssiItemCd = wrhsAssiItemCd;
    return this;
  }

  /**
   * 倉庫事業者品名コード
   * @return wrhsAssiItemCd
  */
  
  @Schema(name = "wrhs_assi_item_cd", description = "倉庫事業者品名コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wrhs_assi_item_cd")
  public String getWrhsAssiItemCd() {
    return wrhsAssiItemCd;
  }

  public void setWrhsAssiItemCd(String wrhsAssiItemCd) {
    this.wrhsAssiItemCd = wrhsAssiItemCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner itemNameTxt(String itemNameTxt) {
    this.itemNameTxt = itemNameTxt;
    return this;
  }

  /**
   * 商品名（漢字）
   * @return itemNameTxt
  */
  
  @Schema(name = "item_name_txt", description = "商品名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_name_txt")
  public String getItemNameTxt() {
    return itemNameTxt;
  }

  public void setItemNameTxt(String itemNameTxt) {
    this.itemNameTxt = itemNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner godsIdcsInOtsPckeNameTxt(String godsIdcsInOtsPckeNameTxt) {
    this.godsIdcsInOtsPckeNameTxt = godsIdcsInOtsPckeNameTxt;
    return this;
  }

  /**
   * 運送品標記用品名（漢字）
   * @return godsIdcsInOtsPckeNameTxt
  */
  
  @Schema(name = "gods_idcs_in_ots_pcke_name_txt", description = "運送品標記用品名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gods_idcs_in_ots_pcke_name_txt")
  public String getGodsIdcsInOtsPckeNameTxt() {
    return godsIdcsInOtsPckeNameTxt;
  }

  public void setGodsIdcsInOtsPckeNameTxt(String godsIdcsInOtsPckeNameTxt) {
    this.godsIdcsInOtsPckeNameTxt = godsIdcsInOtsPckeNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner numOfIstdUntlQuan(BigDecimal numOfIstdUntlQuan) {
    this.numOfIstdUntlQuan = numOfIstdUntlQuan;
    return this;
  }

  /**
   * ユニットロード数（依頼）
   * @return numOfIstdUntlQuan
  */
  @Valid 
  @Schema(name = "num_of_istd_untl_quan", description = "ユニットロード数（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_of_istd_untl_quan")
  public BigDecimal getNumOfIstdUntlQuan() {
    return numOfIstdUntlQuan;
  }

  public void setNumOfIstdUntlQuan(BigDecimal numOfIstdUntlQuan) {
    this.numOfIstdUntlQuan = numOfIstdUntlQuan;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner numOfIstdQuan(BigDecimal numOfIstdQuan) {
    this.numOfIstdQuan = numOfIstdQuan;
    return this;
  }

  /**
   * 個数（依頼）
   * @return numOfIstdQuan
  */
  @Valid 
  @Schema(name = "num_of_istd_quan", description = "個数（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_of_istd_quan")
  public BigDecimal getNumOfIstdQuan() {
    return numOfIstdQuan;
  }

  public void setNumOfIstdQuan(BigDecimal numOfIstdQuan) {
    this.numOfIstdQuan = numOfIstdQuan;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner sevNumUntCd(String sevNumUntCd) {
    this.sevNumUntCd = sevNumUntCd;
    return this;
  }

  /**
   * 個別個数単位コード
   * @return sevNumUntCd
  */
  
  @Schema(name = "sev_num_unt_cd", description = "個別個数単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sev_num_unt_cd")
  public String getSevNumUntCd() {
    return sevNumUntCd;
  }

  public void setSevNumUntCd(String sevNumUntCd) {
    this.sevNumUntCd = sevNumUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner istdPckeWeigMeas(BigDecimal istdPckeWeigMeas) {
    this.istdPckeWeigMeas = istdPckeWeigMeas;
    return this;
  }

  /**
   * 運送梱包重量（依頼）
   * @return istdPckeWeigMeas
  */
  @Valid 
  @Schema(name = "istd_pcke_weig_meas", description = "運送梱包重量（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("istd_pcke_weig_meas")
  public BigDecimal getIstdPckeWeigMeas() {
    return istdPckeWeigMeas;
  }

  public void setIstdPckeWeigMeas(BigDecimal istdPckeWeigMeas) {
    this.istdPckeWeigMeas = istdPckeWeigMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner sevWeigUntCd(String sevWeigUntCd) {
    this.sevWeigUntCd = sevWeigUntCd;
    return this;
  }

  /**
   * 個別重量単位コード
   * @return sevWeigUntCd
  */
  
  @Schema(name = "sev_weig_unt_cd", description = "個別重量単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sev_weig_unt_cd")
  public String getSevWeigUntCd() {
    return sevWeigUntCd;
  }

  public void setSevWeigUntCd(String sevWeigUntCd) {
    this.sevWeigUntCd = sevWeigUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner istdPckeVolMeas(BigDecimal istdPckeVolMeas) {
    this.istdPckeVolMeas = istdPckeVolMeas;
    return this;
  }

  /**
   * 運送梱包容積（依頼）
   * @return istdPckeVolMeas
  */
  @Valid 
  @Schema(name = "istd_pcke_vol_meas", description = "運送梱包容積（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("istd_pcke_vol_meas")
  public BigDecimal getIstdPckeVolMeas() {
    return istdPckeVolMeas;
  }

  public void setIstdPckeVolMeas(BigDecimal istdPckeVolMeas) {
    this.istdPckeVolMeas = istdPckeVolMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner sevVolUntCd(String sevVolUntCd) {
    this.sevVolUntCd = sevVolUntCd;
    return this;
  }

  /**
   * 個別容積単位コード
   * @return sevVolUntCd
  */
  
  @Schema(name = "sev_vol_unt_cd", description = "個別容積単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sev_vol_unt_cd")
  public String getSevVolUntCd() {
    return sevVolUntCd;
  }

  public void setSevVolUntCd(String sevVolUntCd) {
    this.sevVolUntCd = sevVolUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner istdQuanMeas(BigDecimal istdQuanMeas) {
    this.istdQuanMeas = istdQuanMeas;
    return this;
  }

  /**
   * 数量（依頼）
   * @return istdQuanMeas
  */
  @Valid 
  @Schema(name = "istd_quan_meas", description = "数量（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("istd_quan_meas")
  public BigDecimal getIstdQuanMeas() {
    return istdQuanMeas;
  }

  public void setIstdQuanMeas(BigDecimal istdQuanMeas) {
    this.istdQuanMeas = istdQuanMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner cnteNumUntCd(String cnteNumUntCd) {
    this.cnteNumUntCd = cnteNumUntCd;
    return this;
  }

  /**
   * 内容数量単位コード
   * @return cnteNumUntCd
  */
  
  @Schema(name = "cnte_num_unt_cd", description = "内容数量単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnte_num_unt_cd")
  public String getCnteNumUntCd() {
    return cnteNumUntCd;
  }

  public void setCnteNumUntCd(String cnteNumUntCd) {
    this.cnteNumUntCd = cnteNumUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner dcpvTrpnPckgTxt(String dcpvTrpnPckgTxt) {
    this.dcpvTrpnPckgTxt = dcpvTrpnPckgTxt;
    return this;
  }

  /**
   * 記述式運送梱包寸法
   * @return dcpvTrpnPckgTxt
  */
  
  @Schema(name = "dcpv_trpn_pckg_txt", description = "記述式運送梱包寸法", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dcpv_trpn_pckg_txt")
  public String getDcpvTrpnPckgTxt() {
    return dcpvTrpnPckgTxt;
  }

  public void setDcpvTrpnPckgTxt(String dcpvTrpnPckgTxt) {
    this.dcpvTrpnPckgTxt = dcpvTrpnPckgTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner pckeFrmCd(String pckeFrmCd) {
    this.pckeFrmCd = pckeFrmCd;
    return this;
  }

  /**
   * 荷姿コード
   * @return pckeFrmCd
  */
  
  @Schema(name = "pcke_frm_cd", description = "荷姿コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pcke_frm_cd")
  public String getPckeFrmCd() {
    return pckeFrmCd;
  }

  public void setPckeFrmCd(String pckeFrmCd) {
    this.pckeFrmCd = pckeFrmCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner pckeFrmNameCd(String pckeFrmNameCd) {
    this.pckeFrmNameCd = pckeFrmNameCd;
    return this;
  }

  /**
   * 荷姿名（漢字）
   * @return pckeFrmNameCd
  */
  
  @Schema(name = "pcke_frm_name_cd", description = "荷姿名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pcke_frm_name_cd")
  public String getPckeFrmNameCd() {
    return pckeFrmNameCd;
  }

  public void setPckeFrmNameCd(String pckeFrmNameCd) {
    this.pckeFrmNameCd = pckeFrmNameCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner crgHndTrmsSpclIsrsTxt(String crgHndTrmsSpclIsrsTxt) {
    this.crgHndTrmsSpclIsrsTxt = crgHndTrmsSpclIsrsTxt;
    return this;
  }

  /**
   * 荷物取扱条件（漢字）
   * @return crgHndTrmsSpclIsrsTxt
  */
  
  @Schema(name = "crg_hnd_trms_spcl_isrs_txt", description = "荷物取扱条件（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("crg_hnd_trms_spcl_isrs_txt")
  public String getCrgHndTrmsSpclIsrsTxt() {
    return crgHndTrmsSpclIsrsTxt;
  }

  public void setCrgHndTrmsSpclIsrsTxt(String crgHndTrmsSpclIsrsTxt) {
    this.crgHndTrmsSpclIsrsTxt = crgHndTrmsSpclIsrsTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner glbRetbAsseId(String glbRetbAsseId) {
    this.glbRetbAsseId = glbRetbAsseId;
    return this;
  }

  /**
   * GRAI
   * @return glbRetbAsseId
  */
  
  @Schema(name = "glb_retb_asse_id", description = "GRAI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("glb_retb_asse_id")
  public String getGlbRetbAsseId() {
    return glbRetbAsseId;
  }

  public void setGlbRetbAsseId(String glbRetbAsseId) {
    this.glbRetbAsseId = glbRetbAsseId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner totlRtiQuanQuan(BigDecimal totlRtiQuanQuan) {
    this.totlRtiQuanQuan = totlRtiQuanQuan;
    return this;
  }

  /**
   * RTI数量
   * @return totlRtiQuanQuan
  */
  @Valid 
  @Schema(name = "totl_rti_quan_quan", description = "RTI数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totl_rti_quan_quan")
  public BigDecimal getTotlRtiQuanQuan() {
    return totlRtiQuanQuan;
  }

  public void setTotlRtiQuanQuan(BigDecimal totlRtiQuanQuan) {
    this.totlRtiQuanQuan = totlRtiQuanQuan;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner chrgOfPckeCtrlNumUntAmnt(BigDecimal chrgOfPckeCtrlNumUntAmnt) {
    this.chrgOfPckeCtrlNumUntAmnt = chrgOfPckeCtrlNumUntAmnt;
    return this;
  }

  /**
   * 梱包管理番号単位運賃
   * @return chrgOfPckeCtrlNumUntAmnt
  */
  @Valid 
  @Schema(name = "chrg_of_pcke_ctrl_num_unt_amnt", description = "梱包管理番号単位運賃", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chrg_of_pcke_ctrl_num_unt_amnt")
  public BigDecimal getChrgOfPckeCtrlNumUntAmnt() {
    return chrgOfPckeCtrlNumUntAmnt;
  }

  public void setChrgOfPckeCtrlNumUntAmnt(BigDecimal chrgOfPckeCtrlNumUntAmnt) {
    this.chrgOfPckeCtrlNumUntAmnt = chrgOfPckeCtrlNumUntAmnt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner) o;
    return Objects.equals(this.lineItemNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.lineItemNumId) &&
        Objects.equals(this.sevOrdNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.sevOrdNumId) &&
        Objects.equals(this.cnsgCrgItemNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.cnsgCrgItemNumId) &&
        Objects.equals(this.buyAssiItemCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.buyAssiItemCd) &&
        Objects.equals(this.sellAssiItemCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.sellAssiItemCd) &&
        Objects.equals(this.wrhsAssiItemCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.wrhsAssiItemCd) &&
        Objects.equals(this.itemNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.itemNameTxt) &&
        Objects.equals(this.godsIdcsInOtsPckeNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.godsIdcsInOtsPckeNameTxt) &&
        Objects.equals(this.numOfIstdUntlQuan, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.numOfIstdUntlQuan) &&
        Objects.equals(this.numOfIstdQuan, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.numOfIstdQuan) &&
        Objects.equals(this.sevNumUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.sevNumUntCd) &&
        Objects.equals(this.istdPckeWeigMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.istdPckeWeigMeas) &&
        Objects.equals(this.sevWeigUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.sevWeigUntCd) &&
        Objects.equals(this.istdPckeVolMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.istdPckeVolMeas) &&
        Objects.equals(this.sevVolUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.sevVolUntCd) &&
        Objects.equals(this.istdQuanMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.istdQuanMeas) &&
        Objects.equals(this.cnteNumUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.cnteNumUntCd) &&
        Objects.equals(this.dcpvTrpnPckgTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.dcpvTrpnPckgTxt) &&
        Objects.equals(this.pckeFrmCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.pckeFrmCd) &&
        Objects.equals(this.pckeFrmNameCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.pckeFrmNameCd) &&
        Objects.equals(this.crgHndTrmsSpclIsrsTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.crgHndTrmsSpclIsrsTxt) &&
        Objects.equals(this.glbRetbAsseId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.glbRetbAsseId) &&
        Objects.equals(this.totlRtiQuanQuan, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.totlRtiQuanQuan) &&
        Objects.equals(this.chrgOfPckeCtrlNumUntAmnt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner.chrgOfPckeCtrlNumUntAmnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemNumId, sevOrdNumId, cnsgCrgItemNumId, buyAssiItemCd, sellAssiItemCd, wrhsAssiItemCd, itemNameTxt, godsIdcsInOtsPckeNameTxt, numOfIstdUntlQuan, numOfIstdQuan, sevNumUntCd, istdPckeWeigMeas, sevWeigUntCd, istdPckeVolMeas, sevVolUntCd, istdQuanMeas, cnteNumUntCd, dcpvTrpnPckgTxt, pckeFrmCd, pckeFrmNameCd, crgHndTrmsSpclIsrsTxt, glbRetbAsseId, totlRtiQuanQuan, chrgOfPckeCtrlNumUntAmnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner {\n");
    sb.append("    lineItemNumId: ").append(toIndentedString(lineItemNumId)).append("\n");
    sb.append("    sevOrdNumId: ").append(toIndentedString(sevOrdNumId)).append("\n");
    sb.append("    cnsgCrgItemNumId: ").append(toIndentedString(cnsgCrgItemNumId)).append("\n");
    sb.append("    buyAssiItemCd: ").append(toIndentedString(buyAssiItemCd)).append("\n");
    sb.append("    sellAssiItemCd: ").append(toIndentedString(sellAssiItemCd)).append("\n");
    sb.append("    wrhsAssiItemCd: ").append(toIndentedString(wrhsAssiItemCd)).append("\n");
    sb.append("    itemNameTxt: ").append(toIndentedString(itemNameTxt)).append("\n");
    sb.append("    godsIdcsInOtsPckeNameTxt: ").append(toIndentedString(godsIdcsInOtsPckeNameTxt)).append("\n");
    sb.append("    numOfIstdUntlQuan: ").append(toIndentedString(numOfIstdUntlQuan)).append("\n");
    sb.append("    numOfIstdQuan: ").append(toIndentedString(numOfIstdQuan)).append("\n");
    sb.append("    sevNumUntCd: ").append(toIndentedString(sevNumUntCd)).append("\n");
    sb.append("    istdPckeWeigMeas: ").append(toIndentedString(istdPckeWeigMeas)).append("\n");
    sb.append("    sevWeigUntCd: ").append(toIndentedString(sevWeigUntCd)).append("\n");
    sb.append("    istdPckeVolMeas: ").append(toIndentedString(istdPckeVolMeas)).append("\n");
    sb.append("    sevVolUntCd: ").append(toIndentedString(sevVolUntCd)).append("\n");
    sb.append("    istdQuanMeas: ").append(toIndentedString(istdQuanMeas)).append("\n");
    sb.append("    cnteNumUntCd: ").append(toIndentedString(cnteNumUntCd)).append("\n");
    sb.append("    dcpvTrpnPckgTxt: ").append(toIndentedString(dcpvTrpnPckgTxt)).append("\n");
    sb.append("    pckeFrmCd: ").append(toIndentedString(pckeFrmCd)).append("\n");
    sb.append("    pckeFrmNameCd: ").append(toIndentedString(pckeFrmNameCd)).append("\n");
    sb.append("    crgHndTrmsSpclIsrsTxt: ").append(toIndentedString(crgHndTrmsSpclIsrsTxt)).append("\n");
    sb.append("    glbRetbAsseId: ").append(toIndentedString(glbRetbAsseId)).append("\n");
    sb.append("    totlRtiQuanQuan: ").append(toIndentedString(totlRtiQuanQuan)).append("\n");
    sb.append("    chrgOfPckeCtrlNumUntAmnt: ").append(toIndentedString(chrgOfPckeCtrlNumUntAmnt)).append("\n");
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

