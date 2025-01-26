
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
    "createBy",
    "createDate",
    "updateBy",
    "updateDate"
})
@Generated("jsonschema2pojo")
@Builder
@Data
public class AuditInfo {

    @JsonProperty("createBy")
    private String createBy;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("updateBy")
    private String updateBy;
    @JsonProperty("updateDate")
    private String updateDate;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
//
//    @JsonProperty("createBy")
//    public String getCreateBy() {
//        return createBy;
//    }
//
//    @JsonProperty("createBy")
//    public void setCreateBy(String createBy) {
//        this.createBy = createBy;
//    }
//
//    public AuditInfo withCreateBy(String createBy) {
//        this.createBy = createBy;
//        return this;
//    }
//
//    @JsonProperty("createDate")
//    public String getCreateDate() {
//        return createDate;
//    }
//
//    @JsonProperty("createDate")
//    public void setCreateDate(String createDate) {
//        this.createDate = createDate;
//    }
//
//    public AuditInfo withCreateDate(String createDate) {
//        this.createDate = createDate;
//        return this;
//    }
//
//    @JsonProperty("updateBy")
//    public String getUpdateBy() {
//        return updateBy;
//    }
//
//    @JsonProperty("updateBy")
//    public void setUpdateBy(String updateBy) {
//        this.updateBy = updateBy;
//    }
//
//    public AuditInfo withUpdateBy(String updateBy) {
//        this.updateBy = updateBy;
//        return this;
//    }
//
//    @JsonProperty("updateDate")
//    public String getUpdateDate() {
//        return updateDate;
//    }
//
//    @JsonProperty("updateDate")
//    public void setUpdateDate(String updateDate) {
//        this.updateDate = updateDate;
//    }
//
//    public AuditInfo withUpdateDate(String updateDate) {
//        this.updateDate = updateDate;
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
//    public AuditInfo withAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(AuditInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("createBy");
//        sb.append('=');
//        sb.append(((this.createBy == null)?"<null>":this.createBy));
//        sb.append(',');
//        sb.append("createDate");
//        sb.append('=');
//        sb.append(((this.createDate == null)?"<null>":this.createDate));
//        sb.append(',');
//        sb.append("updateBy");
//        sb.append('=');
//        sb.append(((this.updateBy == null)?"<null>":this.updateBy));
//        sb.append(',');
//        sb.append("updateDate");
//        sb.append('=');
//        sb.append(((this.updateDate == null)?"<null>":this.updateDate));
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
//        result = ((result* 31)+((this.createBy == null)? 0 :this.createBy.hashCode()));
//        result = ((result* 31)+((this.updateDate == null)? 0 :this.updateDate.hashCode()));
//        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
//        result = ((result* 31)+((this.updateBy == null)? 0 :this.updateBy.hashCode()));
//        result = ((result* 31)+((this.createDate == null)? 0 :this.createDate.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof AuditInfo) == false) {
//            return false;
//        }
//        AuditInfo rhs = ((AuditInfo) other);
//        return ((((((this.createBy == rhs.createBy)||((this.createBy!= null)&&this.createBy.equals(rhs.createBy)))&&((this.updateDate == rhs.updateDate)||((this.updateDate!= null)&&this.updateDate.equals(rhs.updateDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updateBy == rhs.updateBy)||((this.updateBy!= null)&&this.updateBy.equals(rhs.updateBy))))&&((this.createDate == rhs.createDate)||((this.createDate!= null)&&this.createDate.equals(rhs.createDate))));
//    }

}
