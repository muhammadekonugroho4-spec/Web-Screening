package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface ChunkedMacVerification {
    void update(ByteBuffer r1) throws GeneralSecurityException;

    void verifyMac() throws GeneralSecurityException;
}
