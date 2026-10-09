package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahr implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private zzafn zzi;

    private zzahr(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = Preconditions.checkNotEmpty(r2);
        this.zzc = Preconditions.checkNotEmpty(r3);
        this.zze = r4;
        this.zzd = r5;
        this.zzf = r6;
        this.zzg = r7;
        this.zzh = r8;
    }

    public static zzahr zza(String r9, String r10, String r11, String r12, String r13, String r14, String r15) {
        Preconditions.checkNotEmpty(r11);
        return new zzahr("phone", r9, r10, r11, r12, r13, r14, r15);
    }

    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("mfaPendingCredential", this.zzb);
        r02.put("mfaEnrollmentId", this.zzc);
        this.zza.getClass();
        r02.put("mfaProvider", 1);
        if (this.zze == null) goto L19;
        JSONObject r1 = new JSONObject();
        r1.put("phoneNumber", this.zze);
        if (TextUtils.isEmpty(this.zzf) == true) goto L8;
        r1.put("recaptchaToken", this.zzf);
    L8:
        if (TextUtils.isEmpty(this.zzg) == true) goto L10;
        r1.put("playIntegrityToken", this.zzg);
    L10:
        String r2 = this.zzh;
        if (r2 == null) goto L13;
        zzail.zza(r1, "captchaResponse", r2);
    L14:
        zzafn r22 = this.zzi;
        if (r22 == null) goto L17;
        r1.put("autoRetrievalInfo", r22.zza());
    L17:
        r02.put("phoneSignInInfo", r1);
        goto L19
    L13:
        zzail.zza(r1);
    L19:
        return r02.toString();
    }

    public final void zza(zzafn r1) {
        this.zzi = r1;
    }
}
