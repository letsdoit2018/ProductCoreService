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
import org.springframework.data.annotation.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partner_varaint_id",
    "partner_business_id",
    "items"
})
@Generated("jsonschema2pojo")
public class PartnerProductCategory {

    //Need clarification on the id field
    @Id
    @JsonProperty("id")
    private String id;

    //getter settter for id
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("partner_varaint_id")
    private String partnerVaraintId;
    @JsonProperty("partner_business_id")
    private String partnerBusinessId;
    @JsonProperty("items")
    private List<Item> items;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("partner_varaint_id")
    public String getPartnerVaraintId() {
        return partnerVaraintId;
    }

    @JsonProperty("partner_varaint_id")
    public void setPartnerVaraintId(String partnerVaraintId) {
        this.partnerVaraintId = partnerVaraintId;
    }

    public PartnerProductCategory withPartnerVaraintId(String partnerVaraintId) {
        this.partnerVaraintId = partnerVaraintId;
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

    public PartnerProductCategory withPartnerBusinessId(String partnerBusinessId) {
        this.partnerBusinessId = partnerBusinessId;
        return this;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public PartnerProductCategory withItems(List<Item> items) {
        this.items = items;
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

    public PartnerProductCategory withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartnerProductCategory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partnerVaraintId");
        sb.append('=');
        sb.append(((this.partnerVaraintId == null)?"<null>":this.partnerVaraintId));
        sb.append(',');
        sb.append("partnerBusinessId");
        sb.append('=');
        sb.append(((this.partnerBusinessId == null)?"<null>":this.partnerBusinessId));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
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
        result = ((result* 31)+((this.partnerBusinessId == null)? 0 :this.partnerBusinessId.hashCode()));
        result = ((result* 31)+((this.partnerVaraintId == null)? 0 :this.partnerVaraintId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartnerProductCategory) == false) {
            return false;
        }
        PartnerProductCategory rhs = ((PartnerProductCategory) other);
        return (((((this.partnerBusinessId == rhs.partnerBusinessId)||((this.partnerBusinessId!= null)&&this.partnerBusinessId.equals(rhs.partnerBusinessId)))&&((this.partnerVaraintId == rhs.partnerVaraintId)||((this.partnerVaraintId!= null)&&this.partnerVaraintId.equals(rhs.partnerVaraintId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items))));
    }
}
