package com.huawei.hms.framework.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class ExecutorsUtils {
    private static final String THREADNAME_HEADER = "NetworkKit_";

    public ExecutorsUtils() {
    }

    public static ThreadFactory createThreadFactory(final String r1) {
        if (r1 == null) goto L8;
        if (r1.trim().isEmpty() == true) goto L8;
        return new AnonymousClass1(r1);
    L8:
        throw new NullPointerException("ThreadName is empty");
    }

    public static ExecutorService newCachedThreadPool(String r8) {
        ThreadFactory r7 = createThreadFactory(r8);
        ThreadPoolExcutorEnhance r02 = new ThreadPoolExcutorEnhance(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), r7);
        r02.allowCoreThreadTimeOut(true);
        return r02;
    }

    public static ExecutorService newFixedThreadPool(int r8, String r9) {
        ThreadFactory r7 = createThreadFactory(r9);
        ThreadPoolExcutorEnhance r02 = new ThreadPoolExcutorEnhance(r8, r8, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), r7);
        r02.allowCoreThreadTimeOut(true);
        return r02;
    }

    public static ScheduledExecutorService newScheduledThreadPool(int r1, String r2) {
        return new ScheduledThreadPoolExecutorEnhance(r1, createThreadFactory(r2));
    }

    public static ExecutorService newSingleThreadExecutor(String r02) {
        return ExecutorsEnhance.newSingleThreadExecutor(createThreadFactory(r02));
    }
}
