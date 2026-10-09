package com.google.common.collect;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        boolean equals(Object r1);

        @ParametricNullness
        C getColumnKey();

        @ParametricNullness
        R getRowKey();

        @ParametricNullness
        V getValue();

        int hashCode();
    }

    Set<Cell<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@ParametricNullness C r1);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@CompatibleWith("R") Object r1, @CompatibleWith("C") Object r2);

    boolean containsColumn(@CompatibleWith("C") Object r1);

    boolean containsRow(@CompatibleWith("R") Object r1);

    boolean containsValue(@CompatibleWith(ExifInterface.GpsStatus.INTEROPERABILITY) Object r1);

    boolean equals(Object r1);

    V get(@CompatibleWith("R") Object r1, @CompatibleWith("C") Object r2);

    int hashCode();

    boolean isEmpty();

    @CanIgnoreReturnValue
    V put(@ParametricNullness R r1, @ParametricNullness C r2, @ParametricNullness V r3);

    void putAll(Table<? extends R, ? extends C, ? extends V> r1);

    @CanIgnoreReturnValue
    V remove(@CompatibleWith("R") Object r1, @CompatibleWith("C") Object r2);

    Map<C, V> row(@ParametricNullness R r1);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
