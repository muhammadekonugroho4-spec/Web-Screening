package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    public interface PooledExecutorFactory {
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        monitor-enter(PooledExecutorsProvider.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (zza != null) goto L9;
        zza = new zza();     // Catch: Throwable -> L7
    L9:
        PooledExecutorFactory r1 = zza;     // Catch: Throwable -> L7
        monitor-exit(PooledExecutorsProvider.class);
        return r1;
    }
}
