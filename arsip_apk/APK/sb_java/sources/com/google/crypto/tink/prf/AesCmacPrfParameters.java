package com.google.crypto.tink.prf;

import com.google.crypto.tink.annotations.Alpha;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class AesCmacPrfParameters extends PrfParameters {
    private final int keySizeBytes;

    private AesCmacPrfParameters(int r1) {
        this.keySizeBytes = r1;
    }

    public static AesCmacPrfParameters create(int r2) throws GeneralSecurityException {
        if (r2 == 16) goto L10;
        if (r2 == 32) goto L10;
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", new Object[]{Integer.valueOf(r2 * 8)}));
    L10:
        return new AesCmacPrfParameters(r2);
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof AesCmacPrfParameters) == true) goto L6;
        return false;
    L6:
        if (((AesCmacPrfParameters) r3).getKeySizeBytes() != getKeySizeBytes()) goto L9;
        return true;
    L9:
        return false;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{AesCmacPrfParameters.class, Integer.valueOf(this.keySizeBytes)});
    }

    public String toString() {
        return "AesCmac PRF Parameters (" + this.keySizeBytes + "-byte key)";
    }
}
