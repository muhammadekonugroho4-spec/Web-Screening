package com.huawei.hms.framework.common;

import androidx.activity.T;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public class ExecutorsEnhance {

    public static class DelegatedExecutorService extends AbstractExecutorService implements AutoCloseable {
        private final ExecutorService executorService;

        public DelegatedExecutorService(ExecutorService r1) {
            this.executorService = r1;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long r2, TimeUnit r4) throws InterruptedException {
            return this.executorService.awaitTermination(r2, r4);
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            T.a(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable r2) {
            this.executorService.execute(r2);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws InterruptedException {
            return this.executorService.invokeAll(r2, r3, r5);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> r2, long r3, TimeUnit r5) throws InterruptedException, ExecutionException, TimeoutException {
            return (T) this.executorService.invokeAny(r2, r3, r5);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.executorService.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.executorService.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.executorService.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.executorService.shutdownNow();
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable r2, T r3) {
            return this.executorService.submit(r2, r3);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> r2) throws InterruptedException {
            return this.executorService.invokeAll(r2);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> r2) throws InterruptedException, ExecutionException {
            return (T) this.executorService.invokeAny(r2);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> r2) {
            return this.executorService.submit(r2);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable r2) {
            return this.executorService.submit(r2);
        }
    }

    public static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
        public FinalizableDelegatedExecutorService(ExecutorService r1) {
            super(r1);
        }

        public void finalize() {
            super.shutdown();
        }
    }

    public ExecutorsEnhance() {
    }

    public static ExecutorService newSingleThreadExecutor(ThreadFactory r8) {
        ThreadPoolExcutorEnhance r02 = new ThreadPoolExcutorEnhance(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), r8);
        r02.allowCoreThreadTimeOut(true);
        return new FinalizableDelegatedExecutorService(r02);
    }
}
