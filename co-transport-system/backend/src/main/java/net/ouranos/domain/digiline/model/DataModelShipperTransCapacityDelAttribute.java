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
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelShipperTransCapacityDelAttribute
 */

@JsonTypeName("dataModel_shipper_trans_capacity_del_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-05T15:59:46.120178100+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelShipperTransCapacityDelAttribute {

  private DataModelShipperTransCapacityAttributeMsgInfo msgInfo;

  @Valid
  private List<@Valid DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner> trspAbilityLineItem = new ArrayList<>();

  public DataModelShipperTransCapacityDelAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelShipperTransCapacityDelAttribute(DataModelShipperTransCapacityAttributeMsgInfo msgInfo, List<@Valid DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner> trspAbilityLineItem) {
    this.msgInfo = msgInfo;
    this.trspAbilityLineItem = trspAbilityLineItem;
  }

  public DataModelShipperTransCapacityDelAttribute msgInfo(DataModelShipperTransCapacityAttributeMsgInfo msgInfo) {
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

  public DataModelShipperTransCapacityDelAttribute trspAbilityLineItem(List<@Valid DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner> trspAbilityLineItem) {
    this.trspAbilityLineItem = trspAbilityLineItem;
    return this;
  }

  public DataModelShipperTransCapacityDelAttribute addTrspAbilityLineItemItem(DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner trspAbilityLineItemItem) {
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
  public List<@Valid DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner> getTrspAbilityLineItem() {
    return trspAbilityLineItem;
  }

  public void setTrspAbilityLineItem(List<@Valid DataModelShipperTransCapacityDelAttributeTrspAbilityLineItemInner> trspAbilityLineItem) {
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
    DataModelShipperTransCapacityDelAttribute dataModelShipperTransCapacityDelAttribute = (DataModelShipperTransCapacityDelAttribute) o;
    return Objects.equals(this.msgInfo, dataModelShipperTransCapacityDelAttribute.msgInfo) &&
        Objects.equals(this.trspAbilityLineItem, dataModelShipperTransCapacityDelAttribute.trspAbilityLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgInfo, trspAbilityLineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelShipperTransCapacityDelAttribute {\n");
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

