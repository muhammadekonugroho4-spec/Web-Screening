package com.clevertap.android.sdk.task;

import androidx.activity.T;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class g implements ExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final int f34909a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f34910b;

    public g() {
        int r02 = Runtime.getRuntime().availableProcessors();
        this.f34909a = r02;
        this.f34910b = new ThreadPoolExecutor(r02 * 2, r02 * 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, TimeUnit r4) {
        return this.f34910b.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.f34910b.execute(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection r2) {
        return this.f34910b.invokeAll(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection r2) {
        return this.f34910b.invokeAny(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f34910b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f34910b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f34910b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f34910b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable r2) {
        return this.f34910b.submit(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection r2, long r3, TimeUnit r5) {
        return this.f34910b.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection r2, long r3, TimeUnit r5) {
        return this.f34910b.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable r2, Object r3) {
        return this.f34910b.submit(r2, r3);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable r2) {
        return this.f34910b.submit(r2);
    }
}
