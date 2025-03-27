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
 * TrackBySipAttributeShipFromPrty
 */

@JsonTypeName("TrackBySip_attribute_ship_from_prty")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrackBySipAttributeShipFromPrty {

  private String shipFromPrtyBrncOffId;

  public TrackBySipAttributeShipFromPrty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackBySipAttributeShipFromPrty(String shipFromPrtyBrncOffId) {
    this.shipFromPrtyBrncOffId = shipFromPrtyBrncOffId;
  }

  public TrackBySipAttributeShipFromPrty shipFromPrtyBrncOffId(String shipFromPrtyBrncOffId) {
    this.shipFromPrtyBrncOffId = shipFromPrtyBrncOffId;
    return this;
  }

  /**
   * Pickup branch office ID | 今回のPoCではIDのみサポートしています。
   * @return shipFromPrtyBrncOffId
  */
  @NotNull @Size(min = 1, max = 17) 
  @Schema(name = "ship_from_prty_brnc_off_id", example = "location_1", description = "Pickup branch office ID | 今回のPoCではIDのみサポートしています。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ship_from_prty_brnc_off_id")
  public String getShipFromPrtyBrncOffId() {
    return shipFromPrtyBrncOffId;
  }

  public void setShipFromPrtyBrncOffId(String shipFromPrtyBrncOffId) {
    this.shipFromPrtyBrncOffId = shipFromPrtyBrncOffId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackBySipAttributeShipFromPrty trackBySipAttributeShipFromPrty = (TrackBySipAttributeShipFromPrty) o;
    return Objects.equals(this.shipFromPrtyBrncOffId, trackBySipAttributeShipFromPrty.shipFromPrtyBrncOffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipFromPrtyBrncOffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackBySipAttributeShipFromPrty {\n");
    sb.append("    shipFromPrtyBrncOffId: ").append(toIndentedString(shipFromPrtyBrncOffId)).append("\n");
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

