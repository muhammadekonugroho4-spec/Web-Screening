package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements c {
    private static final long serialVersionUID = -6671519529404341862L;

    public BasicIntQueueSubscription() {
    }

    @Override // io.reactivex.internal.fuseable.e
    public final boolean offer(Object r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
