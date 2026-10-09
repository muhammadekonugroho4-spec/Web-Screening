package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public enum zzel extends Enum {
    public static final zzel zza = null;
    public static final zzel zzb = null;
    public static final zzel zzc = null;
    public static final zzel zzd = null;
    public static final zzel zze = null;
    private static final /* synthetic */ zzel[] zzf = null;
    private final boolean zzg;

    static {
        zzel r02 = new zzel("GENERAL", 0, false, true);
        zza = r02;
        zzel r1 = new zzel("BOOLEAN", 1, false, false);
        zzb = r1;
        zzel r4 = new zzel("CHARACTER", 2, false, false);
        zzc = r4;
        zzel r5 = new zzel("INTEGRAL", 3, true, false);
        zzd = r5;
        zzel r2 = new zzel("FLOAT", 4, true, true);
        zze = r2;
        zzf = new zzel[]{r02, r1, r4, r5, r2};
    }

    zzel(String r1, int r2, boolean r3, boolean r4) {
        this.zzg = r4;
    }

    public static zzel[] values() {
        return (zzel[]) zzf.clone();
    }

    public final boolean zza() {
        return this.zzg;
    }
}
