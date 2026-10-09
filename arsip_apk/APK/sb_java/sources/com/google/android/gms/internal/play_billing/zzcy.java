package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class zzcy {
    private final zzbm zza;
    private final String zzb;
    private volatile Logger zzc;

    public zzcy(Class r2) {
        this.zza = new zzbm();
        this.zzb = r2.getName();
    }

    public final Logger zza() {
        Logger r02 = this.zzc;
        if (r02 == null) goto L5;
        return r02;
    L5:
        zzbm r03 = this.zza;
        monitor-enter(r03);
        Logger r1 = this.zzc;     // Catch: Throwable -> L11
        if (r1 == null) goto L13;
        monitor-exit(r03);     // Catch: Throwable -> L11
        return r1;
    L13:
        Logger r12 = Logger.getLogger(this.zzb);     // Catch: Throwable -> L11
        this.zzc = r12;     // Catch: Throwable -> L11
        monitor-exit(r03);     // Catch: Throwable -> L11
        return r12;
    L11:
        th = move-exception;
        throw th;
    }
}
