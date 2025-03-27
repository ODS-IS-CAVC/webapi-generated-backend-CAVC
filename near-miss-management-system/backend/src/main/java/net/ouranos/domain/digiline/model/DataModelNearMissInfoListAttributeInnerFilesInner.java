package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelNearMissInfoListAttributeInnerFilesInner
 */

@JsonTypeName("dataModel_nearMissInfoList_attribute_inner_files_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T11:39:44.592576100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelNearMissInfoListAttributeInnerFilesInner {

  private String type;

  private BigDecimal size;

  private String uri;

  public DataModelNearMissInfoListAttributeInnerFilesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelNearMissInfoListAttributeInnerFilesInner(String type, BigDecimal size, String uri) {
    this.type = type;
    this.size = size;
    this.uri = uri;
  }

  public DataModelNearMissInfoListAttributeInnerFilesInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * ファイル種別
   * @return type
   */
  @NotNull @Size(min = 0, max = 4096) 
  @Schema(name = "type", example = "egoVehiclePosition", description = "ファイル種別", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataModelNearMissInfoListAttributeInnerFilesInner size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * ファイルサイズ[bytes]
   * minimum: 0
   * maximum: 2147483647
   * @return size
   */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "size", example = "12033065", description = "ファイルサイズ[bytes]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public DataModelNearMissInfoListAttributeInnerFilesInner uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * ファイルURI
   * @return uri
   */
  @NotNull @Size(min = 0, max = 4096) 
  @Schema(name = "uri", example = "https://hhBucketName.s3.ap-northeast-1.amazonaws.com/hhObjectName?XXXX=YYY&ZZZZ=WWW", description = "ファイルURI", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelNearMissInfoListAttributeInnerFilesInner dataModelNearMissInfoListAttributeInnerFilesInner = (DataModelNearMissInfoListAttributeInnerFilesInner) o;
    return Objects.equals(this.type, dataModelNearMissInfoListAttributeInnerFilesInner.type) &&
        Objects.equals(this.size, dataModelNearMissInfoListAttributeInnerFilesInner.size) &&
        Objects.equals(this.uri, dataModelNearMissInfoListAttributeInnerFilesInner.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, size, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelNearMissInfoListAttributeInnerFilesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

