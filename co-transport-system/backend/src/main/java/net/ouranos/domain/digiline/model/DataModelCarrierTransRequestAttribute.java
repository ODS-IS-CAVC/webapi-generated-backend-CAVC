package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeMsgInfo;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlan;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelCarrierTransRequestAttribute
 */

@JsonTypeName("dataModel_carrier_trans_request_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttribute {

  private DataModelCarrierTransRequestAttributeMsgInfo msgInfo;

  private DataModelCarrierTransRequestAttributeTrspPlan trspPlan;

  @Valid
  private List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInner> trspPlanLineItem = new ArrayList<>();

  public DataModelCarrierTransRequestAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelCarrierTransRequestAttribute(DataModelCarrierTransRequestAttributeMsgInfo msgInfo, DataModelCarrierTransRequestAttributeTrspPlan trspPlan, List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInner> trspPlanLineItem) {
    this.msgInfo = msgInfo;
    this.trspPlan = trspPlan;
    this.trspPlanLineItem = trspPlanLineItem;
  }

  public DataModelCarrierTransRequestAttribute msgInfo(DataModelCarrierTransRequestAttributeMsgInfo msgInfo) {
    this.msgInfo = msgInfo;
    return this;
  }

  /**
   * Get msgInfo
   * @return msgInfo
  */
  @NotNull @Valid 
  @Schema(name = "msg_info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("msg_info")
  public DataModelCarrierTransRequestAttributeMsgInfo getMsgInfo() {
    return msgInfo;
  }

  public void setMsgInfo(DataModelCarrierTransRequestAttributeMsgInfo msgInfo) {
    this.msgInfo = msgInfo;
  }

  public DataModelCarrierTransRequestAttribute trspPlan(DataModelCarrierTransRequestAttributeTrspPlan trspPlan) {
    this.trspPlan = trspPlan;
    return this;
  }

  /**
   * Get trspPlan
   * @return trspPlan
  */
  @NotNull @Valid 
  @Schema(name = "trsp_plan", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_plan")
  public DataModelCarrierTransRequestAttributeTrspPlan getTrspPlan() {
    return trspPlan;
  }

  public void setTrspPlan(DataModelCarrierTransRequestAttributeTrspPlan trspPlan) {
    this.trspPlan = trspPlan;
  }

  public DataModelCarrierTransRequestAttribute trspPlanLineItem(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInner> trspPlanLineItem) {
    this.trspPlanLineItem = trspPlanLineItem;
    return this;
  }

  public DataModelCarrierTransRequestAttribute addTrspPlanLineItemItem(DataModelCarrierTransRequestAttributeTrspPlanLineItemInner trspPlanLineItemItem) {
    if (this.trspPlanLineItem == null) {
      this.trspPlanLineItem = new ArrayList<>();
    }
    this.trspPlanLineItem.add(trspPlanLineItemItem);
    return this;
  }

  /**
   * 運送計画明細
   * @return trspPlanLineItem
  */
  @NotNull @Valid 
  @Schema(name = "trsp_plan_line_item", description = "運送計画明細", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_plan_line_item")
  public List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInner> getTrspPlanLineItem() {
    return trspPlanLineItem;
  }

  public void setTrspPlanLineItem(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInner> trspPlanLineItem) {
    this.trspPlanLineItem = trspPlanLineItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttribute dataModelCarrierTransRequestAttribute = (DataModelCarrierTransRequestAttribute) o;
    return Objects.equals(this.msgInfo, dataModelCarrierTransRequestAttribute.msgInfo) &&
        Objects.equals(this.trspPlan, dataModelCarrierTransRequestAttribute.trspPlan) &&
        Objects.equals(this.trspPlanLineItem, dataModelCarrierTransRequestAttribute.trspPlanLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgInfo, trspPlan, trspPlanLineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttribute {\n");
    sb.append("    msgInfo: ").append(toIndentedString(msgInfo)).append("\n");
    sb.append("    trspPlan: ").append(toIndentedString(trspPlan)).append("\n");
    sb.append("    trspPlanLineItem: ").append(toIndentedString(trspPlanLineItem)).append("\n");
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

