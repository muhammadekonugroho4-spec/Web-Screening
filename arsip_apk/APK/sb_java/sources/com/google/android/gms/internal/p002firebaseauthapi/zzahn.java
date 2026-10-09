package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahn implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;

    public zzahn(String r1) {
        this.zzc = r1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        String r1 = this.zza;
        if (r1 == null) goto L5;
        r02.put("email", r1);
    L5:
        String r12 = this.zzb;
        if (r12 == null) goto L8;
        r02.put("password", r12);
    L8:
        String r13 = this.zzc;
        if (r13 == null) goto L11;
        r02.put("tenantId", r13);
    L11:
        String r14 = this.zzd;
        if (r14 == null) goto L14;
        zzail.zza(r02, "captchaResponse", r14);
    L15:
        String r15 = this.zze;
        if (r15 == null) goto L19;
        r02.put("idToken", r15);
    L19:
        return r02.toString();
    L14:
        zzail.zza(r02);
        goto L15
    }

    public zzahn(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = Preconditions.checkNotEmpty(r2);
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r6;
    }
}
