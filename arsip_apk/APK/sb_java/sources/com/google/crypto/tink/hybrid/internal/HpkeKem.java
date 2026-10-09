package com.google.crypto.tink.hybrid.internal;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes6.dex */
interface HpkeKem {
    byte[] decapsulate(byte[] r1, HpkeKemPrivateKey r2) throws GeneralSecurityException;

    HpkeKemEncapOutput encapsulate(byte[] r1) throws GeneralSecurityException;

    byte[] getKemId() throws GeneralSecurityException;
}
