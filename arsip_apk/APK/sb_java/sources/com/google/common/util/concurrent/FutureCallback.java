package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable r1);

    void onSuccess(@ParametricNullness V r1);
}
