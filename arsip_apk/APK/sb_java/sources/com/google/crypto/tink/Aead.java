package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface Aead {
    byte[] decrypt(byte[] r1, byte[] r2) throws GeneralSecurityException;

    byte[] encrypt(byte[] r1, byte[] r2) throws GeneralSecurityException;
}
