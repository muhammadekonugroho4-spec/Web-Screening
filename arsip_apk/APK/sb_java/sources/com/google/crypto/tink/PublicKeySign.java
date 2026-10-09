package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface PublicKeySign {
    byte[] sign(byte[] r1) throws GeneralSecurityException;
}
