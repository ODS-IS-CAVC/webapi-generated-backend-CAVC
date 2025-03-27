package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 信号情報要素
 */

@Schema(name = "dataModel_signalInfo_attribute", description = "信号情報要素")
@JsonTypeName("dataModel_signalInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSignalInfoAttribute {

  private Long serviceLocationID;

  private Long roadsideUnitID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  private Integer prefectureID;

  private Integer roadType;

  private Integer intersectionID;

  public DataModelSignalInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelSignalInfoAttribute(Long serviceLocationID, Long roadsideUnitID, OffsetDateTime updateTimeInfo, Integer formatVersion, Integer prefectureID, Integer roadType, Integer intersectionID) {
    this.serviceLocationID = serviceLocationID;
    this.roadsideUnitID = roadsideUnitID;
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.prefectureID = prefectureID;
    this.roadType = roadType;
    this.intersectionID = intersectionID;
  }

  public DataModelSignalInfoAttribute serviceLocationID(Long serviceLocationID) {
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

  public DataModelSignalInfoAttribute roadsideUnitID(Long roadsideUnitID) {
    this.roadsideUnitID = roadsideUnitID;
    return this;
  }

  /**
   * 路側機ID
   * minimum: 0
   * maximum: 4294967295
   * @return roadsideUnitID
  */
  @NotNull @Min(0L) @Max(4294967295L) 
  @Schema(name = "roadsideUnitID", example = "12345678", description = "路側機ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadsideUnitID")
  public Long getRoadsideUnitID() {
    return roadsideUnitID;
  }

  public void setRoadsideUnitID(Long roadsideUnitID) {
    this.roadsideUnitID = roadsideUnitID;
  }

  public DataModelSignalInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
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

  public DataModelSignalInfoAttribute formatVersion(Integer formatVersion) {
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

  public DataModelSignalInfoAttribute prefectureID(Integer prefectureID) {
    this.prefectureID = prefectureID;
    return this;
  }

  /**
   * 都道府県コード(JIS)
   * minimum: 1
   * maximum: 47
   * @return prefectureID
  */
  @NotNull @Min(1) @Max(47) 
  @Schema(name = "prefectureID", example = "1", description = "都道府県コード(JIS)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prefectureID")
  public Integer getPrefectureID() {
    return prefectureID;
  }

  public void setPrefectureID(Integer prefectureID) {
    this.prefectureID = prefectureID;
  }

  public DataModelSignalInfoAttribute roadType(Integer roadType) {
    this.roadType = roadType;
    return this;
  }

  /**
   * 提供点の種別
   * minimum: 0
   * maximum: 1
   * @return roadType
  */
  @NotNull @Min(0) @Max(1) 
  @Schema(name = "roadType", example = "0", description = "提供点の種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadType")
  public Integer getRoadType() {
    return roadType;
  }

  public void setRoadType(Integer roadType) {
    this.roadType = roadType;
  }

  public DataModelSignalInfoAttribute intersectionID(Integer intersectionID) {
    this.intersectionID = intersectionID;
    return this;
  }

  /**
   * 交差点を識別するID
   * minimum: 1
   * maximum: 32767
   * @return intersectionID
  */
  @NotNull @Min(1) @Max(32767) 
  @Schema(name = "intersectionID", example = "12345", description = "交差点を識別するID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("intersectionID")
  public Integer getIntersectionID() {
    return intersectionID;
  }

  public void setIntersectionID(Integer intersectionID) {
    this.intersectionID = intersectionID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSignalInfoAttribute dataModelSignalInfoAttribute = (DataModelSignalInfoAttribute) o;
    return Objects.equals(this.serviceLocationID, dataModelSignalInfoAttribute.serviceLocationID) &&
        Objects.equals(this.roadsideUnitID, dataModelSignalInfoAttribute.roadsideUnitID) &&
        Objects.equals(this.updateTimeInfo, dataModelSignalInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelSignalInfoAttribute.formatVersion) &&
        Objects.equals(this.prefectureID, dataModelSignalInfoAttribute.prefectureID) &&
        Objects.equals(this.roadType, dataModelSignalInfoAttribute.roadType) &&
        Objects.equals(this.intersectionID, dataModelSignalInfoAttribute.intersectionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocationID, roadsideUnitID, updateTimeInfo, formatVersion, prefectureID, roadType, intersectionID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSignalInfoAttribute {\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    prefectureID: ").append(toIndentedString(prefectureID)).append("\n");
    sb.append("    roadType: ").append(toIndentedString(roadType)).append("\n");
    sb.append("    intersectionID: ").append(toIndentedString(intersectionID)).append("\n");
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

