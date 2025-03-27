package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import net.ouranos.domain.digiline.model.TrackBySipAttributeLogsSrvcPrv;
import net.ouranos.domain.digiline.model.TrackBySipAttributeShipFromPrty;
import net.ouranos.domain.digiline.model.TrackBySipAttributeShipToPrty;
import net.ouranos.domain.digiline.model.TrackBySipAttributeTrspIsr;
import net.ouranos.domain.digiline.model.TrackBySipAttributeTrspSrvc;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TrackBySipAttribute
 */

@JsonTypeName("TrackBySip_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-08T09:47:12.227334+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class TrackBySipAttribute {

  private Boolean isCreate;

  private TrackBySipAttributeTrspIsr trspIsr;

  private String mhReservationId;

  private TrackBySipAttributeTrspSrvc trspSrvc;

  private TrackBySipAttributeLogsSrvcPrv logsSrvcPrv;

  private TrackBySipAttributeShipFromPrty shipFromPrty;

  private TrackBySipAttributeShipToPrty shipToPrty;

  public TrackBySipAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackBySipAttribute(Boolean isCreate, TrackBySipAttributeTrspIsr trspIsr, String mhReservationId, TrackBySipAttributeTrspSrvc trspSrvc, TrackBySipAttributeLogsSrvcPrv logsSrvcPrv, TrackBySipAttributeShipFromPrty shipFromPrty, TrackBySipAttributeShipToPrty shipToPrty) {
    this.isCreate = isCreate;
    this.trspIsr = trspIsr;
    this.mhReservationId = mhReservationId;
    this.trspSrvc = trspSrvc;
    this.logsSrvcPrv = logsSrvcPrv;
    this.shipFromPrty = shipFromPrty;
    this.shipToPrty = shipToPrty;
  }

  public TrackBySipAttribute isCreate(Boolean isCreate) {
    this.isCreate = isCreate;
    return this;
  }

  /**
   * 新規作成の場合: true。更新場合：false
   * @return isCreate
  */
  @NotNull 
  @Schema(name = "is_create", example = "true", description = "新規作成の場合: true。更新場合：false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_create")
  public Boolean getIsCreate() {
    return isCreate;
  }

  public void setIsCreate(Boolean isCreate) {
    this.isCreate = isCreate;
  }

  public TrackBySipAttribute trspIsr(TrackBySipAttributeTrspIsr trspIsr) {
    this.trspIsr = trspIsr;
    return this;
  }

  /**
   * Get trspIsr
   * @return trspIsr
  */
  @NotNull @Valid 
  @Schema(name = "trsp_isr", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_isr")
  public TrackBySipAttributeTrspIsr getTrspIsr() {
    return trspIsr;
  }

  public void setTrspIsr(TrackBySipAttributeTrspIsr trspIsr) {
    this.trspIsr = trspIsr;
  }

  public TrackBySipAttribute mhReservationId(String mhReservationId) {
    this.mhReservationId = mhReservationId;
    return this;
  }

  /**
   * モビリティーハブ予約 ID
   * @return mhReservationId
  */
  @NotNull 
  @Schema(name = "mh_reservation_id", example = "A0JYEyM3-21453354856", description = "モビリティーハブ予約 ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mh_reservation_id")
  public String getMhReservationId() {
    return mhReservationId;
  }

  public void setMhReservationId(String mhReservationId) {
    this.mhReservationId = mhReservationId;
  }

  public TrackBySipAttribute trspSrvc(TrackBySipAttributeTrspSrvc trspSrvc) {
    this.trspSrvc = trspSrvc;
    return this;
  }

  /**
   * Get trspSrvc
   * @return trspSrvc
  */
  @NotNull @Valid 
  @Schema(name = "trsp_srvc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trsp_srvc")
  public TrackBySipAttributeTrspSrvc getTrspSrvc() {
    return trspSrvc;
  }

  public void setTrspSrvc(TrackBySipAttributeTrspSrvc trspSrvc) {
    this.trspSrvc = trspSrvc;
  }

  public TrackBySipAttribute logsSrvcPrv(TrackBySipAttributeLogsSrvcPrv logsSrvcPrv) {
    this.logsSrvcPrv = logsSrvcPrv;
    return this;
  }

  /**
   * Get logsSrvcPrv
   * @return logsSrvcPrv
  */
  @NotNull @Valid 
  @Schema(name = "logs_srvc_prv", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logs_srvc_prv")
  public TrackBySipAttributeLogsSrvcPrv getLogsSrvcPrv() {
    return logsSrvcPrv;
  }

  public void setLogsSrvcPrv(TrackBySipAttributeLogsSrvcPrv logsSrvcPrv) {
    this.logsSrvcPrv = logsSrvcPrv;
  }

  public TrackBySipAttribute shipFromPrty(TrackBySipAttributeShipFromPrty shipFromPrty) {
    this.shipFromPrty = shipFromPrty;
    return this;
  }

  /**
   * Get shipFromPrty
   * @return shipFromPrty
  */
  @NotNull @Valid 
  @Schema(name = "ship_from_prty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ship_from_prty")
  public TrackBySipAttributeShipFromPrty getShipFromPrty() {
    return shipFromPrty;
  }

  public void setShipFromPrty(TrackBySipAttributeShipFromPrty shipFromPrty) {
    this.shipFromPrty = shipFromPrty;
  }

  public TrackBySipAttribute shipToPrty(TrackBySipAttributeShipToPrty shipToPrty) {
    this.shipToPrty = shipToPrty;
    return this;
  }

  /**
   * Get shipToPrty
   * @return shipToPrty
  */
  @NotNull @Valid 
  @Schema(name = "ship_to_prty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ship_to_prty")
  public TrackBySipAttributeShipToPrty getShipToPrty() {
    return shipToPrty;
  }

  public void setShipToPrty(TrackBySipAttributeShipToPrty shipToPrty) {
    this.shipToPrty = shipToPrty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackBySipAttribute trackBySipAttribute = (TrackBySipAttribute) o;
    return Objects.equals(this.isCreate, trackBySipAttribute.isCreate) &&
        Objects.equals(this.trspIsr, trackBySipAttribute.trspIsr) &&
        Objects.equals(this.mhReservationId, trackBySipAttribute.mhReservationId) &&
        Objects.equals(this.trspSrvc, trackBySipAttribute.trspSrvc) &&
        Objects.equals(this.logsSrvcPrv, trackBySipAttribute.logsSrvcPrv) &&
        Objects.equals(this.shipFromPrty, trackBySipAttribute.shipFromPrty) &&
        Objects.equals(this.shipToPrty, trackBySipAttribute.shipToPrty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCreate, trspIsr, mhReservationId, trspSrvc, logsSrvcPrv, shipFromPrty, shipToPrty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackBySipAttribute {\n");
    sb.append("    isCreate: ").append(toIndentedString(isCreate)).append("\n");
    sb.append("    trspIsr: ").append(toIndentedString(trspIsr)).append("\n");
    sb.append("    mhReservationId: ").append(toIndentedString(mhReservationId)).append("\n");
    sb.append("    trspSrvc: ").append(toIndentedString(trspSrvc)).append("\n");
    sb.append("    logsSrvcPrv: ").append(toIndentedString(logsSrvcPrv)).append("\n");
    sb.append("    shipFromPrty: ").append(toIndentedString(shipFromPrty)).append("\n");
    sb.append("    shipToPrty: ").append(toIndentedString(shipToPrty)).append("\n");
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

