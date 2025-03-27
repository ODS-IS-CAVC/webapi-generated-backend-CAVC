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
import net.ouranos.domain.digiline.model.DataModelFileAttributesAttributeInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * C-2-2[B] ファイル属性データモデル
 */

@Schema(name = "fileattributes", description = "C-2-2[B] ファイル属性データモデル")
@JsonTypeName("fileattributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:26:16.817756100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class Fileattributes {

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
  private List<@Valid DataModelFileAttributesAttributeInner> attribute = new ArrayList<>();

  public Fileattributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Fileattributes(DataModelTypeEnum dataModelType, List<@Valid DataModelFileAttributesAttributeInner> attribute) {
    this.dataModelType = dataModelType;
    this.attribute = attribute;
  }

  public Fileattributes dataModelType(DataModelTypeEnum dataModelType) {
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

  public Fileattributes attribute(List<@Valid DataModelFileAttributesAttributeInner> attribute) {
    this.attribute = attribute;
    return this;
  }

  public Fileattributes addAttributeItem(DataModelFileAttributesAttributeInner attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * Get attribute
   * @return attribute
  */
  @NotNull @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "attribute", example = "[{\"fileName\":\"pointcouddir/pointcloudfile.potree\",\"type\":\"potree\",\"size\":111222333,\"created\":\"2024-01-23T11:22:33.000Z\",\"updated\":\"2024-01-23T11:22:33.000Z\",\"accessed\":\"2024-01-23T11:22:33.000Z\",\"compressed\":0,\"version\":12,\"coordinates\":[139.681994465,35.50676814,1.274998954]},{\"fileName\":\"pointcouddir/pointcloudfile.laz\",\"type\":\"laz\",\"size\":444555666,\"created\":\"2024-02-23T11:22:33.000Z\",\"updated\":\"2024-02-23T11:22:33.000Z\",\"accessed\":\"2024-02-23T11:22:33.000Z\",\"compressed\":1,\"version\":23,\"coordinates\":[139.681985082,35.506773265,1.277230526]}]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public List<@Valid DataModelFileAttributesAttributeInner> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<@Valid DataModelFileAttributesAttributeInner> attribute) {
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
    Fileattributes fileattributes = (Fileattributes) o;
    return Objects.equals(this.dataModelType, fileattributes.dataModelType) &&
        Objects.equals(this.attribute, fileattributes.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fileattributes {\n");
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

