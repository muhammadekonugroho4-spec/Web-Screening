package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@Immutable
/* loaded from: classes6.dex */
public class PrfMac implements Mac {
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private final int tagSize;
    private final Prf wrappedPrf;

    public PrfMac(Prf r2, int r3) throws GeneralSecurityException {
        this.wrappedPrf = r2;
        this.tagSize = r3;
        if (r3 < 10) goto L7;
        r2.compute(new byte[0], r3);
        return;
    L7:
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] r3) throws GeneralSecurityException {
        return this.wrappedPrf.compute(r3, this.tagSize);
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] r1, byte[] r2) throws GeneralSecurityException {
        if (Bytes.equal(computeMac(r2), r1) == false) goto L6;
        return;
    L6:
        throw new GeneralSecurityException("invalid MAC");
    }
}
