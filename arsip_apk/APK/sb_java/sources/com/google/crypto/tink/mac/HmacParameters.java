package com.google.crypto.tink.mac;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class HmacParameters extends MacParameters {
    private final HashType hashType;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.mac.HmacParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private HashType hashType;
        private Integer keySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private static void validateTagSizeBytes(int r1, HashType r2) throws GeneralSecurityException {
            if (r1 < 10) goto L42;
            if (r2 != HashType.SHA1) goto L12;
            if (r1 > 20) goto L10;
            return;
        L10:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(r1)}));
        L12:
            if (r2 != HashType.SHA224) goto L19;
            if (r1 > 28) goto L17;
            return;
        L17:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(r1)}));
        L19:
            if (r2 != HashType.SHA256) goto L26;
            if (r1 > 32) goto L24;
            return;
        L24:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(r1)}));
        L26:
            if (r2 != HashType.SHA384) goto L33;
            if (r1 > 48) goto L31;
            return;
        L31:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(r1)}));
        L33:
            if (r2 != HashType.SHA512) goto L40;
            if (r1 > 64) goto L38;
            return;
        L38:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(r1)}));
        L40:
            throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
        L42:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(r1)}));
        }

        public HmacParameters build() throws GeneralSecurityException {
            Integer r02 = this.keySizeBytes;
            if (r02 == null) goto L23;
            if (this.tagSizeBytes == null) goto L21;
            if (this.hashType == null) goto L19;
            if (this.variant == null) goto L17;
            if (r02.intValue() < 16) goto L15;
            validateTagSizeBytes(this.tagSizeBytes.intValue(), this.hashType);
            return new HmacParameters(this.keySizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, this.hashType, null);
        L15:
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.keySizeBytes}));
        L17:
            throw new GeneralSecurityException("variant is not set");
        L19:
            throw new GeneralSecurityException("hash type is not set");
        L21:
            throw new GeneralSecurityException("tag size is not set");
        L23:
            throw new GeneralSecurityException("key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType r1) {
            this.hashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r1) throws GeneralSecurityException {
            this.keySizeBytes = Integer.valueOf(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int r1) throws GeneralSecurityException {
            this.tagSizeBytes = Integer.valueOf(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
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
        public static final Variant LEGACY = null;
        public static final Variant NO_PREFIX = null;
        public static final Variant TINK = null;
        private final String name;

        static {
            TINK = new Variant("TINK");
            CRUNCHY = new Variant("CRUNCHY");
            LEGACY = new Variant("LEGACY");
            NO_PREFIX = new Variant("NO_PREFIX");
        }

        private Variant(String r1) {
            this.name = r1;
        }

        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ HmacParameters(int r1, int r2, Variant r3, HashType r4, AnonymousClass1 r5) {
        this(r1, r2, r3, r4);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof HmacParameters) == true) goto L5;
        return false;
    L5:
        HmacParameters r42 = (HmacParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L15:
        return false;
    L8:
        if (r42.getTotalTagSizeBytes() != getTotalTagSizeBytes()) goto L15;
        if (r42.getVariant() != getVariant()) goto L15;
        if (r42.getHashType() != getHashType()) goto L15;
        return true;
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public int getTotalTagSizeBytes() {
        Variant r02 = this.variant;
        if (r02 != Variant.NO_PREFIX) goto L7;
        return getCryptographicTagSizeBytes();
    L7:
        if (r02 != Variant.TINK) goto L12;
        int r03 = getCryptographicTagSizeBytes();
    L10:
        return r03 + 5;
    L12:
        if (r02 != Variant.CRUNCHY) goto L15;
        r03 = getCryptographicTagSizeBytes();
        goto L10
    L15:
        if (r02 != Variant.LEGACY) goto L18;
        r03 = getCryptographicTagSizeBytes();
        goto L10
    L18:
        throw new IllegalStateException("Unknown variant");
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
        return Objects.hash(new Object[]{HmacParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant, this.hashType});
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.variant + ", hashType: " + this.hashType + ", " + this.tagSizeBytes + "-byte tags, and " + this.keySizeBytes + "-byte key)";
    }

    private HmacParameters(int r1, int r2, Variant r3, HashType r4) {
        this.keySizeBytes = r1;
        this.tagSizeBytes = r2;
        this.variant = r3;
        this.hashType = r4;
    }
}
