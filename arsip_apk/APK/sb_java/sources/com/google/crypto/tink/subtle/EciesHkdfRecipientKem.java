package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes6.dex */
public final class EciesHkdfRecipientKem {
    private ECPrivateKey recipientPrivateKey;

    public EciesHkdfRecipientKem(ECPrivateKey r1) {
        this.recipientPrivateKey = r1;
    }

    public byte[] generateKey(byte[] r8, String r9, byte[] r10, byte[] r11, int r12, EllipticCurves.PointFormatType r13) throws GeneralSecurityException {
        ECPublicKey r132 = EllipticCurves.getEcPublicKey(this.recipientPrivateKey.getParams(), r13, r8);
        return Hkdf.computeEciesHkdfSymmetricKey(r8, EllipticCurves.computeSharedSecret(this.recipientPrivateKey, r132), r9, r10, r11, r12);
    }
}
