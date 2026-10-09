package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class HianalyticsBaseData {
    public static final String EVENT_ID = "url_request";
    public static final String SDK_NAME = "sdk_name";
    public static final String SDK_TYPE = "sdk_type";
    public static final String SDK_VERSION = "sdk_version";
    private static final String TAG = "HianalyticsBaseData";
    private LinkedHashMap<String, String> data;

    public HianalyticsBaseData() {
        LinkedHashMap<String, String> r02 = new LinkedHashMap();
        this.data = r02;
        r02.put(SDK_TYPE, "UxPP");
        this.data.put(SDK_NAME, "networkkit");
    }

    public LinkedHashMap<String, String> get() {
        return this.data;
    }

    public HianalyticsBaseData put(String r3, String r4) {
        if (r3 == null) goto L7;
        if (r4 == null) goto L7;
        this.data.put(r3, r4);
        return this;
    L7:
        Logger.v(TAG, "key = " + r3 + " : value = " + r4);
        return this;
    }

    public HianalyticsBaseData putIfNotDefault(String r1, long r2, long r4) {
        if (r2 != r4) goto L6;
        return this;
    L6:
        return put(r1, r2);
    }

    public String toString() {
        JSONObject r02 = new JSONObject();
        Iterator<Map.Entry<String, String>> r1 = get().entrySet().iterator();     // Catch: JSONException -> L8
    L4:
        if (r1.hasNext() == false) goto L11;
        Map.Entry<String, String> r2 = r1.next();     // Catch: JSONException -> L8
        r02.put(r2.getKey(), r2.getValue());     // Catch: JSONException -> L8
    L11:
        return r02.toString();
    L8:
        e = move-exception;
        Logger.w(TAG, "catch JSONException", e);
        goto L11
    }

    public HianalyticsBaseData put(String r4, long r5) {
        if (r4 != null) goto L5;
        Logger.v(TAG, "key = null : value = " + r5);
        return this;
    L5:
        this.data.put(r4, "" + r5);
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> r2) {
        if (r2 != null) goto L4;
    L8:
        Logger.v(TAG, "data is null");
        return this;
    L4:
        if (r2.isEmpty() == true) goto L8;
        this.data.putAll(r2);
        return this;
    }
}
