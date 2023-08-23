package com.joelr.nasapic.model;

import java.time.LocalDate;

public class NasaPic {

    /*

    JSON example
    {
    "copyright": "Mike Selby",
    "date": "2023-08-16",
    "explanation": "Locked in a cosmic embrace, two large galaxies are merging at the center of this sharp ...
    "hdurl": "https://apod.nasa.gov/apod/image/2308/NGC-7284-7285-LRGB-crop-CDK-1000-7-August-2023.jpg",
    "media_type": "image",
    "service_version": "v1",
    "title": "Arp 93: A Cosmic Embrace",
    "url": "https://apod.nasa.gov/apod/image/2308/NGC-7284-7285-LRGB-crop-CDK-1000-7-August-2023x1024.jpg"
    }

     */

    private String copyRight;
    private LocalDate date;
    private String explanation;
    private String hdurl;
    private String mediatype;
    private String serviceVersion;
    private String title;
    private String url;

    public NasaPic() {
    }

    public NasaPic(String copyRight, LocalDate date, String explanation, String hdurl,
                   String mediatype, String serviceVersion, String title, String url){
        this.copyRight = copyRight;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.mediatype = mediatype;
        this.serviceVersion = serviceVersion;
        this.title = title;
        this.url = url;
    }

    public String getCopyRight(){
        return copyRight;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getExplanation(){
        return explanation;
    }

    public String getHdurl(){
        return hdurl;
    }

    public String getMediatype() {
        return mediatype;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public void setMediatype(String mediatype) {
        this.mediatype = mediatype;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @java.lang.Override
    public java.lang.String toString(){
        return  System.lineSeparator() +
                "ɴᴀꜱᴀ ɪᴍᴀɢᴇ ᴏꜰ ᴛʜᴇ ᴅᴀʏ" + System.lineSeparator() +
                // unicode characters for italicized "INFORMATION"
                "\uD835\uDE10\uD835\uDE15\uD835\uDE0D\uD835\uDE16\uD835\uDE19\uD835" +
                "\uDE14\uD835\uDE08\uD835\uDE1B\uD835\uDE10\uD835\uDE16\uD835\uDE15" + System.lineSeparator() +
                "title : " + title + System.lineSeparator() +
                "date : " + date + System.lineSeparator() +
                "explanation : " + explanation + System.lineSeparator() +
                "copyRight : " + copyRight + System.lineSeparator() +
                "url : " + url + System.lineSeparator() +
                "hdUrl : " + hdurl + System.lineSeparator() +
                "mediaType : " + mediatype + System.lineSeparator() +
                "serviceVersion : " + serviceVersion + System.lineSeparator();

    }

}