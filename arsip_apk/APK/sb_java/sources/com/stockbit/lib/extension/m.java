package com.stockbit.lib.extension;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.y;

/* loaded from: classes10.dex */
public abstract class m {
    public static final boolean a(Long r3) {
        if (r3 == null) goto L11;
        String r32 = String.valueOf(r3.longValue());
        if (r32 == null) goto L11;
        if (r32.length() != 0) goto L9;
        return true;
    L9:
        return false;
    L11:
        return true;
    }

    public static final long b(long r2) {
        return r2 * 1000;
    }

    public static final long c(Long r2) {
        if (r2 != null) goto L4;
        return 0;
    L4:
        return r2.longValue();
    }

    public static final String d(long r6, int r8) {
        long r62 = r6 % 86400;
        long r02 = 3600;
        long r2 = (r62 / r02) + r8;
        long r63 = r62 % r02;
        long r03 = 60;
        y r82 = y.f177509a;
        String r64 = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(r2), Long.valueOf(r63 / r03), Long.valueOf(r63 % r03)}, 3));
        kotlin.jvm.internal.p.k(r64, "format(...)");
        return r64;
    }

    public static final String e(long r2) {
        NumberFormat r02 = NumberFormat.getInstance(Locale.US);
        r02.setMinimumFractionDigits(0);
        r02.setMaximumFractionDigits(0);
        r02.setRoundingMode(RoundingMode.DOWN);
        String r22 = r02.format(r2);
        kotlin.jvm.internal.p.k(r22, "format(...)");
        return r22;
    }

    public static final int f(Long r2) {
        if (r2 != null) goto L4;
        return 0;
    L4:
        return (int) r2.longValue();
    }
}
