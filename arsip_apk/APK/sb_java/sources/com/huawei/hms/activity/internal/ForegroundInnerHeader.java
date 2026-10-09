package com.huawei.hms.activity.internal;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ForegroundInnerHeader {

    /* renamed from: a, reason: collision with root package name */
    private int f38892a;

    /* renamed from: b, reason: collision with root package name */
    private String f38893b;

    /* renamed from: c, reason: collision with root package name */
    private String f38894c;

    public ForegroundInnerHeader() {
    }

    public void fromJson(String r3) {
        JSONObject r02 = new JSONObject(r3);     // Catch: JSONException -> L4
        this.f38892a = JsonUtil.getIntValue(r02, "apkVersion");     // Catch: JSONException -> L4
        this.f38893b = JsonUtil.getStringValue(r02, Constants.KEY_ACTION);     // Catch: JSONException -> L4
        this.f38894c = JsonUtil.getStringValue(r02, "responseCallbackKey");     // Catch: JSONException -> L4
        return;
    L4:
        e = move-exception;
        HMSLog.e("ForegroundInnerHeader", "fromJson failed: " + e.getMessage());
    }

    public String getAction() {
        return this.f38893b;
    }

    public int getApkVersion() {
        return this.f38892a;
    }

    public String getResponseCallbackKey() {
        return this.f38894c;
    }

    public void setAction(String r1) {
        this.f38893b = r1;
    }

    public void setApkVersion(int r1) {
        this.f38892a = r1;
    }

    public void setResponseCallbackKey(String r1) {
        this.f38894c = r1;
    }

    public String toJson() {
        JSONObject r02 = new JSONObject();
        r02.put("apkVersion", this.f38892a);     // Catch: JSONException -> L9
        r02.put(Constants.KEY_ACTION, this.f38893b);     // Catch: JSONException -> L9
        r02.put("responseCallbackKey", this.f38894c);     // Catch: JSONException -> L9
    L12:
        return r02.toString();
    L9:
        e = move-exception;
        HMSLog.e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e.getMessage());
        goto L12
    }

    public String toString() {
        return "apkVersion:" + this.f38892a + ", action:" + this.f38893b + ", responseCallbackKey:" + this.f38894c;
    }
}
