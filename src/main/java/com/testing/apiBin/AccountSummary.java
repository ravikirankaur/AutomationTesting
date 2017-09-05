
package com.testing.apiBin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountSummary {

    @SerializedName("siNumber")
    @Expose
    private String siNumber;
    @SerializedName("circleId")
    @Expose
    private String circleId;
    @SerializedName("bsbCircleId")
    @Expose
    private String bsbCircleId;
    @SerializedName("emailId")
    @Expose
    private String emailId;
    @SerializedName("account")
    @Expose
    private String account;
    @SerializedName("isSSOFlag")
    @Expose
    private String isSSOFlag;
    @SerializedName("deleteSI")
    @Expose
    private String deleteSI;

    public String getSiNumber() {
        return siNumber;
    }

    public void setSiNumber(String siNumber) {
        this.siNumber = siNumber;
    }

    public String getCircleId() {
        return circleId;
    }

    public void setCircleId(String circleId) {
        this.circleId = circleId;
    }

    public String getBsbCircleId() {
        return bsbCircleId;
    }

    public void setBsbCircleId(String bsbCircleId) {
        this.bsbCircleId = bsbCircleId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIsSSOFlag() {
        return isSSOFlag;
    }

    public void setIsSSOFlag(String isSSOFlag) {
        this.isSSOFlag = isSSOFlag;
    }

    public String getDeleteSI() {
        return deleteSI;
    }

    public void setDeleteSI(String deleteSI) {
        this.deleteSI = deleteSI;
    }

}
