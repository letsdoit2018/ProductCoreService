
package com.letsdoit.core.product.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_master_id",
    "product_sku_id",
    "product_image",
    "product_name",
    "price",
    "product_description",
    "promotions"
})
@Generated("jsonschema2pojo")
public class Variant {

    @JsonProperty("product_master_id")
    private String productMasterId;
    @JsonProperty("product_sku_id")
    private String productSkuId;
    @JsonProperty("product_image")
    private String productImage;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("price")
    private String price;
    @JsonProperty("product_description")
    private String productDescription;
    @JsonProperty("promotions")
    private List<Promotion> promotions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("product_master_id")
    public String getProductMasterId() {
        return productMasterId;
    }

    @JsonProperty("product_master_id")
    public void setProductMasterId(String productMasterId) {
        this.productMasterId = productMasterId;
    }

    public Variant withProductMasterId(String productMasterId) {
        this.productMasterId = productMasterId;
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

    public Variant withProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
        return this;
    }

    @JsonProperty("product_image")
    public String getProductImage() {
        return productImage;
    }

    @JsonProperty("product_image")
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Variant withProductImage(String productImage) {
        this.productImage = productImage;
        return this;
    }

    @JsonProperty("product_name")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Variant withProductName(String productName) {
        this.productName = productName;
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

    public Variant withPrice(String price) {
        this.price = price;
        return this;
    }

    @JsonProperty("product_description")
    public String getProductDescription() {
        return productDescription;
    }

    @JsonProperty("product_description")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Variant withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    @JsonProperty("promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("promotions")
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Variant withPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
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

    public Variant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Variant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productMasterId");
        sb.append('=');
        sb.append(((this.productMasterId == null)?"<null>":this.productMasterId));
        sb.append(',');
        sb.append("productSkuId");
        sb.append('=');
        sb.append(((this.productSkuId == null)?"<null>":this.productSkuId));
        sb.append(',');
        sb.append("productImage");
        sb.append('=');
        sb.append(((this.productImage == null)?"<null>":this.productImage));
        sb.append(',');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("productDescription");
        sb.append('=');
        sb.append(((this.productDescription == null)?"<null>":this.productDescription));
        sb.append(',');
        sb.append("promotions");
        sb.append('=');
        sb.append(((this.promotions == null)?"<null>":this.promotions));
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
        result = ((result* 31)+((this.productSkuId == null)? 0 :this.productSkuId.hashCode()));
        result = ((result* 31)+((this.promotions == null)? 0 :this.promotions.hashCode()));
        result = ((result* 31)+((this.productImage == null)? 0 :this.productImage.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.productMasterId == null)? 0 :this.productMasterId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.productDescription == null)? 0 :this.productDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variant) == false) {
            return false;
        }
        Variant rhs = ((Variant) other);
        return (((((((((this.productSkuId == rhs.productSkuId)||((this.productSkuId!= null)&&this.productSkuId.equals(rhs.productSkuId)))&&((this.promotions == rhs.promotions)||((this.promotions!= null)&&this.promotions.equals(rhs.promotions))))&&((this.productImage == rhs.productImage)||((this.productImage!= null)&&this.productImage.equals(rhs.productImage))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.productMasterId == rhs.productMasterId)||((this.productMasterId!= null)&&this.productMasterId.equals(rhs.productMasterId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.productDescription == rhs.productDescription)||((this.productDescription!= null)&&this.productDescription.equals(rhs.productDescription))));
    }
}
