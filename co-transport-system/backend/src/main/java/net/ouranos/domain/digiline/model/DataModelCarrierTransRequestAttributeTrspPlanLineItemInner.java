package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerRoadCarr;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc;
import net.ouranos.domain.digiline.model.DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms;
import net.ouranos.domain.digiline.model.DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DataModelCarrierTransRequestAttributeTrspPlanLineItemInner
 */

@JsonTypeName("dataModel_carrier_trans_request_attribute_trsp_plan_line_item_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeTrspPlanLineItemInner {

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr trspIsr;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspSrvc;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms trspVehicleTrms;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo delInfo;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns cns;

  @Valid
  private List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner> cnsLineItem = new ArrayList<>();

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPrty;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPrty;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrty;

  private DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrv;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerRoadCarr roadCarr;

  private DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToPrty;

  @Valid
  private List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner> shipFromPrty = new ArrayList<>();

  @Valid
  private List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner> shipToPrty = new ArrayList<>();

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr trspIsr, DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns cns) {
    this.trspIsr = trspIsr;
    this.cns = cns;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner trspIsr(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr trspIsr) {
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
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr getTrspIsr() {
    return trspIsr;
  }

  public void setTrspIsr(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspIsr trspIsr) {
    this.trspIsr = trspIsr;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner trspSrvc(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspSrvc) {
    this.trspSrvc = trspSrvc;
    return this;
  }

  /**
   * Get trspSrvc
   * @return trspSrvc
  */
  @Valid 
  @Schema(name = "trsp_srvc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_srvc")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc getTrspSrvc() {
    return trspSrvc;
  }

  public void setTrspSrvc(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspSrvc trspSrvc) {
    this.trspSrvc = trspSrvc;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner trspVehicleTrms(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms trspVehicleTrms) {
    this.trspVehicleTrms = trspVehicleTrms;
    return this;
  }

  /**
   * Get trspVehicleTrms
   * @return trspVehicleTrms
  */
  @Valid 
  @Schema(name = "trsp_vehicle_trms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_vehicle_trms")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms getTrspVehicleTrms() {
    return trspVehicleTrms;
  }

  public void setTrspVehicleTrms(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspVehicleTrms trspVehicleTrms) {
    this.trspVehicleTrms = trspVehicleTrms;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner delInfo(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo delInfo) {
    this.delInfo = delInfo;
    return this;
  }

  /**
   * Get delInfo
   * @return delInfo
  */
  @Valid 
  @Schema(name = "del_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("del_info")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo getDelInfo() {
    return delInfo;
  }

  public void setDelInfo(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerDelInfo delInfo) {
    this.delInfo = delInfo;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner cns(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns cns) {
    this.cns = cns;
    return this;
  }

  /**
   * Get cns
   * @return cns
  */
  @NotNull @Valid 
  @Schema(name = "cns", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cns")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns getCns() {
    return cns;
  }

  public void setCns(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCns cns) {
    this.cns = cns;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner cnsLineItem(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner> cnsLineItem) {
    this.cnsLineItem = cnsLineItem;
    return this;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner addCnsLineItemItem(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner cnsLineItemItem) {
    if (this.cnsLineItem == null) {
      this.cnsLineItem = new ArrayList<>();
    }
    this.cnsLineItem.add(cnsLineItemItem);
    return this;
  }

  /**
   * 貨物明細
   * @return cnsLineItem
  */
  @Valid 
  @Schema(name = "cns_line_item", description = "貨物明細", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cns_line_item")
  public List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner> getCnsLineItem() {
    return cnsLineItem;
  }

  public void setCnsLineItem(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsLineItemInner> cnsLineItem) {
    this.cnsLineItem = cnsLineItem;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner cnsgPrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPrty) {
    this.cnsgPrty = cnsgPrty;
    return this;
  }

  /**
   * Get cnsgPrty
   * @return cnsgPrty
  */
  @Valid 
  @Schema(name = "cnsg_prty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnsg_prty")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty getCnsgPrty() {
    return cnsgPrty;
  }

  public void setCnsgPrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCnsgPrty cnsgPrty) {
    this.cnsgPrty = cnsgPrty;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner trspRqrPrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPrty) {
    this.trspRqrPrty = trspRqrPrty;
    return this;
  }

  /**
   * Get trspRqrPrty
   * @return trspRqrPrty
  */
  @Valid 
  @Schema(name = "trsp_rqr_prty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trsp_rqr_prty")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty getTrspRqrPrty() {
    return trspRqrPrty;
  }

  public void setTrspRqrPrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerTrspRqrPrty trspRqrPrty) {
    this.trspRqrPrty = trspRqrPrty;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner cneePrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrty) {
    this.cneePrty = cneePrty;
    return this;
  }

  /**
   * Get cneePrty
   * @return cneePrty
  */
  @Valid 
  @Schema(name = "cnee_prty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cnee_prty")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty getCneePrty() {
    return cneePrty;
  }

  public void setCneePrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerCneePrty cneePrty) {
    this.cneePrty = cneePrty;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner logsSrvcPrv(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrv) {
    this.logsSrvcPrv = logsSrvcPrv;
    return this;
  }

  /**
   * Get logsSrvcPrv
   * @return logsSrvcPrv
  */
  @Valid 
  @Schema(name = "logs_srvc_prv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs_srvc_prv")
  public DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv getLogsSrvcPrv() {
    return logsSrvcPrv;
  }

  public void setLogsSrvcPrv(DataModelShipperTransCapacityAttributeTrspAbilityLineItemInnerLogsSrvcPrv logsSrvcPrv) {
    this.logsSrvcPrv = logsSrvcPrv;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner roadCarr(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerRoadCarr roadCarr) {
    this.roadCarr = roadCarr;
    return this;
  }

  /**
   * Get roadCarr
   * @return roadCarr
  */
  @Valid 
  @Schema(name = "road_carr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("road_carr")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerRoadCarr getRoadCarr() {
    return roadCarr;
  }

  public void setRoadCarr(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerRoadCarr roadCarr) {
    this.roadCarr = roadCarr;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner fretClimToPrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToPrty) {
    this.fretClimToPrty = fretClimToPrty;
    return this;
  }

  /**
   * Get fretClimToPrty
   * @return fretClimToPrty
  */
  @Valid 
  @Schema(name = "fret_clim_to_prty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fret_clim_to_prty")
  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty getFretClimToPrty() {
    return fretClimToPrty;
  }

  public void setFretClimToPrty(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerFretClimToPrty fretClimToPrty) {
    this.fretClimToPrty = fretClimToPrty;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner shipFromPrty(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner> shipFromPrty) {
    this.shipFromPrty = shipFromPrty;
    return this;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner addShipFromPrtyItem(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner shipFromPrtyItem) {
    if (this.shipFromPrty == null) {
      this.shipFromPrty = new ArrayList<>();
    }
    this.shipFromPrty.add(shipFromPrtyItem);
    return this;
  }

  /**
   * 出荷場所
   * @return shipFromPrty
  */
  @Valid 
  @Schema(name = "ship_from_prty", description = "出荷場所", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_from_prty")
  public List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner> getShipFromPrty() {
    return shipFromPrty;
  }

  public void setShipFromPrty(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipFromPrtyInner> shipFromPrty) {
    this.shipFromPrty = shipFromPrty;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner shipToPrty(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner> shipToPrty) {
    this.shipToPrty = shipToPrty;
    return this;
  }

  public DataModelCarrierTransRequestAttributeTrspPlanLineItemInner addShipToPrtyItem(DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner shipToPrtyItem) {
    if (this.shipToPrty == null) {
      this.shipToPrty = new ArrayList<>();
    }
    this.shipToPrty.add(shipToPrtyItem);
    return this;
  }

  /**
   * 荷届先
   * @return shipToPrty
  */
  @Valid 
  @Schema(name = "ship_to_prty", description = "荷届先", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ship_to_prty")
  public List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner> getShipToPrty() {
    return shipToPrty;
  }

  public void setShipToPrty(List<@Valid DataModelCarrierTransRequestAttributeTrspPlanLineItemInnerShipToPrtyInner> shipToPrty) {
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
    DataModelCarrierTransRequestAttributeTrspPlanLineItemInner dataModelCarrierTransRequestAttributeTrspPlanLineItemInner = (DataModelCarrierTransRequestAttributeTrspPlanLineItemInner) o;
    return Objects.equals(this.trspIsr, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.trspIsr) &&
        Objects.equals(this.trspSrvc, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.trspSrvc) &&
        Objects.equals(this.trspVehicleTrms, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.trspVehicleTrms) &&
        Objects.equals(this.delInfo, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.delInfo) &&
        Objects.equals(this.cns, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.cns) &&
        Objects.equals(this.cnsLineItem, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.cnsLineItem) &&
        Objects.equals(this.cnsgPrty, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.cnsgPrty) &&
        Objects.equals(this.trspRqrPrty, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.trspRqrPrty) &&
        Objects.equals(this.cneePrty, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.cneePrty) &&
        Objects.equals(this.logsSrvcPrv, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.logsSrvcPrv) &&
        Objects.equals(this.roadCarr, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.roadCarr) &&
        Objects.equals(this.fretClimToPrty, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.fretClimToPrty) &&
        Objects.equals(this.shipFromPrty, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.shipFromPrty) &&
        Objects.equals(this.shipToPrty, dataModelCarrierTransRequestAttributeTrspPlanLineItemInner.shipToPrty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trspIsr, trspSrvc, trspVehicleTrms, delInfo, cns, cnsLineItem, cnsgPrty, trspRqrPrty, cneePrty, logsSrvcPrv, roadCarr, fretClimToPrty, shipFromPrty, shipToPrty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeTrspPlanLineItemInner {\n");
    sb.append("    trspIsr: ").append(toIndentedString(trspIsr)).append("\n");
    sb.append("    trspSrvc: ").append(toIndentedString(trspSrvc)).append("\n");
    sb.append("    trspVehicleTrms: ").append(toIndentedString(trspVehicleTrms)).append("\n");
    sb.append("    delInfo: ").append(toIndentedString(delInfo)).append("\n");
    sb.append("    cns: ").append(toIndentedString(cns)).append("\n");
    sb.append("    cnsLineItem: ").append(toIndentedString(cnsLineItem)).append("\n");
    sb.append("    cnsgPrty: ").append(toIndentedString(cnsgPrty)).append("\n");
    sb.append("    trspRqrPrty: ").append(toIndentedString(trspRqrPrty)).append("\n");
    sb.append("    cneePrty: ").append(toIndentedString(cneePrty)).append("\n");
    sb.append("    logsSrvcPrv: ").append(toIndentedString(logsSrvcPrv)).append("\n");
    sb.append("    roadCarr: ").append(toIndentedString(roadCarr)).append("\n");
    sb.append("    fretClimToPrty: ").append(toIndentedString(fretClimToPrty)).append("\n");
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

