package com.koushikdutta.async;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* loaded from: classes6.dex */
public class A extends p {

    /* renamed from: b, reason: collision with root package name */
    public SocketChannel f41194b;

    public A(SocketChannel r1) {
        super(r1);
        this.f41194b = r1;
    }

    @Override // com.koushikdutta.async.p
    public boolean f() {
        return this.f41194b.isConnected();
    }

    @Override // com.koushikdutta.async.p
    public void i() {
        this.f41194b.socket().shutdownOutput();     // Catch: Exception -> L4
        return;
    }

    @Override // com.koushikdutta.async.p
    public int k(ByteBuffer[] r3) {
        return (int) this.f41194b.write(r3);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer r2) {
        return this.f41194b.read(r2);
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] r3) {
        return this.f41194b.read(r3);
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] r2, int r3, int r4) {
        return this.f41194b.read(r2, r3, r4);
    }
}
