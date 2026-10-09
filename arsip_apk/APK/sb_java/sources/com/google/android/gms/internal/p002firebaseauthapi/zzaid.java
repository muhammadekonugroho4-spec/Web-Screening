package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaid implements zzaeb {
    private String zza;
    private String zzb;

    public zzaid(String r1, String r2) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = r2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("token", this.zza);
        r02.put("returnSecureToken", true);
        String r1 = this.zzb;
        if (r1 == null) goto L6;
        r02.put("tenantId", r1);
    L6:
        return r02.toString();
    }
}
