package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelFileAttributesAttributeInner
 */

@JsonTypeName("dataModel_FileAttributes_attribute_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:26:16.817756100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelFileAttributesAttributeInner {

  private String fileName;

  private String type;

  private BigDecimal size;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime accessed;

  private BigDecimal compressed;

  private BigDecimal version;

  @Valid
  private List<List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double>> coordinates = new ArrayList<>();

  public DataModelFileAttributesAttributeInner fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * ファイル名
   * @return fileName
  */
  @Size(min = 1, max = 4096) 
  @Schema(name = "fileName", example = "pointcouddir/pointcloudfile.potree", description = "ファイル名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DataModelFileAttributesAttributeInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * ファイル種別
   * @return type
  */
  @Size(min = 1, max = 4096) 
  @Schema(name = "type", example = "potree", description = "ファイル種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataModelFileAttributesAttributeInner size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * ファイルサイズ（バイト）
   * minimum: 0
   * maximum: 2147483647
   * @return size
  */
  @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "size", example = "111222333", description = "ファイルサイズ（バイト）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public DataModelFileAttributesAttributeInner created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * 作成日時
   * @return created
  */
  @Valid 
  @Schema(name = "created", example = "2024-01-23T11:22:33Z", description = "作成日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public DataModelFileAttributesAttributeInner updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * 更新日時
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", example = "2024-01-23T11:22:33Z", description = "更新日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public DataModelFileAttributesAttributeInner accessed(OffsetDateTime accessed) {
    this.accessed = accessed;
    return this;
  }

  /**
   * アクセス日時
   * @return accessed
  */
  @Valid 
  @Schema(name = "accessed", example = "2024-01-23T11:22:33Z", description = "アクセス日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessed")
  public OffsetDateTime getAccessed() {
    return accessed;
  }

  public void setAccessed(OffsetDateTime accessed) {
    this.accessed = accessed;
  }

  public DataModelFileAttributesAttributeInner compressed(BigDecimal compressed) {
    this.compressed = compressed;
    return this;
  }

  /**
   * 圧縮済み。0=無圧縮, 1=圧縮済
   * minimum: 0
   * maximum: 1
   * @return compressed
  */
  @Valid @DecimalMin("0") @DecimalMax("1") 
  @Schema(name = "compressed", example = "0", description = "圧縮済み。0=無圧縮, 1=圧縮済", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compressed")
  public BigDecimal getCompressed() {
    return compressed;
  }

  public void setCompressed(BigDecimal compressed) {
    this.compressed = compressed;
  }

  public DataModelFileAttributesAttributeInner version(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * バージョン番号
   * minimum: 0
   * maximum: 2147483647
   * @return version
  */
  @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "version", example = "1", description = "バージョン番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public DataModelFileAttributesAttributeInner coordinates(List<List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public DataModelFileAttributesAttributeInner addCoordinatesItem(List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double> coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * C-2-2[B] 座標列(LineString)データモデル
   * @return coordinates
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "coordinates", example = "[[139.681994465,35.50676814,1.274998954],[139.681985082,35.506773265,1.277230526],[139.6819757,35.506778388,1.279459773],[139.681966318,35.506783512,1.281689601],[139.681956936,35.506788637,1.283919998],[139.681947554,35.506793761,1.286150968]]", description = "C-2-2[B] 座標列(LineString)データモデル", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinates")
  public List<List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double>> coordinates) {
    this.coordinates = coordinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelFileAttributesAttributeInner dataModelFileAttributesAttributeInner = (DataModelFileAttributesAttributeInner) o;
    return Objects.equals(this.fileName, dataModelFileAttributesAttributeInner.fileName) &&
        Objects.equals(this.type, dataModelFileAttributesAttributeInner.type) &&
        Objects.equals(this.size, dataModelFileAttributesAttributeInner.size) &&
        Objects.equals(this.created, dataModelFileAttributesAttributeInner.created) &&
        Objects.equals(this.updated, dataModelFileAttributesAttributeInner.updated) &&
        Objects.equals(this.accessed, dataModelFileAttributesAttributeInner.accessed) &&
        Objects.equals(this.compressed, dataModelFileAttributesAttributeInner.compressed) &&
        Objects.equals(this.version, dataModelFileAttributesAttributeInner.version) &&
        Objects.equals(this.coordinates, dataModelFileAttributesAttributeInner.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, type, size, created, updated, accessed, compressed, version, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelFileAttributesAttributeInner {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

