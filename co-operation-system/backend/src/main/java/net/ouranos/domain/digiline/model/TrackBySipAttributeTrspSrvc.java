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
 * Transport service. Pickup and dropoff time information.| 積荷日時と着荷日時。from と to の両方をは使わず、片方のみを使用します。
 */

@Schema(name = "TrackBySip_attribute_trsp_srvc", description = "Transport service. Pickup and dropoff time information.| 積荷日時と着荷日時。from と to の両方をは使わず、片方のみを使用します。")
@JsonTypeName("TrackBySip_attribute_trsp_srvc")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrackBySipAttributeTrspSrvc {

  private String dsedCllFromDate;

  private String dsedCllFromTime;

  private String apedArrFromDate;

  private String apedArrFromTimePrfmDttm;

  public TrackBySipAttributeTrspSrvc() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackBySipAttributeTrspSrvc(String dsedCllFromDate, String dsedCllFromTime, String apedArrFromDate, String apedArrFromTimePrfmDttm) {
    this.dsedCllFromDate = dsedCllFromDate;
    this.dsedCllFromTime = dsedCllFromTime;
    this.apedArrFromDate = apedArrFromDate;
    this.apedArrFromTimePrfmDttm = apedArrFromTimePrfmDttm;
  }

  public TrackBySipAttributeTrspSrvc dsedCllFromDate(String dsedCllFromDate) {
    this.dsedCllFromDate = dsedCllFromDate;
    return this;
  }

  /**
   * Pickup date
   * @return dsedCllFromDate
  */
  @NotNull @Pattern(regexp = "^[0-9]{8}$") 
  @Schema(name = "dsed_cll_from_date", example = "20241113", description = "Pickup date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dsed_cll_from_date")
  public String getDsedCllFromDate() {
    return dsedCllFromDate;
  }

  public void setDsedCllFromDate(String dsedCllFromDate) {
    this.dsedCllFromDate = dsedCllFromDate;
  }

  public TrackBySipAttributeTrspSrvc dsedCllFromTime(String dsedCllFromTime) {
    this.dsedCllFromTime = dsedCllFromTime;
    return this;
  }

  /**
   * Pickup time in hhmm format
   * @return dsedCllFromTime
  */
  @NotNull @Pattern(regexp = "^[0-9]{4}$") 
  @Schema(name = "dsed_cll_from_time", example = "0915", description = "Pickup time in hhmm format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dsed_cll_from_time")
  public String getDsedCllFromTime() {
    return dsedCllFromTime;
  }

  public void setDsedCllFromTime(String dsedCllFromTime) {
    this.dsedCllFromTime = dsedCllFromTime;
  }

  public TrackBySipAttributeTrspSrvc apedArrFromDate(String apedArrFromDate) {
    this.apedArrFromDate = apedArrFromDate;
    return this;
  }

  /**
   * Dropoff date
   * @return apedArrFromDate
  */
  @NotNull @Pattern(regexp = "^[0-9]{8}$") 
  @Schema(name = "aped_arr_from_date", example = "20241113", description = "Dropoff date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aped_arr_from_date")
  public String getApedArrFromDate() {
    return apedArrFromDate;
  }

  public void setApedArrFromDate(String apedArrFromDate) {
    this.apedArrFromDate = apedArrFromDate;
  }

  public TrackBySipAttributeTrspSrvc apedArrFromTimePrfmDttm(String apedArrFromTimePrfmDttm) {
    this.apedArrFromTimePrfmDttm = apedArrFromTimePrfmDttm;
    return this;
  }

  /**
   * Dropoff time in hhmm format
   * @return apedArrFromTimePrfmDttm
  */
  @NotNull @Pattern(regexp = "^[0-9]{4}$") 
  @Schema(name = "aped_arr_from_time_prfm_dttm", example = "1430", description = "Dropoff time in hhmm format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aped_arr_from_time_prfm_dttm")
  public String getApedArrFromTimePrfmDttm() {
    return apedArrFromTimePrfmDttm;
  }

  public void setApedArrFromTimePrfmDttm(String apedArrFromTimePrfmDttm) {
    this.apedArrFromTimePrfmDttm = apedArrFromTimePrfmDttm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackBySipAttributeTrspSrvc trackBySipAttributeTrspSrvc = (TrackBySipAttributeTrspSrvc) o;
    return Objects.equals(this.dsedCllFromDate, trackBySipAttributeTrspSrvc.dsedCllFromDate) &&
        Objects.equals(this.dsedCllFromTime, trackBySipAttributeTrspSrvc.dsedCllFromTime) &&
        Objects.equals(this.apedArrFromDate, trackBySipAttributeTrspSrvc.apedArrFromDate) &&
        Objects.equals(this.apedArrFromTimePrfmDttm, trackBySipAttributeTrspSrvc.apedArrFromTimePrfmDttm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsedCllFromDate, dsedCllFromTime, apedArrFromDate, apedArrFromTimePrfmDttm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackBySipAttributeTrspSrvc {\n");
    sb.append("    dsedCllFromDate: ").append(toIndentedString(dsedCllFromDate)).append("\n");
    sb.append("    dsedCllFromTime: ").append(toIndentedString(dsedCllFromTime)).append("\n");
    sb.append("    apedArrFromDate: ").append(toIndentedString(apedArrFromDate)).append("\n");
    sb.append("    apedArrFromTimePrfmDttm: ").append(toIndentedString(apedArrFromTimePrfmDttm)).append("\n");
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

