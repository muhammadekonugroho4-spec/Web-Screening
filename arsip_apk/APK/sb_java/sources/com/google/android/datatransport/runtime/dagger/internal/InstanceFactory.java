package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: classes4.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = null;
    private final T instance;

    static {
        NULL_INSTANCE_FACTORY = new InstanceFactory(null);
    }

    private InstanceFactory(T r1) {
        this.instance = r1;
    }

    public static <T> Factory<T> create(T r2) {
        return new InstanceFactory(Preconditions.checkNotNull(r2, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T r1) {
        if (r1 != null) goto L6;
        return nullInstanceFactory();
    L6:
        return new InstanceFactory(r1);
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
        return (InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.a
    public T get() {
        return this.instance;
    }
}
