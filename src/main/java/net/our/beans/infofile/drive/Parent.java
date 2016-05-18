package net.our.beans.infofile;
public class Parent {

    private String kind;
    private String id;
    private String selfLink;
    private String parentLink;
    private Boolean isRoot;

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

    public Parent withKind(String kind) {
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

    public Parent withId(String id) {
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

    public Parent withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    /**
     * 
     * @return
     *     The parentLink
     */
    public String getParentLink() {
        return parentLink;
    }

    /**
     * 
     * @param parentLink
     *     The parentLink
     */
    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    public Parent withParentLink(String parentLink) {
        this.parentLink = parentLink;
        return this;
    }

    /**
     * 
     * @return
     *     The isRoot
     */
    public Boolean getIsRoot() {
        return isRoot;
    }

    /**
     * 
     * @param isRoot
     *     The isRoot
     */
    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    public Parent withIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
        return this;
    }

}
