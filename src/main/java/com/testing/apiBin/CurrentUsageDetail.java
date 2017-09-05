
package com.testing.apiBin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentUsageDetail {

    @SerializedName("highSpeedDataTransferlimit")
    @Expose
    private String highSpeedDataTransferlimit;
    @SerializedName("gbsUsedData")
    @Expose
    private String gbsUsedData;
    @SerializedName("gbsLeft")
    @Expose
    private String gbsLeft;
    @SerializedName("usgMap")
    @Expose
    private UsgMap usgMap;

    public String getHighSpeedDataTransferlimit() {
        return highSpeedDataTransferlimit;
    }

    public void setHighSpeedDataTransferlimit(String highSpeedDataTransferlimit) {
        this.highSpeedDataTransferlimit = highSpeedDataTransferlimit;
    }

    public String getGbsUsedData() {
        return gbsUsedData;
    }

    public void setGbsUsedData(String gbsUsedData) {
        this.gbsUsedData = gbsUsedData;
    }

    public String getGbsLeft() {
        return gbsLeft;
    }

    public void setGbsLeft(String gbsLeft) {
        this.gbsLeft = gbsLeft;
    }

    public UsgMap getUsgMap() {
        return usgMap;
    }

    public void setUsgMap(UsgMap usgMap) {
        this.usgMap = usgMap;
    }

}
