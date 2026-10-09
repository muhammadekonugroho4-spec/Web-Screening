package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public interface Weigher<K, V> {
    int weigh(K r1, V r2);
}
