package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_drv_info_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner {

  private String drvCtrlNumId;

  private String drvClsOfDrvgLicenseCd;

  private String drvClsOfFklLicenseExstCd;

  private String drvRmkAboutDrvTxt;

  private String drvCmpnNameOfGtpCrtfExstTxt;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner> drvAvbTime = new ArrayList<>();

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvCtrlNumId(String drvCtrlNumId) {
    this.drvCtrlNumId = drvCtrlNumId;
    return this;
  }

  /**
   * 運転手管理コード
   * @return drvCtrlNumId
  */
  
  @Schema(name = "drv_ctrl_num_id", description = "運転手管理コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_ctrl_num_id")
  public String getDrvCtrlNumId() {
    return drvCtrlNumId;
  }

  public void setDrvCtrlNumId(String drvCtrlNumId) {
    this.drvCtrlNumId = drvCtrlNumId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvClsOfDrvgLicenseCd(String drvClsOfDrvgLicenseCd) {
    this.drvClsOfDrvgLicenseCd = drvClsOfDrvgLicenseCd;
    return this;
  }

  /**
   * 免許種類コード
   * @return drvClsOfDrvgLicenseCd
  */
  
  @Schema(name = "drv_cls_of_drvg_license_cd", description = "免許種類コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_cls_of_drvg_license_cd")
  public String getDrvClsOfDrvgLicenseCd() {
    return drvClsOfDrvgLicenseCd;
  }

  public void setDrvClsOfDrvgLicenseCd(String drvClsOfDrvgLicenseCd) {
    this.drvClsOfDrvgLicenseCd = drvClsOfDrvgLicenseCd;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvClsOfFklLicenseExstCd(String drvClsOfFklLicenseExstCd) {
    this.drvClsOfFklLicenseExstCd = drvClsOfFklLicenseExstCd;
    return this;
  }

  /**
   * フォークリフト免許
   * @return drvClsOfFklLicenseExstCd
  */
  
  @Schema(name = "drv_cls_of_fkl_license_exst_cd", description = "フォークリフト免許", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_cls_of_fkl_license_exst_cd")
  public String getDrvClsOfFklLicenseExstCd() {
    return drvClsOfFklLicenseExstCd;
  }

  public void setDrvClsOfFklLicenseExstCd(String drvClsOfFklLicenseExstCd) {
    this.drvClsOfFklLicenseExstCd = drvClsOfFklLicenseExstCd;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvRmkAboutDrvTxt(String drvRmkAboutDrvTxt) {
    this.drvRmkAboutDrvTxt = drvRmkAboutDrvTxt;
    return this;
  }

  /**
   * その他リソース情報
   * @return drvRmkAboutDrvTxt
  */
  
  @Schema(name = "drv_rmk_about_drv_txt", description = "その他リソース情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_rmk_about_drv_txt")
  public String getDrvRmkAboutDrvTxt() {
    return drvRmkAboutDrvTxt;
  }

  public void setDrvRmkAboutDrvTxt(String drvRmkAboutDrvTxt) {
    this.drvRmkAboutDrvTxt = drvRmkAboutDrvTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvCmpnNameOfGtpCrtfExstTxt(String drvCmpnNameOfGtpCrtfExstTxt) {
    this.drvCmpnNameOfGtpCrtfExstTxt = drvCmpnNameOfGtpCrtfExstTxt;
    return this;
  }

  /**
   * 運転手入門証保有
   * @return drvCmpnNameOfGtpCrtfExstTxt
  */
  
  @Schema(name = "drv_cmpn_name_of_gtp_crtf_exst_txt", description = "運転手入門証保有", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_cmpn_name_of_gtp_crtf_exst_txt")
  public String getDrvCmpnNameOfGtpCrtfExstTxt() {
    return drvCmpnNameOfGtpCrtfExstTxt;
  }

  public void setDrvCmpnNameOfGtpCrtfExstTxt(String drvCmpnNameOfGtpCrtfExstTxt) {
    this.drvCmpnNameOfGtpCrtfExstTxt = drvCmpnNameOfGtpCrtfExstTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvAvbTime(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner> drvAvbTime) {
    this.drvAvbTime = drvAvbTime;
    return this;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner addDrvAvbTimeItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner drvAvbTimeItem) {
    if (this.drvAvbTime == null) {
      this.drvAvbTime = new ArrayList<>();
    }
    this.drvAvbTime.add(drvAvbTimeItem);
    return this;
  }

  /**
   * 運転手稼働可能時間
   * @return drvAvbTime
  */
  @Valid 
  @Schema(name = "drv_avb_time", description = "運転手稼働可能時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_avb_time")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner> getDrvAvbTime() {
    return drvAvbTime;
  }

  public void setDrvAvbTime(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInnerDrvAvbTimeInner> drvAvbTime) {
    this.drvAvbTime = drvAvbTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner) o;
    return Objects.equals(this.drvCtrlNumId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner.drvCtrlNumId) &&
        Objects.equals(this.drvClsOfDrvgLicenseCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner.drvClsOfDrvgLicenseCd) &&
        Objects.equals(this.drvClsOfFklLicenseExstCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner.drvClsOfFklLicenseExstCd) &&
        Objects.equals(this.drvRmkAboutDrvTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner.drvRmkAboutDrvTxt) &&
        Objects.equals(this.drvCmpnNameOfGtpCrtfExstTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner.drvCmpnNameOfGtpCrtfExstTxt) &&
        Objects.equals(this.drvAvbTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner.drvAvbTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drvCtrlNumId, drvClsOfDrvgLicenseCd, drvClsOfFklLicenseExstCd, drvRmkAboutDrvTxt, drvCmpnNameOfGtpCrtfExstTxt, drvAvbTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner {\n");
    sb.append("    drvCtrlNumId: ").append(toIndentedString(drvCtrlNumId)).append("\n");
    sb.append("    drvClsOfDrvgLicenseCd: ").append(toIndentedString(drvClsOfDrvgLicenseCd)).append("\n");
    sb.append("    drvClsOfFklLicenseExstCd: ").append(toIndentedString(drvClsOfFklLicenseExstCd)).append("\n");
    sb.append("    drvRmkAboutDrvTxt: ").append(toIndentedString(drvRmkAboutDrvTxt)).append("\n");
    sb.append("    drvCmpnNameOfGtpCrtfExstTxt: ").append(toIndentedString(drvCmpnNameOfGtpCrtfExstTxt)).append("\n");
    sb.append("    drvAvbTime: ").append(toIndentedString(drvAvbTime)).append("\n");
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

