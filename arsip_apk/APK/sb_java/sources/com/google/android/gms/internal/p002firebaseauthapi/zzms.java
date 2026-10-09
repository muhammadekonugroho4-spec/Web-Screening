package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* loaded from: classes5.dex */
final class zzms {
    static final zzms zza = null;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger r1 = BigInteger.ONE;
        zza = new zzms(r1, r1, BigInteger.ZERO);
    }

    public zzms(BigInteger r1, BigInteger r2, BigInteger r3) {
        this.zzb = r1;
        this.zzc = r2;
        this.zzd = r3;
    }

    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
