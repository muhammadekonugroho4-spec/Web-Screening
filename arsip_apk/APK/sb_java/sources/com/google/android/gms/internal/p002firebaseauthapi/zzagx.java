package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagx {
    private Long zza;
    private Long zzb;

    public zzagx() {
    }

    public static zzagx zza(String r4) throws UnsupportedEncodingException {
        zzagx r02 = new zzagx();     // Catch: JSONException -> L4
        JSONObject r1 = new JSONObject(r4);     // Catch: JSONException -> L4
        r1.optString("iss");     // Catch: JSONException -> L4
        r1.optString("aud");     // Catch: JSONException -> L4
        r1.optString("sub");     // Catch: JSONException -> L4
        r02.zza = Long.valueOf(r1.optLong("iat"));     // Catch: JSONException -> L4
        r02.zzb = Long.valueOf(r1.optLong("exp"));     // Catch: JSONException -> L4
        r1.optBoolean("is_anonymous");     // Catch: JSONException -> L4
        return r02;
    L4:
        e = move-exception;
        if (Log.isLoggable("JwtToken", 3) == false) goto L9;
        Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e));
    L9:
        throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e));
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
