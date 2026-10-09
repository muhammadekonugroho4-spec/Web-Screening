package com.google.crypto.tink.mac;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesCmacParameters extends MacParameters {
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.mac.AesCmacParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer keySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public AesCmacParameters build() throws GeneralSecurityException {
            Integer r02 = this.keySizeBytes;
            if (r02 == null) goto L15;
            if (this.tagSizeBytes == null) goto L13;
            if (this.variant == null) goto L11;
            return new AesCmacParameters(r02.intValue(), this.tagSizeBytes.intValue(), this.variant, null);
        L11:
            throw new GeneralSecurityException("variant not set");
        L13:
            throw new GeneralSecurityException("tag size not set");
        L15:
            throw new GeneralSecurityException("key size not set");
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L9:
            this.keySizeBytes = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 32) goto L9;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r3 * 8)}));
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int r4) throws GeneralSecurityException {
            if (r4 < 10) goto L9;
            if (16 < r4) goto L9;
            this.tagSizeBytes = Integer.valueOf(r4);
            return this;
        L9:
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + r4);
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = Variant.NO_PREFIX;
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

    public /* synthetic */ AesCmacParameters(int r1, int r2, Variant r3, AnonymousClass1 r4) {
        this(r1, r2, r3);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AesCmacParameters) == true) goto L5;
        return false;
    L5:
        AesCmacParameters r42 = (AesCmacParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L13:
        return false;
    L8:
        if (r42.getTotalTagSizeBytes() != getTotalTagSizeBytes()) goto L13;
        if (r42.getVariant() != getVariant()) goto L13;
        return true;
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
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
        return Objects.hash(new Object[]{AesCmacParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant});
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.variant + ", " + this.tagSizeBytes + "-byte tags, and " + this.keySizeBytes + "-byte key)";
    }

    private AesCmacParameters(int r1, int r2, Variant r3) {
        this.keySizeBytes = r1;
        this.tagSizeBytes = r2;
        this.variant = r3;
    }
}
