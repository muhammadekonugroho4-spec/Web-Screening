package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
abstract class zzl extends zzj {
    private static final WeakReference zza = null;
    private WeakReference zzb;

    static {
        zza = new WeakReference(null);
    }

    public zzl(byte[] r1) {
        super(r1);
        this.zzb = zza;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
        monitor-enter(this);
        byte[] r02 = (byte[]) this.zzb.get();     // Catch: Throwable -> L6
        if (r02 != null) goto L8;
        r02 = zzb();     // Catch: Throwable -> L6
        this.zzb = new WeakReference(r02);     // Catch: Throwable -> L6
    L8:
        monitor-exit(this);     // Catch: Throwable -> L6
        return r02;
    L6:
        th = move-exception;
        throw th;
    }
}
