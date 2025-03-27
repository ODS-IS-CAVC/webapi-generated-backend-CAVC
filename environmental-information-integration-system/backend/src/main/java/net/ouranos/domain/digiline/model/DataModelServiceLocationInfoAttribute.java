package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelServiceLocationInfoAttributeApproachAttributeInfoInner;
import net.ouranos.domain.digiline.model.DataModelServiceLocationInfoAttributeRoadsideUnitListInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * サービス地点情報要素
 */

@Schema(name = "dataModel_serviceLocationInfo_attribute", description = "サービス地点情報要素")
@JsonTypeName("dataModel_serviceLocationInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelServiceLocationInfoAttribute {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  private Long serviceLocationID;

  private Integer latitude;

  private Integer longitude;

  private Integer elevation;

  private Integer approachAttributeSize;

  @Valid
  private List<@Valid DataModelServiceLocationInfoAttributeApproachAttributeInfoInner> approachAttributeInfo = new ArrayList<>();

  @Valid
  private List<@Valid DataModelServiceLocationInfoAttributeRoadsideUnitListInner> roadsideUnitList = new ArrayList<>();

  public DataModelServiceLocationInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelServiceLocationInfoAttribute(OffsetDateTime updateTimeInfo, Integer formatVersion, Long serviceLocationID, Integer latitude, Integer longitude, Integer elevation, Integer approachAttributeSize, List<@Valid DataModelServiceLocationInfoAttributeApproachAttributeInfoInner> approachAttributeInfo, List<@Valid DataModelServiceLocationInfoAttributeRoadsideUnitListInner> roadsideUnitList) {
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.serviceLocationID = serviceLocationID;
    this.latitude = latitude;
    this.longitude = longitude;
    this.elevation = elevation;
    this.approachAttributeSize = approachAttributeSize;
    this.approachAttributeInfo = approachAttributeInfo;
    this.roadsideUnitList = roadsideUnitList;
  }

  public DataModelServiceLocationInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
    this.updateTimeInfo = updateTimeInfo;
    return this;
  }

  /**
   * 最新更新時刻(UTC)
   * @return updateTimeInfo
  */
  @NotNull @Valid 
  @Schema(name = "updateTimeInfo", example = "2024-01-23T01:23:45.678Z", description = "最新更新時刻(UTC)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updateTimeInfo")
  public OffsetDateTime getUpdateTimeInfo() {
    return updateTimeInfo;
  }

  public void setUpdateTimeInfo(OffsetDateTime updateTimeInfo) {
    this.updateTimeInfo = updateTimeInfo;
  }

  public DataModelServiceLocationInfoAttribute formatVersion(Integer formatVersion) {
    this.formatVersion = formatVersion;
    return this;
  }

  /**
   * フォーマットバージョン
   * minimum: 0
   * maximum: 65535
   * @return formatVersion
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "formatVersion", example = "1", description = "フォーマットバージョン", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formatVersion")
  public Integer getFormatVersion() {
    return formatVersion;
  }

  public void setFormatVersion(Integer formatVersion) {
    this.formatVersion = formatVersion;
  }

  public DataModelServiceLocationInfoAttribute serviceLocationID(Long serviceLocationID) {
    this.serviceLocationID = serviceLocationID;
    return this;
  }

  /**
   * サービス地点ID
   * minimum: 0
   * maximum: 4294967295
   * @return serviceLocationID
  */
  @NotNull @Min(0L) @Max(4294967295L) 
  @Schema(name = "serviceLocationID", example = "12345678", description = "サービス地点ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceLocationID")
  public Long getServiceLocationID() {
    return serviceLocationID;
  }

  public void setServiceLocationID(Long serviceLocationID) {
    this.serviceLocationID = serviceLocationID;
  }

  public DataModelServiceLocationInfoAttribute latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * サービス地点の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return latitude
  */
  @NotNull @Min(-2147483648) @Max(900000000) 
  @Schema(name = "latitude", example = "123456789", description = "サービス地点の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public DataModelServiceLocationInfoAttribute longitude(Integer longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * サービス地点の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return longitude
  */
  @NotNull @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "longitude", example = "1234567891", description = "サービス地点の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public DataModelServiceLocationInfoAttribute elevation(Integer elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * サービス地点の基準面からの高さ情報(単位:m) (分解能:0.1m)
   * minimum: -4095
   * maximum: 61440
   * @return elevation
  */
  @NotNull @Min(-4095) @Max(61440) 
  @Schema(name = "elevation", example = "123", description = "サービス地点の基準面からの高さ情報(単位:m) (分解能:0.1m)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elevation")
  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

  public DataModelServiceLocationInfoAttribute approachAttributeSize(Integer approachAttributeSize) {
    this.approachAttributeSize = approachAttributeSize;
    return this;
  }

  /**
   * 交差点に接続されている道路数
   * minimum: 0
   * maximum: 15
   * @return approachAttributeSize
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "approachAttributeSize", example = "4", description = "交差点に接続されている道路数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approachAttributeSize")
  public Integer getApproachAttributeSize() {
    return approachAttributeSize;
  }

  public void setApproachAttributeSize(Integer approachAttributeSize) {
    this.approachAttributeSize = approachAttributeSize;
  }

  public DataModelServiceLocationInfoAttribute approachAttributeInfo(List<@Valid DataModelServiceLocationInfoAttributeApproachAttributeInfoInner> approachAttributeInfo) {
    this.approachAttributeInfo = approachAttributeInfo;
    return this;
  }

  public DataModelServiceLocationInfoAttribute addApproachAttributeInfoItem(DataModelServiceLocationInfoAttributeApproachAttributeInfoInner approachAttributeInfoItem) {
    if (this.approachAttributeInfo == null) {
      this.approachAttributeInfo = new ArrayList<>();
    }
    this.approachAttributeInfo.add(approachAttributeInfoItem);
    return this;
  }

  /**
   * Get approachAttributeInfo
   * @return approachAttributeInfo
  */
  @NotNull @Valid @Size(min = 0, max = 15) 
  @Schema(name = "approachAttributeInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approachAttributeInfo")
  public List<@Valid DataModelServiceLocationInfoAttributeApproachAttributeInfoInner> getApproachAttributeInfo() {
    return approachAttributeInfo;
  }

  public void setApproachAttributeInfo(List<@Valid DataModelServiceLocationInfoAttributeApproachAttributeInfoInner> approachAttributeInfo) {
    this.approachAttributeInfo = approachAttributeInfo;
  }

  public DataModelServiceLocationInfoAttribute roadsideUnitList(List<@Valid DataModelServiceLocationInfoAttributeRoadsideUnitListInner> roadsideUnitList) {
    this.roadsideUnitList = roadsideUnitList;
    return this;
  }

  public DataModelServiceLocationInfoAttribute addRoadsideUnitListItem(DataModelServiceLocationInfoAttributeRoadsideUnitListInner roadsideUnitListItem) {
    if (this.roadsideUnitList == null) {
      this.roadsideUnitList = new ArrayList<>();
    }
    this.roadsideUnitList.add(roadsideUnitListItem);
    return this;
  }

  /**
   * Get roadsideUnitList
   * @return roadsideUnitList
  */
  @NotNull @Valid @Size(min = 0, max = 15) 
  @Schema(name = "roadsideUnitList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadsideUnitList")
  public List<@Valid DataModelServiceLocationInfoAttributeRoadsideUnitListInner> getRoadsideUnitList() {
    return roadsideUnitList;
  }

  public void setRoadsideUnitList(List<@Valid DataModelServiceLocationInfoAttributeRoadsideUnitListInner> roadsideUnitList) {
    this.roadsideUnitList = roadsideUnitList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelServiceLocationInfoAttribute dataModelServiceLocationInfoAttribute = (DataModelServiceLocationInfoAttribute) o;
    return Objects.equals(this.updateTimeInfo, dataModelServiceLocationInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelServiceLocationInfoAttribute.formatVersion) &&
        Objects.equals(this.serviceLocationID, dataModelServiceLocationInfoAttribute.serviceLocationID) &&
        Objects.equals(this.latitude, dataModelServiceLocationInfoAttribute.latitude) &&
        Objects.equals(this.longitude, dataModelServiceLocationInfoAttribute.longitude) &&
        Objects.equals(this.elevation, dataModelServiceLocationInfoAttribute.elevation) &&
        Objects.equals(this.approachAttributeSize, dataModelServiceLocationInfoAttribute.approachAttributeSize) &&
        Objects.equals(this.approachAttributeInfo, dataModelServiceLocationInfoAttribute.approachAttributeInfo) &&
        Objects.equals(this.roadsideUnitList, dataModelServiceLocationInfoAttribute.roadsideUnitList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateTimeInfo, formatVersion, serviceLocationID, latitude, longitude, elevation, approachAttributeSize, approachAttributeInfo, roadsideUnitList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelServiceLocationInfoAttribute {\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    approachAttributeSize: ").append(toIndentedString(approachAttributeSize)).append("\n");
    sb.append("    approachAttributeInfo: ").append(toIndentedString(approachAttributeInfo)).append("\n");
    sb.append("    roadsideUnitList: ").append(toIndentedString(roadsideUnitList)).append("\n");
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

