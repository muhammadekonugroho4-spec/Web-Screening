package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s0 extends I {
    public final AtomicBoolean d;

    public s0(W r2) {
        super(r2);
        this.d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.I, androidx.camera.core.W, java.lang.AutoCloseable
    public void close() {
        if (this.d.getAndSet(true) == true) goto L6;
        super.close();
        return;
    }
}
