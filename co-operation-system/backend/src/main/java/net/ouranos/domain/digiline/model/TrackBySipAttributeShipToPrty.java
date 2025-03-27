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
 * TrackBySipAttributeShipToPrty
 */

@JsonTypeName("TrackBySip_attribute_ship_to_prty")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrackBySipAttributeShipToPrty {

  private String shipToPrtyBrncOffId;

  public TrackBySipAttributeShipToPrty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackBySipAttributeShipToPrty(String shipToPrtyBrncOffId) {
    this.shipToPrtyBrncOffId = shipToPrtyBrncOffId;
  }

  public TrackBySipAttributeShipToPrty shipToPrtyBrncOffId(String shipToPrtyBrncOffId) {
    this.shipToPrtyBrncOffId = shipToPrtyBrncOffId;
    return this;
  }

  /**
   * Dropoff branch office ID | 今回のPoCではIDのみサポートしています。
   * @return shipToPrtyBrncOffId
  */
  @NotNull @Size(min = 1, max = 17) 
  @Schema(name = "ship_to_prty_brnc_off_id", example = "location_2", description = "Dropoff branch office ID | 今回のPoCではIDのみサポートしています。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ship_to_prty_brnc_off_id")
  public String getShipToPrtyBrncOffId() {
    return shipToPrtyBrncOffId;
  }

  public void setShipToPrtyBrncOffId(String shipToPrtyBrncOffId) {
    this.shipToPrtyBrncOffId = shipToPrtyBrncOffId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackBySipAttributeShipToPrty trackBySipAttributeShipToPrty = (TrackBySipAttributeShipToPrty) o;
    return Objects.equals(this.shipToPrtyBrncOffId, trackBySipAttributeShipToPrty.shipToPrtyBrncOffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipToPrtyBrncOffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackBySipAttributeShipToPrty {\n");
    sb.append("    shipToPrtyBrncOffId: ").append(toIndentedString(shipToPrtyBrncOffId)).append("\n");
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

