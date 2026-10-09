package com.google.firebase.auth.internal;

/* loaded from: classes6.dex */
final class zzn extends zzj {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public /* synthetic */ zzn(String r1, String r2, String r3, zzp r4) {
        this(r1, r2, r3);
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzj) == false) goto L29;
        zzj r52 = (zzj) r5;
        String r1 = this.zza;
        if (r1 != null) goto L13;
        if (r52.zzd() != null) goto L29;
    L14:
        String r12 = this.zzb;
        if (r12 != null) goto L20;
        if (r52.zzb() != null) goto L29;
    L21:
        String r13 = this.zzc;
        if (r13 != null) goto L27;
        if (r52.zzc() != null) goto L29;
    L28:
        return true;
    L27:
        if (r13.equals(r52.zzc()) == false) goto L29;
    L20:
        if (r12.equals(r52.zzb()) == false) goto L29;
    L13:
        if (r1.equals(r52.zzd()) == true) goto L14;
    L29:
        return false;
    }

    public final int hashCode() {
        String r02 = this.zza;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = (r03 ^ 1000003) * 1000003;
        String r3 = this.zzb;
        if (r3 != null) goto L9;
        int r32 = 0;
    L10:
        int r05 = (r04 ^ r32) * 1000003;
        String r2 = this.zzc;
        if (r2 == null) goto L15;
        r1 = r2.hashCode();
    L15:
        return r05 ^ r1;
    L9:
        r32 = r3.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.zza + ", playIntegrityToken=" + this.zzb + ", recaptchaEnterpriseToken=" + this.zzc + "}";
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzd() {
        return this.zza;
    }

    private zzn(String r1, String r2, String r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }
}
