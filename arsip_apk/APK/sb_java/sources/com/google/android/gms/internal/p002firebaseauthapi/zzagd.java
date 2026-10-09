package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagd implements zzagc {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzagd(String r1, String r2, String r3, String r4, String r5) {
        Preconditions.checkNotEmpty(r1);
        this.zza = Preconditions.checkNotEmpty(r2);
        this.zzb = r3;
        this.zzc = r4;
        this.zzd = r5;
    }

    public static zzagd zza(String r6, String r7, String r8, String r9) {
        Preconditions.checkNotEmpty(r8);
        Preconditions.checkNotEmpty(r7);
        return new zzagd("phone", r6, r7, r8, r9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("mfaProvider", 1);
        JSONObject r1 = new JSONObject();
        String r2 = this.zzb;
        if (r2 == null) goto L5;
        r1.put("sessionInfo", r2);
    L5:
        String r22 = this.zzc;
        if (r22 == null) goto L8;
        r1.put("code", r22);
    L8:
        r02.put("phoneVerificationInfo", r1);
        r02.put("mfaPendingCredential", this.zza);
        String r12 = this.zzd;
        if (r12 == null) goto L12;
        r02.put("tenantId", r12);
    L12:
        return r02.toString();
    }
}
