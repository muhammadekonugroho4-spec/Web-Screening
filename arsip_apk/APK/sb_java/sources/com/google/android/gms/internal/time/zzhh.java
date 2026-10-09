package com.google.android.gms.internal.time;

import java.io.Closeable;

/* loaded from: classes5.dex */
public final class zzhh implements Closeable, AutoCloseable {
    private static final ThreadLocal zza = null;
    private int zzb;

    static {
        zza = new zzhg();
    }

    public zzhh() {
        this.zzb = 0;
    }

    public static int zza() {
        return zzd().zzb;
    }

    public static zzhh zzc() {
        zzhh r02 = zzd();
        int r1 = r02.zzb + 1;
        r02.zzb = r1;
        if (r1 == 0) goto L6;
        return r02;
    L6:
        throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    private static zzhh zzd() {
        return (zzhh) zza.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int r02 = this.zzb;
        if (r02 <= 0) goto L7;
        this.zzb = r02 - 1;
        return;
    L7:
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }

    public final int zzb() {
        return this.zzb;
    }
}
