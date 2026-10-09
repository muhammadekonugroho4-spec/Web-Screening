package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public final class Atomics {
    private Atomics() {
    }

    public static <V> AtomicReference<V> newReference() {
        return new AtomicReference();
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(int r1) {
        return new AtomicReferenceArray(r1);
    }

    public static <V> AtomicReference<V> newReference(@ParametricNullness V r1) {
        return new AtomicReference(r1);
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(E[] r1) {
        return new AtomicReferenceArray(r1);
    }
}
