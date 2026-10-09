package com.google.android.gms.tasks;

/* loaded from: classes5.dex */
public class TaskCompletionSource<TResult> {
    private final zzw zza;

    public TaskCompletionSource() {
        this.zza = new zzw();
    }

    public static /* bridge */ /* synthetic */ zzw zza(TaskCompletionSource r02) {
        return r02.zza;
    }

    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(Exception r2) {
        this.zza.zza(r2);
    }

    public void setResult(TResult r2) {
        this.zza.zzb(r2);
    }

    public boolean trySetException(Exception r2) {
        return this.zza.zzd(r2);
    }

    public boolean trySetResult(TResult r2) {
        return this.zza.zze(r2);
    }

    public TaskCompletionSource(CancellationToken r2) {
        this.zza = new zzw();
        r2.onCanceledRequested(new zzs(this));
    }
}
