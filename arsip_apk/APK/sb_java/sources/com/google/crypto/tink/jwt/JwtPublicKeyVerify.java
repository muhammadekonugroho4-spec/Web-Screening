package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes6.dex */
public interface JwtPublicKeyVerify {
    VerifiedJwt verifyAndDecode(String r1, JwtValidator r2) throws GeneralSecurityException;
}
