package com.google.android.gms.internal.play_billing;

/* loaded from: classes5.dex */
public class zzel {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static {
    }

    public /* synthetic */ zzel(zzek r1) {
    }

    public static int zzb(int r1) {
        int r02 = r1 & 1;
        return (r1 >>> 1) ^ (-r02);
    }

    public static long zzc(long r3) {
        long r02 = 1 & r3;
        return (r3 >>> 1) ^ (-r02);
    }
}
