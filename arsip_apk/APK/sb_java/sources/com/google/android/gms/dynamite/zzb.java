package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes5.dex */
public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    static {
    }

    public static synchronized ClassLoader zza() {
        monitor-enter(zzb.class);
    L48:
        th = move-exception;
        throw th;
    L5:
        if (zza != null) goto L64;
        Thread r1 = zzb;     // Catch: Throwable -> L48
        ClassLoader r2 = null;
        if (r1 != null) goto L52;
        ThreadGroup r12 = Looper.getMainLooper().getThread().getThreadGroup();     // Catch: Throwable -> L48
        if (r12 != null) goto L12;
        r1 = null;
    L45:
        zzb = r1;     // Catch: Throwable -> L48
        if (r1 != null) goto L52;
    L60:
        zza = r2;     // Catch: Throwable -> L48
        goto L64
    L12:
        monitor-enter(Void.class);     // Catch: Throwable -> L48
        int r4 = r12.activeGroupCount();     // Catch: Throwable -> L19 SecurityException -> L21
        ThreadGroup[] r5 = new ThreadGroup[r4];     // Catch: Throwable -> L19 SecurityException -> L21
        r12.enumerate(r5);     // Catch: Throwable -> L19 SecurityException -> L21
        int r6 = 0;
        int r7 = 0;
    L14:
        if (r7 >= r4) goto L23;
        ThreadGroup r8 = r5[r7];     // Catch: Throwable -> L19 SecurityException -> L21
        if ("dynamiteLoader".equals(r8.getName()) == true) goto L24;
        r7 = r7 + 1;     // Catch: Throwable -> L19 SecurityException -> L21
    L24:
        if (r8 != null) goto L26;
        r8 = new ThreadGroup(r12, "dynamiteLoader");     // Catch: Throwable -> L19 SecurityException -> L21
    L26:
        int r13 = r8.activeCount();     // Catch: Throwable -> L19 SecurityException -> L21
        Thread[] r42 = new Thread[r13];     // Catch: Throwable -> L19 SecurityException -> L21
        r8.enumerate(r42);     // Catch: Throwable -> L19 SecurityException -> L21
    L27:
        if (r6 >= r13) goto L32;
        Thread r52 = r42[r6];     // Catch: Throwable -> L19 SecurityException -> L21
        if ("GmsDynamite".equals(r52.getName()) == true) goto L33;
        r6 = r6 + 1;
    L33:
        if (r52 == null) goto L77;
    L43:
        monitor-exit(Void.class);     // Catch: Throwable -> L19
        r1 = r52;
        goto L45
    L77:
        zza r14 = new zza(r8, "GmsDynamite");     // Catch: Throwable -> L19 SecurityException -> L39
        r14.setContextClassLoader(null);     // Catch: Throwable -> L19 SecurityException -> L37
        r14.start();     // Catch: Throwable -> L19 SecurityException -> L37
        r52 = r14;
    L37:
        SecurityException e2 = e;
        r52 = r14;
    L42:
        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e2.getMessage());     // Catch: Throwable -> L19
    L39:
        e = move-exception;
        e2 = e;
        goto L42
    L32:
        r52 = null;
        goto L33
    L23:
        r8 = null;
    L21:
        e = move-exception;
        e2 = e;
        r52 = null;
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L48
    L52:
        monitor-enter(r1);     // Catch: Throwable -> L48
        r2 = zzb.getContextClassLoader();     // Catch: Throwable -> L55 SecurityException -> L57
    L59:
        monitor-exit(r1);     // Catch: Throwable -> L55
    L55:
        th = move-exception;
        throw th;     // Catch: Throwable -> L48
    L57:
        e = move-exception;
        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());     // Catch: Throwable -> L55
    L64:
        ClassLoader r15 = zza;     // Catch: Throwable -> L48
        monitor-exit(zzb.class);
        return r15;
    }
}
