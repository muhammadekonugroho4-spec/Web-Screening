package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesEaxParameters extends AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.aead.AesEaxParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer ivSizeBytes;
        private Integer keySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public AesEaxParameters build() throws GeneralSecurityException {
            Integer r02 = this.keySizeBytes;
            if (r02 == null) goto L19;
            if (this.ivSizeBytes == null) goto L17;
            if (this.variant == null) goto L15;
            if (this.tagSizeBytes == null) goto L13;
            return new AesEaxParameters(r02.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, null);
        L13:
            throw new GeneralSecurityException("Tag size is not set");
        L15:
            throw new GeneralSecurityException("Variant is not set");
        L17:
            throw new GeneralSecurityException("IV size is not set");
        L19:
            throw new GeneralSecurityException("Key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setIvSizeBytes(int r3) throws GeneralSecurityException {
            if (r3 != 12) goto L5;
        L9:
            this.ivSizeBytes = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 16) goto L9;
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L11:
            this.keySizeBytes = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 24) goto L11;
            if (r3 == 32) goto L11;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int r3) throws GeneralSecurityException {
            if (r3 < 0) goto L8;
            if (r3 > 16) goto L8;
            this.tagSizeBytes = Integer.valueOf(r3);
            return this;
        L8:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = Variant.NO_PREFIX;
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

    public /* synthetic */ AesEaxParameters(int r1, int r2, int r3, Variant r4, AnonymousClass1 r5) {
        this(r1, r2, r3, r4);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AesEaxParameters) == true) goto L5;
        return false;
    L5:
        AesEaxParameters r42 = (AesEaxParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L15:
        return false;
    L8:
        if (r42.getIvSizeBytes() != getIvSizeBytes()) goto L15;
        if (r42.getTagSizeBytes() != getTagSizeBytes()) goto L15;
        if (r42.getVariant() != getVariant()) goto L15;
        return true;
    }

    public int getIvSizeBytes() {
        return this.ivSizeBytes;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
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
        return Objects.hash(new Object[]{AesEaxParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant});
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.variant + ", " + this.ivSizeBytes + "-byte IV, " + this.tagSizeBytes + "-byte tag, and " + this.keySizeBytes + "-byte key)";
    }

    private AesEaxParameters(int r1, int r2, int r3, Variant r4) {
        this.keySizeBytes = r1;
        this.ivSizeBytes = r2;
        this.tagSizeBytes = r3;
        this.variant = r4;
    }
}
