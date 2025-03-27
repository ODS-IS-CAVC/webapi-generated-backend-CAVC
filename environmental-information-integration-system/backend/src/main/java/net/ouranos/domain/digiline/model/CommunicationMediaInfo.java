package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.DataModelCommunicationMediaInfoAttribute;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 通信メディア情報
 */

@Schema(name = "communicationMediaInfo", description = "通信メディア情報")
@JsonTypeName("communicationMediaInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T15:50:26.177266900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class CommunicationMediaInfo {

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

  private DataModelCommunicationMediaInfoAttribute attribute;

  public CommunicationMediaInfo dataModelType(DataModelTypeEnum dataModelType) {
    this.dataModelType = dataModelType;
    return this;
  }

  /**
   * データモデルタイプ
   * @return dataModelType
  */
  
  @Schema(name = "dataModelType", example = "test1", description = "データモデルタイプ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataModelType")
  public DataModelTypeEnum getDataModelType() {
    return dataModelType;
  }

  public void setDataModelType(DataModelTypeEnum dataModelType) {
    this.dataModelType = dataModelType;
  }

  public CommunicationMediaInfo attribute(DataModelCommunicationMediaInfoAttribute attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
  */
  @Valid 
  @Schema(name = "attribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribute")
  public DataModelCommunicationMediaInfoAttribute getAttribute() {
    return attribute;
  }

  public void setAttribute(DataModelCommunicationMediaInfoAttribute attribute) {
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
    CommunicationMediaInfo communicationMediaInfo = (CommunicationMediaInfo) o;
    return Objects.equals(this.dataModelType, communicationMediaInfo.dataModelType) &&
        Objects.equals(this.attribute, communicationMediaInfo.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationMediaInfo {\n");
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

