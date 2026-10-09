package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements io.reactivex.disposables.b {

    /* renamed from: a, reason: collision with root package name */
    public static final FutureTask f174555a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final FutureTask f174556b = null;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        Runnable r1 = io.reactivex.internal.functions.a.f174471b;
        f174555a = new FutureTask(r1, null);
        f174556b = new FutureTask(r1, null);
    }

    public AbstractDirectTask(Runnable r1) {
        this.runnable = r1;
    }

    public final void a(Future r3) {
    L2:
        Future<?> r02 = get();
        if (r02 == f174555a) goto L15;
        if (r02 == f174556b) goto L8;
        if (compareAndSet(r02, r3) == false) goto L2;
        return;
    L8:
        if (this.runner == Thread.currentThread()) goto L10;
        boolean r03 = true;
    L11:
        r3.cancel(r03);
        return;
    L10:
        r03 = false;
        goto L11
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        Future<?> r02 = get();
        if (r02 == f174555a) goto L15;
        FutureTask r1 = f174556b;
        if (r02 != r1) goto L7;
        return;
    L7:
        if (compareAndSet(r02, r1) == false) goto L17;
        if (r02 != null) goto L10;
        return;
    L10:
        if (this.runner == Thread.currentThread()) goto L12;
        boolean r12 = true;
    L13:
        r02.cancel(r12);
        return;
    L12:
        r12 = false;
        goto L13
    L17:
        return;
    }
}
