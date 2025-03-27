package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents
 */

@JsonTypeName("dataModel_dynamicInfo_attribute_data_inner_vehicleIncidentInfo_inner_incidents")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-09T10:52:18.890649100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents {

  @Valid
  private List<@Size(min = 0, max = 64)String> vehicleControlIncident = new ArrayList<>();

  @Valid
  private List<@Size(min = 0, max = 64)String> operationalBasicIncident = new ArrayList<>();

  @Valid
  private List<@Size(min = 0, max = 64)String> accidentIncident = new ArrayList<>();

  @Valid
  private List<@Size(min = 0, max = 64)String> weatherIncident = new ArrayList<>();

  @Valid
  private List<@Size(min = 0, max = 64)String> trafficIncident = new ArrayList<>();

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents vehicleControlIncident(List<@Size(min = 0, max = 64)String> vehicleControlIncident) {
    this.vehicleControlIncident = vehicleControlIncident;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents addVehicleControlIncidentItem(String vehicleControlIncidentItem) {
    if (this.vehicleControlIncident == null) {
      this.vehicleControlIncident = new ArrayList<>();
    }
    this.vehicleControlIncident.add(vehicleControlIncidentItem);
    return this;
  }

  /**
   * 車両制御系インシデント
   * @return vehicleControlIncident
  */
  @Size(min = 0, max = 2147483647) 
  @Schema(name = "vehicleControlIncident", example = "[\"ADシステム異常\",\"エンジン制御異常\"]", description = "車両制御系インシデント", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleControlIncident")
  public List<@Size(min = 0, max = 64)String> getVehicleControlIncident() {
    return vehicleControlIncident;
  }

  public void setVehicleControlIncident(List<@Size(min = 0, max = 64)String> vehicleControlIncident) {
    this.vehicleControlIncident = vehicleControlIncident;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents operationalBasicIncident(List<@Size(min = 0, max = 64)String> operationalBasicIncident) {
    this.operationalBasicIncident = operationalBasicIncident;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents addOperationalBasicIncidentItem(String operationalBasicIncidentItem) {
    if (this.operationalBasicIncident == null) {
      this.operationalBasicIncident = new ArrayList<>();
    }
    this.operationalBasicIncident.add(operationalBasicIncidentItem);
    return this;
  }

  /**
   * 運行基本系インシデント
   * @return operationalBasicIncident
  */
  @Size(min = 0, max = 2147483647) 
  @Schema(name = "operationalBasicIncident", example = "[\"タイヤパンク\",\"車両火災\"]", description = "運行基本系インシデント", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationalBasicIncident")
  public List<@Size(min = 0, max = 64)String> getOperationalBasicIncident() {
    return operationalBasicIncident;
  }

  public void setOperationalBasicIncident(List<@Size(min = 0, max = 64)String> operationalBasicIncident) {
    this.operationalBasicIncident = operationalBasicIncident;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents accidentIncident(List<@Size(min = 0, max = 64)String> accidentIncident) {
    this.accidentIncident = accidentIncident;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents addAccidentIncidentItem(String accidentIncidentItem) {
    if (this.accidentIncident == null) {
      this.accidentIncident = new ArrayList<>();
    }
    this.accidentIncident.add(accidentIncidentItem);
    return this;
  }

  /**
   * 事故
   * @return accidentIncident
  */
  @Size(min = 0, max = 2147483647) 
  @Schema(name = "accidentIncident", example = "[\"エアバック展開情報\"]", description = "事故", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accidentIncident")
  public List<@Size(min = 0, max = 64)String> getAccidentIncident() {
    return accidentIncident;
  }

  public void setAccidentIncident(List<@Size(min = 0, max = 64)String> accidentIncident) {
    this.accidentIncident = accidentIncident;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents weatherIncident(List<@Size(min = 0, max = 64)String> weatherIncident) {
    this.weatherIncident = weatherIncident;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents addWeatherIncidentItem(String weatherIncidentItem) {
    if (this.weatherIncident == null) {
      this.weatherIncident = new ArrayList<>();
    }
    this.weatherIncident.add(weatherIncidentItem);
    return this;
  }

  /**
   * 天候インシデント
   * @return weatherIncident
  */
  @Size(min = 0, max = 2147483647) 
  @Schema(name = "weatherIncident", example = "[\"積雪深さ ○○cm　以上\",\"濃霧\"]", description = "天候インシデント", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherIncident")
  public List<@Size(min = 0, max = 64)String> getWeatherIncident() {
    return weatherIncident;
  }

  public void setWeatherIncident(List<@Size(min = 0, max = 64)String> weatherIncident) {
    this.weatherIncident = weatherIncident;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents trafficIncident(List<@Size(min = 0, max = 64)String> trafficIncident) {
    this.trafficIncident = trafficIncident;
    return this;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents addTrafficIncidentItem(String trafficIncidentItem) {
    if (this.trafficIncident == null) {
      this.trafficIncident = new ArrayList<>();
    }
    this.trafficIncident.add(trafficIncidentItem);
    return this;
  }

  /**
   * 交通インシデント
   * @return trafficIncident
  */
  @Size(min = 0, max = 2147483647) 
  @Schema(name = "trafficIncident", example = "[\"事故（他車両）\",\"他停止車両\"]", description = "交通インシデント", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficIncident")
  public List<@Size(min = 0, max = 64)String> getTrafficIncident() {
    return trafficIncident;
  }

  public void setTrafficIncident(List<@Size(min = 0, max = 64)String> trafficIncident) {
    this.trafficIncident = trafficIncident;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents = (DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents) o;
    return Objects.equals(this.vehicleControlIncident, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents.vehicleControlIncident) &&
        Objects.equals(this.operationalBasicIncident, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents.operationalBasicIncident) &&
        Objects.equals(this.accidentIncident, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents.accidentIncident) &&
        Objects.equals(this.weatherIncident, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents.weatherIncident) &&
        Objects.equals(this.trafficIncident, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents.trafficIncident);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleControlIncident, operationalBasicIncident, accidentIncident, weatherIncident, trafficIncident);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents {\n");
    sb.append("    vehicleControlIncident: ").append(toIndentedString(vehicleControlIncident)).append("\n");
    sb.append("    operationalBasicIncident: ").append(toIndentedString(operationalBasicIncident)).append("\n");
    sb.append("    accidentIncident: ").append(toIndentedString(accidentIncident)).append("\n");
    sb.append("    weatherIncident: ").append(toIndentedString(weatherIncident)).append("\n");
    sb.append("    trafficIncident: ").append(toIndentedString(trafficIncident)).append("\n");
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

