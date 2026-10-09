package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface RowSortedTable<R, C, V> extends Table<R, C, V> {
    @Override // com.google.common.collect.Table
    /* bridge */ /* synthetic */ default Set rowKeySet() {
        return rowKeySet();
    }

    @Override // com.google.common.collect.Table
    SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.Table
    /* bridge */ /* synthetic */ default Map rowMap() {
        return rowMap();
    }

    @Override // com.google.common.collect.Table
    SortedMap<R, Map<C, V>> rowMap();
}
