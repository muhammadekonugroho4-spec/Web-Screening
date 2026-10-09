package com.google.crypto.tink.hybrid.internal;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes6.dex */
interface HpkeAead {
    byte[] getAeadId() throws GeneralSecurityException;

    int getKeyLength();

    int getNonceLength();

    byte[] open(byte[] r1, byte[] r2, byte[] r3, byte[] r4) throws GeneralSecurityException;

    byte[] seal(byte[] r1, byte[] r2, byte[] r3, byte[] r4) throws GeneralSecurityException;
}
