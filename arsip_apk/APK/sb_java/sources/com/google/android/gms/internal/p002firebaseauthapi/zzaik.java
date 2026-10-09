package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzaik implements zzaea<zzaik> {
    private static final String zza = "zzaik";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    static {
    }

    public zzaik() {
    }

    private final zzaik zzb(String r6) throws zzabr {
        JSONObject r02 = new JSONObject(r6);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzb = Strings.emptyToNull(r02.optString("idToken", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzc = Strings.emptyToNull(r02.optString("refreshToken", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzd = r02.optLong("expiresIn", 0);     // Catch: NullPointerException -> L4 Throwable -> L6
        Strings.emptyToNull(r02.optString("localId", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zze = r02.optBoolean("isNewUser", false);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzf = Strings.emptyToNull(r02.optString("temporaryProof", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzg = Strings.emptyToNull(r02.optString("phoneNumber", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        return this;
    L6:
        e = move-exception;
        throw zzail.zza(e, zza, r6);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zzb() {
        return this.zzb;
    }
}
