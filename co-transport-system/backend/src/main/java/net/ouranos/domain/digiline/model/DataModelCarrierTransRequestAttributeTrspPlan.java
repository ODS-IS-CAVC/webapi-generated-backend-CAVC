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
 * 運送計画
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan", description = "運送計画")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlan {

  private String trspPlanStasCd;

  public DataModelCarrierTransRequestAttributeTrspPlan trspPlanStasCd(String trspPlanStasCd) {
    this.trspPlanStasCd = trspPlanStasCd;
    return this;
  }

  /**
   * 運送計画種別コード
   * @return trspPlanStasCd
  */
  
  @Schema(name = "trsp_plan_stas_cd", description = "運送計画種別コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_plan_stas_cd")
  public String getTrspPlanStasCd() {
    return trspPlanStasCd;
  }

  public void setTrspPlanStasCd(String trspPlanStasCd) {
    this.trspPlanStasCd = trspPlanStasCd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlan dataModelCarrierTransRequestAttributeTrspPlan = (DataModelCarrierTransRequestAttributeTrspPlan) o;
    return Objects.equals(this.trspPlanStasCd, dataModelCarrierTransRequestAttributeTrspPlan.trspPlanStasCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspPlanStasCd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlan {\n");
    sb.append("    trspPlanStasCd: ").append(toIndentedString(trspPlanStasCd)).append("\n");
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

