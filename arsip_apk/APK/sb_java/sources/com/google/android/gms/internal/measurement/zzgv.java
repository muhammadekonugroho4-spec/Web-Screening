package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzgv {
    private static zzgy zza;

    static {
    }

    public static synchronized zzgy zza() {
        monitor-enter(zzgv.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (zza != null) goto L9;
        zza(new zzgx());     // Catch: Throwable -> L7
    L9:
        zzgy r1 = zza;     // Catch: Throwable -> L7
        monitor-exit(zzgv.class);
        return r1;
    }

    private static synchronized void zza(zzgy r2) {
        monitor-enter(zzgv.class);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (zza != null) goto L12;
        zza = r2;     // Catch: Throwable -> L9
        monitor-exit(zzgv.class);
        return;
    L12:
        throw new IllegalStateException("init() already called");     // Catch: Throwable -> L9
    }
}
