package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaht implements zzahp {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzafn zzg;
    private final String zzh;

    private zzaht(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.zza = Preconditions.checkNotEmpty(r1);
        Preconditions.checkNotEmpty(r2);
        this.zzb = r3;
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r6;
        this.zzf = r7;
        this.zzh = null;
    }

    public static zzaht zza(String r9, String r10, String r11, String r12, String r13, String r14, String r15) {
        Preconditions.checkNotEmpty(r10);
        return new zzaht(r9, "phone", r10, r11, r12, r13, r14, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", this.zza);
        r02.put("mfaProvider", 1);
        if (this.zzb == null) goto L19;
        JSONObject r1 = new JSONObject();
        r1.put("phoneNumber", this.zzb);
        if (TextUtils.isEmpty(this.zzd) == true) goto L8;
        r1.put("recaptchaToken", this.zzd);
    L8:
        if (TextUtils.isEmpty(this.zze) == true) goto L10;
        r1.put("playIntegrityToken", this.zze);
    L10:
        zzafn r2 = this.zzg;
        if (r2 == null) goto L13;
        r1.put("autoRetrievalInfo", r2.zza());
    L13:
        String r22 = this.zzf;
        if (r22 == null) goto L16;
        zzail.zza(r1, "captchaResponse", r22);
    L17:
        r02.put("phoneEnrollmentInfo", r1);
        goto L19
    L16:
        zzail.zza(r1);
    L19:
        if (TextUtils.isEmpty(null) == true) goto L22;
        r02.put("tenantId", null);
    L22:
        return r02.toString();
    }

    public final void zza(zzafn r1) {
        this.zzg = r1;
    }
}
