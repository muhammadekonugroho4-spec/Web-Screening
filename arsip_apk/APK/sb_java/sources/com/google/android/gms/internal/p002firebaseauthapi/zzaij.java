package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaij implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaij(String r1, String r2, String r3) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = Preconditions.checkNotEmpty(r2);
        this.zzc = r3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", this.zza);
        r02.put("mfaEnrollmentId", this.zzb);
        String r1 = this.zzc;
        if (r1 == null) goto L6;
        r02.put("tenantId", r1);
    L6:
        return r02.toString();
    }
}
