package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] r1) throws GeneralSecurityException;

    byte[] wrap(byte[] r1) throws GeneralSecurityException;
}
