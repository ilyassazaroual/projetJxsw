package net.our.beans.infofile;


import java.util.ArrayList;
import java.util.List;

public class Item {

    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private String webContentLink;
    private String alternateLink;
    private String iconLink;
    private String embedLink;
    private String title;
    private String mimeType;
    private Labels labels;
    private String createdDate;
    private String modifiedDate;
    private String markedViewedByMeDate;
    private String version;
    private List<Parent> parents = new ArrayList<Parent>();
    private String downloadUrl;
    private UserPermission userPermission;
    private String originalFilename;
    private String fileExtension;
    private String md5Checksum;
    private String fileSize;
    private String quotaBytesUsed;
    private List<String> ownerNames = new ArrayList<String>();
    private List<Owner> owners = new ArrayList<Owner>();
    private String lastModifyingUserName;
    private LastModifyingUser lastModifyingUser;
    private Boolean editable;
    private Boolean copyable;
    private Boolean writersCanShare;
    private Boolean shared;
    private Boolean explicitlyTrashed;
    private Boolean appDataContents;
    private String headRevisionId;
    private List<String> spaces = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param parents
     * @param md5Checksum
     * @param etag
     * @param userPermission
     * @param downloadUrl
     * @param webContentLink
     * @param embedLink
     * @param kind
     * @param lastModifyingUser
     * @param version
     * @param lastModifyingUserName
     * @param id
     * @param fileSize
     * @param alternateLink
     * @param title
     * @param originalFilename
     * @param createdDate
     * @param mimeType
     * @param shared
     * @param fileExtension
     * @param spaces
     * @param appDataContents
     * @param iconLink
     * @param writersCanShare
     * @param labels
     * @param quotaBytesUsed
     * @param selfLink
     * @param markedViewedByMeDate
     * @param ownerNames
     * @param editable
     * @param modifiedDate
     * @param copyable
     * @param explicitlyTrashed
     * @param headRevisionId
     * @param owners
     */
    public Item(String kind, String id, String etag, String selfLink, String embedLink, String webContentLink, String alternateLink, String iconLink, String title, String mimeType, Labels labels, String createdDate, String modifiedDate, String markedViewedByMeDate, String version, List<Parent> parents, String downloadUrl, UserPermission userPermission, String originalFilename, String fileExtension, String md5Checksum, String fileSize, String quotaBytesUsed, List<String> ownerNames, List<Owner> owners, String lastModifyingUserName, LastModifyingUser lastModifyingUser, Boolean editable, Boolean copyable, Boolean writersCanShare, Boolean shared, Boolean explicitlyTrashed, Boolean appDataContents, String headRevisionId, List<String> spaces) {
	this.embedLink = embedLink;
        this.kind = kind;
        this.id = id;
        this.etag = etag;
        this.selfLink = selfLink;
        this.webContentLink = webContentLink;
        this.alternateLink = alternateLink;
        this.iconLink = iconLink;
        this.title = title;
        this.mimeType = mimeType;
        this.labels = labels;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.markedViewedByMeDate = markedViewedByMeDate;
        this.version = version;
        this.parents = parents;
        this.downloadUrl = downloadUrl;
        this.userPermission = userPermission;
        this.originalFilename = originalFilename;
        this.fileExtension = fileExtension;
        this.md5Checksum = md5Checksum;
        this.fileSize = fileSize;
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
        this.headRevisionId = headRevisionId;
        this.spaces = spaces;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Item withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Item withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * 
     * @param etag
     *     The etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Item withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    /**
     *
     * @return 
     * The embedLink
     *
     */
    public String getEmbedLink() {
        return embedLink;
    }
    public void setEmbedLink(String embedLink) {
        this.selfLink = selfLink;
    }

    public Item withEmbedLink(String embedLink) {
        this.embedLink = embedLink;
        return this;
    }
    /**
     * 
     * @return
     *     The selfLink
     */
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * 
     * @param selfLink
     *     The selfLink
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Item withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    /**
     * 
     * @return
     *     The webContentLink
     */
    public String getWebContentLink() {
        return webContentLink;
    }

    /**
     * 
     * @param webContentLink
     *     The webContentLink
     */
    public void setWebContentLink(String webContentLink) {
        this.webContentLink = webContentLink;
    }

    public Item withWebContentLink(String webContentLink) {
        this.webContentLink = webContentLink;
        return this;
    }

    /**
     * 
     * @return
     *     The alternateLink
     */
    public String getAlternateLink() {
        return alternateLink;
    }

    /**
     * 
     * @param alternateLink
     *     The alternateLink
     */
    public void setAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
    }

