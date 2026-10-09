package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = null;

    static {
        zzb = new ConcurrentHashMap();
    }

    public static final void zza(int r4, long r5) {
        ConcurrentHashMap r02 = zzb;
        Integer r42 = Integer.valueOf(r4);
        Object r1 = r02.get(r42);
        if (r1 != null) goto L5;
        r1 = new zzbj();
    L5:
        zzbj r12 = (zzbj) r1;
        r12.zzg(r12.zzb() + 1);
        r12.zzf(r12.zzd() + r5);
        r12.zze(Math.max(r5, r12.zzc()));
        r02.put(r42, r12);
    }
}
