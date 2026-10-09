package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class zas implements zaq {
    private zas() {
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zaa(ThreadFactory r1, int r2) {
        return zac(1, r1, 1);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zab(int r2, int r3) {
        return zac(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zac(int r9, ThreadFactory r10, int r11) {
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(r9, r9, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), r10);
        r02.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(r02);
    }

    public /* synthetic */ zas(zar r1) {
    }
}
