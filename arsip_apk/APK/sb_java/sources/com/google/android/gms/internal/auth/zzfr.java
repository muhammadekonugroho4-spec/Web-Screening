package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzfr {
    public zzfr() {
    }

    public static final Object zza(Object r1, Object r2) {
        zzfq r12 = (zzfq) r1;
        zzfq r22 = (zzfq) r2;
        if (r22.isEmpty() == false) goto L5;
    L8:
        return r12;
    L5:
        if (r12.zze() == true) goto L7;
        r12 = r12.zzb();
    L7:
        r12.zzd(r22);
        goto L8
    }
}
