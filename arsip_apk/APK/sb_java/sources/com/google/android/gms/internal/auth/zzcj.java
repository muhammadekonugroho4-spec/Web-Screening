package com.google.android.gms.internal.auth;

import android.os.Binder;

/* loaded from: classes5.dex */
public final /* synthetic */ class zzcj {
    public static Object zza(zzck r2) {
        return r2.zza();
    L4:
        long r02 = Binder.clearCallingIdentity();
        Object r22 = r2.zza();     // Catch: Throwable -> L8
        Binder.restoreCallingIdentity(r02);
        return r22;
    L8:
        th = move-exception;
        Binder.restoreCallingIdentity(r02);
        throw th;
    }
}
