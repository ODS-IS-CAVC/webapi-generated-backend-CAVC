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
 * MOTAS情報
 */

@Schema(name = "dataModel_vehicle_attribute_motas_info", description = "MOTAS情報")
@JsonTypeName("dataModel_vehicle_attribute_motas_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:52:03.745534400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class DataModelVehicleAttributeMotasInfo {

  private BigDecimal maxPayload1;

  private BigDecimal maxPayload2;

  private BigDecimal vehicleWeight;

  private BigDecimal vehicleLength;

  private BigDecimal vehicleWidth;

  private BigDecimal vehicleHeight;

  private BigDecimal hazardousMaterialVolume;

  private BigDecimal hazardousMaterialSpecificGravity;

  private String expiryDate;

  private String deregistrationStatus;

  public DataModelVehicleAttributeMotasInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelVehicleAttributeMotasInfo(BigDecimal maxPayload1, BigDecimal maxPayload2, BigDecimal vehicleWeight, BigDecimal vehicleLength, BigDecimal vehicleWidth, BigDecimal vehicleHeight, String expiryDate) {
    this.maxPayload1 = maxPayload1;
    this.maxPayload2 = maxPayload2;
    this.vehicleWeight = vehicleWeight;
    this.vehicleLength = vehicleLength;
    this.vehicleWidth = vehicleWidth;
    this.vehicleHeight = vehicleHeight;
    this.expiryDate = expiryDate;
  }

  public DataModelVehicleAttributeMotasInfo maxPayload1(BigDecimal maxPayload1) {
    this.maxPayload1 = maxPayload1;
    return this;
  }

  /**
   * 最大積載量1
   * @return maxPayload1
  */
  @NotNull @Valid 
  @Schema(name = "max_payload_1", example = "33650", description = "最大積載量1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_payload_1")
  public BigDecimal getMaxPayload1() {
    return maxPayload1;
  }

  public void setMaxPayload1(BigDecimal maxPayload1) {
    this.maxPayload1 = maxPayload1;
  }

  public DataModelVehicleAttributeMotasInfo maxPayload2(BigDecimal maxPayload2) {
    this.maxPayload2 = maxPayload2;
    return this;
  }

  /**
   * 最大積載量2
   * @return maxPayload2
  */
  @NotNull @Valid 
  @Schema(name = "max_payload_2", example = "8500", description = "最大積載量2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_payload_2")
  public BigDecimal getMaxPayload2() {
    return maxPayload2;
  }

  public void setMaxPayload2(BigDecimal maxPayload2) {
    this.maxPayload2 = maxPayload2;
  }

  public DataModelVehicleAttributeMotasInfo vehicleWeight(BigDecimal vehicleWeight) {
    this.vehicleWeight = vehicleWeight;
    return this;
  }

  /**
   * 車輌重量
   * @return vehicleWeight
  */
  @NotNull @Valid 
  @Schema(name = "vehicle_weight", example = "4810", description = "車輌重量", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_weight")
  public BigDecimal getVehicleWeight() {
    return vehicleWeight;
  }

  public void setVehicleWeight(BigDecimal vehicleWeight) {
    this.vehicleWeight = vehicleWeight;
  }

  public DataModelVehicleAttributeMotasInfo vehicleLength(BigDecimal vehicleLength) {
    this.vehicleLength = vehicleLength;
    return this;
  }

  /**
   * 車輌長さ
   * @return vehicleLength
  */
  @NotNull @Valid 
  @Schema(name = "vehicle_length", example = "553", description = "車輌長さ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_length")
  public BigDecimal getVehicleLength() {
    return vehicleLength;
  }

  public void setVehicleLength(BigDecimal vehicleLength) {
    this.vehicleLength = vehicleLength;
  }

  public DataModelVehicleAttributeMotasInfo vehicleWidth(BigDecimal vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
    return this;
  }

  /**
   * 車輌幅
   * @return vehicleWidth
  */
  @NotNull @Valid 
  @Schema(name = "vehicle_width", example = "244", description = "車輌幅", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_width")
  public BigDecimal getVehicleWidth() {
    return vehicleWidth;
  }

  public void setVehicleWidth(BigDecimal vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
  }

  public DataModelVehicleAttributeMotasInfo vehicleHeight(BigDecimal vehicleHeight) {
    this.vehicleHeight = vehicleHeight;
    return this;
  }

  /**
   * 車輌高さ
   * @return vehicleHeight
  */
  @NotNull @Valid 
  @Schema(name = "vehicle_height", example = "282", description = "車輌高さ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_height")
  public BigDecimal getVehicleHeight() {
    return vehicleHeight;
  }

  public void setVehicleHeight(BigDecimal vehicleHeight) {
    this.vehicleHeight = vehicleHeight;
  }

  public DataModelVehicleAttributeMotasInfo hazardousMaterialVolume(BigDecimal hazardousMaterialVolume) {
    this.hazardousMaterialVolume = hazardousMaterialVolume;
    return this;
  }

  /**
   * 危険物容積
   * @return hazardousMaterialVolume
  */
  @Valid 
  @Schema(name = "hazardous_material_volume", description = "危険物容積", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardous_material_volume")
  public BigDecimal getHazardousMaterialVolume() {
    return hazardousMaterialVolume;
  }

  public void setHazardousMaterialVolume(BigDecimal hazardousMaterialVolume) {
    this.hazardousMaterialVolume = hazardousMaterialVolume;
  }

  public DataModelVehicleAttributeMotasInfo hazardousMaterialSpecificGravity(BigDecimal hazardousMaterialSpecificGravity) {
    this.hazardousMaterialSpecificGravity = hazardousMaterialSpecificGravity;
    return this;
  }

  /**
   * 危険物比重
   * @return hazardousMaterialSpecificGravity
  */
  @Valid 
  @Schema(name = "hazardous_material_specific_gravity", description = "危険物比重", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardous_material_specific_gravity")
  public BigDecimal getHazardousMaterialSpecificGravity() {
    return hazardousMaterialSpecificGravity;
  }

  public void setHazardousMaterialSpecificGravity(BigDecimal hazardousMaterialSpecificGravity) {
    this.hazardousMaterialSpecificGravity = hazardousMaterialSpecificGravity;
  }

  public DataModelVehicleAttributeMotasInfo expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * 有効期間満了年月日
   * @return expiryDate
  */
  @NotNull 
  @Schema(name = "expiry_date", example = "20281030", description = "有効期間満了年月日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expiry_date")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public DataModelVehicleAttributeMotasInfo deregistrationStatus(String deregistrationStatus) {
    this.deregistrationStatus = deregistrationStatus;
    return this;
  }

  /**
   * 抹消状態表示文字
   * @return deregistrationStatus
  */
  
  @Schema(name = "deregistration_status", description = "抹消状態表示文字", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deregistration_status")
  public String getDeregistrationStatus() {
    return deregistrationStatus;
  }

  public void setDeregistrationStatus(String deregistrationStatus) {
    this.deregistrationStatus = deregistrationStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelVehicleAttributeMotasInfo dataModelVehicleAttributeMotasInfo = (DataModelVehicleAttributeMotasInfo) o;
    return Objects.equals(this.maxPayload1, dataModelVehicleAttributeMotasInfo.maxPayload1) &&
        Objects.equals(this.maxPayload2, dataModelVehicleAttributeMotasInfo.maxPayload2) &&
        Objects.equals(this.vehicleWeight, dataModelVehicleAttributeMotasInfo.vehicleWeight) &&
        Objects.equals(this.vehicleLength, dataModelVehicleAttributeMotasInfo.vehicleLength) &&
        Objects.equals(this.vehicleWidth, dataModelVehicleAttributeMotasInfo.vehicleWidth) &&
        Objects.equals(this.vehicleHeight, dataModelVehicleAttributeMotasInfo.vehicleHeight) &&
        Objects.equals(this.hazardousMaterialVolume, dataModelVehicleAttributeMotasInfo.hazardousMaterialVolume) &&
        Objects.equals(this.hazardousMaterialSpecificGravity, dataModelVehicleAttributeMotasInfo.hazardousMaterialSpecificGravity) &&
        Objects.equals(this.expiryDate, dataModelVehicleAttributeMotasInfo.expiryDate) &&
        Objects.equals(this.deregistrationStatus, dataModelVehicleAttributeMotasInfo.deregistrationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPayload1, maxPayload2, vehicleWeight, vehicleLength, vehicleWidth, vehicleHeight, hazardousMaterialVolume, hazardousMaterialSpecificGravity, expiryDate, deregistrationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleAttributeMotasInfo {\n");
    sb.append("    maxPayload1: ").append(toIndentedString(maxPayload1)).append("\n");
    sb.append("    maxPayload2: ").append(toIndentedString(maxPayload2)).append("\n");
    sb.append("    vehicleWeight: ").append(toIndentedString(vehicleWeight)).append("\n");
    sb.append("    vehicleLength: ").append(toIndentedString(vehicleLength)).append("\n");
    sb.append("    vehicleWidth: ").append(toIndentedString(vehicleWidth)).append("\n");
    sb.append("    vehicleHeight: ").append(toIndentedString(vehicleHeight)).append("\n");
    sb.append("    hazardousMaterialVolume: ").append(toIndentedString(hazardousMaterialVolume)).append("\n");
    sb.append("    hazardousMaterialSpecificGravity: ").append(toIndentedString(hazardousMaterialSpecificGravity)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    deregistrationStatus: ").append(toIndentedString(deregistrationStatus)).append("\n");
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

