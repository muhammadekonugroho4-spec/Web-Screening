package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class Wrappers {
    private static final Wrappers zza = null;
    private PackageManagerWrapper zzb;

    static {
        zza = new Wrappers();
    }

    public Wrappers() {
        this.zzb = null;
    }

    @KeepForSdk
    public static PackageManagerWrapper packageManager(Context r1) {
        return zza.zza(r1);
    }

    public final synchronized PackageManagerWrapper zza(Context r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.zzb == null) goto L6;
    L11:
        PackageManagerWrapper r22 = this.zzb;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r22;
    L6:
        if (r2.getApplicationContext() == null) goto L10;
        r2 = r2.getApplicationContext();     // Catch: Throwable -> L8
    L10:
        this.zzb = new PackageManagerWrapper(r2);     // Catch: Throwable -> L8
        goto L11
    }
}
