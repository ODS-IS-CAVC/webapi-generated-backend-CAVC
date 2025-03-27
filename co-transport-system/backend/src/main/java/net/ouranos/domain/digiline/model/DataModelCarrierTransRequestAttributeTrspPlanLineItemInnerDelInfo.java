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
 * 納品情報
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_del_info", description = "納品情報")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_del_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo {

  private String delNoteId;

  private String shpmNumId;

  private String rcedOrdNumId;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo delNoteId(String delNoteId) {
    this.delNoteId = delNoteId;
    return this;
  }

  /**
   * 納品番号
   * @return delNoteId
  */
  
  @Schema(name = "del_note_id", description = "納品番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("del_note_id")
  public String getDelNoteId() {
    return delNoteId;
  }

  public void setDelNoteId(String delNoteId) {
    this.delNoteId = delNoteId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo shpmNumId(String shpmNumId) {
    this.shpmNumId = shpmNumId;
    return this;
  }

  /**
   * 出荷番号
   * @return shpmNumId
  */
  
  @Schema(name = "shpm_num_id", description = "出荷番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shpm_num_id")
  public String getShpmNumId() {
    return shpmNumId;
  }

  public void setShpmNumId(String shpmNumId) {
    this.shpmNumId = shpmNumId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo rcedOrdNumId(String rcedOrdNumId) {
    this.rcedOrdNumId = rcedOrdNumId;
    return this;
  }

  /**
   * 受注番号
   * @return rcedOrdNumId
  */
  
  @Schema(name = "rced_ord_num_id", description = "受注番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rced_ord_num_id")
  public String getRcedOrdNumId() {
    return rcedOrdNumId;
  }

  public void setRcedOrdNumId(String rcedOrdNumId) {
    this.rcedOrdNumId = rcedOrdNumId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo) o;
    return Objects.equals(this.delNoteId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo.delNoteId) &&
        Objects.equals(this.shpmNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo.shpmNumId) &&
        Objects.equals(this.rcedOrdNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo.rcedOrdNumId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delNoteId, shpmNumId, rcedOrdNumId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo {\n");
    sb.append("    delNoteId: ").append(toIndentedString(delNoteId)).append("\n");
    sb.append("    shpmNumId: ").append(toIndentedString(shpmNumId)).append("\n");
    sb.append("    rcedOrdNumId: ").append(toIndentedString(rcedOrdNumId)).append("\n");
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

