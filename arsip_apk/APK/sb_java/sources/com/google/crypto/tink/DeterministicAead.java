package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface DeterministicAead {
    byte[] decryptDeterministically(byte[] r1, byte[] r2) throws GeneralSecurityException;

    byte[] encryptDeterministically(byte[] r1, byte[] r2) throws GeneralSecurityException;
}
