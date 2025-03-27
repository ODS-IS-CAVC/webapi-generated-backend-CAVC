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
import net.ouranos.domain.digiline.model.DataModelTargetInfoAttributeDeviceIndividualInfoInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 物標情報要素
 */

@Schema(name = "dataModel_targetInfo_attribute", description = "物標情報要素")
@JsonTypeName("dataModel_targetInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelTargetInfoAttribute {

  private Long serviceLocationID;

  private Long roadsideUnitID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  private Integer deviceNum;

  @Valid
  private List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInner> deviceIndividualInfo = new ArrayList<>();

  public DataModelTargetInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelTargetInfoAttribute(Long serviceLocationID, Long roadsideUnitID, OffsetDateTime updateTimeInfo, Integer formatVersion, Integer deviceNum, List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInner> deviceIndividualInfo) {
    this.serviceLocationID = serviceLocationID;
    this.roadsideUnitID = roadsideUnitID;
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.deviceNum = deviceNum;
    this.deviceIndividualInfo = deviceIndividualInfo;
  }

  public DataModelTargetInfoAttribute serviceLocationID(Long serviceLocationID) {
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

  public DataModelTargetInfoAttribute roadsideUnitID(Long roadsideUnitID) {
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

  public DataModelTargetInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
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

  public DataModelTargetInfoAttribute formatVersion(Integer formatVersion) {
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

  public DataModelTargetInfoAttribute deviceNum(Integer deviceNum) {
    this.deviceNum = deviceNum;
    return this;
  }

  /**
   * 接続数
   * minimum: 0
   * maximum: 16
   * @return deviceNum
  */
  @NotNull @Min(0) @Max(16) 
  @Schema(name = "deviceNum", example = "2", description = "接続数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceNum")
  public Integer getDeviceNum() {
    return deviceNum;
  }

  public void setDeviceNum(Integer deviceNum) {
    this.deviceNum = deviceNum;
  }

  public DataModelTargetInfoAttribute deviceIndividualInfo(List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInner> deviceIndividualInfo) {
    this.deviceIndividualInfo = deviceIndividualInfo;
    return this;
  }

  public DataModelTargetInfoAttribute addDeviceIndividualInfoItem(DataModelTargetInfoAttributeDeviceIndividualInfoInner deviceIndividualInfoItem) {
    if (this.deviceIndividualInfo == null) {
      this.deviceIndividualInfo = new ArrayList<>();
    }
    this.deviceIndividualInfo.add(deviceIndividualInfoItem);
    return this;
  }

  /**
   * Get deviceIndividualInfo
   * @return deviceIndividualInfo
  */
  @NotNull @Valid @Size(min = 0, max = 16) 
  @Schema(name = "deviceIndividualInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceIndividualInfo")
  public List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInner> getDeviceIndividualInfo() {
    return deviceIndividualInfo;
  }

  public void setDeviceIndividualInfo(List<@Valid DataModelTargetInfoAttributeDeviceIndividualInfoInner> deviceIndividualInfo) {
    this.deviceIndividualInfo = deviceIndividualInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTargetInfoAttribute dataModelTargetInfoAttribute = (DataModelTargetInfoAttribute) o;
    return Objects.equals(this.serviceLocationID, dataModelTargetInfoAttribute.serviceLocationID) &&
        Objects.equals(this.roadsideUnitID, dataModelTargetInfoAttribute.roadsideUnitID) &&
        Objects.equals(this.updateTimeInfo, dataModelTargetInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelTargetInfoAttribute.formatVersion) &&
        Objects.equals(this.deviceNum, dataModelTargetInfoAttribute.deviceNum) &&
        Objects.equals(this.deviceIndividualInfo, dataModelTargetInfoAttribute.deviceIndividualInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocationID, roadsideUnitID, updateTimeInfo, formatVersion, deviceNum, deviceIndividualInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTargetInfoAttribute {\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    deviceNum: ").append(toIndentedString(deviceNum)).append("\n");
    sb.append("    deviceIndividualInfo: ").append(toIndentedString(deviceIndividualInfo)).append("\n");
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

