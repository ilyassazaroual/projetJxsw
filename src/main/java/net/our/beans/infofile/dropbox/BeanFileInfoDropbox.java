
package net.our.beans.infofile.dropbox;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.*;


public class BeanFileInfoDropbox {

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
    public BeanFileInfoDropbox(@JsonProperty("hash") String hash,@JsonProperty("thumb_exists") Boolean thumb_exists, @JsonProperty("bytes") Integer bytes,  @JsonProperty("path") String path, @JsonProperty("is_dir") Boolean is_dir, @JsonProperty("icon") String icon,  @JsonProperty("root") String root,  @JsonProperty("contents") List<Content> contents, @JsonProperty("size") String size) {
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
