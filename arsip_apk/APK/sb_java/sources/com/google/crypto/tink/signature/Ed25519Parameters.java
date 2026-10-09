package com.google.crypto.tink.signature;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Ed25519Parameters extends SignatureParameters {
    private final Variant variant;

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

    private Ed25519Parameters(Variant r1) {
        this.variant = r1;
    }

    public static Ed25519Parameters create() {
        return new Ed25519Parameters(Variant.NO_PREFIX);
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof Ed25519Parameters) == true) goto L6;
        return false;
    L6:
        if (((Ed25519Parameters) r3).getVariant() != getVariant()) goto L9;
        return true;
    L9:
        return false;
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
        return Objects.hash(new Object[]{Ed25519Parameters.class, this.variant});
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.variant + ")";
    }

    public static Ed25519Parameters create(Variant r1) {
        return new Ed25519Parameters(r1);
    }
}
