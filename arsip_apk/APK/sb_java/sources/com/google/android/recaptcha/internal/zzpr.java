package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes5.dex */
abstract class zzpr {
    final Unsafe zza;

    public zzpr(Unsafe r1) {
        this.zza = r1;
    }

    public abstract double zza(Object r1, long r2);

    public abstract float zzb(Object r1, long r2);

    public abstract void zzc(Object r1, long r2, boolean r4);

    public abstract void zzd(Object r1, long r2, byte r4);

    public abstract void zze(Object r1, long r2, double r4);

    public abstract void zzf(Object r1, long r2, float r4);

    public abstract boolean zzg(Object r1, long r2);
}
