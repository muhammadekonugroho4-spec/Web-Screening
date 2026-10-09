package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = null;

    static {
        DEST_TL = new AnonymousClass1();
    }

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
        return DEST_TL.get();
    }
}
