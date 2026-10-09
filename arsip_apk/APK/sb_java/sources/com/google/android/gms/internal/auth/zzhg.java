package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzhg extends zzhh {
    public zzhg(Unsafe r1) {
        super(r1);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object r1, long r2) {
        return Double.longBitsToDouble(zzj(r1, r2));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object r1, long r2) {
        return Float.intBitsToFloat(zzi(r1, r2));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object r2, long r3, boolean r5) {
        if (zzhi.zza == false) goto L6;
        zzhi.zzi(r2, r3, r5);
        return;
    L6:
        zzhi.zzj(r2, r3, r5);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object r7, long r8, double r10) {
        zzn(r7, r8, Double.doubleToLongBits(r10));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object r1, long r2, float r4) {
        zzm(r1, r2, Float.floatToIntBits(r4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object r2, long r3) {
        if (zzhi.zza == false) goto L7;
        return zzhi.zzq(r2, r3);
    L7:
        return zzhi.zzr(r2, r3);
    }
}
