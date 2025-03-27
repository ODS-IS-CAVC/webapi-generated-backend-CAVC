package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.ouranos.domain.digiline.model.DataModelAttributesAttributesInner;
import net.ouranos.domain.digiline.model.DataModelAttributesCoordinatesInner;
import net.ouranos.domain.digiline.model.DataModelNearMissInfoListAttributeInnerFilesInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ヒヤリハット情報
 */

@Schema(name = "dataModel_nearMissInfoList_attribute_inner", description = "ヒヤリハット情報")
@JsonTypeName("dataModel_nearMissInfoList_attribute_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T11:39:44.592576100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelNearMissInfoListAttributeInner {

  private UUID id;

  private String uri;

  private String name;

  private String category;

  private String summary;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @Valid
  private List<@Valid DataModelAttributesCoordinatesInner> coordinates = new ArrayList<>();

  @Valid
  private List<@Valid DataModelAttributesAttributesInner> attributes = new ArrayList<>();

  @Valid
  private List<@Valid DataModelNearMissInfoListAttributeInnerFilesInner> files = new ArrayList<>();

  public DataModelNearMissInfoListAttributeInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelNearMissInfoListAttributeInner(UUID id) {
    this.id = id;
  }

  public DataModelNearMissInfoListAttributeInner id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * データID
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "データID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DataModelNearMissInfoListAttributeInner uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * データフォルダURI
   * @return uri
   */
  
  @Schema(name = "uri", example = "https://hhBucketName.s3.ap-northeast-1.amazonaws.com", description = "データフォルダURI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public DataModelNearMissInfoListAttributeInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 名称
   * @return name
   */
  @Size(min = 1, max = 4096) 
  @Schema(name = "name", example = "ヒヤリハット情報A", description = "名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataModelNearMissInfoListAttributeInner category(String category) {
    this.category = category;
    return this;
  }

  /**
   * 分類
   * @return category
   */
  
  @Schema(name = "category", example = "合流", description = "分類", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DataModelNearMissInfoListAttributeInner summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * 要約
   * @return summary
   */
  @Size(min = 0, max = 4096) 
  @Schema(name = "summary", example = "ヒヤリハット情報要約をここに記述する。", description = "要約", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public DataModelNearMissInfoListAttributeInner timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * 発生時刻 (ISO 8601形式)
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", example = "2024-07-10T09:37:58.372Z", description = "発生時刻 (ISO 8601形式)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public DataModelNearMissInfoListAttributeInner coordinates(List<@Valid DataModelAttributesCoordinatesInner> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public DataModelNearMissInfoListAttributeInner addCoordinatesItem(DataModelAttributesCoordinatesInner coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * 発生地点
   * @return coordinates
   */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "coordinates", description = "発生地点", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinates")
  public List<@Valid DataModelAttributesCoordinatesInner> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<@Valid DataModelAttributesCoordinatesInner> coordinates) {
    this.coordinates = coordinates;
  }

  public DataModelNearMissInfoListAttributeInner attributes(List<@Valid DataModelAttributesAttributesInner> attributes) {
    this.attributes = attributes;
    return this;
  }

  public DataModelNearMissInfoListAttributeInner addAttributesItem(DataModelAttributesAttributesInner attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * ヒヤリハット属性リスト。発生位置、発生時刻、分類等以外の属性を保持する。
   * @return attributes
   */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "attributes", description = "ヒヤリハット属性リスト。発生位置、発生時刻、分類等以外の属性を保持する。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid DataModelAttributesAttributesInner> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid DataModelAttributesAttributesInner> attributes) {
    this.attributes = attributes;
  }

  public DataModelNearMissInfoListAttributeInner files(List<@Valid DataModelNearMissInfoListAttributeInnerFilesInner> files) {
    this.files = files;
    return this;
  }

  public DataModelNearMissInfoListAttributeInner addFilesItem(DataModelNearMissInfoListAttributeInnerFilesInner filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
   */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public List<@Valid DataModelNearMissInfoListAttributeInnerFilesInner> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid DataModelNearMissInfoListAttributeInnerFilesInner> files) {
    this.files = files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelNearMissInfoListAttributeInner dataModelNearMissInfoListAttributeInner = (DataModelNearMissInfoListAttributeInner) o;
    return Objects.equals(this.id, dataModelNearMissInfoListAttributeInner.id) &&
        Objects.equals(this.uri, dataModelNearMissInfoListAttributeInner.uri) &&
        Objects.equals(this.name, dataModelNearMissInfoListAttributeInner.name) &&
        Objects.equals(this.category, dataModelNearMissInfoListAttributeInner.category) &&
        Objects.equals(this.summary, dataModelNearMissInfoListAttributeInner.summary) &&
        Objects.equals(this.timestamp, dataModelNearMissInfoListAttributeInner.timestamp) &&
        Objects.equals(this.coordinates, dataModelNearMissInfoListAttributeInner.coordinates) &&
        Objects.equals(this.attributes, dataModelNearMissInfoListAttributeInner.attributes) &&
        Objects.equals(this.files, dataModelNearMissInfoListAttributeInner.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, name, category, summary, timestamp, coordinates, attributes, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelNearMissInfoListAttributeInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

