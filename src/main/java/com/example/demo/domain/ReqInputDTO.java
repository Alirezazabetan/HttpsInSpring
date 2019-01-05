package com.example.demo.domain;

public class ReqInputDTO {
    private String utm_source;
    private String utm_medium;
    private String utm_campaign;
    private String ttrip;
    private String tplan;
    private String start;
    private String stop;
    private String dest;
    private float adc;
    private float chc;
    private String plan;
    private String country;


    // Getter Methods

    public String getUtm_source() {
        return utm_source;
    }

    public String getUtm_medium() {
        return utm_medium;
    }

    public String getUtm_campaign() {
        return utm_campaign;
    }

    public String getTtrip() {
        return ttrip;
    }

    public String getTplan() {
        return tplan;
    }

    public String getStart() {
        return start;
    }

    public String getStop() {
        return stop;
    }

    public String getDest() {
        return dest;
    }

    public float getAdc() {
        return adc;
    }

    public float getChc() {
        return chc;
    }

    public String getPlan() {
        return plan;
    }

    public String getCountry() {
        return country;
    }

    // Setter Methods

    public void setUtm_source(String utm_source) {
        this.utm_source = utm_source;
    }

    public void setUtm_medium(String utm_medium) {
        this.utm_medium = utm_medium;
    }

    public void setUtm_campaign(String utm_campaign) {
        this.utm_campaign = utm_campaign;
    }

    public void setTtrip(String ttrip) {
        this.ttrip = ttrip;
    }

    public void setTplan(String tplan) {
        this.tplan = tplan;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setAdc(float adc) {
        this.adc = adc;
    }

    public void setChc(float chc) {
        this.chc = chc;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
