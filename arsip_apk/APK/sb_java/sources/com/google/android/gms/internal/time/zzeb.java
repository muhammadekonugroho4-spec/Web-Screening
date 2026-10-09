package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public enum zzeb extends Enum {
    public static final zzeb zza = null;
    public static final zzeb zzb = null;
    public static final zzeb zzc = null;
    public static final zzeb zzd = null;
    public static final zzeb zze = null;
    private static final /* synthetic */ zzeb[] zzf = null;
    private final int zzg;

    static {
        zzeb r02 = new zzeb("SMALL", 0, 10);
        zza = r02;
        zzeb r1 = new zzeb("MEDIUM", 1, 20);
        zzb = r1;
        zzeb r2 = new zzeb("LARGE", 2, 50);
        zzc = r2;
        zzeb r4 = new zzeb("FULL", 3, -1);
        zzd = r4;
        zzeb r5 = new zzeb("NONE", 4, 0);
        zze = r5;
        zzf = new zzeb[]{r02, r1, r2, r4, r5};
    }

    zzeb(String r1, int r2, int r3) {
        this.zzg = r3;
    }

    public static zzeb[] values() {
        return (zzeb[]) zzf.clone();
    }

    public final int zza() {
        return this.zzg;
    }
}
