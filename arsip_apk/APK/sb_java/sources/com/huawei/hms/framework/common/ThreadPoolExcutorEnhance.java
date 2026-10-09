package com.huawei.hms.framework.common;

import androidx.activity.T;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class ThreadPoolExcutorEnhance extends ThreadPoolExecutor implements AutoCloseable {
    public ThreadPoolExcutorEnhance(int r1, int r2, long r3, TimeUnit r5, BlockingQueue<Runnable> r6, ThreadFactory r7) {
        super(r1, r2, r3, r5, r6, r7);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread r6, Runnable r7) {
        if ((r7 instanceof RunnableEnhance) == false) goto L11;
        String r02 = ((RunnableEnhance) r7).getParentName();
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

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable r2) {
        super.execute(new RunnableEnhance(r2));
    }
}
