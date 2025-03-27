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
 * Only if vehicle stop got succeeded after incident, vehicle stop information is included. Otherwise, value is null. 車両が異常発生後に無事停止した場合のみ、車両停止情報が含まれます。そうでない場合はnullです。 
 */

@Schema(name = "TrspSrvc_trsp_vehicle_stop", description = "Only if vehicle stop got succeeded after incident, vehicle stop information is included. Otherwise, value is null. 車両が異常発生後に無事停止した場合のみ、車両停止情報が含まれます。そうでない場合はnullです。 ")
@JsonTypeName("TrspSrvc_trsp_vehicle_stop")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrspSrvcTrspVehicleStop {

  private Boolean trspIsVehicleStopSucceeded;

  public TrspSrvcTrspVehicleStop trspIsVehicleStopSucceeded(Boolean trspIsVehicleStopSucceeded) {
    this.trspIsVehicleStopSucceeded = trspIsVehicleStopSucceeded;
    return this;
  }

  /**
   * Vehicle stop succeeded or not. 車両が異常発生後に無事停止したかどうかを示します。   
   * @return trspIsVehicleStopSucceeded
  */
  
  @Schema(name = "trsp_is_vehicle_stop_succeeded", description = "Vehicle stop succeeded or not. 車両が異常発生後に無事停止したかどうかを示します。   ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_is_vehicle_stop_succeeded")
  public Boolean getTrspIsVehicleStopSucceeded() {
    return trspIsVehicleStopSucceeded;
  }

  public void setTrspIsVehicleStopSucceeded(Boolean trspIsVehicleStopSucceeded) {
    this.trspIsVehicleStopSucceeded = trspIsVehicleStopSucceeded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrspSrvcTrspVehicleStop trspSrvcTrspVehicleStop = (TrspSrvcTrspVehicleStop) o;
    return Objects.equals(this.trspIsVehicleStopSucceeded, trspSrvcTrspVehicleStop.trspIsVehicleStopSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspIsVehicleStopSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrspSrvcTrspVehicleStop {\n");
    sb.append("    trspIsVehicleStopSucceeded: ").append(toIndentedString(trspIsVehicleStopSucceeded)).append("\n");
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

