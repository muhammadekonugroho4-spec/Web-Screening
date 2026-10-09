package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
@CheckReturnValue
@Alpha
/* loaded from: classes6.dex */
public final class SecretKeyAccess {
    private static final SecretKeyAccess INSTANCE = null;

    static {
        INSTANCE = new SecretKeyAccess();
    }

    private SecretKeyAccess() {
    }

    public static SecretKeyAccess instance() {
        return INSTANCE;
    }

    @CanIgnoreReturnValue
    public static SecretKeyAccess requireAccess(SecretKeyAccess r1) throws GeneralSecurityException {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
