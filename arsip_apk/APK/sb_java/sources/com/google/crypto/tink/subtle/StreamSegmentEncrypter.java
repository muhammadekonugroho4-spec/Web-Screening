package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(ByteBuffer r1, ByteBuffer r2, boolean r3, ByteBuffer r4) throws GeneralSecurityException;

    void encryptSegment(ByteBuffer r1, boolean r2, ByteBuffer r3) throws GeneralSecurityException;

    ByteBuffer getHeader();
}
