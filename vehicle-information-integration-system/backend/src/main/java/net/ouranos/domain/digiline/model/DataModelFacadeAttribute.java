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
 * DataModelFacadeAttribute
 */

@JsonTypeName("dataModel_Facade_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-06T09:50:21.114609900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelFacadeAttribute {

  private String url;

  public DataModelFacadeAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelFacadeAttribute(String url) {
    this.url = url;
  }

  public DataModelFacadeAttribute url(String url) {
    this.url = url;
    return this;
  }

  /**
   * 直接アクセス・ポイントのURL。
   * @return url
   */
  @NotNull @Size(min = 1, max = 4096) 
  @Schema(name = "url", example = "https://api.server.test/v1", description = "直接アクセス・ポイントのURL。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelFacadeAttribute dataModelFacadeAttribute = (DataModelFacadeAttribute) o;
    return Objects.equals(this.url, dataModelFacadeAttribute.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelFacadeAttribute {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

