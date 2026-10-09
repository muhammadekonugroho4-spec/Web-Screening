package com.google.crypto.tink.jwt;

import com.clevertap.android.sdk.Constants;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

@Immutable
/* loaded from: classes6.dex */
public final class JwtValidator {
    private static final Duration MAX_CLOCK_SKEW = null;
    private final boolean allowMissingExpiration;
    private final Clock clock;
    private final Duration clockSkew;
    private final boolean expectIssuedInThePast;
    private final Optional<String> expectedAudience;
    private final Optional<String> expectedIssuer;
    private final Optional<String> expectedTypeHeader;
    private final boolean ignoreAudiences;
    private final boolean ignoreIssuer;
    private final boolean ignoreTypeHeader;

    /* renamed from: com.google.crypto.tink.jwt.JwtValidator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean allowMissingExpiration;
        private Clock clock;
        private Duration clockSkew;
        private boolean expectIssuedInThePast;
        private Optional<String> expectedAudience;
        private Optional<String> expectedIssuer;
        private Optional<String> expectedTypeHeader;
        private boolean ignoreAudiences;
        private boolean ignoreIssuer;
        private boolean ignoreTypeHeader;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public static /* synthetic */ Optional access$000(Builder r02) {
            return r02.expectedTypeHeader;
        }

        public static /* synthetic */ boolean access$100(Builder r02) {
            return r02.ignoreTypeHeader;
        }

        public static /* synthetic */ Optional access$200(Builder r02) {
            return r02.expectedIssuer;
        }

        public static /* synthetic */ boolean access$300(Builder r02) {
            return r02.ignoreIssuer;
        }

        public static /* synthetic */ Optional access$400(Builder r02) {
            return r02.expectedAudience;
        }

        public static /* synthetic */ boolean access$500(Builder r02) {
            return r02.ignoreAudiences;
        }

        public static /* synthetic */ boolean access$600(Builder r02) {
            return r02.allowMissingExpiration;
        }

        public static /* synthetic */ boolean access$700(Builder r02) {
            return r02.expectIssuedInThePast;
        }

        public static /* synthetic */ Clock access$800(Builder r02) {
            return r02.clock;
        }

        public static /* synthetic */ Duration access$900(Builder r02) {
            return r02.clockSkew;
        }

        @CanIgnoreReturnValue
        public Builder allowMissingExpiration() {
            this.allowMissingExpiration = true;
            return this;
        }

        public JwtValidator build() {
            if (this.ignoreTypeHeader == false) goto L10;
            if (this.expectedTypeHeader.isPresent() == false) goto L10;
            throw new IllegalArgumentException("ignoreTypeHeader() and expectedTypeHeader() cannot be used together.");
        L10:
            if (this.ignoreIssuer == false) goto L17;
            if (this.expectedIssuer.isPresent() == false) goto L17;
            throw new IllegalArgumentException("ignoreIssuer() and expectedIssuer() cannot be used together.");
        L17:
            if (this.ignoreAudiences == false) goto L24;
            if (this.expectedAudience.isPresent() == false) goto L24;
            throw new IllegalArgumentException("ignoreAudiences() and expectedAudience() cannot be used together.");
        L24:
            return new JwtValidator(this, null);
        }

