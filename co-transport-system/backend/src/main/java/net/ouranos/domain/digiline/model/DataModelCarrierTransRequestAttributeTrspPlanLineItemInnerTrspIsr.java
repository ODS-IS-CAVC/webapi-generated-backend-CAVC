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
 * 運送依頼
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_isr", description = "運送依頼")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_trsp_isr")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr {

  private String trspInstructionId;

  private String trspInstructionDateSubmDttm;

  private String invNumId;

  private String cmnInvNumId;

  private String mixLoadNumId;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr(String trspInstructionId) {
    this.trspInstructionId = trspInstructionId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr trspInstructionId(String trspInstructionId) {
    this.trspInstructionId = trspInstructionId;
    return this;
  }

  /**
   * 運送依頼番号
   * @return trspInstructionId
  */
  @NotNull 
  @Schema(name = "trsp_instruction_id", example = "12345678901234567890", description = "運送依頼番号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_instruction_id")
  public String getTrspInstructionId() {
    return trspInstructionId;
  }

  public void setTrspInstructionId(String trspInstructionId) {
    this.trspInstructionId = trspInstructionId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr trspInstructionDateSubmDttm(String trspInstructionDateSubmDttm) {
    this.trspInstructionDateSubmDttm = trspInstructionDateSubmDttm;
    return this;
  }

  /**
   * 運送依頼年月日
   * @return trspInstructionDateSubmDttm
  */
  
  @Schema(name = "trsp_instruction_date_subm_dttm", description = "運送依頼年月日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_instruction_date_subm_dttm")
  public String getTrspInstructionDateSubmDttm() {
    return trspInstructionDateSubmDttm;
  }

  public void setTrspInstructionDateSubmDttm(String trspInstructionDateSubmDttm) {
    this.trspInstructionDateSubmDttm = trspInstructionDateSubmDttm;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr invNumId(String invNumId) {
    this.invNumId = invNumId;
    return this;
  }

  /**
   * 運送送り状番号
   * @return invNumId
  */
  
  @Schema(name = "inv_num_id", description = "運送送り状番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inv_num_id")
  public String getInvNumId() {
    return invNumId;
  }

  public void setInvNumId(String invNumId) {
    this.invNumId = invNumId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr cmnInvNumId(String cmnInvNumId) {
    this.cmnInvNumId = cmnInvNumId;
    return this;
  }

  /**
   * 共用送り状番号
   * @return cmnInvNumId
  */
  
  @Schema(name = "cmn_inv_num_id", description = "共用送り状番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmn_inv_num_id")
  public String getCmnInvNumId() {
    return cmnInvNumId;
  }

  public void setCmnInvNumId(String cmnInvNumId) {
    this.cmnInvNumId = cmnInvNumId;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr mixLoadNumId(String mixLoadNumId) {
    this.mixLoadNumId = mixLoadNumId;
    return this;
  }

  /**
   * 積合せ番号
   * @return mixLoadNumId
  */
  
  @Schema(name = "mix_load_num_id", description = "積合せ番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mix_load_num_id")
  public String getMixLoadNumId() {
    return mixLoadNumId;
  }

  public void setMixLoadNumId(String mixLoadNumId) {
    this.mixLoadNumId = mixLoadNumId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr) o;
    return Objects.equals(this.trspInstructionId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr.trspInstructionId) &&
        Objects.equals(this.trspInstructionDateSubmDttm, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr.trspInstructionDateSubmDttm) &&
        Objects.equals(this.invNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr.invNumId) &&
        Objects.equals(this.cmnInvNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr.cmnInvNumId) &&
        Objects.equals(this.mixLoadNumId, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr.mixLoadNumId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspInstructionId, trspInstructionDateSubmDttm, invNumId, cmnInvNumId, mixLoadNumId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr {\n");
    sb.append("    trspInstructionId: ").append(toIndentedString(trspInstructionId)).append("\n");
    sb.append("    trspInstructionDateSubmDttm: ").append(toIndentedString(trspInstructionDateSubmDttm)).append("\n");
    sb.append("    invNumId: ").append(toIndentedString(invNumId)).append("\n");
    sb.append("    cmnInvNumId: ").append(toIndentedString(cmnInvNumId)).append("\n");
    sb.append("    mixLoadNumId: ").append(toIndentedString(mixLoadNumId)).append("\n");
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

