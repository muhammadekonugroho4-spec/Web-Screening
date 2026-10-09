package okio;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface H extends Closeable, Flushable, AutoCloseable {
    void V0(C12043e r1, long r2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    J d();

    void flush();
}
