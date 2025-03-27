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
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_del_attribute_trsp_ability_line_item_inner_car_info_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner {

  private String serviceNo;

  private String serviceName;

  private String serviceStrtDate;

  private String serviceStrtTime;

  private String serviceEndDate;

  private String serviceEndTime;

  private BigDecimal freightRate;

  private String carCtrlNumId;

  private String carLicensePltNumId;

  private String giai;

  private String carBodyNumCd;

  private String carClsOfSizeCd;

  private String tractorIdcr;

  private String trailerLicensePltNumId;

  private BigDecimal carWeigMeas;

  private BigDecimal carLnghMeas;

  private BigDecimal carWidMeas;

  private BigDecimal carHghtMeas;

  private BigDecimal carMaxLoadCapacity1Meas;

  private BigDecimal carMaxLoadCapacity2Meas;

  private BigDecimal carVolOfHzdItemMeas;

  private BigDecimal carSpcGrvOfHzdItemMeas;

  private BigDecimal carTrkBedHghtMeas;

  private BigDecimal carTrkBedWidMeas;

  private BigDecimal carTrkBedLnghMeas;

  private BigDecimal carTrkBedGrndHghtMeas;

  private BigDecimal carMaxLoadVolMeas;

  private String pckeFrmCd;

  private String pckeFrmNameCd;

  private BigDecimal carMaxUntlCpQuan;

  private String carClsOfShpCd;

  private String carClsOfTlgLftrExstCd;

  private String carClsOfWingBodyExstCd;

  private String carClsOfRfgExstCd;

  private BigDecimal trmsOfLwrTmpMeas;

  private BigDecimal trmsOfUppTmpMeas;

  private String carClsOfCrnExstCd;

  private String carRmkAboutEqpmTxt;

  private String carCmpnNameOfGtpCrtfExstTxt;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner> vehicleAvbResource = new ArrayList<>();

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner(String serviceNo, String serviceName, String serviceStrtDate, String serviceStrtTime, BigDecimal freightRate, String giai, BigDecimal carMaxLoadCapacity1Meas) {
    this.serviceNo = serviceNo;
    this.serviceName = serviceName;
    this.serviceStrtDate = serviceStrtDate;
    this.serviceStrtTime = serviceStrtTime;
    this.freightRate = freightRate;
    this.giai = giai;
    this.carMaxLoadCapacity1Meas = carMaxLoadCapacity1Meas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner serviceNo(String serviceNo) {
    this.serviceNo = serviceNo;
    return this;
  }

  /**
   * 便・ダイヤ番号
   * @return serviceNo
  */
  @NotNull 
  @Schema(name = "service_no", example = "123456789012345678901234", description = "便・ダイヤ番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_no")
  public String getServiceNo() {
    return serviceNo;
  }

  public void setServiceNo(String serviceNo) {
    this.serviceNo = serviceNo;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * 便・ダイヤ名称
   * @return serviceName
  */
  @NotNull 
  @Schema(name = "service_name", example = "12345678901234567890", description = "便・ダイヤ名称", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_name")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner serviceStrtDate(String serviceStrtDate) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner serviceStrtTime(String serviceStrtTime) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner serviceEndDate(String serviceEndDate) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner serviceEndTime(String serviceEndTime) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner freightRate(BigDecimal freightRate) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carCtrlNumId(String carCtrlNumId) {
    this.carCtrlNumId = carCtrlNumId;
    return this;
  }

  /**
   * 車輌番号
   * @return carCtrlNumId
  */
  
  @Schema(name = "car_ctrl_num_id", example = "12345678901234567890", description = "車輌番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_ctrl_num_id")
  public String getCarCtrlNumId() {
    return carCtrlNumId;
  }

  public void setCarCtrlNumId(String carCtrlNumId) {
    this.carCtrlNumId = carCtrlNumId;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carLicensePltNumId(String carLicensePltNumId) {
    this.carLicensePltNumId = carLicensePltNumId;
    return this;
  }

  /**
   * 自動車登録番号
   * @return carLicensePltNumId
  */
  
  @Schema(name = "car_license_plt_num_id", description = "自動車登録番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_license_plt_num_id")
  public String getCarLicensePltNumId() {
    return carLicensePltNumId;
  }

  public void setCarLicensePltNumId(String carLicensePltNumId) {
    this.carLicensePltNumId = carLicensePltNumId;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner giai(String giai) {
    this.giai = giai;
    return this;
  }

  /**
   * GIAI
   * @return giai
  */
  @NotNull 
  @Schema(name = "giai", example = "123456789012345678901234567890", description = "GIAI", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("giai")
  public String getGiai() {
    return giai;
  }

  public void setGiai(String giai) {
    this.giai = giai;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carBodyNumCd(String carBodyNumCd) {
    this.carBodyNumCd = carBodyNumCd;
    return this;
  }

  /**
   * 車台番号
   * @return carBodyNumCd
  */
  
  @Schema(name = "car_body_num_cd", description = "車台番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_body_num_cd")
  public String getCarBodyNumCd() {
    return carBodyNumCd;
  }

  public void setCarBodyNumCd(String carBodyNumCd) {
    this.carBodyNumCd = carBodyNumCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carClsOfSizeCd(String carClsOfSizeCd) {
    this.carClsOfSizeCd = carClsOfSizeCd;
    return this;
  }

  /**
   * 車輌種別
   * @return carClsOfSizeCd
  */
  
  @Schema(name = "car_cls_of_size_cd", description = "車輌種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_size_cd")
  public String getCarClsOfSizeCd() {
    return carClsOfSizeCd;
  }

  public void setCarClsOfSizeCd(String carClsOfSizeCd) {
    this.carClsOfSizeCd = carClsOfSizeCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner tractorIdcr(String tractorIdcr) {
    this.tractorIdcr = tractorIdcr;
    return this;
  }

  /**
   * トラクタ（けん引車）
   * @return tractorIdcr
  */
  
  @Schema(name = "tractor_idcr", description = "トラクタ（けん引車）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tractor_idcr")
  public String getTractorIdcr() {
    return tractorIdcr;
  }

  public void setTractorIdcr(String tractorIdcr) {
    this.tractorIdcr = tractorIdcr;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner trailerLicensePltNumId(String trailerLicensePltNumId) {
    this.trailerLicensePltNumId = trailerLicensePltNumId;
    return this;
  }

  /**
   * トレーラ（被けん引車）
   * @return trailerLicensePltNumId
  */
  
  @Schema(name = "trailer_license_plt_num_id", description = "トレーラ（被けん引車）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trailer_license_plt_num_id")
  public String getTrailerLicensePltNumId() {
    return trailerLicensePltNumId;
  }

  public void setTrailerLicensePltNumId(String trailerLicensePltNumId) {
    this.trailerLicensePltNumId = trailerLicensePltNumId;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carWeigMeas(BigDecimal carWeigMeas) {
    this.carWeigMeas = carWeigMeas;
    return this;
  }

  /**
   * 車輌重量
   * @return carWeigMeas
  */
  @Valid 
  @Schema(name = "car_weig_meas", description = "車輌重量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_weig_meas")
  public BigDecimal getCarWeigMeas() {
    return carWeigMeas;
  }

  public void setCarWeigMeas(BigDecimal carWeigMeas) {
    this.carWeigMeas = carWeigMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carLnghMeas(BigDecimal carLnghMeas) {
    this.carLnghMeas = carLnghMeas;
    return this;
  }

  /**
   * 車輌長さ
   * @return carLnghMeas
  */
  @Valid 
  @Schema(name = "car_lngh_meas", description = "車輌長さ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_lngh_meas")
  public BigDecimal getCarLnghMeas() {
    return carLnghMeas;
  }

  public void setCarLnghMeas(BigDecimal carLnghMeas) {
    this.carLnghMeas = carLnghMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carWidMeas(BigDecimal carWidMeas) {
    this.carWidMeas = carWidMeas;
    return this;
  }

  /**
   * 車輌幅
   * @return carWidMeas
  */
  @Valid 
  @Schema(name = "car_wid_meas", description = "車輌幅", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_wid_meas")
  public BigDecimal getCarWidMeas() {
    return carWidMeas;
  }

  public void setCarWidMeas(BigDecimal carWidMeas) {
    this.carWidMeas = carWidMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carHghtMeas(BigDecimal carHghtMeas) {
    this.carHghtMeas = carHghtMeas;
    return this;
  }

  /**
   * 車輌高さ
   * @return carHghtMeas
  */
  @Valid 
  @Schema(name = "car_hght_meas", description = "車輌高さ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_hght_meas")
  public BigDecimal getCarHghtMeas() {
    return carHghtMeas;
  }

  public void setCarHghtMeas(BigDecimal carHghtMeas) {
    this.carHghtMeas = carHghtMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carMaxLoadCapacity1Meas(BigDecimal carMaxLoadCapacity1Meas) {
    this.carMaxLoadCapacity1Meas = carMaxLoadCapacity1Meas;
    return this;
  }

  /**
   * 最大積載量1
   * @return carMaxLoadCapacity1Meas
  */
  @NotNull @Valid 
  @Schema(name = "car_max_load_capacity1_meas", example = "123456", description = "最大積載量1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("car_max_load_capacity1_meas")
  public BigDecimal getCarMaxLoadCapacity1Meas() {
    return carMaxLoadCapacity1Meas;
  }

  public void setCarMaxLoadCapacity1Meas(BigDecimal carMaxLoadCapacity1Meas) {
    this.carMaxLoadCapacity1Meas = carMaxLoadCapacity1Meas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carMaxLoadCapacity2Meas(BigDecimal carMaxLoadCapacity2Meas) {
    this.carMaxLoadCapacity2Meas = carMaxLoadCapacity2Meas;
    return this;
  }

  /**
   * 最大積載量2
   * @return carMaxLoadCapacity2Meas
  */
  @Valid 
  @Schema(name = "car_max_load_capacity2_meas", description = "最大積載量2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_max_load_capacity2_meas")
  public BigDecimal getCarMaxLoadCapacity2Meas() {
    return carMaxLoadCapacity2Meas;
  }

  public void setCarMaxLoadCapacity2Meas(BigDecimal carMaxLoadCapacity2Meas) {
    this.carMaxLoadCapacity2Meas = carMaxLoadCapacity2Meas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carVolOfHzdItemMeas(BigDecimal carVolOfHzdItemMeas) {
    this.carVolOfHzdItemMeas = carVolOfHzdItemMeas;
    return this;
  }

  /**
   * 危険物容積
   * @return carVolOfHzdItemMeas
  */
  @Valid 
  @Schema(name = "car_vol_of_hzd_item_meas", description = "危険物容積", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_vol_of_hzd_item_meas")
  public BigDecimal getCarVolOfHzdItemMeas() {
    return carVolOfHzdItemMeas;
  }

  public void setCarVolOfHzdItemMeas(BigDecimal carVolOfHzdItemMeas) {
    this.carVolOfHzdItemMeas = carVolOfHzdItemMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carSpcGrvOfHzdItemMeas(BigDecimal carSpcGrvOfHzdItemMeas) {
    this.carSpcGrvOfHzdItemMeas = carSpcGrvOfHzdItemMeas;
    return this;
  }

  /**
   * 危険物比重
   * @return carSpcGrvOfHzdItemMeas
  */
  @Valid 
  @Schema(name = "car_spc_grv_of_hzd_item_meas", description = "危険物比重", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_spc_grv_of_hzd_item_meas")
  public BigDecimal getCarSpcGrvOfHzdItemMeas() {
    return carSpcGrvOfHzdItemMeas;
  }

  public void setCarSpcGrvOfHzdItemMeas(BigDecimal carSpcGrvOfHzdItemMeas) {
    this.carSpcGrvOfHzdItemMeas = carSpcGrvOfHzdItemMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carTrkBedHghtMeas(BigDecimal carTrkBedHghtMeas) {
    this.carTrkBedHghtMeas = carTrkBedHghtMeas;
    return this;
  }

  /**
   * 荷室高さ
   * @return carTrkBedHghtMeas
  */
  @Valid 
  @Schema(name = "car_trk_bed_hght_meas", description = "荷室高さ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_trk_bed_hght_meas")
  public BigDecimal getCarTrkBedHghtMeas() {
    return carTrkBedHghtMeas;
  }

  public void setCarTrkBedHghtMeas(BigDecimal carTrkBedHghtMeas) {
    this.carTrkBedHghtMeas = carTrkBedHghtMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carTrkBedWidMeas(BigDecimal carTrkBedWidMeas) {
    this.carTrkBedWidMeas = carTrkBedWidMeas;
    return this;
  }

  /**
   * 荷室全幅
   * @return carTrkBedWidMeas
  */
  @Valid 
  @Schema(name = "car_trk_bed_wid_meas", description = "荷室全幅", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_trk_bed_wid_meas")
  public BigDecimal getCarTrkBedWidMeas() {
    return carTrkBedWidMeas;
  }

  public void setCarTrkBedWidMeas(BigDecimal carTrkBedWidMeas) {
    this.carTrkBedWidMeas = carTrkBedWidMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carTrkBedLnghMeas(BigDecimal carTrkBedLnghMeas) {
    this.carTrkBedLnghMeas = carTrkBedLnghMeas;
    return this;
  }

  /**
   * 荷室長さ
   * @return carTrkBedLnghMeas
  */
  @Valid 
  @Schema(name = "car_trk_bed_lngh_meas", description = "荷室長さ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_trk_bed_lngh_meas")
  public BigDecimal getCarTrkBedLnghMeas() {
    return carTrkBedLnghMeas;
  }

  public void setCarTrkBedLnghMeas(BigDecimal carTrkBedLnghMeas) {
    this.carTrkBedLnghMeas = carTrkBedLnghMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carTrkBedGrndHghtMeas(BigDecimal carTrkBedGrndHghtMeas) {
    this.carTrkBedGrndHghtMeas = carTrkBedGrndHghtMeas;
    return this;
  }

  /**
   * 荷台高さ
   * @return carTrkBedGrndHghtMeas
  */
  @Valid 
  @Schema(name = "car_trk_bed_grnd_hght_meas", description = "荷台高さ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_trk_bed_grnd_hght_meas")
  public BigDecimal getCarTrkBedGrndHghtMeas() {
    return carTrkBedGrndHghtMeas;
  }

  public void setCarTrkBedGrndHghtMeas(BigDecimal carTrkBedGrndHghtMeas) {
    this.carTrkBedGrndHghtMeas = carTrkBedGrndHghtMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carMaxLoadVolMeas(BigDecimal carMaxLoadVolMeas) {
    this.carMaxLoadVolMeas = carMaxLoadVolMeas;
    return this;
  }

  /**
   * 最大積載容量
   * @return carMaxLoadVolMeas
  */
  @Valid 
  @Schema(name = "car_max_load_vol_meas", description = "最大積載容量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_max_load_vol_meas")
  public BigDecimal getCarMaxLoadVolMeas() {
    return carMaxLoadVolMeas;
  }

  public void setCarMaxLoadVolMeas(BigDecimal carMaxLoadVolMeas) {
    this.carMaxLoadVolMeas = carMaxLoadVolMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner pckeFrmCd(String pckeFrmCd) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner pckeFrmNameCd(String pckeFrmNameCd) {
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

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carMaxUntlCpQuan(BigDecimal carMaxUntlCpQuan) {
    this.carMaxUntlCpQuan = carMaxUntlCpQuan;
    return this;
  }

  /**
   * 最大積載数
   * @return carMaxUntlCpQuan
  */
  @Valid 
  @Schema(name = "car_max_untl_cp_quan", description = "最大積載数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_max_untl_cp_quan")
  public BigDecimal getCarMaxUntlCpQuan() {
    return carMaxUntlCpQuan;
  }

  public void setCarMaxUntlCpQuan(BigDecimal carMaxUntlCpQuan) {
    this.carMaxUntlCpQuan = carMaxUntlCpQuan;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carClsOfShpCd(String carClsOfShpCd) {
    this.carClsOfShpCd = carClsOfShpCd;
    return this;
  }

  /**
   * 平ボディ/バンボディ
   * @return carClsOfShpCd
  */
  
  @Schema(name = "car_cls_of_shp_cd", description = "平ボディ/バンボディ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_shp_cd")
  public String getCarClsOfShpCd() {
    return carClsOfShpCd;
  }

  public void setCarClsOfShpCd(String carClsOfShpCd) {
    this.carClsOfShpCd = carClsOfShpCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carClsOfTlgLftrExstCd(String carClsOfTlgLftrExstCd) {
    this.carClsOfTlgLftrExstCd = carClsOfTlgLftrExstCd;
    return this;
  }

  /**
   * パワーゲート有無
   * @return carClsOfTlgLftrExstCd
  */
  
  @Schema(name = "car_cls_of_tlg_lftr_exst_cd", description = "パワーゲート有無", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_tlg_lftr_exst_cd")
  public String getCarClsOfTlgLftrExstCd() {
    return carClsOfTlgLftrExstCd;
  }

  public void setCarClsOfTlgLftrExstCd(String carClsOfTlgLftrExstCd) {
    this.carClsOfTlgLftrExstCd = carClsOfTlgLftrExstCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carClsOfWingBodyExstCd(String carClsOfWingBodyExstCd) {
    this.carClsOfWingBodyExstCd = carClsOfWingBodyExstCd;
    return this;
  }

  /**
   * ウィング有無
   * @return carClsOfWingBodyExstCd
  */
  
  @Schema(name = "car_cls_of_wing_body_exst_cd", description = "ウィング有無", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_wing_body_exst_cd")
  public String getCarClsOfWingBodyExstCd() {
    return carClsOfWingBodyExstCd;
  }

  public void setCarClsOfWingBodyExstCd(String carClsOfWingBodyExstCd) {
    this.carClsOfWingBodyExstCd = carClsOfWingBodyExstCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carClsOfRfgExstCd(String carClsOfRfgExstCd) {
    this.carClsOfRfgExstCd = carClsOfRfgExstCd;
    return this;
  }

  /**
   * 冷凍・冷蔵設備
   * @return carClsOfRfgExstCd
  */
  
  @Schema(name = "car_cls_of_rfg_exst_cd", description = "冷凍・冷蔵設備", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_rfg_exst_cd")
  public String getCarClsOfRfgExstCd() {
    return carClsOfRfgExstCd;
  }

  public void setCarClsOfRfgExstCd(String carClsOfRfgExstCd) {
    this.carClsOfRfgExstCd = carClsOfRfgExstCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner trmsOfLwrTmpMeas(BigDecimal trmsOfLwrTmpMeas) {
    this.trmsOfLwrTmpMeas = trmsOfLwrTmpMeas;
    return this;
  }

  /**
   * 温度範囲（下限）
   * @return trmsOfLwrTmpMeas
  */
  @Valid 
  @Schema(name = "trms_of_lwr_tmp_meas", description = "温度範囲（下限）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_lwr_tmp_meas")
  public BigDecimal getTrmsOfLwrTmpMeas() {
    return trmsOfLwrTmpMeas;
  }

  public void setTrmsOfLwrTmpMeas(BigDecimal trmsOfLwrTmpMeas) {
    this.trmsOfLwrTmpMeas = trmsOfLwrTmpMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner trmsOfUppTmpMeas(BigDecimal trmsOfUppTmpMeas) {
    this.trmsOfUppTmpMeas = trmsOfUppTmpMeas;
    return this;
  }

  /**
   * 温度範囲（上限）
   * @return trmsOfUppTmpMeas
  */
  @Valid 
  @Schema(name = "trms_of_upp_tmp_meas", description = "温度範囲（上限）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trms_of_upp_tmp_meas")
  public BigDecimal getTrmsOfUppTmpMeas() {
    return trmsOfUppTmpMeas;
  }

  public void setTrmsOfUppTmpMeas(BigDecimal trmsOfUppTmpMeas) {
    this.trmsOfUppTmpMeas = trmsOfUppTmpMeas;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carClsOfCrnExstCd(String carClsOfCrnExstCd) {
    this.carClsOfCrnExstCd = carClsOfCrnExstCd;
    return this;
  }

  /**
   * クレーン付
   * @return carClsOfCrnExstCd
  */
  
  @Schema(name = "car_cls_of_crn_exst_cd", description = "クレーン付", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cls_of_crn_exst_cd")
  public String getCarClsOfCrnExstCd() {
    return carClsOfCrnExstCd;
  }

  public void setCarClsOfCrnExstCd(String carClsOfCrnExstCd) {
    this.carClsOfCrnExstCd = carClsOfCrnExstCd;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carRmkAboutEqpmTxt(String carRmkAboutEqpmTxt) {
    this.carRmkAboutEqpmTxt = carRmkAboutEqpmTxt;
    return this;
  }

  /**
   * 車輌設備補足
   * @return carRmkAboutEqpmTxt
  */
  
  @Schema(name = "car_rmk_about_eqpm_txt", description = "車輌設備補足", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_rmk_about_eqpm_txt")
  public String getCarRmkAboutEqpmTxt() {
    return carRmkAboutEqpmTxt;
  }

  public void setCarRmkAboutEqpmTxt(String carRmkAboutEqpmTxt) {
    this.carRmkAboutEqpmTxt = carRmkAboutEqpmTxt;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner carCmpnNameOfGtpCrtfExstTxt(String carCmpnNameOfGtpCrtfExstTxt) {
    this.carCmpnNameOfGtpCrtfExstTxt = carCmpnNameOfGtpCrtfExstTxt;
    return this;
  }

  /**
   * 車輌入門証保有
   * @return carCmpnNameOfGtpCrtfExstTxt
  */
  
  @Schema(name = "car_cmpn_name_of_gtp_crtf_exst_txt", description = "車輌入門証保有", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("car_cmpn_name_of_gtp_crtf_exst_txt")
  public String getCarCmpnNameOfGtpCrtfExstTxt() {
    return carCmpnNameOfGtpCrtfExstTxt;
  }

  public void setCarCmpnNameOfGtpCrtfExstTxt(String carCmpnNameOfGtpCrtfExstTxt) {
    this.carCmpnNameOfGtpCrtfExstTxt = carCmpnNameOfGtpCrtfExstTxt;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner vehicleAvbResource(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner> vehicleAvbResource) {
    this.vehicleAvbResource = vehicleAvbResource;
    return this;
  }

  public DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner addVehicleAvbResourceItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner vehicleAvbResourceItem) {
    if (this.vehicleAvbResource == null) {
      this.vehicleAvbResource = new ArrayList<>();
    }
    this.vehicleAvbResource.add(vehicleAvbResourceItem);
    return this;
  }

  /**
   * 車輌稼働可能リソース
   * @return vehicleAvbResource
  */
  @Valid 
  @Schema(name = "vehicle_avb_resource", description = "車輌稼働可能リソース", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicle_avb_resource")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner> getVehicleAvbResource() {
    return vehicleAvbResource;
  }

  public void setVehicleAvbResource(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInnerVehicleAvbResourceInner> vehicleAvbResource) {
    this.vehicleAvbResource = vehicleAvbResource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner = (DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner) o;
    return Objects.equals(this.serviceNo, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.serviceNo) &&
        Objects.equals(this.serviceName, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.serviceName) &&
        Objects.equals(this.serviceStrtDate, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.serviceStrtDate) &&
        Objects.equals(this.serviceStrtTime, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.serviceStrtTime) &&
        Objects.equals(this.serviceEndDate, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.serviceEndDate) &&
        Objects.equals(this.serviceEndTime, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.serviceEndTime) &&
        Objects.equals(this.freightRate, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.freightRate) &&
        Objects.equals(this.carCtrlNumId, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carCtrlNumId) &&
        Objects.equals(this.carLicensePltNumId, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carLicensePltNumId) &&
        Objects.equals(this.giai, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.giai) &&
        Objects.equals(this.carBodyNumCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carBodyNumCd) &&
        Objects.equals(this.carClsOfSizeCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carClsOfSizeCd) &&
        Objects.equals(this.tractorIdcr, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.tractorIdcr) &&
        Objects.equals(this.trailerLicensePltNumId, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.trailerLicensePltNumId) &&
        Objects.equals(this.carWeigMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carWeigMeas) &&
        Objects.equals(this.carLnghMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carLnghMeas) &&
        Objects.equals(this.carWidMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carWidMeas) &&
        Objects.equals(this.carHghtMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carHghtMeas) &&
        Objects.equals(this.carMaxLoadCapacity1Meas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carMaxLoadCapacity1Meas) &&
        Objects.equals(this.carMaxLoadCapacity2Meas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carMaxLoadCapacity2Meas) &&
        Objects.equals(this.carVolOfHzdItemMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carVolOfHzdItemMeas) &&
        Objects.equals(this.carSpcGrvOfHzdItemMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carSpcGrvOfHzdItemMeas) &&
        Objects.equals(this.carTrkBedHghtMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carTrkBedHghtMeas) &&
        Objects.equals(this.carTrkBedWidMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carTrkBedWidMeas) &&
        Objects.equals(this.carTrkBedLnghMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carTrkBedLnghMeas) &&
        Objects.equals(this.carTrkBedGrndHghtMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carTrkBedGrndHghtMeas) &&
        Objects.equals(this.carMaxLoadVolMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carMaxLoadVolMeas) &&
        Objects.equals(this.pckeFrmCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.pckeFrmCd) &&
        Objects.equals(this.pckeFrmNameCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.pckeFrmNameCd) &&
        Objects.equals(this.carMaxUntlCpQuan, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carMaxUntlCpQuan) &&
        Objects.equals(this.carClsOfShpCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carClsOfShpCd) &&
        Objects.equals(this.carClsOfTlgLftrExstCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carClsOfTlgLftrExstCd) &&
        Objects.equals(this.carClsOfWingBodyExstCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carClsOfWingBodyExstCd) &&
        Objects.equals(this.carClsOfRfgExstCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carClsOfRfgExstCd) &&
        Objects.equals(this.trmsOfLwrTmpMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.trmsOfLwrTmpMeas) &&
        Objects.equals(this.trmsOfUppTmpMeas, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.trmsOfUppTmpMeas) &&
        Objects.equals(this.carClsOfCrnExstCd, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carClsOfCrnExstCd) &&
        Objects.equals(this.carRmkAboutEqpmTxt, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carRmkAboutEqpmTxt) &&
        Objects.equals(this.carCmpnNameOfGtpCrtfExstTxt, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.carCmpnNameOfGtpCrtfExstTxt) &&
        Objects.equals(this.vehicleAvbResource, dataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner.vehicleAvbResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceNo, serviceName, serviceStrtDate, serviceStrtTime, serviceEndDate, serviceEndTime, freightRate, carCtrlNumId, carLicensePltNumId, giai, carBodyNumCd, carClsOfSizeCd, tractorIdcr, trailerLicensePltNumId, carWeigMeas, carLnghMeas, carWidMeas, carHghtMeas, carMaxLoadCapacity1Meas, carMaxLoadCapacity2Meas, carVolOfHzdItemMeas, carSpcGrvOfHzdItemMeas, carTrkBedHghtMeas, carTrkBedWidMeas, carTrkBedLnghMeas, carTrkBedGrndHghtMeas, carMaxLoadVolMeas, pckeFrmCd, pckeFrmNameCd, carMaxUntlCpQuan, carClsOfShpCd, carClsOfTlgLftrExstCd, carClsOfWingBodyExstCd, carClsOfRfgExstCd, trmsOfLwrTmpMeas, trmsOfUppTmpMeas, carClsOfCrnExstCd, carRmkAboutEqpmTxt, carCmpnNameOfGtpCrtfExstTxt, vehicleAvbResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInnerCarInfoInner {\n");
    sb.append("    serviceNo: ").append(toIndentedString(serviceNo)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceStrtDate: ").append(toIndentedString(serviceStrtDate)).append("\n");
    sb.append("    serviceStrtTime: ").append(toIndentedString(serviceStrtTime)).append("\n");
    sb.append("    serviceEndDate: ").append(toIndentedString(serviceEndDate)).append("\n");
    sb.append("    serviceEndTime: ").append(toIndentedString(serviceEndTime)).append("\n");
    sb.append("    freightRate: ").append(toIndentedString(freightRate)).append("\n");
    sb.append("    carCtrlNumId: ").append(toIndentedString(carCtrlNumId)).append("\n");
    sb.append("    carLicensePltNumId: ").append(toIndentedString(carLicensePltNumId)).append("\n");
    sb.append("    giai: ").append(toIndentedString(giai)).append("\n");
    sb.append("    carBodyNumCd: ").append(toIndentedString(carBodyNumCd)).append("\n");
    sb.append("    carClsOfSizeCd: ").append(toIndentedString(carClsOfSizeCd)).append("\n");
    sb.append("    tractorIdcr: ").append(toIndentedString(tractorIdcr)).append("\n");
    sb.append("    trailerLicensePltNumId: ").append(toIndentedString(trailerLicensePltNumId)).append("\n");
    sb.append("    carWeigMeas: ").append(toIndentedString(carWeigMeas)).append("\n");
    sb.append("    carLnghMeas: ").append(toIndentedString(carLnghMeas)).append("\n");
    sb.append("    carWidMeas: ").append(toIndentedString(carWidMeas)).append("\n");
    sb.append("    carHghtMeas: ").append(toIndentedString(carHghtMeas)).append("\n");
    sb.append("    carMaxLoadCapacity1Meas: ").append(toIndentedString(carMaxLoadCapacity1Meas)).append("\n");
    sb.append("    carMaxLoadCapacity2Meas: ").append(toIndentedString(carMaxLoadCapacity2Meas)).append("\n");
    sb.append("    carVolOfHzdItemMeas: ").append(toIndentedString(carVolOfHzdItemMeas)).append("\n");
    sb.append("    carSpcGrvOfHzdItemMeas: ").append(toIndentedString(carSpcGrvOfHzdItemMeas)).append("\n");
    sb.append("    carTrkBedHghtMeas: ").append(toIndentedString(carTrkBedHghtMeas)).append("\n");
    sb.append("    carTrkBedWidMeas: ").append(toIndentedString(carTrkBedWidMeas)).append("\n");
    sb.append("    carTrkBedLnghMeas: ").append(toIndentedString(carTrkBedLnghMeas)).append("\n");
    sb.append("    carTrkBedGrndHghtMeas: ").append(toIndentedString(carTrkBedGrndHghtMeas)).append("\n");
    sb.append("    carMaxLoadVolMeas: ").append(toIndentedString(carMaxLoadVolMeas)).append("\n");
    sb.append("    pckeFrmCd: ").append(toIndentedString(pckeFrmCd)).append("\n");
    sb.append("    pckeFrmNameCd: ").append(toIndentedString(pckeFrmNameCd)).append("\n");
    sb.append("    carMaxUntlCpQuan: ").append(toIndentedString(carMaxUntlCpQuan)).append("\n");
    sb.append("    carClsOfShpCd: ").append(toIndentedString(carClsOfShpCd)).append("\n");
    sb.append("    carClsOfTlgLftrExstCd: ").append(toIndentedString(carClsOfTlgLftrExstCd)).append("\n");
    sb.append("    carClsOfWingBodyExstCd: ").append(toIndentedString(carClsOfWingBodyExstCd)).append("\n");
    sb.append("    carClsOfRfgExstCd: ").append(toIndentedString(carClsOfRfgExstCd)).append("\n");
    sb.append("    trmsOfLwrTmpMeas: ").append(toIndentedString(trmsOfLwrTmpMeas)).append("\n");
    sb.append("    trmsOfUppTmpMeas: ").append(toIndentedString(trmsOfUppTmpMeas)).append("\n");
    sb.append("    carClsOfCrnExstCd: ").append(toIndentedString(carClsOfCrnExstCd)).append("\n");
    sb.append("    carRmkAboutEqpmTxt: ").append(toIndentedString(carRmkAboutEqpmTxt)).append("\n");
    sb.append("    carCmpnNameOfGtpCrtfExstTxt: ").append(toIndentedString(carCmpnNameOfGtpCrtfExstTxt)).append("\n");
    sb.append("    vehicleAvbResource: ").append(toIndentedString(vehicleAvbResource)).append("\n");
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

