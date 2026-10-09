package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public final class UncaughtExceptionHandlers {

    @VisibleForTesting
    public static final class Exiter implements Thread.UncaughtExceptionHandler {
        private static final Logger logger = null;
        private final Runtime runtime;

        static {
            logger = Logger.getLogger(Exiter.class.getName());
        }

        public Exiter(Runtime r1) {
            this.runtime = r1;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread r6, Throwable r7) {
            logger.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", new Object[]{r6}), r7);     // Catch: Throwable -> L6
            this.runtime.exit(1);
            return;
        L6:
            th = move-exception;
            System.err.println(r7.getMessage());     // Catch: Throwable -> L10
            System.err.println(th.getMessage());     // Catch: Throwable -> L10
            this.runtime.exit(1);
            return;
        L10:
            th = move-exception;
            this.runtime.exit(1);
            throw th;
        }
    }

    private UncaughtExceptionHandlers() {
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new Exiter(Runtime.getRuntime());
    }
}
