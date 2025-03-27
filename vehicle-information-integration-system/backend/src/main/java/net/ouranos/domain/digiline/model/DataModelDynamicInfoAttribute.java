package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeDataInner;
import net.ouranos.domain.digiline.model.DataModelDynamicInfoAttributeErrorsInner;
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

@Schema(name = "dataModel_dynamicInfo_attribute", description = "データモデル要素")
@JsonTypeName("dataModel_dynamicInfo_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelDynamicInfoAttribute {

  private Integer result;

  private String targetStartTime;

  private String targetEndTime;

  @Valid
  private List<@Valid DataModelDynamicInfoAttributeErrorsInner> errors = new ArrayList<>();

  @Valid
  private List<@Valid DataModelDynamicInfoAttributeDataInner> data = new ArrayList<>();

  public DataModelDynamicInfoAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelDynamicInfoAttribute(Integer result) {
    this.result = result;
  }

  public DataModelDynamicInfoAttribute result(Integer result) {
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

  public DataModelDynamicInfoAttribute targetStartTime(String targetStartTime) {
    this.targetStartTime = targetStartTime;
    return this;
  }

  /**
   * 要求対象のデータの開始日時
   * @return targetStartTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "targetStartTime", example = "2024/01/01 00:00:00", description = "要求対象のデータの開始日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetStartTime")
  public String getTargetStartTime() {
    return targetStartTime;
  }

  public void setTargetStartTime(String targetStartTime) {
    this.targetStartTime = targetStartTime;
  }

  public DataModelDynamicInfoAttribute targetEndTime(String targetEndTime) {
    this.targetEndTime = targetEndTime;
    return this;
  }

  /**
   * 要求対象のデータの終了日時
   * @return targetEndTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "targetEndTime", example = "2024/01/01 01:00:00", description = "要求対象のデータの終了日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetEndTime")
  public String getTargetEndTime() {
    return targetEndTime;
  }

  public void setTargetEndTime(String targetEndTime) {
    this.targetEndTime = targetEndTime;
  }

  public DataModelDynamicInfoAttribute errors(List<@Valid DataModelDynamicInfoAttributeErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public DataModelDynamicInfoAttribute addErrorsItem(DataModelDynamicInfoAttributeErrorsInner errorsItem) {
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
  @Valid @Size(min = 0, max = 3) 
  @Schema(name = "errors", description = "各情報ごとのエラー内容のリスト", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid DataModelDynamicInfoAttributeErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid DataModelDynamicInfoAttributeErrorsInner> errors) {
    this.errors = errors;
  }

  public DataModelDynamicInfoAttribute data(List<@Valid DataModelDynamicInfoAttributeDataInner> data) {
    this.data = data;
    return this;
  }

  public DataModelDynamicInfoAttribute addDataItem(DataModelDynamicInfoAttributeDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * 検索結果
   * @return data
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "data", description = "検索結果", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid DataModelDynamicInfoAttributeDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid DataModelDynamicInfoAttributeDataInner> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelDynamicInfoAttribute dataModelDynamicInfoAttribute = (DataModelDynamicInfoAttribute) o;
    return Objects.equals(this.result, dataModelDynamicInfoAttribute.result) &&
        Objects.equals(this.targetStartTime, dataModelDynamicInfoAttribute.targetStartTime) &&
        Objects.equals(this.targetEndTime, dataModelDynamicInfoAttribute.targetEndTime) &&
        Objects.equals(this.errors, dataModelDynamicInfoAttribute.errors) &&
        Objects.equals(this.data, dataModelDynamicInfoAttribute.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, targetStartTime, targetEndTime, errors, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelDynamicInfoAttribute {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    targetStartTime: ").append(toIndentedString(targetStartTime)).append("\n");
    sb.append("    targetEndTime: ").append(toIndentedString(targetEndTime)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

