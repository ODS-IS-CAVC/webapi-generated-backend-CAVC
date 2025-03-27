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
import net.ouranos.domain.digiline.model.DataModelSensorInfoAttributeSensorAttributeInfoInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * センサ情報要素
 */

@Schema(name = "dataModel_sensorInfo_attribute", description = "センサ情報要素")
@JsonTypeName("dataModel_sensorInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSensorInfoAttribute {

  private Long serviceLocationID;

  private Long roadsideUnitID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  private Integer sensorNum;

  @Valid
  private List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInner> sensorAttributeInfo = new ArrayList<>();

  public DataModelSensorInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelSensorInfoAttribute(Long serviceLocationID, Long roadsideUnitID, OffsetDateTime updateTimeInfo, Integer formatVersion, Integer sensorNum, List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInner> sensorAttributeInfo) {
    this.serviceLocationID = serviceLocationID;
    this.roadsideUnitID = roadsideUnitID;
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.sensorNum = sensorNum;
    this.sensorAttributeInfo = sensorAttributeInfo;
  }

  public DataModelSensorInfoAttribute serviceLocationID(Long serviceLocationID) {
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

  public DataModelSensorInfoAttribute roadsideUnitID(Long roadsideUnitID) {
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

  public DataModelSensorInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
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

  public DataModelSensorInfoAttribute formatVersion(Integer formatVersion) {
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

  public DataModelSensorInfoAttribute sensorNum(Integer sensorNum) {
    this.sensorNum = sensorNum;
    return this;
  }

  /**
   * 設置センサ数
   * minimum: 0
   * maximum: 16
   * @return sensorNum
  */
  @NotNull @Min(0) @Max(16) 
  @Schema(name = "sensorNum", example = "6", description = "設置センサ数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sensorNum")
  public Integer getSensorNum() {
    return sensorNum;
  }

  public void setSensorNum(Integer sensorNum) {
    this.sensorNum = sensorNum;
  }

  public DataModelSensorInfoAttribute sensorAttributeInfo(List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInner> sensorAttributeInfo) {
    this.sensorAttributeInfo = sensorAttributeInfo;
    return this;
  }

  public DataModelSensorInfoAttribute addSensorAttributeInfoItem(DataModelSensorInfoAttributeSensorAttributeInfoInner sensorAttributeInfoItem) {
    if (this.sensorAttributeInfo == null) {
      this.sensorAttributeInfo = new ArrayList<>();
    }
    this.sensorAttributeInfo.add(sensorAttributeInfoItem);
    return this;
  }

  /**
   * Get sensorAttributeInfo
   * @return sensorAttributeInfo
  */
  @NotNull @Valid @Size(min = 0, max = 127) 
  @Schema(name = "sensorAttributeInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sensorAttributeInfo")
  public List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInner> getSensorAttributeInfo() {
    return sensorAttributeInfo;
  }

  public void setSensorAttributeInfo(List<@Valid DataModelSensorInfoAttributeSensorAttributeInfoInner> sensorAttributeInfo) {
    this.sensorAttributeInfo = sensorAttributeInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSensorInfoAttribute dataModelSensorInfoAttribute = (DataModelSensorInfoAttribute) o;
    return Objects.equals(this.serviceLocationID, dataModelSensorInfoAttribute.serviceLocationID) &&
        Objects.equals(this.roadsideUnitID, dataModelSensorInfoAttribute.roadsideUnitID) &&
        Objects.equals(this.updateTimeInfo, dataModelSensorInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelSensorInfoAttribute.formatVersion) &&
        Objects.equals(this.sensorNum, dataModelSensorInfoAttribute.sensorNum) &&
        Objects.equals(this.sensorAttributeInfo, dataModelSensorInfoAttribute.sensorAttributeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocationID, roadsideUnitID, updateTimeInfo, formatVersion, sensorNum, sensorAttributeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSensorInfoAttribute {\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    sensorNum: ").append(toIndentedString(sensorNum)).append("\n");
    sb.append("    sensorAttributeInfo: ").append(toIndentedString(sensorAttributeInfo)).append("\n");
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

