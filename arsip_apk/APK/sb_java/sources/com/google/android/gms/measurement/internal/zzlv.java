package com.google.android.gms.measurement.internal;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes5.dex */
public enum zzlv extends Enum<zzlv> {
    public static final zzlv zza = null;
    public static final zzlv zzb = null;
    private static final zzlv zzc = null;
    private static final /* synthetic */ zzlv[] zzd = null;
    private final int zze;

    static {
        zzlv r02 = new zzlv(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        zzc = r02;
        zzlv r1 = new zzlv("SUCCESS", 1, 1);
        zza = r1;
        zzlv r2 = new zzlv("FAILURE", 2, 2);
        zzb = r2;
        zzd = new zzlv[]{r02, r1, r2};
    }

    zzlv(String r1, int r2, int r3) {
        this.zze = r3;
    }

    public static zzlv[] values() {
        return (zzlv[]) zzd.clone();
    }

    public final int zza() {
        return this.zze;
    }
}
