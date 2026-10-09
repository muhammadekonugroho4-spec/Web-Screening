package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedExecutionException() {
    }

    public UncheckedExecutionException(String r1) {
        super(r1);
    }

    public UncheckedExecutionException(String r1, Throwable r2) {
        super(r1, r2);
    }

    public UncheckedExecutionException(Throwable r1) {
        super(r1);
    }
}
