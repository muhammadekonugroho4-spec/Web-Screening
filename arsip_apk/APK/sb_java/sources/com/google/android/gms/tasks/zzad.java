package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class zzad<T> implements zzae<T> {
    private final CountDownLatch zza;

    private zzad() {
        this.zza = new CountDownLatch(1);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception r1) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T r1) {
        this.zza.countDown();
    }

    public final void zza() throws InterruptedException {
        this.zza.await();
    }

    public final boolean zzb(long r2, TimeUnit r4) throws InterruptedException {
        return this.zza.await(r2, r4);
    }

    public /* synthetic */ zzad(zzac r2) {
        this.zza = new CountDownLatch(1);
    }
}
