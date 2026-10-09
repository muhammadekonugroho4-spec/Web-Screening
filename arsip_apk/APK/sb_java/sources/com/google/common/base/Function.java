package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface Function<F, T> {
    @CanIgnoreReturnValue
    @ParametricNullness
    T apply(@ParametricNullness F r1);

    boolean equals(Object r1);
}
