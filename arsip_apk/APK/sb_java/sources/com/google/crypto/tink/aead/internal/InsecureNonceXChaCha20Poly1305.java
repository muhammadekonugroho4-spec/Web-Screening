package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
public final class InsecureNonceXChaCha20Poly1305 extends InsecureNonceChaCha20Poly1305Base {
    public InsecureNonceXChaCha20Poly1305(byte[] r1) throws GeneralSecurityException {
        super(r1);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ byte[] decrypt(ByteBuffer r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return super.decrypt(r1, r2, r3);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ void encrypt(ByteBuffer r1, byte[] r2, byte[] r3, byte[] r4) throws GeneralSecurityException {
        super.encrypt(r1, r2, r3, r4);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public InsecureNonceChaCha20Base newChaCha20Instance(byte[] r2, int r3) throws InvalidKeyException {
        return new InsecureNonceXChaCha20(r2, r3);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return super.decrypt(r1, r2, r3);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return super.encrypt(r1, r2, r3);
    }
}
