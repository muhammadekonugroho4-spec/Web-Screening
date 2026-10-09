package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzahq implements zzaea<zzahq> {
    private static final String zza = "zzahq";
    private String zzb;
    private String zzc;
    private long zzd;

    static {
    }

    public zzahq() {
    }

    private final zzahq zzb(String r5) throws zzabr {
        JSONObject r02 = new JSONObject(r5);     // Catch: Throwable -> L4 JSONException -> L6
        this.zzb = Strings.emptyToNull(r02.optString("idToken", null));     // Catch: Throwable -> L4 JSONException -> L6
        Strings.emptyToNull(r02.optString("displayName", null));     // Catch: Throwable -> L4 JSONException -> L6
        Strings.emptyToNull(r02.optString("email", null));     // Catch: Throwable -> L4 JSONException -> L6
        this.zzc = Strings.emptyToNull(r02.optString("refreshToken", null));     // Catch: Throwable -> L4 JSONException -> L6
        this.zzd = r02.optLong("expiresIn", 0);     // Catch: Throwable -> L4 JSONException -> L6
        return this;
    L4:
        e = move-exception;
        throw zzail.zza(e, zza, r5);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zzb() {
        return this.zzb;
    }
}
