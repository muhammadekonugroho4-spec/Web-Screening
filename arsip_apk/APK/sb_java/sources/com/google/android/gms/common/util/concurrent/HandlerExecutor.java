package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes5.dex */
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(Looper r2) {
        this.zza = new zzh(r2);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        this.zza.post(r2);
    }
}
