package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.C2337a;

/* loaded from: classes5.dex */
public final class zzcr {
    private static final C2337a zza = null;

    static {
        zza = new C2337a();
    }

    public static synchronized Uri zza(String r4) {
        monitor-enter(zzcr.class);
        C2337a r1 = zza;     // Catch: Throwable -> L9
        Uri r2 = (Uri) r1.get("com.google.android.gms.auth_account");     // Catch: Throwable -> L9
        if (r2 != null) goto L11;
        Uri r22 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));     // Catch: Throwable -> L9
        r1.put("com.google.android.gms.auth_account", r22);     // Catch: Throwable -> L9
        monitor-exit(zzcr.class);
        return r22;
    L11:
        monitor-exit(zzcr.class);
        return r2;
    L9:
        th = move-exception;
        throw th;
    }
}
