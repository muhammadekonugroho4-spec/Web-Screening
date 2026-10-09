package com.google.android.gms.internal.time;

import java.util.Set;

/* loaded from: classes5.dex */
public abstract class zzfm {
    private static final zzfm zza = null;

    static {
        zza = new zzff();
    }

    public /* synthetic */ zzfm(zzfl r1) {
    }

    public static zzfm zzh(zzet r3, zzet r4) {
        int r02 = r4.zza();
        if (r02 == 0) goto L5;
        zzfl r2 = null;
        if (r02 > 28) goto L11;
        return new zzfj(r3, r4, r2);
    L11:
        return new zzfk(r3, r4, r2);
    L5:
        return zza;
    }

    public abstract int zza();

    public abstract Set zzb();

    public abstract void zzc(zzfb r1, Object r2);
}
