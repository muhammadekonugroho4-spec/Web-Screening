package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(ByteBuffer r1, int r2, boolean r3, ByteBuffer r4) throws GeneralSecurityException;

    void init(ByteBuffer r1, byte[] r2) throws GeneralSecurityException;
}
