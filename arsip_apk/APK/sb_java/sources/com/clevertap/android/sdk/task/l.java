package com.clevertap.android.sdk.task;

import androidx.activity.T;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class l implements ExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public long f34912a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f34913b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f34914a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f34915b;

        public a(l r1, Runnable r2) {
            this.f34915b = r1;
            this.f34914a = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.c(this.f34915b, Thread.currentThread().getId());
            this.f34914a.run();
        }
    }

    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f34916a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f34917b;

        public b(l r1, Callable r2) {
            this.f34917b = r1;
            this.f34916a = r2;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            l.c(this.f34917b, Thread.currentThread().getId());
            return this.f34916a.call();
        }
    }

    public l() {
        this.f34912a = 0;
        this.f34913b = Executors.newSingleThreadExecutor();
    }

    public static /* synthetic */ long c(l r02, long r1) {
        r02.f34912a = r1;
        return r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, TimeUnit r4) {
        return this.f34913b.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r5) {
        if (r5 == null) goto L10;
        if (Thread.currentThread().getId() != this.f34912a) goto L7;
        r5.run();
        return;
    L7:
        this.f34913b.execute(new a(this, r5));
        return;
    L10:
        throw new NullPointerException("PostAsyncSafelyExecutor#execute: task can't ne null");
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection r2) {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection r2) {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f34913b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f34913b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f34913b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f34913b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable r5) {
        if (r5 == null) goto L14;
        if (Thread.currentThread().getId() != this.f34912a) goto L12;
        r5.call();     // Catch: Exception -> L7
        return null;
    L7:
        e = move-exception;
        e.printStackTrace();
        return null;
    L12:
        return this.f34913b.submit(new b(this, r5));
    L14:
        throw new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection r1, long r2, TimeUnit r4) {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection r1, long r2, TimeUnit r4) {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable r2, Object r3) {
        if (r2 == null) goto L6;
        FutureTask r02 = new FutureTask(r2, r3);
        execute(r02);
        return r02;
    L6:
        throw new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable r3) {
        if (r3 == null) goto L6;
        FutureTask r02 = new FutureTask(r3, null);
        execute(r02);
        return r02;
    L6:
        throw new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
    }
}
