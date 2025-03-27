package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.Incident;
import net.ouranos.domain.digiline.model.TrspLocation;
import net.ouranos.domain.digiline.model.TrspSrvcTrspDelay;
import net.ouranos.domain.digiline.model.TrspSrvcTrspVehicleStop;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Transport service. Including incident information.
 */

@Schema(name = "TrspSrvc", description = "Transport service. Including incident information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrspSrvc {

  /**
   * Transport normal abnormal class service requirement code. 1: Normal, 2: Abnormal
   */
  public enum TrspNormalAbnmClsSrvcRqrmCdEnum {
    _1("1"),
    
    _2("2");

    private String value;

    TrspNormalAbnmClsSrvcRqrmCdEnum(String value) {
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
    public static TrspNormalAbnmClsSrvcRqrmCdEnum fromValue(String value) {
      for (TrspNormalAbnmClsSrvcRqrmCdEnum b : TrspNormalAbnmClsSrvcRqrmCdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TrspNormalAbnmClsSrvcRqrmCdEnum trspNormalAbnmClsSrvcRqrmCd;

  @Valid
  private List<@Valid Incident> trspIncidents = new ArrayList<>();

  private TrspSrvcTrspDelay trspDelay;

  private TrspSrvcTrspVehicleStop trspVehicleStop;

  private String trspNormalAbnmDate;

  private String trspNormalAbnmTime;

  private TrspLocation trspLocation;

  public TrspSrvc trspNormalAbnmClsSrvcRqrmCd(TrspNormalAbnmClsSrvcRqrmCdEnum trspNormalAbnmClsSrvcRqrmCd) {
    this.trspNormalAbnmClsSrvcRqrmCd = trspNormalAbnmClsSrvcRqrmCd;
    return this;
  }

  /**
   * Transport normal abnormal class service requirement code. 1: Normal, 2: Abnormal
   * @return trspNormalAbnmClsSrvcRqrmCd
  */
  
  @Schema(name = "trsp_normal_abnm_cls_srvc_rqrm_cd", description = "Transport normal abnormal class service requirement code. 1: Normal, 2: Abnormal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_normal_abnm_cls_srvc_rqrm_cd")
  public TrspNormalAbnmClsSrvcRqrmCdEnum getTrspNormalAbnmClsSrvcRqrmCd() {
    return trspNormalAbnmClsSrvcRqrmCd;
  }

  public void setTrspNormalAbnmClsSrvcRqrmCd(TrspNormalAbnmClsSrvcRqrmCdEnum trspNormalAbnmClsSrvcRqrmCd) {
    this.trspNormalAbnmClsSrvcRqrmCd = trspNormalAbnmClsSrvcRqrmCd;
  }

  public TrspSrvc trspIncidents(List<@Valid Incident> trspIncidents) {
    this.trspIncidents = trspIncidents;
    return this;
  }

  public TrspSrvc addTrspIncidentsItem(Incident trspIncidentsItem) {
    if (this.trspIncidents == null) {
      this.trspIncidents = new ArrayList<>();
    }
    this.trspIncidents.add(trspIncidentsItem);
    return this;
  }

  /**
   * Incident information included only if abnormal. Otherwise empty.
   * @return trspIncidents
  */
  @Valid 
  @Schema(name = "trsp_incidents", description = "Incident information included only if abnormal. Otherwise empty.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_incidents")
  public List<@Valid Incident> getTrspIncidents() {
    return trspIncidents;
  }

  public void setTrspIncidents(List<@Valid Incident> trspIncidents) {
    this.trspIncidents = trspIncidents;
  }

  public TrspSrvc trspDelay(TrspSrvcTrspDelay trspDelay) {
    this.trspDelay = trspDelay;
    return this;
  }

  /**
   * Get trspDelay
   * @return trspDelay
  */
  @Valid 
  @Schema(name = "trsp_delay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_delay")
  public TrspSrvcTrspDelay getTrspDelay() {
    return trspDelay;
  }

  public void setTrspDelay(TrspSrvcTrspDelay trspDelay) {
    this.trspDelay = trspDelay;
  }

  public TrspSrvc trspVehicleStop(TrspSrvcTrspVehicleStop trspVehicleStop) {
    this.trspVehicleStop = trspVehicleStop;
    return this;
  }

  /**
   * Get trspVehicleStop
   * @return trspVehicleStop
  */
  @Valid 
  @Schema(name = "trsp_vehicle_stop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_vehicle_stop")
  public TrspSrvcTrspVehicleStop getTrspVehicleStop() {
    return trspVehicleStop;
  }

  public void setTrspVehicleStop(TrspSrvcTrspVehicleStop trspVehicleStop) {
    this.trspVehicleStop = trspVehicleStop;
  }

  public TrspSrvc trspNormalAbnmDate(String trspNormalAbnmDate) {
    this.trspNormalAbnmDate = trspNormalAbnmDate;
    return this;
  }

  /**
   * Transport normal abnormal date. JST. Format yyyyMMdd.
   * @return trspNormalAbnmDate
  */
  @Pattern(regexp = "^\\d{8}$") 
  @Schema(name = "trsp_normal_abnm_date", example = "20241113", description = "Transport normal abnormal date. JST. Format yyyyMMdd.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_normal_abnm_date")
  public String getTrspNormalAbnmDate() {
    return trspNormalAbnmDate;
  }

  public void setTrspNormalAbnmDate(String trspNormalAbnmDate) {
    this.trspNormalAbnmDate = trspNormalAbnmDate;
  }

  public TrspSrvc trspNormalAbnmTime(String trspNormalAbnmTime) {
    this.trspNormalAbnmTime = trspNormalAbnmTime;
    return this;
  }

  /**
   * Transport normal abnormal time. JST. 24-hour notation. HHmm.
   * @return trspNormalAbnmTime
  */
  @Pattern(regexp = "^\\d{4}$") 
  @Schema(name = "trsp_normal_abnm_time", example = "1356", description = "Transport normal abnormal time. JST. 24-hour notation. HHmm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_normal_abnm_time")
  public String getTrspNormalAbnmTime() {
    return trspNormalAbnmTime;
  }

  public void setTrspNormalAbnmTime(String trspNormalAbnmTime) {
    this.trspNormalAbnmTime = trspNormalAbnmTime;
  }

  public TrspSrvc trspLocation(TrspLocation trspLocation) {
    this.trspLocation = trspLocation;
    return this;
  }

  /**
   * Get trspLocation
   * @return trspLocation
  */
  @Valid 
  @Schema(name = "trsp_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_location")
  public TrspLocation getTrspLocation() {
    return trspLocation;
  }

  public void setTrspLocation(TrspLocation trspLocation) {
    this.trspLocation = trspLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrspSrvc trspSrvc = (TrspSrvc) o;
    return Objects.equals(this.trspNormalAbnmClsSrvcRqrmCd, trspSrvc.trspNormalAbnmClsSrvcRqrmCd) &&
        Objects.equals(this.trspIncidents, trspSrvc.trspIncidents) &&
        Objects.equals(this.trspDelay, trspSrvc.trspDelay) &&
        Objects.equals(this.trspVehicleStop, trspSrvc.trspVehicleStop) &&
        Objects.equals(this.trspNormalAbnmDate, trspSrvc.trspNormalAbnmDate) &&
        Objects.equals(this.trspNormalAbnmTime, trspSrvc.trspNormalAbnmTime) &&
        Objects.equals(this.trspLocation, trspSrvc.trspLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspNormalAbnmClsSrvcRqrmCd, trspIncidents, trspDelay, trspVehicleStop, trspNormalAbnmDate, trspNormalAbnmTime, trspLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrspSrvc {\n");
    sb.append("    trspNormalAbnmClsSrvcRqrmCd: ").append(toIndentedString(trspNormalAbnmClsSrvcRqrmCd)).append("\n");
    sb.append("    trspIncidents: ").append(toIndentedString(trspIncidents)).append("\n");
    sb.append("    trspDelay: ").append(toIndentedString(trspDelay)).append("\n");
    sb.append("    trspVehicleStop: ").append(toIndentedString(trspVehicleStop)).append("\n");
    sb.append("    trspNormalAbnmDate: ").append(toIndentedString(trspNormalAbnmDate)).append("\n");
    sb.append("    trspNormalAbnmTime: ").append(toIndentedString(trspNormalAbnmTime)).append("\n");
    sb.append("    trspLocation: ").append(toIndentedString(trspLocation)).append("\n");
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

