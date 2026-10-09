package coil.decode;

import com.google.common.primitives.Ints;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class g extends InputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f29917a;

    /* renamed from: b, reason: collision with root package name */
    public int f29918b;

    public g(InputStream r1) {
        this.f29917a = r1;
        this.f29918b = Ints.MAX_POWER_OF_TWO;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f29918b;
    }

    public final int c(int r2) {
        if (r2 != (-1)) goto L5;
        this.f29918b = 0;
    L5:
        return r2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29917a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return c(this.f29917a.read());
    }

    @Override // java.io.InputStream
    public long skip(long r2) {
        return this.f29917a.skip(r2);
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) {
        return c(this.f29917a.read(r2));
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
        return c(this.f29917a.read(r2, r3, r4));
    }
}
