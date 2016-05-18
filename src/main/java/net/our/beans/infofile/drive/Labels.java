
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
    "starred",
    "hidden",
    "trashed",
    "restricted",
    "viewed"
})
public class Labels {

    @JsonProperty("starred")
    private Boolean starred;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("trashed")
    private Boolean trashed;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("viewed")
    private Boolean viewed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Labels() {
    }

    /**
     * 
     * @param trashed
     * @param starred
     * @param hidden
     * @param restricted
     * @param viewed
     */
    public Labels(Boolean starred, Boolean hidden, Boolean trashed, Boolean restricted, Boolean viewed) {
        this.starred = starred;
        this.hidden = hidden;
        this.trashed = trashed;
        this.restricted = restricted;
        this.viewed = viewed;
    }

    /**
     * 
     * @return
     *     The starred
     */
    @JsonProperty("starred")
    public Boolean getStarred() {
        return starred;
    }

    /**
     * 
     * @param starred
     *     The starred
     */
    @JsonProperty("starred")
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The trashed
     */
    @JsonProperty("trashed")
    public Boolean getTrashed() {
        return trashed;
    }

    /**
     * 
     * @param trashed
     *     The trashed
     */
    @JsonProperty("trashed")
    public void setTrashed(Boolean trashed) {
        this.trashed = trashed;
    }

    /**
     * 
     * @return
     *     The restricted
     */
    @JsonProperty("restricted")
    public Boolean getRestricted() {
        return restricted;
    }

    /**
     * 
     * @param restricted
     *     The restricted
     */
    @JsonProperty("restricted")
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    /**
     * 
     * @return
     *     The viewed
     */
    @JsonProperty("viewed")
    public Boolean getViewed() {
        return viewed;
    }

    /**
     * 
     * @param viewed
     *     The viewed
     */
    @JsonProperty("viewed")
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
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
