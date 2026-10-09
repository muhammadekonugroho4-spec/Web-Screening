package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;

@GwtCompatible(emulated = true)
/* loaded from: classes5.dex */
abstract class LinkedHashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    public LinkedHashMultimapGwtSerializationDependencies(Map<K, Collection<V>> r1) {
        super(r1);
    }
}
