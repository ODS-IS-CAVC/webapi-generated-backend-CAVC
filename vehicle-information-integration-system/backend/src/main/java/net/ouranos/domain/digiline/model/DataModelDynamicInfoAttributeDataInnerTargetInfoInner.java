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
 * DataModelDynamicInfoAttributeDataInnerTargetInfoInner
 */

@JsonTypeName("dataModel_dynamicInfo_attribute_data_inner_targetInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelDynamicInfoAttributeDataInnerTargetInfoInner {

  private Long targetID;

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

  private Integer sizeClassification;

  private Integer roleClassification;

  private Integer vehicleWidth;

  private Integer vehicleLength;

  private Integer semiMajorAxisOfPositionalErrorEllipse;

  private Integer semiMinorAxisOfPositionalErrorEllipse;

  private Integer semiMajorAxisOrientationOfPositionalErrorEllipse;

  private Integer gpSPositioningMode;

  private Integer GPSPDOP;

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner targetID(Long targetID) {
    this.targetID = targetID;
    return this;
  }

  /**
   * 前回送信時と同一物標かどうかを識別できるように路側機が付与するID情報
   * minimum: 0
   * maximum: 4294967295
   * @return targetID
  */
  @Min(0L) @Max(4294967295L) 
  @Schema(name = "targetID", example = "1234567890", description = "前回送信時と同一物標かどうかを識別できるように路側機が付与するID情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetID")
  public Long getTargetID() {
    return targetID;
  }

  public void setTargetID(Long targetID) {
    this.targetID = targetID;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 物標情報が生成された時刻[ミリ秒まで](JST) 例)YYYY/MM/DD hh:mm:ss.sss
   * @return time
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") @Size(min = 23, max = 23) 
  @Schema(name = "time", example = "2024/01/23 13:23:45.678", description = "物標情報が生成された時刻[ミリ秒まで](JST) 例)YYYY/MM/DD hh:mm:ss.sss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * 物標の緯度情報．北緯をプラス, 南緯をマイナスで表現(分解能：0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return latitude
  */
  @Min(-2147483648) @Max(900000000) 
  @Schema(name = "latitude", example = "123456789", description = "物標の緯度情報．北緯をプラス, 南緯をマイナスで表現(分解能：0.0000001度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner longitude(Integer longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * 物標の経度情報．東経をプラス, 西経をマイナスで表現(分解能：0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return longitude
  */
  @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "longitude", example = "1234567891", description = "物標の経度情報．東経をプラス, 西経をマイナスで表現(分解能：0.0000001度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner elevation(Integer elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * 物標の基準面からの高さ情報(分解能：0.1m)
   * minimum: -4095
   * maximum: 61440
   * @return elevation
  */
  @Min(-4095) @Max(61440) 
  @Schema(name = "elevation", example = "123", description = "物標の基準面からの高さ情報(分解能：0.1m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elevation")
  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner positionConf(Integer positionConf) {
    this.positionConf = positionConf;
    return this;
  }

  /**
   * 緯度・経度の信頼度を示す情報
   * minimum: 0
   * maximum: 15
   * @return positionConf
  */
  @Min(0) @Max(15) 
  @Schema(name = "positionConf", example = "1", description = "緯度・経度の信頼度を示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionConf")
  public Integer getPositionConf() {
    return positionConf;
  }

  public void setPositionConf(Integer positionConf) {
    this.positionConf = positionConf;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner elevationConf(Integer elevationConf) {
    this.elevationConf = elevationConf;
    return this;
  }

  /**
   * 高度の信頼度を示す情報
   * minimum: 0
   * maximum: 15
   * @return elevationConf
  */
  @Min(0) @Max(15) 
  @Schema(name = "elevationConf", example = "2", description = "高度の信頼度を示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elevationConf")
  public Integer getElevationConf() {
    return elevationConf;
  }

  public void setElevationConf(Integer elevationConf) {
    this.elevationConf = elevationConf;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  /**
   * 物標の速度(単位：m/s),(分解能：0.01m/s)
   * minimum: 0
   * maximum: 65535
   * @return speed
  */
  @Min(0) @Max(65535) 
  @Schema(name = "speed", example = "1234", description = "物標の速度(単位：m/s),(分解能：0.01m/s)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * 物標の進行方位角情報．北を0度とし，時計回りの角度値をセットする．(分解能：0.0125度)
   * minimum: 0
   * maximum: 65535
   * @return heading
  */
  @Min(0) @Max(65535) 
  @Schema(name = "heading", example = "14400", description = "物標の進行方位角情報．北を0度とし，時計回りの角度値をセットする．(分解能：0.0125度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heading")
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner acceleration(Integer acceleration) {
    this.acceleration = acceleration;
    return this;
  }

  /**
   * 物標の前後方向の加速度(単位：m/s^2)．(分解能：0.01m/s^2)
   * minimum: -2000
   * maximum: 2000
   * @return acceleration
  */
  @Min(-2000) @Max(2000) 
  @Schema(name = "acceleration", example = "123", description = "物標の前後方向の加速度(単位：m/s^2)．(分解能：0.01m/s^2)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceleration")
  public Integer getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(Integer acceleration) {
    this.acceleration = acceleration;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner speedConf(Integer speedConf) {
    this.speedConf = speedConf;
    return this;
  }

  /**
   * 物標の速度の信頼度を示す情報
   * minimum: 0
   * maximum: 7
   * @return speedConf
  */
  @Min(0) @Max(7) 
  @Schema(name = "speedConf", example = "1", description = "物標の速度の信頼度を示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("speedConf")
  public Integer getSpeedConf() {
    return speedConf;
  }

  public void setSpeedConf(Integer speedConf) {
    this.speedConf = speedConf;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner headingConf(Integer headingConf) {
    this.headingConf = headingConf;
    return this;
  }

  /**
   * 物標の方位角の信頼度を示す情報
   * minimum: 0
   * maximum: 7
   * @return headingConf
  */
  @Min(0) @Max(7) 
  @Schema(name = "headingConf", example = "1", description = "物標の方位角の信頼度を示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headingConf")
  public Integer getHeadingConf() {
    return headingConf;
  }

  public void setHeadingConf(Integer headingConf) {
    this.headingConf = headingConf;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner forwardRearAccelerationConf(Integer forwardRearAccelerationConf) {
    this.forwardRearAccelerationConf = forwardRearAccelerationConf;
    return this;
  }

  /**
   * 物標の前後方向加速度の信頼度を示す情報
   * minimum: 0
   * maximum: 7
   * @return forwardRearAccelerationConf
  */
  @Min(0) @Max(7) 
  @Schema(name = "forwardRearAccelerationConf", example = "1", description = "物標の前後方向加速度の信頼度を示す情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forwardRearAccelerationConf")
  public Integer getForwardRearAccelerationConf() {
    return forwardRearAccelerationConf;
  }

  public void setForwardRearAccelerationConf(Integer forwardRearAccelerationConf) {
    this.forwardRearAccelerationConf = forwardRearAccelerationConf;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner sizeClassification(Integer sizeClassification) {
    this.sizeClassification = sizeClassification;
    return this;
  }

  /**
   * 物標の種別
   * minimum: 0
   * maximum: 15
   * @return sizeClassification
  */
  @Min(0) @Max(15) 
  @Schema(name = "sizeClassification", example = "2", description = "物標の種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sizeClassification")
  public Integer getSizeClassification() {
    return sizeClassification;
  }

  public void setSizeClassification(Integer sizeClassification) {
    this.sizeClassification = sizeClassification;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner roleClassification(Integer roleClassification) {
    this.roleClassification = roleClassification;
    return this;
  }

  /**
   * 物標が車両の場合の用途種別．車両以外の場合15(その他)とする
   * minimum: 0
   * maximum: 15
   * @return roleClassification
  */
  @Min(0) @Max(15) 
  @Schema(name = "roleClassification", example = "1", description = "物標が車両の場合の用途種別．車両以外の場合15(その他)とする", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleClassification")
  public Integer getRoleClassification() {
    return roleClassification;
  }

  public void setRoleClassification(Integer roleClassification) {
    this.roleClassification = roleClassification;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner vehicleWidth(Integer vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
    return this;
  }

  /**
   * 自車両の全幅情報(単位：m). (分解能：0.01m)
   * minimum: 1
   * maximum: 1023
   * @return vehicleWidth
  */
  @Min(1) @Max(1023) 
  @Schema(name = "vehicleWidth", example = "140", description = "自車両の全幅情報(単位：m). (分解能：0.01m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleWidth")
  public Integer getVehicleWidth() {
    return vehicleWidth;
  }

  public void setVehicleWidth(Integer vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner vehicleLength(Integer vehicleLength) {
    this.vehicleLength = vehicleLength;
    return this;
  }

  /**
   * 自車両の全長情報(単位：m)．(分解能：0.01m)
   * minimum: 1
   * maximum: 16383
   * @return vehicleLength
  */
  @Min(1) @Max(16383) 
  @Schema(name = "vehicleLength", example = "180", description = "自車両の全長情報(単位：m)．(分解能：0.01m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleLength")
  public Integer getVehicleLength() {
    return vehicleLength;
  }

  public void setVehicleLength(Integer vehicleLength) {
    this.vehicleLength = vehicleLength;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner semiMajorAxisOfPositionalErrorEllipse(Integer semiMajorAxisOfPositionalErrorEllipse) {
    this.semiMajorAxisOfPositionalErrorEllipse = semiMajorAxisOfPositionalErrorEllipse;
    return this;
  }

  /**
   * GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の長半径情報(単位:m) (分解能：0.5m)
   * minimum: 0
   * maximum: 255
   * @return semiMajorAxisOfPositionalErrorEllipse
  */
  @Min(0) @Max(255) 
  @Schema(name = "semiMajorAxisOfPositionalErrorEllipse", example = "15", description = "GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の長半径情報(単位:m) (分解能：0.5m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisOfPositionalErrorEllipse")
  public Integer getSemiMajorAxisOfPositionalErrorEllipse() {
    return semiMajorAxisOfPositionalErrorEllipse;
  }

  public void setSemiMajorAxisOfPositionalErrorEllipse(Integer semiMajorAxisOfPositionalErrorEllipse) {
    this.semiMajorAxisOfPositionalErrorEllipse = semiMajorAxisOfPositionalErrorEllipse;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner semiMinorAxisOfPositionalErrorEllipse(Integer semiMinorAxisOfPositionalErrorEllipse) {
    this.semiMinorAxisOfPositionalErrorEllipse = semiMinorAxisOfPositionalErrorEllipse;
    return this;
  }

  /**
   * GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の短半径情報(単位:m) (分解能：0.5m)
   * minimum: 0
   * maximum: 255
   * @return semiMinorAxisOfPositionalErrorEllipse
  */
  @Min(0) @Max(255) 
  @Schema(name = "semiMinorAxisOfPositionalErrorEllipse", example = "15", description = "GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の短半径情報(単位:m) (分解能：0.5m)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMinorAxisOfPositionalErrorEllipse")
  public Integer getSemiMinorAxisOfPositionalErrorEllipse() {
    return semiMinorAxisOfPositionalErrorEllipse;
  }

  public void setSemiMinorAxisOfPositionalErrorEllipse(Integer semiMinorAxisOfPositionalErrorEllipse) {
    this.semiMinorAxisOfPositionalErrorEllipse = semiMinorAxisOfPositionalErrorEllipse;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner semiMajorAxisOrientationOfPositionalErrorEllipse(Integer semiMajorAxisOrientationOfPositionalErrorEllipse) {
    this.semiMajorAxisOrientationOfPositionalErrorEllipse = semiMajorAxisOrientationOfPositionalErrorEllipse;
    return this;
  }

  /**
   * GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の回転角情報．楕円長軸の角度として、北を0度とし時計回りの角度値をセットする. (分解能：0.0125度)
   * minimum: 0
   * maximum: 65535
   * @return semiMajorAxisOrientationOfPositionalErrorEllipse
  */
  @Min(0) @Max(65535) 
  @Schema(name = "semiMajorAxisOrientationOfPositionalErrorEllipse", example = "7200", description = "GPSにより取得した位置情報の信頼度指標である水平方向の誤差楕円（2σ）の回転角情報．楕円長軸の角度として、北を0度とし時計回りの角度値をセットする. (分解能：0.0125度)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisOrientationOfPositionalErrorEllipse")
  public Integer getSemiMajorAxisOrientationOfPositionalErrorEllipse() {
    return semiMajorAxisOrientationOfPositionalErrorEllipse;
  }

  public void setSemiMajorAxisOrientationOfPositionalErrorEllipse(Integer semiMajorAxisOrientationOfPositionalErrorEllipse) {
    this.semiMajorAxisOrientationOfPositionalErrorEllipse = semiMajorAxisOrientationOfPositionalErrorEllipse;
  }

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner gpSPositioningMode(Integer gpSPositioningMode) {
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

  public DataModelDynamicInfoAttributeDataInnerTargetInfoInner GPSPDOP(Integer GPSPDOP) {
    this.GPSPDOP = GPSPDOP;
    return this;
  }

  /**
   * GPSにより取得した位置情報が、衛星の幾何学的配置によりどれくらい位置精度へ影響を受けた状態で取得したものかを示す情報. (分解能：0.2)
   * minimum: 0
   * maximum: 63
   * @return GPSPDOP
  */
  @Min(0) @Max(63) 
  @Schema(name = "GPSPDOP", example = "12", description = "GPSにより取得した位置情報が、衛星の幾何学的配置によりどれくらい位置精度へ影響を受けた状態で取得したものかを示す情報. (分解能：0.2)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GPSPDOP")
  public Integer getGPSPDOP() {
    return GPSPDOP;
  }

  public void setGPSPDOP(Integer GPSPDOP) {
    this.GPSPDOP = GPSPDOP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttributeDataInnerTargetInfoInner dataModelDynamicInfoAttributeDataInnerTargetInfoInner = (DataModelDynamicInfoAttributeDataInnerTargetInfoInner) o;
    return Objects.equals(this.targetID, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.targetID) &&
        Objects.equals(this.time, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.time) &&
        Objects.equals(this.latitude, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.latitude) &&
        Objects.equals(this.longitude, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.longitude) &&
        Objects.equals(this.elevation, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.elevation) &&
        Objects.equals(this.positionConf, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.positionConf) &&
        Objects.equals(this.elevationConf, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.elevationConf) &&
        Objects.equals(this.speed, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.speed) &&
        Objects.equals(this.heading, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.heading) &&
        Objects.equals(this.acceleration, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.acceleration) &&
        Objects.equals(this.speedConf, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.speedConf) &&
        Objects.equals(this.headingConf, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.headingConf) &&
        Objects.equals(this.forwardRearAccelerationConf, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.forwardRearAccelerationConf) &&
        Objects.equals(this.sizeClassification, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.sizeClassification) &&
        Objects.equals(this.roleClassification, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.roleClassification) &&
        Objects.equals(this.vehicleWidth, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.vehicleWidth) &&
        Objects.equals(this.vehicleLength, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.vehicleLength) &&
        Objects.equals(this.semiMajorAxisOfPositionalErrorEllipse, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.semiMajorAxisOfPositionalErrorEllipse) &&
        Objects.equals(this.semiMinorAxisOfPositionalErrorEllipse, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.semiMinorAxisOfPositionalErrorEllipse) &&
        Objects.equals(this.semiMajorAxisOrientationOfPositionalErrorEllipse, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.semiMajorAxisOrientationOfPositionalErrorEllipse) &&
        Objects.equals(this.gpSPositioningMode, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.gpSPositioningMode) &&
        Objects.equals(this.GPSPDOP, dataModelDynamicInfoAttributeDataInnerTargetInfoInner.GPSPDOP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetID, time, latitude, longitude, elevation, positionConf, elevationConf, speed, heading, acceleration, speedConf, headingConf, forwardRearAccelerationConf, sizeClassification, roleClassification, vehicleWidth, vehicleLength, semiMajorAxisOfPositionalErrorEllipse, semiMinorAxisOfPositionalErrorEllipse, semiMajorAxisOrientationOfPositionalErrorEllipse, gpSPositioningMode, GPSPDOP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttributeDataInnerTargetInfoInner {\n");
    sb.append("    targetID: ").append(toIndentedString(targetID)).append("\n");
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
    sb.append("    sizeClassification: ").append(toIndentedString(sizeClassification)).append("\n");
    sb.append("    roleClassification: ").append(toIndentedString(roleClassification)).append("\n");
    sb.append("    vehicleWidth: ").append(toIndentedString(vehicleWidth)).append("\n");
    sb.append("    vehicleLength: ").append(toIndentedString(vehicleLength)).append("\n");
    sb.append("    semiMajorAxisOfPositionalErrorEllipse: ").append(toIndentedString(semiMajorAxisOfPositionalErrorEllipse)).append("\n");
    sb.append("    semiMinorAxisOfPositionalErrorEllipse: ").append(toIndentedString(semiMinorAxisOfPositionalErrorEllipse)).append("\n");
    sb.append("    semiMajorAxisOrientationOfPositionalErrorEllipse: ").append(toIndentedString(semiMajorAxisOrientationOfPositionalErrorEllipse)).append("\n");
    sb.append("    gpSPositioningMode: ").append(toIndentedString(gpSPositioningMode)).append("\n");
    sb.append("    GPSPDOP: ").append(toIndentedString(GPSPDOP)).append("\n");
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

