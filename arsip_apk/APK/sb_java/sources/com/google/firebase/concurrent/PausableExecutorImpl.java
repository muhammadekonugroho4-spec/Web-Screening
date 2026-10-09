package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes6.dex */
final class PausableExecutorImpl implements PausableExecutor {
    private final Executor delegate;
    private volatile boolean paused;
    final LinkedBlockingQueue<Runnable> queue;

    public PausableExecutorImpl(boolean r2, Executor r3) {
        this.queue = new LinkedBlockingQueue();
        this.paused = r2;
        this.delegate = r3;
    }

    private void maybeEnqueueNext() {
        if (this.paused == true) goto L11;
        Runnable r02 = this.queue.poll();
    L6:
        if (r02 == null) goto L18;
        this.delegate.execute(r02);
        if (this.paused == false) goto L9;
        r02 = null;
        goto L6
    L9:
        r02 = this.queue.poll();
        goto L6
    L18:
        return;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.queue.offer(r2);
        maybeEnqueueNext();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.paused;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.paused = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.paused = false;
        maybeEnqueueNext();
    }
}
