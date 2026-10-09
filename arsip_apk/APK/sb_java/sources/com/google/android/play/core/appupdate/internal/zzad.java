package com.google.android.play.core.appupdate.internal;

/* loaded from: classes5.dex */
public final class zzad implements zzaf {
    private static final Object zza = null;
    private volatile zzaf zzb;
    private volatile Object zzc;

    static {
        zza = new Object();
    }

    private zzad(zzaf r2) {
        this.zzc = zza;
        this.zzb = r2;
    }

    public static zzaf zzb(zzaf r1) {
        r1.getClass();
        if ((r1 instanceof zzad) == false) goto L6;
        return r1;
    L6:
        return new zzad(r1);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object r02 = this.zzc;
        Object r1 = zza;
        if (r02 != r1) goto L20;
        monitor-enter(this);
        Object r03 = this.zzc;     // Catch: Throwable -> L13
        if (r03 != r1) goto L16;
        r03 = this.zzb.zza();     // Catch: Throwable -> L13
        Object r2 = this.zzc;     // Catch: Throwable -> L13
        if (r2 == r1) goto L15;
        if (r2 == r03) goto L15;
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + r2 + " & " + r03 + ". This is likely due to a circular dependency.");     // Catch: Throwable -> L13
    L15:
        this.zzc = r03;     // Catch: Throwable -> L13
        this.zzb = null;     // Catch: Throwable -> L13
    L16:
        monitor-exit(this);     // Catch: Throwable -> L13
        return r03;
    L13:
        th = move-exception;
        throw th;
    L20:
        return r02;
    }
}
