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
 * 運送サービス
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_srvc", description = "運送サービス")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_srvc")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc {

  private String serviceNo;

  private String serviceName;

  private String serviceStrtDate;

  private String serviceStrtTime;

  private String serviceEndDate;

  private String serviceEndTime;

  private BigDecimal freightRate;

  private String trspMeansTypCd;

  private String trspSrvcTypCd;

  private String roadCarrSrvcTypCd;

  private String trspRootPrioCd;

  private String carClsPrioCd;

  private String clsOfCargInSrvcRqrmCd;

  private String clsOfPkgUpSrvcRqrmCd;

  private String pyrClsSrvcRqrmCd;

  private String trmsOfMixLoadCndCd;

  private String dsedCllFromDate;

  private String dsedCllToDate;

  private String dsedCllFromTime;

  private String dsedCllToTime;

  private String dsedCllTimeTrmsSrvcRqrmCd;

  private String apedArrFromDate;

  private String apedArrToDate;

  private String apedArrFromTimePrfmDttm;

  private String apedArrToTimePrfmDttm;

  private String apedArrTimeTrmsSrvcRqrmCd;

  private String trmsOfMixLoadTxt;

  private String trspSrvcNoteOneTxt;

  private String trspSrvcNoteTwoTxt;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc(String serviceNo, String serviceName, String serviceStrtDate, String serviceStrtTime, BigDecimal freightRate) {
    this.serviceNo = serviceNo;
    this.serviceName = serviceName;
    this.serviceStrtDate = serviceStrtDate;
    this.serviceStrtTime = serviceStrtTime;
    this.freightRate = freightRate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc serviceNo(String serviceNo) {
    this.serviceNo = serviceNo;
    return this;
  }

  /**
   * 便・ダイヤ番号
   * @return serviceNo
  */
  @NotNull 
  @Schema(name = "service_no", example = "12345678901234567890", description = "便・ダイヤ番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_no")
  public String getServiceNo() {
    return serviceNo;
  }

  public void setServiceNo(String serviceNo) {
    this.serviceNo = serviceNo;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * 便・ダイヤ名称
   * @return serviceName
  */
  @NotNull 
  @Schema(name = "service_name", example = "123456789012345678901234", description = "便・ダイヤ名称", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_name")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc serviceStrtDate(String serviceStrtDate) {
    this.serviceStrtDate = serviceStrtDate;
    return this;
  }

  /**
   * 便の運行日
   * @return serviceStrtDate
  */
  @NotNull 
  @Schema(name = "service_strt_date", example = "20220101", description = "便の運行日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_strt_date")
  public String getServiceStrtDate() {
    return serviceStrtDate;
  }

  public void setServiceStrtDate(String serviceStrtDate) {
    this.serviceStrtDate = serviceStrtDate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc serviceStrtTime(String serviceStrtTime) {
    this.serviceStrtTime = serviceStrtTime;
    return this;
  }

  /**
   * 便の運行時刻
   * @return serviceStrtTime
  */
  @NotNull 
  @Schema(name = "service_strt_time", example = "0000", description = "便の運行時刻", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_strt_time")
  public String getServiceStrtTime() {
    return serviceStrtTime;
  }

  public void setServiceStrtTime(String serviceStrtTime) {
    this.serviceStrtTime = serviceStrtTime;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc serviceEndDate(String serviceEndDate) {
    this.serviceEndDate = serviceEndDate;
    return this;
  }

  /**
   * 便の運行終了日
   * @return serviceEndDate
  */
  
  @Schema(name = "service_end_date", description = "便の運行終了日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_end_date")
  public String getServiceEndDate() {
    return serviceEndDate;
  }

  public void setServiceEndDate(String serviceEndDate) {
    this.serviceEndDate = serviceEndDate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc serviceEndTime(String serviceEndTime) {
    this.serviceEndTime = serviceEndTime;
    return this;
  }

  /**
   * 便の運行終了時刻
   * @return serviceEndTime
  */
  
  @Schema(name = "service_end_time", description = "便の運行終了時刻", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_end_time")
  public String getServiceEndTime() {
    return serviceEndTime;
  }

  public void setServiceEndTime(String serviceEndTime) {
    this.serviceEndTime = serviceEndTime;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc freightRate(BigDecimal freightRate) {
    this.freightRate = freightRate;
    return this;
  }

  /**
   * 希望運賃
   * @return freightRate
  */
  @NotNull @Valid 
  @Schema(name = "freight_rate", example = "1234567890", description = "希望運賃", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("freight_rate")
  public BigDecimal getFreightRate() {
    return freightRate;
  }

  public void setFreightRate(BigDecimal freightRate) {
    this.freightRate = freightRate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspMeansTypCd(String trspMeansTypCd) {
    this.trspMeansTypCd = trspMeansTypCd;
    return this;
  }

  /**
   * 運送手段コード
   * @return trspMeansTypCd
  */
  
  @Schema(name = "trsp_means_typ_cd", description = "運送手段コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_means_typ_cd")
  public String getTrspMeansTypCd() {
    return trspMeansTypCd;
  }

  public void setTrspMeansTypCd(String trspMeansTypCd) {
    this.trspMeansTypCd = trspMeansTypCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspSrvcTypCd(String trspSrvcTypCd) {
    this.trspSrvcTypCd = trspSrvcTypCd;
    return this;
  }

  /**
   * 運送サービスコード
   * @return trspSrvcTypCd
  */
  
  @Schema(name = "trsp_srvc_typ_cd", description = "運送サービスコード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_srvc_typ_cd")
  public String getTrspSrvcTypCd() {
    return trspSrvcTypCd;
  }

  public void setTrspSrvcTypCd(String trspSrvcTypCd) {
    this.trspSrvcTypCd = trspSrvcTypCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc roadCarrSrvcTypCd(String roadCarrSrvcTypCd) {
    this.roadCarrSrvcTypCd = roadCarrSrvcTypCd;
    return this;
  }

  /**
   * 運送事業者サービスコード
   * @return roadCarrSrvcTypCd
  */
  
  @Schema(name = "road_carr_srvc_typ_cd", description = "運送事業者サービスコード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr_srvc_typ_cd")
  public String getRoadCarrSrvcTypCd() {
    return roadCarrSrvcTypCd;
  }

  public void setRoadCarrSrvcTypCd(String roadCarrSrvcTypCd) {
    this.roadCarrSrvcTypCd = roadCarrSrvcTypCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspRootPrioCd(String trspRootPrioCd) {
    this.trspRootPrioCd = trspRootPrioCd;
    return this;
  }

  /**
   * 運送ルートコード
   * @return trspRootPrioCd
  */
  
  @Schema(name = "trsp_root_prio_cd", description = "運送ルートコード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_root_prio_cd")
  public String getTrspRootPrioCd() {
    return trspRootPrioCd;
  }

  public void setTrspRootPrioCd(String trspRootPrioCd) {
    this.trspRootPrioCd = trspRootPrioCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc carClsPrioCd(String carClsPrioCd) {
    this.carClsPrioCd = carClsPrioCd;
    return this;
  }

  /**
   * 車輌種別コード
   * @return carClsPrioCd
  */
  
  @Schema(name = "car_cls_prio_cd", description = "車輌種別コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_prio_cd")
  public String getCarClsPrioCd() {
    return carClsPrioCd;
  }

  public void setCarClsPrioCd(String carClsPrioCd) {
    this.carClsPrioCd = carClsPrioCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc clsOfCargInSrvcRqrmCd(String clsOfCargInSrvcRqrmCd) {
    this.clsOfCargInSrvcRqrmCd = clsOfCargInSrvcRqrmCd;
    return this;
  }

  /**
   * 持込区分コード
   * @return clsOfCargInSrvcRqrmCd
  */
  
  @Schema(name = "cls_of_carg_in_srvc_rqrm_cd", description = "持込区分コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cls_of_carg_in_srvc_rqrm_cd")
  public String getClsOfCargInSrvcRqrmCd() {
    return clsOfCargInSrvcRqrmCd;
  }

  public void setClsOfCargInSrvcRqrmCd(String clsOfCargInSrvcRqrmCd) {
    this.clsOfCargInSrvcRqrmCd = clsOfCargInSrvcRqrmCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc clsOfPkgUpSrvcRqrmCd(String clsOfPkgUpSrvcRqrmCd) {
    this.clsOfPkgUpSrvcRqrmCd = clsOfPkgUpSrvcRqrmCd;
    return this;
  }

  /**
   * 引取区分コード
   * @return clsOfPkgUpSrvcRqrmCd
  */
  
  @Schema(name = "cls_of_pkg_up_srvc_rqrm_cd", description = "引取区分コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cls_of_pkg_up_srvc_rqrm_cd")
  public String getClsOfPkgUpSrvcRqrmCd() {
    return clsOfPkgUpSrvcRqrmCd;
  }

  public void setClsOfPkgUpSrvcRqrmCd(String clsOfPkgUpSrvcRqrmCd) {
    this.clsOfPkgUpSrvcRqrmCd = clsOfPkgUpSrvcRqrmCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc pyrClsSrvcRqrmCd(String pyrClsSrvcRqrmCd) {
    this.pyrClsSrvcRqrmCd = pyrClsSrvcRqrmCd;
    return this;
  }

  /**
   * 元払着払種別コード
   * @return pyrClsSrvcRqrmCd
  */
  
  @Schema(name = "pyr_cls_srvc_rqrm_cd", description = "元払着払種別コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pyr_cls_srvc_rqrm_cd")
  public String getPyrClsSrvcRqrmCd() {
    return pyrClsSrvcRqrmCd;
  }

  public void setPyrClsSrvcRqrmCd(String pyrClsSrvcRqrmCd) {
    this.pyrClsSrvcRqrmCd = pyrClsSrvcRqrmCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trmsOfMixLoadCndCd(String trmsOfMixLoadCndCd) {
    this.trmsOfMixLoadCndCd = trmsOfMixLoadCndCd;
    return this;
  }

  /**
   * 混載可否
   * @return trmsOfMixLoadCndCd
  */
  
  @Schema(name = "trms_of_mix_load_cnd_cd", description = "混載可否", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_mix_load_cnd_cd")
  public String getTrmsOfMixLoadCndCd() {
    return trmsOfMixLoadCndCd;
  }

  public void setTrmsOfMixLoadCndCd(String trmsOfMixLoadCndCd) {
    this.trmsOfMixLoadCndCd = trmsOfMixLoadCndCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc dsedCllFromDate(String dsedCllFromDate) {
    this.dsedCllFromDate = dsedCllFromDate;
    return this;
  }

  /**
   * 集荷希望日（から）
   * @return dsedCllFromDate
  */
  
  @Schema(name = "dsed_cll_from_date", description = "集荷希望日（から）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dsed_cll_from_date")
  public String getDsedCllFromDate() {
    return dsedCllFromDate;
  }

  public void setDsedCllFromDate(String dsedCllFromDate) {
    this.dsedCllFromDate = dsedCllFromDate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc dsedCllToDate(String dsedCllToDate) {
    this.dsedCllToDate = dsedCllToDate;
    return this;
  }

  /**
   * 集荷希望日（まで）
   * @return dsedCllToDate
  */
  
  @Schema(name = "dsed_cll_to_date", description = "集荷希望日（まで）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dsed_cll_to_date")
  public String getDsedCllToDate() {
    return dsedCllToDate;
  }

  public void setDsedCllToDate(String dsedCllToDate) {
    this.dsedCllToDate = dsedCllToDate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc dsedCllFromTime(String dsedCllFromTime) {
    this.dsedCllFromTime = dsedCllFromTime;
    return this;
  }

  /**
   * 集荷希望時刻（から）
   * @return dsedCllFromTime
  */
  
  @Schema(name = "dsed_cll_from_time", description = "集荷希望時刻（から）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dsed_cll_from_time")
  public String getDsedCllFromTime() {
    return dsedCllFromTime;
  }

  public void setDsedCllFromTime(String dsedCllFromTime) {
    this.dsedCllFromTime = dsedCllFromTime;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc dsedCllToTime(String dsedCllToTime) {
    this.dsedCllToTime = dsedCllToTime;
    return this;
  }

  /**
   * 集荷希望時刻（まで）
   * @return dsedCllToTime
  */
  
  @Schema(name = "dsed_cll_to_time", description = "集荷希望時刻（まで）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dsed_cll_to_time")
  public String getDsedCllToTime() {
    return dsedCllToTime;
  }

  public void setDsedCllToTime(String dsedCllToTime) {
    this.dsedCllToTime = dsedCllToTime;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc dsedCllTimeTrmsSrvcRqrmCd(String dsedCllTimeTrmsSrvcRqrmCd) {
    this.dsedCllTimeTrmsSrvcRqrmCd = dsedCllTimeTrmsSrvcRqrmCd;
    return this;
  }

  /**
   * 集荷希望時刻条件
   * @return dsedCllTimeTrmsSrvcRqrmCd
  */
  
  @Schema(name = "dsed_cll_time_trms_srvc_rqrm_cd", description = "集荷希望時刻条件", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dsed_cll_time_trms_srvc_rqrm_cd")
  public String getDsedCllTimeTrmsSrvcRqrmCd() {
    return dsedCllTimeTrmsSrvcRqrmCd;
  }

  public void setDsedCllTimeTrmsSrvcRqrmCd(String dsedCllTimeTrmsSrvcRqrmCd) {
    this.dsedCllTimeTrmsSrvcRqrmCd = dsedCllTimeTrmsSrvcRqrmCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc apedArrFromDate(String apedArrFromDate) {
    this.apedArrFromDate = apedArrFromDate;
    return this;
  }

  /**
   * 着荷指定日（から）
   * @return apedArrFromDate
  */
  
  @Schema(name = "aped_arr_from_date", description = "着荷指定日（から）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aped_arr_from_date")
  public String getApedArrFromDate() {
    return apedArrFromDate;
  }

  public void setApedArrFromDate(String apedArrFromDate) {
    this.apedArrFromDate = apedArrFromDate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc apedArrToDate(String apedArrToDate) {
    this.apedArrToDate = apedArrToDate;
    return this;
  }

  /**
   * 着荷指定日（まで）
   * @return apedArrToDate
  */
  
  @Schema(name = "aped_arr_to_date", description = "着荷指定日（まで）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aped_arr_to_date")
  public String getApedArrToDate() {
    return apedArrToDate;
  }

  public void setApedArrToDate(String apedArrToDate) {
    this.apedArrToDate = apedArrToDate;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc apedArrFromTimePrfmDttm(String apedArrFromTimePrfmDttm) {
    this.apedArrFromTimePrfmDttm = apedArrFromTimePrfmDttm;
    return this;
  }

  /**
   * 着荷指定時刻（から）
   * @return apedArrFromTimePrfmDttm
  */
  
  @Schema(name = "aped_arr_from_time_prfm_dttm", description = "着荷指定時刻（から）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aped_arr_from_time_prfm_dttm")
  public String getApedArrFromTimePrfmDttm() {
    return apedArrFromTimePrfmDttm;
  }

  public void setApedArrFromTimePrfmDttm(String apedArrFromTimePrfmDttm) {
    this.apedArrFromTimePrfmDttm = apedArrFromTimePrfmDttm;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc apedArrToTimePrfmDttm(String apedArrToTimePrfmDttm) {
    this.apedArrToTimePrfmDttm = apedArrToTimePrfmDttm;
    return this;
  }

  /**
   * 着荷指定時刻（まで）
   * @return apedArrToTimePrfmDttm
  */
  
  @Schema(name = "aped_arr_to_time_prfm_dttm", description = "着荷指定時刻（まで）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aped_arr_to_time_prfm_dttm")
  public String getApedArrToTimePrfmDttm() {
    return apedArrToTimePrfmDttm;
  }

  public void setApedArrToTimePrfmDttm(String apedArrToTimePrfmDttm) {
    this.apedArrToTimePrfmDttm = apedArrToTimePrfmDttm;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc apedArrTimeTrmsSrvcRqrmCd(String apedArrTimeTrmsSrvcRqrmCd) {
    this.apedArrTimeTrmsSrvcRqrmCd = apedArrTimeTrmsSrvcRqrmCd;
    return this;
  }

  /**
   * 着荷指定時刻条件
   * @return apedArrTimeTrmsSrvcRqrmCd
  */
  
  @Schema(name = "aped_arr_time_trms_srvc_rqrm_cd", description = "着荷指定時刻条件", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aped_arr_time_trms_srvc_rqrm_cd")
  public String getApedArrTimeTrmsSrvcRqrmCd() {
    return apedArrTimeTrmsSrvcRqrmCd;
  }

  public void setApedArrTimeTrmsSrvcRqrmCd(String apedArrTimeTrmsSrvcRqrmCd) {
    this.apedArrTimeTrmsSrvcRqrmCd = apedArrTimeTrmsSrvcRqrmCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trmsOfMixLoadTxt(String trmsOfMixLoadTxt) {
    this.trmsOfMixLoadTxt = trmsOfMixLoadTxt;
    return this;
  }

  /**
   * 混載条件
   * @return trmsOfMixLoadTxt
  */
  
  @Schema(name = "trms_of_mix_load_txt", description = "混載条件", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_mix_load_txt")
  public String getTrmsOfMixLoadTxt() {
    return trmsOfMixLoadTxt;
  }

  public void setTrmsOfMixLoadTxt(String trmsOfMixLoadTxt) {
    this.trmsOfMixLoadTxt = trmsOfMixLoadTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspSrvcNoteOneTxt(String trspSrvcNoteOneTxt) {
    this.trspSrvcNoteOneTxt = trspSrvcNoteOneTxt;
    return this;
  }

  /**
   * 運送サービス備考1
   * @return trspSrvcNoteOneTxt
  */
  
  @Schema(name = "trsp_srvc_note_one_txt", description = "運送サービス備考1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_srvc_note_one_txt")
  public String getTrspSrvcNoteOneTxt() {
    return trspSrvcNoteOneTxt;
  }

  public void setTrspSrvcNoteOneTxt(String trspSrvcNoteOneTxt) {
    this.trspSrvcNoteOneTxt = trspSrvcNoteOneTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspSrvcNoteTwoTxt(String trspSrvcNoteTwoTxt) {
    this.trspSrvcNoteTwoTxt = trspSrvcNoteTwoTxt;
    return this;
  }

  /**
   * 運送サービス備考2
   * @return trspSrvcNoteTwoTxt
  */
  
  @Schema(name = "trsp_srvc_note_two_txt", description = "運送サービス備考2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_srvc_note_two_txt")
  public String getTrspSrvcNoteTwoTxt() {
    return trspSrvcNoteTwoTxt;
  }

  public void setTrspSrvcNoteTwoTxt(String trspSrvcNoteTwoTxt) {
    this.trspSrvcNoteTwoTxt = trspSrvcNoteTwoTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc) o;
    return Objects.equals(this.serviceNo, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.serviceNo) &&
        Objects.equals(this.serviceName, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.serviceName) &&
        Objects.equals(this.serviceStrtDate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.serviceStrtDate) &&
        Objects.equals(this.serviceStrtTime, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.serviceStrtTime) &&
        Objects.equals(this.serviceEndDate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.serviceEndDate) &&
        Objects.equals(this.serviceEndTime, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.serviceEndTime) &&
        Objects.equals(this.freightRate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.freightRate) &&
        Objects.equals(this.trspMeansTypCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trspMeansTypCd) &&
        Objects.equals(this.trspSrvcTypCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trspSrvcTypCd) &&
        Objects.equals(this.roadCarrSrvcTypCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.roadCarrSrvcTypCd) &&
        Objects.equals(this.trspRootPrioCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trspRootPrioCd) &&
        Objects.equals(this.carClsPrioCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.carClsPrioCd) &&
        Objects.equals(this.clsOfCargInSrvcRqrmCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.clsOfCargInSrvcRqrmCd) &&
        Objects.equals(this.clsOfPkgUpSrvcRqrmCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.clsOfPkgUpSrvcRqrmCd) &&
        Objects.equals(this.pyrClsSrvcRqrmCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.pyrClsSrvcRqrmCd) &&
        Objects.equals(this.trmsOfMixLoadCndCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trmsOfMixLoadCndCd) &&
        Objects.equals(this.dsedCllFromDate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.dsedCllFromDate) &&
        Objects.equals(this.dsedCllToDate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.dsedCllToDate) &&
        Objects.equals(this.dsedCllFromTime, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.dsedCllFromTime) &&
        Objects.equals(this.dsedCllToTime, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.dsedCllToTime) &&
        Objects.equals(this.dsedCllTimeTrmsSrvcRqrmCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.dsedCllTimeTrmsSrvcRqrmCd) &&
        Objects.equals(this.apedArrFromDate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.apedArrFromDate) &&
        Objects.equals(this.apedArrToDate, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.apedArrToDate) &&
        Objects.equals(this.apedArrFromTimePrfmDttm, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.apedArrFromTimePrfmDttm) &&
        Objects.equals(this.apedArrToTimePrfmDttm, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.apedArrToTimePrfmDttm) &&
        Objects.equals(this.apedArrTimeTrmsSrvcRqrmCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.apedArrTimeTrmsSrvcRqrmCd) &&
        Objects.equals(this.trmsOfMixLoadTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trmsOfMixLoadTxt) &&
        Objects.equals(this.trspSrvcNoteOneTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trspSrvcNoteOneTxt) &&
        Objects.equals(this.trspSrvcNoteTwoTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc.trspSrvcNoteTwoTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceNo, serviceName, serviceStrtDate, serviceStrtTime, serviceEndDate, serviceEndTime, freightRate, trspMeansTypCd, trspSrvcTypCd, roadCarrSrvcTypCd, trspRootPrioCd, carClsPrioCd, clsOfCargInSrvcRqrmCd, clsOfPkgUpSrvcRqrmCd, pyrClsSrvcRqrmCd, trmsOfMixLoadCndCd, dsedCllFromDate, dsedCllToDate, dsedCllFromTime, dsedCllToTime, dsedCllTimeTrmsSrvcRqrmCd, apedArrFromDate, apedArrToDate, apedArrFromTimePrfmDttm, apedArrToTimePrfmDttm, apedArrTimeTrmsSrvcRqrmCd, trmsOfMixLoadTxt, trspSrvcNoteOneTxt, trspSrvcNoteTwoTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc {\n");
    sb.append("    serviceNo: ").append(toIndentedString(serviceNo)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceStrtDate: ").append(toIndentedString(serviceStrtDate)).append("\n");
    sb.append("    serviceStrtTime: ").append(toIndentedString(serviceStrtTime)).append("\n");
    sb.append("    serviceEndDate: ").append(toIndentedString(serviceEndDate)).append("\n");
    sb.append("    serviceEndTime: ").append(toIndentedString(serviceEndTime)).append("\n");
    sb.append("    freightRate: ").append(toIndentedString(freightRate)).append("\n");
    sb.append("    trspMeansTypCd: ").append(toIndentedString(trspMeansTypCd)).append("\n");
    sb.append("    trspSrvcTypCd: ").append(toIndentedString(trspSrvcTypCd)).append("\n");
    sb.append("    roadCarrSrvcTypCd: ").append(toIndentedString(roadCarrSrvcTypCd)).append("\n");
    sb.append("    trspRootPrioCd: ").append(toIndentedString(trspRootPrioCd)).append("\n");
    sb.append("    carClsPrioCd: ").append(toIndentedString(carClsPrioCd)).append("\n");
    sb.append("    clsOfCargInSrvcRqrmCd: ").append(toIndentedString(clsOfCargInSrvcRqrmCd)).append("\n");
    sb.append("    clsOfPkgUpSrvcRqrmCd: ").append(toIndentedString(clsOfPkgUpSrvcRqrmCd)).append("\n");
    sb.append("    pyrClsSrvcRqrmCd: ").append(toIndentedString(pyrClsSrvcRqrmCd)).append("\n");
    sb.append("    trmsOfMixLoadCndCd: ").append(toIndentedString(trmsOfMixLoadCndCd)).append("\n");
    sb.append("    dsedCllFromDate: ").append(toIndentedString(dsedCllFromDate)).append("\n");
    sb.append("    dsedCllToDate: ").append(toIndentedString(dsedCllToDate)).append("\n");
    sb.append("    dsedCllFromTime: ").append(toIndentedString(dsedCllFromTime)).append("\n");
    sb.append("    dsedCllToTime: ").append(toIndentedString(dsedCllToTime)).append("\n");
    sb.append("    dsedCllTimeTrmsSrvcRqrmCd: ").append(toIndentedString(dsedCllTimeTrmsSrvcRqrmCd)).append("\n");
    sb.append("    apedArrFromDate: ").append(toIndentedString(apedArrFromDate)).append("\n");
    sb.append("    apedArrToDate: ").append(toIndentedString(apedArrToDate)).append("\n");
    sb.append("    apedArrFromTimePrfmDttm: ").append(toIndentedString(apedArrFromTimePrfmDttm)).append("\n");
    sb.append("    apedArrToTimePrfmDttm: ").append(toIndentedString(apedArrToTimePrfmDttm)).append("\n");
    sb.append("    apedArrTimeTrmsSrvcRqrmCd: ").append(toIndentedString(apedArrTimeTrmsSrvcRqrmCd)).append("\n");
    sb.append("    trmsOfMixLoadTxt: ").append(toIndentedString(trmsOfMixLoadTxt)).append("\n");
    sb.append("    trspSrvcNoteOneTxt: ").append(toIndentedString(trspSrvcNoteOneTxt)).append("\n");
    sb.append("    trspSrvcNoteTwoTxt: ").append(toIndentedString(trspSrvcNoteTwoTxt)).append("\n");
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

