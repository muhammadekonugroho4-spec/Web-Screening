package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes6.dex */
class LimitedConcurrencyExecutor implements Executor {
    private final Executor delegate;
    private final LinkedBlockingQueue<Runnable> queue;
    private final Semaphore semaphore;

    public LimitedConcurrencyExecutor(Executor r4, int r5) {
        this.queue = new LinkedBlockingQueue();
        if (r5 <= 0) goto L5;
        boolean r1 = true;
    L6:
        Preconditions.checkArgument(r1, "concurrency must be positive.");
        this.delegate = r4;
        this.semaphore = new Semaphore(r5, true);
        return;
    L5:
        r1 = false;
        goto L6
    }

    public static /* synthetic */ void c(LimitedConcurrencyExecutor r1, Runnable r2) {
        r1.getClass();
        r2.run();     // Catch: Throwable -> L6
        r1.semaphore.release();
        r1.maybeEnqueueNext();
        return;
    L6:
        th = move-exception;
        r1.semaphore.release();
        r1.maybeEnqueueNext();
        throw th;
    }

    private Runnable decorate(final Runnable r2) {
        return new v(this, r2);
    }

    private void maybeEnqueueNext() {
    L3:
        if (this.semaphore.tryAcquire() == false) goto L11;
        Runnable r02 = this.queue.poll();
        if (r02 == null) goto L7;
        this.delegate.execute(decorate(r02));
        goto L3
    L7:
        this.semaphore.release();
        return;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.queue.offer(r2);
        maybeEnqueueNext();
    }
}
