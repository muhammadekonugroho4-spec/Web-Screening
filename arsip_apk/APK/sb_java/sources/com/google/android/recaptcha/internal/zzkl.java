package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
final class zzkl {
    public static void zza(boolean r2, String r3, long r4, long r6) {
        if (r2 == false) goto L5;
        return;
    L5:
        throw new ArithmeticException("overflow: " + r3 + "(" + r4 + ", " + r6 + ")");
    }

    public static void zzb(boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
