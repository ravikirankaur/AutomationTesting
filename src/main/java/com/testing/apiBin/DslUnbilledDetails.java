
package com.testing.apiBin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DslUnbilledDetails {

    @SerializedName("serviceInstance")
    @Expose
    private String serviceInstance;
    @SerializedName("unbillAmt")
    @Expose
    private String unbillAmt;
    @SerializedName("outstandingAmt")
    @Expose
    private String outstandingAmt;
    @SerializedName("dueDate")
    @Expose
    private String dueDate;
    @SerializedName("fromDate")
    @Expose
    private String fromDate;
    @SerializedName("toDate")
    @Expose
    private String toDate;
    @SerializedName("dueDateNew")
    @Expose
    private String dueDateNew;
    @SerializedName("fromDateNew")
    @Expose
    private String fromDateNew;
    @SerializedName("toDateNew")
    @Expose
    private String toDateNew;

    public String getServiceInstance() {
        return serviceInstance;
    }

    public void setServiceInstance(String serviceInstance) {
        this.serviceInstance = serviceInstance;
    }

    public String getUnbillAmt() {
        return unbillAmt;
    }

    public void setUnbillAmt(String unbillAmt) {
        this.unbillAmt = unbillAmt;
    }

    public String getOutstandingAmt() {
        return outstandingAmt;
    }

    public void setOutstandingAmt(String outstandingAmt) {
        this.outstandingAmt = outstandingAmt;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getDueDateNew() {
        return dueDateNew;
    }

    public void setDueDateNew(String dueDateNew) {
        this.dueDateNew = dueDateNew;
    }

    public String getFromDateNew() {
        return fromDateNew;
    }

    public void setFromDateNew(String fromDateNew) {
        this.fromDateNew = fromDateNew;
    }

    public String getToDateNew() {
        return toDateNew;
    }

    public void setToDateNew(String toDateNew) {
        this.toDateNew = toDateNew;
    }

}
