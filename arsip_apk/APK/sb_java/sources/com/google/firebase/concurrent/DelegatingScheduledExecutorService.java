package com.google.firebase.concurrent;

import androidx.activity.T;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    public DelegatingScheduledExecutorService(ExecutorService r1, ScheduledExecutorService r2) {
        this.delegate = r1;
        this.scheduler = r2;
    }

    public static /* synthetic */ void B(DelegatingScheduledExecutorService r1, final Runnable r2, final DelegatingScheduledFuture.Completer r3) {
        r1.delegate.execute(new h(r2, r3));
    }

    public static /* synthetic */ void E(Runnable r02, DelegatingScheduledFuture.Completer r1) {
        r02.run();     // Catch: Exception -> L4
        r1.set(null);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        r1.setException(e);
    }

    public static /* synthetic */ void M(DelegatingScheduledExecutorService r1, final Runnable r2, final DelegatingScheduledFuture.Completer r3) {
        r1.delegate.execute(new c(r2, r3));
    }

    public static /* synthetic */ ScheduledFuture O(final DelegatingScheduledExecutorService r2, final Runnable r3, long r4, TimeUnit r6, final DelegatingScheduledFuture.Completer r7) {
        return r2.scheduler.schedule(new f(r2, r3, r7), r4, r6);
    }

    public static /* synthetic */ ScheduledFuture c(final DelegatingScheduledExecutorService r2, final Callable r3, long r4, TimeUnit r6, final DelegatingScheduledFuture.Completer r7) {
        return r2.scheduler.schedule(new l(r2, r3, r7), r4, r6);
    }

    public static /* synthetic */ ScheduledFuture f(final DelegatingScheduledExecutorService r2, final Runnable r3, long r4, long r6, TimeUnit r8, final DelegatingScheduledFuture.Completer r9) {
        return r2.scheduler.scheduleWithFixedDelay(new d(r2, r3, r9), r4, r6, r8);
    }

    public static /* synthetic */ ScheduledFuture i(final DelegatingScheduledExecutorService r2, final Runnable r3, long r4, long r6, TimeUnit r8, final DelegatingScheduledFuture.Completer r9) {
        return r2.scheduler.scheduleAtFixedRate(new e(r2, r3, r9), r4, r6, r8);
    }

    public static /* synthetic */ void k(Callable r02, DelegatingScheduledFuture.Completer r1) {
        r1.set(r02.call());     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        r1.setException(e);
    }

    public static /* synthetic */ void l(Runnable r02, DelegatingScheduledFuture.Completer r1) {
        r02.run();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        r1.setException(e);
        throw e;
    }

    public static /* synthetic */ void n(DelegatingScheduledExecutorService r1, final Runnable r2, final DelegatingScheduledFuture.Completer r3) {
        r1.delegate.execute(new m(r2, r3));
    }

    public static /* synthetic */ Future u(DelegatingScheduledExecutorService r1, final Callable r2, final DelegatingScheduledFuture.Completer r3) {
        return r1.delegate.submit(new k(r2, r3));
    }

    public static /* synthetic */ void x(Runnable r02, DelegatingScheduledFuture.Completer r1) {
        r02.run();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        r1.setException(e);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, TimeUnit r4) throws InterruptedException {
        return this.delegate.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.delegate.execute(r2);
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

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable r8, final long r9, final TimeUnit r11) {
        return new DelegatingScheduledFuture(new b(this, r8, r9, r11));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable r10, final long r11, final long r13, final TimeUnit r15) {
        return new DelegatingScheduledFuture(new g(this, r10, r11, r13, r15));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable r10, final long r11, final long r13, final TimeUnit r15) {
        return new DelegatingScheduledFuture(new i(this, r10, r11, r13, r15));
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
        return this.delegate.submit(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws InterruptedException {
        return this.delegate.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> r8, final long r9, final TimeUnit r11) {
        return new DelegatingScheduledFuture(new j(this, r8, r9, r11));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable r2, T r3) {
        return this.delegate.submit(r2, r3);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable r2) {
        return this.delegate.submit(r2);
    }
}
