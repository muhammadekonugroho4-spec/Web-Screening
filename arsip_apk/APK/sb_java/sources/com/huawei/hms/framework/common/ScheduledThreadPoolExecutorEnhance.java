package com.huawei.hms.framework.common;

import androidx.activity.T;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public class ScheduledThreadPoolExecutorEnhance extends ScheduledThreadPoolExecutor implements AutoCloseable {
    private static final String TAG = "ScheduledThreadPoolExec";

    public ScheduledThreadPoolExecutorEnhance(int r1, ThreadFactory r2) {
        super(r1, r2);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread r6, Runnable r7) {
        if ((r7 instanceof RunnableScheduledFutureEnhance) == false) goto L11;
        String r02 = ((RunnableScheduledFutureEnhance) r7).getParentName();
        int r2 = r02.lastIndexOf(" -->");
        if (r2 == (-1)) goto L7;
        r02 = StringUtils.substring(r02, r2 + 4);
    L7:
        String r22 = r6.getName();
        int r4 = r22.lastIndexOf(" -->");
        if (r4 == (-1)) goto L10;
        r22 = StringUtils.substring(r22, r4 + 4);
    L10:
        r6.setName(r02 + " -->" + r22);
    L11:
        super.beforeExecute(r6, r7);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Runnable r2, RunnableScheduledFuture<V> r3) {
        return new RunnableScheduledFutureEnhance(super.decorateTask(r2, r3));
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Callable<V> r2, RunnableScheduledFuture<V> r3) {
        return new RunnableScheduledFutureEnhance(super.decorateTask(r2, r3));
    }
}
