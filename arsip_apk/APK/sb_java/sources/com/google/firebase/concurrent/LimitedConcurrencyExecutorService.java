package com.google.firebase.concurrent;

import androidx.activity.T;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
final class LimitedConcurrencyExecutorService extends LimitedConcurrencyExecutor implements ExecutorService, AutoCloseable {
    private final ExecutorService delegate;

    public LimitedConcurrencyExecutorService(ExecutorService r1, int r2) {
        super(r1, r2);
        this.delegate = r1;
    }

    public static /* synthetic */ Object f(Runnable r02, Object r1) {
        r02.run();
        return r1;
    }

    public static /* synthetic */ Object i(Runnable r02) {
        r02.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, TimeUnit r4) throws InterruptedException {
        return this.delegate.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> r2) throws InterruptedException {
        return this.delegate.invokeAll(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> r2) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> r2) {
        FutureTask r02 = new FutureTask(r2);
        execute(r02);
        return r02;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws InterruptedException {
        return this.delegate.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable r2, final T r3) {
        return submit(new x(r2, r3));
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable r2) {
        return submit(new w(r2));
    }
}
