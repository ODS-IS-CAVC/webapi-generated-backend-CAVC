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
import net.ouranos.domain.digiline.model.BusStopsAttributeInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 乗降地(バス停)一覧データ
 */

@Schema(name = "bus-stops", description = "乗降地(バス停)一覧データ")
@JsonTypeName("bus-stops")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T15:06:05.622069400+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class BusStops {

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
  private List<@Valid BusStopsAttributeInner> attribute = new ArrayList<>();

  public BusStops() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusStops(DataModelTypeEnum dataModelType, List<@Valid BusStopsAttributeInner> attribute) {
    this.dataModelType = dataModelType;
    this.attribute = attribute;
  }

  public BusStops dataModelType(DataModelTypeEnum dataModelType) {
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

  public BusStops attribute(List<@Valid BusStopsAttributeInner> attribute) {
    this.attribute = attribute;
    return this;
  }

  public BusStops addAttributeItem(BusStopsAttributeInner attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * 乗降地(バス停)一覧のデータモデル
   * @return attribute
  */
  @NotNull @Valid 
  @Schema(name = "attribute", description = "乗降地(バス停)一覧のデータモデル", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public List<@Valid BusStopsAttributeInner> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<@Valid BusStopsAttributeInner> attribute) {
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
    BusStops busStops = (BusStops) o;
    return Objects.equals(this.dataModelType, busStops.dataModelType) &&
        Objects.equals(this.attribute, busStops.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusStops {\n");
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

