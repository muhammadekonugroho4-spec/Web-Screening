package com.google.android.gms.measurement.internal;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes5.dex */
public enum zzlu extends Enum<zzlu> {
    public static final zzlu zza = null;
    public static final zzlu zzb = null;
    public static final zzlu zzc = null;
    public static final zzlu zzd = null;
    public static final zzlu zze = null;
    public static final zzlu zzf = null;
    private static final /* synthetic */ zzlu[] zzg = null;
    private final int zzh;

    static {
        zzlu r02 = new zzlu("GOOGLE_ANALYTICS", 0, 0);
        zza = r02;
        zzlu r1 = new zzlu("GOOGLE_SIGNAL", 1, 1);
        zzb = r1;
        zzlu r2 = new zzlu("SGTM", 2, 2);
        zzc = r2;
        zzlu r3 = new zzlu("SGTM_CLIENT", 3, 3);
        zzd = r3;
        zzlu r4 = new zzlu("GOOGLE_SIGNAL_PENDING", 4, 4);
        zze = r4;
        zzlu r5 = new zzlu(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, 99);
        zzf = r5;
        zzg = new zzlu[]{r02, r1, r2, r3, r4, r5};
    }

    zzlu(String r1, int r2, int r3) {
        this.zzh = r3;
    }

    public static zzlu[] values() {
        return (zzlu[]) zzg.clone();
    }

    public final int zza() {
        return this.zzh;
    }
}
