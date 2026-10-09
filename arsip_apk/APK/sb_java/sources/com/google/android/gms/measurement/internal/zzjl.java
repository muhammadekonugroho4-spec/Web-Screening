package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjj;

/* loaded from: classes5.dex */
public enum zzjl extends Enum<zzjl> {
    public static final zzjl zza = null;
    public static final zzjl zzb = null;
    private static final /* synthetic */ zzjl[] zzc = null;
    private final zzjj.zza[] zzd;

    static {
        zzjl r02 = new zzjl("STORAGE", 0, new zzjj.zza[]{zzjj.zza.zza, zzjj.zza.zzb});
        zza = r02;
        zzjl r1 = new zzjl("DMA", 1, new zzjj.zza[]{zzjj.zza.zzc});
        zzb = r1;
        zzc = new zzjl[]{r02, r1};
    }

    zzjl(String r1, int r2, zzjj.zza... r3) {
        this.zzd = r3;
    }

    public static zzjl[] values() {
        return (zzjl[]) zzc.clone();
    }

    public static /* bridge */ /* synthetic */ zzjj.zza[] zza(zzjl r02) {
        return r02.zzd;
    }

    public final zzjj.zza[] zza() {
        return this.zzd;
    }
}
