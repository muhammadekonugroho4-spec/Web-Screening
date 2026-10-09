package com.stockbit.emittenclassification.ui;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class k implements Comparator {
    public k() {
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        return kotlin.comparisons.b.d((Comparable) ((Pair) r2).f(), (Comparable) ((Pair) r1).f());
    }
}
