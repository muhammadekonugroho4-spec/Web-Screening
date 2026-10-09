package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes6.dex */
public class JwtHmacParameters extends JwtMacParameters {
    private final Algorithm algorithm;
    private final int keySizeBytes;
    private final KidStrategy kidStrategy;

    /* renamed from: com.google.crypto.tink.jwt.JwtHmacParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @Immutable
    public static final class Algorithm {
        public static final Algorithm HS256 = null;
        public static final Algorithm HS384 = null;
        public static final Algorithm HS512 = null;
        private final String name;

        static {
            HS256 = new Algorithm("HS256");
            HS384 = new Algorithm("HS384");
            HS512 = new Algorithm("HS512");
        }

        private Algorithm(String r1) {
            this.name = r1;
        }

        public String getStandardName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }
    }

    public static final class Builder {
        Optional<Algorithm> algorithm;
        Optional<Integer> keySizeBytes;
        Optional<KidStrategy> kidStrategy;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public JwtHmacParameters build() throws GeneralSecurityException {
            if (this.keySizeBytes.isPresent() == false) goto L19;
            if (this.algorithm.isPresent() == false) goto L17;
            if (this.kidStrategy.isPresent() == false) goto L15;
            if (this.keySizeBytes.get().intValue() < 16) goto L13;
            return new JwtHmacParameters(this.keySizeBytes.get().intValue(), this.kidStrategy.get(), this.algorithm.get(), null);
        L13:
            throw new GeneralSecurityException("Key size must be at least 16 bytes");
        L15:
            throw new GeneralSecurityException("KidStrategy must be set");
        L17:
            throw new GeneralSecurityException("Algorithm must be set");
        L19:
            throw new GeneralSecurityException("Key Size must be set");
        }

        @CanIgnoreReturnValue
        public Builder setAlgorithm(Algorithm r1) {
            this.algorithm = Optional.of(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int r1) {
            this.keySizeBytes = Optional.of(Integer.valueOf(r1));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKidStrategy(KidStrategy r1) {
            this.kidStrategy = Optional.of(r1);
            return this;
        }

        private Builder() {
            this.keySizeBytes = Optional.empty();
            this.kidStrategy = Optional.empty();
            this.algorithm = Optional.empty();
        }
    }

    @Immutable
    public static final class KidStrategy {
        public static final KidStrategy BASE64_ENCODED_KEY_ID = null;
        public static final KidStrategy CUSTOM = null;
        public static final KidStrategy IGNORED = null;
        private final String name;

        static {
            BASE64_ENCODED_KEY_ID = new KidStrategy("BASE64_ENCODED_KEY_ID");
            IGNORED = new KidStrategy("IGNORED");
            CUSTOM = new KidStrategy("CUSTOM");
        }

        private KidStrategy(String r1) {
            this.name = r1;
        }

        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ JwtHmacParameters(int r1, KidStrategy r2, Algorithm r3, AnonymousClass1 r4) {
        this(r1, r2, r3);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    @Override // com.google.crypto.tink.jwt.JwtMacParameters
    public boolean allowKidAbsent() {
        if (this.kidStrategy.equals(KidStrategy.CUSTOM) == false) goto L5;
        return true;
    L5:
        if (this.kidStrategy.equals(KidStrategy.IGNORED) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof JwtHmacParameters) == true) goto L5;
        return false;
    L5:
        JwtHmacParameters r42 = (JwtHmacParameters) r4;
        if (r42.keySizeBytes == this.keySizeBytes) goto L8;
    L13:
        return false;
    L8:
        if (r42.kidStrategy.equals(this.kidStrategy) == false) goto L13;
        if (r42.algorithm.equals(this.algorithm) == false) goto L13;
        return true;
    }

    public Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public KidStrategy getKidStrategy() {
        return this.kidStrategy;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.kidStrategy.equals(KidStrategy.BASE64_ENCODED_KEY_ID);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{JwtHmacParameters.class, Integer.valueOf(this.keySizeBytes), this.kidStrategy, this.algorithm});
    }

    public String toString() {
        return "JWT HMAC Parameters (kidStrategy: " + this.kidStrategy + ", Algorithm " + this.algorithm + ", and " + this.keySizeBytes + "-byte key)";
    }

    private JwtHmacParameters(int r1, KidStrategy r2, Algorithm r3) {
        this.keySizeBytes = r1;
        this.kidStrategy = r2;
        this.algorithm = r3;
    }
}
