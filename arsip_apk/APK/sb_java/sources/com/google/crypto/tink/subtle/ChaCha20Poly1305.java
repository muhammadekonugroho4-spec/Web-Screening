package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ChaCha20Poly1305 implements Aead {
    private final InsecureNonceChaCha20Poly1305 cipher;

    public ChaCha20Poly1305(byte[] r2) throws GeneralSecurityException {
        this.cipher = new InsecureNonceChaCha20Poly1305(r2);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r4, byte[] r5) throws GeneralSecurityException {
        if (r4.length < 28) goto L7;
        byte[] r1 = Arrays.copyOf(r4, 12);
        ByteBuffer r42 = ByteBuffer.wrap(r4, 12, r4.length - 12);
        return this.cipher.decrypt(r42, r1, r5);
    L7:
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r4, byte[] r5) throws GeneralSecurityException {
        ByteBuffer r02 = ByteBuffer.allocate(r4.length + 28);
        byte[] r1 = Random.randBytes(12);
        r02.put(r1);
        this.cipher.encrypt(r02, r1, r4, r5);
        return r02.array();
    }
}
