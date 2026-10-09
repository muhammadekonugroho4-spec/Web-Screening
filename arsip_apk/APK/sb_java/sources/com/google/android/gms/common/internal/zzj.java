package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class zzj {
    static final ExecutorService zza = null;

    static {
        com.google.android.gms.internal.common.zzg.zza();
        NamedThreadFactory r7 = new NamedThreadFactory("CallbackExecutor");
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), r7);
        r02.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(r02);
    }
}
