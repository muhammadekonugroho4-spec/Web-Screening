package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzahu implements zzaea<zzahu> {
    private static final String zza = "zzahu";
    private String zzb;

    static {
    }

    public zzahu() {
    }

    private final zzahu zzb(String r3) throws zzabr {
        JSONObject r02 = new JSONObject(r3).optJSONObject("phoneResponseInfo");     // Catch: NullPointerException -> L6 Throwable -> L8
        if (r02 == null) goto L10;
        this.zzb = Strings.emptyToNull(r02.optString("sessionInfo"));     // Catch: NullPointerException -> L6 Throwable -> L8
        return this;
    L10:
        return this;
    L8:
        e = move-exception;
        throw zzail.zza(e, zza, r3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final String zza() {
        return this.zzb;
    }
}
