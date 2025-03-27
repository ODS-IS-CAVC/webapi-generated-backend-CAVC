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
 * Estimated time of arrival included only if delay. Otherwise null.
 */

@Schema(name = "TrspSrvc_trsp_delay", description = "Estimated time of arrival included only if delay. Otherwise null.")
@JsonTypeName("TrspSrvc_trsp_delay")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrspSrvcTrspDelay {

  private String trspEtaDate;

  private String trspEtaTime;

  public TrspSrvcTrspDelay trspEtaDate(String trspEtaDate) {
    this.trspEtaDate = trspEtaDate;
    return this;
  }

  /**
   * Estimated time of arrival date. JST. yyyyMMdd
   * @return trspEtaDate
  */
  @Pattern(regexp = "^\\d{8}$") 
  @Schema(name = "trsp_eta_date", example = "20241113", description = "Estimated time of arrival date. JST. yyyyMMdd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_eta_date")
  public String getTrspEtaDate() {
    return trspEtaDate;
  }

  public void setTrspEtaDate(String trspEtaDate) {
    this.trspEtaDate = trspEtaDate;
  }

  public TrspSrvcTrspDelay trspEtaTime(String trspEtaTime) {
    this.trspEtaTime = trspEtaTime;
    return this;
  }

  /**
   * Estimated time of arrival time. JST. 24-hour notation. HHmm
   * @return trspEtaTime
  */
  @Pattern(regexp = "^\\d{4}$") 
  @Schema(name = "trsp_eta_time", example = "1556", description = "Estimated time of arrival time. JST. 24-hour notation. HHmm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_eta_time")
  public String getTrspEtaTime() {
    return trspEtaTime;
  }

  public void setTrspEtaTime(String trspEtaTime) {
    this.trspEtaTime = trspEtaTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrspSrvcTrspDelay trspSrvcTrspDelay = (TrspSrvcTrspDelay) o;
    return Objects.equals(this.trspEtaDate, trspSrvcTrspDelay.trspEtaDate) &&
        Objects.equals(this.trspEtaTime, trspSrvcTrspDelay.trspEtaTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspEtaDate, trspEtaTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrspSrvcTrspDelay {\n");
    sb.append("    trspEtaDate: ").append(toIndentedString(trspEtaDate)).append("\n");
    sb.append("    trspEtaTime: ").append(toIndentedString(trspEtaTime)).append("\n");
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

