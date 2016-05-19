
package net.our.beans.infofile.drive;

import java.util.ArrayList;
import java.util.HashMap;
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
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "kind",
    "id",
    "etag",
    "selfLink",
    "alternateLink",
    "embedLink",
    "iconLink",
    "thumbnailLink",
    "title",
    "mimeType",
    "labels",
    "createdDate",
    "modifiedDate",
    "lastViewedByMeDate",
    "markedViewedByMeDate",
    "version",
    "parents",
    "exportLinks",
    "userPermission",
    "quotaBytesUsed",
    "ownerNames",
    "owners",
    "lastModifyingUserName",
    "lastModifyingUser",
    "editable",
    "copyable",
    "writersCanShare",
    "shared",
    "explicitlyTrashed",
    "appDataContents",
    "spaces",
    "modifiedByMeDate"
})
public class Item {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("alternateLink")
    private String alternateLink;
    @JsonProperty("embedLink")
    private String embedLink;
    @JsonProperty("iconLink")
    private String iconLink;
    @JsonProperty("thumbnailLink")
    private String thumbnailLink;
    @JsonProperty("title")
    private String title;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("labels")
    private Labels labels;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("lastViewedByMeDate")
    private String lastViewedByMeDate;
    @JsonProperty("markedViewedByMeDate")
    private String markedViewedByMeDate;
    @JsonProperty("version")
    private String version;
    @JsonProperty("parents")
    private List<Parent> parents = new ArrayList<Parent>();
    @JsonProperty("exportLinks")
    private ExportLinks exportLinks;
    @JsonProperty("userPermission")
    private UserPermission userPermission;
    @JsonProperty("quotaBytesUsed")
    private String quotaBytesUsed;
    @JsonProperty("ownerNames")
    private List<String> ownerNames = new ArrayList<String>();
    @JsonProperty("owners")
    private List<Owner> owners = new ArrayList<Owner>();
    @JsonProperty("lastModifyingUserName")
    private String lastModifyingUserName;
    @JsonProperty("lastModifyingUser")
    private LastModifyingUser lastModifyingUser;
    @JsonProperty("editable")
    private Boolean editable;
    @JsonProperty("copyable")
    private Boolean copyable;
    @JsonProperty("writersCanShare")
    private Boolean writersCanShare;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("explicitlyTrashed")
    private Boolean explicitlyTrashed;
    @JsonProperty("appDataContents")
    private Boolean appDataContents;
    @JsonProperty("spaces")
    private List<String> spaces = new ArrayList<String>();
    @JsonProperty("modifiedByMeDate")
    private String modifiedByMeDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param parents
     * @param etag
     * @param embedLink
     * @param userPermission
     * @param lastViewedByMeDate
     * @param kind
     * @param exportLinks
     * @param version
     * @param lastModifyingUser
     * @param id
     * @param lastModifyingUserName
     * @param alternateLink
     * @param title
     * @param createdDate
     * @param mimeType
     * @param shared
     * @param spaces
     * @param appDataContents
     * @param iconLink
     * @param modifiedByMeDate
     * @param writersCanShare
     * @param labels
     * @param quotaBytesUsed
     * @param selfLink
     * @param markedViewedByMeDate
     * @param ownerNames
     * @param editable
     * @param modifiedDate
     * @param copyable
     * @param thumbnailLink
     * @param explicitlyTrashed
     * @param owners
     */
    public Item(String kind, String id, String etag, String selfLink, String alternateLink, String embedLink, String iconLink, String thumbnailLink, String title, String mimeType, Labels labels, String createdDate, String modifiedDate, String lastViewedByMeDate, String markedViewedByMeDate, String version, List<Parent> parents, ExportLinks exportLinks, UserPermission userPermission, String quotaBytesUsed, List<String> ownerNames, List<Owner> owners, String lastModifyingUserName, LastModifyingUser lastModifyingUser, Boolean editable, Boolean copyable, Boolean writersCanShare, Boolean shared, Boolean explicitlyTrashed, Boolean appDataContents, List<String> spaces, String modifiedByMeDate) {
        this.kind = kind;
        this.id = id;
        this.etag = etag;
        this.selfLink = selfLink;
        this.alternateLink = alternateLink;
        this.embedLink = embedLink;
        this.iconLink = iconLink;
        this.thumbnailLink = thumbnailLink;
        this.title = title;
        this.mimeType = mimeType;
        this.labels = labels;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.lastViewedByMeDate = lastViewedByMeDate;
        this.markedViewedByMeDate = markedViewedByMeDate;
        this.version = version;
        this.parents = parents;
        this.exportLinks = exportLinks;
        this.userPermission = userPermission;
        this.quotaBytesUsed = quotaBytesUsed;
        this.ownerNames = ownerNames;
        this.owners = owners;
        this.lastModifyingUserName = lastModifyingUserName;
        this.lastModifyingUser = lastModifyingUser;
        this.editable = editable;
        this.copyable = copyable;
        this.writersCanShare = writersCanShare;
        this.shared = shared;
        this.explicitlyTrashed = explicitlyTrashed;
        this.appDataContents = appDataContents;
        this.spaces = spaces;
        this.modifiedByMeDate = modifiedByMeDate;
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
     *     The etag
     */
    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    /**
     * 
     * @param etag
     *     The etag
     */
    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
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
     *     The alternateLink
     */
    @JsonProperty("alternateLink")
    public String getAlternateLink() {
        return alternateLink;
    }

    /**
     * 
     * @param alternateLink
     *     The alternateLink
     */
    @JsonProperty("alternateLink")
    public void setAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
    }

