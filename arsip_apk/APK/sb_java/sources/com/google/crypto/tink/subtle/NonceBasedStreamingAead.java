package com.google.crypto.tink.subtle;

import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
abstract class NonceBasedStreamingAead implements StreamingAead {
    public NonceBasedStreamingAead() {
    }

    public abstract int getCiphertextOffset();

    public abstract int getCiphertextOverhead();

    public abstract int getCiphertextSegmentSize();

    public abstract int getHeaderLength();

    public abstract int getPlaintextSegmentSize();

    @Override // com.google.crypto.tink.StreamingAead
    public ReadableByteChannel newDecryptingChannel(ReadableByteChannel r2, byte[] r3) throws GeneralSecurityException, IOException {
        return new StreamingAeadDecryptingChannel(this, r2, r3);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public InputStream newDecryptingStream(InputStream r2, byte[] r3) throws GeneralSecurityException, IOException {
        return new StreamingAeadDecryptingStream(this, r2, r3);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public WritableByteChannel newEncryptingChannel(WritableByteChannel r2, byte[] r3) throws GeneralSecurityException, IOException {
        return new StreamingAeadEncryptingChannel(this, r2, r3);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public OutputStream newEncryptingStream(OutputStream r2, byte[] r3) throws GeneralSecurityException, IOException {
        return new StreamingAeadEncryptingStream(this, r2, r3);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel r2, byte[] r3) throws GeneralSecurityException, IOException {
        return new StreamingAeadSeekableDecryptingChannel(this, r2, r3);
    }

    public abstract StreamSegmentDecrypter newStreamSegmentDecrypter() throws GeneralSecurityException;

    public abstract StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] r1) throws GeneralSecurityException;
}
