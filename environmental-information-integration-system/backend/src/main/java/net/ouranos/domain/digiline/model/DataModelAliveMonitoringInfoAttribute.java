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
import net.ouranos.domain.digiline.model.DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 路側機死活情報要素
 */

@Schema(name = "dataModel_aliveMonitoringInfo_attribute", description = "路側機死活情報要素")
@JsonTypeName("dataModel_aliveMonitoringInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelAliveMonitoringInfoAttribute {

  private Long serviceLocationID;

  private Long roadsideUnitID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  private Integer operationClassificationCode;

  private Integer serviceAvailability;

  private Integer deviceClassificationNum;

  @Valid
  private List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner> deviceClassificationAliveInfo = new ArrayList<>();

  public DataModelAliveMonitoringInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelAliveMonitoringInfoAttribute(Long serviceLocationID, Long roadsideUnitID, OffsetDateTime updateTimeInfo, Integer formatVersion, Integer operationClassificationCode, Integer serviceAvailability, Integer deviceClassificationNum, List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner> deviceClassificationAliveInfo) {
    this.serviceLocationID = serviceLocationID;
    this.roadsideUnitID = roadsideUnitID;
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.operationClassificationCode = operationClassificationCode;
    this.serviceAvailability = serviceAvailability;
    this.deviceClassificationNum = deviceClassificationNum;
    this.deviceClassificationAliveInfo = deviceClassificationAliveInfo;
  }

  public DataModelAliveMonitoringInfoAttribute serviceLocationID(Long serviceLocationID) {
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

  public DataModelAliveMonitoringInfoAttribute roadsideUnitID(Long roadsideUnitID) {
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

  public DataModelAliveMonitoringInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
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

  public DataModelAliveMonitoringInfoAttribute formatVersion(Integer formatVersion) {
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

  public DataModelAliveMonitoringInfoAttribute operationClassificationCode(Integer operationClassificationCode) {
    this.operationClassificationCode = operationClassificationCode;
    return this;
  }

  /**
   * 路側機運用区分コード
   * minimum: 0
   * maximum: 1
   * @return operationClassificationCode
  */
  @NotNull @Min(0) @Max(1) 
  @Schema(name = "operationClassificationCode", example = "0", description = "路側機運用区分コード", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operationClassificationCode")
  public Integer getOperationClassificationCode() {
    return operationClassificationCode;
  }

  public void setOperationClassificationCode(Integer operationClassificationCode) {
    this.operationClassificationCode = operationClassificationCode;
  }

  public DataModelAliveMonitoringInfoAttribute serviceAvailability(Integer serviceAvailability) {
    this.serviceAvailability = serviceAvailability;
    return this;
  }

  /**
   * サービス提供可否
   * minimum: 0
   * maximum: 2
   * @return serviceAvailability
  */
  @NotNull @Min(0) @Max(2) 
  @Schema(name = "serviceAvailability", example = "0", description = "サービス提供可否", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceAvailability")
  public Integer getServiceAvailability() {
    return serviceAvailability;
  }

  public void setServiceAvailability(Integer serviceAvailability) {
    this.serviceAvailability = serviceAvailability;
  }

  public DataModelAliveMonitoringInfoAttribute deviceClassificationNum(Integer deviceClassificationNum) {
    this.deviceClassificationNum = deviceClassificationNum;
    return this;
  }

  /**
   * 路側機接続機器種別数
   * minimum: 0
   * maximum: 15
   * @return deviceClassificationNum
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "deviceClassificationNum", example = "3", description = "路側機接続機器種別数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceClassificationNum")
  public Integer getDeviceClassificationNum() {
    return deviceClassificationNum;
  }

  public void setDeviceClassificationNum(Integer deviceClassificationNum) {
    this.deviceClassificationNum = deviceClassificationNum;
  }

  public DataModelAliveMonitoringInfoAttribute deviceClassificationAliveInfo(List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner> deviceClassificationAliveInfo) {
    this.deviceClassificationAliveInfo = deviceClassificationAliveInfo;
    return this;
  }

  public DataModelAliveMonitoringInfoAttribute addDeviceClassificationAliveInfoItem(DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner deviceClassificationAliveInfoItem) {
    if (this.deviceClassificationAliveInfo == null) {
      this.deviceClassificationAliveInfo = new ArrayList<>();
    }
    this.deviceClassificationAliveInfo.add(deviceClassificationAliveInfoItem);
    return this;
  }

  /**
   * Get deviceClassificationAliveInfo
   * @return deviceClassificationAliveInfo
  */
  @NotNull @Valid @Size(min = 0, max = 15) 
  @Schema(name = "deviceClassificationAliveInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviceClassificationAliveInfo")
  public List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner> getDeviceClassificationAliveInfo() {
    return deviceClassificationAliveInfo;
  }

  public void setDeviceClassificationAliveInfo(List<@Valid DataModelAliveMonitoringInfoAttributeDeviceClassificationAliveInfoInner> deviceClassificationAliveInfo) {
    this.deviceClassificationAliveInfo = deviceClassificationAliveInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelAliveMonitoringInfoAttribute dataModelAliveMonitoringInfoAttribute = (DataModelAliveMonitoringInfoAttribute) o;
    return Objects.equals(this.serviceLocationID, dataModelAliveMonitoringInfoAttribute.serviceLocationID) &&
        Objects.equals(this.roadsideUnitID, dataModelAliveMonitoringInfoAttribute.roadsideUnitID) &&
        Objects.equals(this.updateTimeInfo, dataModelAliveMonitoringInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelAliveMonitoringInfoAttribute.formatVersion) &&
        Objects.equals(this.operationClassificationCode, dataModelAliveMonitoringInfoAttribute.operationClassificationCode) &&
        Objects.equals(this.serviceAvailability, dataModelAliveMonitoringInfoAttribute.serviceAvailability) &&
        Objects.equals(this.deviceClassificationNum, dataModelAliveMonitoringInfoAttribute.deviceClassificationNum) &&
        Objects.equals(this.deviceClassificationAliveInfo, dataModelAliveMonitoringInfoAttribute.deviceClassificationAliveInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocationID, roadsideUnitID, updateTimeInfo, formatVersion, operationClassificationCode, serviceAvailability, deviceClassificationNum, deviceClassificationAliveInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelAliveMonitoringInfoAttribute {\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    operationClassificationCode: ").append(toIndentedString(operationClassificationCode)).append("\n");
    sb.append("    serviceAvailability: ").append(toIndentedString(serviceAvailability)).append("\n");
    sb.append("    deviceClassificationNum: ").append(toIndentedString(deviceClassificationNum)).append("\n");
    sb.append("    deviceClassificationAliveInfo: ").append(toIndentedString(deviceClassificationAliveInfo)).append("\n");
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

