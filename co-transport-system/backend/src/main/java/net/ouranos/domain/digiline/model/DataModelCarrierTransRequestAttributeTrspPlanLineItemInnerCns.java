package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 委託貨物
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cns", description = "委託貨物")
@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner_cns")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns {

  private BigDecimal istdTotlPcksQuan;

  private String numUntCd;

  private BigDecimal istdTotlWeigMeas;

  private String weigUntCd;

  private BigDecimal istdTotlVolMeas;

  private String volUntCd;

  private BigDecimal istdTotlUntlQuan;

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns(BigDecimal istdTotlPcksQuan) {
    this.istdTotlPcksQuan = istdTotlPcksQuan;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns istdTotlPcksQuan(BigDecimal istdTotlPcksQuan) {
    this.istdTotlPcksQuan = istdTotlPcksQuan;
    return this;
  }

  /**
   * 運送梱包総個数（依頼）
   * @return istdTotlPcksQuan
  */
  @NotNull @Valid 
  @Schema(name = "istd_totl_pcks_quan", example = "10", description = "運送梱包総個数（依頼）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("istd_totl_pcks_quan")
  public BigDecimal getIstdTotlPcksQuan() {
    return istdTotlPcksQuan;
  }

  public void setIstdTotlPcksQuan(BigDecimal istdTotlPcksQuan) {
    this.istdTotlPcksQuan = istdTotlPcksQuan;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns numUntCd(String numUntCd) {
    this.numUntCd = numUntCd;
    return this;
  }

  /**
   * 個数単位コード
   * @return numUntCd
  */
  
  @Schema(name = "num_unt_cd", description = "個数単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_unt_cd")
  public String getNumUntCd() {
    return numUntCd;
  }

  public void setNumUntCd(String numUntCd) {
    this.numUntCd = numUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns istdTotlWeigMeas(BigDecimal istdTotlWeigMeas) {
    this.istdTotlWeigMeas = istdTotlWeigMeas;
    return this;
  }

  /**
   * 運送梱包総重量（依頼）
   * @return istdTotlWeigMeas
  */
  @Valid 
  @Schema(name = "istd_totl_weig_meas", description = "運送梱包総重量（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("istd_totl_weig_meas")
  public BigDecimal getIstdTotlWeigMeas() {
    return istdTotlWeigMeas;
  }

  public void setIstdTotlWeigMeas(BigDecimal istdTotlWeigMeas) {
    this.istdTotlWeigMeas = istdTotlWeigMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns weigUntCd(String weigUntCd) {
    this.weigUntCd = weigUntCd;
    return this;
  }

  /**
   * 重量単位コード
   * @return weigUntCd
  */
  
  @Schema(name = "weig_unt_cd", description = "重量単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weig_unt_cd")
  public String getWeigUntCd() {
    return weigUntCd;
  }

  public void setWeigUntCd(String weigUntCd) {
    this.weigUntCd = weigUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns istdTotlVolMeas(BigDecimal istdTotlVolMeas) {
    this.istdTotlVolMeas = istdTotlVolMeas;
    return this;
  }

  /**
   * 運送梱包総容積（依頼）
   * @return istdTotlVolMeas
  */
  @Valid 
  @Schema(name = "istd_totl_vol_meas", description = "運送梱包総容積（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("istd_totl_vol_meas")
  public BigDecimal getIstdTotlVolMeas() {
    return istdTotlVolMeas;
  }

  public void setIstdTotlVolMeas(BigDecimal istdTotlVolMeas) {
    this.istdTotlVolMeas = istdTotlVolMeas;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns volUntCd(String volUntCd) {
    this.volUntCd = volUntCd;
    return this;
  }

  /**
   * 容積単位コード
   * @return volUntCd
  */
  
  @Schema(name = "vol_unt_cd", description = "容積単位コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vol_unt_cd")
  public String getVolUntCd() {
    return volUntCd;
  }

  public void setVolUntCd(String volUntCd) {
    this.volUntCd = volUntCd;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns istdTotlUntlQuan(BigDecimal istdTotlUntlQuan) {
    this.istdTotlUntlQuan = istdTotlUntlQuan;
    return this;
  }

  /**
   * ユニットロード総数（依頼）
   * @return istdTotlUntlQuan
  */
  @Valid 
  @Schema(name = "istd_totl_untl_quan", description = "ユニットロード総数（依頼）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("istd_totl_untl_quan")
  public BigDecimal getIstdTotlUntlQuan() {
    return istdTotlUntlQuan;
  }

  public void setIstdTotlUntlQuan(BigDecimal istdTotlUntlQuan) {
    this.istdTotlUntlQuan = istdTotlUntlQuan;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns) o;
    return Objects.equals(this.istdTotlPcksQuan, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.istdTotlPcksQuan) &&
        Objects.equals(this.numUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.numUntCd) &&
        Objects.equals(this.istdTotlWeigMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.istdTotlWeigMeas) &&
        Objects.equals(this.weigUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.weigUntCd) &&
        Objects.equals(this.istdTotlVolMeas, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.istdTotlVolMeas) &&
        Objects.equals(this.volUntCd, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.volUntCd) &&
        Objects.equals(this.istdTotlUntlQuan, dataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns.istdTotlUntlQuan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(istdTotlPcksQuan, numUntCd, istdTotlWeigMeas, weigUntCd, istdTotlVolMeas, volUntCd, istdTotlUntlQuan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns {\n");
    sb.append("    istdTotlPcksQuan: ").append(toIndentedString(istdTotlPcksQuan)).append("\n");
    sb.append("    numUntCd: ").append(toIndentedString(numUntCd)).append("\n");
    sb.append("    istdTotlWeigMeas: ").append(toIndentedString(istdTotlWeigMeas)).append("\n");
    sb.append("    weigUntCd: ").append(toIndentedString(weigUntCd)).append("\n");
    sb.append("    istdTotlVolMeas: ").append(toIndentedString(istdTotlVolMeas)).append("\n");
    sb.append("    volUntCd: ").append(toIndentedString(volUntCd)).append("\n");
    sb.append("    istdTotlUntlQuan: ").append(toIndentedString(istdTotlUntlQuan)).append("\n");
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

