package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzafx implements zzaea<zzafx> {
    private static final String zza = "zzafx";
    private String zzb;
    private String zzc;
    private boolean zzd;
    private long zze;
    private List<zzagz> zzf;
    private String zzg;

    static {
    }

    public zzafx() {
    }

    private final zzafx zzb(String r6) throws zzabr {
        JSONObject r02 = new JSONObject(r6);     // Catch: NullPointerException -> L4 Throwable -> L6
        r02.optString("localId", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        r02.optString("email", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzb = r02.optString("idToken", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzc = r02.optString("refreshToken", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzd = r02.optBoolean("isNewUser", false);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zze = r02.optLong("expiresIn", 0);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzf = zzagz.zza(r02.optJSONArray("mfaInfo"));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzg = r02.optString("mfaPendingCredential", null);     // Catch: NullPointerException -> L4 Throwable -> L6
        return this;
    L6:
        e = move-exception;
        throw zzail.zza(e, zza, r6);
    }

    public final long zza() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzagz> zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        if (TextUtils.isEmpty(this.zzg) == true) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zzb() {
        return this.zzb;
    }
}
