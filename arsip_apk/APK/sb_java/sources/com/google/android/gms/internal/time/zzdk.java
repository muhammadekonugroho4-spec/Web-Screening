package com.google.android.gms.internal.time;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class zzdk {
    private final ConcurrentHashMap zza;

    public zzdk() {
        this.zza = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ ConcurrentHashMap zzc(zzdk r02) {
        return r02.zza;
    }

    public abstract Object zza();

    public final Object zzb(zzdi r7, zzet r8) {
        Object r02 = this.zza.get(r7);
        if (r02 == null) goto L5;
        return r02;
    L5:
        Object r03 = zza();
        Object r1 = this.zza.putIfAbsent(r7, r03);
        if (r1 != null) goto L19;
        int r12 = r8.zza();
        int r2 = 0;
        zzdj r3 = null;
    L8:
        if (r2 >= r12) goto L18;
        if (zzdd.zzf.equals(r8.zzb(r2)) == false) goto L17;
        Object r4 = r8.zzd(r2);
        if ((r4 instanceof zzdo) == false) goto L17;
        if (r3 != null) goto L16;
        r3 = new zzdj(this, r7);
    L16:
        ((zzdo) r4).zza();
    L17:
        r2 = r2 + 1;
        goto L8
    L18:
        return r03;
    L19:
        return r1;
    }
}
