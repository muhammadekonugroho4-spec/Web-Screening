package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzn implements zzq {
    private final Executor zza;
    private final Object zzb;
    private OnSuccessListener zzc;

    public zzn(Executor r2, OnSuccessListener r3) {
        this.zzb = new Object();
        this.zza = r2;
        this.zzc = r3;
    }

    public static /* bridge */ /* synthetic */ OnSuccessListener zza(zzn r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzn r02) {
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
        if (r3.isSuccessful() == false) goto L17;
        Object r02 = this.zzb;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L7:
        if (this.zzc != null) goto L12;
        monitor-exit(r02);     // Catch: Throwable -> L10
        return;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L10
        this.zza.execute(new zzm(this, r3));
        return;
    }
}
