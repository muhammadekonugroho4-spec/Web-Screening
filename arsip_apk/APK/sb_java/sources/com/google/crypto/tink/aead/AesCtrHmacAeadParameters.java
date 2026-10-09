package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesCtrHmacAeadParameters extends AeadParameters {
    private static final int IV_SIZE_IN_BYTES = 16;
    private static final int PREFIX_SIZE_IN_BYTES = 5;
    private final int aesKeySizeBytes;
    private final HashType hashType;
    private final int hmacKeySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.aead.AesCtrHmacAeadParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer aesKeySizeBytes;
        private HashType hashType;
        private Integer hmacKeySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private static void validateTagSizeBytes(int r1, HashType r2) throws GeneralSecurityException {
            if (r2 != HashType.SHA1) goto L10;
            if (r1 > 20) goto L8;
            return;
        L8:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(r1)}));
        L10:
            if (r2 != HashType.SHA224) goto L17;
            if (r1 > 28) goto L15;
            return;
        L15:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(r1)}));
        L17:
            if (r2 != HashType.SHA256) goto L24;
            if (r1 > 32) goto L22;
            return;
        L22:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(r1)}));
        L24:
            if (r2 != HashType.SHA384) goto L31;
            if (r1 > 48) goto L29;
            return;
        L29:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(r1)}));
        L31:
            if (r2 != HashType.SHA512) goto L38;
            if (r1 > 64) goto L36;
            return;
        L36:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(r1)}));
        L38:
            throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
        }

        public AesCtrHmacAeadParameters build() throws GeneralSecurityException {
            if (this.aesKeySizeBytes == null) goto L23;
            if (this.hmacKeySizeBytes == null) goto L21;
            Integer r02 = this.tagSizeBytes;
            if (r02 == null) goto L19;
            if (this.hashType == null) goto L17;
            if (this.variant == null) goto L15;
            validateTagSizeBytes(r02.intValue(), this.hashType);
            return new AesCtrHmacAeadParameters(this.aesKeySizeBytes.intValue(), this.hmacKeySizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, this.hashType, null);
        L15:
            throw new GeneralSecurityException("variant is not set");
        L17:
            throw new GeneralSecurityException("hash type is not set");
        L19:
            throw new GeneralSecurityException("tag size is not set");
        L21:
            throw new GeneralSecurityException("HMAC key size is not set");
        L23:
            throw new GeneralSecurityException("AES key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setAesKeySizeBytes(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L11:
            this.aesKeySizeBytes = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 24) goto L11;
            if (r3 == 32) goto L11;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType r1) {
            this.hashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHmacKeySizeBytes(int r3) throws GeneralSecurityException {
            if (r3 < 16) goto L7;
            this.hmacKeySizeBytes = Integer.valueOf(r3);
            return this;
        L7:
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int r3) throws GeneralSecurityException {
            if (r3 < 10) goto L7;
            this.tagSizeBytes = Integer.valueOf(r3);
            return this;
        L7:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.aesKeySizeBytes = null;
            this.hmacKeySizeBytes = null;
            this.tagSizeBytes = null;
            this.hashType = null;
            this.variant = Variant.NO_PREFIX;
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

    @Immutable
    public static final class Variant {
        public static final Variant CRUNCHY = null;
        public static final Variant NO_PREFIX = null;
        public static final Variant TINK = null;
        private final String name;

        static {
            TINK = new Variant("TINK");
            CRUNCHY = new Variant("CRUNCHY");
            NO_PREFIX = new Variant("NO_PREFIX");
        }

        private Variant(String r1) {
            this.name = r1;
        }

        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ AesCtrHmacAeadParameters(int r1, int r2, int r3, Variant r4, HashType r5, AnonymousClass1 r6) {
        this(r1, r2, r3, r4, r5);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AesCtrHmacAeadParameters) == true) goto L5;
        return false;
    L5:
        AesCtrHmacAeadParameters r42 = (AesCtrHmacAeadParameters) r4;
        if (r42.getAesKeySizeBytes() == getAesKeySizeBytes()) goto L8;
    L17:
        return false;
    L8:
        if (r42.getHmacKeySizeBytes() != getHmacKeySizeBytes()) goto L17;
        if (r42.getCiphertextOverheadSizeBytes() != getCiphertextOverheadSizeBytes()) goto L17;
        if (r42.getVariant() != getVariant()) goto L17;
        if (r42.getHashType() != getHashType()) goto L17;
        return true;
    }

    public int getAesKeySizeBytes() {
        return this.aesKeySizeBytes;
    }

    public int getCiphertextOverheadSizeBytes() {
        Variant r02 = this.variant;
        if (r02 != Variant.NO_PREFIX) goto L7;
        return getTagSizeBytes() + 16;
    L7:
        if (r02 == Variant.TINK) goto L14;
        if (r02 == Variant.CRUNCHY) goto L14;
        throw new IllegalStateException("Unknown variant");
    L14:
        return getTagSizeBytes() + 21;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getHmacKeySizeBytes() {
        return this.hmacKeySizeBytes;
    }

    public int getTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        if (this.variant == Variant.NO_PREFIX) goto L6;
        return true;
    L6:
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{AesCtrHmacAeadParameters.class, Integer.valueOf(this.aesKeySizeBytes), Integer.valueOf(this.hmacKeySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant, this.hashType});
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.variant + ", hashType: " + this.hashType + ", " + this.tagSizeBytes + "-byte tags, and " + this.aesKeySizeBytes + "-byte AES key, and " + this.hmacKeySizeBytes + "-byte HMAC key)";
    }

    private AesCtrHmacAeadParameters(int r1, int r2, int r3, Variant r4, HashType r5) {
        this.aesKeySizeBytes = r1;
        this.hmacKeySizeBytes = r2;
        this.tagSizeBytes = r3;
        this.variant = r4;
        this.hashType = r5;
    }
}
