package com.clevertap.android.sdk.utils;

import android.os.Parcel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class k {
    public static final JSONArray a(JSONArray r5, kotlin.jvm.functions.l r6) {
        kotlin.jvm.internal.p.l(r5, "<this>");
        kotlin.jvm.internal.p.l(r6, "predicate");
        JSONArray r02 = new JSONArray();
        int r1 = r5.length();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        JSONObject r3 = r5.optJSONObject(r2);
        if (r3 == null) goto L9;
        if (((Boolean) r6.invoke(r3)).booleanValue() == false) goto L9;
        r02.put(r3);
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        return r02;
    }

    public static final String b(JSONObject r1, String r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (r1.has(r2) == true) goto L5;
        return null;
    L5:
        return r1.getString(r2);
    }

    public static final void c(JSONArray r2, Object r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, "value");
        int r02 = 0;
    L4:
        if (r02 >= r2.length()) goto L6;
        Object r1 = r2.get(r02);
        r2.put(r02, r3);
        r02 = r02 + 1;
        r3 = r1;
        goto L4
    L6:
        r2.put(r3);
    }

    public static final JSONObject d(Parcel r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        String r22 = r2.readString();     // Catch: JSONException -> L8
        if (r22 == null) goto L7;
        return new JSONObject(r22);
    L7:
        return null;
    }

    public static final void e(Parcel r1, JSONObject r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        if (r2 == null) goto L5;
        String r22 = r2.toString();
    L6:
        r1.writeString(r22);
        return;
    L5:
        r22 = null;
        goto L6
    }
}
