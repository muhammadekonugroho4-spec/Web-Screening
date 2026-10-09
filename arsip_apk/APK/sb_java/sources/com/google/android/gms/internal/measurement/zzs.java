package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzs extends Enum<zzs> {
    public static final zzs zza = null;
    public static final zzs zzb = null;
    public static final zzs zzc = null;
    public static final zzs zzd = null;
    public static final zzs zze = null;
    private static final /* synthetic */ zzs[] zzf = null;

    static {
        zzs r02 = new zzs("DEBUG", 0, 3);
        zza = r02;
        zzs r1 = new zzs("ERROR", 1, 6);
        zzb = r1;
        zzs r2 = new zzs("INFO", 2, 4);
        zzc = r2;
        zzs r4 = new zzs("VERBOSE", 3, 2);
        zzd = r4;
        zzs r3 = new zzs("WARN", 4, 5);
        zze = r3;
        zzf = new zzs[]{r02, r1, r2, r4, r3};
    }

    zzs(String r1, int r2, int r3) {
    }

    public static zzs[] values() {
        return (zzs[]) zzf.clone();
    }

    public static zzs zza(int r1) {
        if (r1 == 2) goto L19;
        if (r1 == 3) goto L17;
        if (r1 == 5) goto L15;
        if (r1 == 6) goto L13;
        return zzc;
    L13:
        return zzb;
    L15:
        return zze;
    L17:
        return zza;
    L19:
        return zzd;
    }
}
