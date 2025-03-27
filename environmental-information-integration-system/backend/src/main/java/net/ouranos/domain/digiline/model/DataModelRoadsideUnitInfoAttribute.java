package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
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
 * 路側機情報要素
 */

@Schema(name = "dataModel_roadsideUnitInfo_attribute", description = "路側機情報要素")
@JsonTypeName("dataModel_roadsideUnitInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-22T11:15:15.123061200+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelRoadsideUnitInfoAttribute {

  private Long serviceLocationID;

  private Long roadsideUnitID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateTimeInfo;

  private Integer formatVersion;

  private String roadsideUnitName;

  private String productNumber;

  private String manufacturer;

  private String customer;

  private String licensingInfo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate initialRegistrationDate;

  private Integer powerConsumption;

  private Integer grossWeight;

  private Integer materialType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfInstallation;

  private Integer latitude;

  private Integer longitude;

  private String roadsideUnitManager;

  private String installationSiteManager;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate lastInspectionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate nextInspectionDate;

  public DataModelRoadsideUnitInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelRoadsideUnitInfoAttribute(Long serviceLocationID, Long roadsideUnitID, OffsetDateTime updateTimeInfo, Integer formatVersion, String roadsideUnitName, String productNumber, String licensingInfo, LocalDate initialRegistrationDate, Integer powerConsumption, Integer grossWeight, Integer materialType, LocalDate dateOfInstallation, Integer latitude, Integer longitude, String roadsideUnitManager, String installationSiteManager, LocalDate lastInspectionDate, LocalDate nextInspectionDate) {
    this.serviceLocationID = serviceLocationID;
    this.roadsideUnitID = roadsideUnitID;
    this.updateTimeInfo = updateTimeInfo;
    this.formatVersion = formatVersion;
    this.roadsideUnitName = roadsideUnitName;
    this.productNumber = productNumber;
    this.licensingInfo = licensingInfo;
    this.initialRegistrationDate = initialRegistrationDate;
    this.powerConsumption = powerConsumption;
    this.grossWeight = grossWeight;
    this.materialType = materialType;
    this.dateOfInstallation = dateOfInstallation;
    this.latitude = latitude;
    this.longitude = longitude;
    this.roadsideUnitManager = roadsideUnitManager;
    this.installationSiteManager = installationSiteManager;
    this.lastInspectionDate = lastInspectionDate;
    this.nextInspectionDate = nextInspectionDate;
  }

  public DataModelRoadsideUnitInfoAttribute serviceLocationID(Long serviceLocationID) {
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

  public DataModelRoadsideUnitInfoAttribute roadsideUnitID(Long roadsideUnitID) {
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

  public DataModelRoadsideUnitInfoAttribute updateTimeInfo(OffsetDateTime updateTimeInfo) {
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

  public DataModelRoadsideUnitInfoAttribute formatVersion(Integer formatVersion) {
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

  public DataModelRoadsideUnitInfoAttribute roadsideUnitName(String roadsideUnitName) {
    this.roadsideUnitName = roadsideUnitName;
    return this;
  }

  /**
   * 路側機名称
   * @return roadsideUnitName
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "roadsideUnitName", example = "路側機01", description = "路側機名称", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadsideUnitName")
  public String getRoadsideUnitName() {
    return roadsideUnitName;
  }

  public void setRoadsideUnitName(String roadsideUnitName) {
    this.roadsideUnitName = roadsideUnitName;
  }

  public DataModelRoadsideUnitInfoAttribute productNumber(String productNumber) {
    this.productNumber = productNumber;
    return this;
  }

  /**
   * 路側機型番
   * @return productNumber
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "productNumber", example = "RSU-01", description = "路側機型番", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productNumber")
  public String getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }

  public DataModelRoadsideUnitInfoAttribute manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * 路側機製造者
   * @return manufacturer
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "manufacturer", example = "SMICIP", description = "路側機製造者", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public DataModelRoadsideUnitInfoAttribute customer(String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * 路側機発注者
   * @return customer
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "customer", example = "SMICIP", description = "路側機発注者", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public DataModelRoadsideUnitInfoAttribute licensingInfo(String licensingInfo) {
    this.licensingInfo = licensingInfo;
    return this;
  }

  /**
   * 認可関連情報
   * @return licensingInfo
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "licensingInfo", example = "011", description = "認可関連情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("licensingInfo")
  public String getLicensingInfo() {
    return licensingInfo;
  }

  public void setLicensingInfo(String licensingInfo) {
    this.licensingInfo = licensingInfo;
  }

  public DataModelRoadsideUnitInfoAttribute initialRegistrationDate(LocalDate initialRegistrationDate) {
    this.initialRegistrationDate = initialRegistrationDate;
    return this;
  }

  /**
   * 路側機初期登録日
   * @return initialRegistrationDate
  */
  @NotNull @Valid 
  @Schema(name = "initialRegistrationDate", example = "Tue Jan 23 09:00:00 JST 2024", description = "路側機初期登録日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("initialRegistrationDate")
  public LocalDate getInitialRegistrationDate() {
    return initialRegistrationDate;
  }

  public void setInitialRegistrationDate(LocalDate initialRegistrationDate) {
    this.initialRegistrationDate = initialRegistrationDate;
  }

  public DataModelRoadsideUnitInfoAttribute powerConsumption(Integer powerConsumption) {
    this.powerConsumption = powerConsumption;
    return this;
  }

  /**
   * 路側機全体の年間消費電力量(kWh)
   * minimum: 0
   * maximum: 65535
   * @return powerConsumption
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "powerConsumption", example = "123", description = "路側機全体の年間消費電力量(kWh)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("powerConsumption")
  public Integer getPowerConsumption() {
    return powerConsumption;
  }

  public void setPowerConsumption(Integer powerConsumption) {
    this.powerConsumption = powerConsumption;
  }

  public DataModelRoadsideUnitInfoAttribute grossWeight(Integer grossWeight) {
    this.grossWeight = grossWeight;
    return this;
  }

  /**
   * 路側機総重量(kg)
   * minimum: 0
   * maximum: 65535
   * @return grossWeight
  */
  @NotNull @Min(0) @Max(65535) 
  @Schema(name = "grossWeight", example = "1234", description = "路側機総重量(kg)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grossWeight")
  public Integer getGrossWeight() {
    return grossWeight;
  }

  public void setGrossWeight(Integer grossWeight) {
    this.grossWeight = grossWeight;
  }

  public DataModelRoadsideUnitInfoAttribute materialType(Integer materialType) {
    this.materialType = materialType;
    return this;
  }

  /**
   * 路側機構成素材
   * minimum: 0
   * maximum: 15
   * @return materialType
  */
  @NotNull @Min(0) @Max(15) 
  @Schema(name = "materialType", example = "1", description = "路側機構成素材", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("materialType")
  public Integer getMaterialType() {
    return materialType;
  }

  public void setMaterialType(Integer materialType) {
    this.materialType = materialType;
  }

  public DataModelRoadsideUnitInfoAttribute dateOfInstallation(LocalDate dateOfInstallation) {
    this.dateOfInstallation = dateOfInstallation;
    return this;
  }

  /**
   * 路側機設置年月日
   * @return dateOfInstallation
  */
  @NotNull @Valid 
  @Schema(name = "dateOfInstallation", example = "Tue Jan 23 09:00:00 JST 2024", description = "路側機設置年月日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateOfInstallation")
  public LocalDate getDateOfInstallation() {
    return dateOfInstallation;
  }

  public void setDateOfInstallation(LocalDate dateOfInstallation) {
    this.dateOfInstallation = dateOfInstallation;
  }

  public DataModelRoadsideUnitInfoAttribute latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * 路側機が設置された場所の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 900000000
   * @return latitude
  */
  @NotNull @Min(-2147483648) @Max(900000000) 
  @Schema(name = "latitude", example = "123456789", description = "路側機が設置された場所の緯度情報．計測系はWGS84．北緯をプラス, 南緯をマイナスで表現(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public DataModelRoadsideUnitInfoAttribute longitude(Integer longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * 路側機が設置された場所の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現(分解能:0.0000001度)
   * minimum: -2147483648
   * maximum: 1800000000
   * @return longitude
  */
  @NotNull @Min(-2147483648) @Max(1800000000) 
  @Schema(name = "longitude", example = "1234567891", description = "路側機が設置された場所の経度情報．計測系はWGS84．東経をプラス, 西経をマイナスで表現(分解能:0.0000001度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public DataModelRoadsideUnitInfoAttribute roadsideUnitManager(String roadsideUnitManager) {
    this.roadsideUnitManager = roadsideUnitManager;
    return this;
  }

  /**
   * 路側機管理者
   * @return roadsideUnitManager
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "roadsideUnitManager", example = "SMICIP", description = "路側機管理者", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roadsideUnitManager")
  public String getRoadsideUnitManager() {
    return roadsideUnitManager;
  }

  public void setRoadsideUnitManager(String roadsideUnitManager) {
    this.roadsideUnitManager = roadsideUnitManager;
  }

  public DataModelRoadsideUnitInfoAttribute installationSiteManager(String installationSiteManager) {
    this.installationSiteManager = installationSiteManager;
    return this;
  }

  /**
   * 路側機を設置した土地の管理者
   * @return installationSiteManager
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "installationSiteManager", example = "SMICIP", description = "路側機を設置した土地の管理者", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("installationSiteManager")
  public String getInstallationSiteManager() {
    return installationSiteManager;
  }

  public void setInstallationSiteManager(String installationSiteManager) {
    this.installationSiteManager = installationSiteManager;
  }

  public DataModelRoadsideUnitInfoAttribute lastInspectionDate(LocalDate lastInspectionDate) {
    this.lastInspectionDate = lastInspectionDate;
    return this;
  }

  /**
   * 最終点検日
   * @return lastInspectionDate
  */
  @NotNull @Valid 
  @Schema(name = "lastInspectionDate", example = "Tue Jan 23 09:00:00 JST 2024", description = "最終点検日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastInspectionDate")
  public LocalDate getLastInspectionDate() {
    return lastInspectionDate;
  }

  public void setLastInspectionDate(LocalDate lastInspectionDate) {
    this.lastInspectionDate = lastInspectionDate;
  }

  public DataModelRoadsideUnitInfoAttribute nextInspectionDate(LocalDate nextInspectionDate) {
    this.nextInspectionDate = nextInspectionDate;
    return this;
  }

  /**
   * 次回点検日
   * @return nextInspectionDate
  */
  @NotNull @Valid 
  @Schema(name = "nextInspectionDate", example = "Thu Jan 23 09:00:00 JST 2025", description = "次回点検日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nextInspectionDate")
  public LocalDate getNextInspectionDate() {
    return nextInspectionDate;
  }

  public void setNextInspectionDate(LocalDate nextInspectionDate) {
    this.nextInspectionDate = nextInspectionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelRoadsideUnitInfoAttribute dataModelRoadsideUnitInfoAttribute = (DataModelRoadsideUnitInfoAttribute) o;
    return Objects.equals(this.serviceLocationID, dataModelRoadsideUnitInfoAttribute.serviceLocationID) &&
        Objects.equals(this.roadsideUnitID, dataModelRoadsideUnitInfoAttribute.roadsideUnitID) &&
        Objects.equals(this.updateTimeInfo, dataModelRoadsideUnitInfoAttribute.updateTimeInfo) &&
        Objects.equals(this.formatVersion, dataModelRoadsideUnitInfoAttribute.formatVersion) &&
        Objects.equals(this.roadsideUnitName, dataModelRoadsideUnitInfoAttribute.roadsideUnitName) &&
        Objects.equals(this.productNumber, dataModelRoadsideUnitInfoAttribute.productNumber) &&
        Objects.equals(this.manufacturer, dataModelRoadsideUnitInfoAttribute.manufacturer) &&
        Objects.equals(this.customer, dataModelRoadsideUnitInfoAttribute.customer) &&
        Objects.equals(this.licensingInfo, dataModelRoadsideUnitInfoAttribute.licensingInfo) &&
        Objects.equals(this.initialRegistrationDate, dataModelRoadsideUnitInfoAttribute.initialRegistrationDate) &&
        Objects.equals(this.powerConsumption, dataModelRoadsideUnitInfoAttribute.powerConsumption) &&
        Objects.equals(this.grossWeight, dataModelRoadsideUnitInfoAttribute.grossWeight) &&
        Objects.equals(this.materialType, dataModelRoadsideUnitInfoAttribute.materialType) &&
        Objects.equals(this.dateOfInstallation, dataModelRoadsideUnitInfoAttribute.dateOfInstallation) &&
        Objects.equals(this.latitude, dataModelRoadsideUnitInfoAttribute.latitude) &&
        Objects.equals(this.longitude, dataModelRoadsideUnitInfoAttribute.longitude) &&
        Objects.equals(this.roadsideUnitManager, dataModelRoadsideUnitInfoAttribute.roadsideUnitManager) &&
        Objects.equals(this.installationSiteManager, dataModelRoadsideUnitInfoAttribute.installationSiteManager) &&
        Objects.equals(this.lastInspectionDate, dataModelRoadsideUnitInfoAttribute.lastInspectionDate) &&
        Objects.equals(this.nextInspectionDate, dataModelRoadsideUnitInfoAttribute.nextInspectionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocationID, roadsideUnitID, updateTimeInfo, formatVersion, roadsideUnitName, productNumber, manufacturer, customer, licensingInfo, initialRegistrationDate, powerConsumption, grossWeight, materialType, dateOfInstallation, latitude, longitude, roadsideUnitManager, installationSiteManager, lastInspectionDate, nextInspectionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelRoadsideUnitInfoAttribute {\n");
    sb.append("    serviceLocationID: ").append(toIndentedString(serviceLocationID)).append("\n");
    sb.append("    roadsideUnitID: ").append(toIndentedString(roadsideUnitID)).append("\n");
    sb.append("    updateTimeInfo: ").append(toIndentedString(updateTimeInfo)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    roadsideUnitName: ").append(toIndentedString(roadsideUnitName)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    licensingInfo: ").append(toIndentedString(licensingInfo)).append("\n");
    sb.append("    initialRegistrationDate: ").append(toIndentedString(initialRegistrationDate)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    grossWeight: ").append(toIndentedString(grossWeight)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    dateOfInstallation: ").append(toIndentedString(dateOfInstallation)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    roadsideUnitManager: ").append(toIndentedString(roadsideUnitManager)).append("\n");
    sb.append("    installationSiteManager: ").append(toIndentedString(installationSiteManager)).append("\n");
    sb.append("    lastInspectionDate: ").append(toIndentedString(lastInspectionDate)).append("\n");
    sb.append("    nextInspectionDate: ").append(toIndentedString(nextInspectionDate)).append("\n");
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

