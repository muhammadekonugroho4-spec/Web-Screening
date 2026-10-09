package com.google.firebase.concurrent;

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
final class PausableExecutorServiceImpl implements PausableExecutorService {
    private final ExecutorService delegateService;
    private final PausableExecutor pausableDelegate;

    public PausableExecutorServiceImpl(boolean r2, ExecutorService r3) {
        this.delegateService = r3;
        this.pausableDelegate = new PausableExecutorImpl(r2, r3);
    }

    public static /* synthetic */ Object c(Runnable r02) {
        r02.run();
        return null;
    }

    public static /* synthetic */ Object f(Runnable r02, Object r1) {
        r02.run();
        return r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, TimeUnit r4) throws InterruptedException {
        return this.delegateService.awaitTermination(r2, r4);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.pausableDelegate.execute(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> r2) throws InterruptedException {
        return this.delegateService.invokeAll(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> r2) throws ExecutionException, InterruptedException {
        return (T) this.delegateService.invokeAny(r2);
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.pausableDelegate.isPaused();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegateService.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegateService.isTerminated();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.pausableDelegate.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.pausableDelegate.resume();
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
        return this.delegateService.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegateService.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable r2, final T r3) {
        return submit(new z(r2, r3));
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable r2) {
        return submit(new y(r2));
    }
}
