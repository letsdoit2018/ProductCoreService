
package com.letsdoit.core.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "variant_id",
//        "product_description"
//})
//@Generated("jsonschema2pojo")
//public class PartnerVariant {
//
//    @JsonProperty("variant_id")
//    private String variantId;
//    @JsonProperty("product_description")
//    private String productDescription;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
//
//    public PartnerVariant() {
//    }
//
//    @JsonProperty("variant_id")
//    public String getVariantId() {
//        return variantId;
//    }
//
//    @JsonProperty("variant_id")
//    public void setVariantId(String variantId) {
//        this.variantId = variantId;
//    }
//
//    @JsonProperty("product_description")
//    public String getProductDescription() {
//        return productDescription;
//    }
//
//    @JsonProperty("product_description")
//    public void setProductDescription(String productDescription) {
//        this.productDescription = productDescription;
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
//}
//
//
//import java.util.LinkedHashMap;
import java.util.List;
//import java.util.Map;
import javax.annotation.Generated;
//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.data.annotation.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "partner_business_id",
    "product_title",
    "tags",
    "product_description",
    "legal_description",
    "country_of_origin",
    "bullets",
    "variant_sku"
})
@Generated("jsonschema2pojo")
public class PartnerVariant {
    @Id
    @JsonProperty("id")
    private String id;
    @JsonProperty("partner_business_id")
    private String partnerBusinessId;
    @JsonProperty("product_title")
    private String productTitle;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonProperty("product_description")
    private String productDescription;
    @JsonProperty("legal_description")
    private String legalDescription;
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    @JsonProperty("bullets")
    private List<String> bullets;
    @JsonProperty("variant_sku")
    private List<VariantSku> variantSku;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PartnerVariant withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("partner_business_id")
    public String getPartnerBusinessId() {
        return partnerBusinessId;
    }

    @JsonProperty("partner_business_id")
    public void setPartnerBusinessId(String partnerBusinessId) {
        this.partnerBusinessId = partnerBusinessId;
    }

