package net.our.beans.infofile;
  public class UserPermission {

    private String kind;
    private String etag;
    private String id;
    private String selfLink;
    private String role;
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserPermission() {
    }

    /**
     * 
     * @param id
     * @param etag
     * @param role
     * @param selfLink
     * @param type
     * @param kind
     */
    public UserPermission(String kind, String etag, String id, String selfLink, String role, String type) {
        this.kind = kind;
        this.etag = etag;
        this.id = id;
        this.selfLink = selfLink;
        this.role = role;
        this.type = type;
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

    public UserPermission withKind(String kind) {
        this.kind = kind;
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

    public UserPermission withEtag(String etag) {
        this.etag = etag;
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

    public UserPermission withId(String id) {
        this.id = id;
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

    public UserPermission withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    /**
     * 
     * @return
     *     The role
     */
    public String getRole() {
        return role;
    }

    /**
     * 
     * @param role
     *     The role
     */
    public void setRole(String role) {
        this.role = role;
    }

    public UserPermission withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public UserPermission withType(String type) {
        this.type = type;
        return this;
    }

}
