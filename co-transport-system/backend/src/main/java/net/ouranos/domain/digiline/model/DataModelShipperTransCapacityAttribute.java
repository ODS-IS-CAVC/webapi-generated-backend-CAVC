package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeMsgInfo;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelShipperTransCapacityAttribute
 */

@JsonTypeName("dataModel_shipper_trans_capacity_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityAttribute {

  private DataModelShipperTransCapacityAttributeMsgInfo msgInfo;

  @Valid
  private List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner> trspAbilityLineItem = new ArrayList<>();

  public DataModelShipperTransCapacityAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelShipperTransCapacityAttribute(DataModelShipperTransCapacityAttributeMsgInfo msgInfo, List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner> trspAbilityLineItem) {
    this.msgInfo = msgInfo;
    this.trspAbilityLineItem = trspAbilityLineItem;
  }

  public DataModelShipperTransCapacityAttribute msgInfo(DataModelShipperTransCapacityAttributeMsgInfo msgInfo) {
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
  public DataModelShipperTransCapacityAttributeMsgInfo getMsgInfo() {
    return msgInfo;
  }

  public void setMsgInfo(DataModelShipperTransCapacityAttributeMsgInfo msgInfo) {
    this.msgInfo = msgInfo;
  }

  public DataModelShipperTransCapacityAttribute trspAbilityLineItem(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner> trspAbilityLineItem) {
    this.trspAbilityLineItem = trspAbilityLineItem;
    return this;
  }

  public DataModelShipperTransCapacityAttribute addTrspAbilityLineItemItem(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner trspAbilityLineItemItem) {
    if (this.trspAbilityLineItem == null) {
      this.trspAbilityLineItem = new ArrayList<>();
    }
    this.trspAbilityLineItem.add(trspAbilityLineItemItem);
    return this;
  }

  /**
   * 運送能力明細
   * @return trspAbilityLineItem
  */
  @NotNull @Valid 
  @Schema(name = "trsp_ability_line_item", description = "運送能力明細", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_ability_line_item")
  public List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner> getTrspAbilityLineItem() {
    return trspAbilityLineItem;
  }

  public void setTrspAbilityLineItem(List<@Valid DataModelShipperTransCapacityAttributeTrspAbilityLineItemInner> trspAbilityLineItem) {
    this.trspAbilityLineItem = trspAbilityLineItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelShipperTransCapacityAttribute dataModelShipperTransCapacityAttribute = (DataModelShipperTransCapacityAttribute) o;
    return Objects.equals(this.msgInfo, dataModelShipperTransCapacityAttribute.msgInfo) &&
        Objects.equals(this.trspAbilityLineItem, dataModelShipperTransCapacityAttribute.trspAbilityLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgInfo, trspAbilityLineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityAttribute {\n");
    sb.append("    msgInfo: ").append(toIndentedString(msgInfo)).append("\n");
    sb.append("    trspAbilityLineItem: ").append(toIndentedString(trspAbilityLineItem)).append("\n");
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

