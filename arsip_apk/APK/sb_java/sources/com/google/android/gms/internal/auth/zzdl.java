package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzdl implements zzdj {
    volatile zzdj zza;
    volatile boolean zzb;
    Object zzc;

    public zzdl(zzdj r1) {
        r1.getClass();
        this.zza = r1;
    }

    public final String toString() {
        Object r02 = this.zza;
        StringBuilder r1 = new StringBuilder();
        r1.append("Suppliers.memoize(");
        if (r02 != null) goto L5;
        r02 = "<supplier that returned " + this.zzc + ">";
    L5:
        r1.append(r02);
        r1.append(")");
        return r1.toString();
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
        zzdj r02 = this.zza;     // Catch: Throwable -> L10
        r02.getClass();     // Catch: Throwable -> L10
        Object r03 = r02.zza();     // Catch: Throwable -> L10
        this.zzc = r03;     // Catch: Throwable -> L10
        this.zzb = true;     // Catch: Throwable -> L10
        this.zza = null;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r03;
    L12:
        monitor-exit(this);     // Catch: Throwable -> L10
    L17:
        return this.zzc;
    }
}
