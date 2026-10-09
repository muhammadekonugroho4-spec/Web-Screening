package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer r02) {
        r02.clear();
    }

    public static void flip(Buffer r02) {
        r02.flip();
    }

    public static void limit(Buffer r02, int r1) {
        r02.limit(r1);
    }

    public static void position(Buffer r02, int r1) {
        r02.position(r1);
    }
}
