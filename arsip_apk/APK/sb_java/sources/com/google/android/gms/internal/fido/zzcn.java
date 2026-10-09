package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* loaded from: classes5.dex */
final class zzcn {
    static final String zza = null;
    static final Comparator zzb = null;

    static {
        String r02 = zzcn.class.getName().concat("$UnsafeComparator");
        zza = r02;
        Object[] r03 = Class.forName(r02).getEnumConstants();     // Catch: Throwable -> L5
        r03.getClass();     // Catch: Throwable -> L5
        Comparator r04 = (Comparator) r03[0];     // Catch: Throwable -> L5
    L6:
        zzb = r04;
        return;
    L5:
        r04 = zzcm.zza;
        goto L6
    }

    public zzcn() {
    }
}
