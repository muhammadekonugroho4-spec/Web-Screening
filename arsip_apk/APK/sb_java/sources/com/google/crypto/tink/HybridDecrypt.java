package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface HybridDecrypt {
    byte[] decrypt(byte[] r1, byte[] r2) throws GeneralSecurityException;
}
