package com.google.zxing;

/* loaded from: classes6.dex */
public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] NO_TRACE = null;
    protected static final boolean isStackTrace = false;

    static {
        if (System.getProperty("surefire.test.class.path") == null) goto L5;
        boolean r02 = true;
    L6:
        isStackTrace = r02;
        NO_TRACE = new StackTraceElement[0];
        return;
    L5:
        r02 = false;
        goto L6
    }

    public ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        monitor-enter(this);
        monitor-exit(this);
        return null;
    }

    public ReaderException(Throwable r1) {
        super(r1);
    }
}
