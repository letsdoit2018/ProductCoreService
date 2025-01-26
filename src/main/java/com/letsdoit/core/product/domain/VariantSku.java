
package com.letsdoit.core.product.domain;

//import java.util.LinkedHashMap;
//import java.util.Map;
import javax.annotation.Generated;
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_sku_id",
    "attribute_category",
    "attribute_type",
    "active",
    "attribute_value",
    "price_id",
    "attribute_quantity",
    "attribute_unit_measure",
    "attribute_description",
    "main_image_url",
    "sku_id"
})
@Generated("jsonschema2pojo")
@Builder
@Data
public class VariantSku {

    @JsonProperty("product_sku_id")
    private String productSkuId;
    @JsonProperty("attribute_category")
    private String attributeCategory;
    @JsonProperty("attribute_type")
    private String attributeType;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("attribute_value")
    private String attributeValue;
    @JsonProperty("price_id")
    private String priceId;
    @JsonProperty("attribute_quantity")
    private Integer attributeQuantity;
    @JsonProperty("attribute_unit_measure")
    private String attributeUnitMeasure;
    @JsonProperty("attribute_description")
    private String attributeDescription;
    @JsonProperty("main_image_url")
    private String mainImageUrl;
    @JsonProperty("sku_id")
    private String skuId;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
//
//    @JsonProperty("product_sku_id")
//    public String getProductSkuId() {
//        return productSkuId;
//    }
//
//    @JsonProperty("product_sku_id")
//    public void setProductSkuId(String productSkuId) {
//        this.productSkuId = productSkuId;
//    }
//
//    public VariantSku withProductSkuId(String productSkuId) {
//        this.productSkuId = productSkuId;
//        return this;
//    }
//
//    @JsonProperty("attribute_category")
//    public String getAttributeCategory() {
//        return attributeCategory;
//    }
//
//    @JsonProperty("attribute_category")
//    public void setAttributeCategory(String attributeCategory) {
//        this.attributeCategory = attributeCategory;
//    }
//
//    public VariantSku withAttributeCategory(String attributeCategory) {
//        this.attributeCategory = attributeCategory;
//        return this;
//    }
//
//    @JsonProperty("attribute_type")
//    public String getAttributeType() {
//        return attributeType;
//    }
//
//    @JsonProperty("attribute_type")
//    public void setAttributeType(String attributeType) {
//        this.attributeType = attributeType;
//    }
//
//    public VariantSku withAttributeType(String attributeType) {
//        this.attributeType = attributeType;
//        return this;
//    }
//
//    @JsonProperty("active")
//    public Boolean getActive() {
//        return active;
//    }
//
//    @JsonProperty("active")
//    public void setActive(Boolean active) {
//        this.active = active;
//    }
//
//    public VariantSku withActive(Boolean active) {
//        this.active = active;
//        return this;
//    }
//
//    @JsonProperty("attribute_value")
//    public String getAttributeValue() {
//        return attributeValue;
//    }
//
//    @JsonProperty("attribute_value")
//    public void setAttributeValue(String attributeValue) {
//        this.attributeValue = attributeValue;
//    }
//
//    public VariantSku withAttributeValue(String attributeValue) {
//        this.attributeValue = attributeValue;
//        return this;
//    }
//
//    @JsonProperty("price_id")
//    public String getPriceId() {
//        return priceId;
//    }
//
//    @JsonProperty("price_id")
//    public void setPriceId(String priceId) {
//        this.priceId = priceId;
//    }
//
//    public VariantSku withPriceId(String priceId) {
//        this.priceId = priceId;
//        return this;
//    }
//
//    @JsonProperty("attribute_quantity")
//    public Integer getAttributeQuantity() {
//        return attributeQuantity;
//    }
//
//    @JsonProperty("attribute_quantity")
//    public void setAttributeQuantity(Integer attributeQuantity) {
//        this.attributeQuantity = attributeQuantity;
//    }
//
//    public VariantSku withAttributeQuantity(Integer attributeQuantity) {
//        this.attributeQuantity = attributeQuantity;
//        return this;
//    }
//
//    @JsonProperty("attribute_unit_measure")
//    public String getAttributeUnitMeasure() {
//        return attributeUnitMeasure;
//    }
//
//    @JsonProperty("attribute_unit_measure")
//    public void setAttributeUnitMeasure(String attributeUnitMeasure) {
//        this.attributeUnitMeasure = attributeUnitMeasure;
//    }
//
//    public VariantSku withAttributeUnitMeasure(String attributeUnitMeasure) {
//        this.attributeUnitMeasure = attributeUnitMeasure;
//        return this;
//    }
//
//    @JsonProperty("attribute_description")
//    public String getAttributeDescription() {
//        return attributeDescription;
//    }
//
//    @JsonProperty("attribute_description")
//    public void setAttributeDescription(String attributeDescription) {
//        this.attributeDescription = attributeDescription;
//    }
//
//    public VariantSku withAttributeDescription(String attributeDescription) {
//        this.attributeDescription = attributeDescription;
//        return this;
//    }
//
//    @JsonProperty("main_image_url")
//    public String getMainImageUrl() {
//        return mainImageUrl;
//    }
//
//    @JsonProperty("main_image_url")
//    public void setMainImageUrl(String mainImageUrl) {
//        this.mainImageUrl = mainImageUrl;
//    }
//
//    public VariantSku withMainImageUrl(String mainImageUrl) {
//        this.mainImageUrl = mainImageUrl;
//        return this;
//    }
//
//    @JsonProperty("sku_id")
//    public String getSkuId() {
//        return skuId;
//    }
//
//    @JsonProperty("sku_id")
//    public void setSkuId(String skuId) {
//        this.skuId = skuId;
//    }
//
//    public VariantSku withSkuId(String skuId) {
//        this.skuId = skuId;
//        return this;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//    public VariantSku withAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(VariantSku.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("productSkuId");
//        sb.append('=');
//        sb.append(((this.productSkuId == null)?"<null>":this.productSkuId));
//        sb.append(',');
//        sb.append("attributeCategory");
//        sb.append('=');
//        sb.append(((this.attributeCategory == null)?"<null>":this.attributeCategory));
//        sb.append(',');
//        sb.append("attributeType");
//        sb.append('=');
//        sb.append(((this.attributeType == null)?"<null>":this.attributeType));
//        sb.append(',');
//        sb.append("active");
//        sb.append('=');
//        sb.append(((this.active == null)?"<null>":this.active));
//        sb.append(',');
//        sb.append("attributeValue");
//        sb.append('=');
//        sb.append(((this.attributeValue == null)?"<null>":this.attributeValue));
//        sb.append(',');
//        sb.append("priceId");
//        sb.append('=');
//        sb.append(((this.priceId == null)?"<null>":this.priceId));
//        sb.append(',');
//        sb.append("attributeQuantity");
//        sb.append('=');
//        sb.append(((this.attributeQuantity == null)?"<null>":this.attributeQuantity));
//        sb.append(',');
//        sb.append("attributeUnitMeasure");
//        sb.append('=');
//        sb.append(((this.attributeUnitMeasure == null)?"<null>":this.attributeUnitMeasure));
//        sb.append(',');
//        sb.append("attributeDescription");
//        sb.append('=');
//        sb.append(((this.attributeDescription == null)?"<null>":this.attributeDescription));
//        sb.append(',');
//        sb.append("mainImageUrl");
//        sb.append('=');
//        sb.append(((this.mainImageUrl == null)?"<null>":this.mainImageUrl));
//        sb.append(',');
//        sb.append("skuId");
//        sb.append('=');
//        sb.append(((this.skuId == null)?"<null>":this.skuId));
//        sb.append(',');
//        sb.append("additionalProperties");
//        sb.append('=');
//        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
//        sb.append(',');
//        if (sb.charAt((sb.length()- 1)) == ',') {
//            sb.setCharAt((sb.length()- 1), ']');
//        } else {
//            sb.append(']');
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 1;
//        result = ((result* 31)+((this.productSkuId == null)? 0 :this.productSkuId.hashCode()));
//        result = ((result* 31)+((this.attributeValue == null)? 0 :this.attributeValue.hashCode()));
//        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
//        result = ((result* 31)+((this.attributeDescription == null)? 0 :this.attributeDescription.hashCode()));
//        result = ((result* 31)+((this.attributeQuantity == null)? 0 :this.attributeQuantity.hashCode()));
//        result = ((result* 31)+((this.attributeCategory == null)? 0 :this.attributeCategory.hashCode()));
//        result = ((result* 31)+((this.attributeType == null)? 0 :this.attributeType.hashCode()));
//        result = ((result* 31)+((this.attributeUnitMeasure == null)? 0 :this.attributeUnitMeasure.hashCode()));
//        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
//        result = ((result* 31)+((this.priceId == null)? 0 :this.priceId.hashCode()));
//        result = ((result* 31)+((this.mainImageUrl == null)? 0 :this.mainImageUrl.hashCode()));
//        result = ((result* 31)+((this.skuId == null)? 0 :this.skuId.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof VariantSku) == false) {
//            return false;
//        }
//        VariantSku rhs = ((VariantSku) other);
//        return (((((((((((((this.productSkuId == rhs.productSkuId)||((this.productSkuId!= null)&&this.productSkuId.equals(rhs.productSkuId)))&&((this.attributeValue == rhs.attributeValue)||((this.attributeValue!= null)&&this.attributeValue.equals(rhs.attributeValue))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.attributeDescription == rhs.attributeDescription)||((this.attributeDescription!= null)&&this.attributeDescription.equals(rhs.attributeDescription))))&&((this.attributeQuantity == rhs.attributeQuantity)||((this.attributeQuantity!= null)&&this.attributeQuantity.equals(rhs.attributeQuantity))))&&((this.attributeCategory == rhs.attributeCategory)||((this.attributeCategory!= null)&&this.attributeCategory.equals(rhs.attributeCategory))))&&((this.attributeType == rhs.attributeType)||((this.attributeType!= null)&&this.attributeType.equals(rhs.attributeType))))&&((this.attributeUnitMeasure == rhs.attributeUnitMeasure)||((this.attributeUnitMeasure!= null)&&this.attributeUnitMeasure.equals(rhs.attributeUnitMeasure))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priceId == rhs.priceId)||((this.priceId!= null)&&this.priceId.equals(rhs.priceId))))&&((this.mainImageUrl == rhs.mainImageUrl)||((this.mainImageUrl!= null)&&this.mainImageUrl.equals(rhs.mainImageUrl))))&&((this.skuId == rhs.skuId)||((this.skuId!= null)&&this.skuId.equals(rhs.skuId))));
//    }
}
