package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public final class Runnables {
    private static final Runnable EMPTY_RUNNABLE = null;

    static {
        EMPTY_RUNNABLE = new AnonymousClass1();
    }

    private Runnables() {
    }

    public static Runnable doNothing() {
        return EMPTY_RUNNABLE;
    }
}
