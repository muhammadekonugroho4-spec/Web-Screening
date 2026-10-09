package com.google.common.eventbus;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface SubscriberExceptionHandler {
    void handleException(Throwable r1, SubscriberExceptionContext r2);
}
