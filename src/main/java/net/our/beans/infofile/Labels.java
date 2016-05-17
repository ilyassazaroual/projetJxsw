package net.our.beans.infofile;
public class Labels {

    private Boolean starred;
    private Boolean hidden;
    private Boolean trashed;
    private Boolean restricted;
    private Boolean viewed;

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
    public Boolean getStarred() {
        return starred;
    }

    /**
     * 
     * @param starred
     *     The starred
     */
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public Labels withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Labels withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * 
     * @return
     *     The trashed
     */
    public Boolean getTrashed() {
        return trashed;
    }

    /**
     * 
     * @param trashed
     *     The trashed
     */
    public void setTrashed(Boolean trashed) {
        this.trashed = trashed;
    }

    public Labels withTrashed(Boolean trashed) {
        this.trashed = trashed;
        return this;
    }

    /**
     * 
     * @return
     *     The restricted
     */
    public Boolean getRestricted() {
        return restricted;
    }

    /**
     * 
     * @param restricted
     *     The restricted
     */
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public Labels withRestricted(Boolean restricted) {
        this.restricted = restricted;
        return this;
    }

    /**
     * 
     * @return
     *     The viewed
     */
    public Boolean getViewed() {
        return viewed;
    }

    /**
     * 
     * @param viewed
     *     The viewed
     */
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    public Labels withViewed(Boolean viewed) {
        this.viewed = viewed;
        return this;
    }

}
