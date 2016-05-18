
package net.our.beans.infofile;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;


public class BeanFilesDrive {

    private String kind;
    private String etag;
    private String selfLink;
    private String nextPageToken;
    private String nextLink;
    private List<Item> items = new ArrayList<Item>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BeanFilesDrive() {
    }

    /**
     * 
     * @param etag
     * @param items
     * @param nextPageToken
     * @param selfLink
     * @param kind
     * @param nextLink
     */
    public BeanFilesDrive(String kind, String etag, String selfLink, String nextPageToken, String nextLink, List<Item> items) {
        this.kind = kind;
        this.etag = etag;
        this.selfLink = selfLink;
        this.nextPageToken = nextPageToken;
        this.nextLink = nextLink;
        this.items = items;
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

    public BeanFilesDrive withKind(String kind) {
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

    public BeanFilesDrive withEtag(String etag) {
        this.etag = etag;
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

    public BeanFilesDrive withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    /**
     * 
     * @return
     *     The nextPageToken
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * 
     * @param nextPageToken
     *     The nextPageToken
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public BeanFilesDrive withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * 
     * @return
     *     The nextLink
     */
    public String getNextLink() {
        return nextLink;
    }

    /**
     * 
     * @param nextLink
     *     The nextLink
     */
    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }

    public BeanFilesDrive withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BeanFilesDrive withItems(List<Item> items) {
        this.items = items;
        return this;
    }
  

}
