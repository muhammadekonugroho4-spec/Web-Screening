package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesGcmSivParameters extends AeadParameters {
    private final int keySizeBytes;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.aead.AesGcmSivParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer keySizeBytes;
        private Variant variant;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public AesGcmSivParameters build() throws GeneralSecurityException {
            Integer r02 = this.keySizeBytes;
            if (r02 == null) goto L11;
            if (this.variant == null) goto L9;
            return new AesGcmSivParameters(r02.intValue(), this.variant, null);
        L9:
            throw new GeneralSecurityException("Variant is not set");
        L11:
            throw new GeneralSecurityException("Key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L9:
            this.keySizeBytes = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 32) goto L9;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
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

    public /* synthetic */ AesGcmSivParameters(int r1, Variant r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AesGcmSivParameters) == true) goto L5;
        return false;
    L5:
        AesGcmSivParameters r42 = (AesGcmSivParameters) r4;
        if (r42.getKeySizeBytes() == getKeySizeBytes()) goto L8;
    L11:
        return false;
    L8:
        if (r42.getVariant() != getVariant()) goto L11;
        return true;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
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
        return Objects.hash(new Object[]{AesGcmSivParameters.class, Integer.valueOf(this.keySizeBytes), this.variant});
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.variant + ", " + this.keySizeBytes + "-byte key)";
    }

    private AesGcmSivParameters(int r1, Variant r2) {
        this.keySizeBytes = r1;
        this.variant = r2;
    }
}
