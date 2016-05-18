package net.our.beans.infofile.dropbox;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.*;
public class Content {
    @JsonProperty("rev")
    private String rev;
    @JsonProperty("thumb_exists")
    private Boolean thumb_exists;
    @JsonProperty("path")
    private String path;
    @JsonProperty("is_dir")
    private Boolean is_dir;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("read_only")
    private Boolean read_only;
    @JsonProperty("modifier")
    private Object modifier;
    @JsonProperty("bytes")
    private Integer bytes;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("size")
    private String size;
    @JsonProperty("root")
    private String root;
    @JsonProperty("revision")
    private Integer revision;
    @JsonProperty("client_mtime")
    private String client_mtime;
    @JsonProperty("mime_type")
    private String mime_type;

    /**
     * No args constructor for use in serialization
     * 
     */
    @JsonCreator
    public Content() {
    }

    /**
     * @param rev
     * @param modifier
     * @param revision
     * @param icon
     * @param thumb_exists
     * @param rev
     * @param bytes
     * @param read_only
     * @param root
     * @param client_mtime
     * @param path
     * @param is_dir
     * @param mimeType
     * @param size
     * @param modified
     */
    
    @JsonCreator
    public Content( @JsonProperty("rev") String rev, @JsonProperty("thumb_exists") Boolean thumb_exists, @JsonProperty("path") String path, @JsonProperty("is_dir") Boolean is_dir, @JsonProperty("icon") String icon, @JsonProperty("read_only") Boolean read_only, @JsonProperty("modifier") Object modifier, @JsonProperty("bytes") Integer bytes, @JsonProperty("modified") String modified, @JsonProperty("size") String size, @JsonProperty("root") String root, @JsonProperty("revision") Integer revision, @JsonProperty("client_mtime") String client_mtime, @JsonProperty("mime_type") String mime_type) {
        this.rev = rev;
        this.thumb_exists = thumb_exists;
        this.path = path;
        this.is_dir = is_dir;
        this.icon = icon;
        this.read_only = read_only;
        this.modifier = modifier;
        this.bytes = bytes;
        this.modified = modified;
        this.size = size;
        this.root = root;
        this.revision = revision;
        this.client_mtime = client_mtime;
        this.mime_type = mime_type;
    }

    /**
     * 
     * @return
     *     The rev
     */
    @JsonProperty("rev")
    public String getRev() {
        return rev;
    }

    /**
     * 
     * @param rev
     *     The rev
     */
    @JsonProperty("rev")
    public void setRev(String rev) {
        this.rev = rev;
    }

    /**
     * 
     * @return
     *     The thumb_exists
     */
    public Boolean getThumb_exists() {
        return thumb_exists;
    }

    /**
     * 
     * @param thumb_exists
     *     The thumb_exists
     */
    public void setThumb_exists(Boolean thumb_exists) {
        this.thumb_exists = thumb_exists;
    }

    /**
     * 
     * @return
     *     The path
     */
    public String getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 
     * @return
     *     The is_dir
     */
    public Boolean getIs_dir() {
        return is_dir;
    }

    /**
     * 
     * @param is_dir
     *     The is_dir
     */
    public void setIs_dir(Boolean is_dir) {
        this.is_dir = is_dir;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The read_only
     */
    public Boolean getRead_only() {
        return read_only;
    }

    /**
     * 
     * @param read_only
     *     The read_only
     */
    public void setRead_only(Boolean read_only) {
        this.read_only = read_only;
    }

    /**
     * 
     * @return
     *     The modifier
     */
    public Object getModifier() {
        return modifier;
    }

    /**
     * 
     * @param modifier
     *     The modifier
     */
    public void setModifier(Object modifier) {
        this.modifier = modifier;
    }

    /**
     * 
     * @return
     *     The bytes
     */
    public Integer getBytes() {
        return bytes;
    }

    /**
     * 
     * @param bytes
     *     The bytes
     */
    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    /**
     * 
     * @return
     *     The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The size
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The root
     */
    public String getRoot() {
        return root;
    }

    /**
     * 
     * @param root
     *     The root
     */
    public void setRoot(String root) {
        this.root = root;
    }

    /**
     * 
     * @return
     *     The revision
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 
     * @param revision
     *     The revision
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * 
     * @return
     *     The client_mtime
     */
    public String getClient_mtime() {
        return client_mtime;
    }

    /**
     * 
     * @param client_mtime
     *     The client_mtime
     */
    public void setClient_mtime(String client_mtime) {
        this.client_mtime = client_mtime;
    }

    /**
     * 
     * @return
     *     The mime_type
     */
    public String getMime_type() {
        return mime_type;
    }

    /**
     * 
     * @param mime_type
     *     The mime_type
     */
    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

}