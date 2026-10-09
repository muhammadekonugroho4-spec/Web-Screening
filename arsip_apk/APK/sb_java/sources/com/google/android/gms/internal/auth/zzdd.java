package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.C2337a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzdd implements zzcl {
    private static final Map zza = null;
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static {
        zza = new C2337a();
    }

    public static zzdd zza(Context r02, String r1, Runnable r2) {
        if (zzcc.zzb() == false) goto L5;
        throw null;
    L5:
        monitor-enter(zzdd.class);
        zzdd r22 = (zzdd) zza.get(null);     // Catch: Throwable -> L10
        if (r22 == null) goto L12;
        monitor-exit(zzdd.class);     // Catch: Throwable -> L10
        return r22;
    L12:
        StrictMode.ThreadPolicy r23 = StrictMode.allowThreadDiskReads();     // Catch: Throwable -> L10
        throw null;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        StrictMode.setThreadPolicy(r23);     // Catch: Throwable -> L10
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public static synchronized void zzc() {
        monitor-enter(zzdd.class);
        Map r1 = zza;     // Catch: Throwable -> L9
        Iterator r2 = r1.values().iterator();     // Catch: Throwable -> L9
        if (r2.hasNext() == true) goto L11;
        r1.clear();     // Catch: Throwable -> L9
        monitor-exit(zzdd.class);
        return;
    L11:
        SharedPreferences r12 = ((zzdd) r2.next()).zzb;     // Catch: Throwable -> L9
        throw null;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final Object zzb(String r1) {
        throw null;
    }
}
