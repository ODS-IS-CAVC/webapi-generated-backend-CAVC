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
 * TrackBySipAttributeTrspIsr
 */

@JsonTypeName("TrackBySip_attribute_trsp_isr")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrackBySipAttributeTrspIsr {

  private String trspInstructionId;

  public TrackBySipAttributeTrspIsr() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackBySipAttributeTrspIsr(String trspInstructionId) {
    this.trspInstructionId = trspInstructionId;
  }

  public TrackBySipAttributeTrspIsr trspInstructionId(String trspInstructionId) {
    this.trspInstructionId = trspInstructionId;
    return this;
  }

  /**
   * Transport instruction ID
   * @return trspInstructionId
  */
  @NotNull @Size(min = 1, max = 20) 
  @Schema(name = "trsp_instruction_id", example = "1234567891234567890", description = "Transport instruction ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_instruction_id")
  public String getTrspInstructionId() {
    return trspInstructionId;
  }

  public void setTrspInstructionId(String trspInstructionId) {
    this.trspInstructionId = trspInstructionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackBySipAttributeTrspIsr trackBySipAttributeTrspIsr = (TrackBySipAttributeTrspIsr) o;
    return Objects.equals(this.trspInstructionId, trackBySipAttributeTrspIsr.trspInstructionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspInstructionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackBySipAttributeTrspIsr {\n");
    sb.append("    trspInstructionId: ").append(toIndentedString(trspInstructionId)).append("\n");
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

