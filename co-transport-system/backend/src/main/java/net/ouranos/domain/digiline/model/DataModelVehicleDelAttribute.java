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
import net.ouranos.domain.digiline.model.DataModelVehicleDelAttributeVehicleInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelVehicleDelAttribute
 */

@JsonTypeName("dataModel_vehicle_del_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelVehicleDelAttribute {

  private DataModelVehicleDelAttributeVehicleInfo vehicleInfo;

  private DataModelVehicleAttributeMotasInfo motasInfo;

  private DataModelVehicleAttributeVehicleDetails vehicleDetails;

  @Valid
  private List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity = new ArrayList<>();

  @Valid
  private List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo = new ArrayList<>();

  public DataModelVehicleDelAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelVehicleDelAttribute(DataModelVehicleDelAttributeVehicleInfo vehicleInfo, DataModelVehicleAttributeMotasInfo motasInfo, DataModelVehicleAttributeVehicleDetails vehicleDetails, List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity, List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo) {
    this.vehicleInfo = vehicleInfo;
    this.motasInfo = motasInfo;
    this.vehicleDetails = vehicleDetails;
    this.maxCarryingCapacity = maxCarryingCapacity;
    this.hazardousMaterialInfo = hazardousMaterialInfo;
  }

  public DataModelVehicleDelAttribute vehicleInfo(DataModelVehicleDelAttributeVehicleInfo vehicleInfo) {
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
  public DataModelVehicleDelAttributeVehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }

  public void setVehicleInfo(DataModelVehicleDelAttributeVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }

  public DataModelVehicleDelAttribute motasInfo(DataModelVehicleAttributeMotasInfo motasInfo) {
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

  public DataModelVehicleDelAttribute vehicleDetails(DataModelVehicleAttributeVehicleDetails vehicleDetails) {
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

  public DataModelVehicleDelAttribute maxCarryingCapacity(List<@Valid DataModelVehicleAttributeMaxCarryingCapacityInner> maxCarryingCapacity) {
    this.maxCarryingCapacity = maxCarryingCapacity;
    return this;
  }

  public DataModelVehicleDelAttribute addMaxCarryingCapacityItem(DataModelVehicleAttributeMaxCarryingCapacityInner maxCarryingCapacityItem) {
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

  public DataModelVehicleDelAttribute hazardousMaterialInfo(List<@Valid DataModelVehicleAttributeHazardousMaterialInfoInner> hazardousMaterialInfo) {
    this.hazardousMaterialInfo = hazardousMaterialInfo;
    return this;
  }

  public DataModelVehicleDelAttribute addHazardousMaterialInfoItem(DataModelVehicleAttributeHazardousMaterialInfoInner hazardousMaterialInfoItem) {
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
    DataModelVehicleDelAttribute dataModelVehicleDelAttribute = (DataModelVehicleDelAttribute) o;
    return Objects.equals(this.vehicleInfo, dataModelVehicleDelAttribute.vehicleInfo) &&
        Objects.equals(this.motasInfo, dataModelVehicleDelAttribute.motasInfo) &&
        Objects.equals(this.vehicleDetails, dataModelVehicleDelAttribute.vehicleDetails) &&
        Objects.equals(this.maxCarryingCapacity, dataModelVehicleDelAttribute.maxCarryingCapacity) &&
        Objects.equals(this.hazardousMaterialInfo, dataModelVehicleDelAttribute.hazardousMaterialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleInfo, motasInfo, vehicleDetails, maxCarryingCapacity, hazardousMaterialInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelVehicleDelAttribute {\n");
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

