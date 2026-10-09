package com.google.crypto.tink.util;

import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.MessageDigest;

@Immutable
@Alpha
/* loaded from: classes6.dex */
public final class SecretBigInteger {
    private final BigInteger value;

    private SecretBigInteger(BigInteger r1) {
        this.value = r1;
    }

    public static SecretBigInteger fromBigInteger(BigInteger r02, SecretKeyAccess r1) {
        if (r1 == null) goto L6;
        return new SecretBigInteger(r02);
    L6:
        throw new NullPointerException("SecretKeyAccess required");
    }

    public boolean equalsSecretBigInteger(SecretBigInteger r2) {
        return MessageDigest.isEqual(this.value.toByteArray(), r2.value.toByteArray());
    }

    public BigInteger getBigInteger(SecretKeyAccess r2) {
        if (r2 == null) goto L6;
        return this.value;
    L6:
        throw new NullPointerException("SecretKeyAccess required");
    }
}
