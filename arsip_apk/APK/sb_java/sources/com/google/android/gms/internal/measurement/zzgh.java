package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzgh extends Enum<zzgh> implements zzki {
    private static final zzgh zza = null;
    private static final zzgh zzb = null;
    private static final zzgh zzc = null;
    private static final zzgh zzd = null;
    private static final zzgh zze = null;
    private static final zzgh zzf = null;
    private static final /* synthetic */ zzgh[] zzg = null;
    private final int zzh;

    static {
        zzgh r02 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN", 0, 0);
        zza = r02;
        zzgh r1 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED", 1, 1);
        zzb = r1;
        zzgh r2 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED", 2, 2);
        zzc = r2;
        zzgh r3 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED", 3, 3);
        zzd = r3;
        zzgh r4 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED", 4, 4);
        zze = r4;
        zzgh r5 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED", 5, 5);
        zzf = r5;
        zzg = new zzgh[]{r02, r1, r2, r3, r4, r5};
    }

    zzgh(String r1, int r2, int r3) {
        this.zzh = r3;
    }

    public static zzgh[] values() {
        return (zzgh[]) zzg.clone();
    }

    public static zzkl zzb() {
        return zzgj.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzgh.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzh;
    }

    public static zzgh zza(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return null;
    L16:
        return zzf;
    L18:
        return zze;
    L20:
        return zzd;
    L22:
        return zzc;
    L24:
        return zzb;
    L26:
        return zza;
    }
}
