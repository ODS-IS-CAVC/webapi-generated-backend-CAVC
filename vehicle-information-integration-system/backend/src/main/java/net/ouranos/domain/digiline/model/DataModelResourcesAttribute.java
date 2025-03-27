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
import net.ouranos.domain.digiline.model.DataModelResourcesAttributeStatusesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelResourcesAttribute
 */

@JsonTypeName("dataModel_Resources_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:26:16.817756100+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelResourcesAttribute {

  /**
   * 共有資源カテゴリ名
   */
  public enum CategoryEnum {
    EVACUATION("evacuation"),
    
    MOBILITYHUB("mobilityhub");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryEnum category;

  @Valid
  private List<@Valid DataModelResourcesAttributeStatusesInner> statuses = new ArrayList<>();

  public DataModelResourcesAttribute category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * 共有資源カテゴリ名
   * @return category
  */
  
  @Schema(name = "category", example = "evacuation", description = "共有資源カテゴリ名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public DataModelResourcesAttribute statuses(List<@Valid DataModelResourcesAttributeStatusesInner> statuses) {
    this.statuses = statuses;
    return this;
  }

  public DataModelResourcesAttribute addStatusesItem(DataModelResourcesAttributeStatusesInner statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * 共有資源状態配列
   * @return statuses
  */
  @Valid @Size(min = 0, max = 2147483647) 
  @Schema(name = "statuses", example = "[{\"key\":\"class40t\",\"value\":0,\"coordinates\":[139.681994465,35.50676814,1.274998954],\"validFrom\":\"2024-01-22T11:22:33Z\",\"validUntil\":\"2024-01-23T11:22:33Z\"},{\"key\":\"class2t\",\"value\":1,\"coordinates\":[139.68199446,35.506768141,1.274998944],\"validFrom\":\"2024-02-22T11:22:33Z\",\"validUntil\":\"2024-02-23T11:22:33Z\"}]", description = "共有資源状態配列", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid DataModelResourcesAttributeStatusesInner> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid DataModelResourcesAttributeStatusesInner> statuses) {
    this.statuses = statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelResourcesAttribute dataModelResourcesAttribute = (DataModelResourcesAttribute) o;
    return Objects.equals(this.category, dataModelResourcesAttribute.category) &&
        Objects.equals(this.statuses, dataModelResourcesAttribute.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelResourcesAttribute {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

