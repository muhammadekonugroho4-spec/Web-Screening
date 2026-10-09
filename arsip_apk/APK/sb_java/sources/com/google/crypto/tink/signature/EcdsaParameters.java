package com.google.crypto.tink.signature;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class EcdsaParameters extends SignatureParameters {
    private final CurveType curveType;
    private final HashType hashType;
    private final SignatureEncoding signatureEncoding;
    private final Variant variant;

    /* renamed from: com.google.crypto.tink.signature.EcdsaParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private CurveType curveType;
        private HashType hashType;
        private SignatureEncoding signatureEncoding;
        private Variant variant;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public EcdsaParameters build() throws GeneralSecurityException {
            SignatureEncoding r1 = this.signatureEncoding;
            if (r1 == null) goto L42;
            CurveType r2 = this.curveType;
            if (r2 == null) goto L40;
            HashType r3 = this.hashType;
            if (r3 == null) goto L38;
            Variant r4 = this.variant;
            if (r4 == null) goto L36;
            if (r2 != CurveType.NIST_P256) goto L18;
            if (r3 == HashType.SHA256) goto L18;
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        L18:
            if (r2 != CurveType.NIST_P384) goto L27;
            if (r3 == HashType.SHA384) goto L27;
            if (r3 == HashType.SHA512) goto L27;
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        L27:
            if (r2 != CurveType.NIST_P521) goto L34;
            if (r3 == HashType.SHA512) goto L34;
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        L34:
            return new EcdsaParameters(r1, r2, r3, r4, null);
        L36:
            throw new GeneralSecurityException("variant is not set");
        L38:
            throw new GeneralSecurityException("hash type is not set");
        L40:
            throw new GeneralSecurityException("EC curve type is not set");
        L42:
            throw new GeneralSecurityException("signature encoding is not set");
        }

        @CanIgnoreReturnValue
        public Builder setCurveType(CurveType r1) {
            this.curveType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType r1) {
            this.hashType = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSignatureEncoding(SignatureEncoding r1) {
            this.signatureEncoding = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant r1) {
            this.variant = r1;
            return this;
        }

        private Builder() {
            this.signatureEncoding = null;
            this.curveType = null;
            this.hashType = null;
            this.variant = Variant.NO_PREFIX;
        }
    }

    @Immutable
    public static final class CurveType {
        public static final CurveType NIST_P256 = null;
        public static final CurveType NIST_P384 = null;
        public static final CurveType NIST_P521 = null;
        private final String name;
        private final ECParameterSpec spec;

        static {
            NIST_P256 = new CurveType("NIST_P256", EllipticCurvesUtil.NIST_P256_PARAMS);
            NIST_P384 = new CurveType("NIST_P384", EllipticCurvesUtil.NIST_P384_PARAMS);
            NIST_P521 = new CurveType("NIST_P521", EllipticCurvesUtil.NIST_P521_PARAMS);
        }

        private CurveType(String r1, ECParameterSpec r2) {
            this.name = r1;
            this.spec = r2;
        }

        public static CurveType fromParameterSpec(ECParameterSpec r2) throws GeneralSecurityException {
            CurveType r02 = NIST_P256;
            if (EllipticCurvesUtil.isSameEcParameterSpec(r2, r02.toParameterSpec()) == false) goto L5;
            return r02;
        L5:
            CurveType r03 = NIST_P384;
            if (EllipticCurvesUtil.isSameEcParameterSpec(r2, r03.toParameterSpec()) == false) goto L8;
            return r03;
        L8:
            CurveType r04 = NIST_P521;
            if (EllipticCurvesUtil.isSameEcParameterSpec(r2, r04.toParameterSpec()) == false) goto L12;
            return r04;
        L12:
            throw new GeneralSecurityException("unknown ECParameterSpec");
        }

        public ECParameterSpec toParameterSpec() {
            return this.spec;
        }

        public String toString() {
            return this.name;
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
    public static final class SignatureEncoding {
        public static final SignatureEncoding DER = null;
        public static final SignatureEncoding IEEE_P1363 = null;
        private final String name;

        static {
            IEEE_P1363 = new SignatureEncoding("IEEE_P1363");
            DER = new SignatureEncoding("DER");
        }

        private SignatureEncoding(String r1) {
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

    public /* synthetic */ EcdsaParameters(SignatureEncoding r1, CurveType r2, HashType r3, Variant r4, AnonymousClass1 r5) {
        this(r1, r2, r3, r4);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof EcdsaParameters) == true) goto L5;
        return false;
    L5:
        EcdsaParameters r42 = (EcdsaParameters) r4;
        if (r42.getSignatureEncoding() == getSignatureEncoding()) goto L8;
    L15:
        return false;
    L8:
        if (r42.getCurveType() != getCurveType()) goto L15;
        if (r42.getHashType() != getHashType()) goto L15;
        if (r42.getVariant() != getVariant()) goto L15;
        return true;
    }

    public CurveType getCurveType() {
        return this.curveType;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public SignatureEncoding getSignatureEncoding() {
        return this.signatureEncoding;
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
        return Objects.hash(new Object[]{EcdsaParameters.class, this.signatureEncoding, this.curveType, this.hashType, this.variant});
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.variant + ", hashType: " + this.hashType + ", encoding: " + this.signatureEncoding + ", curve: " + this.curveType + ")";
    }

    private EcdsaParameters(SignatureEncoding r1, CurveType r2, HashType r3, Variant r4) {
        this.signatureEncoding = r1;
        this.curveType = r2;
        this.hashType = r3;
        this.variant = r4;
    }
}
