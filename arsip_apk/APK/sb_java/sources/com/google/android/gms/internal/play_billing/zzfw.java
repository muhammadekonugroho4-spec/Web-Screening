package com.google.android.gms.internal.play_billing;

/* loaded from: classes5.dex */
public class zzfw {
    protected volatile zzgl zza;
    private volatile zzei zzb;
    private volatile boolean zzc;

    public zzfw() {
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof zzfw) == true) goto L9;
        return false;
    L9:
        zzfw r32 = (zzfw) r3;
        zzgl r02 = this.zza;
        zzgl r1 = r32.zza;
        if (r02 != null) goto L15;
        if (r1 != null) goto L15;
        return zzb().equals(r32.zzb());
    L15:
        if (r02 == null) goto L20;
        if (r1 == null) goto L20;
        return r02.equals(r1);
    L20:
        if (r02 == null) goto L23;
        r32.zzd(r02.zzh());
        return r02.equals(r32.zza);
    L23:
        zzd(r1.zzh());
        return this.zza.equals(r1);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb == null) goto L7;
        return ((zzeg) this.zzb).zza.length;
    L7:
        if (this.zza != null) goto L9;
        return 0;
    L9:
        return this.zza.zzj();
    }

    public final zzei zzb() {
        if (this.zzb != null) goto L5;
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L8:
        if (this.zzb == null) goto L15;
        zzei r02 = this.zzb;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        return r02;
    L15:
        if (this.zza != null) goto L17;
        this.zzb = zzei.zzb;     // Catch: Throwable -> L12
    L18:
        zzei r03 = this.zzb;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        return r03;
    L17:
        this.zzb = this.zza.zzf();     // Catch: Throwable -> L12
        goto L18
    L5:
        return this.zzb;
    }

    public final zzgl zzc(zzgl r3) {
        zzgl r02 = this.zza;
        this.zzb = null;
        this.zza = r3;
        return r02;
    }

    public final void zzd(zzgl r2) {
        if (this.zza != null) goto L23;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L7:
        if (this.zza == null) goto L21;
        monitor-exit(this);     // Catch: Throwable -> L10
        return;
    L21:
        this.zza = r2;     // Catch: Throwable -> L10 zzfq -> L14
        this.zzb = zzei.zzb;     // Catch: Throwable -> L10 zzfq -> L14
    L16:
        monitor-exit(this);     // Catch: Throwable -> L10
        return;
    L15:
        this.zzc = true;     // Catch: Throwable -> L10
        this.zza = r2;     // Catch: Throwable -> L10
        this.zzb = zzei.zzb;     // Catch: Throwable -> L10
        goto L16
    }
}
