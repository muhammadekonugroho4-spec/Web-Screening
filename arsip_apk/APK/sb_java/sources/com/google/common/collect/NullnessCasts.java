package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T r02) {
        return r02;
    }

    @ParametricNullness
    public static <T> T unsafeNull() {
        return null;
    }
}
