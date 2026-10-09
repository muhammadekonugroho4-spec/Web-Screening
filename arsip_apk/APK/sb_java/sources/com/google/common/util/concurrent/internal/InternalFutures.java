package com.google.common.util.concurrent.internal;

/* loaded from: classes5.dex */
public final class InternalFutures {
    private InternalFutures() {
    }

    public static Throwable tryInternalFastPathGetFailure(InternalFutureFailureAccess r02) {
        return r02.tryInternalFastPathGetFailure();
    }
}
