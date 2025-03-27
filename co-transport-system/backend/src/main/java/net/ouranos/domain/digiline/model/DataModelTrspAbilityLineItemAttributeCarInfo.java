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

@Schema(name = "dataModel_trsp_ability_line_item_attribute_car_info", description = "データモデル要素")
@JsonTypeName("dataModel_trsp_ability_line_item_attribute_car_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-13T16:38:12.592317500+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelTrspAbilityLineItemAttributeCarInfo {

  private String pckeFrmCd;

  private Integer arMaxUntlCpQuan;

  public DataModelTrspAbilityLineItemAttributeCarInfo pckeFrmCd(String pckeFrmCd) {
    this.pckeFrmCd = pckeFrmCd;
    return this;
  }

  /**
   * 荷姿コード
   * @return pckeFrmCd
  */
  @Size(min = 1, max = 3) 
  @Schema(name = "pcke_frm_cd", description = "荷姿コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pcke_frm_cd")
  public String getPckeFrmCd() {
    return pckeFrmCd;
  }

  public void setPckeFrmCd(String pckeFrmCd) {
    this.pckeFrmCd = pckeFrmCd;
  }

  public DataModelTrspAbilityLineItemAttributeCarInfo arMaxUntlCpQuan(Integer arMaxUntlCpQuan) {
    this.arMaxUntlCpQuan = arMaxUntlCpQuan;
    return this;
  }

  /**
   * 最大積載数
   * minimum: 1
   * maximum: 99
   * @return arMaxUntlCpQuan
  */
  @Min(1) @Max(99) 
  @Schema(name = "ar_max_untl_cp_quan", description = "最大積載数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ar_max_untl_cp_quan")
  public Integer getArMaxUntlCpQuan() {
    return arMaxUntlCpQuan;
  }

  public void setArMaxUntlCpQuan(Integer arMaxUntlCpQuan) {
    this.arMaxUntlCpQuan = arMaxUntlCpQuan;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTrspAbilityLineItemAttributeCarInfo dataModelTrspAbilityLineItemAttributeCarInfo = (DataModelTrspAbilityLineItemAttributeCarInfo) o;
    return Objects.equals(this.pckeFrmCd, dataModelTrspAbilityLineItemAttributeCarInfo.pckeFrmCd) &&
        Objects.equals(this.arMaxUntlCpQuan, dataModelTrspAbilityLineItemAttributeCarInfo.arMaxUntlCpQuan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pckeFrmCd, arMaxUntlCpQuan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTrspAbilityLineItemAttributeCarInfo {\n");
    sb.append("    pckeFrmCd: ").append(toIndentedString(pckeFrmCd)).append("\n");
    sb.append("    arMaxUntlCpQuan: ").append(toIndentedString(arMaxUntlCpQuan)).append("\n");
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

