package com.google.crypto.tink.hybrid.subtle;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* loaded from: classes6.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = null;
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    static {
        EMPTY_AAD = new byte[0];
    }

    private RsaKem() {
    }

    public static int bigIntSizeInBytes(BigInteger r02) {
        return (r02.bitLength() + 7) / 8;
    }

    public static byte[] bigIntToByteArray(BigInteger r4, int r5) {
        byte[] r42 = r4.toByteArray();
        if (r42.length != r5) goto L5;
        return r42;
    L5:
        byte[] r02 = new byte[r5];
        if (r42.length != (r5 + 1)) goto L14;
        if (r42[0] != 0) goto L12;
        System.arraycopy(r42, 1, r02, 0, r5);
        return r02;
    L12:
        throw new IllegalArgumentException("Value is one-byte longer than the expected size, but its first byte is not 0");
    L14:
        if (r42.length >= r5) goto L18;
        System.arraycopy(r42, 0, r02, r5 - r42.length, r42.length);
        return r02;
    L18:
        throw new IllegalArgumentException(String.format("Value has invalid length, must be of length at most (%d + 1), but got %d", new Object[]{Integer.valueOf(r5), Integer.valueOf(r42.length)}));
    }

    public static KeyPair generateRsaKeyPair(int r2) {
        KeyPairGenerator r02 = KeyPairGenerator.getInstance("RSA");     // Catch: NoSuchAlgorithmException -> L5
        r02.initialize(r2);     // Catch: NoSuchAlgorithmException -> L5
        return r02.generateKeyPair();
    L5:
        e = move-exception;
        throw new IllegalStateException("No support for RSA algorithm.", e);
    }

    public static byte[] generateSecret(BigInteger r4) {
        int r02 = bigIntSizeInBytes(r4);
        SecureRandom r1 = new SecureRandom();
    L3:
        BigInteger r2 = new BigInteger(r4.bitLength(), r1);
        if (r2.signum() <= 0) goto L3;
        if (r2.compareTo(r4) >= 0) goto L3;
        return bigIntToByteArray(r2, r02);
    }

    public static void validateRsaModulus(BigInteger r2) throws GeneralSecurityException {
        if (r2.bitLength() < MIN_RSA_KEY_LENGTH_BITS) goto L6;
        return;
    L6:
        throw new GeneralSecurityException(String.format("RSA key must be of at least size %d bits, but got %d", new Object[]{Integer.valueOf(MIN_RSA_KEY_LENGTH_BITS), Integer.valueOf(r2.bitLength())}));
    }
}
