
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
    "displayName",
    "isAuthenticatedUser",
    "permissionId",
    "emailAddress"
})
public class LastModifyingUser {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("isAuthenticatedUser")
    private Boolean isAuthenticatedUser;
    @JsonProperty("permissionId")
    private String permissionId;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LastModifyingUser() {
    }

    /**
     * 
     * @param isAuthenticatedUser
     * @param emailAddress
     * @param permissionId
     * @param displayName
     * @param kind
     */
    public LastModifyingUser(String kind, String displayName, Boolean isAuthenticatedUser, String permissionId, String emailAddress) {
        this.kind = kind;
        this.displayName = displayName;
        this.isAuthenticatedUser = isAuthenticatedUser;
        this.permissionId = permissionId;
        this.emailAddress = emailAddress;
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
     *     The displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The isAuthenticatedUser
     */
    @JsonProperty("isAuthenticatedUser")
    public Boolean getIsAuthenticatedUser() {
        return isAuthenticatedUser;
    }

    /**
     * 
     * @param isAuthenticatedUser
     *     The isAuthenticatedUser
     */
    @JsonProperty("isAuthenticatedUser")
    public void setIsAuthenticatedUser(Boolean isAuthenticatedUser) {
        this.isAuthenticatedUser = isAuthenticatedUser;
    }

    /**
     * 
     * @return
     *     The permissionId
     */
    @JsonProperty("permissionId")
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 
     * @param permissionId
     *     The permissionId
     */
    @JsonProperty("permissionId")
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The emailAddress
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
