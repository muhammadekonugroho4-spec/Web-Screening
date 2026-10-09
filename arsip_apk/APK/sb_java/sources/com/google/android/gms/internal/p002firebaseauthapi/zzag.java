package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzag {
    public static int zza(int r2, String r3) {
        if (r2 < 0) goto L5;
        return r2;
    L5:
        throw new IllegalArgumentException(r3 + " cannot be negative but was: " + r2);
    }

    public static void zza(Object r2, Object r3) {
        if (r2 == null) goto L8;
        if (r3 == null) goto L6;
        return;
    L6:
        throw new NullPointerException("null value in entry: " + String.valueOf(r2) + "=null");
    L8:
        throw new NullPointerException("null key in entry: null=" + String.valueOf(r3));
    }
}
