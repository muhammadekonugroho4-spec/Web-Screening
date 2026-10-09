package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzafz implements zzaea<zzafz> {
    private static final String zza = "zzafz";
    private String zzb;
    private String zzc;

    static {
    }

    public zzafz() {
    }

    private final zzafz zzb(String r4) throws zzabr {
        JSONObject r02 = new JSONObject(r4);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzb = r02.optString("idToken", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzc = r02.optString("refreshToken", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        return this;
    L6:
        e = move-exception;
        throw zzail.zza(e, zza, r4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
