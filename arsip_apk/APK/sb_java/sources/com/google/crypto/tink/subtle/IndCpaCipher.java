package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface IndCpaCipher {
    byte[] decrypt(byte[] r1) throws GeneralSecurityException;

    byte[] encrypt(byte[] r1) throws GeneralSecurityException;
}
