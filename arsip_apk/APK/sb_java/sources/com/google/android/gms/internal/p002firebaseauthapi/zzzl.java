package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzzl {
    public static byte[] zza(byte[] r3, byte[] r4) throws InvalidKeyException {
        if (r3.length != 32) goto L7;
        long[] r02 = new long[11];
        byte[] r32 = Arrays.copyOf(r3, 32);
        r32[0] = (byte) (r32[0] & 248);
        byte r2 = (byte) (r32[31] & Ascii.DEL);
        r32[31] = r2;
        r32[31] = (byte) (r2 | SignedBytes.MAX_POWER_OF_TWO);
        zzmq.zza(r02, r32, r4);
        return zzmw.zzc(r02);
    L7:
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zza() {
        byte[] r02 = zzpp.zza(32);
        r02[0] = (byte) (r02[0] | 7);
        byte r2 = (byte) (r02[31] & 63);
        r02[31] = r2;
        r02[31] = (byte) (r2 | UnsignedBytes.MAX_POWER_OF_TWO);
        return r02;
    }

    public static byte[] zza(byte[] r3) throws InvalidKeyException {
        if (r3.length != 32) goto L7;
        byte[] r02 = new byte[32];
        r02[0] = 9;
        return zza(r3, r02);
    L7:
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
