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
 * C-2-2[B] 空間IDデータモデル
 */

@Schema(name = "voxel", description = "C-2-2[B] 空間IDデータモデル")
@JsonTypeName("voxel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T18:57:36.150327600+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class Voxel {

  private BigDecimal x;

  private BigDecimal y;

  private BigDecimal z;

  private BigDecimal f;

  public Voxel x(BigDecimal x) {
    this.x = x;
    return this;
  }

  /**
   * x（東西方向）インデックス
   * minimum: 0
   * maximum: 2147483647
   * @return x
  */
  @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "x", example = "651", description = "x（東西方向）インデックス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x")
  public BigDecimal getX() {
    return x;
  }

  public void setX(BigDecimal x) {
    this.x = x;
  }

  public Voxel y(BigDecimal y) {
    this.y = y;
    return this;
  }

  /**
   * y（南北方向）インデックス
   * minimum: 0
   * maximum: 2147483647
   * @return y
  */
  @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "y", example = "3521", description = "y（南北方向）インデックス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("y")
  public BigDecimal getY() {
    return y;
  }

  public void setY(BigDecimal y) {
    this.y = y;
  }

  public Voxel z(BigDecimal z) {
    this.z = z;
    return this;
  }

  /**
   * ズームレベル
   * minimum: 0
   * maximum: 2147483647
   * @return z
  */
  @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "z", example = "25", description = "ズームレベル", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("z")
  public BigDecimal getZ() {
    return z;
  }

  public void setZ(BigDecimal z) {
    this.z = z;
  }

  public Voxel f(BigDecimal f) {
    this.f = f;
    return this;
  }

  /**
   * 鉛直方向インデックス
   * minimum: 0
   * maximum: 2147483647
   * @return f
  */
  @Valid @DecimalMin("0") @DecimalMax("2147483647") 
  @Schema(name = "f", example = "0", description = "鉛直方向インデックス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f")
  public BigDecimal getF() {
    return f;
  }

  public void setF(BigDecimal f) {
    this.f = f;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Voxel voxel = (Voxel) o;
    return Objects.equals(this.x, voxel.x) &&
        Objects.equals(this.y, voxel.y) &&
        Objects.equals(this.z, voxel.z) &&
        Objects.equals(this.f, voxel.f);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, f);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voxel {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
    sb.append("    f: ").append(toIndentedString(f)).append("\n");
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

