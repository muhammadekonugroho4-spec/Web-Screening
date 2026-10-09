package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class zzdm extends zzdp {
    private final AtomicReference<Bundle> zza;
    private boolean zzb;

    public zzdm() {
        this.zza = new AtomicReference();
    }

    public final Bundle zza(long r3) {
        AtomicReference<Bundle> r02 = this.zza;
        monitor-enter(r02);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.zzb == false) goto L18;
    L13:
        Bundle r32 = this.zza.get();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return r32;
    L18:
        this.zza.wait(r3);     // Catch: Throwable -> L8 InterruptedException -> L10
    L11:
        return null;
    }

    public final Long zzb(long r1) {
        return (Long) zza(zza(r1), Long.class);
    }

    public final String zzc(long r1) {
        return (String) zza(zza(r1), String.class);
    }

    public static <T> T zza(Bundle r3, Class<T> r4) {
        if (r3 == null) goto L11;
        Object r32 = r3.get("r");
        if (r32 == null) goto L11;
        return r4.cast(r32);
    L8:
        e = move-exception;
        Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{r4.getCanonicalName(), r32.getClass().getCanonicalName()}), e);
        throw e;
    L11:
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq
    public final void zza(Bundle r3) {
        AtomicReference<Bundle> r02 = this.zza;
        monitor-enter(r02);
        this.zza.set(r3);     // Catch: Throwable -> L10
        this.zzb = true;     // Catch: Throwable -> L10
        this.zza.notify();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    L10:
        th = move-exception;
        this.zza.notify();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    }
}
