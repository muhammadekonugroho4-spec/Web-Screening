package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzafp extends zzahf {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzagh zzd;
    private final String zze;

    public /* synthetic */ zzafp(String r1, String r2, String r3, zzagh r4, String r5, zzafr r6) {
        this(r1, r2, r3, r4, r5);
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzahf) == false) goto L23;
        zzahf r52 = (zzahf) r5;
        if (this.zza.equals(r52.zzd()) == false) goto L23;
        String r1 = this.zzb;
        if (r1 != null) goto L15;
        if (r52.zze() != null) goto L23;
    L17:
        if (this.zzc.equals(r52.zzf()) == false) goto L23;
        if (this.zzd.equals(r52.zzb()) == false) goto L23;
        if (this.zze.equals(r52.zzc()) == false) goto L23;
        return true;
    L15:
        if (r1.equals(r52.zze()) == true) goto L17;
    L23:
        return false;
    }

    public final int hashCode() {
        int r02 = (this.zza.hashCode() ^ 1000003) * 1000003;
        String r2 = this.zzb;
        if (r2 != null) goto L5;
        int r22 = 0;
    L7:
        return ((((((r02 ^ r22) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    L5:
        r22 = r2.hashCode();
        goto L7
    }

    public final String toString() {
        return "RevokeTokenRequest{providerId=" + this.zza + ", tenantId=" + this.zzb + ", token=" + this.zzc + ", tokenType=" + String.valueOf(this.zzd) + ", idToken=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final zzagh zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final String zzf() {
        return this.zzc;
    }

    private zzafp(String r1, String r2, String r3, zzagh r4, String r5) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
    }
}
