package com.xbgyy.system.model;

public class Url {
    private Integer urlid;

    private String urlname;

    private Integer priid;

    public Integer getUrlid() {
        return urlid;
    }

    public void setUrlid(Integer urlid) {
        this.urlid = urlid;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname == null ? null : urlname.trim();
    }

    public Integer getPriid() {
        return priid;
    }

    public void setPriid(Integer priid) {
        this.priid = priid;
    }
}