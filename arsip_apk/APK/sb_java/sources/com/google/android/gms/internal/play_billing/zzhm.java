package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzhm extends zzhn {
    public zzhm(Unsafe r1) {
        super(r1);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final double zza(Object r2, long r3) {
        return Double.longBitsToDouble(this.zza.getLong(r2, r3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final float zzb(Object r2, long r3) {
        return Float.intBitsToFloat(this.zza.getInt(r2, r3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzc(Object r2, long r3, boolean r5) {
        if (zzho.zzb == false) goto L6;
        zzho.zzi(r2, r3, r5);
        return;
    L6:
        zzho.zzj(r2, r3, r5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzd(Object r2, long r3, byte r5) {
        if (zzho.zzb == false) goto L6;
        zzho.zzk(r2, r3, r5);
        return;
    L6:
        zzho.zzl(r2, r3, r5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zze(Object r7, long r8, double r10) {
        long r4 = Double.doubleToLongBits(r10);
        this.zza.putLong(r7, r8, r4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzf(Object r2, long r3, float r5) {
        int r52 = Float.floatToIntBits(r5);
        this.zza.putInt(r2, r3, r52);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final boolean zzg(Object r2, long r3) {
        if (zzho.zzb == false) goto L7;
        return zzho.zzt(r2, r3);
    L7:
        return zzho.zzu(r2, r3);
    }
}
