package com.google.android.gms.internal.fido;

/* loaded from: classes5.dex */
final class zzas {
    public static void zza(Object r2, Object r3) {
        if (r2 == null) goto L8;
        if (r3 == null) goto L6;
        return;
    L6:
        throw new NullPointerException("null value in entry: " + r2.toString() + "=null");
    L8:
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(r3)));
    }
}
