
package net.our.beans.infofile.dropbox;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.*;


public class BeanFileInfoDropbox {

    @JsonProperty("rev")
    private String rev;
    @JsonProperty("read_only")
    private Boolean read_only;
    @JsonProperty("modifier")
    private Object modifier;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("revision")
    private Integer revision;
    //
    @JsonProperty("hash")
    private String hash;
     @JsonProperty("thumb_exists")
    private Boolean thumb_exists;
     @JsonProperty("bytes")
    private Integer bytes;
     @JsonProperty("path")
    private String path;
     @JsonProperty("is_dir")
    private Boolean is_dir;
     @JsonProperty("icon")
    private String icon;
     @JsonProperty("root")
    private String root;
     @JsonProperty("contents")
    private List<Content> contents = new ArrayList<Content>();
     @JsonProperty("size")
    private String size;

    /**
     * No args constructor for use in serialization
     * 
     */
    @JsonCreator
    public BeanFileInfoDropbox() {
    }

    /**
     * 
     * @param icon
     * @param thumb_exists
     * @param bytes
     * @param contents
     * @param root
     * @param hash
     * @param path
     * @param is_dir
     * @param size
     */

    
    @JsonCreator
    public BeanFileInfoDropbox(  @JsonProperty("rev")  String rev, @JsonProperty("read_only") Boolean read_only, @JsonProperty("modifier") Object modifier, @JsonProperty("modified") String modified, @JsonProperty("revision") Integer revision, @JsonProperty("hash") String hash,@JsonProperty("thumb_exists") Boolean thumb_exists, @JsonProperty("bytes") Integer bytes,  @JsonProperty("path") String path, @JsonProperty("is_dir") Boolean is_dir, @JsonProperty("icon") String icon,  @JsonProperty("root") String root,  @JsonProperty("contents") List<Content> contents, @JsonProperty("size") String size) {
        this.rev = rev;
        this.read_only = read_only;
        this.modifier = modifier;
        this.modified = modified;
        this.hash = hash;
        this.thumb_exists = thumb_exists;
        this.bytes = bytes;
        this.path = path;
        this.is_dir = is_dir;
        this.icon = icon;
        this.root = root;
        this.contents = contents;
        this.size = size;
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
     *     The hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * 
     * @param hash
     *     The hash
     */
    public void setHash(String hash) {
        this.hash = hash;
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
     *     The contents
     */
    public List<Content> getContents() {
        return contents;
    }

    /**
     * 
     * @param contents
     *     The contents
     */
    public void setContents(List<Content> contents) {
        this.contents = contents;
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

}
