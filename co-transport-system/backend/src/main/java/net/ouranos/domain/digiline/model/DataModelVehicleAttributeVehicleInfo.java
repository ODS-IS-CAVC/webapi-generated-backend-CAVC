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
 * 車輌情報
 */

@Schema(name = "dataModel_vehicle_attribute_vehicle_info", description = "車輌情報")
@JsonTypeName("dataModel_vehicle_attribute_vehicle_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelVehicleAttributeVehicleInfo {

  private String registrationNumber;

  private String giai;

  private String registrationTransportOfficeName;

  private String registrationVehicleType;

  private String registrationVehicleUse;

  private String registrationVehicleId;

  private String chassisNumber;

  private String vehicleId;

  private String operatorCorporateNumber;

  private String operatorBusinessCode;

  private String ownerCorporateNumber;

  private String ownerBusinessCode;

  private String vehicleType;

  private String hazardousMaterialVehicleType;

  private String tractor;

  private String trailer;

  public DataModelVehicleAttributeVehicleInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelVehicleAttributeVehicleInfo(String registrationNumber, String giai, String registrationTransportOfficeName, String registrationVehicleType, String registrationVehicleUse, String registrationVehicleId, String operatorCorporateNumber, String vehicleType) {
    this.registrationNumber = registrationNumber;
    this.giai = giai;
    this.registrationTransportOfficeName = registrationTransportOfficeName;
    this.registrationVehicleType = registrationVehicleType;
    this.registrationVehicleUse = registrationVehicleUse;
    this.registrationVehicleId = registrationVehicleId;
    this.operatorCorporateNumber = operatorCorporateNumber;
    this.vehicleType = vehicleType;
  }

  public DataModelVehicleAttributeVehicleInfo registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * 自動車登録番号
   * @return registrationNumber
  */
  @NotNull 
  @Schema(name = "registration_number", example = "  品川△△５００あ１２３４", description = "自動車登録番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registration_number")
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public DataModelVehicleAttributeVehicleInfo giai(String giai) {
    this.giai = giai;
    return this;
  }

  /**
   * GIAI
   * @return giai
  */
  @NotNull 
  @Schema(name = "giai", example = "1234567890123456789012345678901234", description = "GIAI", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("giai")
  public String getGiai() {
    return giai;
  }

  public void setGiai(String giai) {
    this.giai = giai;
  }

  public DataModelVehicleAttributeVehicleInfo registrationTransportOfficeName(String registrationTransportOfficeName) {
    this.registrationTransportOfficeName = registrationTransportOfficeName;
    return this;
  }

  /**
   * 自動車登録番号_車輌登録運輸支局名
   * @return registrationTransportOfficeName
  */
  @NotNull 
  @Schema(name = "registration_transport_office_name", example = "品川", description = "自動車登録番号_車輌登録運輸支局名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registration_transport_office_name")
  public String getRegistrationTransportOfficeName() {
    return registrationTransportOfficeName;
  }

  public void setRegistrationTransportOfficeName(String registrationTransportOfficeName) {
    this.registrationTransportOfficeName = registrationTransportOfficeName;
  }

  public DataModelVehicleAttributeVehicleInfo registrationVehicleType(String registrationVehicleType) {
    this.registrationVehicleType = registrationVehicleType;
    return this;
  }

  /**
   * 自動車登録番号_車輌種別
   * @return registrationVehicleType
  */
  @NotNull 
  @Schema(name = "registration_vehicle_type", example = "５００", description = "自動車登録番号_車輌種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registration_vehicle_type")
  public String getRegistrationVehicleType() {
    return registrationVehicleType;
  }

  public void setRegistrationVehicleType(String registrationVehicleType) {
    this.registrationVehicleType = registrationVehicleType;
  }

  public DataModelVehicleAttributeVehicleInfo registrationVehicleUse(String registrationVehicleUse) {
    this.registrationVehicleUse = registrationVehicleUse;
    return this;
  }

  /**
   * 自動車登録番号_車輌用途
   * @return registrationVehicleUse
  */
  @NotNull 
  @Schema(name = "registration_vehicle_use", example = "あ", description = "自動車登録番号_車輌用途", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registration_vehicle_use")
  public String getRegistrationVehicleUse() {
    return registrationVehicleUse;
  }

  public void setRegistrationVehicleUse(String registrationVehicleUse) {
    this.registrationVehicleUse = registrationVehicleUse;
  }

  public DataModelVehicleAttributeVehicleInfo registrationVehicleId(String registrationVehicleId) {
    this.registrationVehicleId = registrationVehicleId;
    return this;
  }

  /**
   * 自動車登録番号_車輌番号
   * @return registrationVehicleId
  */
  @NotNull 
  @Schema(name = "registration_vehicle_id", example = "１２３４", description = "自動車登録番号_車輌番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registration_vehicle_id")
  public String getRegistrationVehicleId() {
    return registrationVehicleId;
  }

  public void setRegistrationVehicleId(String registrationVehicleId) {
    this.registrationVehicleId = registrationVehicleId;
  }

  public DataModelVehicleAttributeVehicleInfo chassisNumber(String chassisNumber) {
    this.chassisNumber = chassisNumber;
    return this;
  }

  /**
   * 車台番号
   * @return chassisNumber
  */
  
  @Schema(name = "chassis_number", description = "車台番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chassis_number")
  public String getChassisNumber() {
    return chassisNumber;
  }

  public void setChassisNumber(String chassisNumber) {
    this.chassisNumber = chassisNumber;
  }

  public DataModelVehicleAttributeVehicleInfo vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * 車輌番号
   * @return vehicleId
  */
  
  @Schema(name = "vehicle_id", description = "車輌番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicle_id")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public DataModelVehicleAttributeVehicleInfo operatorCorporateNumber(String operatorCorporateNumber) {
    this.operatorCorporateNumber = operatorCorporateNumber;
    return this;
  }

  /**
   * 車輌使用者法人番号
   * @return operatorCorporateNumber
  */
  @NotNull 
  @Schema(name = "operator_corporate_number", example = "1234567890123", description = "車輌使用者法人番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operator_corporate_number")
  public String getOperatorCorporateNumber() {
    return operatorCorporateNumber;
  }

  public void setOperatorCorporateNumber(String operatorCorporateNumber) {
    this.operatorCorporateNumber = operatorCorporateNumber;
  }

  public DataModelVehicleAttributeVehicleInfo operatorBusinessCode(String operatorBusinessCode) {
    this.operatorBusinessCode = operatorBusinessCode;
    return this;
  }

  /**
   * 車輌使用者事業所コード
   * @return operatorBusinessCode
  */
  
  @Schema(name = "operator_business_code", description = "車輌使用者事業所コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator_business_code")
  public String getOperatorBusinessCode() {
    return operatorBusinessCode;
  }

  public void setOperatorBusinessCode(String operatorBusinessCode) {
    this.operatorBusinessCode = operatorBusinessCode;
  }

  public DataModelVehicleAttributeVehicleInfo ownerCorporateNumber(String ownerCorporateNumber) {
    this.ownerCorporateNumber = ownerCorporateNumber;
    return this;
  }

  /**
   * 車輌所有者法人番号
   * @return ownerCorporateNumber
  */
  
  @Schema(name = "owner_corporate_number", description = "車輌所有者法人番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner_corporate_number")
  public String getOwnerCorporateNumber() {
    return ownerCorporateNumber;
  }

  public void setOwnerCorporateNumber(String ownerCorporateNumber) {
    this.ownerCorporateNumber = ownerCorporateNumber;
  }

  public DataModelVehicleAttributeVehicleInfo ownerBusinessCode(String ownerBusinessCode) {
    this.ownerBusinessCode = ownerBusinessCode;
    return this;
  }

  /**
   * 車輌所有者事業所コード
   * @return ownerBusinessCode
  */
  
  @Schema(name = "owner_business_code", description = "車輌所有者事業所コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner_business_code")
  public String getOwnerBusinessCode() {
    return ownerBusinessCode;
  }

  public void setOwnerBusinessCode(String ownerBusinessCode) {
    this.ownerBusinessCode = ownerBusinessCode;
  }

  public DataModelVehicleAttributeVehicleInfo vehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  /**
   * 車輌種別
   * @return vehicleType
  */
  @NotNull 
  @Schema(name = "vehicle_type", example = "1", description = "車輌種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_type")
  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public DataModelVehicleAttributeVehicleInfo hazardousMaterialVehicleType(String hazardousMaterialVehicleType) {
    this.hazardousMaterialVehicleType = hazardousMaterialVehicleType;
    return this;
  }

  /**
   * 危険物積載車輌種別
   * @return hazardousMaterialVehicleType
  */
  
  @Schema(name = "hazardous_material_vehicle_type", description = "危険物積載車輌種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardous_material_vehicle_type")
  public String getHazardousMaterialVehicleType() {
    return hazardousMaterialVehicleType;
  }

  public void setHazardousMaterialVehicleType(String hazardousMaterialVehicleType) {
    this.hazardousMaterialVehicleType = hazardousMaterialVehicleType;
  }

  public DataModelVehicleAttributeVehicleInfo tractor(String tractor) {
    this.tractor = tractor;
    return this;
  }

  /**
   * トラクタ（けん引車）
   * @return tractor
  */
  
  @Schema(name = "tractor", description = "トラクタ（けん引車）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tractor")
  public String getTractor() {
    return tractor;
  }

  public void setTractor(String tractor) {
    this.tractor = tractor;
  }

  public DataModelVehicleAttributeVehicleInfo trailer(String trailer) {
    this.trailer = trailer;
    return this;
  }

  /**
   * トレーラ（被けん引車）
   * @return trailer
  */
  
  @Schema(name = "trailer", description = "トレーラ（被けん引車）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trailer")
  public String getTrailer() {
    return trailer;
  }

  public void setTrailer(String trailer) {
    this.trailer = trailer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelVehicleAttributeVehicleInfo dataModelVehicleAttributeVehicleInfo = (DataModelVehicleAttributeVehicleInfo) o;
    return Objects.equals(this.registrationNumber, dataModelVehicleAttributeVehicleInfo.registrationNumber) &&
        Objects.equals(this.giai, dataModelVehicleAttributeVehicleInfo.giai) &&
        Objects.equals(this.registrationTransportOfficeName, dataModelVehicleAttributeVehicleInfo.registrationTransportOfficeName) &&
        Objects.equals(this.registrationVehicleType, dataModelVehicleAttributeVehicleInfo.registrationVehicleType) &&
        Objects.equals(this.registrationVehicleUse, dataModelVehicleAttributeVehicleInfo.registrationVehicleUse) &&
        Objects.equals(this.registrationVehicleId, dataModelVehicleAttributeVehicleInfo.registrationVehicleId) &&
        Objects.equals(this.chassisNumber, dataModelVehicleAttributeVehicleInfo.chassisNumber) &&
        Objects.equals(this.vehicleId, dataModelVehicleAttributeVehicleInfo.vehicleId) &&
        Objects.equals(this.operatorCorporateNumber, dataModelVehicleAttributeVehicleInfo.operatorCorporateNumber) &&
        Objects.equals(this.operatorBusinessCode, dataModelVehicleAttributeVehicleInfo.operatorBusinessCode) &&
        Objects.equals(this.ownerCorporateNumber, dataModelVehicleAttributeVehicleInfo.ownerCorporateNumber) &&
        Objects.equals(this.ownerBusinessCode, dataModelVehicleAttributeVehicleInfo.ownerBusinessCode) &&
        Objects.equals(this.vehicleType, dataModelVehicleAttributeVehicleInfo.vehicleType) &&
        Objects.equals(this.hazardousMaterialVehicleType, dataModelVehicleAttributeVehicleInfo.hazardousMaterialVehicleType) &&
        Objects.equals(this.tractor, dataModelVehicleAttributeVehicleInfo.tractor) &&
        Objects.equals(this.trailer, dataModelVehicleAttributeVehicleInfo.trailer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationNumber, giai, registrationTransportOfficeName, registrationVehicleType, registrationVehicleUse, registrationVehicleId, chassisNumber, vehicleId, operatorCorporateNumber, operatorBusinessCode, ownerCorporateNumber, ownerBusinessCode, vehicleType, hazardousMaterialVehicleType, tractor, trailer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleAttributeVehicleInfo {\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    giai: ").append(toIndentedString(giai)).append("\n");
    sb.append("    registrationTransportOfficeName: ").append(toIndentedString(registrationTransportOfficeName)).append("\n");
    sb.append("    registrationVehicleType: ").append(toIndentedString(registrationVehicleType)).append("\n");
    sb.append("    registrationVehicleUse: ").append(toIndentedString(registrationVehicleUse)).append("\n");
    sb.append("    registrationVehicleId: ").append(toIndentedString(registrationVehicleId)).append("\n");
    sb.append("    chassisNumber: ").append(toIndentedString(chassisNumber)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    operatorCorporateNumber: ").append(toIndentedString(operatorCorporateNumber)).append("\n");
    sb.append("    operatorBusinessCode: ").append(toIndentedString(operatorBusinessCode)).append("\n");
    sb.append("    ownerCorporateNumber: ").append(toIndentedString(ownerCorporateNumber)).append("\n");
    sb.append("    ownerBusinessCode: ").append(toIndentedString(ownerBusinessCode)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    hazardousMaterialVehicleType: ").append(toIndentedString(hazardousMaterialVehicleType)).append("\n");
    sb.append("    tractor: ").append(toIndentedString(tractor)).append("\n");
    sb.append("    trailer: ").append(toIndentedString(trailer)).append("\n");
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

