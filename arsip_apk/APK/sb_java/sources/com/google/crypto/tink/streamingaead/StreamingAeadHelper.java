package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes6.dex */
final class StreamingAeadHelper implements StreamingAead {
    private final List<StreamingAead> allPrimitives;
    private final StreamingAead primary;

    public StreamingAeadHelper(List<StreamingAead> r1, StreamingAead r2) throws GeneralSecurityException {
        this.allPrimitives = r1;
        this.primary = r2;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public ReadableByteChannel newDecryptingChannel(ReadableByteChannel r3, byte[] r4) throws GeneralSecurityException, IOException {
        return new ReadableByteChannelDecrypter(this.allPrimitives, r3, r4);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public InputStream newDecryptingStream(InputStream r3, byte[] r4) throws GeneralSecurityException, IOException {
        return new InputStreamDecrypter(this.allPrimitives, r3, r4);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public WritableByteChannel newEncryptingChannel(WritableByteChannel r2, byte[] r3) throws GeneralSecurityException, IOException {
        return this.primary.newEncryptingChannel(r2, r3);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public OutputStream newEncryptingStream(OutputStream r2, byte[] r3) throws GeneralSecurityException, IOException {
        return this.primary.newEncryptingStream(r2, r3);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel r3, byte[] r4) throws GeneralSecurityException, IOException {
        return new SeekableByteChannelDecrypter(this.allPrimitives, r3, r4);
    }
}
