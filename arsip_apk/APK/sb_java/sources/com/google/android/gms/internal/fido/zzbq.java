package com.google.android.gms.internal.fido;

/* loaded from: classes5.dex */
public final class zzbq {
    public static Object zza(Object r2, int r3) {
        if (r2 == null) goto L5;
        return r2;
    L5:
        throw new NullPointerException("at index " + r3);
    }

    public static Object[] zzb(Object[] r2, int r3) {
        int r02 = 0;
    L3:
        if (r02 >= r3) goto L5;
        zza(r2[r02], r02);
        r02 = r02 + 1;
        goto L3
    L5:
        return r2;
    }
}
