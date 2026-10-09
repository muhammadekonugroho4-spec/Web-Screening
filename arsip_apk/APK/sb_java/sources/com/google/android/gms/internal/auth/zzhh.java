package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
abstract class zzhh {
    final Unsafe zza;

    public zzhh(Unsafe r1) {
        this.zza = r1;
    }

    public abstract double zza(Object r1, long r2);

    public abstract float zzb(Object r1, long r2);

    public abstract void zzc(Object r1, long r2, boolean r4);

    public abstract void zzd(Object r1, long r2, double r4);

    public abstract void zze(Object r1, long r2, float r4);

    public abstract boolean zzf(Object r1, long r2);

    public final int zzg(Class r2) {
        return this.zza.arrayBaseOffset(r2);
    }

    public final int zzh(Class r2) {
        return this.zza.arrayIndexScale(r2);
    }

    public final int zzi(Object r2, long r3) {
        return this.zza.getInt(r2, r3);
    }

    public final long zzj(Object r2, long r3) {
        return this.zza.getLong(r2, r3);
    }

    public final long zzk(Field r3) {
        return this.zza.objectFieldOffset(r3);
    }

    public final Object zzl(Object r2, long r3) {
        return this.zza.getObject(r2, r3);
    }

    public final void zzm(Object r2, long r3, int r5) {
        this.zza.putInt(r2, r3, r5);
    }

    public final void zzn(Object r7, long r8, long r10) {
        this.zza.putLong(r7, r8, r10);
    }

    public final void zzo(Object r2, long r3, Object r5) {
        this.zza.putObject(r2, r3, r5);
    }
}
