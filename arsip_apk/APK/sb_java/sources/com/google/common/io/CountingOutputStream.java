package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public final class CountingOutputStream extends FilterOutputStream implements AutoCloseable {
    private long count;

    public CountingOutputStream(OutputStream r1) {
        super((OutputStream) Preconditions.checkNotNull(r1));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.count;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws IOException {
        ((FilterOutputStream) this).out.write(r3, r4, r5);
        this.count += r5;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r5) throws IOException {
        ((FilterOutputStream) this).out.write(r5);
        this.count++;
    }
}
