package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public class ExecutionError extends Error {
    private static final long serialVersionUID = 0;

    public ExecutionError() {
    }

    public ExecutionError(String r1) {
        super(r1);
    }

    public ExecutionError(String r1, Error r2) {
        super(r1, r2);
    }

    public ExecutionError(Error r1) {
        super(r1);
    }
}
