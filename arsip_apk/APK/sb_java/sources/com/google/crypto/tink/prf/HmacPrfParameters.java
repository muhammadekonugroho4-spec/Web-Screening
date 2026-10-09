package com.google.crypto.tink.prf;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class HmacPrfParameters extends PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final HashType hashType;
    private final int keySizeBytes;

    /* renamed from: com.google.crypto.tink.prf.HmacPrfParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private HashType hashType;
        private Integer keySizeBytes;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public HmacPrfParameters build() throws GeneralSecurityException {
            Integer r02 = this.keySizeBytes;
            if (r02 == null) goto L11;
            if (this.hashType == null) goto L9;
            return new HmacPrfParameters(r02.intValue(), this.hashType, null);
        L9:
            throw new GeneralSecurityException("hash type is not set");
        L11:
            throw new GeneralSecurityException("key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType r1) {
            this.hashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r3) throws GeneralSecurityException {
            if (r3 < 16) goto L7;
            this.keySizeBytes = Integer.valueOf(r3);
            return this;
        L7:
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", new Object[]{Integer.valueOf(r3 * 8)}));
        }

        private Builder() {
            this.keySizeBytes = null;
            this.hashType = null;
        }
    }

    @Immutable
    public static final class HashType {
        public static final HashType SHA1 = null;
        public static final HashType SHA224 = null;
        public static final HashType SHA256 = null;
        public static final HashType SHA384 = null;
        public static final HashType SHA512 = null;
        private final String name;

        static {
            SHA1 = new HashType("SHA1");
            SHA224 = new HashType("SHA224");
            SHA256 = new HashType("SHA256");
            SHA384 = new HashType("SHA384");
            SHA512 = new HashType("SHA512");
        }

        private HashType(String r1) {
            this.name = r1;
        }

        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ HmacPrfParameters(int r1, HashType r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof HmacPrfParameters) == true) goto L5;
        return false;
    L5:
        HmacPrfParameters r42 = (HmacPrfParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L11:
        return false;
    L8:
        if (r42.getHashType() != getHashType()) goto L11;
        return true;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{HmacPrfParameters.class, Integer.valueOf(this.keySizeBytes), this.hashType});
    }

    public String toString() {
        return "HMAC PRF Parameters (hashType: " + this.hashType + " and " + this.keySizeBytes + "-byte key)";
    }

    private HmacPrfParameters(int r1, HashType r2) {
        this.keySizeBytes = r1;
        this.hashType = r2;
    }
}
