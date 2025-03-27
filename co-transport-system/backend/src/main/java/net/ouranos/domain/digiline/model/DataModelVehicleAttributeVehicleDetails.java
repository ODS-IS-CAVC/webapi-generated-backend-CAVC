package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 車輌情報詳細
 */

@Schema(name = "dataModel_vehicle_attribute_vehicle_details", description = "車輌情報詳細")
@JsonTypeName("dataModel_vehicle_attribute_vehicle_details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:52:03.745534400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class DataModelVehicleAttributeVehicleDetails {

  private BigDecimal bedHeight;

  private BigDecimal cargoHeight;

  private BigDecimal cargoWidth;

  private BigDecimal cargoLength;

  private BigDecimal maxCargoCapacity;

  private String bodyType;

  private String powerGate;

  private String wingDoors;

  private String refrigerationUnit;

  private BigDecimal temperatureRangeMin;

  private BigDecimal temperatureRangeMax;

  private String craneEquipped;

  private String vehicleEquipmentNotes;

  private String masterDataStartDate;

  private String masterDataEndDate;

  public DataModelVehicleAttributeVehicleDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelVehicleAttributeVehicleDetails(BigDecimal bedHeight, BigDecimal cargoHeight, BigDecimal cargoWidth, BigDecimal cargoLength, String refrigerationUnit, String masterDataStartDate, String masterDataEndDate) {
    this.bedHeight = bedHeight;
    this.cargoHeight = cargoHeight;
    this.cargoWidth = cargoWidth;
    this.cargoLength = cargoLength;
    this.refrigerationUnit = refrigerationUnit;
    this.masterDataStartDate = masterDataStartDate;
    this.masterDataEndDate = masterDataEndDate;
  }

  public DataModelVehicleAttributeVehicleDetails bedHeight(BigDecimal bedHeight) {
    this.bedHeight = bedHeight;
    return this;
  }

  /**
   * 荷台高さ
   * @return bedHeight
  */
  @NotNull @Valid 
  @Schema(name = "bed_height", example = "100", description = "荷台高さ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bed_height")
  public BigDecimal getBedHeight() {
    return bedHeight;
  }

  public void setBedHeight(BigDecimal bedHeight) {
    this.bedHeight = bedHeight;
  }

  public DataModelVehicleAttributeVehicleDetails cargoHeight(BigDecimal cargoHeight) {
    this.cargoHeight = cargoHeight;
    return this;
  }

  /**
   * 荷室高さ
   * @return cargoHeight
  */
  @NotNull @Valid 
  @Schema(name = "cargo_height", example = "100", description = "荷室高さ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargo_height")
  public BigDecimal getCargoHeight() {
    return cargoHeight;
  }

  public void setCargoHeight(BigDecimal cargoHeight) {
    this.cargoHeight = cargoHeight;
  }

  public DataModelVehicleAttributeVehicleDetails cargoWidth(BigDecimal cargoWidth) {
    this.cargoWidth = cargoWidth;
    return this;
  }

  /**
   * 荷室全幅
   * @return cargoWidth
  */
  @NotNull @Valid 
  @Schema(name = "cargo_width", example = "100", description = "荷室全幅", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargo_width")
  public BigDecimal getCargoWidth() {
    return cargoWidth;
  }

  public void setCargoWidth(BigDecimal cargoWidth) {
    this.cargoWidth = cargoWidth;
  }

  public DataModelVehicleAttributeVehicleDetails cargoLength(BigDecimal cargoLength) {
    this.cargoLength = cargoLength;
    return this;
  }

  /**
   * 荷室長さ
   * @return cargoLength
  */
  @NotNull @Valid 
  @Schema(name = "cargo_length", example = "100", description = "荷室長さ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargo_length")
  public BigDecimal getCargoLength() {
    return cargoLength;
  }

  public void setCargoLength(BigDecimal cargoLength) {
    this.cargoLength = cargoLength;
  }

  public DataModelVehicleAttributeVehicleDetails maxCargoCapacity(BigDecimal maxCargoCapacity) {
    this.maxCargoCapacity = maxCargoCapacity;
    return this;
  }

  /**
   * 最大積載容量
   * @return maxCargoCapacity
  */
  @Valid 
  @Schema(name = "max_cargo_capacity", description = "最大積載容量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_cargo_capacity")
  public BigDecimal getMaxCargoCapacity() {
    return maxCargoCapacity;
  }

  public void setMaxCargoCapacity(BigDecimal maxCargoCapacity) {
    this.maxCargoCapacity = maxCargoCapacity;
  }

  public DataModelVehicleAttributeVehicleDetails bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

  /**
   * 平ボディ/バンボディ
   * @return bodyType
  */
  
  @Schema(name = "body_type", description = "平ボディ/バンボディ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body_type")
  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public DataModelVehicleAttributeVehicleDetails powerGate(String powerGate) {
    this.powerGate = powerGate;
    return this;
  }

  /**
   * パワーゲート有無
   * @return powerGate
  */
  
  @Schema(name = "power_gate", description = "パワーゲート有無", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("power_gate")
  public String getPowerGate() {
    return powerGate;
  }

  public void setPowerGate(String powerGate) {
    this.powerGate = powerGate;
  }

  public DataModelVehicleAttributeVehicleDetails wingDoors(String wingDoors) {
    this.wingDoors = wingDoors;
    return this;
  }

  /**
   * ウィング有無
   * @return wingDoors
  */
  
  @Schema(name = "wing_doors", description = "ウィング有無", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wing_doors")
  public String getWingDoors() {
    return wingDoors;
  }

  public void setWingDoors(String wingDoors) {
    this.wingDoors = wingDoors;
  }

  public DataModelVehicleAttributeVehicleDetails refrigerationUnit(String refrigerationUnit) {
    this.refrigerationUnit = refrigerationUnit;
    return this;
  }

  /**
   * 冷凍・冷蔵設備
   * @return refrigerationUnit
  */
  @NotNull 
  @Schema(name = "refrigeration_unit", example = "0", description = "冷凍・冷蔵設備", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refrigeration_unit")
  public String getRefrigerationUnit() {
    return refrigerationUnit;
  }

  public void setRefrigerationUnit(String refrigerationUnit) {
    this.refrigerationUnit = refrigerationUnit;
  }

  public DataModelVehicleAttributeVehicleDetails temperatureRangeMin(BigDecimal temperatureRangeMin) {
    this.temperatureRangeMin = temperatureRangeMin;
    return this;
  }

  /**
   * 温度範囲（下限）
   * @return temperatureRangeMin
  */
  @Valid 
  @Schema(name = "temperature_range_min", example = "0", description = "温度範囲（下限）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature_range_min")
  public BigDecimal getTemperatureRangeMin() {
    return temperatureRangeMin;
  }

  public void setTemperatureRangeMin(BigDecimal temperatureRangeMin) {
    this.temperatureRangeMin = temperatureRangeMin;
  }

  public DataModelVehicleAttributeVehicleDetails temperatureRangeMax(BigDecimal temperatureRangeMax) {
    this.temperatureRangeMax = temperatureRangeMax;
    return this;
  }

  /**
   * 温度範囲（上限）
   * @return temperatureRangeMax
  */
  @Valid 
  @Schema(name = "temperature_range_max", description = "温度範囲（上限）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature_range_max")
  public BigDecimal getTemperatureRangeMax() {
    return temperatureRangeMax;
  }

  public void setTemperatureRangeMax(BigDecimal temperatureRangeMax) {
    this.temperatureRangeMax = temperatureRangeMax;
  }

  public DataModelVehicleAttributeVehicleDetails craneEquipped(String craneEquipped) {
    this.craneEquipped = craneEquipped;
    return this;
  }

  /**
   * クレーン付
   * @return craneEquipped
  */
  
  @Schema(name = "crane_equipped", description = "クレーン付", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("crane_equipped")
  public String getCraneEquipped() {
    return craneEquipped;
  }

  public void setCraneEquipped(String craneEquipped) {
    this.craneEquipped = craneEquipped;
  }

  public DataModelVehicleAttributeVehicleDetails vehicleEquipmentNotes(String vehicleEquipmentNotes) {
    this.vehicleEquipmentNotes = vehicleEquipmentNotes;
    return this;
  }

  /**
   * 車輌設備補足
   * @return vehicleEquipmentNotes
  */
  
  @Schema(name = "vehicle_equipment_notes", description = "車輌設備補足", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicle_equipment_notes")
  public String getVehicleEquipmentNotes() {
    return vehicleEquipmentNotes;
  }

  public void setVehicleEquipmentNotes(String vehicleEquipmentNotes) {
    this.vehicleEquipmentNotes = vehicleEquipmentNotes;
  }

  public DataModelVehicleAttributeVehicleDetails masterDataStartDate(String masterDataStartDate) {
    this.masterDataStartDate = masterDataStartDate;
    return this;
  }

  /**
   * マスタ適用開始日
   * @return masterDataStartDate
  */
  @NotNull 
  @Schema(name = "master_data_start_date", example = "20220101", description = "マスタ適用開始日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("master_data_start_date")
  public String getMasterDataStartDate() {
    return masterDataStartDate;
  }

  public void setMasterDataStartDate(String masterDataStartDate) {
    this.masterDataStartDate = masterDataStartDate;
  }

  public DataModelVehicleAttributeVehicleDetails masterDataEndDate(String masterDataEndDate) {
    this.masterDataEndDate = masterDataEndDate;
    return this;
  }

  /**
   * マスタ適用終了日
   * @return masterDataEndDate
  */
  @NotNull 
  @Schema(name = "master_data_end_date", example = "20990101", description = "マスタ適用終了日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("master_data_end_date")
  public String getMasterDataEndDate() {
    return masterDataEndDate;
  }

  public void setMasterDataEndDate(String masterDataEndDate) {
    this.masterDataEndDate = masterDataEndDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelVehicleAttributeVehicleDetails dataModelVehicleAttributeVehicleDetails = (DataModelVehicleAttributeVehicleDetails) o;
    return Objects.equals(this.bedHeight, dataModelVehicleAttributeVehicleDetails.bedHeight) &&
        Objects.equals(this.cargoHeight, dataModelVehicleAttributeVehicleDetails.cargoHeight) &&
        Objects.equals(this.cargoWidth, dataModelVehicleAttributeVehicleDetails.cargoWidth) &&
        Objects.equals(this.cargoLength, dataModelVehicleAttributeVehicleDetails.cargoLength) &&
        Objects.equals(this.maxCargoCapacity, dataModelVehicleAttributeVehicleDetails.maxCargoCapacity) &&
        Objects.equals(this.bodyType, dataModelVehicleAttributeVehicleDetails.bodyType) &&
        Objects.equals(this.powerGate, dataModelVehicleAttributeVehicleDetails.powerGate) &&
        Objects.equals(this.wingDoors, dataModelVehicleAttributeVehicleDetails.wingDoors) &&
        Objects.equals(this.refrigerationUnit, dataModelVehicleAttributeVehicleDetails.refrigerationUnit) &&
        Objects.equals(this.temperatureRangeMin, dataModelVehicleAttributeVehicleDetails.temperatureRangeMin) &&
        Objects.equals(this.temperatureRangeMax, dataModelVehicleAttributeVehicleDetails.temperatureRangeMax) &&
        Objects.equals(this.craneEquipped, dataModelVehicleAttributeVehicleDetails.craneEquipped) &&
        Objects.equals(this.vehicleEquipmentNotes, dataModelVehicleAttributeVehicleDetails.vehicleEquipmentNotes) &&
        Objects.equals(this.masterDataStartDate, dataModelVehicleAttributeVehicleDetails.masterDataStartDate) &&
        Objects.equals(this.masterDataEndDate, dataModelVehicleAttributeVehicleDetails.masterDataEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bedHeight, cargoHeight, cargoWidth, cargoLength, maxCargoCapacity, bodyType, powerGate, wingDoors, refrigerationUnit, temperatureRangeMin, temperatureRangeMax, craneEquipped, vehicleEquipmentNotes, masterDataStartDate, masterDataEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleAttributeVehicleDetails {\n");
    sb.append("    bedHeight: ").append(toIndentedString(bedHeight)).append("\n");
    sb.append("    cargoHeight: ").append(toIndentedString(cargoHeight)).append("\n");
    sb.append("    cargoWidth: ").append(toIndentedString(cargoWidth)).append("\n");
    sb.append("    cargoLength: ").append(toIndentedString(cargoLength)).append("\n");
    sb.append("    maxCargoCapacity: ").append(toIndentedString(maxCargoCapacity)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    powerGate: ").append(toIndentedString(powerGate)).append("\n");
    sb.append("    wingDoors: ").append(toIndentedString(wingDoors)).append("\n");
    sb.append("    refrigerationUnit: ").append(toIndentedString(refrigerationUnit)).append("\n");
    sb.append("    temperatureRangeMin: ").append(toIndentedString(temperatureRangeMin)).append("\n");
    sb.append("    temperatureRangeMax: ").append(toIndentedString(temperatureRangeMax)).append("\n");
    sb.append("    craneEquipped: ").append(toIndentedString(craneEquipped)).append("\n");
    sb.append("    vehicleEquipmentNotes: ").append(toIndentedString(vehicleEquipmentNotes)).append("\n");
    sb.append("    masterDataStartDate: ").append(toIndentedString(masterDataStartDate)).append("\n");
    sb.append("    masterDataEndDate: ").append(toIndentedString(masterDataEndDate)).append("\n");
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

