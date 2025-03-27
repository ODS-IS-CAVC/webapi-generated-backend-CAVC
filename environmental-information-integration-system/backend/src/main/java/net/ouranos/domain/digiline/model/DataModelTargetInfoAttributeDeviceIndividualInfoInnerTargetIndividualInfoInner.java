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
 * DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner
 */

@JsonTypeName("dataModel_targetInfo_attribute_deviceIndividualInfo_inner_targetIndividualInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner {

  private Integer commonServiceStandardID;

  private Integer targetMessageID;

  private Integer targetIndividualVersionInfo;

  private Long targetID;

  private Integer targetIndividualIncrementCounter;

  private Integer dataLength;

  private Integer individualOptionFlag;

  private Boolean leapSecondCorrectionInfo;

  private String time;

  private Integer latitude;

  private Integer longitude;

  private Integer elevation;

  private Integer positionConf;

  private Integer elevationConf;

  private Integer speed;

  private Integer heading;

  private Integer acceleration;

  private Integer speedConf;

  private Integer headingConf;

  private Integer forwardRearAccelerationConf;

  private Integer transmissionState;

  private Integer steeringWheelAngle;

  private Integer sizeClassification;

  private Integer roleClassification;

  private Integer vehicleWidth;

  private Integer vehicleLength;

  private Integer positionDelay;

  private Integer revisionCounter;

  private Integer roadFacilities;

  private Integer roadClassification;

  private Integer semiMajorAxisOfPositionalErrorEllipse;

  private Integer semiMinorAxisOfPositionalErrorEllipse;

  private Integer semiMajorAxisOrientationOfPositionalErrorEllipse;

  private Integer gpSPositioningMode;

  private Integer GPSPDOP;

  private Integer numberOfGPSSatellitesInUse;

  private Integer gpSMultiPathDetection;

  private Boolean deadReckoningAvailability;

  private Boolean mapMatchingAvailability;

  private Integer yawRate;

  private Integer brakeAppliedStatus;

  private Integer auxiliaryBrakeAppliedStatus;

  private Integer throttlePosition;

  private Integer exteriorLights;

  private Integer adaptiveCruiseControlStatus;

  private Integer cooperativeAdaptiveCruiseControlStatus;

  private Integer preCrashSafetyStatus;

  private Integer antilockBrakeStatus;

  private Integer tractionControlStatus;

  private Integer electronicStabilityControlStatus;

  private Integer laneKeepingAssistStatus;

  private Integer laneDepartureWarningStatus;

  private Integer intersectionDistanceInformationAvailability;

  private Integer intersectionDistance;

  private Integer intersectionPositionInformationAvailability;

  private Integer intersectionLatitude;

  private Integer intersectionLongitude;

  private Integer extendedInformation;

  private String targetIndividualExtendedData;

  private Integer restingState;

  private Integer existingTime;

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner(Integer commonServiceStandardID, Integer targetMessageID, Integer targetIndividualVersionInfo, Long targetID, Integer targetIndividualIncrementCounter, Integer dataLength, Integer individualOptionFlag, Boolean leapSecondCorrectionInfo, String time, Integer latitude, Integer longitude, Integer elevation, Integer positionConf, Integer elevationConf, Integer speed, Integer heading, Integer acceleration, Integer speedConf, Integer headingConf, Integer forwardRearAccelerationConf, Integer transmissionState, Integer steeringWheelAngle, Integer sizeClassification, Integer roleClassification, Integer vehicleWidth, Integer vehicleLength) {
    this.commonServiceStandardID = commonServiceStandardID;
    this.targetMessageID = targetMessageID;
    this.targetIndividualVersionInfo = targetIndividualVersionInfo;
    this.targetID = targetID;
    this.targetIndividualIncrementCounter = targetIndividualIncrementCounter;
    this.dataLength = dataLength;
    this.individualOptionFlag = individualOptionFlag;
    this.leapSecondCorrectionInfo = leapSecondCorrectionInfo;
    this.time = time;
    this.latitude = latitude;
    this.longitude = longitude;
    this.elevation = elevation;
    this.positionConf = positionConf;
    this.elevationConf = elevationConf;
    this.speed = speed;
    this.heading = heading;
    this.acceleration = acceleration;
    this.speedConf = speedConf;
    this.headingConf = headingConf;
    this.forwardRearAccelerationConf = forwardRearAccelerationConf;
    this.transmissionState = transmissionState;
    this.steeringWheelAngle = steeringWheelAngle;
    this.sizeClassification = sizeClassification;
    this.roleClassification = roleClassification;
    this.vehicleWidth = vehicleWidth;
    this.vehicleLength = vehicleLength;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner commonServiceStandardID(Integer commonServiceStandardID) {
    this.commonServiceStandardID = commonServiceStandardID;
    return this;
  }

  /**
   * 共通サービス規格（このメッセージが準ずる規格）を識別するID情報
   * minimum: 0
   * maximum: 7
   * @return commonServiceStandardID
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "commonServiceStandardID", example = "1", description = "共通サービス規格（このメッセージが準ずる規格）を識別するID情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("commonServiceStandardID")
  public Integer getCommonServiceStandardID() {
    return commonServiceStandardID;
  }

  public void setCommonServiceStandardID(Integer commonServiceStandardID) {
    this.commonServiceStandardID = commonServiceStandardID;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner targetMessageID(Integer targetMessageID) {
    this.targetMessageID = targetMessageID;
    return this;
  }

  /**
   * メッセージを識別するID情報
   * minimum: 0
   * maximum: 3
   * @return targetMessageID
  */
  @NotNull @Min(0) @Max(3) 
  @Schema(name = "targetMessageID", example = "1", description = "メッセージを識別するID情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetMessageID")
  public Integer getTargetMessageID() {
    return targetMessageID;
  }

  public void setTargetMessageID(Integer targetMessageID) {
    this.targetMessageID = targetMessageID;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner targetIndividualVersionInfo(Integer targetIndividualVersionInfo) {
    this.targetIndividualVersionInfo = targetIndividualVersionInfo;
    return this;
  }

  /**
   * メッセージのバージョン情報
   * minimum: 0
   * maximum: 7
   * @return targetIndividualVersionInfo
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "targetIndividualVersionInfo", example = "1", description = "メッセージのバージョン情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetIndividualVersionInfo")
  public Integer getTargetIndividualVersionInfo() {
    return targetIndividualVersionInfo;
  }

  public void setTargetIndividualVersionInfo(Integer targetIndividualVersionInfo) {
    this.targetIndividualVersionInfo = targetIndividualVersionInfo;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner targetID(Long targetID) {
    this.targetID = targetID;
    return this;
  }

  /**
   * 前回送信時と同一物標かどうかを識別できるように路側機が付与するID情報(物標ID)
   * minimum: 0
   * maximum: 4294967295
   * @return targetID
  */
  @NotNull @Min(0L) @Max(4294967295L) 
  @Schema(name = "targetID", example = "1234567890", description = "前回送信時と同一物標かどうかを識別できるように路側機が付与するID情報(物標ID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetID")
  public Long getTargetID() {
    return targetID;
  }

  public void setTargetID(Long targetID) {
    this.targetID = targetID;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner targetIndividualIncrementCounter(Integer targetIndividualIncrementCounter) {
    this.targetIndividualIncrementCounter = targetIndividualIncrementCounter;
    return this;
  }

  /**
   * データ送信順を示す番号
   * minimum: 0
   * maximum: 255
   * @return targetIndividualIncrementCounter
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "targetIndividualIncrementCounter", example = "123", description = "データ送信順を示す番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetIndividualIncrementCounter")
  public Integer getTargetIndividualIncrementCounter() {
    return targetIndividualIncrementCounter;
  }

  public void setTargetIndividualIncrementCounter(Integer targetIndividualIncrementCounter) {
    this.targetIndividualIncrementCounter = targetIndividualIncrementCounter;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner dataLength(Integer dataLength) {
    this.dataLength = dataLength;
    return this;
  }

  /**
   * 物標個別拡張領域を除いた物標個別情報のサイズをバイト数で表す
   * minimum: 0
   * maximum: 255
   * @return dataLength
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "dataLength", example = "123", description = "物標個別拡張領域を除いた物標個別情報のサイズをバイト数で表す", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataLength")
  public Integer getDataLength() {
    return dataLength;
  }

  public void setDataLength(Integer dataLength) {
    this.dataLength = dataLength;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner individualOptionFlag(Integer individualOptionFlag) {
    this.individualOptionFlag = individualOptionFlag;
    return this;
  }

  /**
   * 格納するオプション情報を示すフラグ情報
   * minimum: 0
   * maximum: 255
   * @return individualOptionFlag
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "individualOptionFlag", example = "123", description = "格納するオプション情報を示すフラグ情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("individualOptionFlag")
  public Integer getIndividualOptionFlag() {
    return individualOptionFlag;
  }

  public void setIndividualOptionFlag(Integer individualOptionFlag) {
    this.individualOptionFlag = individualOptionFlag;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner leapSecondCorrectionInfo(Boolean leapSecondCorrectionInfo) {
    this.leapSecondCorrectionInfo = leapSecondCorrectionInfo;
    return this;
  }

  /**
   * うるう秒補正の有無を示す情報
   * @return leapSecondCorrectionInfo
  */
  @NotNull 
  @Schema(name = "leapSecondCorrectionInfo", example = "true", description = "うるう秒補正の有無を示す情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("leapSecondCorrectionInfo")
  public Boolean getLeapSecondCorrectionInfo() {
    return leapSecondCorrectionInfo;
  }

  public void setLeapSecondCorrectionInfo(Boolean leapSecondCorrectionInfo) {
    this.leapSecondCorrectionInfo = leapSecondCorrectionInfo;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 物標情報が生成された時刻(ミリ秒まで)(JST)
   * @return time
  */
  @NotNull @Size(min = 0, max = 30) 
  @Schema(name = "time", example = "2024-01-23T01:23:45.678+09:00", description = "物標情報が生成された時刻(ミリ秒まで)(JST)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   *  物標の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現(分解能: 0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return latitude
  */
  @NotNull @Min(-2147483648) @Max(900000000) 
  @Schema(name = "latitude", example = "123456789", description = " 物標の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現(分解能: 0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner longitude(Integer longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * 物標の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現(分解能: 0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return longitude
  */
  @NotNull @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "longitude", example = "1234567891", description = "物標の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現(分解能: 0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner elevation(Integer elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * 物標の基準面からの高さ情報(分解能: 0.1m)
   * minimum: -4095
   * maximum: 61440
   * @return elevation
  */
  @NotNull @Min(-4095) @Max(61440) 
  @Schema(name = "elevation", example = "123", description = "物標の基準面からの高さ情報(分解能: 0.1m)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elevation")
  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner positionConf(Integer positionConf) {
    this.positionConf = positionConf;
    return this;
  }

  /**
   * 緯度・経度の信頼度を示す情報
   * minimum: 0
   * maximum: 15
   * @return positionConf
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "positionConf", example = "1", description = "緯度・経度の信頼度を示す情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("positionConf")
  public Integer getPositionConf() {
    return positionConf;
  }

  public void setPositionConf(Integer positionConf) {
    this.positionConf = positionConf;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner elevationConf(Integer elevationConf) {
    this.elevationConf = elevationConf;
    return this;
  }

  /**
   * 高度の信頼度を示す情報
   * minimum: 0
   * maximum: 15
   * @return elevationConf
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "elevationConf", example = "2", description = "高度の信頼度を示す情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elevationConf")
  public Integer getElevationConf() {
    return elevationConf;
  }

  public void setElevationConf(Integer elevationConf) {
    this.elevationConf = elevationConf;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  /**
   * 物標の速度(単位: m/s)．(分解能: 0.01m/s)
   * minimum: 0
   * maximum: 65535
   * @return speed
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "speed", example = "1234", description = "物標の速度(単位: m/s)．(分解能: 0.01m/s)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * 物標の進行方位角情報．北を0度とし，時計回りの角度値をセットする．(分解能: 0.0125度)
   * minimum: 0
   * maximum: 65535
   * @return heading
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "heading", example = "14400", description = "物標の進行方位角情報．北を0度とし，時計回りの角度値をセットする．(分解能: 0.0125度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("heading")
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner acceleration(Integer acceleration) {
    this.acceleration = acceleration;
    return this;
  }

  /**
   * 物標の前後方向の加速度(単位：m/s^2)．(分解能: 0.01m/s^2)
   * minimum: -32768
   * maximum: 2000
   * @return acceleration
  */
  @NotNull @Min(-32768) @Max(2000) 
  @Schema(name = "acceleration", example = "123", description = "物標の前後方向の加速度(単位：m/s^2)．(分解能: 0.01m/s^2)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acceleration")
  public Integer getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(Integer acceleration) {
    this.acceleration = acceleration;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner speedConf(Integer speedConf) {
    this.speedConf = speedConf;
    return this;
  }

  /**
   * 物標の速度の信頼度を示す情報
   * minimum: 0
   * maximum: 7
   * @return speedConf
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "speedConf", example = "1", description = "物標の速度の信頼度を示す情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("speedConf")
  public Integer getSpeedConf() {
    return speedConf;
  }

  public void setSpeedConf(Integer speedConf) {
    this.speedConf = speedConf;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner headingConf(Integer headingConf) {
    this.headingConf = headingConf;
    return this;
  }

  /**
   * 物標の方位角の信頼度を示す情報
   * minimum: 0
   * maximum: 7
   * @return headingConf
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "headingConf", example = "1", description = "物標の方位角の信頼度を示す情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("headingConf")
  public Integer getHeadingConf() {
    return headingConf;
  }

  public void setHeadingConf(Integer headingConf) {
    this.headingConf = headingConf;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner forwardRearAccelerationConf(Integer forwardRearAccelerationConf) {
    this.forwardRearAccelerationConf = forwardRearAccelerationConf;
    return this;
  }

  /**
   * 物標の前後方向加速度の信頼度を示す情報
   * minimum: 0
   * maximum: 7
   * @return forwardRearAccelerationConf
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "forwardRearAccelerationConf", example = "1", description = "物標の前後方向加速度の信頼度を示す情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("forwardRearAccelerationConf")
  public Integer getForwardRearAccelerationConf() {
    return forwardRearAccelerationConf;
  }

  public void setForwardRearAccelerationConf(Integer forwardRearAccelerationConf) {
    this.forwardRearAccelerationConf = forwardRearAccelerationConf;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner transmissionState(Integer transmissionState) {
    this.transmissionState = transmissionState;
    return this;
  }

  /**
   * 車両のシフトポジション情報
   * minimum: 0
   * maximum: 7
   * @return transmissionState
  */
  @NotNull @Min(0) @Max(7) 
  @Schema(name = "transmissionState", example = "1", description = "車両のシフトポジション情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transmissionState")
  public Integer getTransmissionState() {
    return transmissionState;
  }

  public void setTransmissionState(Integer transmissionState) {
    this.transmissionState = transmissionState;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner steeringWheelAngle(Integer steeringWheelAngle) {
    this.steeringWheelAngle = steeringWheelAngle;
    return this;
  }

  /**
   * ステアリングの操舵角度情報．プラスを時計回りとする．(分解能: 1.5度)
   * minimum: -2048
   * maximum: 2047
   * @return steeringWheelAngle
  */
  @NotNull @Min(-2048) @Max(2047) 
  @Schema(name = "steeringWheelAngle", example = "1235", description = "ステアリングの操舵角度情報．プラスを時計回りとする．(分解能: 1.5度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("steeringWheelAngle")
  public Integer getSteeringWheelAngle() {
    return steeringWheelAngle;
  }

  public void setSteeringWheelAngle(Integer steeringWheelAngle) {
    this.steeringWheelAngle = steeringWheelAngle;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner sizeClassification(Integer sizeClassification) {
    this.sizeClassification = sizeClassification;
    return this;
  }

  /**
   * 物標の種別
   * minimum: 0
   * maximum: 15
   * @return sizeClassification
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "sizeClassification", example = "2", description = "物標の種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sizeClassification")
  public Integer getSizeClassification() {
    return sizeClassification;
  }

  public void setSizeClassification(Integer sizeClassification) {
    this.sizeClassification = sizeClassification;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner roleClassification(Integer roleClassification) {
    this.roleClassification = roleClassification;
    return this;
  }

  /**
   * 物標が車両の場合の用途種別．車両以外の場合15(その他)とする
   * minimum: 0
   * maximum: 15
   * @return roleClassification
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "roleClassification", example = "1", description = "物標が車両の場合の用途種別．車両以外の場合15(その他)とする", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roleClassification")
  public Integer getRoleClassification() {
    return roleClassification;
  }

  public void setRoleClassification(Integer roleClassification) {
    this.roleClassification = roleClassification;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner vehicleWidth(Integer vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
    return this;
  }

  /**
   * 自車両の全幅情報(単位：m). (分解能: 0.01m)
   * minimum: 1
   * maximum: 1023
   * @return vehicleWidth
  */
  @NotNull @Min(1) @Max(1023) 
  @Schema(name = "vehicleWidth", example = "140", description = "自車両の全幅情報(単位：m). (分解能: 0.01m)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleWidth")
  public Integer getVehicleWidth() {
    return vehicleWidth;
  }

  public void setVehicleWidth(Integer vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner vehicleLength(Integer vehicleLength) {
    this.vehicleLength = vehicleLength;
    return this;
  }

  /**
   * 自車両の全長情報(単位：m)．(分解能: 0.01m)
   * minimum: 1
   * maximum: 16383
   * @return vehicleLength
  */
  @NotNull @Min(1) @Max(16383) 
  @Schema(name = "vehicleLength", example = "180", description = "自車両の全長情報(単位：m)．(分解能: 0.01m)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleLength")
  public Integer getVehicleLength() {
    return vehicleLength;
  }

  public void setVehicleLength(Integer vehicleLength) {
    this.vehicleLength = vehicleLength;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner positionDelay(Integer positionDelay) {
    this.positionDelay = positionDelay;
    return this;
  }

  /**
   * 測位データ更新周期情報(単位：ms) (分解能：100ms)
   * minimum: 1
   * maximum: 31
   * @return positionDelay
  */
  @Min(1) @Max(31) 
  @Schema(name = "positionDelay", example = "2", description = "測位データ更新周期情報(単位：ms) (分解能：100ms)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionDelay")
  public Integer getPositionDelay() {
    return positionDelay;
  }

  public void setPositionDelay(Integer positionDelay) {
    this.positionDelay = positionDelay;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner revisionCounter(Integer revisionCounter) {
    this.revisionCounter = revisionCounter;
    return this;
  }

  /**
   * GPSレシーバからデータ受信したタイミングから同じデータを送信している期間の情報(単位: ms) (分解能：100ms)
   * minimum: 1
   * maximum: 31
   * @return revisionCounter
  */
  @Min(1) @Max(31) 
  @Schema(name = "revisionCounter", example = "3", description = "GPSレシーバからデータ受信したタイミングから同じデータを送信している期間の情報(単位: ms) (分解能：100ms)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revisionCounter")
  public Integer getRevisionCounter() {
    return revisionCounter;
  }

  public void setRevisionCounter(Integer revisionCounter) {
    this.revisionCounter = revisionCounter;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner roadFacilities(Integer roadFacilities) {
    this.roadFacilities = roadFacilities;
    return this;
  }

  /**
   * 走行あるいは停車している場所の道路施設情報
   * minimum: 0
   * maximum: 7
   * @return roadFacilities
  */
  @Min(0) @Max(7) 
  @Schema(name = "roadFacilities", example = "1", description = "走行あるいは停車している場所の道路施設情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadFacilities")
  public Integer getRoadFacilities() {
    return roadFacilities;
  }

  public void setRoadFacilities(Integer roadFacilities) {
    this.roadFacilities = roadFacilities;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner roadClassification(Integer roadClassification) {
    this.roadClassification = roadClassification;
    return this;
  }

  /**
   * 走行している道路の道路区分情報
   * minimum: 0
   * maximum: 7
   * @return roadClassification
  */
  @Min(0) @Max(7) 
  @Schema(name = "roadClassification", example = "1", description = "走行している道路の道路区分情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadClassification")
  public Integer getRoadClassification() {
    return roadClassification;
  }

  public void setRoadClassification(Integer roadClassification) {
    this.roadClassification = roadClassification;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner semiMajorAxisOfPositionalErrorEllipse(Integer semiMajorAxisOfPositionalErrorEllipse) {
    this.semiMajorAxisOfPositionalErrorEllipse = semiMajorAxisOfPositionalErrorEllipse;
    return this;
  }

  /**
   * GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の長半径情報(単位:m) (分解能: 0.5m)
   * minimum: 0
   * maximum: 255
   * @return semiMajorAxisOfPositionalErrorEllipse
  */
  @Min(0) @Max(255) 
  @Schema(name = "semiMajorAxisOfPositionalErrorEllipse", example = "15", description = "GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の長半径情報(単位:m) (分解能: 0.5m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisOfPositionalErrorEllipse")
  public Integer getSemiMajorAxisOfPositionalErrorEllipse() {
    return semiMajorAxisOfPositionalErrorEllipse;
  }

  public void setSemiMajorAxisOfPositionalErrorEllipse(Integer semiMajorAxisOfPositionalErrorEllipse) {
    this.semiMajorAxisOfPositionalErrorEllipse = semiMajorAxisOfPositionalErrorEllipse;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner semiMinorAxisOfPositionalErrorEllipse(Integer semiMinorAxisOfPositionalErrorEllipse) {
    this.semiMinorAxisOfPositionalErrorEllipse = semiMinorAxisOfPositionalErrorEllipse;
    return this;
  }

  /**
   * GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の短半径情報(単位:m) (分解能: 0.5m)
   * minimum: 0
   * maximum: 255
   * @return semiMinorAxisOfPositionalErrorEllipse
  */
  @Min(0) @Max(255) 
  @Schema(name = "semiMinorAxisOfPositionalErrorEllipse", example = "15", description = "GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の短半径情報(単位:m) (分解能: 0.5m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMinorAxisOfPositionalErrorEllipse")
  public Integer getSemiMinorAxisOfPositionalErrorEllipse() {
    return semiMinorAxisOfPositionalErrorEllipse;
  }

  public void setSemiMinorAxisOfPositionalErrorEllipse(Integer semiMinorAxisOfPositionalErrorEllipse) {
    this.semiMinorAxisOfPositionalErrorEllipse = semiMinorAxisOfPositionalErrorEllipse;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner semiMajorAxisOrientationOfPositionalErrorEllipse(Integer semiMajorAxisOrientationOfPositionalErrorEllipse) {
    this.semiMajorAxisOrientationOfPositionalErrorEllipse = semiMajorAxisOrientationOfPositionalErrorEllipse;
    return this;
  }

  /**
   * GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の回転角情報．楕円長軸の角度として、北を0度とし時計回りの角度値をセットする. (分解能: 0.0125度)
   * minimum: 0
   * maximum: 65535
   * @return semiMajorAxisOrientationOfPositionalErrorEllipse
  */
  @Min(0) @Max(65535) 
  @Schema(name = "semiMajorAxisOrientationOfPositionalErrorEllipse", example = "7200", description = "GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の回転角情報．楕円長軸の角度として、北を0度とし時計回りの角度値をセットする. (分解能: 0.0125度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisOrientationOfPositionalErrorEllipse")
  public Integer getSemiMajorAxisOrientationOfPositionalErrorEllipse() {
    return semiMajorAxisOrientationOfPositionalErrorEllipse;
  }

  public void setSemiMajorAxisOrientationOfPositionalErrorEllipse(Integer semiMajorAxisOrientationOfPositionalErrorEllipse) {
    this.semiMajorAxisOrientationOfPositionalErrorEllipse = semiMajorAxisOrientationOfPositionalErrorEllipse;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner gpSPositioningMode(Integer gpSPositioningMode) {
    this.gpSPositioningMode = gpSPositioningMode;
    return this;
  }

  /**
   * GPSにより取得した位置情報が、どのような測位モードで測位されたものかを示す情報
   * minimum: 0
   * maximum: 3
   * @return gpSPositioningMode
  */
  @Min(0) @Max(3) 
  @Schema(name = "GPSPositioningMode", example = "1", description = "GPSにより取得した位置情報が、どのような測位モードで測位されたものかを示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GPSPositioningMode")
  public Integer getGpSPositioningMode() {
    return gpSPositioningMode;
  }

  public void setGpSPositioningMode(Integer gpSPositioningMode) {
    this.gpSPositioningMode = gpSPositioningMode;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner GPSPDOP(Integer GPSPDOP) {
    this.GPSPDOP = GPSPDOP;
    return this;
  }

  /**
   * GPSにより取得した位置情報が、衛星の幾何学的配置によりどれくらい位置精度へ影響を受けた状態で取得したものかを示す情報. (分解能: 0.2)
   * minimum: 0
   * maximum: 63
   * @return GPSPDOP
  */
  @Min(0) @Max(63) 
  @Schema(name = "GPSPDOP", example = "12", description = "GPSにより取得した位置情報が、衛星の幾何学的配置によりどれくらい位置精度へ影響を受けた状態で取得したものかを示す情報. (分解能: 0.2)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GPSPDOP")
  public Integer getGPSPDOP() {
    return GPSPDOP;
  }

  public void setGPSPDOP(Integer GPSPDOP) {
    this.GPSPDOP = GPSPDOP;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner numberOfGPSSatellitesInUse(Integer numberOfGPSSatellitesInUse) {
    this.numberOfGPSSatellitesInUse = numberOfGPSSatellitesInUse;
    return this;
  }

  /**
   * GPSにより取得した位置情報が、いくつのGPS衛星を捕捉した状態で取得したものかを示す情報
   * minimum: 0
   * maximum: 15
   * @return numberOfGPSSatellitesInUse
  */
  @Min(0) @Max(15) 
  @Schema(name = "numberOfGPSSatellitesInUse", example = "6", description = "GPSにより取得した位置情報が、いくつのGPS衛星を捕捉した状態で取得したものかを示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfGPSSatellitesInUse")
  public Integer getNumberOfGPSSatellitesInUse() {
    return numberOfGPSSatellitesInUse;
  }

  public void setNumberOfGPSSatellitesInUse(Integer numberOfGPSSatellitesInUse) {
    this.numberOfGPSSatellitesInUse = numberOfGPSSatellitesInUse;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner gpSMultiPathDetection(Integer gpSMultiPathDetection) {
    this.gpSMultiPathDetection = gpSMultiPathDetection;
    return this;
  }

  /**
   * GPSにより取得した位置情報が、マルチパスの状況（GPS衛星から 発射された電波が周辺の建物等により反射され、それらを受信する状況）下で取得されたものかを示す情報
   * minimum: 0
   * maximum: 3
   * @return gpSMultiPathDetection
  */
  @Min(0) @Max(3) 
  @Schema(name = "GPSMultiPathDetection", example = "2", description = "GPSにより取得した位置情報が、マルチパスの状況（GPS衛星から 発射された電波が周辺の建物等により反射され、それらを受信する状況）下で取得されたものかを示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GPSMultiPathDetection")
  public Integer getGpSMultiPathDetection() {
    return gpSMultiPathDetection;
  }

  public void setGpSMultiPathDetection(Integer gpSMultiPathDetection) {
    this.gpSMultiPathDetection = gpSMultiPathDetection;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner deadReckoningAvailability(Boolean deadReckoningAvailability) {
    this.deadReckoningAvailability = deadReckoningAvailability;
    return this;
  }

  /**
   * 各種センサ等を用いた自律航法機能を搭載しているかを示す情報
   * @return deadReckoningAvailability
  */
  
  @Schema(name = "deadReckoningAvailability", example = "false", description = "各種センサ等を用いた自律航法機能を搭載しているかを示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deadReckoningAvailability")
  public Boolean getDeadReckoningAvailability() {
    return deadReckoningAvailability;
  }

  public void setDeadReckoningAvailability(Boolean deadReckoningAvailability) {
    this.deadReckoningAvailability = deadReckoningAvailability;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner mapMatchingAvailability(Boolean mapMatchingAvailability) {
    this.mapMatchingAvailability = mapMatchingAvailability;
    return this;
  }

  /**
   * 自車両の位置情報に対するマップマッチング機能を搭載しているかを示す情報
   * @return mapMatchingAvailability
  */
  
  @Schema(name = "mapMatchingAvailability", example = "false", description = "自車両の位置情報に対するマップマッチング機能を搭載しているかを示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mapMatchingAvailability")
  public Boolean getMapMatchingAvailability() {
    return mapMatchingAvailability;
  }

  public void setMapMatchingAvailability(Boolean mapMatchingAvailability) {
    this.mapMatchingAvailability = mapMatchingAvailability;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner yawRate(Integer yawRate) {
    this.yawRate = yawRate;
    return this;
  }

  /**
   * 自車両のヨーレート情報．プラスを時計回りとする(単位: 度/s) (分解能: 0.01度/s)
   * minimum: -32768
   * maximum: 32767
   * @return yawRate
  */
  @Min(-32768) @Max(32767) 
  @Schema(name = "yawRate", example = "12345", description = "自車両のヨーレート情報．プラスを時計回りとする(単位: 度/s) (分解能: 0.01度/s)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yawRate")
  public Integer getYawRate() {
    return yawRate;
  }

  public void setYawRate(Integer yawRate) {
    this.yawRate = yawRate;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner brakeAppliedStatus(Integer brakeAppliedStatus) {
    this.brakeAppliedStatus = brakeAppliedStatus;
    return this;
  }

  /**
   * 自車両のブレーキ状態情報．車輪別にブレーキ状態を取得出来ない場合は、[5]の値を0にセットし、ブレーキのOFF/ONに従い[0]～[3]の値は全て同じ値をセットする
   * minimum: 0
   * maximum: 63
   * @return brakeAppliedStatus
  */
  @Min(0) @Max(63) 
  @Schema(name = "brakeAppliedStatus", example = "12", description = "自車両のブレーキ状態情報．車輪別にブレーキ状態を取得出来ない場合は、[5]の値を0にセットし、ブレーキのOFF/ONに従い[0]～[3]の値は全て同じ値をセットする", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brakeAppliedStatus")
  public Integer getBrakeAppliedStatus() {
    return brakeAppliedStatus;
  }

  public void setBrakeAppliedStatus(Integer brakeAppliedStatus) {
    this.brakeAppliedStatus = brakeAppliedStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner auxiliaryBrakeAppliedStatus(Integer auxiliaryBrakeAppliedStatus) {
    this.auxiliaryBrakeAppliedStatus = auxiliaryBrakeAppliedStatus;
    return this;
  }

  /**
   * 自車両の補助ブレーキ状態情報
   * minimum: 0
   * maximum: 3
   * @return auxiliaryBrakeAppliedStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "auxiliaryBrakeAppliedStatus", example = "1", description = "自車両の補助ブレーキ状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auxiliaryBrakeAppliedStatus")
  public Integer getAuxiliaryBrakeAppliedStatus() {
    return auxiliaryBrakeAppliedStatus;
  }

  public void setAuxiliaryBrakeAppliedStatus(Integer auxiliaryBrakeAppliedStatus) {
    this.auxiliaryBrakeAppliedStatus = auxiliaryBrakeAppliedStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner throttlePosition(Integer throttlePosition) {
    this.throttlePosition = throttlePosition;
    return this;
  }

  /**
   * アクセルペダルの操作量をセットする(単位:%). (分解能: 0.5%)
   * minimum: 0
   * maximum: 255
   * @return throttlePosition
  */
  @Min(0) @Max(255) 
  @Schema(name = "throttlePosition", example = "123", description = "アクセルペダルの操作量をセットする(単位:%). (分解能: 0.5%)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("throttlePosition")
  public Integer getThrottlePosition() {
    return throttlePosition;
  }

  public void setThrottlePosition(Integer throttlePosition) {
    this.throttlePosition = throttlePosition;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner exteriorLights(Integer exteriorLights) {
    this.exteriorLights = exteriorLights;
    return this;
  }

  /**
   * 自車両のウィンカー、ハザード、前照灯の状態情報
   * minimum: 0
   * maximum: 255
   * @return exteriorLights
  */
  @Min(0) @Max(255) 
  @Schema(name = "exteriorLights", example = "12", description = "自車両のウィンカー、ハザード、前照灯の状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exteriorLights")
  public Integer getExteriorLights() {
    return exteriorLights;
  }

  public void setExteriorLights(Integer exteriorLights) {
    this.exteriorLights = exteriorLights;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner adaptiveCruiseControlStatus(Integer adaptiveCruiseControlStatus) {
    this.adaptiveCruiseControlStatus = adaptiveCruiseControlStatus;
    return this;
  }

  /**
   * 自車両のACC（Adaptive Cruise Control System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return adaptiveCruiseControlStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "adaptiveCruiseControlStatus", example = "1", description = "自車両のACC（Adaptive Cruise Control System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adaptiveCruiseControlStatus")
  public Integer getAdaptiveCruiseControlStatus() {
    return adaptiveCruiseControlStatus;
  }

  public void setAdaptiveCruiseControlStatus(Integer adaptiveCruiseControlStatus) {
    this.adaptiveCruiseControlStatus = adaptiveCruiseControlStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner cooperativeAdaptiveCruiseControlStatus(Integer cooperativeAdaptiveCruiseControlStatus) {
    this.cooperativeAdaptiveCruiseControlStatus = cooperativeAdaptiveCruiseControlStatus;
    return this;
  }

  /**
   * 自車両のC-ACC（Cooperative Adaptive Cruise Control System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return cooperativeAdaptiveCruiseControlStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "cooperativeAdaptiveCruiseControlStatus", example = "1", description = "自車両のC-ACC（Cooperative Adaptive Cruise Control System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cooperativeAdaptiveCruiseControlStatus")
  public Integer getCooperativeAdaptiveCruiseControlStatus() {
    return cooperativeAdaptiveCruiseControlStatus;
  }

  public void setCooperativeAdaptiveCruiseControlStatus(Integer cooperativeAdaptiveCruiseControlStatus) {
    this.cooperativeAdaptiveCruiseControlStatus = cooperativeAdaptiveCruiseControlStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner preCrashSafetyStatus(Integer preCrashSafetyStatus) {
    this.preCrashSafetyStatus = preCrashSafetyStatus;
    return this;
  }

  /**
   * 自車両の PCS（Pre-Crash Safety System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return preCrashSafetyStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "preCrashSafetyStatus", example = "1", description = "自車両の PCS（Pre-Crash Safety System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preCrashSafetyStatus")
  public Integer getPreCrashSafetyStatus() {
    return preCrashSafetyStatus;
  }

  public void setPreCrashSafetyStatus(Integer preCrashSafetyStatus) {
    this.preCrashSafetyStatus = preCrashSafetyStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner antilockBrakeStatus(Integer antilockBrakeStatus) {
    this.antilockBrakeStatus = antilockBrakeStatus;
    return this;
  }

  /**
   * 自車両のABS（Antilock Brake System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return antilockBrakeStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "antilockBrakeStatus", example = "1", description = "自車両のABS（Antilock Brake System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("antilockBrakeStatus")
  public Integer getAntilockBrakeStatus() {
    return antilockBrakeStatus;
  }

  public void setAntilockBrakeStatus(Integer antilockBrakeStatus) {
    this.antilockBrakeStatus = antilockBrakeStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner tractionControlStatus(Integer tractionControlStatus) {
    this.tractionControlStatus = tractionControlStatus;
    return this;
  }

  /**
   * 自車両のTRC（Traction Control System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return tractionControlStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "tractionControlStatus", example = "1", description = "自車両のTRC（Traction Control System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tractionControlStatus")
  public Integer getTractionControlStatus() {
    return tractionControlStatus;
  }

  public void setTractionControlStatus(Integer tractionControlStatus) {
    this.tractionControlStatus = tractionControlStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner electronicStabilityControlStatus(Integer electronicStabilityControlStatus) {
    this.electronicStabilityControlStatus = electronicStabilityControlStatus;
    return this;
  }

  /**
   * 自車両のESC（Electronic Stability Control System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return electronicStabilityControlStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "electronicStabilityControlStatus", example = "1", description = "自車両のESC（Electronic Stability Control System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("electronicStabilityControlStatus")
  public Integer getElectronicStabilityControlStatus() {
    return electronicStabilityControlStatus;
  }

  public void setElectronicStabilityControlStatus(Integer electronicStabilityControlStatus) {
    this.electronicStabilityControlStatus = electronicStabilityControlStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner laneKeepingAssistStatus(Integer laneKeepingAssistStatus) {
    this.laneKeepingAssistStatus = laneKeepingAssistStatus;
    return this;
  }

  /**
   * 自車両のLKA（Lane Keeping Assist System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return laneKeepingAssistStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "laneKeepingAssistStatus", example = "1", description = "自車両のLKA（Lane Keeping Assist System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("laneKeepingAssistStatus")
  public Integer getLaneKeepingAssistStatus() {
    return laneKeepingAssistStatus;
  }

  public void setLaneKeepingAssistStatus(Integer laneKeepingAssistStatus) {
    this.laneKeepingAssistStatus = laneKeepingAssistStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner laneDepartureWarningStatus(Integer laneDepartureWarningStatus) {
    this.laneDepartureWarningStatus = laneDepartureWarningStatus;
    return this;
  }

  /**
   * 自車両のLDW（Lane Departure Warning System）の作動状態情報
   * minimum: 0
   * maximum: 3
   * @return laneDepartureWarningStatus
  */
  @Min(0) @Max(3) 
  @Schema(name = "laneDepartureWarningStatus", example = "1", description = "自車両のLDW（Lane Departure Warning System）の作動状態情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("laneDepartureWarningStatus")
  public Integer getLaneDepartureWarningStatus() {
    return laneDepartureWarningStatus;
  }

  public void setLaneDepartureWarningStatus(Integer laneDepartureWarningStatus) {
    this.laneDepartureWarningStatus = laneDepartureWarningStatus;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner intersectionDistanceInformationAvailability(Integer intersectionDistanceInformationAvailability) {
    this.intersectionDistanceInformationAvailability = intersectionDistanceInformationAvailability;
    return this;
  }

  /**
   * 前方直近の交差点までの距離情報の取得先情報
   * minimum: 0
   * maximum: 7
   * @return intersectionDistanceInformationAvailability
  */
  @Min(0) @Max(7) 
  @Schema(name = "intersectionDistanceInformationAvailability", example = "1", description = "前方直近の交差点までの距離情報の取得先情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intersectionDistanceInformationAvailability")
  public Integer getIntersectionDistanceInformationAvailability() {
    return intersectionDistanceInformationAvailability;
  }

  public void setIntersectionDistanceInformationAvailability(Integer intersectionDistanceInformationAvailability) {
    this.intersectionDistanceInformationAvailability = intersectionDistanceInformationAvailability;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner intersectionDistance(Integer intersectionDistance) {
    this.intersectionDistance = intersectionDistance;
    return this;
  }

  /**
   * 前方直近の交差点までの道のり距離情報(単位：m)
   * minimum: 0
   * maximum: 1023
   * @return intersectionDistance
  */
  @Min(0) @Max(1023) 
  @Schema(name = "intersectionDistance", example = "100", description = "前方直近の交差点までの道のり距離情報(単位：m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intersectionDistance")
  public Integer getIntersectionDistance() {
    return intersectionDistance;
  }

  public void setIntersectionDistance(Integer intersectionDistance) {
    this.intersectionDistance = intersectionDistance;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner intersectionPositionInformationAvailability(Integer intersectionPositionInformationAvailability) {
    this.intersectionPositionInformationAvailability = intersectionPositionInformationAvailability;
    return this;
  }

  /**
   * 前方直近の交差点の位置情報の取得先情報
   * minimum: 0
   * maximum: 7
   * @return intersectionPositionInformationAvailability
  */
  @Min(0) @Max(7) 
  @Schema(name = "intersectionPositionInformationAvailability", example = "1", description = "前方直近の交差点の位置情報の取得先情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intersectionPositionInformationAvailability")
  public Integer getIntersectionPositionInformationAvailability() {
    return intersectionPositionInformationAvailability;
  }

  public void setIntersectionPositionInformationAvailability(Integer intersectionPositionInformationAvailability) {
    this.intersectionPositionInformationAvailability = intersectionPositionInformationAvailability;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner intersectionLatitude(Integer intersectionLatitude) {
    this.intersectionLatitude = intersectionLatitude;
    return this;
  }

  /**
   * 前方直近の交差点の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現 (分解能: 0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return intersectionLatitude
  */
  @Min(-2147483648) @Max(900000000) 
  @Schema(name = "intersectionLatitude", example = "123456789", description = "前方直近の交差点の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現 (分解能: 0.0000001度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intersectionLatitude")
  public Integer getIntersectionLatitude() {
    return intersectionLatitude;
  }

  public void setIntersectionLatitude(Integer intersectionLatitude) {
    this.intersectionLatitude = intersectionLatitude;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner intersectionLongitude(Integer intersectionLongitude) {
    this.intersectionLongitude = intersectionLongitude;
    return this;
  }

  /**
   * 前方直近の交差点の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現 (分解能: 0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return intersectionLongitude
  */
  @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "intersectionLongitude", example = "1234567891", description = "前方直近の交差点の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現 (分解能: 0.0000001度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intersectionLongitude")
  public Integer getIntersectionLongitude() {
    return intersectionLongitude;
  }

  public void setIntersectionLongitude(Integer intersectionLongitude) {
    this.intersectionLongitude = intersectionLongitude;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner extendedInformation(Integer extendedInformation) {
    this.extendedInformation = extendedInformation;
    return this;
  }

  /**
   * DE_車両用途種別によって，RC-013に定義されているDEを参照
   * minimum: 0
   * maximum: 255
   * @return extendedInformation
  */
  @Min(0) @Max(255) 
  @Schema(name = "extendedInformation", example = "1", description = "DE_車両用途種別によって，RC-013に定義されているDEを参照", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendedInformation")
  public Integer getExtendedInformation() {
    return extendedInformation;
  }

  public void setExtendedInformation(Integer extendedInformation) {
    this.extendedInformation = extendedInformation;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner targetIndividualExtendedData(String targetIndividualExtendedData) {
    this.targetIndividualExtendedData = targetIndividualExtendedData;
    return this;
  }

  /**
   * 個別拡張情報は利用ユーザによってデータ内容が異なるためbyte文字列をそのまま格納し利用する
   * @return targetIndividualExtendedData
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "targetIndividualExtendedData", example = "0a1b2c34d5e", description = "個別拡張情報は利用ユーザによってデータ内容が異なるためbyte文字列をそのまま格納し利用する", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetIndividualExtendedData")
  public String getTargetIndividualExtendedData() {
    return targetIndividualExtendedData;
  }

  public void setTargetIndividualExtendedData(String targetIndividualExtendedData) {
    this.targetIndividualExtendedData = targetIndividualExtendedData;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner restingState(Integer restingState) {
    this.restingState = restingState;
    return this;
  }

  /**
   * 物標が停止してからの経過時間(単位:秒)
   * minimum: 0
   * maximum: 3602
   * @return restingState
  */
  @Min(0) @Max(3602) 
  @Schema(name = "restingState", example = "12", description = "物標が停止してからの経過時間(単位:秒)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restingState")
  public Integer getRestingState() {
    return restingState;
  }

  public void setRestingState(Integer restingState) {
    this.restingState = restingState;
  }

  public DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner existingTime(Integer existingTime) {
    this.existingTime = existingTime;
    return this;
  }

  /**
   * 物標が検知されている時間(単位:秒)．(分解能: 0.1秒)
   * minimum: 0
   * maximum: 36001
   * @return existingTime
  */
  @Min(0) @Max(36001) 
  @Schema(name = "existingTime", example = "120", description = "物標が検知されている時間(単位:秒)．(分解能: 0.1秒)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("existingTime")
  public Integer getExistingTime() {
    return existingTime;
  }

  public void setExistingTime(Integer existingTime) {
    this.existingTime = existingTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner = (DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner) o;
    return Objects.equals(this.commonServiceStandardID, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.commonServiceStandardID) &&
        Objects.equals(this.targetMessageID, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.targetMessageID) &&
        Objects.equals(this.targetIndividualVersionInfo, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.targetIndividualVersionInfo) &&
        Objects.equals(this.targetID, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.targetID) &&
        Objects.equals(this.targetIndividualIncrementCounter, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.targetIndividualIncrementCounter) &&
        Objects.equals(this.dataLength, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.dataLength) &&
        Objects.equals(this.individualOptionFlag, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.individualOptionFlag) &&
        Objects.equals(this.leapSecondCorrectionInfo, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.leapSecondCorrectionInfo) &&
        Objects.equals(this.time, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.time) &&
        Objects.equals(this.latitude, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.latitude) &&
        Objects.equals(this.longitude, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.longitude) &&
        Objects.equals(this.elevation, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.elevation) &&
        Objects.equals(this.positionConf, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.positionConf) &&
        Objects.equals(this.elevationConf, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.elevationConf) &&
        Objects.equals(this.speed, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.speed) &&
        Objects.equals(this.heading, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.heading) &&
        Objects.equals(this.acceleration, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.acceleration) &&
        Objects.equals(this.speedConf, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.speedConf) &&
        Objects.equals(this.headingConf, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.headingConf) &&
        Objects.equals(this.forwardRearAccelerationConf, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.forwardRearAccelerationConf) &&
        Objects.equals(this.transmissionState, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.transmissionState) &&
        Objects.equals(this.steeringWheelAngle, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.steeringWheelAngle) &&
        Objects.equals(this.sizeClassification, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.sizeClassification) &&
        Objects.equals(this.roleClassification, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.roleClassification) &&
        Objects.equals(this.vehicleWidth, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.vehicleWidth) &&
        Objects.equals(this.vehicleLength, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.vehicleLength) &&
        Objects.equals(this.positionDelay, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.positionDelay) &&
        Objects.equals(this.revisionCounter, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.revisionCounter) &&
        Objects.equals(this.roadFacilities, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.roadFacilities) &&
        Objects.equals(this.roadClassification, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.roadClassification) &&
        Objects.equals(this.semiMajorAxisOfPositionalErrorEllipse, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.semiMajorAxisOfPositionalErrorEllipse) &&
        Objects.equals(this.semiMinorAxisOfPositionalErrorEllipse, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.semiMinorAxisOfPositionalErrorEllipse) &&
        Objects.equals(this.semiMajorAxisOrientationOfPositionalErrorEllipse, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.semiMajorAxisOrientationOfPositionalErrorEllipse) &&
        Objects.equals(this.gpSPositioningMode, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.gpSPositioningMode) &&
        Objects.equals(this.GPSPDOP, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.GPSPDOP) &&
        Objects.equals(this.numberOfGPSSatellitesInUse, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.numberOfGPSSatellitesInUse) &&
        Objects.equals(this.gpSMultiPathDetection, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.gpSMultiPathDetection) &&
        Objects.equals(this.deadReckoningAvailability, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.deadReckoningAvailability) &&
        Objects.equals(this.mapMatchingAvailability, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.mapMatchingAvailability) &&
        Objects.equals(this.yawRate, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.yawRate) &&
        Objects.equals(this.brakeAppliedStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.brakeAppliedStatus) &&
        Objects.equals(this.auxiliaryBrakeAppliedStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.auxiliaryBrakeAppliedStatus) &&
        Objects.equals(this.throttlePosition, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.throttlePosition) &&
        Objects.equals(this.exteriorLights, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.exteriorLights) &&
        Objects.equals(this.adaptiveCruiseControlStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.adaptiveCruiseControlStatus) &&
        Objects.equals(this.cooperativeAdaptiveCruiseControlStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.cooperativeAdaptiveCruiseControlStatus) &&
        Objects.equals(this.preCrashSafetyStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.preCrashSafetyStatus) &&
        Objects.equals(this.antilockBrakeStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.antilockBrakeStatus) &&
        Objects.equals(this.tractionControlStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.tractionControlStatus) &&
        Objects.equals(this.electronicStabilityControlStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.electronicStabilityControlStatus) &&
        Objects.equals(this.laneKeepingAssistStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.laneKeepingAssistStatus) &&
        Objects.equals(this.laneDepartureWarningStatus, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.laneDepartureWarningStatus) &&
        Objects.equals(this.intersectionDistanceInformationAvailability, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.intersectionDistanceInformationAvailability) &&
        Objects.equals(this.intersectionDistance, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.intersectionDistance) &&
        Objects.equals(this.intersectionPositionInformationAvailability, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.intersectionPositionInformationAvailability) &&
        Objects.equals(this.intersectionLatitude, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.intersectionLatitude) &&
        Objects.equals(this.intersectionLongitude, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.intersectionLongitude) &&
        Objects.equals(this.extendedInformation, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.extendedInformation) &&
        Objects.equals(this.targetIndividualExtendedData, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.targetIndividualExtendedData) &&
        Objects.equals(this.restingState, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.restingState) &&
        Objects.equals(this.existingTime, dataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner.existingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonServiceStandardID, targetMessageID, targetIndividualVersionInfo, targetID, targetIndividualIncrementCounter, dataLength, individualOptionFlag, leapSecondCorrectionInfo, time, latitude, longitude, elevation, positionConf, elevationConf, speed, heading, acceleration, speedConf, headingConf, forwardRearAccelerationConf, transmissionState, steeringWheelAngle, sizeClassification, roleClassification, vehicleWidth, vehicleLength, positionDelay, revisionCounter, roadFacilities, roadClassification, semiMajorAxisOfPositionalErrorEllipse, semiMinorAxisOfPositionalErrorEllipse, semiMajorAxisOrientationOfPositionalErrorEllipse, gpSPositioningMode, GPSPDOP, numberOfGPSSatellitesInUse, gpSMultiPathDetection, deadReckoningAvailability, mapMatchingAvailability, yawRate, brakeAppliedStatus, auxiliaryBrakeAppliedStatus, throttlePosition, exteriorLights, adaptiveCruiseControlStatus, cooperativeAdaptiveCruiseControlStatus, preCrashSafetyStatus, antilockBrakeStatus, tractionControlStatus, electronicStabilityControlStatus, laneKeepingAssistStatus, laneDepartureWarningStatus, intersectionDistanceInformationAvailability, intersectionDistance, intersectionPositionInformationAvailability, intersectionLatitude, intersectionLongitude, extendedInformation, targetIndividualExtendedData, restingState, existingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTargetInfoAttributeDeviceIndividualInfoInnerTargetIndividualInfoInner {\n");
    sb.append("    commonServiceStandardID: ").append(toIndentedString(commonServiceStandardID)).append("\n");
    sb.append("    targetMessageID: ").append(toIndentedString(targetMessageID)).append("\n");
    sb.append("    targetIndividualVersionInfo: ").append(toIndentedString(targetIndividualVersionInfo)).append("\n");
    sb.append("    targetID: ").append(toIndentedString(targetID)).append("\n");
    sb.append("    targetIndividualIncrementCounter: ").append(toIndentedString(targetIndividualIncrementCounter)).append("\n");
    sb.append("    dataLength: ").append(toIndentedString(dataLength)).append("\n");
    sb.append("    individualOptionFlag: ").append(toIndentedString(individualOptionFlag)).append("\n");
    sb.append("    leapSecondCorrectionInfo: ").append(toIndentedString(leapSecondCorrectionInfo)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    positionConf: ").append(toIndentedString(positionConf)).append("\n");
    sb.append("    elevationConf: ").append(toIndentedString(elevationConf)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    acceleration: ").append(toIndentedString(acceleration)).append("\n");
    sb.append("    speedConf: ").append(toIndentedString(speedConf)).append("\n");
    sb.append("    headingConf: ").append(toIndentedString(headingConf)).append("\n");
    sb.append("    forwardRearAccelerationConf: ").append(toIndentedString(forwardRearAccelerationConf)).append("\n");
    sb.append("    transmissionState: ").append(toIndentedString(transmissionState)).append("\n");
    sb.append("    steeringWheelAngle: ").append(toIndentedString(steeringWheelAngle)).append("\n");
    sb.append("    sizeClassification: ").append(toIndentedString(sizeClassification)).append("\n");
    sb.append("    roleClassification: ").append(toIndentedString(roleClassification)).append("\n");
    sb.append("    vehicleWidth: ").append(toIndentedString(vehicleWidth)).append("\n");
    sb.append("    vehicleLength: ").append(toIndentedString(vehicleLength)).append("\n");
    sb.append("    positionDelay: ").append(toIndentedString(positionDelay)).append("\n");
    sb.append("    revisionCounter: ").append(toIndentedString(revisionCounter)).append("\n");
    sb.append("    roadFacilities: ").append(toIndentedString(roadFacilities)).append("\n");
    sb.append("    roadClassification: ").append(toIndentedString(roadClassification)).append("\n");
    sb.append("    semiMajorAxisOfPositionalErrorEllipse: ").append(toIndentedString(semiMajorAxisOfPositionalErrorEllipse)).append("\n");
    sb.append("    semiMinorAxisOfPositionalErrorEllipse: ").append(toIndentedString(semiMinorAxisOfPositionalErrorEllipse)).append("\n");
    sb.append("    semiMajorAxisOrientationOfPositionalErrorEllipse: ").append(toIndentedString(semiMajorAxisOrientationOfPositionalErrorEllipse)).append("\n");
    sb.append("    gpSPositioningMode: ").append(toIndentedString(gpSPositioningMode)).append("\n");
    sb.append("    GPSPDOP: ").append(toIndentedString(GPSPDOP)).append("\n");
    sb.append("    numberOfGPSSatellitesInUse: ").append(toIndentedString(numberOfGPSSatellitesInUse)).append("\n");
    sb.append("    gpSMultiPathDetection: ").append(toIndentedString(gpSMultiPathDetection)).append("\n");
    sb.append("    deadReckoningAvailability: ").append(toIndentedString(deadReckoningAvailability)).append("\n");
    sb.append("    mapMatchingAvailability: ").append(toIndentedString(mapMatchingAvailability)).append("\n");
    sb.append("    yawRate: ").append(toIndentedString(yawRate)).append("\n");
    sb.append("    brakeAppliedStatus: ").append(toIndentedString(brakeAppliedStatus)).append("\n");
    sb.append("    auxiliaryBrakeAppliedStatus: ").append(toIndentedString(auxiliaryBrakeAppliedStatus)).append("\n");
    sb.append("    throttlePosition: ").append(toIndentedString(throttlePosition)).append("\n");
    sb.append("    exteriorLights: ").append(toIndentedString(exteriorLights)).append("\n");
    sb.append("    adaptiveCruiseControlStatus: ").append(toIndentedString(adaptiveCruiseControlStatus)).append("\n");
    sb.append("    cooperativeAdaptiveCruiseControlStatus: ").append(toIndentedString(cooperativeAdaptiveCruiseControlStatus)).append("\n");
    sb.append("    preCrashSafetyStatus: ").append(toIndentedString(preCrashSafetyStatus)).append("\n");
    sb.append("    antilockBrakeStatus: ").append(toIndentedString(antilockBrakeStatus)).append("\n");
    sb.append("    tractionControlStatus: ").append(toIndentedString(tractionControlStatus)).append("\n");
    sb.append("    electronicStabilityControlStatus: ").append(toIndentedString(electronicStabilityControlStatus)).append("\n");
    sb.append("    laneKeepingAssistStatus: ").append(toIndentedString(laneKeepingAssistStatus)).append("\n");
    sb.append("    laneDepartureWarningStatus: ").append(toIndentedString(laneDepartureWarningStatus)).append("\n");
    sb.append("    intersectionDistanceInformationAvailability: ").append(toIndentedString(intersectionDistanceInformationAvailability)).append("\n");
    sb.append("    intersectionDistance: ").append(toIndentedString(intersectionDistance)).append("\n");
    sb.append("    intersectionPositionInformationAvailability: ").append(toIndentedString(intersectionPositionInformationAvailability)).append("\n");
    sb.append("    intersectionLatitude: ").append(toIndentedString(intersectionLatitude)).append("\n");
    sb.append("    intersectionLongitude: ").append(toIndentedString(intersectionLongitude)).append("\n");
    sb.append("    extendedInformation: ").append(toIndentedString(extendedInformation)).append("\n");
    sb.append("    targetIndividualExtendedData: ").append(toIndentedString(targetIndividualExtendedData)).append("\n");
    sb.append("    restingState: ").append(toIndentedString(restingState)).append("\n");
    sb.append("    existingTime: ").append(toIndentedString(existingTime)).append("\n");
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