        @CanIgnoreReturnValue
        public Builder expectAudience(String r2) {
            if (r2 == null) goto L6;
            this.expectedAudience = Optional.of(r2);
            return this;
        L6:
            throw new NullPointerException("audience cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder expectIssuedInThePast() {
            this.expectIssuedInThePast = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder expectIssuer(String r2) {
            if (r2 == null) goto L6;
            this.expectedIssuer = Optional.of(r2);
            return this;
        L6:
            throw new NullPointerException("issuer cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder expectTypeHeader(String r2) {
            if (r2 == null) goto L6;
            this.expectedTypeHeader = Optional.of(r2);
            return this;
        L6:
            throw new NullPointerException("typ header cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder ignoreAudiences() {
            this.ignoreAudiences = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreIssuer() {
            this.ignoreIssuer = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreTypeHeader() {
            this.ignoreTypeHeader = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock r2) {
            if (r2 == null) goto L6;
            this.clock = r2;
            return this;
        L6:
            throw new NullPointerException("clock cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder setClockSkew(Duration r2) {
            if (r2.compareTo(JwtValidator.access$1100()) > 0) goto L7;
            this.clockSkew = r2;
            return this;
        L7:
            throw new IllegalArgumentException("Clock skew too large, max is 10 minutes");
        }

        private Builder() {
            this.clock = Clock.systemUTC();
            this.clockSkew = Duration.ZERO;
            this.expectedTypeHeader = Optional.empty();
            this.ignoreTypeHeader = false;
            this.expectedIssuer = Optional.empty();
            this.ignoreIssuer = false;
            this.expectedAudience = Optional.empty();
            this.ignoreAudiences = false;
            this.allowMissingExpiration = false;
            this.expectIssuedInThePast = false;
        }
    }

    static {
        MAX_CLOCK_SKEW = Duration.ofMinutes(10);
    }

    public /* synthetic */ JwtValidator(Builder r1, AnonymousClass1 r2) {
        this(r1);
    }

    public static /* synthetic */ Duration access$1100() {
        return MAX_CLOCK_SKEW;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    private void validateAudiences(RawJwt r3) throws JwtInvalidException {
        if (this.expectedAudience.isPresent() == false) goto L12;
        if (r3.hasAudiences() == false) goto L10;
        if (r3.getAudiences().contains(this.expectedAudience.get()) == false) goto L10;
        return;
    L10:
        throw new JwtInvalidException(String.format("invalid JWT; missing expected audience %s.", new Object[]{this.expectedAudience.get()}));
    L12:
        if (r3.hasAudiences() == true) goto L14;
        return;
    L14:
        if (this.ignoreAudiences == false) goto L17;
        return;
    L17:
        throw new JwtInvalidException("invalid JWT; token has audience set, but validator not.");
    }

    private void validateIssuer(RawJwt r3) throws JwtInvalidException {
        if (this.expectedIssuer.isPresent() == false) goto L14;
        if (r3.hasIssuer() == false) goto L12;
        if (r3.getIssuer().equals(this.expectedIssuer.get()) == false) goto L10;
        return;
    L10:
        throw new JwtInvalidException(String.format("invalid JWT; expected issuer %s, but got %s", new Object[]{this.expectedIssuer.get(), r3.getIssuer()}));
    L12:
        throw new JwtInvalidException(String.format("invalid JWT; missing expected issuer %s.", new Object[]{this.expectedIssuer.get()}));
    L14:
        if (r3.hasIssuer() == true) goto L16;
        return;
    L16:
        if (this.ignoreIssuer == false) goto L19;
        return;
    L19:
        throw new JwtInvalidException("invalid JWT; token has issuer set, but validator not.");
    }

    private void validateTimestampClaims(RawJwt r4) throws JwtInvalidException {
        Instant r02 = this.clock.instant();
        if (r4.hasExpiration() == true) goto L10;
        if (this.allowMissingExpiration == true) goto L10;
        throw new JwtInvalidException("token does not have an expiration set");
    L10:
        if (r4.hasExpiration() == false) goto L17;
        if (r4.getExpiration().isAfter(r02.minus(this.clockSkew)) == true) goto L17;
        throw new JwtInvalidException("token has expired since " + r4.getExpiration());
    L17:
        if (r4.hasNotBefore() == false) goto L24;
        if (r4.getNotBefore().isAfter(r02.plus(this.clockSkew)) == false) goto L24;
        throw new JwtInvalidException("token cannot be used before " + r4.getNotBefore());
    L24:
        if (this.expectIssuedInThePast == true) goto L26;
        return;
    L26:
        if (r4.hasIssuedAt() == false) goto L33;
        if (r4.getIssuedAt().isAfter(r02.plus(this.clockSkew)) == true) goto L31;
        return;
    L31:
        throw new JwtInvalidException("token has a invalid iat claim in the future: " + r4.getIssuedAt());
    L33:
        throw new JwtInvalidException("token does not have an iat claim");
    }

    private void validateTypeHeader(RawJwt r3) throws JwtInvalidException {
        if (this.expectedTypeHeader.isPresent() == false) goto L14;
        if (r3.hasTypeHeader() == false) goto L12;
        if (r3.getTypeHeader().equals(this.expectedTypeHeader.get()) == false) goto L10;
        return;
    L10:
        throw new JwtInvalidException(String.format("invalid JWT; expected type header %s, but got %s", new Object[]{this.expectedTypeHeader.get(), r3.getTypeHeader()}));
    L12:
        throw new JwtInvalidException(String.format("invalid JWT; missing expected type header %s.", new Object[]{this.expectedTypeHeader.get()}));
    L14:
        if (r3.hasTypeHeader() == true) goto L16;
        return;
    L16:
        if (this.ignoreTypeHeader == false) goto L19;
        return;
    L19:
        throw new JwtInvalidException("invalid JWT; token has type header set, but validator not.");
    }

    public String toString() {
        ArrayList r02 = new ArrayList();
        if (this.expectedTypeHeader.isPresent() == false) goto L6;
        r02.add("expectedTypeHeader=" + this.expectedTypeHeader.get());
    L6:
        if (this.ignoreTypeHeader == false) goto L9;
        r02.add("ignoreTypeHeader");
    L9:
        if (this.expectedIssuer.isPresent() == false) goto L12;
        r02.add("expectedIssuer=" + this.expectedIssuer.get());
    L12:
        if (this.ignoreIssuer == false) goto L15;
        r02.add("ignoreIssuer");
    L15:
        if (this.expectedAudience.isPresent() == false) goto L18;
        r02.add("expectedAudience=" + this.expectedAudience.get());
    L18:
        if (this.ignoreAudiences == false) goto L21;
        r02.add("ignoreAudiences");
    L21:
        if (this.allowMissingExpiration == false) goto L24;
        r02.add("allowMissingExpiration");
    L24:
        if (this.expectIssuedInThePast == false) goto L27;
        r02.add("expectIssuedInThePast");
    L27:
        if (this.clockSkew.isZero() == true) goto L29;
        r02.add("clockSkew=" + this.clockSkew);
    L29:
        StringBuilder r1 = new StringBuilder();
        r1.append("JwtValidator{");
        Iterator r03 = r02.iterator();
        String r2 = "";
    L31:
        if (r03.hasNext() == false) goto L33;
        String r3 = (String) r03.next();
        r1.append(r2);
        r1.append(r3);
        r2 = Constants.SEPARATOR_COMMA;
        goto L31
    L33:
        r1.append("}");
        return r1.toString();
    }

    public VerifiedJwt validate(RawJwt r2) throws JwtInvalidException {
        validateTimestampClaims(r2);
        validateTypeHeader(r2);
        validateIssuer(r2);
        validateAudiences(r2);
        return new VerifiedJwt(r2);
    }

    private JwtValidator(Builder r2) {
        this.expectedTypeHeader = Builder.access$000(r2);
        this.ignoreTypeHeader = Builder.access$100(r2);
        this.expectedIssuer = Builder.access$200(r2);
        this.ignoreIssuer = Builder.access$300(r2);
        this.expectedAudience = Builder.access$400(r2);
        this.ignoreAudiences = Builder.access$500(r2);
        this.allowMissingExpiration = Builder.access$600(r2);
        this.expectIssuedInThePast = Builder.access$700(r2);
        this.clock = Builder.access$800(r2);
        this.clockSkew = Builder.access$900(r2);
    }
}
