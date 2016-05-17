package net.our.beans.infofile;
public class LastModifyingUser {

    private String kind;
    private String displayName;
    private Boolean isAuthenticatedUser;
    private String permissionId;
    private String emailAddress;

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

    public LastModifyingUser withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public LastModifyingUser withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 
     * @return
     *     The isAuthenticatedUser
     */
    public Boolean getIsAuthenticatedUser() {
        return isAuthenticatedUser;
    }

    /**
     * 
     * @param isAuthenticatedUser
     *     The isAuthenticatedUser
     */
    public void setIsAuthenticatedUser(Boolean isAuthenticatedUser) {
        this.isAuthenticatedUser = isAuthenticatedUser;
    }

    public LastModifyingUser withIsAuthenticatedUser(Boolean isAuthenticatedUser) {
        this.isAuthenticatedUser = isAuthenticatedUser;
        return this;
    }

    /**
     * 
     * @return
     *     The permissionId
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 
     * @param permissionId
     *     The permissionId
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public LastModifyingUser withPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LastModifyingUser withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

}
