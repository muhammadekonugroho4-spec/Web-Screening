package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class XChaCha20Poly1305Parameters extends AeadParameters {
    private final Variant variant;

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

    private XChaCha20Poly1305Parameters(Variant r1) {
        this.variant = r1;
    }

    public static XChaCha20Poly1305Parameters create() {
        return new XChaCha20Poly1305Parameters(Variant.NO_PREFIX);
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof XChaCha20Poly1305Parameters) == true) goto L6;
        return false;
    L6:
        if (((XChaCha20Poly1305Parameters) r3).getVariant() != getVariant()) goto L9;
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
        return Objects.hash(new Object[]{XChaCha20Poly1305Parameters.class, this.variant});
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.variant + ")";
    }

    public static XChaCha20Poly1305Parameters create(Variant r1) {
        return new XChaCha20Poly1305Parameters(r1);
    }
}
