package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public final class zzkk {
    public static long zza(long r13, long r15) {
        boolean r1 = false;
        if ((r13 ^ r15) >= 0) goto L5;
        boolean r02 = true;
    L6:
        long r5 = r13 + r15;
        if ((r13 ^ r5) < 0) goto L9;
        r1 = true;
    L9:
        zzkl.zza(r02 | r1, "checkedAdd", r13, r15);
        return r5;
    L5:
        r02 = false;
        goto L6
    }

    public static long zzb(long r11, long r13) {
        boolean r14 = false;
        if ((1 ^ r11) < 0) goto L5;
        boolean r132 = true;
    L6:
        long r3 = (-1) + r11;
        if ((r11 ^ r3) < 0) goto L9;
        r14 = true;
    L9:
        zzkl.zza(r132 | r14, "checkedSubtract", r11, 1);
        return r3;
    L5:
        r132 = false;
        goto L6
    }
}
