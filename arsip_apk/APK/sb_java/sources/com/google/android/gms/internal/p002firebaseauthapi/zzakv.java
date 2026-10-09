package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public class zzakv {
    private volatile zzaln zza;
    private volatile zzaiw zzb;
    private volatile boolean zzc;

    public zzakv() {
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof zzakv) == true) goto L9;
        return false;
    L9:
        zzakv r32 = (zzakv) r3;
        zzaln r02 = this.zza;
        zzaln r1 = r32.zza;
        if (r02 != null) goto L14;
        if (r1 != null) goto L14;
        return zzb().equals(r32.zzb());
    L14:
        if (r02 == null) goto L18;
        if (r1 == null) goto L18;
        return r02.equals(r1);
    L18:
        if (r02 == null) goto L22;
        return r02.equals(r32.zzb(r02.zzs()));
    L22:
        return zzb(r1.zzs()).equals(r1);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb == null) goto L7;
        return this.zzb.zzb();
    L7:
        if (this.zza != null) goto L9;
        return 0;
    L9:
        return this.zza.zzl();
    }

    public final zzaiw zzb() {
        if (this.zzb != null) goto L5;
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L8:
        if (this.zzb == null) goto L15;
        zzaiw r02 = this.zzb;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        return r02;
    L15:
        if (this.zza != null) goto L17;
        this.zzb = zzaiw.zza;     // Catch: Throwable -> L12
    L18:
        zzaiw r03 = this.zzb;     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        return r03;
    L17:
        this.zzb = this.zza.zzj();     // Catch: Throwable -> L12
        goto L18
    L5:
        return this.zzb;
    }

    public final zzaln zza(zzaln r3) {
        zzaln r02 = this.zza;
        this.zzb = null;
        this.zza = r3;
        return r02;
    }

    private final zzaln zzb(zzaln r2) {
        if (this.zza != null) goto L20;
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L6:
        if (this.zza == null) goto L21;
        monitor-exit(this);     // Catch: Throwable -> L9
        goto L20
    L21:
        this.zza = r2;     // Catch: Throwable -> L9 zzakm -> L13
        this.zzb = zzaiw.zza;     // Catch: Throwable -> L9 zzakm -> L13
    L15:
        monitor-exit(this);     // Catch: Throwable -> L9
        goto L20
    L14:
        this.zzc = true;     // Catch: Throwable -> L9
        this.zza = r2;     // Catch: Throwable -> L9
        this.zzb = zzaiw.zza;     // Catch: Throwable -> L9
    L20:
        return this.zza;
    }
}
