package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public class AeadOrDaead {
    private final Aead aead;
    private final DeterministicAead deterministicAead;

    public AeadOrDaead(Aead r1) {
        this.aead = r1;
        this.deterministicAead = null;
    }

    public byte[] decrypt(byte[] r2, byte[] r3) throws GeneralSecurityException {
        Aead r02 = this.aead;
        if (r02 == null) goto L7;
        return r02.decrypt(r2, r3);
    L7:
        return this.deterministicAead.decryptDeterministically(r2, r3);
    }

    public byte[] encrypt(byte[] r2, byte[] r3) throws GeneralSecurityException {
        Aead r02 = this.aead;
        if (r02 == null) goto L7;
        return r02.encrypt(r2, r3);
    L7:
        return this.deterministicAead.encryptDeterministically(r2, r3);
    }

    public AeadOrDaead(DeterministicAead r2) {
        this.aead = null;
        this.deterministicAead = r2;
    }
}
