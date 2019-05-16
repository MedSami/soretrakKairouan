
package com.elham.soretrakkairouan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName("PICKUP_TYPE")
    @Expose
    private String pICKUPTYPE;
    @SerializedName("RT_ARRIVAL_TIME")
    @Expose
    private String rTARRIVALTIME;
    @SerializedName("RT_DEPARTURE_TIME")
    @Expose
    private String rTDEPARTURETIME;
    @SerializedName("PL_ARRIVAL_TIME")
    @Expose
    private String pLARRIVALTIME;
    @SerializedName("SHAPE_DIST_TRAVELED")
    @Expose
    private Double sHAPEDISTTRAVELED;
    @SerializedName("TIMEPOINT")
    @Expose
    private String tIMEPOINT;
    @SerializedName("DENUMLI")
    @Expose
    private String dENUMLI;
    @SerializedName("STOP_SEQUENCE")
    @Expose
    private String sTOPSEQUENCE;
    @SerializedName("DATE")
    @Expose
    private String dATE;
    @SerializedName("DECSTAT")
    @Expose
    private String dECSTAT;
    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("TRIP_ID")
    @Expose
    private String tRIPID;
    @SerializedName("PL_DEPARTURE_TIME")
    @Expose
    private String pLDEPARTURETIME;
    @SerializedName("DENOMLI")
    @Expose
    private String dENOMLI;

    public String getPICKUPTYPE() {
        return pICKUPTYPE;
    }

    public void setPICKUPTYPE(String pICKUPTYPE) {
        this.pICKUPTYPE = pICKUPTYPE;
    }

    public String getRTARRIVALTIME() {
        return rTARRIVALTIME;
    }

    public void setRTARRIVALTIME(String rTARRIVALTIME) {
        this.rTARRIVALTIME = rTARRIVALTIME;
    }

    public String getRTDEPARTURETIME() {
        return rTDEPARTURETIME;
    }

    public void setRTDEPARTURETIME(String rTDEPARTURETIME) {
        this.rTDEPARTURETIME = rTDEPARTURETIME;
    }

    public String getPLARRIVALTIME() {
        return pLARRIVALTIME;
    }

    public void setPLARRIVALTIME(String pLARRIVALTIME) {
        this.pLARRIVALTIME = pLARRIVALTIME;
    }

    public Double getSHAPEDISTTRAVELED() {
        return sHAPEDISTTRAVELED;
    }

    public void setSHAPEDISTTRAVELED(Double sHAPEDISTTRAVELED) {
        this.sHAPEDISTTRAVELED = sHAPEDISTTRAVELED;
    }

    public String getTIMEPOINT() {
        return tIMEPOINT;
    }

    public void setTIMEPOINT(String tIMEPOINT) {
        this.tIMEPOINT = tIMEPOINT;
    }

    public String getDENUMLI() {
        return dENUMLI;
    }

    public void setDENUMLI(String dENUMLI) {
        this.dENUMLI = dENUMLI;
    }

    public String getSTOPSEQUENCE() {
        return sTOPSEQUENCE;
    }

    public void setSTOPSEQUENCE(String sTOPSEQUENCE) {
        this.sTOPSEQUENCE = sTOPSEQUENCE;
    }

    public String getDATE() {
        return dATE;
    }

    public void setDATE(String dATE) {
        this.dATE = dATE;
    }

    public String getDECSTAT() {
        return dECSTAT;
    }

    public void setDECSTAT(String dECSTAT) {
        this.dECSTAT = dECSTAT;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTRIPID() {
        return tRIPID;
    }

    public void setTRIPID(String tRIPID) {
        this.tRIPID = tRIPID;
    }

    public String getPLDEPARTURETIME() {
        return pLDEPARTURETIME;
    }

    public void setPLDEPARTURETIME(String pLDEPARTURETIME) {
        this.pLDEPARTURETIME = pLDEPARTURETIME;
    }

    public String getDENOMLI() {
        return dENOMLI;
    }

    public void setDENOMLI(String dENOMLI) {
        this.dENOMLI = dENOMLI;
    }

}
