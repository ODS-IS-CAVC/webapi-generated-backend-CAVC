package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelVehicleAttributeHazardousMaterialInfoInner;
import net.ouranos.domain.digiline.model.DataModelVehicleAttributeMaxCarryingCapacityInner;
import net.ouranos.domain.digiline.model.DataModelVehicleAttributeMotasInfo;
import net.ouranos.domain.digiline.model.DataModelVehicleAttributeVehicleDetails;
import net.ouranos.domain.digiline.model.DataModelVehicleAttributeVehicleInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelVehicleAttribute
 */

@JsonTypeName("dataModel_vehicle_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:52:03.745534400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class DataModelVehicleAttribute {

  private DataModelVehicleAttributeVehicleInfo vehicleInfo;

  private DataModelVehicleAttributeMotasInfo motasInfo;

  private DataModelVehicleAttributeVehicleDetails vehicleDetails;

  @Valid
  private List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity = new ArrayList<>();

  @Valid
  private List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo = new ArrayList<>();

  public DataModelVehicleAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelVehicleAttribute(DataModelVehicleAttributeVehicleInfo vehicleInfo, DataModelVehicleAttributeMotasInfo motasInfo, DataModelVehicleAttributeVehicleDetails vehicleDetails, List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity, List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo) {
    this.vehicleInfo = vehicleInfo;
    this.motasInfo = motasInfo;
    this.vehicleDetails = vehicleDetails;
    this.maxCarryingCapacity = maxCarryingCapacity;
    this.hazardousMaterialInfo = hazardousMaterialInfo;
  }

  public DataModelVehicleAttribute vehicleInfo(DataModelVehicleAttributeVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
    return this;
  }

  /**
   * Get vehicleInfo
   * @return vehicleInfo
  */
  @NotNull @Valid 
  @Schema(name = "vehicle_info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_info")
  public DataModelVehicleAttributeVehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }

  public void setVehicleInfo(DataModelVehicleAttributeVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }

  public DataModelVehicleAttribute motasInfo(DataModelVehicleAttributeMotasInfo motasInfo) {
    this.motasInfo = motasInfo;
    return this;
  }

  /**
   * Get motasInfo
   * @return motasInfo
  */
  @NotNull @Valid 
  @Schema(name = "motas_info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("motas_info")
  public DataModelVehicleAttributeMotasInfo getMotasInfo() {
    return motasInfo;
  }

  public void setMotasInfo(DataModelVehicleAttributeMotasInfo motasInfo) {
    this.motasInfo = motasInfo;
  }

  public DataModelVehicleAttribute vehicleDetails(DataModelVehicleAttributeVehicleDetails vehicleDetails) {
    this.vehicleDetails = vehicleDetails;
    return this;
  }

  /**
   * Get vehicleDetails
   * @return vehicleDetails
  */
  @NotNull @Valid 
  @Schema(name = "vehicle_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle_details")
  public DataModelVehicleAttributeVehicleDetails getVehicleDetails() {
    return vehicleDetails;
  }

  public void setVehicleDetails(DataModelVehicleAttributeVehicleDetails vehicleDetails) {
    this.vehicleDetails = vehicleDetails;
  }

  public DataModelVehicleAttribute maxCarryingCapacity(List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity) {
    this.maxCarryingCapacity = maxCarryingCapacity;
    return this;
  }

  public DataModelVehicleAttribute addMaxCarryingCapacityItem(DataModelVehicleAttributeMaxCarryingCapacityInner maxCarryingCapacityItem) {
    if (this.maxCarryingCapacity == null) {
      this.maxCarryingCapacity = new ArrayList<>();
    }
    this.maxCarryingCapacity.add(maxCarryingCapacityItem);
    return this;
  }

  /**
   * 最大積載能力
   * @return maxCarryingCapacity
  */
  @NotNull @Valid 
  @Schema(name = "max_carrying_capacity", description = "最大積載能力", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_carrying_capacity")
  public List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> getMaxCarryingCapacity() {
    return maxCarryingCapacity;
  }

  public void setMaxCarryingCapacity(List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity) {
    this.maxCarryingCapacity = maxCarryingCapacity;
  }

  public DataModelVehicleAttribute hazardousMaterialInfo(List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo) {
    this.hazardousMaterialInfo = hazardousMaterialInfo;
    return this;
  }

  public DataModelVehicleAttribute addHazardousMaterialInfoItem(DataModelVehicleAttributeHazardousMaterialInfoInner hazardousMaterialInfoItem) {
    if (this.hazardousMaterialInfo == null) {
      this.hazardousMaterialInfo = new ArrayList<>();
    }
    this.hazardousMaterialInfo.add(hazardousMaterialInfoItem);
    return this;
  }

  /**
   * 危険物情報
   * @return hazardousMaterialInfo
  */
  @NotNull @Valid 
  @Schema(name = "hazardous_material_info", description = "危険物情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hazardous_material_info")
  public List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> getHazardousMaterialInfo() {
    return hazardousMaterialInfo;
  }

  public void setHazardousMaterialInfo(List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo) {
    this.hazardousMaterialInfo = hazardousMaterialInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelVehicleAttribute dataModelVehicleAttribute = (DataModelVehicleAttribute) o;
    return Objects.equals(this.vehicleInfo, dataModelVehicleAttribute.vehicleInfo) &&
        Objects.equals(this.motasInfo, dataModelVehicleAttribute.motasInfo) &&
        Objects.equals(this.vehicleDetails, dataModelVehicleAttribute.vehicleDetails) &&
        Objects.equals(this.maxCarryingCapacity, dataModelVehicleAttribute.maxCarryingCapacity) &&
        Objects.equals(this.hazardousMaterialInfo, dataModelVehicleAttribute.hazardousMaterialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleInfo, motasInfo, vehicleDetails, maxCarryingCapacity, hazardousMaterialInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleAttribute {\n");
    sb.append("    vehicleInfo: ").append(toIndentedString(vehicleInfo)).append("\n");
    sb.append("    motasInfo: ").append(toIndentedString(motasInfo)).append("\n");
    sb.append("    vehicleDetails: ").append(toIndentedString(vehicleDetails)).append("\n");
    sb.append("    maxCarryingCapacity: ").append(toIndentedString(maxCarryingCapacity)).append("\n");
    sb.append("    hazardousMaterialInfo: ").append(toIndentedString(hazardousMaterialInfo)).append("\n");
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

