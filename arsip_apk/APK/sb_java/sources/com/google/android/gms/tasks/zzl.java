package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzl implements zzq {
    private final Executor zza;
    private final Object zzb;
    private OnFailureListener zzc;

    public zzl(Executor r2, OnFailureListener r3) {
        this.zzb = new Object();
        this.zza = r2;
        this.zzc = r3;
    }

    public static /* bridge */ /* synthetic */ OnFailureListener zza(zzl r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzl r02) {
        return r02.zzb;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        Object r02 = this.zzb;
        monitor-enter(r02);
        this.zzc = null;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(Task r3) {
        if (r3.isSuccessful() == false) goto L5;
        return;
    L5:
        if (r3.isCanceled() == true) goto L21;
        Object r02 = this.zzb;
        monitor-enter(r02);
    L12:
        th = move-exception;
        throw th;
    L9:
        if (this.zzc != null) goto L14;
        monitor-exit(r02);     // Catch: Throwable -> L12
        return;
    L14:
        monitor-exit(r02);     // Catch: Throwable -> L12
        this.zza.execute(new zzk(this, r3));
        return;
    }
}