    /**
     * 
     * @return
     *     The embedLink
     */
    @JsonProperty("embedLink")
    public String getEmbedLink() {
        return embedLink;
    }

    /**
     * 
     * @param embedLink
     *     The embedLink
     */
    @JsonProperty("embedLink")
    public void setEmbedLink(String embedLink) {
        this.embedLink = embedLink;
    }

    /**
     * 
     * @return
     *     The iconLink
     */
    @JsonProperty("iconLink")
    public String getIconLink() {
        return iconLink;
    }

    /**
     * 
     * @param iconLink
     *     The iconLink
     */
    @JsonProperty("iconLink")
    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    /**
     * 
     * @return
     *     The thumbnailLink
     */
    @JsonProperty("thumbnailLink")
    public String getThumbnailLink() {
        return thumbnailLink;
    }

    /**
     * 
     * @param thumbnailLink
     *     The thumbnailLink
     */
    @JsonProperty("thumbnailLink")
    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The mimeType
     */
    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * 
     * @param mimeType
     *     The mimeType
     */
    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The createdDate
     */
    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * 
     * @param createdDate
     *     The createdDate
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 
     * @return
     *     The modifiedDate
     */
    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 
     * @param modifiedDate
     *     The modifiedDate
     */
    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * 
     * @return
     *     The lastViewedByMeDate
     */
    @JsonProperty("lastViewedByMeDate")
    public String getLastViewedByMeDate() {
        return lastViewedByMeDate;
    }

    /**
     * 
     * @param lastViewedByMeDate
     *     The lastViewedByMeDate
     */
    @JsonProperty("lastViewedByMeDate")
    public void setLastViewedByMeDate(String lastViewedByMeDate) {
        this.lastViewedByMeDate = lastViewedByMeDate;
    }

    /**
     * 
     * @return
     *     The markedViewedByMeDate
     */
    @JsonProperty("markedViewedByMeDate")
    public String getMarkedViewedByMeDate() {
        return markedViewedByMeDate;
    }

