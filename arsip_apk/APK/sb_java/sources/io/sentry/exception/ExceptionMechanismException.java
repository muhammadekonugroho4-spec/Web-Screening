package io.sentry.exception;

import io.sentry.protocol.k;
import io.sentry.util.v;

/* loaded from: classes3.dex */
public final class ExceptionMechanismException extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;
    private final k exceptionMechanism;
    private final boolean snapshot;
    private final Thread thread;
    private final Throwable throwable;

    public ExceptionMechanismException(k r2, Throwable r3, Thread r4, boolean r5) {
        this.exceptionMechanism = (k) v.c(r2, "Mechanism is required.");
        this.throwable = (Throwable) v.c(r3, "Throwable is required.");
        this.thread = (Thread) v.c(r4, "Thread is required.");
        this.snapshot = r5;
    }

    public k a() {
        return this.exceptionMechanism;
    }

    public Thread b() {
        return this.thread;
    }

    public Throwable c() {
        return this.throwable;
    }

    public boolean d() {
        return this.snapshot;
    }

    public ExceptionMechanismException(k r2, Throwable r3, Thread r4) {
        this(r2, r3, r4, false);
    }
}
