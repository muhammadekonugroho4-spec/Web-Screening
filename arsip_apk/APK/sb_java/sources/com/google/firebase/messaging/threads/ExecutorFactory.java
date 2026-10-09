package com.google.firebase.messaging.threads;

import com.google.errorprone.annotations.CompileTimeConstant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public interface ExecutorFactory {
    void executeOneOff(@CompileTimeConstant String r1, @CompileTimeConstant String r2, ThreadPriority r3, Runnable r4);

    ScheduledExecutorService newScheduledThreadPool(int r1, ThreadPriority r2);

    ScheduledExecutorService newScheduledThreadPool(int r1, ThreadFactory r2, ThreadPriority r3);

    ExecutorService newSingleThreadExecutor(ThreadPriority r1);

    ExecutorService newSingleThreadExecutor(ThreadFactory r1, ThreadPriority r2);

    ExecutorService newThreadPool(int r1, ThreadPriority r2);

    ExecutorService newThreadPool(int r1, ThreadFactory r2, ThreadPriority r3);

    ExecutorService newThreadPool(ThreadPriority r1);

    ExecutorService newThreadPool(ThreadFactory r1, ThreadPriority r2);

    Future<?> submitOneOff(@CompileTimeConstant String r1, @CompileTimeConstant String r2, ThreadPriority r3, Runnable r4);
}
