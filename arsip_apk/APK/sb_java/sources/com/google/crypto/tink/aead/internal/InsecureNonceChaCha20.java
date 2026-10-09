package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
public class InsecureNonceChaCha20 extends InsecureNonceChaCha20Base {
    public InsecureNonceChaCha20(byte[] r1, int r2) throws InvalidKeyException {
        super(r1, r2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int[] createInitialState(int[] r4, int r5) {
        if (r4.length != (nonceSizeInBytes() / 4)) goto L7;
        int[] r02 = new int[16];
        ChaCha20Util.setSigmaAndKey(r02, this.key);
        r02[12] = r5;
        System.arraycopy(r4, 0, r02, 13, r4.length);
        return r02;
    L7:
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r4.length * 32)}));
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
        return 12;
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
