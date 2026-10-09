package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagf implements zzagc {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzagf(String r1, String r2, String r3, String r4, String r5) {
        Preconditions.checkNotEmpty(r1);
        this.zza = Preconditions.checkNotEmpty(r2);
        this.zzb = r3;
        this.zzc = r4;
        this.zzd = r5;
    }

    public static zzagf zza(String r6, String r7, String r8, String r9) {
        Preconditions.checkNotEmpty(r7);
        Preconditions.checkNotEmpty(r9);
        return new zzagf(TotpMultiFactorGenerator.FACTOR_ID, r6, r7, r8, r9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        JSONObject r1 = new JSONObject();
        String r2 = this.zzb;
        if (r2 == null) goto L5;
        r1.put("verificationCode", r2);
    L5:
        r02.put("totpVerificationInfo", r1);
        r02.put("mfaPendingCredential", this.zza);
        String r12 = this.zzc;
        if (r12 == null) goto L8;
        r02.put("tenantId", r12);
    L8:
        String r13 = this.zzd;
        if (r13 == null) goto L12;
        r02.put("mfaEnrollmentId", r13);
    L12:
        return r02.toString();
    }
}
