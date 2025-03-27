package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelUseCaseInfoAttributeUseCaseInfoInner
 */

@JsonTypeName("dataModel_useCaseInfo_attribute_useCaseInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelUseCaseInfoAttributeUseCaseInfoInner {

  private Integer useCaseNum;

  @Valid
  private List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner> useCaseClassificationInfo = new ArrayList<>();

  public DataModelUseCaseInfoAttributeUseCaseInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelUseCaseInfoAttributeUseCaseInfoInner(Integer useCaseNum, List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner> useCaseClassificationInfo) {
    this.useCaseNum = useCaseNum;
    this.useCaseClassificationInfo = useCaseClassificationInfo;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInner useCaseNum(Integer useCaseNum) {
    this.useCaseNum = useCaseNum;
    return this;
  }

  /**
   * ユースケース数
   * minimum: 0
   * maximum: 255
   * @return useCaseNum
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "useCaseNum", example = "1", description = "ユースケース数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("useCaseNum")
  public Integer getUseCaseNum() {
    return useCaseNum;
  }

  public void setUseCaseNum(Integer useCaseNum) {
    this.useCaseNum = useCaseNum;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInner useCaseClassificationInfo(List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner> useCaseClassificationInfo) {
    this.useCaseClassificationInfo = useCaseClassificationInfo;
    return this;
  }

  public DataModelUseCaseInfoAttributeUseCaseInfoInner addUseCaseClassificationInfoItem(DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner useCaseClassificationInfoItem) {
    if (this.useCaseClassificationInfo == null) {
      this.useCaseClassificationInfo = new ArrayList<>();
    }
    this.useCaseClassificationInfo.add(useCaseClassificationInfoItem);
    return this;
  }

  /**
   * Get useCaseClassificationInfo
   * @return useCaseClassificationInfo
  */
  @NotNull @Valid @Size(min = 0, max = 255) 
  @Schema(name = "useCaseClassificationInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("useCaseClassificationInfo")
  public List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner> getUseCaseClassificationInfo() {
    return useCaseClassificationInfo;
  }

  public void setUseCaseClassificationInfo(List<@Valid DataModelUseCaseInfoAttributeUseCaseInfoInnerUseCaseClassificationInfoInner> useCaseClassificationInfo) {
    this.useCaseClassificationInfo = useCaseClassificationInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelUseCaseInfoAttributeUseCaseInfoInner dataModelUseCaseInfoAttributeUseCaseInfoInner = (DataModelUseCaseInfoAttributeUseCaseInfoInner) o;
    return Objects.equals(this.useCaseNum, dataModelUseCaseInfoAttributeUseCaseInfoInner.useCaseNum) &&
        Objects.equals(this.useCaseClassificationInfo, dataModelUseCaseInfoAttributeUseCaseInfoInner.useCaseClassificationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCaseNum, useCaseClassificationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelUseCaseInfoAttributeUseCaseInfoInner {\n");
    sb.append("    useCaseNum: ").append(toIndentedString(useCaseNum)).append("\n");
    sb.append("    useCaseClassificationInfo: ").append(toIndentedString(useCaseClassificationInfo)).append("\n");
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

