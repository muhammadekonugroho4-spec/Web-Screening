package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzdk(zzdj r1) {
        r1.getClass();
        this.zza = r1;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("Suppliers.memoize(");
        if (this.zzb == false) goto L5;
        Object r1 = "<supplier that returned " + this.zzc + ">";
    L6:
        r02.append(r1);
        r02.append(")");
        return r02.toString();
    L5:
        r1 = this.zza;
        goto L6
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (this.zzb == true) goto L17;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L6:
        if (this.zzb == true) goto L12;
        Object r02 = this.zza.zza();     // Catch: Throwable -> L10
        this.zzc = r02;     // Catch: Throwable -> L10
        this.zzb = true;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r02;
    L12:
        monitor-exit(this);     // Catch: Throwable -> L10
    L17:
        return this.zzc;
    }
}
