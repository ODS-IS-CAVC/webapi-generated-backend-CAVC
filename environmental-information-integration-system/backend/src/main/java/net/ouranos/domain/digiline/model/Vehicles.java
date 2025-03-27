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
import net.ouranos.domain.digiline.model.VehiclesAttributeInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 車両一覧データ
 */

@Schema(name = "vehicles", description = "車両一覧データ")
@JsonTypeName("vehicles")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-28T13:39:12.345777800+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class Vehicles {

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
  private List<@Valid VehiclesAttributeInner> attribute = new ArrayList<>();

  public Vehicles() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Vehicles(DataModelTypeEnum dataModelType, List<@Valid VehiclesAttributeInner> attribute) {
    this.dataModelType = dataModelType;
    this.attribute = attribute;
  }

  public Vehicles dataModelType(DataModelTypeEnum dataModelType) {
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

  public Vehicles attribute(List<@Valid VehiclesAttributeInner> attribute) {
    this.attribute = attribute;
    return this;
  }

  public Vehicles addAttributeItem(VehiclesAttributeInner attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * 車両一覧データモデル
   * @return attribute
  */
  @NotNull @Valid 
  @Schema(name = "attribute", description = "車両一覧データモデル", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public List<@Valid VehiclesAttributeInner> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<@Valid VehiclesAttributeInner> attribute) {
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
    Vehicles vehicles = (Vehicles) o;
    return Objects.equals(this.dataModelType, vehicles.dataModelType) &&
        Objects.equals(this.attribute, vehicles.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicles {\n");
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

