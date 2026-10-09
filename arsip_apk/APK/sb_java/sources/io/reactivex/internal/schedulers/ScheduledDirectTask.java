package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectTask(Runnable r1) {
        super(r1);
    }

    public Void b() {
        this.runner = Thread.currentThread();
        this.runnable.run();     // Catch: Throwable -> L6
        lazySet(AbstractDirectTask.f174555a);
        this.runner = null;
        return null;
    L6:
        th = move-exception;
        lazySet(AbstractDirectTask.f174555a);
        this.runner = null;
        throw th;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Void call() {
        return b();
    }
}
