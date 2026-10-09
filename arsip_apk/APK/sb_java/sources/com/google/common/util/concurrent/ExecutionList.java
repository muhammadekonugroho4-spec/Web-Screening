package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public final class ExecutionList {
    private static final Logger log = null;

    @GuardedBy("this")
    private boolean executed;

    @GuardedBy("this")
    private RunnableExecutorPair runnables;

    public static final class RunnableExecutorPair {
        final Executor executor;
        RunnableExecutorPair next;
        final Runnable runnable;

        public RunnableExecutorPair(Runnable r1, Executor r2, RunnableExecutorPair r3) {
            this.runnable = r1;
            this.executor = r2;
            this.next = r3;
        }
    }

    static {
        log = Logger.getLogger(ExecutionList.class.getName());
    }

    public ExecutionList() {
    }

    private static void executeListener(Runnable r5, Executor r6) {
        r6.execute(r5);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        Logger r1 = log;
        Level r2 = Level.SEVERE;
        String r52 = String.valueOf(r5);
        String r62 = String.valueOf(r6);
        StringBuilder r4 = new StringBuilder((r52.length() + 57) + r62.length());
        r4.append("RuntimeException while executing runnable ");
        r4.append(r52);
        r4.append(" with executor ");
        r4.append(r62);
        r1.log(r2, r4.toString(), e);
    }

    public void add(Runnable r3, Executor r4) {
        Preconditions.checkNotNull(r3, "Runnable was null.");
        Preconditions.checkNotNull(r4, "Executor was null.");
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.executed == true) goto L11;
        this.runnables = new RunnableExecutorPair(r3, r4, this.runnables);     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L9
        return;
    L11:
        monitor-exit(this);     // Catch: Throwable -> L9
        executeListener(r3, r4);
    }

    public void execute() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.executed == false) goto L9;
        monitor-exit(this);     // Catch: Throwable -> L7
        return;
    L9:
        this.executed = true;     // Catch: Throwable -> L7
        RunnableExecutorPair r02 = this.runnables;     // Catch: Throwable -> L7
        RunnableExecutorPair r1 = null;
        this.runnables = null;     // Catch: Throwable -> L7
        monitor-exit(this);     // Catch: Throwable -> L7
    L11:
        if (r02 == null) goto L13;
        RunnableExecutorPair r2 = r02.next;
        r02.next = r1;
        r1 = r02;
        r02 = r2;
    L13:
        if (r1 == null) goto L15;
        executeListener(r1.runnable, r1.executor);
        r1 = r1.next;
        goto L13
    }
}
