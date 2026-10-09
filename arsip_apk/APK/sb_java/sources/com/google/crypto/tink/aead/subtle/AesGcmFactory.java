package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@Immutable
/* loaded from: classes6.dex */
public final class AesGcmFactory implements AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int r1) throws GeneralSecurityException {
        this.keySizeInBytes = validateAesKeySize(r1);
    }

    private static int validateAesKeySize(int r2) throws InvalidAlgorithmParameterException {
        if (r2 != 16) goto L5;
    L9:
        return r2;
    L5:
        if (r2 == 32) goto L9;
        throw new InvalidAlgorithmParameterException(String.format("Invalid AES key size, expected 16 or 32, but got %d", new Object[]{Integer.valueOf(r2)}));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public Aead createAead(byte[] r3) throws GeneralSecurityException {
        if (r3.length != getKeySizeInBytes()) goto L7;
        return new AesGcmJce(r3);
    L7:
        throw new GeneralSecurityException(String.format("Symmetric key has incorrect length; expected %s, but got %s", new Object[]{Integer.valueOf(getKeySizeInBytes()), Integer.valueOf(r3.length)}));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
        return this.keySizeInBytes;
    }
}
