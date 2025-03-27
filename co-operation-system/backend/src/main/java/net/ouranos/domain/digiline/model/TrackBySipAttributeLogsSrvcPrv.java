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
 * TrackBySipAttributeLogsSrvcPrv
 */

@JsonTypeName("TrackBySip_attribute_logs_srvc_prv")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrackBySipAttributeLogsSrvcPrv {

  private String logsSrvcPrvPrtyNameTxt;

  public TrackBySipAttributeLogsSrvcPrv() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackBySipAttributeLogsSrvcPrv(String logsSrvcPrvPrtyNameTxt) {
    this.logsSrvcPrvPrtyNameTxt = logsSrvcPrvPrtyNameTxt;
  }

  public TrackBySipAttributeLogsSrvcPrv logsSrvcPrvPrtyNameTxt(String logsSrvcPrvPrtyNameTxt) {
    this.logsSrvcPrvPrtyNameTxt = logsSrvcPrvPrtyNameTxt;
    return this;
  }

  /**
   * Logistics service provider name
   * @return logsSrvcPrvPrtyNameTxt
  */
  @NotNull @Size(min = 1, max = 320) 
  @Schema(name = "logs_srvc_prv_prty_name_txt", example = "ABC Service Provider", description = "Logistics service provider name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logs_srvc_prv_prty_name_txt")
  public String getLogsSrvcPrvPrtyNameTxt() {
    return logsSrvcPrvPrtyNameTxt;
  }

  public void setLogsSrvcPrvPrtyNameTxt(String logsSrvcPrvPrtyNameTxt) {
    this.logsSrvcPrvPrtyNameTxt = logsSrvcPrvPrtyNameTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackBySipAttributeLogsSrvcPrv trackBySipAttributeLogsSrvcPrv = (TrackBySipAttributeLogsSrvcPrv) o;
    return Objects.equals(this.logsSrvcPrvPrtyNameTxt, trackBySipAttributeLogsSrvcPrv.logsSrvcPrvPrtyNameTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logsSrvcPrvPrtyNameTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackBySipAttributeLogsSrvcPrv {\n");
    sb.append("    logsSrvcPrvPrtyNameTxt: ").append(toIndentedString(logsSrvcPrvPrtyNameTxt)).append("\n");
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

