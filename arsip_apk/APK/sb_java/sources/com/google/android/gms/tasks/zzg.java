package com.google.android.gms.tasks;

/* loaded from: classes5.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh r1) {
        this.zza = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object r02 = zzh.zzb(this.zza);
        monitor-enter(r02);
        zzh r1 = this.zza;     // Catch: Throwable -> L7
        if (zzh.zza(r1) == null) goto L9;
        zzh.zza(r1).onCanceled();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
