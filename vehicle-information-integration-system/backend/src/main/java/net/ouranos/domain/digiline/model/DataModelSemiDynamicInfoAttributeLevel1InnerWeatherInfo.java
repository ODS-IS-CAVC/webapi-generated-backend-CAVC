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
 * 気象情報
 */

@Schema(name = "dataModel_semiDynamicInfo_attribute_level1_inner_weatherInfo", description = "気象情報")
@JsonTypeName("dataModel_semiDynamicInfo_attribute_level1_inner_weatherInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-19T19:18:30.276175200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo {

  private String dateTime;

  private String weather;

  private Double temperature;

  private Double windDirection;

  private Double windSpeed;

  private Double humidity;

  private Double rainfall;

  private String updatedAt;

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * 気象情報の対象日時。
   * @return dateTime
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "dateTime", example = "2024/07/01 12:00:00", description = "気象情報の対象日時。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo weather(String weather) {
    this.weather = weather;
    return this;
  }

  /**
   * 天気。100=晴、200=曇、300=雨、400=雪、500=みぞれ、65535.0=不明
   * @return weather
  */
  
  @Schema(name = "weather", example = "100", description = "天気。100=晴、200=曇、300=雨、400=雪、500=みぞれ、65535.0=不明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weather")
  public String getWeather() {
    return weather;
  }

  public void setWeather(String weather) {
    this.weather = weather;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * 気温。単位=℃ 0.1刻み。65535.0=不明
   * @return temperature
  */
  
  @Schema(name = "temperature", example = "28.6", description = "気温。単位=℃ 0.1刻み。65535.0=不明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo windDirection(Double windDirection) {
    this.windDirection = windDirection;
    return this;
  }

  /**
   * 風向。単位=度 0.1刻み。65535.0=不明
   * @return windDirection
  */
  
  @Schema(name = "windDirection", example = "21.1", description = "風向。単位=度 0.1刻み。65535.0=不明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windDirection")
  public Double getWindDirection() {
    return windDirection;
  }

  public void setWindDirection(Double windDirection) {
    this.windDirection = windDirection;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo windSpeed(Double windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }

  /**
   * 風速。単位=m/s 0.1刻み。65535.0=不明
   * @return windSpeed
  */
  
  @Schema(name = "windSpeed", example = "2.7", description = "風速。単位=m/s 0.1刻み。65535.0=不明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windSpeed")
  public Double getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(Double windSpeed) {
    this.windSpeed = windSpeed;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo humidity(Double humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * 湿度。単位=% 0.1刻み。65535.0=不明
   * @return humidity
  */
  
  @Schema(name = "humidity", example = "65.0", description = "湿度。単位=% 0.1刻み。65535.0=不明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("humidity")
  public Double getHumidity() {
    return humidity;
  }

  public void setHumidity(Double humidity) {
    this.humidity = humidity;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo rainfall(Double rainfall) {
    this.rainfall = rainfall;
    return this;
  }

  /**
   * 時間降水量。単位=mm/h 0.1刻み。65535.0=不明
   * @return rainfall
  */
  
  @Schema(name = "rainfall", example = "0.5", description = "時間降水量。単位=mm/h 0.1刻み。65535.0=不明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rainfall")
  public Double getRainfall() {
    return rainfall;
  }

  public void setRainfall(Double rainfall) {
    this.rainfall = rainfall;
  }

  public DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * 気象情報の情報源からの受付日時。
   * @return updatedAt
  */
  @Pattern(regexp = "^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$") 
  @Schema(name = "updatedAt", example = "2024/07/01 12:01:15", description = "気象情報の情報源からの受付日時。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo = (DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo) o;
    return Objects.equals(this.dateTime, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.dateTime) &&
        Objects.equals(this.weather, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.weather) &&
        Objects.equals(this.temperature, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.temperature) &&
        Objects.equals(this.windDirection, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.windDirection) &&
        Objects.equals(this.windSpeed, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.windSpeed) &&
        Objects.equals(this.humidity, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.humidity) &&
        Objects.equals(this.rainfall, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.rainfall) &&
        Objects.equals(this.updatedAt, dataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, weather, temperature, windDirection, windSpeed, humidity, rainfall, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSemiDynamicInfoAttributeLevel1InnerWeatherInfo {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    windDirection: ").append(toIndentedString(windDirection)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    rainfall: ").append(toIndentedString(rainfall)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

