package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes6.dex */
abstract class InsecureNonceChaCha20Poly1305Base {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final InsecureNonceChaCha20Base chacha20;
    private final InsecureNonceChaCha20Base macKeyChaCha20;

    static {
        FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    }

    public InsecureNonceChaCha20Poly1305Base(byte[] r2) throws GeneralSecurityException {
        if (FIPS.isCompatible() == false) goto L7;
        this.chacha20 = newChaCha20Instance(r2, 1);
        this.macKeyChaCha20 = newChaCha20Instance(r2, 0);
        return;
    L7:
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    private byte[] getMacKey(byte[] r3) throws GeneralSecurityException {
        ByteBuffer r32 = this.macKeyChaCha20.chacha20Block(r3, 0);
        byte[] r02 = new byte[32];
        r32.get(r02);
        return r02;
    }

    private static byte[] macDataRfc8439(byte[] r5, ByteBuffer r6) {
        if ((r5.length % 16) != 0) goto L5;
        int r02 = r5.length;
    L6:
        int r1 = r6.remaining();
        int r2 = r1 % 16;
        if (r2 != 0) goto L9;
        int r3 = r1;
    L10:
        int r32 = r3 + r02;
        ByteBuffer r22 = ByteBuffer.allocate(r32 + 16).order(ByteOrder.LITTLE_ENDIAN);
        r22.put(r5);
        r22.position(r02);
        r22.put(r6);
        r22.position(r32);
        r22.putLong(r5.length);
        r22.putLong(r1);
        return r22.array();
    L9:
        r3 = (r1 + 16) - r2;
        goto L10
    L5:
        r02 = (r5.length + 16) - (r5.length % 16);
        goto L6
    }

    public byte[] decrypt(byte[] r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return decrypt(ByteBuffer.wrap(r2), r1, r3);
    }

    public byte[] encrypt(byte[] r3, byte[] r4, byte[] r5) throws GeneralSecurityException {
        if (r4.length > 2147483631) goto L7;
        ByteBuffer r02 = ByteBuffer.allocate(r4.length + 16);
        encrypt(r02, r3, r4, r5);
        return r02.array();
    L7:
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract InsecureNonceChaCha20Base newChaCha20Instance(byte[] r1, int r2) throws InvalidKeyException;

    public byte[] decrypt(ByteBuffer r5, byte[] r6, byte[] r7) throws GeneralSecurityException {
        if (r5.remaining() < 16) goto L14;
        int r02 = r5.position();
        byte[] r2 = new byte[16];
        r5.position(r5.limit() - 16);
        r5.get(r2);
        r5.position(r02);
        r5.limit(r5.limit() - 16);
        if (r7 != null) goto L15;
        r7 = new byte[0];
    L15:
        Poly1305.verifyMac(getMacKey(r6), macDataRfc8439(r7, r5), r2);     // Catch: GeneralSecurityException -> L10
        r5.position(r02);
        return this.chacha20.decrypt(r6, r5);
    L10:
        e = move-exception;
        throw new AEADBadTagException(e.toString());
    L14:
        throw new GeneralSecurityException("ciphertext too short");
    }

    public void encrypt(ByteBuffer r3, byte[] r4, byte[] r5, byte[] r6) throws GeneralSecurityException {
        if (r3.remaining() < (r5.length + 16)) goto L10;
        int r02 = r3.position();
        this.chacha20.encrypt(r3, r4, r5);
        r3.position(r02);
        r3.limit(r3.limit() - 16);
        if (r6 != null) goto L7;
        r6 = new byte[0];
    L7:
        byte[] r42 = Poly1305.computeMac(getMacKey(r4), macDataRfc8439(r6, r3));
        r3.limit(r3.limit() + 16);
        r3.put(r42);
        return;
    L10:
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
