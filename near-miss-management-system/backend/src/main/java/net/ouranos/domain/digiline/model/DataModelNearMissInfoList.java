package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelNearMissInfoListAttributeInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ヒヤリハット情報リスト
 */

@Schema(name = "dataModel.nearMissInfoList", description = "ヒヤリハット情報リスト")
@JsonTypeName("dataModel.nearMissInfoList")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T11:39:44.592576100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelNearMissInfoList {

  /**
   * データモデルタイプ
   */
  public enum DataModelTypeEnum {
    TEST1("test1"),
    
    TEST2("test2");

    private String value;

    DataModelTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataModelTypeEnum fromValue(String value) {
      for (DataModelTypeEnum b : DataModelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DataModelTypeEnum dataModelType;

  @Valid
  private List<@Valid DataModelNearMissInfoListAttributeInner> attribute = new ArrayList<>();

  public DataModelNearMissInfoList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelNearMissInfoList(DataModelTypeEnum dataModelType, List<@Valid DataModelNearMissInfoListAttributeInner> attribute) {
    this.dataModelType = dataModelType;
    this.attribute = attribute;
  }

  public DataModelNearMissInfoList dataModelType(DataModelTypeEnum dataModelType) {
    this.dataModelType = dataModelType;
    return this;
  }

  /**
   * データモデルタイプ
   * @return dataModelType
   */
  @NotNull 
  @Schema(name = "dataModelType", example = "test1", description = "データモデルタイプ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataModelType")
  public DataModelTypeEnum getDataModelType() {
    return dataModelType;
  }

  public void setDataModelType(DataModelTypeEnum dataModelType) {
    this.dataModelType = dataModelType;
  }

  public DataModelNearMissInfoList attribute(List<@Valid DataModelNearMissInfoListAttributeInner> attribute) {
    this.attribute = attribute;
    return this;
  }

  public DataModelNearMissInfoList addAttributeItem(DataModelNearMissInfoListAttributeInner attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * ヒヤリハット情報リスト
   * @return attribute
   */
  @NotNull @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "attribute", description = "ヒヤリハット情報リスト", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public List<@Valid DataModelNearMissInfoListAttributeInner> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<@Valid DataModelNearMissInfoListAttributeInner> attribute) {
    this.attribute = attribute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelNearMissInfoList dataModelNearMissInfoList = (DataModelNearMissInfoList) o;
    return Objects.equals(this.dataModelType, dataModelNearMissInfoList.dataModelType) &&
        Objects.equals(this.attribute, dataModelNearMissInfoList.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelNearMissInfoList {\n");
    sb.append("    dataModelType: ").append(toIndentedString(dataModelType)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

