package com.google.firebase.messaging.threads;

import android.annotation.SuppressLint;
import com.google.errorprone.annotations.CompileTimeConstant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class PoolableExecutors {
    private static final ExecutorFactory DEFAULT_INSTANCE = null;
    private static volatile ExecutorFactory instance;

    /* renamed from: com.google.firebase.messaging.threads.PoolableExecutors$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class DefaultExecutorFactory implements ExecutorFactory {
        private static final long CORE_THREAD_TIMEOUT_SECS = 60;

        private DefaultExecutorFactory() {
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public void executeOneOff(@CompileTimeConstant String r1, @CompileTimeConstant String r2, ThreadPriority r3, Runnable r4) {
            new Thread(r4, r2).start();
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService newScheduledThreadPool(int r1, ThreadPriority r2) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(r1));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public ExecutorService newSingleThreadExecutor(ThreadPriority r2) {
            return newThreadPool(1, r2);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService newThreadPool(ThreadPriority r1) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Future<?> submitOneOff(@CompileTimeConstant String r1, @CompileTimeConstant String r2, ThreadPriority r3, Runnable r4) {
            FutureTask r12 = new FutureTask(r4, null);
            new Thread(r12, r2).start();
            return r12;
        }

        public /* synthetic */ DefaultExecutorFactory(AnonymousClass1 r1) {
            this();
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public ExecutorService newSingleThreadExecutor(ThreadFactory r2, ThreadPriority r3) {
            return newThreadPool(1, r2, r3);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService newThreadPool(ThreadFactory r1, ThreadPriority r2) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(r1));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService newScheduledThreadPool(int r1, ThreadFactory r2, ThreadPriority r3) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(r1, r2));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public ExecutorService newThreadPool(int r2, ThreadPriority r3) {
            return newThreadPool(r2, Executors.defaultThreadFactory(), r3);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService newThreadPool(int r9, ThreadFactory r10, ThreadPriority r11) {
            ThreadPoolExecutor r02 = new ThreadPoolExecutor(r9, r9, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), r10);
            r02.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(r02);
        }
    }

    static {
        DefaultExecutorFactory r02 = new DefaultExecutorFactory(null);
        DEFAULT_INSTANCE = r02;
        instance = r02;
    }

    private PoolableExecutors() {
    }

    public static ExecutorFactory factory() {
        return instance;
    }

    public static void installExecutorFactory(ExecutorFactory r2) {
        if (instance != DEFAULT_INSTANCE) goto L7;
        instance = r2;
        return;
    L7:
        throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
    }
}
