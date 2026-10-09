package com.clevertap.android.sdk.utils;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class r {
    public static Bundle a(String r5, boolean r6) {
        if (r5 == null) goto L4;
        Bundle r02 = new Bundle();
        UrlQuerySanitizer r1 = new UrlQuerySanitizer();     // Catch: Throwable -> L19
        r1.setAllowUnregisteredParamaters(true);     // Catch: Throwable -> L19
        r1.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());     // Catch: Throwable -> L19
        r1.parseUrl(r5);     // Catch: Throwable -> L19
        Iterator<String> r52 = r1.getParameterSet().iterator();     // Catch: Throwable -> L19
    L7:
        if (r52.hasNext() == false) goto L18;
        String r2 = r52.next();     // Catch: Throwable -> L19
        String r3 = e(r2, r1, false);     // Catch: Throwable -> L19
        if (r3 == null) goto L7;
        if (r6 == true) goto L16;
        if (r2.equals(Constants.KEY_C2A) == true) goto L16;
        r02.putString(r2, URLDecoder.decode(r3, "UTF-8"));     // Catch: Throwable -> L19
    L16:
        r02.putString(r2, r3);     // Catch: Throwable -> L19
    L18:
        return r02;
    L4:
        return new Bundle();
    }

    public static JSONObject b(Uri r6) {
        JSONObject r1 = new JSONObject();
        UrlQuerySanitizer r2 = new UrlQuerySanitizer();     // Catch: Throwable -> L10
        r2.setAllowUnregisteredParamaters(true);     // Catch: Throwable -> L10
        r2.parseUrl(r6.toString());     // Catch: Throwable -> L10
        String r62 = c("source", r2);     // Catch: Throwable -> L10
        String r3 = c("medium", r2);     // Catch: Throwable -> L10
        String r4 = c("campaign", r2);     // Catch: Throwable -> L10
        r1.put("us", r62);     // Catch: Throwable -> L10
        r1.put("um", r3);     // Catch: Throwable -> L10
        r1.put("uc", r4);     // Catch: Throwable -> L10
        String r63 = f("medium", r2);     // Catch: Throwable -> L10
        if (r63 != null) goto L6;
    L8:
        Logger.d("Referrer data: " + r1.toString(4));     // Catch: Throwable -> L10
        goto L9
    L6:
        if (r63.matches("^email$|^social$|^search$") == false) goto L8;
        r1.put("wm", r63);     // Catch: Throwable -> L10
    L9:
        return r1;
    }

    public static String c(String r1, UrlQuerySanitizer r2) {
        String r02 = d(r1, r2);
        if (r02 != null) goto L9;
        String r12 = f(r1, r2);
        if (r12 == null) goto L7;
        return r12;
    L7:
        return null;
    L9:
        return r02;
    }

    public static String d(String r2, UrlQuerySanitizer r3) {
        return e("utm_" + r2, r3, true);
    }

    public static String e(String r1, UrlQuerySanitizer r2, boolean r3) {
        if (r1 == null) goto L18;
        if (r2 == null) goto L18;
        String r12 = r2.getValue(r1);     // Catch: Throwable -> L14
        if (r12 != null) goto L9;
        return null;
    L9:
        if (r3 == true) goto L11;
    L16:
        return r12;
    L11:
        if (r12.length() <= 120) goto L16;
        return r12.substring(0, Constants.MAX_KEY_LENGTH);
    L14:
        th = move-exception;
        Logger.v("Couldn't parse the URI", th);
    L18:
        return null;
    }

    public static String f(String r2, UrlQuerySanitizer r3) {
        return e(Constants.WZRK_PREFIX + r2, r3, true);
    }
}
