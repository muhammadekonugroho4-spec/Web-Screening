package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes6.dex */
public interface Prf {
    byte[] compute(byte[] r1, int r2) throws GeneralSecurityException;
}
