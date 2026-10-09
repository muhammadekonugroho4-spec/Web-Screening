package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    public ReferenceDisposable(Object r2) {
        super(io.reactivex.internal.functions.b.d(r2, "value is null"));
    }

    public final boolean a() {
        if (get() != null) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract void b(Object r1);

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (get() == null) goto L8;
        T r02 = getAndSet(null);
        if (r02 == null) goto L9;
        b(r02);
        return;
    L9:
        return;
    }
}
