package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes6.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    private static final Provider<Object> EMPTY_PROVIDER = null;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = null;
    private volatile Provider<T> delegate;
    private Deferred.DeferredHandler<T> handler;

    static {
        NOOP_HANDLER = new o();
        EMPTY_PROVIDER = new p();
    }

    private OptionalProvider(Deferred.DeferredHandler<T> r1, Provider<T> r2) {
        this.handler = r1;
        this.delegate = r2;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(Deferred.DeferredHandler r02, Deferred.DeferredHandler r1, Provider r2) {
        r02.handle(r2);
        r1.handle(r2);
    }

    public static /* synthetic */ void c(Provider r02) {
    }

    public static <T> OptionalProvider<T> empty() {
        return new OptionalProvider(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    public static <T> OptionalProvider<T> of(Provider<T> r2) {
        return new OptionalProvider(null, r2);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    public void set(Provider<T> r3) {
        if (this.delegate != EMPTY_PROVIDER) goto L13;
        monitor-enter(this);
        Deferred.DeferredHandler<T> r02 = this.handler;     // Catch: Throwable -> L9
        this.handler = null;     // Catch: Throwable -> L9
        this.delegate = r3;     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L9
        r02.handle(r3);
        return;
    L9:
        th = move-exception;
        throw th;
    L13:
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(final Deferred.DeferredHandler<T> r4) {
        Provider<T> r02 = this.delegate;
        Provider<Object> r1 = EMPTY_PROVIDER;
        if (r02 == r1) goto L6;
        r4.handle(r02);
        return;
    L6:
        monitor-enter(this);
        Provider<T> r03 = this.delegate;     // Catch: Throwable -> L15
        if (r03 == r1) goto L10;
        Provider<T> r12 = r03;
    L11:
        monitor-exit(this);     // Catch: Throwable -> L15
        if (r12 == null) goto L20;
        r4.handle(r03);
        return;
    L20:
        return;
    L10:
        final Deferred.DeferredHandler<T> r13 = this.handler;     // Catch: Throwable -> L15
        this.handler = new q(r13, r4);     // Catch: Throwable -> L15
        r12 = null;
    L15:
        th = move-exception;
        throw th;
    }
}
