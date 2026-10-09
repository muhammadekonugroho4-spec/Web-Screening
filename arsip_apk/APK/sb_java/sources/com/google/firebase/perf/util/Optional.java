package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class Optional<T> {
    private final T value;

    private Optional() {
        this.value = null;
    }

    public static <T> Optional<T> absent() {
        return new Optional();
    }

    public static <T> Optional<T> fromNullable(T r02) {
        if (r02 != null) goto L6;
        return absent();
    L6:
        return of(r02);
    }

    public static <T> Optional<T> of(T r1) {
        return new Optional(r1);
    }

    public T get() {
        T r02 = this.value;
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new NoSuchElementException("No value present");
    }

    public boolean isAvailable() {
        if (this.value == null) goto L6;
        return true;
    L6:
        return false;
    }

    private Optional(T r2) {
        if (r2 == null) goto L7;
        this.value = r2;
        return;
    L7:
        throw new NullPointerException("value for optional is empty.");
    }
}
