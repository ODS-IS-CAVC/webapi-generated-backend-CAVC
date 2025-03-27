package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeErrorsInner;
import net.ouranos.domain.digiline.model.DataModelSemiDynamicInfoAttributeLevel1Inner;
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

@Schema(name = "dataModel_semiDynamicInfo_attribute", description = "データモデル要素")
@JsonTypeName("dataModel_semiDynamicInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttribute {

  private Integer result;

  private String targetTime;

  @Valid
  private List<@Valid DataModelSemiDynamicInfoAttributeErrorsInner> errors = new ArrayList<>();

  @Valid
  private List<@Valid DataModelSemiDynamicInfoAttributeLevel1Inner> level1 = new ArrayList<>();

  public DataModelSemiDynamicInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelSemiDynamicInfoAttribute(Integer result) {
    this.result = result;
  }

  public DataModelSemiDynamicInfoAttribute result(Integer result) {
    this.result = result;
    return this;
  }

  /**
   * 結果コード
   * @return result
  */
  @NotNull 
  @Schema(name = "result", example = "0", description = "結果コード", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public DataModelSemiDynamicInfoAttribute targetTime(String targetTime) {
    this.targetTime = targetTime;
    return this;
  }

  /**
   * 検索対象の日時
   * @return targetTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "targetTime", example = "2024/01/01 00:00:00", description = "検索対象の日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetTime")
  public String getTargetTime() {
    return targetTime;
  }

  public void setTargetTime(String targetTime) {
    this.targetTime = targetTime;
  }

  public DataModelSemiDynamicInfoAttribute errors(List<@Valid DataModelSemiDynamicInfoAttributeErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public DataModelSemiDynamicInfoAttribute addErrorsItem(DataModelSemiDynamicInfoAttributeErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * 各情報ごとのエラー内容のリスト
   * @return errors
  */
  @Valid @Size(min = 0, max = 4) 
  @Schema(name = "errors", description = "各情報ごとのエラー内容のリスト", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid DataModelSemiDynamicInfoAttributeErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid DataModelSemiDynamicInfoAttributeErrorsInner> errors) {
    this.errors = errors;
  }

  public DataModelSemiDynamicInfoAttribute level1(List<@Valid DataModelSemiDynamicInfoAttributeLevel1Inner> level1) {
    this.level1 = level1;
    return this;
  }

  public DataModelSemiDynamicInfoAttribute addLevel1Item(DataModelSemiDynamicInfoAttributeLevel1Inner level1Item) {
    if (this.level1 == null) {
      this.level1 = new ArrayList<>();
    }
    this.level1.add(level1Item);
    return this;
  }

  /**
   * 検索内容レベル1
   * @return level1
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "level1", description = "検索内容レベル1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level1")
  public List<@Valid DataModelSemiDynamicInfoAttributeLevel1Inner> getLevel1() {
    return level1;
  }

  public void setLevel1(List<@Valid DataModelSemiDynamicInfoAttributeLevel1Inner> level1) {
    this.level1 = level1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttribute dataModelSemiDynamicInfoAttribute = (DataModelSemiDynamicInfoAttribute) o;
    return Objects.equals(this.result, dataModelSemiDynamicInfoAttribute.result) &&
        Objects.equals(this.targetTime, dataModelSemiDynamicInfoAttribute.targetTime) &&
        Objects.equals(this.errors, dataModelSemiDynamicInfoAttribute.errors) &&
        Objects.equals(this.level1, dataModelSemiDynamicInfoAttribute.level1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, targetTime, errors, level1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttribute {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    targetTime: ").append(toIndentedString(targetTime)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    level1: ").append(toIndentedString(level1)).append("\n");
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