    /**
     * 
     * @param markedViewedByMeDate
     *     The markedViewedByMeDate
     */
    @JsonProperty("markedViewedByMeDate")
    public void setMarkedViewedByMeDate(String markedViewedByMeDate) {
        this.markedViewedByMeDate = markedViewedByMeDate;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The parents
     */
    @JsonProperty("parents")
    public List<Parent> getParents() {
        return parents;
    }

    /**
     * 
     * @param parents
     *     The parents
     */
    @JsonProperty("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    /**
     * 
     * @return
     *     The exportLinks
     */
    @JsonProperty("exportLinks")
    public ExportLinks getExportLinks() {
        return exportLinks;
    }

    /**
     * 
     * @param exportLinks
     *     The exportLinks
     */
    @JsonProperty("exportLinks")
    public void setExportLinks(ExportLinks exportLinks) {
        this.exportLinks = exportLinks;
    }

    /**
     * 
     * @return
     *     The userPermission
     */
    @JsonProperty("userPermission")
    public UserPermission getUserPermission() {
        return userPermission;
    }

    /**
     * 
     * @param userPermission
     *     The userPermission
     */
    @JsonProperty("userPermission")
    public void setUserPermission(UserPermission userPermission) {
        this.userPermission = userPermission;
    }

    /**
     * 
     * @return
     *     The quotaBytesUsed
     */
    @JsonProperty("quotaBytesUsed")
    public String getQuotaBytesUsed() {
        return quotaBytesUsed;
    }

    /**
     * 
     * @param quotaBytesUsed
     *     The quotaBytesUsed
     */
    @JsonProperty("quotaBytesUsed")
    public void setQuotaBytesUsed(String quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
    }

    /**
     * 
     * @return
     *     The ownerNames
     */
    @JsonProperty("ownerNames")
    public List<String> getOwnerNames() {
        return ownerNames;
    }

    /**
     * 
     * @param ownerNames
     *     The ownerNames
     */
    @JsonProperty("ownerNames")
    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    /**
     * 
     * @return
     *     The owners
     */
    @JsonProperty("owners")
    public List<Owner> getOwners() {
        return owners;
    }

    /**
     * 
     * @param owners
     *     The owners
     */
    @JsonProperty("owners")
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    /**
     * 
     * @return
     *     The lastModifyingUserName
     */
    @JsonProperty("lastModifyingUserName")
    public String getLastModifyingUserName() {
        return lastModifyingUserName;
    }

    /**
     * 
     * @param lastModifyingUserName
     *     The lastModifyingUserName
     */
    @JsonProperty("lastModifyingUserName")
    public void setLastModifyingUserName(String lastModifyingUserName) {
        this.lastModifyingUserName = lastModifyingUserName;
    }

    /**
     * 
     * @return
     *     The lastModifyingUser
     */
    @JsonProperty("lastModifyingUser")
    public LastModifyingUser getLastModifyingUser() {
        return lastModifyingUser;
    }

    /**
     * 
     * @param lastModifyingUser
     *     The lastModifyingUser
     */
    @JsonProperty("lastModifyingUser")
    public void setLastModifyingUser(LastModifyingUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    /**
     * 
     * @return
     *     The editable
     */
    @JsonProperty("editable")
    public Boolean getEditable() {
        return editable;
    }

    /**
     * 
     * @param editable
     *     The editable
     */
    @JsonProperty("editable")
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    /**
     * 
     * @return
     *     The copyable
     */
    @JsonProperty("copyable")
    public Boolean getCopyable() {
        return copyable;
    }

    /**
     * 
     * @param copyable
     *     The copyable
     */
    @JsonProperty("copyable")
    public void setCopyable(Boolean copyable) {
        this.copyable = copyable;
    }

    /**
     * 
     * @return
     *     The writersCanShare
     */
    @JsonProperty("writersCanShare")
    public Boolean getWritersCanShare() {
        return writersCanShare;
    }

    /**
     * 
     * @param writersCanShare
     *     The writersCanShare
     */
    @JsonProperty("writersCanShare")
    public void setWritersCanShare(Boolean writersCanShare) {
        this.writersCanShare = writersCanShare;
    }

    /**
     * 
     * @return
     *     The shared
     */
    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    /**
     * 
     * @param shared
     *     The shared
     */
    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    /**
     * 
     * @return
     *     The explicitlyTrashed
     */
    @JsonProperty("explicitlyTrashed")
    public Boolean getExplicitlyTrashed() {
        return explicitlyTrashed;
    }

    /**
     * 
     * @param explicitlyTrashed
     *     The explicitlyTrashed
     */
    @JsonProperty("explicitlyTrashed")
    public void setExplicitlyTrashed(Boolean explicitlyTrashed) {
        this.explicitlyTrashed = explicitlyTrashed;
    }

    /**
     * 
     * @return
     *     The appDataContents
     */
    @JsonProperty("appDataContents")
    public Boolean getAppDataContents() {
        return appDataContents;
    }

    /**
     * 
     * @param appDataContents
     *     The appDataContents
     */
    @JsonProperty("appDataContents")
    public void setAppDataContents(Boolean appDataContents) {
        this.appDataContents = appDataContents;
    }

    /**
     * 
     * @return
     *     The spaces
     */
    @JsonProperty("spaces")
    public List<String> getSpaces() {
        return spaces;
    }

    /**
     * 
     * @param spaces
     *     The spaces
     */
    @JsonProperty("spaces")
    public void setSpaces(List<String> spaces) {
        this.spaces = spaces;
    }

    /**
     * 
     * @return
     *     The modifiedByMeDate
     */
    @JsonProperty("modifiedByMeDate")
    public String getModifiedByMeDate() {
        return modifiedByMeDate;
    }

    /**
     * 
     * @param modifiedByMeDate
     *     The modifiedByMeDate
     */
    @JsonProperty("modifiedByMeDate")
    public void setModifiedByMeDate(String modifiedByMeDate) {
        this.modifiedByMeDate = modifiedByMeDate;
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
