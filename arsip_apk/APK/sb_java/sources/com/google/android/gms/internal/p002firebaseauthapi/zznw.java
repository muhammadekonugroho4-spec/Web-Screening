package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zznw {
    private final zzbq zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zznw(zzbq r1, int r2, String r3, String r4, zznz r5) {
        this(r1, r2, r3, r4);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zznw) == true) goto L5;
        return false;
    L5:
        zznw r42 = (zznw) r4;
        if (this.zza == r42.zza) goto L8;
    L15:
        return false;
    L8:
        if (this.zzb != r42.zzb) goto L15;
        if (this.zzc.equals(r42.zzc) == false) goto L15;
        if (this.zzd.equals(r42.zzd) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final int zza() {
        return this.zzb;
    }

    private zznw(zzbq r1, int r2, String r3, String r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }
}
