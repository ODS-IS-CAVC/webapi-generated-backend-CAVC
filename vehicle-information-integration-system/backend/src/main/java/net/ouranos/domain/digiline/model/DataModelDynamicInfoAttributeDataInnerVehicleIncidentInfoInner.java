package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner
 */

@JsonTypeName("dataModel_dynamicInfo_attribute_data_inner_vehicleIncidentInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner {

  private String deliveryName;

  private String dateTime;

  private Double lat;

  private Double lon;

  private String vehicleName;

  private String vehicleID;

  private String operatorID;

  private String incidentID;

  private DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents incidents;

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner deliveryName(String deliveryName) {
    this.deliveryName = deliveryName;
    return this;
  }

  /**
   * 便名
   * @return deliveryName
  */
  @Size(min = 0, max = 64) 
  @Schema(name = "deliveryName", example = "Sample deliveryName", description = "便名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryName")
  public String getDeliveryName() {
    return deliveryName;
  }

  public void setDeliveryName(String deliveryName) {
    this.deliveryName = deliveryName;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * 発生時刻 例)YYYY/MMDD hh:mm:ss
   * @return dateTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") @Size(min = 19, max = 19) 
  @Schema(name = "dateTime", example = "2024/01/22 11:22:33", description = "発生時刻 例)YYYY/MMDD hh:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * 発生場所緯度
   * minimum: -90
   * maximum: 90
   * @return lat
  */
  @DecimalMin("-90") @DecimalMax("90") 
  @Schema(name = "lat", example = "35.6242681254456", description = "発生場所緯度", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * 発生場所経度
   * minimum: -180
   * maximum: 180
   * @return lon
  */
  @DecimalMin("-180") @DecimalMax("180") 
  @Schema(name = "lon", example = "139.74258640456", description = "発生場所経度", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  /**
   * 車両名
   * @return vehicleName
  */
  @Size(min = 0, max = 64) 
  @Schema(name = "vehicleName", example = "Sample vehicleName", description = "車両名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleName")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner vehicleID(String vehicleID) {
    this.vehicleID = vehicleID;
    return this;
  }

  /**
   * 車両ID
   * @return vehicleID
  */
  @Size(min = 0, max = 36) 
  @Schema(name = "vehicleID", example = "123e4567-e89b-12d3-a456-426614174000", description = "車両ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleID")
  public String getVehicleID() {
    return vehicleID;
  }

  public void setVehicleID(String vehicleID) {
    this.vehicleID = vehicleID;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner operatorID(String operatorID) {
    this.operatorID = operatorID;
    return this;
  }

  /**
   * 事業者ID
   * @return operatorID
  */
  @Size(min = 0, max = 36) 
  @Schema(name = "operatorID", example = "123e4567-e89b-12d3-a456-426614174001", description = "事業者ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatorID")
  public String getOperatorID() {
    return operatorID;
  }

  public void setOperatorID(String operatorID) {
    this.operatorID = operatorID;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner incidentID(String incidentID) {
    this.incidentID = incidentID;
    return this;
  }

  /**
   * 事象特定ID
   * @return incidentID
  */
  @Size(min = 0, max = 36) 
  @Schema(name = "incidentID", example = "123e4567-e89b-12d3-a456-426614174002", description = "事象特定ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentID")
  public String getIncidentID() {
    return incidentID;
  }

  public void setIncidentID(String incidentID) {
    this.incidentID = incidentID;
  }

  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner incidents(DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents incidents) {
    this.incidents = incidents;
    return this;
  }

  /**
   * Get incidents
   * @return incidents
  */
  @Valid 
  @Schema(name = "incidents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidents")
  public DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents getIncidents() {
    return incidents;
  }

  public void setIncidents(DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInnerIncidents incidents) {
    this.incidents = incidents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner = (DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner) o;
    return Objects.equals(this.deliveryName, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.deliveryName) &&
        Objects.equals(this.dateTime, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.dateTime) &&
        Objects.equals(this.lat, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.lat) &&
        Objects.equals(this.lon, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.lon) &&
        Objects.equals(this.vehicleName, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.vehicleName) &&
        Objects.equals(this.vehicleID, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.vehicleID) &&
        Objects.equals(this.operatorID, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.operatorID) &&
        Objects.equals(this.incidentID, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.incidentID) &&
        Objects.equals(this.incidents, dataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner.incidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryName, dateTime, lat, lon, vehicleName, vehicleID, operatorID, incidentID, incidents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttributeDataInnerVehicleIncidentInfoInner {\n");
    sb.append("    deliveryName: ").append(toIndentedString(deliveryName)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    vehicleID: ").append(toIndentedString(vehicleID)).append("\n");
    sb.append("    operatorID: ").append(toIndentedString(operatorID)).append("\n");
    sb.append("    incidentID: ").append(toIndentedString(incidentID)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
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

