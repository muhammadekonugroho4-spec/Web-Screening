package com.google.crypto.tink;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface StreamingAead {
    ReadableByteChannel newDecryptingChannel(ReadableByteChannel r1, byte[] r2) throws GeneralSecurityException, IOException;

    InputStream newDecryptingStream(InputStream r1, byte[] r2) throws GeneralSecurityException, IOException;

    WritableByteChannel newEncryptingChannel(WritableByteChannel r1, byte[] r2) throws GeneralSecurityException, IOException;

    OutputStream newEncryptingStream(OutputStream r1, byte[] r2) throws GeneralSecurityException, IOException;

    SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel r1, byte[] r2) throws GeneralSecurityException, IOException;
}
