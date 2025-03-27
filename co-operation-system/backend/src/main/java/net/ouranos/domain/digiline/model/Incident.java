package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Incident
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-03T14:37:03.625639700+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class Incident {

  private String trspIncidentGs1Id;

  /**
   * Gets or Sets trspIncidentCategory
   */
  public enum TrspIncidentCategoryEnum {
    VEHICLE_CONTROL_INCIDENT("VEHICLE_CONTROL_INCIDENT"),
    
    OPERATIONAL_BASIC_INCIDENT("OPERATIONAL_BASIC_INCIDENT"),
    
    ACCIDENT("ACCIDENT"),
    
    WEATHER_INCIDENT("WEATHER_INCIDENT"),
    
    TRAFFIC_INCIDENT("TRAFFIC_INCIDENT");

    private String value;

    TrspIncidentCategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TrspIncidentCategoryEnum fromValue(String value) {
      for (TrspIncidentCategoryEnum b : TrspIncidentCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TrspIncidentCategoryEnum trspIncidentCategory;

  /**
   * Gets or Sets trspIncidentType
   */
  public enum TrspIncidentTypeEnum {
    ADK_ERROR("ADK_ERROR"),
    
    ECU_ERROR("ECU_ERROR"),
    
    DPD_ERROR("DPD_ERROR"),
    
    TRANSMISSION_ERROR("TRANSMISSION_ERROR"),
    
    STEERING_ERROR("STEERING_ERROR"),
    
    EBS_ERROR("EBS_ERROR"),
    
    AIR_SUSPENSION_ERROR("AIR_SUSPENSION_ERROR"),
    
    TIRE_PUNCTURE("TIRE_PUNCTURE"),
    
    VEHICLE_FIRE("VEHICLE_FIRE"),
    
    OIL_LEAKAGE("OIL_LEAKAGE"),
    
    VOLTAGE_ERROR("VOLTAGE_ERROR"),
    
    FUEL_SYSTEM_ERROR("FUEL_SYSTEM_ERROR"),
    
    COOLING_SYSTEM_ERROR("COOLING_SYSTEM_ERROR"),
    
    CARGO_COLLAPSE("CARGO_COLLAPSE"),
    
    AIRBAG_EXPLOSION("AIRBAG_EXPLOSION"),
    
    SNOW_DEPTH_EXCEEDED("SNOW_DEPTH_EXCEEDED"),
    
    WIND_SPEED_EXCEEDED("WIND_SPEED_EXCEEDED"),
    
    RAINFALL_EXCEEDED("RAINFALL_EXCEEDED"),
    
    SNOWFALL_EXCEEDED("SNOWFALL_EXCEEDED"),
    
    THICK_FOG("THICK_FOG"),
    
    FROZEN_ROAD_SURFACE("FROZEN_ROAD_SURFACE"),
    
    OTHER_VEHICLE_ACCIDENT("OTHER_VEHICLE_ACCIDENT"),
    
    OTHER_VEHICLE_STOPPED("OTHER_VEHICLE_STOPPED"),
    
    TRAFFIC_CONGESTION("TRAFFIC_CONGESTION"),
    
    VEHICLE_DRIVING_WRONG_WAY("VEHICLE_DRIVING_WRONG_WAY");

    private String value;

    TrspIncidentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TrspIncidentTypeEnum fromValue(String value) {
      for (TrspIncidentTypeEnum b : TrspIncidentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TrspIncidentTypeEnum trspIncidentType;

  public Incident trspIncidentGs1Id(String trspIncidentGs1Id) {
    this.trspIncidentGs1Id = trspIncidentGs1Id;
    return this;
  }

  /**
   * Get trspIncidentGs1Id
   * @return trspIncidentGs1Id
  */
  @Size(max = 30) 
  @Schema(name = "trsp_incident_gs1_id", example = "abc-def-ghi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_incident_gs1_id")
  public String getTrspIncidentGs1Id() {
    return trspIncidentGs1Id;
  }

  public void setTrspIncidentGs1Id(String trspIncidentGs1Id) {
    this.trspIncidentGs1Id = trspIncidentGs1Id;
  }

  public Incident trspIncidentCategory(TrspIncidentCategoryEnum trspIncidentCategory) {
    this.trspIncidentCategory = trspIncidentCategory;
    return this;
  }

  /**
   * Get trspIncidentCategory
   * @return trspIncidentCategory
  */
  
  @Schema(name = "trsp_incident_category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_incident_category")
  public TrspIncidentCategoryEnum getTrspIncidentCategory() {
    return trspIncidentCategory;
  }

  public void setTrspIncidentCategory(TrspIncidentCategoryEnum trspIncidentCategory) {
    this.trspIncidentCategory = trspIncidentCategory;
  }

  public Incident trspIncidentType(TrspIncidentTypeEnum trspIncidentType) {
    this.trspIncidentType = trspIncidentType;
    return this;
  }

  /**
   * Get trspIncidentType
   * @return trspIncidentType
  */
  
  @Schema(name = "trsp_incident_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_incident_type")
  public TrspIncidentTypeEnum getTrspIncidentType() {
    return trspIncidentType;
  }

  public void setTrspIncidentType(TrspIncidentTypeEnum trspIncidentType) {
    this.trspIncidentType = trspIncidentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incident incident = (Incident) o;
    return Objects.equals(this.trspIncidentGs1Id, incident.trspIncidentGs1Id) &&
        Objects.equals(this.trspIncidentCategory, incident.trspIncidentCategory) &&
        Objects.equals(this.trspIncidentType, incident.trspIncidentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspIncidentGs1Id, trspIncidentCategory, trspIncidentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Incident {\n");
    sb.append("    trspIncidentGs1Id: ").append(toIndentedString(trspIncidentGs1Id)).append("\n");
    sb.append("    trspIncidentCategory: ").append(toIndentedString(trspIncidentCategory)).append("\n");
    sb.append("    trspIncidentType: ").append(toIndentedString(trspIncidentType)).append("\n");
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

