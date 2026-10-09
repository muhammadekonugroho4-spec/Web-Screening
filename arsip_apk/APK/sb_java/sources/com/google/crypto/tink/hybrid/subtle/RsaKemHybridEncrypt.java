package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.aead.subtle.AeadFactory;
import com.google.crypto.tink.subtle.Hkdf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;

/* loaded from: classes6.dex */
public final class RsaKemHybridEncrypt implements HybridEncrypt {
    private final AeadFactory aeadFactory;
    private final String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final RSAPublicKey recipientPublicKey;

    public RsaKemHybridEncrypt(RSAPublicKey r2, String r3, byte[] r4, AeadFactory r5) throws GeneralSecurityException {
        RsaKem.validateRsaModulus(r2.getModulus());
        this.recipientPublicKey = r2;
        this.hkdfHmacAlgo = r3;
        this.hkdfSalt = r4;
        this.aeadFactory = r5;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] r6, byte[] r7) throws GeneralSecurityException {
        byte[] r02 = RsaKem.generateSecret(this.recipientPublicKey.getModulus());
        Cipher r1 = Cipher.getInstance("RSA/ECB/NoPadding");
        r1.init(1, this.recipientPublicKey);
        byte[] r12 = r1.doFinal(r02);
        byte[] r72 = Hkdf.computeHkdf(this.hkdfHmacAlgo, r02, this.hkdfSalt, r7, this.aeadFactory.getKeySizeInBytes());
        byte[] r62 = this.aeadFactory.createAead(r72).encrypt(r6, RsaKem.EMPTY_AAD);
        return ByteBuffer.allocate(r12.length + r62.length).put(r12).put(r62).array();
    }
}
