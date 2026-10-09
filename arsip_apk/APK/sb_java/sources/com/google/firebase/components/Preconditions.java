package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes6.dex */
public final class Preconditions {
    public Preconditions() {
    }

    public static void checkArgument(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r1);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02) {
        r02.getClass();
        return r02;
    }

    public static void checkState(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(r1);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }
}
