package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface Predicate<T> {
    @CanIgnoreReturnValue
    boolean apply(@ParametricNullness T r1);

    boolean equals(Object r1);
}
