package com.google.common.collect;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        boolean equals(Object r1);

        int getCount();

        @ParametricNullness
        E getElement();

        int hashCode();

        String toString();
    }

    @CanIgnoreReturnValue
    int add(@ParametricNullness E r1, int r2);

    @CanIgnoreReturnValue
    boolean add(@ParametricNullness E r1);

    boolean contains(Object r1);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> r1);

    int count(@CompatibleWith(ExifInterface.GpsLongitudeRef.EAST) Object r1);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(Object r1);

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    int remove(@CompatibleWith(ExifInterface.GpsLongitudeRef.EAST) Object r1, int r2);

    @CanIgnoreReturnValue
    boolean remove(Object r1);

    @CanIgnoreReturnValue
    boolean removeAll(Collection<?> r1);

    @CanIgnoreReturnValue
    boolean retainAll(Collection<?> r1);

    @CanIgnoreReturnValue
    int setCount(@ParametricNullness E r1, int r2);

    @CanIgnoreReturnValue
    boolean setCount(@ParametricNullness E r1, int r2, int r3);

    int size();

    String toString();
}
