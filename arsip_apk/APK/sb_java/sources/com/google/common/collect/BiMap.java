package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface BiMap<K, V> extends Map<K, V> {
    @CanIgnoreReturnValue
    V forcePut(@ParametricNullness K r1, @ParametricNullness V r2);

    BiMap<V, K> inverse();

    @CanIgnoreReturnValue
    V put(@ParametricNullness K r1, @ParametricNullness V r2);

    void putAll(Map<? extends K, ? extends V> r1);

    /* bridge */ /* synthetic */ default Collection values() {
        return values();
    }

    @Override // java.util.Map
    Set<V> values();
}
