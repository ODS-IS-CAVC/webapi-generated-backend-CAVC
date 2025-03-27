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
 * DataModelAttributesAttributesInner
 */

@JsonTypeName("dataModel_attributes_attributes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T11:39:44.592576100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelAttributesAttributesInner {

  private String key;

  private String value;

  public DataModelAttributesAttributesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelAttributesAttributesInner(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public DataModelAttributesAttributesInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @NotNull @Size(min = 1, max = 4096) 
  @Schema(name = "key", example = "someAttributeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DataModelAttributesAttributesInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @NotNull @Size(min = 1, max = 2147483647) 
  @Schema(name = "value", example = "someAttributeValue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelAttributesAttributesInner dataModelAttributesAttributesInner = (DataModelAttributesAttributesInner) o;
    return Objects.equals(this.key, dataModelAttributesAttributesInner.key) &&
        Objects.equals(this.value, dataModelAttributesAttributesInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelAttributesAttributesInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

