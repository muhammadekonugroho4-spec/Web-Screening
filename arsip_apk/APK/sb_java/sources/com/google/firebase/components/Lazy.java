package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes6.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = null;
    private volatile Object instance;
    private volatile Provider<T> provider;

    static {
        UNINITIALIZED = new Object();
    }

    public Lazy(T r2) {
        this.instance = UNINITIALIZED;
        this.instance = r2;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T r02 = (T) this.instance;
        Object r1 = UNINITIALIZED;
        if (r02 != r1) goto L14;
        monitor-enter(this);
        T r03 = (T) this.instance;
        if (r03 != r1) goto L10;
        r03 = this.provider.get();     // Catch: Throwable -> L8
        this.instance = r03;     // Catch: Throwable -> L8
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

    public boolean isInitialized() {
        if (this.instance == UNINITIALIZED) goto L6;
        return true;
    L6:
        return false;
    }

    public Lazy(Provider<T> r2) {
        this.instance = UNINITIALIZED;
        this.provider = r2;
    }
}