    public PartnerVariant withPartnerBusinessId(String partnerBusinessId) {
        this.partnerBusinessId = partnerBusinessId;
        return this;
    }

//    @JsonProperty("product_title")
//    public String getProductTitle() {
//        return productTitle;
//    }
//
//    @JsonProperty("product_title")
//    public void setProductTitle(String productTitle) {
//        this.productTitle = productTitle;
//    }
//
//    public PartnerVariant withProductTitle(String productTitle) {
//        this.productTitle = productTitle;
//        return this;
//    }
//
//    @JsonProperty("_tags")
//    public List<Tag> getTags() {
//        return tags;
//    }
//
//    @JsonProperty("_tags")
//    public void setTags(List<Tag> tags) {
//        this.tags = tags;
//    }
//
//    public PartnerVariant withTags(List<Tag> tags) {
//        this.tags = tags;
//        return this;
//    }
//
//    @JsonProperty("product_description")
//    public String getProductDescription() {
//        return productDescription;
//    }
//
//    @JsonProperty("product_description")
//    public void setProductDescription(String productDescription) {
//        this.productDescription = productDescription;
//    }
//
//    public PartnerVariant withProductDescription(String productDescription) {
//        this.productDescription = productDescription;
//        return this;
//    }
//
//    @JsonProperty("legal_description")
//    public String getLegalDescription() {
//        return legalDescription;
//    }
//
//    @JsonProperty("legal_description")
//    public void setLegalDescription(String legalDescription) {
//        this.legalDescription = legalDescription;
//    }
//
//    public PartnerVariant withLegalDescription(String legalDescription) {
//        this.legalDescription = legalDescription;
//        return this;
//    }
//
//    @JsonProperty("country_of_origin")
//    public String getCountryOfOrigin() {
//        return countryOfOrigin;
//    }
//
//    @JsonProperty("country_of_origin")
//    public void setCountryOfOrigin(String countryOfOrigin) {
//        this.countryOfOrigin = countryOfOrigin;
//    }
//
//    public PartnerVariant withCountryOfOrigin(String countryOfOrigin) {
//        this.countryOfOrigin = countryOfOrigin;
//        return this;
//    }
//
//    @JsonProperty("bullets")
//    public List<String> getBullets() {
//        return bullets;
//    }
//
//    @JsonProperty("bullets")
//    public void setBullets(List<String> bullets) {
//        this.bullets = bullets;
//    }
//
//    public PartnerVariant withBullets(List<String> bullets) {
//        this.bullets = bullets;
//        return this;
//    }
//
//    @JsonProperty("variant_sku")
//    public List<VariantSku> getVariantSku() {
//        return variantSku;
//    }
//
//    @JsonProperty("variant_sku")
//    public void setVariantSku(List<VariantSku> variantSku) {
//        this.variantSku = variantSku;
//    }
//
//    public PartnerVariant withVariantSku(List<VariantSku> variantSku) {
//        this.variantSku = variantSku;
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
//    public PartnerVariant withAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//        return this;
//    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(PartnerVariant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("variantId");
//        sb.append('=');
//        sb.append(((this.variantId == null)?"<null>":this.variantId));
//        sb.append(',');
//        sb.append("partnerBusinessId");
//        sb.append('=');
//        sb.append(((this.partnerBusinessId == null)?"<null>":this.partnerBusinessId));
//        sb.append(',');
//        sb.append("productTitle");
//        sb.append('=');
//        sb.append(((this.productTitle == null)?"<null>":this.productTitle));
//        sb.append(',');
//        sb.append("tags");
//        sb.append('=');
//        sb.append(((this.tags == null)?"<null>":this.tags));
//        sb.append(',');
//        sb.append("productDescription");
//        sb.append('=');
//        sb.append(((this.productDescription == null)?"<null>":this.productDescription));
//        sb.append(',');
//        sb.append("legalDescription");
//        sb.append('=');
//        sb.append(((this.legalDescription == null)?"<null>":this.legalDescription));
//        sb.append(',');
//        sb.append("countryOfOrigin");
//        sb.append('=');
//        sb.append(((this.countryOfOrigin == null)?"<null>":this.countryOfOrigin));
//        sb.append(',');
//        sb.append("bullets");
//        sb.append('=');
//        sb.append(((this.bullets == null)?"<null>":this.bullets));
//        sb.append(',');
//        sb.append("variantSku");
//        sb.append('=');
//        sb.append(((this.variantSku == null)?"<null>":this.variantSku));
//        sb.append(',');
//        sb.append("additionalProperties");
//        sb.append('=');
//        //sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
//        result = ((result* 31)+((this.productTitle == null)? 0 :this.productTitle.hashCode()));
//        result = ((result* 31)+((this.partnerBusinessId == null)? 0 :this.partnerBusinessId.hashCode()));
//        result = ((result* 31)+((this.variantId == null)? 0 :this.variantId.hashCode()));
//        result = ((result* 31)+((this.countryOfOrigin == null)? 0 :this.countryOfOrigin.hashCode()));
//        //result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
//        result = ((result* 31)+((this.productDescription == null)? 0 :this.productDescription.hashCode()));
//        result = ((result* 31)+((this.legalDescription == null)? 0 :this.legalDescription.hashCode()));
//        result = ((result* 31)+((this.variantSku == null)? 0 :this.variantSku.hashCode()));
//        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
//        result = ((result* 31)+((this.bullets == null)? 0 :this.bullets.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof PartnerVariant) == false) {
//            return false;
//        }
//        PartnerVariant rhs = ((PartnerVariant) other);
//        return (((((((((((this.productTitle == rhs.productTitle)||((this.productTitle!= null)&&this.productTitle.equals(rhs.productTitle)))&&((this.partnerBusinessId == rhs.partnerBusinessId)||((this.partnerBusinessId!= null)&&this.partnerBusinessId.equals(rhs.partnerBusinessId))))&&((this.variantId == rhs.variantId)||((this.variantId!= null)&&this.variantId.equals(rhs.variantId))))&&((this.countryOfOrigin == rhs.countryOfOrigin)||((this.countryOfOrigin!= null)&&this.countryOfOrigin.equals(rhs.countryOfOrigin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.productDescription == rhs.productDescription)||((this.productDescription!= null)&&this.productDescription.equals(rhs.productDescription))))&&((this.legalDescription == rhs.legalDescription)||((this.legalDescription!= null)&&this.legalDescription.equals(rhs.legalDescription))))&&((this.variantSku == rhs.variantSku)||((this.variantSku!= null)&&this.variantSku.equals(rhs.variantSku))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.bullets == rhs.bullets)||((this.bullets!= null)&&this.bullets.equals(rhs.bullets))));
//    }
}
