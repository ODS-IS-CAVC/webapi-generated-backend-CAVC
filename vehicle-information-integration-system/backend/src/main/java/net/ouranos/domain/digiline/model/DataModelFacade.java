package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.DataModelFacadeAttribute;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * C-2-2[B] 直接アクセス・ポイント データモデル
 */

@Schema(name = "dataModel.Facade", description = "C-2-2[B] 直接アクセス・ポイント データモデル")
@JsonTypeName("dataModel.Facade")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-06T09:50:21.114609900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelFacade {

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

  private DataModelFacadeAttribute attribute;

  public DataModelFacade() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelFacade(DataModelTypeEnum dataModelType, DataModelFacadeAttribute attribute) {
    this.dataModelType = dataModelType;
    this.attribute = attribute;
  }

  public DataModelFacade dataModelType(DataModelTypeEnum dataModelType) {
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

  public DataModelFacade attribute(DataModelFacadeAttribute attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
   */
  @NotNull @Valid 
  @Schema(name = "attribute", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public DataModelFacadeAttribute getAttribute() {
    return attribute;
  }

  public void setAttribute(DataModelFacadeAttribute attribute) {
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
    DataModelFacade dataModelFacade = (DataModelFacade) o;
    return Objects.equals(this.dataModelType, dataModelFacade.dataModelType) &&
        Objects.equals(this.attribute, dataModelFacade.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelFacade {\n");
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

