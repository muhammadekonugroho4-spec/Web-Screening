package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzaig implements zzaea<zzaig> {
    private static final String zza = "zzaig";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    static {
    }

    public zzaig() {
    }

    private final zzaig zzb(String r5) throws zzabr {
        JSONObject r02 = new JSONObject(r5);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzb = Strings.emptyToNull(r02.optString("idToken", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzc = Strings.emptyToNull(r02.optString("refreshToken", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzd = r02.optLong("expiresIn", 0);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zze = r02.optBoolean("isNewUser", false);     // Catch: NullPointerException -> L4 Throwable -> L6
        return this;
    L6:
        e = move-exception;
        throw zzail.zza(e, zza, r5);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
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
