package com.google.android.gms.internal.measurement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class zzdd implements zzdb {
    private zzdd() {
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final ExecutorService zza(ThreadFactory r9, int r10) {
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), r9);
        r02.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(r02);
    }

    public /* synthetic */ zzdd(zzdg r1) {
        this();
    }
}
