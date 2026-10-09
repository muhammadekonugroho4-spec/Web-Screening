package com.google.crypto.tink.hybrid.internal;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes6.dex */
interface HpkeKdf {
    byte[] extractAndExpand(byte[] r1, byte[] r2, String r3, byte[] r4, String r5, byte[] r6, int r7) throws GeneralSecurityException;

    byte[] getKdfId() throws GeneralSecurityException;

    byte[] labeledExpand(byte[] r1, byte[] r2, String r3, byte[] r4, int r5) throws GeneralSecurityException;

    byte[] labeledExtract(byte[] r1, byte[] r2, String r3, byte[] r4) throws GeneralSecurityException;
}
