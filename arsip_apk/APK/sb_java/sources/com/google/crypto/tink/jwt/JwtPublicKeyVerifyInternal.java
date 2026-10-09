package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Optional;

@Immutable
/* loaded from: classes6.dex */
public interface JwtPublicKeyVerifyInternal {
    VerifiedJwt verifyAndDecodeWithKid(String r1, JwtValidator r2, Optional<String> r3) throws GeneralSecurityException;
}
