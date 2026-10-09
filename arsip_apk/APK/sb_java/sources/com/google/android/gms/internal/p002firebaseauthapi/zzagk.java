package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagk implements zzaeb {
    private String zza;
    private String zzb;

    public zzagk(String r2) {
        this.zza = zzagi.zza.toString();
        this.zzb = Preconditions.checkNotEmpty(r2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("grantType", this.zza);
        r02.put("refreshToken", this.zzb);
        return r02.toString();
    }
}
