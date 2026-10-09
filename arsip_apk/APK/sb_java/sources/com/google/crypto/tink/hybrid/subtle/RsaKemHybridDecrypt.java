package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.aead.subtle.AeadFactory;
import com.google.crypto.tink.subtle.Hkdf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.Cipher;

/* loaded from: classes6.dex */
public final class RsaKemHybridDecrypt implements HybridDecrypt {
    private final AeadFactory aeadFactory;
    private final String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final RSAPrivateKey recipientPrivateKey;

    public RsaKemHybridDecrypt(RSAPrivateKey r2, String r3, byte[] r4, AeadFactory r5) throws GeneralSecurityException {
        RsaKem.validateRsaModulus(r2.getModulus());
        this.recipientPrivateKey = r2;
        this.hkdfSalt = r4;
        this.hkdfHmacAlgo = r3;
        this.aeadFactory = r5;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r5, byte[] r6) throws GeneralSecurityException {
        int r02 = RsaKem.bigIntSizeInBytes(this.recipientPrivateKey.getModulus());
        if (r5.length < r02) goto L7;
        ByteBuffer r52 = ByteBuffer.wrap(r5);
        byte[] r03 = new byte[r02];
        r52.get(r03);
        Cipher r1 = Cipher.getInstance("RSA/ECB/NoPadding");
        r1.init(2, this.recipientPrivateKey);
        byte[] r04 = r1.doFinal(r03);
        byte[] r62 = Hkdf.computeHkdf(this.hkdfHmacAlgo, r04, this.hkdfSalt, r6, this.aeadFactory.getKeySizeInBytes());
        Aead r63 = this.aeadFactory.createAead(r62);
        byte[] r05 = new byte[r52.remaining()];
        r52.get(r05);
        return r63.decrypt(r05, RsaKem.EMPTY_AAD);
    L7:
        throw new GeneralSecurityException(String.format("Ciphertext must be of at least size %d bytes, but got %d", new Object[]{Integer.valueOf(r02), Integer.valueOf(r5.length)}));
    }
}
