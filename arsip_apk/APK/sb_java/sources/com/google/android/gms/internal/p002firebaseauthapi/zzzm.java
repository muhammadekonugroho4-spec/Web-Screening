package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class zzzm {
    private final BigInteger zza;

    private zzzm(BigInteger r1) {
        this.zza = r1;
    }

    public static zzzm zza(BigInteger r02, zzcm r1) {
        if (r1 == null) goto L6;
        return new zzzm(r02);
    L6:
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzcm r2) {
        if (r2 == null) goto L6;
        return this.zza;
    L6:
        throw new NullPointerException("SecretKeyAccess required");
    }
}
