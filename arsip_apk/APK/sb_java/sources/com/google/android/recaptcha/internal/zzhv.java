package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class zzhv {
    private static final zzhu zza = null;
    private final zzhu zzb;
    private long zzc;

    static {
        long r1 = (long) Math.pow(2.0d, 32.0d);
        long r5 = (long) Math.pow(2.0d, 48.0d);
        zza = new zzhu(11, 20919936621L ^ r1, r5);
    }

    public zzhv(long r1, long r3, zzhu r5) {
        this.zzb = r5;
        this.zzc = Math.abs(r1);
    }

    public static final /* synthetic */ zzhu zzb() {
        return zza;
    }

    public final long zza() {
        zzhu r02 = this.zzb;
        long r1 = r02.zzb();
        long r3 = this.zzc;
        long r5 = r02.zza();
        long r03 = (BigInteger.valueOf(r1).multiply(BigInteger.valueOf(r3)).mod(BigInteger.valueOf(r5)).longValue() + 11) % this.zzb.zza();
        this.zzc = r03;
        return r03 % 255;
    }
}
