package com.koushikdutta.async;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

/* loaded from: classes6.dex */
public abstract class p implements ReadableByteChannel, ScatteringByteChannel, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public AbstractSelectableChannel f41602a;

    public p(AbstractSelectableChannel r2) {
        r2.configureBlocking(false);
        this.f41602a = r2;
    }

    public boolean c() {
        return false;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41602a.close();
    }

    public abstract boolean f();

    public abstract void i();

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f41602a.isOpen();
    }

    public abstract int k(ByteBuffer[] r1);
}
