package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class AesGcmJce implements Aead {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final InsecureNonceAesGcmJce insecureNonceAesGcmJce;

    static {
        FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public AesGcmJce(byte[] r3) throws GeneralSecurityException {
        if (FIPS.isCompatible() == false) goto L7;
        this.insecureNonceAesGcmJce = new InsecureNonceAesGcmJce(r3, true);
        return;
    L7:
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r3, byte[] r4) throws GeneralSecurityException {
        byte[] r02 = Arrays.copyOf(r3, 12);
        return this.insecureNonceAesGcmJce.decrypt(r02, r3, r4);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r3, byte[] r4) throws GeneralSecurityException {
        byte[] r02 = Random.randBytes(12);
        return this.insecureNonceAesGcmJce.encrypt(r02, r3, r4);
    }
}
