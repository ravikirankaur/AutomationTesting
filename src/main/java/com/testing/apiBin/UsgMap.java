
package com.testing.apiBin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsgMap {

    @SerializedName("oldRolloverText")
    @Expose
    private String oldRolloverText;
    @SerializedName("builtinText")
    @Expose
    private String builtinText;
    @SerializedName("builtinData")
    @Expose
    private String builtinData;
    @SerializedName("oldRolloverData")
    @Expose
    private String oldRolloverData;

    public String getOldRolloverText() {
        return oldRolloverText;
    }

    public void setOldRolloverText(String oldRolloverText) {
        this.oldRolloverText = oldRolloverText;
    }

    public String getBuiltinText() {
        return builtinText;
    }

    public void setBuiltinText(String builtinText) {
        this.builtinText = builtinText;
    }

    public String getBuiltinData() {
        return builtinData;
    }

    public void setBuiltinData(String builtinData) {
        this.builtinData = builtinData;
    }

    public String getOldRolloverData() {
        return oldRolloverData;
    }

    public void setOldRolloverData(String oldRolloverData) {
        this.oldRolloverData = oldRolloverData;
    }

}
