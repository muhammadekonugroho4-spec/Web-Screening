package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzfx<V> {
    private static final Object zza = null;
    private final String zzb;
    private final zzfv<V> zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzf;
    private volatile V zzg;

    static {
        zza = new Object();
    }

    public /* synthetic */ zzfx(String r1, Object r2, Object r3, zzfv r4, zzfw r5) {
        this(r1, r2, r3, r4);
    }

    public final V zza(V r4) {
        Object r02 = this.zze;
        monitor-enter(r02);
        monitor-exit(r02);     // Catch: Throwable -> L55
        if (r4 == null) goto L8;
        return r4;
    L8:
        if (zzfu.zza == null) goto L10;
        Object r42 = zza;
        monitor-enter(r42);
    L18:
        th = move-exception;
        throw th;
    L14:
        if (zzaf.zza() == true) goto L16;
        monitor-exit(r42);     // Catch: Throwable -> L18
        Iterator r43 = zzbn.zzdc().iterator();     // Catch: SecurityException -> L59
    L26:
        if (r43.hasNext() == false) goto L43;
        zzfx r03 = (zzfx) r43.next();     // Catch: SecurityException -> L59
        if (zzaf.zza() == true) goto L42;
        V r1 = null;
        zzfv<V> r2 = r03.zzc;     // Catch: IllegalStateException -> L58 SecurityException -> L59
        if (r2 == null) goto L33;
        r1 = r2.zza();     // Catch: IllegalStateException -> L58 SecurityException -> L59
    L33:
        Object r22 = zza;     // Catch: SecurityException -> L59
        monitor-enter(r22);     // Catch: SecurityException -> L59
        r03.zzg = r1;     // Catch: Throwable -> L38
        monitor-exit(r22);     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        throw th;     // Catch: SecurityException -> L59
    L42:
        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");     // Catch: SecurityException -> L59
    L43:
        zzfv<V> r44 = this.zzc;
        if (r44 == null) goto L46;
        return r44.zza();
    L50:
        return this.zzd;
    L52:
        return this.zzd;
    L46:
        return this.zzd;
    L16:
        if (this.zzg != null) goto L20;
        V r04 = this.zzd;     // Catch: Throwable -> L18
    L21:
        monitor-exit(r42);     // Catch: Throwable -> L18
        return r04;
    L20:
        r04 = this.zzg;     // Catch: Throwable -> L18
        goto L21
    L10:
        return this.zzd;
    L55:
        th = move-exception;
        throw th;
    }

    private zzfx(String r1, V r2, V r3, zzfv<V> r4) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = r1;
        this.zzd = r2;
        this.zzc = r4;
    }

    public final String zza() {
        return this.zzb;
    }
}
