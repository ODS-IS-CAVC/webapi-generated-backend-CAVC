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
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 共有資源状態
 */

@Schema(name = "dataModel_Resources_attribute_statuses_inner", description = "共有資源状態")
@JsonTypeName("dataModel_Resources_attribute_statuses_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:26:16.817756100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelResourcesAttributeStatusesInner {

  private String key;

  private String value;

  @Valid
  private List<List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double>> coordinates = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validUntil;

  public DataModelResourcesAttributeStatusesInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * 共有資源名
   * @return key
  */
  @Size(min = 1, max = 20) 
  @Schema(name = "key", example = "Feature", description = "共有資源名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DataModelResourcesAttributeStatusesInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * 共有資源値。任意文字列を指定可能だが、整数として解釈できる文字列の場合は、lowerBound/upperBoundでフィルタリング可能。
   * @return value
  */
  @Size(min = 0, max = 4096) 
  @Schema(name = "value", example = "0", description = "共有資源値。任意文字列を指定可能だが、整数として解釈できる文字列の場合は、lowerBound/upperBoundでフィルタリング可能。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DataModelResourcesAttributeStatusesInner coordinates(List<List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public DataModelResourcesAttributeStatusesInner addCoordinatesItem(List<@DecimalMin(value = "-100000000", inclusive = true) @DecimalMax(value = "100000000", inclusive = true)Double> coordinatesItem) {
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

  public DataModelResourcesAttributeStatusesInner validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * 有効期間開始日時（包含）。有効期間開始日時の指定が無い場合（空文字列）、有効期間開始日時はPOSTされた日時が設定される。
   * @return validFrom
  */
  @Valid 
  @Schema(name = "validFrom", example = "2024-01-22T11:22:33Z", description = "有効期間開始日時（包含）。有効期間開始日時の指定が無い場合（空文字列）、有効期間開始日時はPOSTされた日時が設定される。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFrom")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public DataModelResourcesAttributeStatusesInner validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * 有効期間終了日時（排他）。有効期間終了日時の指定が無い場合（空文字列）、データはDELETEされるまで永続的に存在する。空港期限切れデータは自動消去される。
   * @return validUntil
  */
  @Valid 
  @Schema(name = "validUntil", example = "2024-01-23T11:22:33Z", description = "有効期間終了日時（排他）。有効期間終了日時の指定が無い場合（空文字列）、データはDELETEされるまで永続的に存在する。空港期限切れデータは自動消去される。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validUntil")
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelResourcesAttributeStatusesInner dataModelResourcesAttributeStatusesInner = (DataModelResourcesAttributeStatusesInner) o;
    return Objects.equals(this.key, dataModelResourcesAttributeStatusesInner.key) &&
        Objects.equals(this.value, dataModelResourcesAttributeStatusesInner.value) &&
        Objects.equals(this.coordinates, dataModelResourcesAttributeStatusesInner.coordinates) &&
        Objects.equals(this.validFrom, dataModelResourcesAttributeStatusesInner.validFrom) &&
        Objects.equals(this.validUntil, dataModelResourcesAttributeStatusesInner.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, coordinates, validFrom, validUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelResourcesAttributeStatusesInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

