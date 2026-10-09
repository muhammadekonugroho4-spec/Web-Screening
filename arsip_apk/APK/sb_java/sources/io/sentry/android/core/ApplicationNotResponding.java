package io.sentry.android.core;

/* loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;
    private final Thread thread;

    public ApplicationNotResponding(String r1, Thread r2) {
        super(r1);
        Thread r12 = (Thread) io.sentry.util.v.c(r2, "Thread must be provided.");
        this.thread = r12;
        setStackTrace(r12.getStackTrace());
    }

    public Thread a() {
        return this.thread;
    }
}
