package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f38846a;

    public j(InputStream r1, String r2) {
        this.f38846a = b(r1);
        c(r2);
    }

    @Override // com.huawei.agconnect.config.impl.f
    public String a(String r6, String r7) {
        if (r6.endsWith(RemoteSettings.FORWARD_SLASH_STRING) == true) goto L16;
        String[] r02 = r6.split(RemoteSettings.FORWARD_SLASH_STRING);
        JSONObject r1 = this.f38846a;     // Catch: JSONException -> L15
        int r3 = 1;
    L8:
        if (r3 >= r02.length) goto L16;
        if (r3 == (r02.length - 1)) goto L11;
        r1 = r1.getJSONObject(r02[r3]);     // Catch: JSONException -> L15
        r3 = r3 + 1;
        goto L8
    L11:
        r6 = r1.get(r02[r3]).toString();     // Catch: JSONException -> L15
        return r6;
    L15:
        Log.w("InputStreamReader", "JSONException when reading 'path': " + r6);
    L16:
        return r7;
    }

    public final JSONObject b(InputStream r4) {
        if (r4 == null) goto L10;
        return new JSONObject(b.g(r4, "UTF-8"));
    L8:
        String r42 = "IOException when reading the 'Config' from InputStream.";
    L7:
        Log.e("InputStreamReader", r42);
    L6:
        r42 = "JSONException when reading the 'Config' from InputStream.";
    L10:
        return new JSONObject();
    }

    public final void c(String r7) {
        JSONObject r72 = e(r7);     // Catch: JSONException -> L22
        if (r72 == null) goto L32;
        String r2 = a("/configuration_version", "");     // Catch: JSONException -> L22
        BigDecimal r3 = new BigDecimal(IdManager.DEFAULT_VERSION_NAME);     // Catch: JSONException -> L22
        r3 = BigDecimal.valueOf(Double.parseDouble(r2));     // Catch: NumberFormatException -> L9 JSONException -> L22
    L11:
        if (r3.compareTo(new BigDecimal("2.0")) != 0) goto L14;
        this.f38846a.getJSONObject("client").put(HiAnalyticsConstant.BI_KEY_APP_ID, r72.getString(HiAnalyticsConstant.BI_KEY_APP_ID));     // Catch: JSONException -> L22
        return;
    L14:
        if (r3.compareTo(new BigDecimal("3.0")) < 0) goto L34;
        Iterator<String> r02 = r72.keys();     // Catch: JSONException -> L22
    L17:
        if (r02.hasNext() == false) goto L35;
        String r22 = r02.next();     // Catch: JSONException -> L22
        if ("package_name".equals(r22) == true) goto L17;
        d(r22, r72.get(r22), this.f38846a);     // Catch: JSONException -> L22
        goto L17
    L35:
        return;
    L34:
        return;
    L9:
        Log.d("InputStreamReader", "configuration_version to double error");     // Catch: JSONException -> L22
        goto L11
    L32:
        return;
    L22:
        Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
    }

    public final void d(String r5, Object r6, JSONObject r7) {
        if (r5 == null) goto L15;
        if (r6 == null) goto L16;
        if (r7 != null) goto L7;
        return;
    L7:
        if ((r6 instanceof JSONObject) == false) goto L12;
        JSONObject r62 = (JSONObject) r6;
        Iterator<String> r02 = r62.keys();
    L10:
        if (r02.hasNext() == false) goto L18;
        String r1 = r02.next();
        d(r1, r62.get(r1), r7.getJSONObject(r5));
        goto L10
    L18:
        return;
    L12:
        r7.put(r5, r6);
        return;
    L16:
        return;
    }

    public final JSONObject e(String r5) {
        JSONArray r02 = this.f38846a.getJSONArray("appInfos");
        int r1 = 0;
    L4:
        if (r1 >= r02.length()) goto L9;
        JSONObject r2 = r02.getJSONObject(r1);
        if (r2.getString("package_name").equals(r5) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return r2;
    L9:
        return null;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f38846a.toString().hashCode() + '}';
    }
}
