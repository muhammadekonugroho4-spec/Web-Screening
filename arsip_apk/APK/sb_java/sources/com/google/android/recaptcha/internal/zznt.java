package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public class zznt {
    protected volatile zzoi zza;
    private volatile zzle zzb;

    public zznt() {
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof zznt) == true) goto L9;
        return false;
    L9:
        zznt r32 = (zznt) r3;
        zzoi r02 = this.zza;
        zzoi r1 = r32.zza;
        if (r02 != null) goto L15;
        if (r1 != null) goto L15;
        return zzb().equals(r32.zzb());
    L15:
        if (r02 == null) goto L20;
        if (r1 == null) goto L20;
        return r02.equals(r1);
    L20:
        if (r02 == null) goto L23;
        r32.zzd(r02.zzm());
        return r02.equals(r32.zza);
    L23:
        zzd(r1.zzm());
        return this.zza.equals(r1);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb == null) goto L7;
        return ((zzlc) this.zzb).zza.length;
    L7:
        if (this.zza != null) goto L9;
        return 0;
    L9:
        return this.zza.zzo();
    }

    public final zzle zzb() {
        if (this.zzb != null) goto L5;
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L8:
        if (this.zzb == null) goto L15;
        zzle r02 = this.zzb;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        return r02;
    L15:
        if (this.zza != null) goto L17;
        this.zzb = zzle.zzb;     // Catch: Throwable -> L12
    L18:
        zzle r03 = this.zzb;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        return r03;
    L17:
        this.zzb = this.zza.zzb();     // Catch: Throwable -> L12
        goto L18
    L5:
        return this.zzb;
    }

    public final zzoi zzc(zzoi r3) {
        zzoi r02 = this.zza;
        this.zzb = null;
        this.zza = r3;
        return r02;
    }

    public final void zzd(zzoi r2) {
        if (this.zza != null) goto L22;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L7:
        if (this.zza == null) goto L19;
        monitor-exit(this);     // Catch: Throwable -> L10
        return;
    L19:
        this.zza = r2;     // Catch: Throwable -> L10 zznn -> L14
        this.zzb = zzle.zzb;     // Catch: Throwable -> L10 zznn -> L14
    L15:
        monitor-exit(this);     // Catch: Throwable -> L10
        return;
    L14:
        this.zza = r2;     // Catch: Throwable -> L10
        this.zzb = zzle.zzb;     // Catch: Throwable -> L10
        goto L15
    }
}
