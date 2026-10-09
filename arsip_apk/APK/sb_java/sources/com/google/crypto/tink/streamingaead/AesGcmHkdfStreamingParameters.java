package com.google.crypto.tink.streamingaead;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public class AesGcmHkdfStreamingParameters extends StreamingAeadParameters {
    private final Integer ciphertextSegmentSizeBytes;
    private final Integer derivedAesGcmKeySizeBytes;
    private final HashType hkdfHashType;
    private final Integer keySizeBytes;

    /* renamed from: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer ciphertextSegmentSizeBytes;
        private Integer derivedAesGcmKeySizeBytes;
        private HashType hkdfHashType;
        private Integer keySizeBytes;

        public Builder() {
            this.keySizeBytes = null;
            this.derivedAesGcmKeySizeBytes = null;
            this.hkdfHashType = null;
            this.ciphertextSegmentSizeBytes = null;
        }

        public AesGcmHkdfStreamingParameters build() throws GeneralSecurityException {
            if (this.keySizeBytes == null) goto L34;
            Integer r02 = this.derivedAesGcmKeySizeBytes;
            if (r02 == null) goto L32;
            if (this.hkdfHashType == null) goto L30;
            if (this.ciphertextSegmentSizeBytes == null) goto L28;
            if (r02.intValue() == 16) goto L18;
            if (this.derivedAesGcmKeySizeBytes.intValue() == 32) goto L18;
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not " + this.derivedAesGcmKeySizeBytes);
        L18:
            if (this.keySizeBytes.intValue() < this.derivedAesGcmKeySizeBytes.intValue()) goto L26;
            if (this.ciphertextSegmentSizeBytes.intValue() <= (this.derivedAesGcmKeySizeBytes.intValue() + 24)) goto L24;
            return new AesGcmHkdfStreamingParameters(this.keySizeBytes, this.derivedAesGcmKeySizeBytes, this.hkdfHashType, this.ciphertextSegmentSizeBytes, null);
        L24:
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (this.derivedAesGcmKeySizeBytes.intValue() + 25));
        L26:
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., " + this.derivedAesGcmKeySizeBytes);
        L28:
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        L30:
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        L32:
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
        L34:
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }

        public Builder setCiphertextSegmentSizeBytes(int r1) {
            this.ciphertextSegmentSizeBytes = Integer.valueOf(r1);
            return this;
        }

        public Builder setDerivedAesGcmKeySizeBytes(int r1) {
            this.derivedAesGcmKeySizeBytes = Integer.valueOf(r1);
            return this;
        }

        public Builder setHkdfHashType(HashType r1) {
            this.hkdfHashType = r1;
            return this;
        }

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

    public /* synthetic */ AesGcmHkdfStreamingParameters(Integer r1, Integer r2, HashType r3, Integer r4, AnonymousClass1 r5) {
        this(r1, r2, r3, r4);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AesGcmHkdfStreamingParameters) == true) goto L5;
        return false;
    L5:
        AesGcmHkdfStreamingParameters r42 = (AesGcmHkdfStreamingParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L15:
        return false;
    L8:
        if (r42.getDerivedAesGcmKeySizeBytes() != getDerivedAesGcmKeySizeBytes()) goto L15;
        if (r42.getHkdfHashType() != getHkdfHashType()) goto L15;
        if (r42.getCiphertextSegmentSizeBytes() != getCiphertextSegmentSizeBytes()) goto L15;
        return true;
    }

    public int getCiphertextSegmentSizeBytes() {
        return this.ciphertextSegmentSizeBytes.intValue();
    }

    public int getDerivedAesGcmKeySizeBytes() {
        return this.derivedAesGcmKeySizeBytes.intValue();
    }

    public HashType getHkdfHashType() {
        return this.hkdfHashType;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes.intValue();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{AesGcmHkdfStreamingParameters.class, this.keySizeBytes, this.derivedAesGcmKeySizeBytes, this.hkdfHashType, this.ciphertextSegmentSizeBytes});
    }

    public String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.keySizeBytes + ", " + this.derivedAesGcmKeySizeBytes + "-byte AES GCM key, " + this.hkdfHashType + " for HKDF " + this.ciphertextSegmentSizeBytes + "-byte ciphertexts)";
    }

    private AesGcmHkdfStreamingParameters(Integer r1, Integer r2, HashType r3, Integer r4) {
        this.keySizeBytes = r1;
        this.derivedAesGcmKeySizeBytes = r2;
        this.hkdfHashType = r3;
        this.ciphertextSegmentSizeBytes = r4;
    }
}
