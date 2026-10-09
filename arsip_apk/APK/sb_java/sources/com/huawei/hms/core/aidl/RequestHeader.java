package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.List;

/* loaded from: classes6.dex */
public class RequestHeader implements IMessageEntity {

    @Packed
    private int apiLevel;

    @Packed
    private List<String> apiNameList;

    @Packed
    private String appId;

    @Packed
    private String packageName;

    @Packed
    private int sdkVersion;

    @Packed
    private String sessionId;

    public RequestHeader() {
    }

    public List<String> getApiNameList() {
        return this.apiNameList;
    }

    public String getAppID() {
        return this.appId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setApiLevel(int r1) {
        this.apiLevel = r1;
    }

    public void setApiNameList(List<String> r1) {
        this.apiNameList = r1;
    }

    public void setAppID(String r1) {
        this.appId = r1;
    }

    public void setPackageName(String r1) {
        this.packageName = r1;
    }

    public void setSdkVersion(int r1) {
        this.sdkVersion = r1;
    }

    public void setSessionId(String r1) {
        this.sessionId = r1;
    }

    public RequestHeader(String r1, String r2, int r3, String r4) {
        this.appId = r1;
        this.packageName = r2;
        this.sdkVersion = r3;
        this.sessionId = r4;
    }
}
