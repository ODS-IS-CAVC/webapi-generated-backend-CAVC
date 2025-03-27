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
import java.util.UUID;
import net.ouranos.domain.digiline.model.VehicleSchedulesAttributeVehicleScheduleTasksInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 自動運転車両のスケジュールのデータモデル
 */

@Schema(name = "vehicle_schedules_attribute", description = "自動運転車両のスケジュールのデータモデル")
@JsonTypeName("vehicle_schedules_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class VehicleSchedulesAttribute {

  private UUID vehicleScheduleId;

  private UUID vehicleId;

  /**
   * 車両のスケジュールステータス
   */
  public enum VehicleScheduleStatusEnum {
    TODO("todo"),
    
    DOING("doing"),
    
    DONE("done"),
    
    CANCELING("canceling"),
    
    CANCELED("canceled"),
    
    ABORTING("aborting"),
    
    ABORTED("aborted"),
    
    DISABLED("disabled");

    private String value;

    VehicleScheduleStatusEnum(String value) {
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
    public static VehicleScheduleStatusEnum fromValue(String value) {
      for (VehicleScheduleStatusEnum b : VehicleScheduleStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VehicleScheduleStatusEnum vehicleScheduleStatus;

  private String vehicleSchedulePlanStartTime;

  private String vehicleSchedulePlanEndTime;

  private String vehicleScheduleActualStartTime;

  private String vehicleScheduleActualEndTime;

  private Integer vehicleScheduleDurationSec;

  private Integer vehicleScheduleDeltaSec;

  @Valid
  private List<@Valid VehicleSchedulesAttributeVehicleScheduleTasksInner> vehicleScheduleTasks = new ArrayList<>();

  private String vehicleScheduleCreatedAt;

  private String vehicleScheduleUpdatedAt;

  public VehicleSchedulesAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleSchedulesAttribute(UUID vehicleScheduleId, UUID vehicleId, VehicleScheduleStatusEnum vehicleScheduleStatus, String vehicleSchedulePlanStartTime, Integer vehicleScheduleDeltaSec, List<@Valid VehicleSchedulesAttributeVehicleScheduleTasksInner> vehicleScheduleTasks, String vehicleScheduleCreatedAt, String vehicleScheduleUpdatedAt) {
    this.vehicleScheduleId = vehicleScheduleId;
    this.vehicleId = vehicleId;
    this.vehicleScheduleStatus = vehicleScheduleStatus;
    this.vehicleSchedulePlanStartTime = vehicleSchedulePlanStartTime;
    this.vehicleScheduleDeltaSec = vehicleScheduleDeltaSec;
    this.vehicleScheduleTasks = vehicleScheduleTasks;
    this.vehicleScheduleCreatedAt = vehicleScheduleCreatedAt;
    this.vehicleScheduleUpdatedAt = vehicleScheduleUpdatedAt;
  }

  public VehicleSchedulesAttribute vehicleScheduleId(UUID vehicleScheduleId) {
    this.vehicleScheduleId = vehicleScheduleId;
    return this;
  }

  /**
   * 車両のスケジュールのID
   * @return vehicleScheduleId
  */
  @NotNull @Valid
  @Schema(name = "vehicleScheduleId", description = "車両のスケジュールのID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleScheduleId")
  public UUID getVehicleScheduleId() {
    return vehicleScheduleId;
  }

  public void setVehicleScheduleId(UUID vehicleScheduleId) {
    this.vehicleScheduleId = vehicleScheduleId;
  }

  public VehicleSchedulesAttribute vehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * 自度運転車両のID
   * @return vehicleId
  */
  @NotNull @Valid  
  @Schema(name = "vehicleId", example = "78aa302c-1600-44b3-a331-e4659c0b28a1", description = "自度運転車両のID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleId")
  public UUID getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehicleSchedulesAttribute vehicleScheduleStatus(VehicleScheduleStatusEnum vehicleScheduleStatus) {
    this.vehicleScheduleStatus = vehicleScheduleStatus;
    return this;
  }

  /**
   * 車両のスケジュールステータス
   * @return vehicleScheduleStatus
  */
  @NotNull 
  @Schema(name = "vehicleScheduleStatus", example = "todo", description = "車両のスケジュールステータス", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleScheduleStatus")
  public VehicleScheduleStatusEnum getVehicleScheduleStatus() {
    return vehicleScheduleStatus;
  }

  public void setVehicleScheduleStatus(VehicleScheduleStatusEnum vehicleScheduleStatus) {
    this.vehicleScheduleStatus = vehicleScheduleStatus;
  }

  public VehicleSchedulesAttribute vehicleSchedulePlanStartTime(String vehicleSchedulePlanStartTime) {
    this.vehicleSchedulePlanStartTime = vehicleSchedulePlanStartTime;
    return this;
  }

  /**
   * 予定開始時間
   * @return vehicleSchedulePlanStartTime
  */
  @NotNull 
  @Schema(name = "vehicleSchedulePlanStartTime", example = "2014-10-10T04:50:40.000001+00:00", description = "予定開始時間", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleSchedulePlanStartTime")
  public String getVehicleSchedulePlanStartTime() {
    return vehicleSchedulePlanStartTime;
  }

  public void setVehicleSchedulePlanStartTime(String vehicleSchedulePlanStartTime) {
    this.vehicleSchedulePlanStartTime = vehicleSchedulePlanStartTime;
  }

  public VehicleSchedulesAttribute vehicleSchedulePlanEndTime(String vehicleSchedulePlanEndTime) {
    this.vehicleSchedulePlanEndTime = vehicleSchedulePlanEndTime;
    return this;
  }

  /**
   * 予定終了時間
   * @return vehicleSchedulePlanEndTime
  */
  
  @Schema(name = "vehicleSchedulePlanEndTime", example = "2014-10-10T04:50:40.000001+00:00", description = "予定終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleSchedulePlanEndTime")
  public String getVehicleSchedulePlanEndTime() {
    return vehicleSchedulePlanEndTime;
  }

  public void setVehicleSchedulePlanEndTime(String vehicleSchedulePlanEndTime) {
    this.vehicleSchedulePlanEndTime = vehicleSchedulePlanEndTime;
  }

  public VehicleSchedulesAttribute vehicleScheduleActualStartTime(String vehicleScheduleActualStartTime) {
    this.vehicleScheduleActualStartTime = vehicleScheduleActualStartTime;
    return this;
  }

  /**
   * 実績開始時間
   * @return vehicleScheduleActualStartTime
  */
  
  @Schema(name = "vehicleScheduleActualStartTime", example = "2014-10-10T04:50:40.000001+00:00", description = "実績開始時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleScheduleActualStartTime")
  public String getVehicleScheduleActualStartTime() {
    return vehicleScheduleActualStartTime;
  }

  public void setVehicleScheduleActualStartTime(String vehicleScheduleActualStartTime) {
    this.vehicleScheduleActualStartTime = vehicleScheduleActualStartTime;
  }

  public VehicleSchedulesAttribute vehicleScheduleActualEndTime(String vehicleScheduleActualEndTime) {
    this.vehicleScheduleActualEndTime = vehicleScheduleActualEndTime;
    return this;
  }

  /**
   * 実績終了時間
   * @return vehicleScheduleActualEndTime
  */
  
  @Schema(name = "vehicleScheduleActualEndTime", example = "2014-10-10T04:50:40.000001+00:00", description = "実績終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleScheduleActualEndTime")
  public String getVehicleScheduleActualEndTime() {
    return vehicleScheduleActualEndTime;
  }

  public void setVehicleScheduleActualEndTime(String vehicleScheduleActualEndTime) {
    this.vehicleScheduleActualEndTime = vehicleScheduleActualEndTime;
  }

  public VehicleSchedulesAttribute vehicleScheduleDurationSec(Integer vehicleScheduleDurationSec) {
    this.vehicleScheduleDurationSec = vehicleScheduleDurationSec;
    return this;
  }

  /**
   * 予定開始時間から予定終了時間の秒数
   * minimum: 0
   * @return vehicleScheduleDurationSec
  */
  @Min(0) 
  @Schema(name = "vehicleScheduleDurationSec", example = "300", description = "予定開始時間から予定終了時間の秒数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleScheduleDurationSec")
  public Integer getVehicleScheduleDurationSec() {
    return vehicleScheduleDurationSec;
  }

  public void setVehicleScheduleDurationSec(Integer vehicleScheduleDurationSec) {
    this.vehicleScheduleDurationSec = vehicleScheduleDurationSec;
  }

  public VehicleSchedulesAttribute vehicleScheduleDeltaSec(Integer vehicleScheduleDeltaSec) {
    this.vehicleScheduleDeltaSec = vehicleScheduleDeltaSec;
    return this;
  }

  /**
   * 予定時刻からの遅れや進捗を示す情報（単位：秒）。 正の値は実施が遅れていることを示し、負の値は早期に開始したことを示す、 0は予定通りであることを示す。
   * @return vehicleScheduleDeltaSec
  */
  @NotNull 
  @Schema(name = "vehicleScheduleDeltaSec", example = "300", description = "予定時刻からの遅れや進捗を示す情報（単位：秒）。 正の値は実施が遅れていることを示し、負の値は早期に開始したことを示す、 0は予定通りであることを示す。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleScheduleDeltaSec")
  public Integer getVehicleScheduleDeltaSec() {
    return vehicleScheduleDeltaSec;
  }

  public void setVehicleScheduleDeltaSec(Integer vehicleScheduleDeltaSec) {
    this.vehicleScheduleDeltaSec = vehicleScheduleDeltaSec;
  }

  public VehicleSchedulesAttribute vehicleScheduleTasks(List<@Valid VehicleSchedulesAttributeVehicleScheduleTasksInner> vehicleScheduleTasks) {
    this.vehicleScheduleTasks = vehicleScheduleTasks;
    return this;
  }

  public VehicleSchedulesAttribute addVehicleScheduleTasksItem(VehicleSchedulesAttributeVehicleScheduleTasksInner vehicleScheduleTasksItem) {
    if (this.vehicleScheduleTasks == null) {
      this.vehicleScheduleTasks = new ArrayList<>();
    }
    this.vehicleScheduleTasks.add(vehicleScheduleTasksItem);
    return this;
  }

  /**
   * スケジュールの実行タスクの配列
   * @return vehicleScheduleTasks
  */
  @NotNull @Valid @Size(min = 1, max = 10) 
  @Schema(name = "vehicleScheduleTasks", description = "スケジュールの実行タスクの配列", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleScheduleTasks")
  public List<@Valid VehicleSchedulesAttributeVehicleScheduleTasksInner> getVehicleScheduleTasks() {
    return vehicleScheduleTasks;
  }

  public void setVehicleScheduleTasks(List<@Valid VehicleSchedulesAttributeVehicleScheduleTasksInner> vehicleScheduleTasks) {
    this.vehicleScheduleTasks = vehicleScheduleTasks;
  }

  public VehicleSchedulesAttribute vehicleScheduleCreatedAt(String vehicleScheduleCreatedAt) {
    this.vehicleScheduleCreatedAt = vehicleScheduleCreatedAt;
    return this;
  }

  /**
   * スケジュールの作成時刻
   * @return vehicleScheduleCreatedAt
  */
  @NotNull 
  @Schema(name = "vehicleScheduleCreatedAt", example = "2014-10-10T04:50:40.000001+00:00", description = "スケジュールの作成時刻", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleScheduleCreatedAt")
  public String getVehicleScheduleCreatedAt() {
    return vehicleScheduleCreatedAt;
  }

  public void setVehicleScheduleCreatedAt(String vehicleScheduleCreatedAt) {
    this.vehicleScheduleCreatedAt = vehicleScheduleCreatedAt;
  }

  public VehicleSchedulesAttribute vehicleScheduleUpdatedAt(String vehicleScheduleUpdatedAt) {
    this.vehicleScheduleUpdatedAt = vehicleScheduleUpdatedAt;
    return this;
  }

  /**
   * スケジュールの更新時刻
   * @return vehicleScheduleUpdatedAt
  */
  @NotNull 
  @Schema(name = "vehicleScheduleUpdatedAt", example = "2014-10-10T04:50:40.000001+00:00", description = "スケジュールの更新時刻", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleScheduleUpdatedAt")
  public String getVehicleScheduleUpdatedAt() {
    return vehicleScheduleUpdatedAt;
  }

  public void setVehicleScheduleUpdatedAt(String vehicleScheduleUpdatedAt) {
    this.vehicleScheduleUpdatedAt = vehicleScheduleUpdatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleSchedulesAttribute vehicleSchedulesAttribute = (VehicleSchedulesAttribute) o;
    return Objects.equals(this.vehicleScheduleId, vehicleSchedulesAttribute.vehicleScheduleId) &&
        Objects.equals(this.vehicleId, vehicleSchedulesAttribute.vehicleId) &&
        Objects.equals(this.vehicleScheduleStatus, vehicleSchedulesAttribute.vehicleScheduleStatus) &&
        Objects.equals(this.vehicleSchedulePlanStartTime, vehicleSchedulesAttribute.vehicleSchedulePlanStartTime) &&
        Objects.equals(this.vehicleSchedulePlanEndTime, vehicleSchedulesAttribute.vehicleSchedulePlanEndTime) &&
        Objects.equals(this.vehicleScheduleActualStartTime, vehicleSchedulesAttribute.vehicleScheduleActualStartTime) &&
        Objects.equals(this.vehicleScheduleActualEndTime, vehicleSchedulesAttribute.vehicleScheduleActualEndTime) &&
        Objects.equals(this.vehicleScheduleDurationSec, vehicleSchedulesAttribute.vehicleScheduleDurationSec) &&
        Objects.equals(this.vehicleScheduleDeltaSec, vehicleSchedulesAttribute.vehicleScheduleDeltaSec) &&
        Objects.equals(this.vehicleScheduleTasks, vehicleSchedulesAttribute.vehicleScheduleTasks) &&
        Objects.equals(this.vehicleScheduleCreatedAt, vehicleSchedulesAttribute.vehicleScheduleCreatedAt) &&
        Objects.equals(this.vehicleScheduleUpdatedAt, vehicleSchedulesAttribute.vehicleScheduleUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleScheduleId, vehicleId, vehicleScheduleStatus, vehicleSchedulePlanStartTime, vehicleSchedulePlanEndTime, vehicleScheduleActualStartTime, vehicleScheduleActualEndTime, vehicleScheduleDurationSec, vehicleScheduleDeltaSec, vehicleScheduleTasks, vehicleScheduleCreatedAt, vehicleScheduleUpdatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSchedulesAttribute {\n");
    sb.append("    vehicleScheduleId: ").append(toIndentedString(vehicleScheduleId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vehicleScheduleStatus: ").append(toIndentedString(vehicleScheduleStatus)).append("\n");
    sb.append("    vehicleSchedulePlanStartTime: ").append(toIndentedString(vehicleSchedulePlanStartTime)).append("\n");
    sb.append("    vehicleSchedulePlanEndTime: ").append(toIndentedString(vehicleSchedulePlanEndTime)).append("\n");
    sb.append("    vehicleScheduleActualStartTime: ").append(toIndentedString(vehicleScheduleActualStartTime)).append("\n");
    sb.append("    vehicleScheduleActualEndTime: ").append(toIndentedString(vehicleScheduleActualEndTime)).append("\n");
    sb.append("    vehicleScheduleDurationSec: ").append(toIndentedString(vehicleScheduleDurationSec)).append("\n");
    sb.append("    vehicleScheduleDeltaSec: ").append(toIndentedString(vehicleScheduleDeltaSec)).append("\n");
    sb.append("    vehicleScheduleTasks: ").append(toIndentedString(vehicleScheduleTasks)).append("\n");
    sb.append("    vehicleScheduleCreatedAt: ").append(toIndentedString(vehicleScheduleCreatedAt)).append("\n");
    sb.append("    vehicleScheduleUpdatedAt: ").append(toIndentedString(vehicleScheduleUpdatedAt)).append("\n");
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

