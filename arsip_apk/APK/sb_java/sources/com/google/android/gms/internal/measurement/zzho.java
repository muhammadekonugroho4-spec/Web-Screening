package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes5.dex */
public final /* synthetic */ class zzho {
    public static <V> V zza(zzhn<V> r2) {
        return r2.zza();
    L4:
        long r02 = Binder.clearCallingIdentity();
        V r22 = r2.zza();     // Catch: Throwable -> L8
        Binder.restoreCallingIdentity(r02);
        return r22;
    L8:
        th = move-exception;
        Binder.restoreCallingIdentity(r02);
        throw th;
    }
}
