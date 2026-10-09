package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface Mac {
    byte[] computeMac(byte[] r1) throws GeneralSecurityException;

    void verifyMac(byte[] r1, byte[] r2) throws GeneralSecurityException;
}
