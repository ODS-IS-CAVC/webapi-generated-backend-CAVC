package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner {

  private DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarr;

  private DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrv;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner> carInfo = new ArrayList<>();

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner> drvInfo = new ArrayList<>();

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarr, List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner> carInfo) {
    this.roadCarr = roadCarr;
    this.carInfo = carInfo;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner roadCarr(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarr) {
    this.roadCarr = roadCarr;
    return this;
  }

  /**
   * Get roadCarr
   * @return roadCarr
  */
  @NotNull @Valid 
  @Schema(name = "road_carr", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("road_carr")
  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr getRoadCarr() {
    return roadCarr;
  }

  public void setRoadCarr(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarr) {
    this.roadCarr = roadCarr;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner logsSrvcPrv(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrv) {
    this.logsSrvcPrv = logsSrvcPrv;
    return this;
  }

  /**
   * Get logsSrvcPrv
   * @return logsSrvcPrv
  */
  @Valid 
  @Schema(name = "logs_srvc_prv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv")
  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv getLogsSrvcPrv() {
    return logsSrvcPrv;
  }

  public void setLogsSrvcPrv(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrv) {
    this.logsSrvcPrv = logsSrvcPrv;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner carInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner> carInfo) {
    this.carInfo = carInfo;
    return this;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner addCarInfoItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner carInfoItem) {
    if (this.carInfo == null) {
      this.carInfo = new ArrayList<>();
    }
    this.carInfo.add(carInfoItem);
    return this;
  }

  /**
   * 車輌情報
   * @return carInfo
  */
  @NotNull @Valid 
  @Schema(name = "car_info", description = "車輌情報", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("car_info")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner> getCarInfo() {
    return carInfo;
  }

  public void setCarInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerCarInfoInner> carInfo) {
    this.carInfo = carInfo;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner drvInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner> drvInfo) {
    this.drvInfo = drvInfo;
    return this;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner addDrvInfoItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner drvInfoItem) {
    if (this.drvInfo == null) {
      this.drvInfo = new ArrayList<>();
    }
    this.drvInfo.add(drvInfoItem);
    return this;
  }

  /**
   * 運転手情報
   * @return drvInfo
  */
  @Valid 
  @Schema(name = "drv_info", description = "運転手情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drv_info")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner> getDrvInfo() {
    return drvInfo;
  }

  public void setDrvInfo(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerDrvInfoInner> drvInfo) {
    this.drvInfo = drvInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner dataModelShipperTransCapacityAttributeTrspAbilityLineItemInner = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner) o;
    return Objects.equals(this.roadCarr, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInner.roadCarr) &&
        Objects.equals(this.logsSrvcPrv, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInner.logsSrvcPrv) &&
        Objects.equals(this.carInfo, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInner.carInfo) &&
        Objects.equals(this.drvInfo, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInner.drvInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roadCarr, logsSrvcPrv, carInfo, drvInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner {\n");
    sb.append("    roadCarr: ").append(toIndentedString(roadCarr)).append("\n");
    sb.append("    logsSrvcPrv: ").append(toIndentedString(logsSrvcPrv)).append("\n");
    sb.append("    carInfo: ").append(toIndentedString(carInfo)).append("\n");
    sb.append("    drvInfo: ").append(toIndentedString(drvInfo)).append("\n");
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

