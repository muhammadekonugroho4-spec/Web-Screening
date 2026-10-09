package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahk implements zzaeb {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private zzafn zzj;

    public zzahk(String r1, long r2, boolean r4, String r5, String r6, String r7, String r8, String r9, boolean r10) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = r2;
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r6;
        this.zzf = r7;
        this.zzg = r8;
        this.zzh = r9;
        this.zzi = r10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("phoneNumber", this.zza);
        String r1 = this.zze;
        if (r1 == null) goto L5;
        r02.put("tenantId", r1);
    L5:
        String r12 = this.zzf;
        if (r12 == null) goto L8;
        r02.put("recaptchaToken", r12);
    L8:
        zzafn r13 = this.zzj;
        if (r13 == null) goto L11;
        r02.put("autoRetrievalInfo", r13.zza());
    L11:
        String r14 = this.zzg;
        if (r14 == null) goto L14;
        r02.put("playIntegrityToken", r14);
    L14:
        String r15 = this.zzh;
        if (r15 == null) goto L17;
        zzail.zza(r02, "captchaResponse", r15);
    L19:
        return r02.toString();
    L17:
        zzail.zza(r02);
        goto L19
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final void zza(zzafn r1) {
        this.zzj = r1;
    }
}
