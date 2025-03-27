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
 * 運賃請求先
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_fret_clim_to_prty", description = "運賃請求先")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_fret_clim_to_prty")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty {

  private String fretClimToPrtyHeadOffId;

  private String fretClimToPrtyBrncOffId;

  private String fretClimToPrtyNameTxt;

  private String fretClimToSctSpedOrgId;

  private String fretClimToSctSpedOrgNameTxt;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToPrtyHeadOffId(String fretClimToPrtyHeadOffId) {
    this.fretClimToPrtyHeadOffId = fretClimToPrtyHeadOffId;
    return this;
  }

  /**
   * 運賃請求先コード（本社）
   * @return fretClimToPrtyHeadOffId
  */
  
  @Schema(name = "fret_clim_to_prty_head_off_id", description = "運賃請求先コード（本社）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fret_clim_to_prty_head_off_id")
  public String getFretClimToPrtyHeadOffId() {
    return fretClimToPrtyHeadOffId;
  }

  public void setFretClimToPrtyHeadOffId(String fretClimToPrtyHeadOffId) {
    this.fretClimToPrtyHeadOffId = fretClimToPrtyHeadOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToPrtyBrncOffId(String fretClimToPrtyBrncOffId) {
    this.fretClimToPrtyBrncOffId = fretClimToPrtyBrncOffId;
    return this;
  }

  /**
   * 運賃請求先コード（事業所）
   * @return fretClimToPrtyBrncOffId
  */
  
  @Schema(name = "fret_clim_to_prty_brnc_off_id", description = "運賃請求先コード（事業所）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fret_clim_to_prty_brnc_off_id")
  public String getFretClimToPrtyBrncOffId() {
    return fretClimToPrtyBrncOffId;
  }

  public void setFretClimToPrtyBrncOffId(String fretClimToPrtyBrncOffId) {
    this.fretClimToPrtyBrncOffId = fretClimToPrtyBrncOffId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToPrtyNameTxt(String fretClimToPrtyNameTxt) {
    this.fretClimToPrtyNameTxt = fretClimToPrtyNameTxt;
    return this;
  }

  /**
   * 運賃請求先名（漢字）
   * @return fretClimToPrtyNameTxt
  */
  
  @Schema(name = "fret_clim_to_prty_name_txt", description = "運賃請求先名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fret_clim_to_prty_name_txt")
  public String getFretClimToPrtyNameTxt() {
    return fretClimToPrtyNameTxt;
  }

  public void setFretClimToPrtyNameTxt(String fretClimToPrtyNameTxt) {
    this.fretClimToPrtyNameTxt = fretClimToPrtyNameTxt;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToSctSpedOrgId(String fretClimToSctSpedOrgId) {
    this.fretClimToSctSpedOrgId = fretClimToSctSpedOrgId;
    return this;
  }

  /**
   * 運賃請求先部門コード
   * @return fretClimToSctSpedOrgId
  */
  
  @Schema(name = "fret_clim_to_sct_sped_org_id", description = "運賃請求先部門コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fret_clim_to_sct_sped_org_id")
  public String getFretClimToSctSpedOrgId() {
    return fretClimToSctSpedOrgId;
  }

  public void setFretClimToSctSpedOrgId(String fretClimToSctSpedOrgId) {
    this.fretClimToSctSpedOrgId = fretClimToSctSpedOrgId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToSctSpedOrgNameTxt(String fretClimToSctSpedOrgNameTxt) {
    this.fretClimToSctSpedOrgNameTxt = fretClimToSctSpedOrgNameTxt;
    return this;
  }

  /**
   * 運賃請求先部門名（漢字）
   * @return fretClimToSctSpedOrgNameTxt
  */
  
  @Schema(name = "fret_clim_to_sct_sped_org_name_txt", description = "運賃請求先部門名（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fret_clim_to_sct_sped_org_name_txt")
  public String getFretClimToSctSpedOrgNameTxt() {
    return fretClimToSctSpedOrgNameTxt;
  }

  public void setFretClimToSctSpedOrgNameTxt(String fretClimToSctSpedOrgNameTxt) {
    this.fretClimToSctSpedOrgNameTxt = fretClimToSctSpedOrgNameTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty) o;
    return Objects.equals(this.fretClimToPrtyHeadOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty.fretClimToPrtyHeadOffId) &&
        Objects.equals(this.fretClimToPrtyBrncOffId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty.fretClimToPrtyBrncOffId) &&
        Objects.equals(this.fretClimToPrtyNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty.fretClimToPrtyNameTxt) &&
        Objects.equals(this.fretClimToSctSpedOrgId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty.fretClimToSctSpedOrgId) &&
        Objects.equals(this.fretClimToSctSpedOrgNameTxt, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty.fretClimToSctSpedOrgNameTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fretClimToPrtyHeadOffId, fretClimToPrtyBrncOffId, fretClimToPrtyNameTxt, fretClimToSctSpedOrgId, fretClimToSctSpedOrgNameTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty {\n");
    sb.append("    fretClimToPrtyHeadOffId: ").append(toIndentedString(fretClimToPrtyHeadOffId)).append("\n");
    sb.append("    fretClimToPrtyBrncOffId: ").append(toIndentedString(fretClimToPrtyBrncOffId)).append("\n");
    sb.append("    fretClimToPrtyNameTxt: ").append(toIndentedString(fretClimToPrtyNameTxt)).append("\n");
    sb.append("    fretClimToSctSpedOrgId: ").append(toIndentedString(fretClimToSctSpedOrgId)).append("\n");
    sb.append("    fretClimToSctSpedOrgNameTxt: ").append(toIndentedString(fretClimToSctSpedOrgNameTxt)).append("\n");
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

