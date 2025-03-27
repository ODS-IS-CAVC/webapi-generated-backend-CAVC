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
 * 運送事業者
 */

@Schema(name = "dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_road_carr", description = "運送事業者")
@JsonTypeName("dataModel_shipper_trans_capacity_attribute_trsp_ability_line_item_inner_road_carr")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr {

  private String trspCliPrtyHeadOffId;

  private String trspCliPrtyBrncOffId;

  private String trspCliPrtyNameTxt;

  private String roadCarrDepaSpedOrgId;

  private String roadCarrDepaSpedOrgNameTxt;

  private String trspCliTelCmmCmpNumTxt;

  private String roadCarrArrSpedOrgId;

  private String roadCarrArrSpedOrgNameTxt;

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr(String trspCliPrtyHeadOffId, String trspCliPrtyBrncOffId) {
    this.trspCliPrtyHeadOffId = trspCliPrtyHeadOffId;
    this.trspCliPrtyBrncOffId = trspCliPrtyBrncOffId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr trspCliPrtyHeadOffId(String trspCliPrtyHeadOffId) {
    this.trspCliPrtyHeadOffId = trspCliPrtyHeadOffId;
    return this;
  }

  /**
   * 運送事業者コード（本社）
   * @return trspCliPrtyHeadOffId
  */
  @NotNull 
  @Schema(name = "trsp_cli_prty_head_off_id", example = "1234567890123", description = "運送事業者コード（本社）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_cli_prty_head_off_id")
  public String getTrspCliPrtyHeadOffId() {
    return trspCliPrtyHeadOffId;
  }

  public void setTrspCliPrtyHeadOffId(String trspCliPrtyHeadOffId) {
    this.trspCliPrtyHeadOffId = trspCliPrtyHeadOffId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr trspCliPrtyBrncOffId(String trspCliPrtyBrncOffId) {
    this.trspCliPrtyBrncOffId = trspCliPrtyBrncOffId;
    return this;
  }

  /**
   * 運送事業者コード（事業所）
   * @return trspCliPrtyBrncOffId
  */
  @NotNull 
  @Schema(name = "trsp_cli_prty_brnc_off_id", example = "12345678901234567", description = "運送事業者コード（事業所）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_cli_prty_brnc_off_id")
  public String getTrspCliPrtyBrncOffId() {
    return trspCliPrtyBrncOffId;
  }

  public void setTrspCliPrtyBrncOffId(String trspCliPrtyBrncOffId) {
    this.trspCliPrtyBrncOffId = trspCliPrtyBrncOffId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr trspCliPrtyNameTxt(String trspCliPrtyNameTxt) {
    this.trspCliPrtyNameTxt = trspCliPrtyNameTxt;
    return this;
  }

  /**
   * 運送事業者名（漢字）
   * @return trspCliPrtyNameTxt
  */
  
  @Schema(name = "trsp_cli_prty_name_txt", description = "運送事業者名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_cli_prty_name_txt")
  public String getTrspCliPrtyNameTxt() {
    return trspCliPrtyNameTxt;
  }

  public void setTrspCliPrtyNameTxt(String trspCliPrtyNameTxt) {
    this.trspCliPrtyNameTxt = trspCliPrtyNameTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarrDepaSpedOrgId(String roadCarrDepaSpedOrgId) {
    this.roadCarrDepaSpedOrgId = roadCarrDepaSpedOrgId;
    return this;
  }

  /**
   * 運送事業者発店コード
   * @return roadCarrDepaSpedOrgId
  */
  
  @Schema(name = "road_carr_depa_sped_org_id", description = "運送事業者発店コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr_depa_sped_org_id")
  public String getRoadCarrDepaSpedOrgId() {
    return roadCarrDepaSpedOrgId;
  }

  public void setRoadCarrDepaSpedOrgId(String roadCarrDepaSpedOrgId) {
    this.roadCarrDepaSpedOrgId = roadCarrDepaSpedOrgId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarrDepaSpedOrgNameTxt(String roadCarrDepaSpedOrgNameTxt) {
    this.roadCarrDepaSpedOrgNameTxt = roadCarrDepaSpedOrgNameTxt;
    return this;
  }

  /**
   * 運送事業者発店名（漢字）
   * @return roadCarrDepaSpedOrgNameTxt
  */
  
  @Schema(name = "road_carr_depa_sped_org_name_txt", description = "運送事業者発店名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr_depa_sped_org_name_txt")
  public String getRoadCarrDepaSpedOrgNameTxt() {
    return roadCarrDepaSpedOrgNameTxt;
  }

  public void setRoadCarrDepaSpedOrgNameTxt(String roadCarrDepaSpedOrgNameTxt) {
    this.roadCarrDepaSpedOrgNameTxt = roadCarrDepaSpedOrgNameTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr trspCliTelCmmCmpNumTxt(String trspCliTelCmmCmpNumTxt) {
    this.trspCliTelCmmCmpNumTxt = trspCliTelCmmCmpNumTxt;
    return this;
  }

  /**
   * 運送事業者電話番号
   * @return trspCliTelCmmCmpNumTxt
  */
  
  @Schema(name = "trsp_cli_tel_cmm_cmp_num_txt", description = "運送事業者電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_cli_tel_cmm_cmp_num_txt")
  public String getTrspCliTelCmmCmpNumTxt() {
    return trspCliTelCmmCmpNumTxt;
  }

  public void setTrspCliTelCmmCmpNumTxt(String trspCliTelCmmCmpNumTxt) {
    this.trspCliTelCmmCmpNumTxt = trspCliTelCmmCmpNumTxt;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarrArrSpedOrgId(String roadCarrArrSpedOrgId) {
    this.roadCarrArrSpedOrgId = roadCarrArrSpedOrgId;
    return this;
  }

  /**
   * 運送事業者着店コード
   * @return roadCarrArrSpedOrgId
  */
  
  @Schema(name = "road_carr_arr_sped_org_id", description = "運送事業者着店コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr_arr_sped_org_id")
  public String getRoadCarrArrSpedOrgId() {
    return roadCarrArrSpedOrgId;
  }

  public void setRoadCarrArrSpedOrgId(String roadCarrArrSpedOrgId) {
    this.roadCarrArrSpedOrgId = roadCarrArrSpedOrgId;
  }

  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr roadCarrArrSpedOrgNameTxt(String roadCarrArrSpedOrgNameTxt) {
    this.roadCarrArrSpedOrgNameTxt = roadCarrArrSpedOrgNameTxt;
    return this;
  }

  /**
   * 運送事業者着店名（漢字）
   * @return roadCarrArrSpedOrgNameTxt
  */
  
  @Schema(name = "road_carr_arr_sped_org_name_txt", description = "運送事業者着店名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr_arr_sped_org_name_txt")
  public String getRoadCarrArrSpedOrgNameTxt() {
    return roadCarrArrSpedOrgNameTxt;
  }

  public void setRoadCarrArrSpedOrgNameTxt(String roadCarrArrSpedOrgNameTxt) {
    this.roadCarrArrSpedOrgNameTxt = roadCarrArrSpedOrgNameTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr = (DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr) o;
    return Objects.equals(this.trspCliPrtyHeadOffId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.trspCliPrtyHeadOffId) &&
        Objects.equals(this.trspCliPrtyBrncOffId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.trspCliPrtyBrncOffId) &&
        Objects.equals(this.trspCliPrtyNameTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.trspCliPrtyNameTxt) &&
        Objects.equals(this.roadCarrDepaSpedOrgId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.roadCarrDepaSpedOrgId) &&
        Objects.equals(this.roadCarrDepaSpedOrgNameTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.roadCarrDepaSpedOrgNameTxt) &&
        Objects.equals(this.trspCliTelCmmCmpNumTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.trspCliTelCmmCmpNumTxt) &&
        Objects.equals(this.roadCarrArrSpedOrgId, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.roadCarrArrSpedOrgId) &&
        Objects.equals(this.roadCarrArrSpedOrgNameTxt, dataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr.roadCarrArrSpedOrgNameTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspCliPrtyHeadOffId, trspCliPrtyBrncOffId, trspCliPrtyNameTxt, roadCarrDepaSpedOrgId, roadCarrDepaSpedOrgNameTxt, trspCliTelCmmCmpNumTxt, roadCarrArrSpedOrgId, roadCarrArrSpedOrgNameTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerRoadCarr {\n");
    sb.append("    trspCliPrtyHeadOffId: ").append(toIndentedString(trspCliPrtyHeadOffId)).append("\n");
    sb.append("    trspCliPrtyBrncOffId: ").append(toIndentedString(trspCliPrtyBrncOffId)).append("\n");
    sb.append("    trspCliPrtyNameTxt: ").append(toIndentedString(trspCliPrtyNameTxt)).append("\n");
    sb.append("    roadCarrDepaSpedOrgId: ").append(toIndentedString(roadCarrDepaSpedOrgId)).append("\n");
    sb.append("    roadCarrDepaSpedOrgNameTxt: ").append(toIndentedString(roadCarrDepaSpedOrgNameTxt)).append("\n");
    sb.append("    trspCliTelCmmCmpNumTxt: ").append(toIndentedString(trspCliTelCmmCmpNumTxt)).append("\n");
    sb.append("    roadCarrArrSpedOrgId: ").append(toIndentedString(roadCarrArrSpedOrgId)).append("\n");
    sb.append("    roadCarrArrSpedOrgNameTxt: ").append(toIndentedString(roadCarrArrSpedOrgNameTxt)).append("\n");
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

