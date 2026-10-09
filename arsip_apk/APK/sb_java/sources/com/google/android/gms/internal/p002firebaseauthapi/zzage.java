package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzage implements zzaga {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzage(String r1, String r2, String r3, String r4, String r5, String r6) {
        Preconditions.checkNotEmpty(r1);
        this.zza = Preconditions.checkNotEmpty(r2);
        this.zzc = r3;
        this.zzd = r4;
        this.zzb = r5;
        this.zze = r6;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaga
    public final /* synthetic */ zzaga zza(String r1) {
        this.zza = r1;
        return this;
    }

    public static zzage zza(String r7, String r8, String r9, String r10, String r11) {
        Preconditions.checkNotEmpty(r9);
        Preconditions.checkNotEmpty(r8);
        return new zzage("phone", r7, r8, r9, r10, r11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", this.zza);
        r02.put("mfaProvider", 1);
        String r1 = this.zzb;
        if (r1 == null) goto L5;
        r02.put("displayName", r1);
    L5:
        JSONObject r12 = new JSONObject();
        String r2 = this.zzc;
        if (r2 == null) goto L8;
        r12.put("sessionInfo", r2);
    L8:
        String r22 = this.zzd;
        if (r22 == null) goto L11;
        r12.put("code", r22);
    L11:
        r02.put("phoneVerificationInfo", r12);
        String r13 = this.zze;
        if (r13 == null) goto L15;
        r02.put("tenantId", r13);
    L15:
        return r02.toString();
    }
}