    public Item withAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
        return this;
    }

    /**
     * 
     * @return
     *     The iconLink
     */
    public String getIconLink() {
        return iconLink;
    }

    /**
     * 
     * @param iconLink
     *     The iconLink
     */
    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    public Item withIconLink(String iconLink) {
        this.iconLink = iconLink;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Item withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The mimeType
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * 
     * @param mimeType
     *     The mimeType
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Item withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * 
     * @return
     *     The labels
     */
    public Labels getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Item withLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 
     * @return
     *     The createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * 
     * @param createdDate
     *     The createdDate
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Item withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 
     * @return
     *     The modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 
     * @param modifiedDate
     *     The modifiedDate
     */
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Item withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 
     * @return
     *     The markedViewedByMeDate
     */
    public String getMarkedViewedByMeDate() {
        return markedViewedByMeDate;
    }

    /**
     * 
     * @param markedViewedByMeDate
     *     The markedViewedByMeDate
     */
    public void setMarkedViewedByMeDate(String markedViewedByMeDate) {
        this.markedViewedByMeDate = markedViewedByMeDate;
    }

    public Item withMarkedViewedByMeDate(String markedViewedByMeDate) {
        this.markedViewedByMeDate = markedViewedByMeDate;
        return this;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    public Item withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * @return
     *     The parents
     */
    public List<Parent> getParents() {
        return parents;
    }

    /**
     * 
     * @param parents
     *     The parents
     */
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public Item withParents(List<Parent> parents) {
        this.parents = parents;
        return this;
    }

    /**
     * 
     * @return
     *     The downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * 
     * @param downloadUrl
     *     The downloadUrl
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Item withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The userPermission
     */
    public UserPermission getUserPermission() {
        return userPermission;
    }

    /**
     * 
     * @param userPermission
     *     The userPermission
     */
    public void setUserPermission(UserPermission userPermission) {
        this.userPermission = userPermission;
    }

    public Item withUserPermission(UserPermission userPermission) {
        this.userPermission = userPermission;
        return this;
    }

    /**
     * 
     * @return
     *     The originalFilename
     */
    public String getOriginalFilename() {
        return originalFilename;
    }

    /**
     * 
     * @param originalFilename
     *     The originalFilename
     */
    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public Item withOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
        return this;
    }

    /**
     * 
     * @return
     *     The fileExtension
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * 
     * @param fileExtension
     *     The fileExtension
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Item withFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }

    /**
     * 
     * @return
     *     The md5Checksum
     */
    public String getMd5Checksum() {
        return md5Checksum;
    }

    /**
     * 
     * @param md5Checksum
     *     The md5Checksum
     */
    public void setMd5Checksum(String md5Checksum) {
        this.md5Checksum = md5Checksum;
    }

    public Item withMd5Checksum(String md5Checksum) {
        this.md5Checksum = md5Checksum;
        return this;
    }

    /**
     * 
     * @return
     *     The fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * 
     * @param fileSize
     *     The fileSize
     */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Item withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 
     * @return
     *     The quotaBytesUsed
     */
    public String getQuotaBytesUsed() {
        return quotaBytesUsed;
    }

    /**
     * 
     * @param quotaBytesUsed
     *     The quotaBytesUsed
     */
    public void setQuotaBytesUsed(String quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
    }

    public Item withQuotaBytesUsed(String quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
        return this;
    }

    /**
     * 
     * @return
     *     The ownerNames
     */
    public List<String> getOwnerNames() {
        return ownerNames;
    }

    /**
     * 
     * @param ownerNames
     *     The ownerNames
     */
    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public Item withOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
        return this;
    }

    /**
     * 
     * @return
     *     The owners
     */
    public List<Owner> getOwners() {
        return owners;
    }

    /**
     * 
     * @param owners
     *     The owners
     */
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public Item withOwners(List<Owner> owners) {
        this.owners = owners;
        return this;
    }

    /**
     * 
     * @return
     *     The lastModifyingUserName
     */
    public String getLastModifyingUserName() {
        return lastModifyingUserName;
    }

    /**
     * 
     * @param lastModifyingUserName
     *     The lastModifyingUserName
     */
    public void setLastModifyingUserName(String lastModifyingUserName) {
        this.lastModifyingUserName = lastModifyingUserName;
    }

    public Item withLastModifyingUserName(String lastModifyingUserName) {
        this.lastModifyingUserName = lastModifyingUserName;
        return this;
    }

    /**
     * 
     * @return
     *     The lastModifyingUser
     */
    public LastModifyingUser getLastModifyingUser() {
        return lastModifyingUser;
    }

    /**
     * 
     * @param lastModifyingUser
     *     The lastModifyingUser
     */
    public void setLastModifyingUser(LastModifyingUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    public Item withLastModifyingUser(LastModifyingUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
        return this;
    }

    /**
     * 
     * @return
     *     The editable
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     * 
     * @param editable
     *     The editable
     */
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Item withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 
     * @return
     *     The copyable
     */
    public Boolean getCopyable() {
        return copyable;
    }

    /**
     * 
     * @param copyable
     *     The copyable
     */
    public void setCopyable(Boolean copyable) {
        this.copyable = copyable;
    }

    public Item withCopyable(Boolean copyable) {
        this.copyable = copyable;
        return this;
    }

    /**
     * 
     * @return
     *     The writersCanShare
     */
    public Boolean getWritersCanShare() {
        return writersCanShare;
    }

    /**
     * 
     * @param writersCanShare
     *     The writersCanShare
     */
    public void setWritersCanShare(Boolean writersCanShare) {
        this.writersCanShare = writersCanShare;
    }

    public Item withWritersCanShare(Boolean writersCanShare) {
        this.writersCanShare = writersCanShare;
        return this;
    }

    /**
     * 
     * @return
     *     The shared
     */
    public Boolean getShared() {
        return shared;
    }

    /**
     * 
     * @param shared
     *     The shared
     */
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Item withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 
     * @return
     *     The explicitlyTrashed
     */
    public Boolean getExplicitlyTrashed() {
        return explicitlyTrashed;
    }

    /**
     * 
     * @param explicitlyTrashed
     *     The explicitlyTrashed
     */
    public void setExplicitlyTrashed(Boolean explicitlyTrashed) {
        this.explicitlyTrashed = explicitlyTrashed;
    }

    public Item withExplicitlyTrashed(Boolean explicitlyTrashed) {
        this.explicitlyTrashed = explicitlyTrashed;
        return this;
    }

    /**
     * 
     * @return
     *     The appDataContents
     */
    public Boolean getAppDataContents() {
        return appDataContents;
    }

    /**
     * 
     * @param appDataContents
     *     The appDataContents
     */
    public void setAppDataContents(Boolean appDataContents) {
        this.appDataContents = appDataContents;
    }

    public Item withAppDataContents(Boolean appDataContents) {
        this.appDataContents = appDataContents;
        return this;
    }

    /**
     * 
     * @return
     *     The headRevisionId
     */
    public String getHeadRevisionId() {
        return headRevisionId;
    }

    /**
     * 
     * @param headRevisionId
     *     The headRevisionId
     */
    public void setHeadRevisionId(String headRevisionId) {
        this.headRevisionId = headRevisionId;
    }

    public Item withHeadRevisionId(String headRevisionId) {
        this.headRevisionId = headRevisionId;
        return this;
    }

    /**
     * 
     * @return
     *     The spaces
     */
    public List<String> getSpaces() {
        return spaces;
    }

    /**
     * 
     * @param spaces
     *     The spaces
     */
    public void setSpaces(List<String> spaces) {
        this.spaces = spaces;
    }

    public Item withSpaces(List<String> spaces) {
        this.spaces = spaces;
        return this;
    }

}
