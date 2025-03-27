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
 * データモデル要素
 */

@Schema(name = "dataModel_trsp_ability_line_item_attribute_road_carr", description = "データモデル要素")
@JsonTypeName("dataModel_trsp_ability_line_item_attribute_road_carr")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-13T16:38:12.592317500+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelTrspAbilityLineItemAttributeRoadCarr {

  private String trspCliPrtyHeadOffId;

  private String trspCliPrtyBrncOffId;

  public DataModelTrspAbilityLineItemAttributeRoadCarr trspCliPrtyHeadOffId(String trspCliPrtyHeadOffId) {
    this.trspCliPrtyHeadOffId = trspCliPrtyHeadOffId;
    return this;
  }

  /**
   * 運送事業者コード(本社)
   * @return trspCliPrtyHeadOffId
  */
  @Size(min = 1, max = 13) 
  @Schema(name = "trsp_cli_prty_head_off_id", description = "運送事業者コード(本社)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_cli_prty_head_off_id")
  public String getTrspCliPrtyHeadOffId() {
    return trspCliPrtyHeadOffId;
  }

  public void setTrspCliPrtyHeadOffId(String trspCliPrtyHeadOffId) {
    this.trspCliPrtyHeadOffId = trspCliPrtyHeadOffId;
  }

  public DataModelTrspAbilityLineItemAttributeRoadCarr trspCliPrtyBrncOffId(String trspCliPrtyBrncOffId) {
    this.trspCliPrtyBrncOffId = trspCliPrtyBrncOffId;
    return this;
  }

  /**
   * 運送事業者コード(事業所)
   * @return trspCliPrtyBrncOffId
  */
  @Size(min = 1, max = 17) 
  @Schema(name = "trsp_cli_prty_brnc_off_id", description = "運送事業者コード(事業所)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_cli_prty_brnc_off_id")
  public String getTrspCliPrtyBrncOffId() {
    return trspCliPrtyBrncOffId;
  }

  public void setTrspCliPrtyBrncOffId(String trspCliPrtyBrncOffId) {
    this.trspCliPrtyBrncOffId = trspCliPrtyBrncOffId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTrspAbilityLineItemAttributeRoadCarr dataModelTrspAbilityLineItemAttributeRoadCarr = (DataModelTrspAbilityLineItemAttributeRoadCarr) o;
    return Objects.equals(this.trspCliPrtyHeadOffId, dataModelTrspAbilityLineItemAttributeRoadCarr.trspCliPrtyHeadOffId) &&
        Objects.equals(this.trspCliPrtyBrncOffId, dataModelTrspAbilityLineItemAttributeRoadCarr.trspCliPrtyBrncOffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspCliPrtyHeadOffId, trspCliPrtyBrncOffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTrspAbilityLineItemAttributeRoadCarr {\n");
    sb.append("    trspCliPrtyHeadOffId: ").append(toIndentedString(trspCliPrtyHeadOffId)).append("\n");
    sb.append("    trspCliPrtyBrncOffId: ").append(toIndentedString(trspCliPrtyBrncOffId)).append("\n");
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

