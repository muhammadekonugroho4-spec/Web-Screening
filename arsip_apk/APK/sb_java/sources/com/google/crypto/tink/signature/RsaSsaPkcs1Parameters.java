package com.google.crypto.tink.signature;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class RsaSsaPkcs1Parameters extends SignatureParameters {
    public static final BigInteger F4 = null;
    private final HashType hashType;
    private final int modulusSizeBits;
    private final BigInteger publicExponent;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.signature.RsaSsaPkcs1Parameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private static final BigInteger PUBLIC_EXPONENT_UPPER_BOUND = null;
        private static final BigInteger TWO = null;
        private HashType hashType;
        private Integer modulusSizeBits;
        private BigInteger publicExponent;
        private Variant variant;

        static {
            BigInteger r02 = BigInteger.valueOf(2);
            TWO = r02;
            PUBLIC_EXPONENT_UPPER_BOUND = r02.pow(256);
        }

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private void validatePublicExponent(BigInteger r3) throws InvalidAlgorithmParameterException {
            int r02 = r3.compareTo(RsaSsaPkcs1Parameters.F4);
            if (r02 == 0) goto L17;
            if (r02 < 0) goto L16;
            if (r3.mod(TWO).equals(BigInteger.ZERO) == true) goto L14;
            if (r3.compareTo(PUBLIC_EXPONENT_UPPER_BOUND) > 0) goto L12;
            return;
        L12:
            throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
        L14:
            throw new InvalidAlgorithmParameterException("Invalid public exponent");
        L16:
            throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
        }

        public RsaSsaPkcs1Parameters build() throws GeneralSecurityException {
            Integer r02 = this.modulusSizeBits;
            if (r02 == null) goto L23;
            if (this.publicExponent == null) goto L21;
            if (this.hashType == null) goto L19;
            if (this.variant == null) goto L17;
            if (r02.intValue() < 2048) goto L15;
            validatePublicExponent(this.publicExponent);
            return new RsaSsaPkcs1Parameters(this.modulusSizeBits.intValue(), this.publicExponent, this.variant, this.hashType, null);
        L15:
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", new Object[]{this.modulusSizeBits}));
        L17:
            throw new GeneralSecurityException("variant is not set");
        L19:
            throw new GeneralSecurityException("hash type is not set");
        L21:
            throw new GeneralSecurityException("publicExponent is not set");
        L23:
            throw new GeneralSecurityException("key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType r1) {
            this.hashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setModulusSizeBits(int r1) {
            this.modulusSizeBits = Integer.valueOf(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPublicExponent(BigInteger r1) {
            this.publicExponent = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.modulusSizeBits = null;
            this.publicExponent = RsaSsaPkcs1Parameters.F4;
            this.hashType = null;
            this.variant = Variant.NO_PREFIX;
        }
    }

    @Immutable
    public static final class HashType {
        public static final HashType SHA256 = null;
        public static final HashType SHA384 = null;
        public static final HashType SHA512 = null;
        private final String name;

        static {
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

    static {
        F4 = BigInteger.valueOf(65537);
    }

    public /* synthetic */ RsaSsaPkcs1Parameters(int r1, BigInteger r2, Variant r3, HashType r4, AnonymousClass1 r5) {
        this(r1, r2, r3, r4);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof RsaSsaPkcs1Parameters) == true) goto L5;
        return false;
    L5:
        RsaSsaPkcs1Parameters r42 = (RsaSsaPkcs1Parameters) r4;
        if (r42.getModulusSizeBits() == getModulusSizeBits()) goto L8;
    L15:
        return false;
    L8:
        if (Objects.equals(r42.getPublicExponent(), getPublicExponent()) == false) goto L15;
        if (r42.getVariant() != getVariant()) goto L15;
        if (r42.getHashType() != getHashType()) goto L15;
        return true;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getModulusSizeBits() {
        return this.modulusSizeBits;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
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
        return Objects.hash(new Object[]{Integer.valueOf(this.modulusSizeBits), this.publicExponent, this.variant, this.hashType});
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.variant + ", hashType: " + this.hashType + ", publicExponent: " + this.publicExponent + ", and " + this.modulusSizeBits + "-bit modulus)";
    }

    private RsaSsaPkcs1Parameters(int r1, BigInteger r2, Variant r3, HashType r4) {
        this.modulusSizeBits = r1;
        this.publicExponent = r2;
        this.variant = r3;
        this.hashType = r4;
    }
}
