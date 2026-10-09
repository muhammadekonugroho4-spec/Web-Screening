package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes5.dex */
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable r02, Class<? extends Throwable> r1) {
        return r1.isInstance(r02);
    }
}
