package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzahj implements zzaea<zzahj> {
    private static final String zza = "zzahj";
    private String zzb;

    static {
    }

    public zzahj() {
    }

    private final zzahj zzb(String r4) throws zzabr {
        this.zzb = Strings.emptyToNull(new JSONObject(r4).optString("sessionInfo", null));     // Catch: NullPointerException -> L4 Throwable -> L6
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
}
