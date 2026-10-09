package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
public abstract class zzj implements Runnable {
    private final TaskCompletionSource zza;

    public zzj() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zza();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        zzc(e);
    }

    public abstract void zza();

    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception r2) {
        TaskCompletionSource r02 = this.zza;
        if (r02 == null) goto L6;
        r02.trySetException(r2);
        return;
    }

    public zzj(TaskCompletionSource r1) {
        this.zza = r1;
    }
}
