package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzafu implements zzaea<zzafu> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzafu";
    private String zzb;

    static {
    }

    public zzafu() {
    }

    private final zzafu zzb(String r7) throws zzabr {
        JSONObject r1 = new JSONObject(new JSONObject(r7).getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR));     // Catch: Throwable -> L4 JSONException -> L6
        r1.getInt("code");     // Catch: Throwable -> L4 JSONException -> L6
        this.zzb = r1.getString("message");     // Catch: Throwable -> L4 JSONException -> L6
        return this;
    L4:
        e = move-exception;
        Log.e(zza, "Failed to parse error for string [" + r7 + "] with exception: " + e.getMessage());
        throw new zzabr("Failed to parse error for string [" + r7 + com.clevertap.android.sdk.Constants.AES_SUFFIX, e);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        if (TextUtils.isEmpty(this.zzb) == true) goto L6;
        return true;
    L6:
        return false;
    }
}
