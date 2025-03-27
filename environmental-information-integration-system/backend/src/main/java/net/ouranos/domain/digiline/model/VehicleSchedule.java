package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.VehicleScheduleAttribute;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 自動運転車両のスケジュール登録に必用なデータ
 */

@Schema(name = "vehicle-schedule", description = "自動運転車両のスケジュール登録に必用なデータ")
@JsonTypeName("vehicle-schedule")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-30T11:12:45.058018800+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class VehicleSchedule {

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

  private VehicleScheduleAttribute attribute;

  public VehicleSchedule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleSchedule(DataModelTypeEnum dataModelType, VehicleScheduleAttribute attribute) {
    this.dataModelType = dataModelType;
    this.attribute = attribute;
  }

  public VehicleSchedule dataModelType(DataModelTypeEnum dataModelType) {
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

  public VehicleSchedule attribute(VehicleScheduleAttribute attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
  */
  @NotNull @Valid 
  @Schema(name = "attribute", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public VehicleScheduleAttribute getAttribute() {
    return attribute;
  }

  public void setAttribute(VehicleScheduleAttribute attribute) {
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
    VehicleSchedule vehicleSchedule = (VehicleSchedule) o;
    return Objects.equals(this.dataModelType, vehicleSchedule.dataModelType) &&
        Objects.equals(this.attribute, vehicleSchedule.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSchedule {\n");
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

