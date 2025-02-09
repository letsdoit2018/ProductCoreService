
package com.letsdoit.core.product.domain;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prom_type",
    "active",
    "product_sku_id",
    "price",
    "prom_description"
})
@Generated("jsonschema2pojo")
@Builder
@Data
public class Promotion {

    @JsonProperty("prom_type")
    private String promType;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("product_sku_id")
    private String productSkuId;
    @JsonProperty("price")
    private String price;
    @JsonProperty("prom_description")
    private String promDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();

    @JsonProperty("prom_type")
    public String getPromType() {
        return promType;
    }

    @JsonProperty("prom_type")
    public void setPromType(String promType) {
        this.promType = promType;
    }

    public Promotion withPromType(String promType) {
        this.promType = promType;
        return this;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Promotion withActive(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("product_sku_id")
    public String getProductSkuId() {
        return productSkuId;
    }

    @JsonProperty("product_sku_id")
    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public Promotion withProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
        return this;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    public Promotion withPrice(String price) {
        this.price = price;
        return this;
    }

    @JsonProperty("prom_description")
    public String getPromDescription() {
        return promDescription;
    }

    @JsonProperty("prom_description")
    public void setPromDescription(String promDescription) {
        this.promDescription = promDescription;
    }

    public Promotion withPromDescription(String promDescription) {
        this.promDescription = promDescription;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Promotion withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Promotion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("promType");
        sb.append('=');
        sb.append(((this.promType == null)?"<null>":this.promType));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("productSkuId");
        sb.append('=');
        sb.append(((this.productSkuId == null)?"<null>":this.productSkuId));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("promDescription");
        sb.append('=');
        sb.append(((this.promDescription == null)?"<null>":this.promDescription));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.promType == null)? 0 :this.promType.hashCode()));
        result = ((result* 31)+((this.productSkuId == null)? 0 :this.productSkuId.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.promDescription == null)? 0 :this.promDescription.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Promotion) == false) {
            return false;
        }
        Promotion rhs = ((Promotion) other);
        return (((((((this.promType == rhs.promType)||((this.promType!= null)&&this.promType.equals(rhs.promType)))&&((this.productSkuId == rhs.productSkuId)||((this.productSkuId!= null)&&this.productSkuId.equals(rhs.productSkuId))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.promDescription == rhs.promDescription)||((this.promDescription!= null)&&this.promDescription.equals(rhs.promDescription))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }
}
