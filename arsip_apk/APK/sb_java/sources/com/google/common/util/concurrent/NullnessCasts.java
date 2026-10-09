package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T r02) {
        return r02;
    }

    @ParametricNullness
    public static <T> T uncheckedNull() {
        return null;
    }
}
