package com.huawei.hms.support.api.client;

/* loaded from: classes6.dex */
public class SubAppInfo {
    private String subAppID;

    public SubAppInfo(SubAppInfo r1) {
        if (r1 == null) goto L6;
        this.subAppID = r1.getSubAppID();
        return;
    }

    public String getSubAppID() {
        return this.subAppID;
    }

    public void setSubAppInfoID(String r1) {
        this.subAppID = r1;
    }

    public SubAppInfo(String r1) {
        this.subAppID = r1;
    }
}
