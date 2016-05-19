
package net.our.beans.infofile.drive;

import java.util.HashMap;
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
    "application/rtf",
    "application/vnd.oasis.opendocument.text",
    "text/html",
    "application/pdf",
    "application/zip",
    "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
    "text/plain"
})
public class ExportLinks {

    @JsonProperty("application/rtf")
    private String applicationRtf;
    @JsonProperty("application/vnd.oasis.opendocument.text")
    private String applicationVndOasisOpendocumentText;
    @JsonProperty("text/html")
    private String textHtml;
    @JsonProperty("application/pdf")
    private String applicationPdf;
    @JsonProperty("application/zip")
    private String applicationZip;
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    private String applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    @JsonProperty("text/plain")
    private String textPlain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExportLinks() {
    }

    /**
     * 
     * @param applicationPdf
     * @param applicationZip
     * @param applicationRtf
     * @param applicationVndOasisOpendocumentText
     * @param applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument
     * @param textPlain
     * @param textHtml
     */
    public ExportLinks(String applicationRtf, String applicationVndOasisOpendocumentText, String textHtml, String applicationPdf, String applicationZip, String applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument, String textPlain) {
        this.applicationRtf = applicationRtf;
        this.applicationVndOasisOpendocumentText = applicationVndOasisOpendocumentText;
        this.textHtml = textHtml;
        this.applicationPdf = applicationPdf;
        this.applicationZip = applicationZip;
        this.applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument = applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
        this.textPlain = textPlain;
    }

    /**
     * 
     * @return
     *     The applicationRtf
     */
    @JsonProperty("application/rtf")
    public String getApplicationRtf() {
        return applicationRtf;
    }

    /**
     * 
     * @param applicationRtf
     *     The application/rtf
     */
    @JsonProperty("application/rtf")
    public void setApplicationRtf(String applicationRtf) {
        this.applicationRtf = applicationRtf;
    }

    /**
     * 
     * @return
     *     The applicationVndOasisOpendocumentText
     */
    @JsonProperty("application/vnd.oasis.opendocument.text")
    public String getApplicationVndOasisOpendocumentText() {
        return applicationVndOasisOpendocumentText;
    }

    /**
     * 
     * @param applicationVndOasisOpendocumentText
     *     The application/vnd.oasis.opendocument.text
     */
    @JsonProperty("application/vnd.oasis.opendocument.text")
    public void setApplicationVndOasisOpendocumentText(String applicationVndOasisOpendocumentText) {
        this.applicationVndOasisOpendocumentText = applicationVndOasisOpendocumentText;
    }

    /**
     * 
     * @return
     *     The textHtml
     */
    @JsonProperty("text/html")
    public String getTextHtml() {
        return textHtml;
    }

    /**
     * 
     * @param textHtml
     *     The text/html
     */
    @JsonProperty("text/html")
    public void setTextHtml(String textHtml) {
        this.textHtml = textHtml;
    }

    /**
     * 
     * @return
     *     The applicationPdf
     */
    @JsonProperty("application/pdf")
    public String getApplicationPdf() {
        return applicationPdf;
    }

    /**
     * 
     * @param applicationPdf
     *     The application/pdf
     */
    @JsonProperty("application/pdf")
    public void setApplicationPdf(String applicationPdf) {
        this.applicationPdf = applicationPdf;
    }

    /**
     * 
     * @return
     *     The applicationZip
     */
    @JsonProperty("application/zip")
    public String getApplicationZip() {
        return applicationZip;
    }

    /**
     * 
     * @param applicationZip
     *     The application/zip
     */
    @JsonProperty("application/zip")
    public void setApplicationZip(String applicationZip) {
        this.applicationZip = applicationZip;
    }

    /**
     * 
     * @return
     *     The applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public String getApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument() {
        return applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    }

    /**
     * 
     * @param applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument
     *     The application/vnd.openxmlformats-officedocument.wordprocessingml.document
     */
    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public void setApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument(String applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument) {
        this.applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument = applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    }

    /**
     * 
     * @return
     *     The textPlain
     */
    @JsonProperty("text/plain")
    public String getTextPlain() {
        return textPlain;
    }

    /**
     * 
     * @param textPlain
     *     The text/plain
     */
    @JsonProperty("text/plain")
    public void setTextPlain(String textPlain) {
        this.textPlain = textPlain;
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
