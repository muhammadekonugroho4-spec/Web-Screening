package com.midtrans.sdk.corekit.models.snap;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class EnabledPayment implements Serializable {
    public static final String STATUS_DOWN = "down";
    public static final String STATUS_UP = "up";
    private String acquirer;
    private String category;
    private String status;
    private String type;

    public EnabledPayment(String r1, String r2) {
        this.type = r1;
        this.category = r2;
    }

    public String getAcquirer() {
        return this.acquirer;
    }

    public String getCategory() {
        return this.category;
    }

    public String getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public void setAcquirer(String r1) {
        this.acquirer = r1;
    }

    public void setCategory(String r1) {
        this.category = r1;
    }

    public void setStatus(String r1) {
        this.status = r1;
    }

    public void setType(String r1) {
        this.type = r1;
    }
}
