package com.google.android.gms.internal.common;

/* loaded from: classes5.dex */
public class zzj {
    private final Class zza;
    private final Object zzb;

    private zzj(Class r1, Object r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public static zzj zzb(Class r1, Object r2) {
        return new zzj(r1, r2);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Object zzd() {
        return this.zzb;
    }

    public /* synthetic */ zzj(Class r1, Object r2, zzk r3) {
        this(r1, r2);
    }
}
