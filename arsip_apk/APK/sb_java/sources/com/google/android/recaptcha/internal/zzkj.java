package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class zzkj {
    public static int zza(int r5, int r6, RoundingMode r7) {
        r7.getClass();
        if (r6 == 0) goto L35;
        int r02 = r5 / r6;
        int r1 = r5 - (r6 * r02);
        if (r1 == 0) goto L38;
        int r3 = 1;
        int r52 = ((r5 ^ r6) >> 31) | 1;
        switch(zzki.zza[r7.ordinal()]) {
            case 1: goto L32;
            case 2: goto L36;
            case 3: goto L29;
            case 4: goto L31;
            case 5: goto L26;
            case 6: goto L11;
            case 7: goto L11;
            case 8: goto L11;
            default: goto L10;
        };
    L11:
        int r12 = Math.abs(r1);
        int r13 = r12 - (Math.abs(r6) - r12);
        if (r13 == 0) goto L14;
        if (r13 > 0) goto L31;
        return r02;
    L14:
        if (r7 == RoundingMode.HALF_UP) goto L31;
        if (r7 == RoundingMode.HALF_EVEN) goto L20;
        r3 = 0;
    L20:
        if (((r02 & 1) & r3) != 0) goto L31;
        return r02;
    L26:
        if (r52 > 0) goto L31;
        return r02;
    L29:
        if (r52 < 0) goto L31;
        return r02;
    L32:
        zzkl.zzb(false);
        return r02;
    L36:
        return r02;
    L10:
        throw new AssertionError();
    L31:
        return r02 + r52;
    L38:
        return r02;
    L35:
        throw new ArithmeticException("/ by zero");
    }

    public static int zzb(int r1, RoundingMode r2) {
        if (r1 <= 0) goto L19;
        switch(zzki.zza[r2.ordinal()]) {
            case 1: goto L12;
            case 2: goto L17;
            case 3: goto L17;
            case 4: goto L10;
            case 5: goto L10;
            case 6: goto L7;
            case 7: goto L7;
            case 8: goto L7;
            default: goto L6;
        };
    L7:
        int r22 = Integer.numberOfLeadingZeros(r1);
        return (31 - r22) + ((((-1257966797) >>> r22) - r1) >>> 31);
    L6:
        throw new AssertionError();
    L10:
        return 32 - Integer.numberOfLeadingZeros(r1 - 1);
    L12:
        if (((r1 - 1) & r1) != 0) goto L14;
        boolean r23 = true;
    L15:
        zzkl.zzb(r23);
        goto L17
    L14:
        r23 = false;
    L17:
        return 31 - Integer.numberOfLeadingZeros(r1);
    L19:
        throw new IllegalArgumentException("x (0) must be > 0");
    }
}
