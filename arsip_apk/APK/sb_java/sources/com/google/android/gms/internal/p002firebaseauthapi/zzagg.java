package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagg implements zzaga {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzagg(String r1, String r2, String r3, String r4, String r5) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = Preconditions.checkNotEmpty(r2);
        this.zzc = Preconditions.checkNotEmpty(r3);
        this.zzd = Preconditions.checkNotEmpty(r4);
        this.zze = r5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaga
    public final /* synthetic */ zzaga zza(String r1) {
        this.zza = r1;
        return this;
    }

    public static zzagg zza(String r6, String r7, String r8, String r9, String r10) {
        return new zzagg(r6, r7, r8, r9, r10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", this.zza);
        if (TextUtils.isEmpty(this.zzb) == true) goto L5;
        r02.put("displayName", this.zzb);
    L5:
        JSONObject r1 = new JSONObject();
        if (TextUtils.isEmpty(this.zzc) == true) goto L9;
        r1.put("sessionInfo", this.zzc);
    L9:
        if (TextUtils.isEmpty(this.zzd) == true) goto L11;
        r1.put("verificationCode", this.zzd);
    L11:
        r02.put("totpVerificationInfo", r1);
        if (TextUtils.isEmpty(this.zze) == true) goto L15;
        r02.put("tenantId", this.zze);
    L15:
        return r02.toString();
    }
}
