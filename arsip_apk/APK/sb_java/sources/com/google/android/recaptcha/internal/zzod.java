package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
final class zzod {
    public zzod() {
    }

    public static final boolean zza(Object r02) {
        if (((zzoc) r02).zze() == true) goto L6;
        return true;
    L6:
        return false;
    }

    public static final Object zzb(Object r1, Object r2) {
        zzoc r12 = (zzoc) r1;
        zzoc r22 = (zzoc) r2;
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
