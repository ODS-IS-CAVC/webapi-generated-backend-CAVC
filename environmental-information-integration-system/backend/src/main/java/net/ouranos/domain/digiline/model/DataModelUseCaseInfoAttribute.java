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
import net.ouranos.domain.digiline.model.DataModelUseCaseInfoAttributeUseCaseInfoInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ユースケース情報要素
 */

@Schema(name = "dataModel_useCaseInfo_attribute", description = "ユースケース情報要素")
@JsonTypeName("dataModel_useCaseInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelUseCaseInfoAttribute {

  private Long serviceLocationID;

  private Long roadsideUnitID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  @Valid
  private List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInner> useCaseInfo = new ArrayList<>();

  public DataModelUseCaseInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelUseCaseInfoAttribute(Long serviceLocationID, Long roadsideUnitID, OffsetDateTime updateTimeInfo, Integer formatVersion, List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInner> useCaseInfo) {
    this.serviceLocationID = serviceLocationID;
    this.roadsideUnitID = roadsideUnitID;
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.useCaseInfo = useCaseInfo;
  }

  public DataModelUseCaseInfoAttribute serviceLocationID(Long serviceLocationID) {
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

  public DataModelUseCaseInfoAttribute roadsideUnitID(Long roadsideUnitID) {
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

  public DataModelUseCaseInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
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

  public DataModelUseCaseInfoAttribute formatVersion(Integer formatVersion) {
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

  public DataModelUseCaseInfoAttribute useCaseInfo(List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInner> useCaseInfo) {
    this.useCaseInfo = useCaseInfo;
    return this;
  }

  public DataModelUseCaseInfoAttribute addUseCaseInfoItem(DataModelUseCaseInfoAttributeUseCaseInfoInner useCaseInfoItem) {
    if (this.useCaseInfo == null) {
      this.useCaseInfo = new ArrayList<>();
    }
    this.useCaseInfo.add(useCaseInfoItem);
    return this;
  }

  /**
   * Get useCaseInfo
   * @return useCaseInfo
  */
  @NotNull @Valid @Size(min = 0, max = 255) 
  @Schema(name = "useCaseInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("useCaseInfo")
  public List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInner> getUseCaseInfo() {
    return useCaseInfo;
  }

  public void setUseCaseInfo(List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInner> useCaseInfo) {
    this.useCaseInfo = useCaseInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelUseCaseInfoAttribute dataModelUseCaseInfoAttribute = (DataModelUseCaseInfoAttribute) o;
    return Objects.equals(this.serviceLocationID, dataModelUseCaseInfoAttribute.serviceLocationID) &&
        Objects.equals(this.roadsideUnitID, dataModelUseCaseInfoAttribute.roadsideUnitID) &&
        Objects.equals(this.updateTimeInfo, dataModelUseCaseInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelUseCaseInfoAttribute.formatVersion) &&
        Objects.equals(this.useCaseInfo, dataModelUseCaseInfoAttribute.useCaseInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocationID, roadsideUnitID, updateTimeInfo, formatVersion, useCaseInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelUseCaseInfoAttribute {\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    useCaseInfo: ").append(toIndentedString(useCaseInfo)).append("\n");
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

