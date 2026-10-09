package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzahl implements zzaea<zzahl> {
    private static final String zza = "zzahl";
    private String zzb;
    private zzahb zzc;
    private String zzd;
    private String zze;
    private long zzf;

    static {
    }

    public zzahl() {
    }

    private final zzahl zzb(String r5) throws zzabr {
        JSONObject r02 = new JSONObject(r5);     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzb = Strings.emptyToNull(r02.optString("email", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        Strings.emptyToNull(r02.optString("passwordHash", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        r02.optBoolean("emailVerified", false);     // Catch: NullPointerException -> L4 Throwable -> L6
        Strings.emptyToNull(r02.optString("displayName", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        Strings.emptyToNull(r02.optString("photoUrl", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzc = zzahb.zza(r02.optJSONArray("providerUserInfo"));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzd = Strings.emptyToNull(r02.optString("idToken", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zze = Strings.emptyToNull(r02.optString("refreshToken", null));     // Catch: NullPointerException -> L4 Throwable -> L6
        this.zzf = r02.optLong("expiresIn", 0);     // Catch: NullPointerException -> L4 Throwable -> L6
        return this;
    L6:
        e = move-exception;
        throw zzail.zza(e, zza, r5);
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzahc> zze() {
        zzahb r02 = this.zzc;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zzb() {
        return this.zzb;
    }
}
