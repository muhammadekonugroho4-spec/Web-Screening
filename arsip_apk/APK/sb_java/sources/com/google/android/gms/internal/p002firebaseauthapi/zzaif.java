package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaif implements zzaeb {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze;

    public zzaif(String r1, String r2, String r3, String r4) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = Preconditions.checkNotEmpty(r2);
        this.zzc = r3;
        this.zzd = r4;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("email", this.zza);
        r02.put("password", this.zzb);
        r02.put("returnSecureToken", this.zze);
        String r1 = this.zzc;
        if (r1 == null) goto L5;
        r02.put("tenantId", r1);
    L5:
        String r12 = this.zzd;
        if (r12 == null) goto L8;
        zzail.zza(r02, "captchaResponse", r12);
    L10:
        return r02.toString();
    L8:
        zzail.zza(r02);
        goto L10
    }
}
