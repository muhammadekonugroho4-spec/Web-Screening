package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzags implements zzaea<zzags> {
    private static final String zza = "zzags";
    private String zzb;

    static {
    }

    public zzags() {
    }

    private final zzags zzb(String r3) throws zzabr {
        this.zzb = Strings.emptyToNull(new JSONObject(r3).optString("producerProjectNumber"));     // Catch: NullPointerException -> L4 Throwable -> L6
        return this;
    L6:
        e = move-exception;
        throw zzail.zza(e, zza, r3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public zzags(String r1) {
        this.zzb = r1;
    }

    public final String zza() {
        return this.zzb;
    }
}
