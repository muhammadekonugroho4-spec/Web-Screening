package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
enum zzkd extends Enum<zzkd> {
    public static final zzkd zza = null;
    public static final zzkd zzb = null;
    public static final zzkd zzc = null;
    public static final zzkd zzd = null;
    private static final /* synthetic */ zzkd[] zze = null;

    static {
        zzkd r02 = new zzkd("SCALAR", 0, false);
        zza = r02;
        zzkd r1 = new zzkd("VECTOR", 1, true);
        zzb = r1;
        zzkd r3 = new zzkd("PACKED_VECTOR", 2, true);
        zzc = r3;
        zzkd r4 = new zzkd("MAP", 3, false);
        zzd = r4;
        zze = new zzkd[]{r02, r1, r3, r4};
    }

    zzkd(String r1, int r2, boolean r3) {
    }

    public static zzkd[] values() {
        return (zzkd[]) zze.clone();
    }
}
