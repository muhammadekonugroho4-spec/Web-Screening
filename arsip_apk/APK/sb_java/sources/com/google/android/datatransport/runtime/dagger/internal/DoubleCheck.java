package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.a;

/* loaded from: classes4.dex */
public final class DoubleCheck<T> implements a, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = null;
    private volatile Object instance;
    private volatile a provider;

    static {
        UNINITIALIZED = new Object();
    }

    private DoubleCheck(a r2) {
        this.instance = UNINITIALIZED;
        this.provider = r2;
    }

    public static <P extends a, T> Lazy<T> lazy(P r1) {
        if ((r1 instanceof Lazy) == false) goto L7;
        return (Lazy) r1;
    L7:
        return new DoubleCheck((a) Preconditions.checkNotNull(r1));
    }

    public static <P extends a, T> a provider(P r1) {
        Preconditions.checkNotNull(r1);
        if ((r1 instanceof DoubleCheck) == false) goto L6;
        return r1;
    L6:
        return new DoubleCheck(r1);
    }

    private static Object reentrantCheck(Object r3, Object r4) {
        if (r3 == UNINITIALIZED) goto L8;
        if (r3 != r4) goto L7;
        return r4;
    L7:
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + r3 + " & " + r4 + ". This is likely due to a circular dependency.");
    L8:
        return r4;
    }

    @Override // javax.inject.a
    public T get() {
        T r02 = (T) this.instance;
        Object r1 = UNINITIALIZED;
        if (r02 != r1) goto L14;
        monitor-enter(this);
        T r03 = (T) this.instance;
        if (r03 != r1) goto L10;
        r03 = (T) this.provider.get();
        this.instance = reentrantCheck(this.instance, r03);     // Catch: Throwable -> L8
        this.provider = null;     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
        return r03;
    L8:
        th = move-exception;
        throw th;
    L14:
        return r02;
    }
}
