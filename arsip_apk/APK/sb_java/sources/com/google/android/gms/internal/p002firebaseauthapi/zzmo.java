package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzmo {
    public static BigInteger zza(byte[] r2) {
        return new BigInteger(1, r2);
    }

    public static byte[] zza(BigInteger r2) {
        if (r2.signum() == (-1)) goto L7;
        return r2.toByteArray();
    L7:
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] zza(BigInteger r4, int r5) throws GeneralSecurityException {
        if (r4.signum() == (-1)) goto L22;
        byte[] r42 = r4.toByteArray();
        if (r42.length != r5) goto L7;
        return r42;
    L7:
        int r1 = r5 + 1;
        if (r42.length > r1) goto L20;
        if (r42.length == r1) goto L12;
        byte[] r02 = new byte[r5];
        System.arraycopy(r42, 0, r02, r5 - r42.length, r42.length);
        return r02;
    L12:
        if (r42[0] != 0) goto L16;
        return Arrays.copyOfRange(r42, 1, r42.length);
    L16:
        throw new GeneralSecurityException("integer too large");
    L20:
        throw new GeneralSecurityException("integer too large");
    L22:
        throw new IllegalArgumentException("integer must be nonnegative");
    }
}
