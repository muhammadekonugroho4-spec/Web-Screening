package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.subtle.Bytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
abstract class InsecureNonceChaCha20Base {
    private final int initialCounter;
    int[] key;

    public InsecureNonceChaCha20Base(byte[] r3, int r4) throws InvalidKeyException {
        if (r3.length != 32) goto L7;
        this.key = ChaCha20Util.toIntArray(r3);
        this.initialCounter = r4;
        return;
    L7:
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void process(byte[] r7, ByteBuffer r8, ByteBuffer r9) throws GeneralSecurityException {
        if (r7.length != nonceSizeInBytes()) goto L13;
        int r02 = r9.remaining();
        int r1 = r02 / 64;
        int r2 = r1 + 1;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        ByteBuffer r4 = chacha20Block(r7, this.initialCounter + r3);
        if (r3 != r1) goto L9;
        Bytes.xor(r8, r9, r4, r02 % 64);
    L10:
        r3 = r3 + 1;
        goto L5
    L9:
        Bytes.xor(r8, r9, r4, 64);
        goto L10
    L11:
        return;
    L13:
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + nonceSizeInBytes());
    }

    public ByteBuffer chacha20Block(byte[] r5, int r6) {
        int[] r52 = createInitialState(ChaCha20Util.toIntArray(r5), r6);
        int[] r62 = (int[]) r52.clone();
        ChaCha20Util.shuffleState(r62);
        int r1 = 0;
    L4:
        if (r1 >= r52.length) goto L6;
        r52[r1] = r52[r1] + r62[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        ByteBuffer r63 = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        r63.asIntBuffer().put(r52, 0, 16);
        return r63;
    }

    public abstract int[] createInitialState(int[] r1, int r2);

    public byte[] decrypt(byte[] r1, byte[] r2) throws GeneralSecurityException {
        return decrypt(r1, ByteBuffer.wrap(r2));
    }

    public byte[] encrypt(byte[] r2, byte[] r3) throws GeneralSecurityException {
        ByteBuffer r02 = ByteBuffer.allocate(r3.length);
        encrypt(r02, r2, r3);
        return r02.array();
    }

    public abstract int nonceSizeInBytes();

    public byte[] decrypt(byte[] r2, ByteBuffer r3) throws GeneralSecurityException {
        ByteBuffer r02 = ByteBuffer.allocate(r3.remaining());
        process(r2, r02, r3);
        return r02.array();
    }

    public void encrypt(ByteBuffer r3, byte[] r4, byte[] r5) throws GeneralSecurityException {
        if (r3.remaining() < r5.length) goto L7;
        process(r4, r3, ByteBuffer.wrap(r5));
        return;
    L7:
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
