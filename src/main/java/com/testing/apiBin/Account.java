
package com.testing.apiBin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Account {

    @SerializedName("dslUnbilledDetails")
    @Expose
    private DslUnbilledDetails dslUnbilledDetails;
    @SerializedName("currentUsageDetail")
    @Expose
    private CurrentUsageDetail currentUsageDetail;
    @SerializedName("lob")
    @Expose
    private String lob;
    @SerializedName("accountSummary")
    @Expose
    private AccountSummary accountSummary;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("alerts")
    @Expose
    private List<Object> alerts = null;

    public DslUnbilledDetails getDslUnbilledDetails() {
        return dslUnbilledDetails;
    }

    public void setDslUnbilledDetails(DslUnbilledDetails dslUnbilledDetails) {
        this.dslUnbilledDetails = dslUnbilledDetails;
    }

    public CurrentUsageDetail getCurrentUsageDetail() {
        return currentUsageDetail;
    }

    public void setCurrentUsageDetail(CurrentUsageDetail currentUsageDetail) {
        this.currentUsageDetail = currentUsageDetail;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public AccountSummary getAccountSummary() {
        return accountSummary;
    }

    public void setAccountSummary(AccountSummary accountSummary) {
        this.accountSummary = accountSummary;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Object> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Object> alerts) {
        this.alerts = alerts;
    }

}
