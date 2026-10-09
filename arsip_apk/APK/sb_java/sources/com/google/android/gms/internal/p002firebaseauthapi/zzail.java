package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzail {
    public static zzabr zza(Exception r5, String r6, String r7) {
        Log.e(r6, "Failed to parse " + r6 + " for string [" + r7 + "] with exception: " + r5.getMessage());
        return new zzabr("Failed to parse " + r6 + " for string [" + r7 + Constants.AES_SUFFIX, r5);
    }

    public static List<String> zza(JSONArray r3) throws JSONException {
        ArrayList r02 = new ArrayList();
        if (r3 != null) goto L5;
    L11:
        return r02;
    L5:
        if (r3.length() == 0) goto L11;
        int r1 = 0;
    L9:
        if (r1 >= r3.length()) goto L11;
        r02.add(r3.getString(r1));
        r1 = r1 + 1;
        goto L9
    }

    public static void zza(JSONObject r2) throws JSONException {
        r2.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject r02, String r1, String r2) throws JSONException {
        r02.put(r1, r2);
        r02.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        r02.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
