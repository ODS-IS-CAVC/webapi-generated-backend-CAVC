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
import net.ouranos.domain.digiline.model.VehicleSchedulesAttributeVehicleScheduleTasksInnerDestination;
import net.ouranos.domain.digiline.model.VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VehicleSchedulesAttributeVehicleScheduleTasksInner
 */

@JsonTypeName("vehicle_schedules_attribute_vehicleScheduleTasks_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T09:39:30.965030300+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class VehicleSchedulesAttributeVehicleScheduleTasksInner {

  private UUID taskId;

  /**
   * スケジュールのタイプ
   */
  public enum TaskTypeEnum {
    MOVE("move");

    private String value;

    TaskTypeEnum(String value) {
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
    public static TaskTypeEnum fromValue(String value) {
      for (TaskTypeEnum b : TaskTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TaskTypeEnum taskType;

  /**
   * タスクのタイプ
   */
  public enum StatusEnum {
    TODO("todo"),
    
    DOING("doing"),
    
    DONE("done"),
    
    ABORTING("aborting"),
    
    ABORTED("aborted"),
    
    DISABLED("disabled");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin origin;

  private VehicleSchedulesAttributeVehicleScheduleTasksInnerDestination destination;

  @Valid
  private List<UUID> routeIds = new ArrayList<>();

  private String planStartTime;

  private String planEndTime;

  private String actualStartTime;

  private String actualEndTime;

  private Integer durationSec;

  private String description;

  public VehicleSchedulesAttributeVehicleScheduleTasksInner taskId(UUID taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * 実行タスクのID
   * @return taskId
  */
  @Valid
  @Schema(name = "taskId", description = "実行タスクのID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public UUID getTaskId() {
    return taskId;
  }

  public void setTaskId(UUID taskId) {
    this.taskId = taskId;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner taskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
    return this;
  }

  /**
   * スケジュールのタイプ
   * @return taskType
  */
  
  @Schema(name = "taskType", example = "move", description = "スケジュールのタイプ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskType")
  public TaskTypeEnum getTaskType() {
    return taskType;
  }

  public void setTaskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * タスクのタイプ
   * @return status
  */
  
  @Schema(name = "status", example = "done", description = "タスクのタイプ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner origin(VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  @Valid 
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("origin")
  public VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(VehicleSchedulesAttributeVehicleScheduleTasksInnerOrigin origin) {
    this.origin = origin;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner destination(VehicleSchedulesAttributeVehicleScheduleTasksInnerDestination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @Valid 
  @Schema(name = "destination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination")
  public VehicleSchedulesAttributeVehicleScheduleTasksInnerDestination getDestination() {
    return destination;
  }

  public void setDestination(VehicleSchedulesAttributeVehicleScheduleTasksInnerDestination destination) {
    this.destination = destination;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner routeIds(List<UUID> routeIds) {
    this.routeIds = routeIds;
    return this;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner addRouteIdsItem(UUID routeIdsItem) {
    if (this.routeIds == null) {
      this.routeIds = new ArrayList<>();
    }
    this.routeIds.add(routeIdsItem);
    return this;
  }

  /**
   * Array of route identifiers of the task.
   * @return routeIds
  */
  @Valid @Size(min = 0, max = 100) 
  @Schema(name = "routeIds", description = "Array of route identifiers of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routeIds")
  public List<UUID> getRouteIds() {
    return routeIds;
  }

  public void setRouteIds(List<UUID> routeIds) {
    this.routeIds = routeIds;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner planStartTime(String planStartTime) {
    this.planStartTime = planStartTime;
    return this;
  }

  /**
   * タスクの予定開始時間
   * @return planStartTime
  */
  
  @Schema(name = "planStartTime", example = "2014-10-10T04:50:40.000001+00:00", description = "タスクの予定開始時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planStartTime")
  public String getPlanStartTime() {
    return planStartTime;
  }

  public void setPlanStartTime(String planStartTime) {
    this.planStartTime = planStartTime;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner planEndTime(String planEndTime) {
    this.planEndTime = planEndTime;
    return this;
  }

  /**
   * タスクの予定終了時間
   * @return planEndTime
  */
  
  @Schema(name = "planEndTime", example = "2014-10-10T04:50:40.000001+00:00", description = "タスクの予定終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planEndTime")
  public String getPlanEndTime() {
    return planEndTime;
  }

  public void setPlanEndTime(String planEndTime) {
    this.planEndTime = planEndTime;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner actualStartTime(String actualStartTime) {
    this.actualStartTime = actualStartTime;
    return this;
  }

  /**
   * タスクの実績開始時間
   * @return actualStartTime
  */
  
  @Schema(name = "actualStartTime", example = "2014-10-10T04:50:40.000001+00:00", description = "タスクの実績開始時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualStartTime")
  public String getActualStartTime() {
    return actualStartTime;
  }

  public void setActualStartTime(String actualStartTime) {
    this.actualStartTime = actualStartTime;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner actualEndTime(String actualEndTime) {
    this.actualEndTime = actualEndTime;
    return this;
  }

  /**
   * タスクの実績終了時間
   * @return actualEndTime
  */
  
  @Schema(name = "actualEndTime", example = "2014-10-10T04:50:40.000001+00:00", description = "タスクの実績終了時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualEndTime")
  public String getActualEndTime() {
    return actualEndTime;
  }

  public void setActualEndTime(String actualEndTime) {
    this.actualEndTime = actualEndTime;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner durationSec(Integer durationSec) {
    this.durationSec = durationSec;
    return this;
  }

  /**
   * タスクの予定開始時間からタスクの予定終了時間の秒数
   * @return durationSec
  */
  
  @Schema(name = "durationSec", example = "300", description = "タスクの予定開始時間からタスクの予定終了時間の秒数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationSec")
  public Integer getDurationSec() {
    return durationSec;
  }

  public void setDurationSec(Integer durationSec) {
    this.durationSec = durationSec;
  }

  public VehicleSchedulesAttributeVehicleScheduleTasksInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * お客様のサービスにおいて、車両がどのようなアクションに特化しているかを識別するための説明。
   * @return description
  */
  
  @Schema(name = "description", example = "pickup", description = "お客様のサービスにおいて、車両がどのようなアクションに特化しているかを識別するための説明。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleSchedulesAttributeVehicleScheduleTasksInner vehicleSchedulesAttributeVehicleScheduleTasksInner = (VehicleSchedulesAttributeVehicleScheduleTasksInner) o;
    return Objects.equals(this.taskId, vehicleSchedulesAttributeVehicleScheduleTasksInner.taskId) &&
        Objects.equals(this.taskType, vehicleSchedulesAttributeVehicleScheduleTasksInner.taskType) &&
        Objects.equals(this.status, vehicleSchedulesAttributeVehicleScheduleTasksInner.status) &&
        Objects.equals(this.origin, vehicleSchedulesAttributeVehicleScheduleTasksInner.origin) &&
        Objects.equals(this.destination, vehicleSchedulesAttributeVehicleScheduleTasksInner.destination) &&
        Objects.equals(this.routeIds, vehicleSchedulesAttributeVehicleScheduleTasksInner.routeIds) &&
        Objects.equals(this.planStartTime, vehicleSchedulesAttributeVehicleScheduleTasksInner.planStartTime) &&
        Objects.equals(this.planEndTime, vehicleSchedulesAttributeVehicleScheduleTasksInner.planEndTime) &&
        Objects.equals(this.actualStartTime, vehicleSchedulesAttributeVehicleScheduleTasksInner.actualStartTime) &&
        Objects.equals(this.actualEndTime, vehicleSchedulesAttributeVehicleScheduleTasksInner.actualEndTime) &&
        Objects.equals(this.durationSec, vehicleSchedulesAttributeVehicleScheduleTasksInner.durationSec) &&
        Objects.equals(this.description, vehicleSchedulesAttributeVehicleScheduleTasksInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, taskType, status, origin, destination, routeIds, planStartTime, planEndTime, actualStartTime, actualEndTime, durationSec, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSchedulesAttributeVehicleScheduleTasksInner {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    routeIds: ").append(toIndentedString(routeIds)).append("\n");
    sb.append("    planStartTime: ").append(toIndentedString(planStartTime)).append("\n");
    sb.append("    planEndTime: ").append(toIndentedString(planEndTime)).append("\n");
    sb.append("    actualStartTime: ").append(toIndentedString(actualStartTime)).append("\n");
    sb.append("    actualEndTime: ").append(toIndentedString(actualEndTime)).append("\n");
    sb.append("    durationSec: ").append(toIndentedString(durationSec)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

