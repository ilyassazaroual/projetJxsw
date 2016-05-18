
package net.our.beans.infofile.drive;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "kind",
    "id",
    "selfLink",
    "parentLink",
    "isRoot"
})
public class Parent {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("parentLink")
    private String parentLink;
    @JsonProperty("isRoot")
    private Boolean isRoot;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parent() {
    }

    /**
     * 
     * @param id
     * @param isRoot
     * @param parentLink
     * @param selfLink
     * @param kind
     */
    public Parent(String kind, String id, String selfLink, String parentLink, Boolean isRoot) {
        this.kind = kind;
        this.id = id;
        this.selfLink = selfLink;
        this.parentLink = parentLink;
        this.isRoot = isRoot;
    }

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * 
     * @param selfLink
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * 
     * @return
     *     The parentLink
     */
    @JsonProperty("parentLink")
    public String getParentLink() {
        return parentLink;
    }

    /**
     * 
     * @param parentLink
     *     The parentLink
     */
    @JsonProperty("parentLink")
    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    /**
     * 
     * @return
     *     The isRoot
     */
    @JsonProperty("isRoot")
    public Boolean getIsRoot() {
        return isRoot;
    }

    /**
     * 
     * @param isRoot
     *     The isRoot
     */
    @JsonProperty("isRoot")
    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
