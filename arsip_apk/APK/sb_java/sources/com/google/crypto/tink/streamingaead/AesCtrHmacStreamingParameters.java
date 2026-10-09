package com.google.crypto.tink.streamingaead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public class AesCtrHmacStreamingParameters extends StreamingAeadParameters {
    private final Integer ciphertextSegmentSizeBytes;
    private final Integer derivedKeySizeBytes;
    private final HashType hkdfHashType;
    private final HashType hmacHashType;
    private final Integer hmacTagSizeBytes;
    private final Integer keySizeBytes;

    /* renamed from: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer ciphertextSegmentSizeBytes;
        private Integer derivedKeySizeBytes;
        private HashType hkdfHashType;
        private HashType hmacHashType;
        private Integer hmacTagSizeBytes;
        private Integer keySizeBytes;

        public Builder() {
            this.keySizeBytes = null;
            this.derivedKeySizeBytes = null;
            this.hkdfHashType = null;
            this.hmacHashType = null;
            this.hmacTagSizeBytes = null;
            this.ciphertextSegmentSizeBytes = null;
        }

        public AesCtrHmacStreamingParameters build() throws GeneralSecurityException {
            if (this.keySizeBytes == null) goto L59;
            Integer r02 = this.derivedKeySizeBytes;
            if (r02 == null) goto L57;
            if (this.hkdfHashType == null) goto L55;
            if (this.hmacHashType == null) goto L53;
            if (this.hmacTagSizeBytes == null) goto L51;
            if (this.ciphertextSegmentSizeBytes == null) goto L49;
            int r2 = 32;
            if (r02.intValue() == 16) goto L22;
            if (this.derivedKeySizeBytes.intValue() == 32) goto L22;
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not " + this.derivedKeySizeBytes);
        L22:
            if (this.keySizeBytes.intValue() < this.derivedKeySizeBytes.intValue()) goto L47;
            if (this.ciphertextSegmentSizeBytes.intValue() <= ((this.derivedKeySizeBytes.intValue() + this.hmacTagSizeBytes.intValue()) + 8)) goto L45;
            HashType r03 = this.hmacHashType;
            if (r03 != HashType.SHA1) goto L28;
            int r1 = 20;
        L30:
            if (r03 == HashType.SHA256) goto L34;
            r2 = r1;
        L34:
            if (r03 != HashType.SHA512) goto L37;
            r2 = 64;
        L37:
            if (this.hmacTagSizeBytes.intValue() < 10) goto L43;
            if (this.hmacTagSizeBytes.intValue() > r2) goto L43;
            return new AesCtrHmacStreamingParameters(this.keySizeBytes, this.derivedKeySizeBytes, this.hkdfHashType, this.hmacHashType, this.hmacTagSizeBytes, this.ciphertextSegmentSizeBytes, null);
        L43:
            throw new GeneralSecurityException("hmacTagSize must be in range [10, " + r2 + "], but is " + this.hmacTagSizeBytes);
        L28:
            r1 = 0;
            goto L30
        L45:
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + ((this.derivedKeySizeBytes.intValue() + this.hmacTagSizeBytes.intValue()) + 9));
        L47:
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., " + this.derivedKeySizeBytes);
        L49:
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        L51:
            throw new GeneralSecurityException("hmacTagSizeBytes needs to be set");
        L53:
            throw new GeneralSecurityException("hmacHashType needs to be set");
        L55:
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        L57:
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be set");
        L59:
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }

        @CanIgnoreReturnValue
        public Builder setCiphertextSegmentSizeBytes(int r1) {
            this.ciphertextSegmentSizeBytes = Integer.valueOf(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDerivedKeySizeBytes(int r1) {
            this.derivedKeySizeBytes = Integer.valueOf(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHkdfHashType(HashType r1) {
            this.hkdfHashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHmacHashType(HashType r1) {
            this.hmacHashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHmacTagSizeBytes(Integer r1) {
            this.hmacTagSizeBytes = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r1) {
            this.keySizeBytes = Integer.valueOf(r1);
            return this;
        }
    }

    @Immutable
    public static final class HashType {
        public static final HashType SHA1 = null;
        public static final HashType SHA256 = null;
        public static final HashType SHA512 = null;
        private final String name;

        static {
            SHA1 = new HashType("SHA1");
            SHA256 = new HashType("SHA256");
            SHA512 = new HashType("SHA512");
        }

        private HashType(String r1) {
            this.name = r1;
        }

        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ AesCtrHmacStreamingParameters(Integer r1, Integer r2, HashType r3, HashType r4, Integer r5, Integer r6, AnonymousClass1 r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AesCtrHmacStreamingParameters) == true) goto L5;
        return false;
    L5:
        AesCtrHmacStreamingParameters r42 = (AesCtrHmacStreamingParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L19:
        return false;
    L8:
        if (r42.getDerivedKeySizeBytes() != getDerivedKeySizeBytes()) goto L19;
        if (r42.getHkdfHashType() != getHkdfHashType()) goto L19;
        if (r42.getHmacHashType() != getHmacHashType()) goto L19;
        if (r42.getHmacTagSizeBytes() != getHmacTagSizeBytes()) goto L19;
        if (r42.getCiphertextSegmentSizeBytes() != getCiphertextSegmentSizeBytes()) goto L19;
        return true;
    }

    public int getCiphertextSegmentSizeBytes() {
        return this.ciphertextSegmentSizeBytes.intValue();
    }

    public int getDerivedKeySizeBytes() {
        return this.derivedKeySizeBytes.intValue();
    }

    public HashType getHkdfHashType() {
        return this.hkdfHashType;
    }

    public HashType getHmacHashType() {
        return this.hmacHashType;
    }

    public int getHmacTagSizeBytes() {
        return this.hmacTagSizeBytes.intValue();
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes.intValue();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{AesCtrHmacStreamingParameters.class, this.keySizeBytes, this.derivedKeySizeBytes, this.hkdfHashType, this.hmacHashType, this.hmacTagSizeBytes, this.ciphertextSegmentSizeBytes});
    }

    public String toString() {
        return "AesCtrHmacStreaming Parameters (IKM size: " + this.keySizeBytes + ", " + this.derivedKeySizeBytes + "-byte AES key, " + this.hkdfHashType + " for HKDF, " + this.hkdfHashType + " for HMAC, " + this.hmacTagSizeBytes + "-byte tags, " + this.ciphertextSegmentSizeBytes + "-byte ciphertexts)";
    }

    private AesCtrHmacStreamingParameters(Integer r1, Integer r2, HashType r3, HashType r4, Integer r5, Integer r6) {
        this.keySizeBytes = r1;
        this.derivedKeySizeBytes = r2;
        this.hkdfHashType = r3;
        this.hmacHashType = r4;
        this.hmacTagSizeBytes = r5;
        this.ciphertextSegmentSizeBytes = r6;
    }
}
