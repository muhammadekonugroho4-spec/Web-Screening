package com.google.crypto.tink.internal;

/* loaded from: classes6.dex */
public final class TinkBugException extends RuntimeException {

    public interface ThrowingRunnable {
        void run() throws Exception;
    }

    public interface ThrowingSupplier<T> {
        T get() throws Exception;
    }

    public TinkBugException(String r1) {
        super(r1);
    }

    public static <T> T exceptionIsBug(ThrowingSupplier<T> r1) {
        return r1.get();
    L4:
        e = move-exception;
        throw new TinkBugException(e);
    }

    public TinkBugException(String r1, Throwable r2) {
        super(r1, r2);
    }

    public TinkBugException(Throwable r1) {
        super(r1);
    }

    public static void exceptionIsBug(ThrowingRunnable r1) {
        r1.run();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        throw new TinkBugException(e);
    }
}
