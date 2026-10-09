package com.google.crypto.tink.subtle;

import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes6.dex */
class ChaCha20 implements IndCpaCipher {
    static final int NONCE_LENGTH_IN_BYTES = 12;
    private final InsecureNonceChaCha20 cipher;

    public ChaCha20(byte[] r2, int r3) throws InvalidKeyException {
        this.cipher = new InsecureNonceChaCha20(r2, r3);
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] r4) throws GeneralSecurityException {
        if (r4.length < 12) goto L7;
        byte[] r02 = Arrays.copyOf(r4, 12);
        ByteBuffer r42 = ByteBuffer.wrap(r4, 12, r4.length - 12);
        return this.cipher.decrypt(r02, r42);
    L7:
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] r4) throws GeneralSecurityException {
        ByteBuffer r02 = ByteBuffer.allocate(r4.length + 12);
        byte[] r1 = Random.randBytes(12);
        r02.put(r1);
        this.cipher.encrypt(r02, r1, r4);
        return r02.array();
    }
}
