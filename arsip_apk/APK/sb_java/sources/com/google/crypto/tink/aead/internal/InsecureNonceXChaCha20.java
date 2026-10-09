package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class InsecureNonceXChaCha20 extends InsecureNonceChaCha20Base {
    public static final int NONCE_SIZE_IN_BYTES = 24;

    public InsecureNonceXChaCha20(byte[] r1, int r2) throws InvalidKeyException {
        super(r1, r2);
    }

    public static int[] hChaCha20(int[] r4, int[] r5) {
        int[] r02 = new int[16];
        ChaCha20Util.setSigmaAndKey(r02, r4);
        r02[12] = r5[0];
        r02[13] = r5[1];
        r02[14] = r5[2];
        r02[15] = r5[3];
        ChaCha20Util.shuffleState(r02);
        r02[4] = r02[12];
        r02[5] = r02[13];
        r02[6] = r02[14];
        r02[7] = r02[15];
        return Arrays.copyOf(r02, 8);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int[] createInitialState(int[] r4, int r5) {
        if (r4.length != (nonceSizeInBytes() / 4)) goto L7;
        int[] r02 = new int[16];
        ChaCha20Util.setSigmaAndKey(r02, hChaCha20(this.key, r4));
        r02[12] = r5;
        r02[13] = 0;
        r02[14] = r4[4];
        r02[15] = r4[5];
        return r02;
    L7:
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r4.length * 32)}));
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, ByteBuffer r2) throws GeneralSecurityException {
        return super.decrypt(r1, r2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ void encrypt(ByteBuffer r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        super.encrypt(r1, r2, r3);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int nonceSizeInBytes() {
        return 24;
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, byte[] r2) throws GeneralSecurityException {
        return super.decrypt(r1, r2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] r1, byte[] r2) throws GeneralSecurityException {
        return super.encrypt(r1, r2);
    }
}
