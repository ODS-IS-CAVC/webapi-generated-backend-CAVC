package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.TrspIsr;
import net.ouranos.domain.digiline.model.TrspSrvc;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VehicleIncidentInfoAttribute
 */

@JsonTypeName("VehicleIncidentInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T11:24:45.648210400+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class VehicleIncidentInfoAttribute {

  private TrspIsr trspIsr;

  private TrspSrvc trspSrvc;

  public VehicleIncidentInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleIncidentInfoAttribute(TrspIsr trspIsr, TrspSrvc trspSrvc) {
    this.trspIsr = trspIsr;
    this.trspSrvc = trspSrvc;
  }

  public VehicleIncidentInfoAttribute trspIsr(TrspIsr trspIsr) {
    this.trspIsr = trspIsr;
    return this;
  }

  /**
   * Get trspIsr
   * @return trspIsr
  */
  @NotNull @Valid 
  @Schema(name = "trsp_isr", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_isr")
  public TrspIsr getTrspIsr() {
    return trspIsr;
  }

  public void setTrspIsr(TrspIsr trspIsr) {
    this.trspIsr = trspIsr;
  }

  public VehicleIncidentInfoAttribute trspSrvc(TrspSrvc trspSrvc) {
    this.trspSrvc = trspSrvc;
    return this;
  }

  /**
   * Get trspSrvc
   * @return trspSrvc
  */
  @NotNull @Valid 
  @Schema(name = "trsp_srvc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_srvc")
  public TrspSrvc getTrspSrvc() {
    return trspSrvc;
  }

  public void setTrspSrvc(TrspSrvc trspSrvc) {
    this.trspSrvc = trspSrvc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleIncidentInfoAttribute vehicleIncidentInfoAttribute = (VehicleIncidentInfoAttribute) o;
    return Objects.equals(this.trspIsr, vehicleIncidentInfoAttribute.trspIsr) &&
        Objects.equals(this.trspSrvc, vehicleIncidentInfoAttribute.trspSrvc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspIsr, trspSrvc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleIncidentInfoAttribute {\n");
    sb.append("    trspIsr: ").append(toIndentedString(trspIsr)).append("\n");
    sb.append("    trspSrvc: ").append(toIndentedString(trspSrvc)).append("\n");
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

