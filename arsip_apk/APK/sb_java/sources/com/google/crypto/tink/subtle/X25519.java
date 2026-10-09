package com.google.crypto.tink.subtle;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.Curve25519;
import com.google.crypto.tink.internal.Field25519;
import java.security.InvalidKeyException;
import java.util.Arrays;

@Alpha
/* loaded from: classes6.dex */
public final class X25519 {
    private X25519() {
    }

    public static byte[] computeSharedSecret(byte[] r3, byte[] r4) throws InvalidKeyException {
        if (r3.length != 32) goto L7;
        long[] r02 = new long[11];
        byte[] r32 = Arrays.copyOf(r3, 32);
        r32[0] = (byte) (r32[0] & 248);
        byte r2 = (byte) (r32[31] & Ascii.DEL);
        r32[31] = r2;
        r32[31] = (byte) (r2 | SignedBytes.MAX_POWER_OF_TWO);
        Curve25519.curveMult(r02, r32, r4);
        return Field25519.contract(r02);
    L7:
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] generatePrivateKey() {
        byte[] r02 = Random.randBytes(32);
        r02[0] = (byte) (r02[0] | 7);
        byte r2 = (byte) (r02[31] & 63);
        r02[31] = r2;
        r02[31] = (byte) (r2 | UnsignedBytes.MAX_POWER_OF_TWO);
        return r02;
    }

    public static byte[] publicFromPrivate(byte[] r3) throws InvalidKeyException {
        if (r3.length != 32) goto L7;
        byte[] r02 = new byte[32];
        r02[0] = 9;
        return computeSharedSecret(r3, r02);
    L7:
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
