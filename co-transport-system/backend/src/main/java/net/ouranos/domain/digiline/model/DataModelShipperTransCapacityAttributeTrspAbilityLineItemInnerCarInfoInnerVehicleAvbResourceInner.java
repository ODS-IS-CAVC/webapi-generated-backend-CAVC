package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_car_info_inner_vehicle_avb_resource_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner {

  private String trspOpStrtAreaLineOneTxt;

  private String trspOpStrtAreaCtyJisCd;

  private String trspOpDateTrmStrtDate;

  private String trspOpPlanDateTrmStrtTime;

  private String trspOpEndAreaLineOneTxt;

  private String trspOpEndAreaCtyJisCd;

  private String trspOpDateTrmEndDate;

  private String trspOpPlanDateTrmEndTime;

  private String clbAreaTxt;

  private String trmsOfClbAreaCd;

  private String avbDateCllDate;

  private String avbFromTimeOfCllTime;

  private String avbToTimeOfCllTime;

  private String delbAreaTxt;

  private String trmsOfDelbAreaCd;

  private String estiDelDatePrfmDttm;

  private String avbFromTimeOfDelTime;

  private String avbToTimeOfDelTime;

  private BigDecimal avbLoadCpOfCarMeas;

  private BigDecimal avbLoadVolOfCarMeas;

  private String pckeFrmCd;

  private BigDecimal avbNumOfRetbCntnOfCarQuan;

  private String trkBedStasTxt;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner> cutOffInfo = new ArrayList<>();

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner> freeTimeInfo = new ArrayList<>();

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner(String trspOpStrtAreaLineOneTxt, String trspOpDateTrmStrtDate, String trspOpPlanDateTrmStrtTime, String trspOpEndAreaLineOneTxt, String trspOpDateTrmEndDate, String trspOpPlanDateTrmEndTime) {
    this.trspOpStrtAreaLineOneTxt = trspOpStrtAreaLineOneTxt;
    this.trspOpDateTrmStrtDate = trspOpDateTrmStrtDate;
    this.trspOpPlanDateTrmStrtTime = trspOpPlanDateTrmStrtTime;
    this.trspOpEndAreaLineOneTxt = trspOpEndAreaLineOneTxt;
    this.trspOpDateTrmEndDate = trspOpDateTrmEndDate;
    this.trspOpPlanDateTrmEndTime = trspOpPlanDateTrmEndTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpStrtAreaLineOneTxt(String trspOpStrtAreaLineOneTxt) {
    this.trspOpStrtAreaLineOneTxt = trspOpStrtAreaLineOneTxt;
    return this;
  }

  /**
   * 運行開始地域
   * @return trspOpStrtAreaLineOneTxt
  */
  @NotNull 
  @Schema(name = "trsp_op_strt_area_line_one_txt", example = "12345678901234567890", description = "運行開始地域", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_op_strt_area_line_one_txt")
  public String getTrspOpStrtAreaLineOneTxt() {
    return trspOpStrtAreaLineOneTxt;
  }

  public void setTrspOpStrtAreaLineOneTxt(String trspOpStrtAreaLineOneTxt) {
    this.trspOpStrtAreaLineOneTxt = trspOpStrtAreaLineOneTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpStrtAreaCtyJisCd(String trspOpStrtAreaCtyJisCd) {
    this.trspOpStrtAreaCtyJisCd = trspOpStrtAreaCtyJisCd;
    return this;
  }

  /**
   * 運行開始地域コード
   * @return trspOpStrtAreaCtyJisCd
  */
  
  @Schema(name = "trsp_op_strt_area_cty_jis_cd", description = "運行開始地域コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_strt_area_cty_jis_cd")
  public String getTrspOpStrtAreaCtyJisCd() {
    return trspOpStrtAreaCtyJisCd;
  }

  public void setTrspOpStrtAreaCtyJisCd(String trspOpStrtAreaCtyJisCd) {
    this.trspOpStrtAreaCtyJisCd = trspOpStrtAreaCtyJisCd;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpDateTrmStrtDate(String trspOpDateTrmStrtDate) {
    this.trspOpDateTrmStrtDate = trspOpDateTrmStrtDate;
    return this;
  }

  /**
   * 運行開始日
   * @return trspOpDateTrmStrtDate
  */
  @NotNull 
  @Schema(name = "trsp_op_date_trm_strt_date", example = "20241024", description = "運行開始日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_op_date_trm_strt_date")
  public String getTrspOpDateTrmStrtDate() {
    return trspOpDateTrmStrtDate;
  }

  public void setTrspOpDateTrmStrtDate(String trspOpDateTrmStrtDate) {
    this.trspOpDateTrmStrtDate = trspOpDateTrmStrtDate;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpPlanDateTrmStrtTime(String trspOpPlanDateTrmStrtTime) {
    this.trspOpPlanDateTrmStrtTime = trspOpPlanDateTrmStrtTime;
    return this;
  }

  /**
   * 運行開始希望時刻
   * @return trspOpPlanDateTrmStrtTime
  */
  @NotNull 
  @Schema(name = "trsp_op_plan_date_trm_strt_time", example = "1416", description = "運行開始希望時刻", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_op_plan_date_trm_strt_time")
  public String getTrspOpPlanDateTrmStrtTime() {
    return trspOpPlanDateTrmStrtTime;
  }

  public void setTrspOpPlanDateTrmStrtTime(String trspOpPlanDateTrmStrtTime) {
    this.trspOpPlanDateTrmStrtTime = trspOpPlanDateTrmStrtTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpEndAreaLineOneTxt(String trspOpEndAreaLineOneTxt) {
    this.trspOpEndAreaLineOneTxt = trspOpEndAreaLineOneTxt;
    return this;
  }

  /**
   * 運行終了地域
   * @return trspOpEndAreaLineOneTxt
  */
  @NotNull 
  @Schema(name = "trsp_op_end_area_line_one_txt", example = "12345678901234567890", description = "運行終了地域", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_op_end_area_line_one_txt")
  public String getTrspOpEndAreaLineOneTxt() {
    return trspOpEndAreaLineOneTxt;
  }

  public void setTrspOpEndAreaLineOneTxt(String trspOpEndAreaLineOneTxt) {
    this.trspOpEndAreaLineOneTxt = trspOpEndAreaLineOneTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpEndAreaCtyJisCd(String trspOpEndAreaCtyJisCd) {
    this.trspOpEndAreaCtyJisCd = trspOpEndAreaCtyJisCd;
    return this;
  }

  /**
   * 運行終了地域コード
   * @return trspOpEndAreaCtyJisCd
  */
  
  @Schema(name = "trsp_op_end_area_cty_jis_cd", description = "運行終了地域コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_op_end_area_cty_jis_cd")
  public String getTrspOpEndAreaCtyJisCd() {
    return trspOpEndAreaCtyJisCd;
  }

  public void setTrspOpEndAreaCtyJisCd(String trspOpEndAreaCtyJisCd) {
    this.trspOpEndAreaCtyJisCd = trspOpEndAreaCtyJisCd;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpDateTrmEndDate(String trspOpDateTrmEndDate) {
    this.trspOpDateTrmEndDate = trspOpDateTrmEndDate;
    return this;
  }

  /**
   * 運行終了日
   * @return trspOpDateTrmEndDate
  */
  @NotNull 
  @Schema(name = "trsp_op_date_trm_end_date", example = "20241025", description = "運行終了日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_op_date_trm_end_date")
  public String getTrspOpDateTrmEndDate() {
    return trspOpDateTrmEndDate;
  }

  public void setTrspOpDateTrmEndDate(String trspOpDateTrmEndDate) {
    this.trspOpDateTrmEndDate = trspOpDateTrmEndDate;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trspOpPlanDateTrmEndTime(String trspOpPlanDateTrmEndTime) {
    this.trspOpPlanDateTrmEndTime = trspOpPlanDateTrmEndTime;
    return this;
  }

  /**
   * 運行終了希望時刻
   * @return trspOpPlanDateTrmEndTime
  */
  @NotNull 
  @Schema(name = "trsp_op_plan_date_trm_end_time", example = "1416", description = "運行終了希望時刻", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_op_plan_date_trm_end_time")
  public String getTrspOpPlanDateTrmEndTime() {
    return trspOpPlanDateTrmEndTime;
  }

  public void setTrspOpPlanDateTrmEndTime(String trspOpPlanDateTrmEndTime) {
    this.trspOpPlanDateTrmEndTime = trspOpPlanDateTrmEndTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner clbAreaTxt(String clbAreaTxt) {
    this.clbAreaTxt = clbAreaTxt;
    return this;
  }

  /**
   * 集荷地域
   * @return clbAreaTxt
  */
  
  @Schema(name = "clb_area_txt", description = "集荷地域", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clb_area_txt")
  public String getClbAreaTxt() {
    return clbAreaTxt;
  }

  public void setClbAreaTxt(String clbAreaTxt) {
    this.clbAreaTxt = clbAreaTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trmsOfClbAreaCd(String trmsOfClbAreaCd) {
    this.trmsOfClbAreaCd = trmsOfClbAreaCd;
    return this;
  }

  /**
   * 集荷地域コード
   * @return trmsOfClbAreaCd
  */
  
  @Schema(name = "trms_of_clb_area_cd", description = "集荷地域コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_clb_area_cd")
  public String getTrmsOfClbAreaCd() {
    return trmsOfClbAreaCd;
  }

  public void setTrmsOfClbAreaCd(String trmsOfClbAreaCd) {
    this.trmsOfClbAreaCd = trmsOfClbAreaCd;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbDateCllDate(String avbDateCllDate) {
    this.avbDateCllDate = avbDateCllDate;
    return this;
  }

  /**
   * 集荷予定日
   * @return avbDateCllDate
  */
  
  @Schema(name = "avb_date_cll_date", description = "集荷予定日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_date_cll_date")
  public String getAvbDateCllDate() {
    return avbDateCllDate;
  }

  public void setAvbDateCllDate(String avbDateCllDate) {
    this.avbDateCllDate = avbDateCllDate;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbFromTimeOfCllTime(String avbFromTimeOfCllTime) {
    this.avbFromTimeOfCllTime = avbFromTimeOfCllTime;
    return this;
  }

  /**
   * 集荷開始時間
   * @return avbFromTimeOfCllTime
  */
  
  @Schema(name = "avb_from_time_of_cll_time", description = "集荷開始時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_from_time_of_cll_time")
  public String getAvbFromTimeOfCllTime() {
    return avbFromTimeOfCllTime;
  }

  public void setAvbFromTimeOfCllTime(String avbFromTimeOfCllTime) {
    this.avbFromTimeOfCllTime = avbFromTimeOfCllTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbToTimeOfCllTime(String avbToTimeOfCllTime) {
    this.avbToTimeOfCllTime = avbToTimeOfCllTime;
    return this;
  }

  /**
   * 集荷終了時間
   * @return avbToTimeOfCllTime
  */
  
  @Schema(name = "avb_to_time_of_cll_time", description = "集荷終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_to_time_of_cll_time")
  public String getAvbToTimeOfCllTime() {
    return avbToTimeOfCllTime;
  }

  public void setAvbToTimeOfCllTime(String avbToTimeOfCllTime) {
    this.avbToTimeOfCllTime = avbToTimeOfCllTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner delbAreaTxt(String delbAreaTxt) {
    this.delbAreaTxt = delbAreaTxt;
    return this;
  }

  /**
   * 配達地域
   * @return delbAreaTxt
  */
  
  @Schema(name = "delb_area_txt", description = "配達地域", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delb_area_txt")
  public String getDelbAreaTxt() {
    return delbAreaTxt;
  }

  public void setDelbAreaTxt(String delbAreaTxt) {
    this.delbAreaTxt = delbAreaTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trmsOfDelbAreaCd(String trmsOfDelbAreaCd) {
    this.trmsOfDelbAreaCd = trmsOfDelbAreaCd;
    return this;
  }

  /**
   * 配達地域コード
   * @return trmsOfDelbAreaCd
  */
  
  @Schema(name = "trms_of_delb_area_cd", description = "配達地域コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_delb_area_cd")
  public String getTrmsOfDelbAreaCd() {
    return trmsOfDelbAreaCd;
  }

  public void setTrmsOfDelbAreaCd(String trmsOfDelbAreaCd) {
    this.trmsOfDelbAreaCd = trmsOfDelbAreaCd;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner estiDelDatePrfmDttm(String estiDelDatePrfmDttm) {
    this.estiDelDatePrfmDttm = estiDelDatePrfmDttm;
    return this;
  }

  /**
   * 配達予定日
   * @return estiDelDatePrfmDttm
  */
  
  @Schema(name = "esti_del_date_prfm_dttm", description = "配達予定日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("esti_del_date_prfm_dttm")
  public String getEstiDelDatePrfmDttm() {
    return estiDelDatePrfmDttm;
  }

  public void setEstiDelDatePrfmDttm(String estiDelDatePrfmDttm) {
    this.estiDelDatePrfmDttm = estiDelDatePrfmDttm;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbFromTimeOfDelTime(String avbFromTimeOfDelTime) {
    this.avbFromTimeOfDelTime = avbFromTimeOfDelTime;
    return this;
  }

  /**
   * 配達開始時間
   * @return avbFromTimeOfDelTime
  */
  
  @Schema(name = "avb_from_time_of_del_time", description = "配達開始時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_from_time_of_del_time")
  public String getAvbFromTimeOfDelTime() {
    return avbFromTimeOfDelTime;
  }

  public void setAvbFromTimeOfDelTime(String avbFromTimeOfDelTime) {
    this.avbFromTimeOfDelTime = avbFromTimeOfDelTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbToTimeOfDelTime(String avbToTimeOfDelTime) {
    this.avbToTimeOfDelTime = avbToTimeOfDelTime;
    return this;
  }

  /**
   * 配達終了時間
   * @return avbToTimeOfDelTime
  */
  
  @Schema(name = "avb_to_time_of_del_time", description = "配達終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_to_time_of_del_time")
  public String getAvbToTimeOfDelTime() {
    return avbToTimeOfDelTime;
  }

  public void setAvbToTimeOfDelTime(String avbToTimeOfDelTime) {
    this.avbToTimeOfDelTime = avbToTimeOfDelTime;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbLoadCpOfCarMeas(BigDecimal avbLoadCpOfCarMeas) {
    this.avbLoadCpOfCarMeas = avbLoadCpOfCarMeas;
    return this;
  }

  /**
   * 積載可能重量(kg)
   * @return avbLoadCpOfCarMeas
  */
  @Valid 
  @Schema(name = "avb_load_cp_of_car_meas", description = "積載可能重量(kg)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_load_cp_of_car_meas")
  public BigDecimal getAvbLoadCpOfCarMeas() {
    return avbLoadCpOfCarMeas;
  }

  public void setAvbLoadCpOfCarMeas(BigDecimal avbLoadCpOfCarMeas) {
    this.avbLoadCpOfCarMeas = avbLoadCpOfCarMeas;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbLoadVolOfCarMeas(BigDecimal avbLoadVolOfCarMeas) {
    this.avbLoadVolOfCarMeas = avbLoadVolOfCarMeas;
    return this;
  }

  /**
   * 積載可能容積
   * @return avbLoadVolOfCarMeas
  */
  @Valid 
  @Schema(name = "avb_load_vol_of_car_meas", description = "積載可能容積", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_load_vol_of_car_meas")
  public BigDecimal getAvbLoadVolOfCarMeas() {
    return avbLoadVolOfCarMeas;
  }

  public void setAvbLoadVolOfCarMeas(BigDecimal avbLoadVolOfCarMeas) {
    this.avbLoadVolOfCarMeas = avbLoadVolOfCarMeas;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner pckeFrmCd(String pckeFrmCd) {
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

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner avbNumOfRetbCntnOfCarQuan(BigDecimal avbNumOfRetbCntnOfCarQuan) {
    this.avbNumOfRetbCntnOfCarQuan = avbNumOfRetbCntnOfCarQuan;
    return this;
  }

  /**
   * 積載可能輸送容器数
   * @return avbNumOfRetbCntnOfCarQuan
  */
  @Valid 
  @Schema(name = "avb_num_of_retb_cntn_of_car_quan", description = "積載可能輸送容器数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avb_num_of_retb_cntn_of_car_quan")
  public BigDecimal getAvbNumOfRetbCntnOfCarQuan() {
    return avbNumOfRetbCntnOfCarQuan;
  }

  public void setAvbNumOfRetbCntnOfCarQuan(BigDecimal avbNumOfRetbCntnOfCarQuan) {
    this.avbNumOfRetbCntnOfCarQuan = avbNumOfRetbCntnOfCarQuan;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner trkBedStasTxt(String trkBedStasTxt) {
    this.trkBedStasTxt = trkBedStasTxt;
    return this;
  }

  /**
   * 荷室状況
   * @return trkBedStasTxt
  */
  
  @Schema(name = "trk_bed_stas_txt", description = "荷室状況", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trk_bed_stas_txt")
  public String getTrkBedStasTxt() {
    return trkBedStasTxt;
  }

  public void setTrkBedStasTxt(String trkBedStasTxt) {
    this.trkBedStasTxt = trkBedStasTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner cutOffInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner> cutOffInfo) {
    this.cutOffInfo = cutOffInfo;
    return this;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner addCutOffInfoItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerCutOffInfoInner cutOffInfoItem) {
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

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner freeTimeInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner> freeTimeInfo) {
    this.freeTimeInfo = freeTimeInfo;
    return this;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner addFreeTimeInfoItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInnerFreeTimeInfoInner freeTimeInfoItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner) o;
    return Objects.equals(this.trspOpStrtAreaLineOneTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpStrtAreaLineOneTxt) &&
        Objects.equals(this.trspOpStrtAreaCtyJisCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpStrtAreaCtyJisCd) &&
        Objects.equals(this.trspOpDateTrmStrtDate, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpDateTrmStrtDate) &&
        Objects.equals(this.trspOpPlanDateTrmStrtTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpPlanDateTrmStrtTime) &&
        Objects.equals(this.trspOpEndAreaLineOneTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpEndAreaLineOneTxt) &&
        Objects.equals(this.trspOpEndAreaCtyJisCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpEndAreaCtyJisCd) &&
        Objects.equals(this.trspOpDateTrmEndDate, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpDateTrmEndDate) &&
        Objects.equals(this.trspOpPlanDateTrmEndTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trspOpPlanDateTrmEndTime) &&
        Objects.equals(this.clbAreaTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.clbAreaTxt) &&
        Objects.equals(this.trmsOfClbAreaCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trmsOfClbAreaCd) &&
        Objects.equals(this.avbDateCllDate, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbDateCllDate) &&
        Objects.equals(this.avbFromTimeOfCllTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbFromTimeOfCllTime) &&
        Objects.equals(this.avbToTimeOfCllTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbToTimeOfCllTime) &&
        Objects.equals(this.delbAreaTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.delbAreaTxt) &&
        Objects.equals(this.trmsOfDelbAreaCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trmsOfDelbAreaCd) &&
        Objects.equals(this.estiDelDatePrfmDttm, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.estiDelDatePrfmDttm) &&
        Objects.equals(this.avbFromTimeOfDelTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbFromTimeOfDelTime) &&
        Objects.equals(this.avbToTimeOfDelTime, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbToTimeOfDelTime) &&
        Objects.equals(this.avbLoadCpOfCarMeas, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbLoadCpOfCarMeas) &&
        Objects.equals(this.avbLoadVolOfCarMeas, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbLoadVolOfCarMeas) &&
        Objects.equals(this.pckeFrmCd, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.pckeFrmCd) &&
        Objects.equals(this.avbNumOfRetbCntnOfCarQuan, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.avbNumOfRetbCntnOfCarQuan) &&
        Objects.equals(this.trkBedStasTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.trkBedStasTxt) &&
        Objects.equals(this.cutOffInfo, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.cutOffInfo) &&
        Objects.equals(this.freeTimeInfo, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner.freeTimeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspOpStrtAreaLineOneTxt, trspOpStrtAreaCtyJisCd, trspOpDateTrmStrtDate, trspOpPlanDateTrmStrtTime, trspOpEndAreaLineOneTxt, trspOpEndAreaCtyJisCd, trspOpDateTrmEndDate, trspOpPlanDateTrmEndTime, clbAreaTxt, trmsOfClbAreaCd, avbDateCllDate, avbFromTimeOfCllTime, avbToTimeOfCllTime, delbAreaTxt, trmsOfDelbAreaCd, estiDelDatePrfmDttm, avbFromTimeOfDelTime, avbToTimeOfDelTime, avbLoadCpOfCarMeas, avbLoadVolOfCarMeas, pckeFrmCd, avbNumOfRetbCntnOfCarQuan, trkBedStasTxt, cutOffInfo, freeTimeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner {\n");
    sb.append("    trspOpStrtAreaLineOneTxt: ").append(toIndentedString(trspOpStrtAreaLineOneTxt)).append("\n");
    sb.append("    trspOpStrtAreaCtyJisCd: ").append(toIndentedString(trspOpStrtAreaCtyJisCd)).append("\n");
    sb.append("    trspOpDateTrmStrtDate: ").append(toIndentedString(trspOpDateTrmStrtDate)).append("\n");
    sb.append("    trspOpPlanDateTrmStrtTime: ").append(toIndentedString(trspOpPlanDateTrmStrtTime)).append("\n");
    sb.append("    trspOpEndAreaLineOneTxt: ").append(toIndentedString(trspOpEndAreaLineOneTxt)).append("\n");
    sb.append("    trspOpEndAreaCtyJisCd: ").append(toIndentedString(trspOpEndAreaCtyJisCd)).append("\n");
    sb.append("    trspOpDateTrmEndDate: ").append(toIndentedString(trspOpDateTrmEndDate)).append("\n");
    sb.append("    trspOpPlanDateTrmEndTime: ").append(toIndentedString(trspOpPlanDateTrmEndTime)).append("\n");
    sb.append("    clbAreaTxt: ").append(toIndentedString(clbAreaTxt)).append("\n");
    sb.append("    trmsOfClbAreaCd: ").append(toIndentedString(trmsOfClbAreaCd)).append("\n");
    sb.append("    avbDateCllDate: ").append(toIndentedString(avbDateCllDate)).append("\n");
    sb.append("    avbFromTimeOfCllTime: ").append(toIndentedString(avbFromTimeOfCllTime)).append("\n");
    sb.append("    avbToTimeOfCllTime: ").append(toIndentedString(avbToTimeOfCllTime)).append("\n");
    sb.append("    delbAreaTxt: ").append(toIndentedString(delbAreaTxt)).append("\n");
    sb.append("    trmsOfDelbAreaCd: ").append(toIndentedString(trmsOfDelbAreaCd)).append("\n");
    sb.append("    estiDelDatePrfmDttm: ").append(toIndentedString(estiDelDatePrfmDttm)).append("\n");
    sb.append("    avbFromTimeOfDelTime: ").append(toIndentedString(avbFromTimeOfDelTime)).append("\n");
    sb.append("    avbToTimeOfDelTime: ").append(toIndentedString(avbToTimeOfDelTime)).append("\n");
    sb.append("    avbLoadCpOfCarMeas: ").append(toIndentedString(avbLoadCpOfCarMeas)).append("\n");
    sb.append("    avbLoadVolOfCarMeas: ").append(toIndentedString(avbLoadVolOfCarMeas)).append("\n");
    sb.append("    pckeFrmCd: ").append(toIndentedString(pckeFrmCd)).append("\n");
    sb.append("    avbNumOfRetbCntnOfCarQuan: ").append(toIndentedString(avbNumOfRetbCntnOfCarQuan)).append("\n");
    sb.append("    trkBedStasTxt: ").append(toIndentedString(trkBedStasTxt)).append("\n");
    sb.append("    cutOffInfo: ").append(toIndentedString(cutOffInfo)).append("\n");
    sb.append("    freeTimeInfo: ").append(toIndentedString(freeTimeInfo)).append("\n");
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

