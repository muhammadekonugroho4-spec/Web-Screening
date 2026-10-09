package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzbz {
    public static long zza(long r13, long r15) {
        boolean r1 = false;
        if ((r13 ^ r15) >= 0) goto L5;
        boolean r02 = true;
    L6:
        long r5 = r13 + r15;
        if ((r13 ^ r5) < 0) goto L9;
        r1 = true;
    L9:
        zzd(r02 | r1, "checkedAdd", r13, r15);
        return r5;
    L5:
        r02 = false;
        goto L6
    }

    public static long zzb(long r11, long r13) {
        int r6 = ((Long.numberOfLeadingZeros(r11) + Long.numberOfLeadingZeros(~r11)) + Long.numberOfLeadingZeros(r13)) + Long.numberOfLeadingZeros(~r13);
        long r7 = r11 * r13;
        if (r6 <= 65) goto L6;
        return r7;
    L6:
        if (r6 < 64) goto L8;
        boolean r02 = true;
    L9:
        zzd(r02, "checkedMultiply", r11, r13);
        if (r11 < 0) goto L12;
        boolean r03 = true;
    L14:
        if (r13 == Long.MIN_VALUE) goto L16;
        boolean r1 = true;
    L17:
        zzd(r03 | r1, "checkedMultiply", r11, r13);
        if (r11 != 0) goto L20;
    L21:
        boolean r04 = true;
    L23:
        zzd(r04, "checkedMultiply", r11, r13);
        return r7;
    L20:
        if ((r7 / r11) == r13) goto L21;
        r04 = false;
        goto L23
    L16:
        r1 = false;
        goto L17
    L12:
        r03 = false;
        goto L14
    L8:
        r02 = false;
        goto L9
    }

    public static long zzc(long r13, long r15) {
        boolean r1 = false;
        if ((r13 ^ r15) < 0) goto L5;
        boolean r02 = true;
    L6:
        long r5 = r13 - r15;
        if ((r13 ^ r5) < 0) goto L9;
        r1 = true;
    L9:
        zzd(r02 | r1, "checkedSubtract", r13, r15);
        return r5;
    L5:
        r02 = false;
        goto L6
    }

    private static void zzd(boolean r2, String r3, long r4, long r6) {
        if (r2 == false) goto L5;
        return;
    L5:
        throw new ArithmeticException("overflow: " + r3 + "(" + r4 + ", " + r6 + ")");
    }
}
