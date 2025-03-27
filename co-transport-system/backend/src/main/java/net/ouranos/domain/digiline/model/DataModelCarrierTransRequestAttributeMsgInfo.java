package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * メッセージ情報
 */

@Schema(name = "dataModel_carrier_trans_request_attribute_msg_info", description = "メッセージ情報")
@JsonTypeName("dataModel_carrier_trans_request_attribute_msg_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-14T18:57:19.970999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class DataModelCarrierTransRequestAttributeMsgInfo {

  private BigDecimal msgId;

  private String msgInfoClsTypCd;

  private String msgDateIssDttm;

  private BigDecimal msgTimeIssDttm;

  private String msgFnStasCd;

  private String noteDcptTxt;

  public DataModelCarrierTransRequestAttributeMsgInfo msgId(BigDecimal msgId) {
    this.msgId = msgId;
    return this;
  }

  /**
   * データ処理ＮＯ．
   * @return msgId
  */
  @Valid 
  @Schema(name = "msg_id", example = "1", description = "データ処理ＮＯ．", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_id")
  public BigDecimal getMsgId() {
    return msgId;
  }

  public void setMsgId(BigDecimal msgId) {
    this.msgId = msgId;
  }

  public DataModelCarrierTransRequestAttributeMsgInfo msgInfoClsTypCd(String msgInfoClsTypCd) {
    this.msgInfoClsTypCd = msgInfoClsTypCd;
    return this;
  }

  /**
   * 情報区分コード
   * @return msgInfoClsTypCd
  */
  
  @Schema(name = "msg_info_cls_typ_cd", example = "3012", description = "情報区分コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_info_cls_typ_cd")
  public String getMsgInfoClsTypCd() {
    return msgInfoClsTypCd;
  }

  public void setMsgInfoClsTypCd(String msgInfoClsTypCd) {
    this.msgInfoClsTypCd = msgInfoClsTypCd;
  }

  public DataModelCarrierTransRequestAttributeMsgInfo msgDateIssDttm(String msgDateIssDttm) {
    this.msgDateIssDttm = msgDateIssDttm;
    return this;
  }

  /**
   * データ作成日
   * @return msgDateIssDttm
  */
  
  @Schema(name = "msg_date_iss_dttm", example = "20241024", description = "データ作成日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_date_iss_dttm")
  public String getMsgDateIssDttm() {
    return msgDateIssDttm;
  }

  public void setMsgDateIssDttm(String msgDateIssDttm) {
    this.msgDateIssDttm = msgDateIssDttm;
  }

  public DataModelCarrierTransRequestAttributeMsgInfo msgTimeIssDttm(BigDecimal msgTimeIssDttm) {
    this.msgTimeIssDttm = msgTimeIssDttm;
    return this;
  }

  /**
   * データ作成時刻
   * @return msgTimeIssDttm
  */
  @Valid 
  @Schema(name = "msg_time_iss_dttm", example = "134351", description = "データ作成時刻", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_time_iss_dttm")
  public BigDecimal getMsgTimeIssDttm() {
    return msgTimeIssDttm;
  }

  public void setMsgTimeIssDttm(BigDecimal msgTimeIssDttm) {
    this.msgTimeIssDttm = msgTimeIssDttm;
  }

  public DataModelCarrierTransRequestAttributeMsgInfo msgFnStasCd(String msgFnStasCd) {
    this.msgFnStasCd = msgFnStasCd;
    return this;
  }

  /**
   * 訂正コード
   * @return msgFnStasCd
  */
  
  @Schema(name = "msg_fn_stas_cd", example = "1", description = "訂正コード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_fn_stas_cd")
  public String getMsgFnStasCd() {
    return msgFnStasCd;
  }

  public void setMsgFnStasCd(String msgFnStasCd) {
    this.msgFnStasCd = msgFnStasCd;
  }

  public DataModelCarrierTransRequestAttributeMsgInfo noteDcptTxt(String noteDcptTxt) {
    this.noteDcptTxt = noteDcptTxt;
    return this;
  }

  /**
   * 備考（漢字）
   * @return noteDcptTxt
  */
  
  @Schema(name = "note_dcpt_txt", description = "備考（漢字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note_dcpt_txt")
  public String getNoteDcptTxt() {
    return noteDcptTxt;
  }

  public void setNoteDcptTxt(String noteDcptTxt) {
    this.noteDcptTxt = noteDcptTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelCarrierTransRequestAttributeMsgInfo dataModelCarrierTransRequestAttributeMsgInfo = (DataModelCarrierTransRequestAttributeMsgInfo) o;
    return Objects.equals(this.msgId, dataModelCarrierTransRequestAttributeMsgInfo.msgId) &&
        Objects.equals(this.msgInfoClsTypCd, dataModelCarrierTransRequestAttributeMsgInfo.msgInfoClsTypCd) &&
        Objects.equals(this.msgDateIssDttm, dataModelCarrierTransRequestAttributeMsgInfo.msgDateIssDttm) &&
        Objects.equals(this.msgTimeIssDttm, dataModelCarrierTransRequestAttributeMsgInfo.msgTimeIssDttm) &&
        Objects.equals(this.msgFnStasCd, dataModelCarrierTransRequestAttributeMsgInfo.msgFnStasCd) &&
        Objects.equals(this.noteDcptTxt, dataModelCarrierTransRequestAttributeMsgInfo.noteDcptTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgId, msgInfoClsTypCd, msgDateIssDttm, msgTimeIssDttm, msgFnStasCd, noteDcptTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelCarrierTransRequestAttributeMsgInfo {\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    msgInfoClsTypCd: ").append(toIndentedString(msgInfoClsTypCd)).append("\n");
    sb.append("    msgDateIssDttm: ").append(toIndentedString(msgDateIssDttm)).append("\n");
    sb.append("    msgTimeIssDttm: ").append(toIndentedString(msgTimeIssDttm)).append("\n");
    sb.append("    msgFnStasCd: ").append(toIndentedString(msgFnStasCd)).append("\n");
    sb.append("    noteDcptTxt: ").append(toIndentedString(noteDcptTxt)).append("\n");
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

