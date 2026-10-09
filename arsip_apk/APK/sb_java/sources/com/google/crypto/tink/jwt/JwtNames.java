package com.google.crypto.tink.jwt;

/* loaded from: classes6.dex */
final class JwtNames {
    static final String CLAIM_AUDIENCE = "aud";
    static final String CLAIM_EXPIRATION = "exp";
    static final String CLAIM_ISSUED_AT = "iat";
    static final String CLAIM_ISSUER = "iss";
    static final String CLAIM_JWT_ID = "jti";
    static final String CLAIM_NOT_BEFORE = "nbf";
    static final String CLAIM_SUBJECT = "sub";
    static final String HEADER_ALGORITHM = "alg";
    static final String HEADER_CRITICAL = "crit";
    static final String HEADER_KEY_ID = "kid";
    static final String HEADER_TYPE = "typ";

    private JwtNames() {
    }

    public static boolean isRegisteredName(String r1) {
        if (r1.equals(CLAIM_ISSUER) == false) goto L5;
        return true;
    L5:
        if (r1.equals(CLAIM_SUBJECT) == false) goto L7;
        return true;
    L7:
        if (r1.equals(CLAIM_AUDIENCE) == false) goto L9;
        return true;
    L9:
        if (r1.equals(CLAIM_EXPIRATION) == false) goto L11;
        return true;
    L11:
        if (r1.equals(CLAIM_NOT_BEFORE) == false) goto L13;
        return true;
    L13:
        if (r1.equals(CLAIM_ISSUED_AT) == false) goto L15;
        return true;
    L15:
        if (r1.equals(CLAIM_JWT_ID) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public static void validate(String r2) {
        if (isRegisteredName(r2) == true) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(String.format("claim '%s' is invalid because it's a registered name; use the corresponding setter method.", new Object[]{r2}));
    }
}
