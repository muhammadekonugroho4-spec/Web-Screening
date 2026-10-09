package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzafq extends zzahe {
    private final String zza;
    private final String zzb;

    public zzafq(String r1, String r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzahe) == false) goto L22;
        zzahe r52 = (zzahe) r5;
        String r1 = this.zza;
        if (r1 != null) goto L13;
        if (r52.zzb() != null) goto L22;
    L14:
        String r12 = this.zzb;
        if (r12 != null) goto L20;
        if (r52.zza() != null) goto L22;
    L21:
        return true;
    L20:
        if (r12.equals(r52.zza()) == false) goto L22;
    L13:
        if (r1.equals(r52.zzb()) == true) goto L14;
    L22:
        return false;
    }

    public final int hashCode() {
        String r02 = this.zza;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = (r03 ^ 1000003) * 1000003;
        String r2 = this.zzb;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 ^ r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
    public final String zzb() {
        return this.zza;
    }
}
