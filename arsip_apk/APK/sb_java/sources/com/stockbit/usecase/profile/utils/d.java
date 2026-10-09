package com.stockbit.usecase.profile.utils;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.text.B;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class d {
    public static final String a(long r6) {
        if (r6 < 1000000) goto L5;
        double r62 = r6;
        int r02 = (int) (Math.log(r62) / Math.log(1000000.0d));
        y r1 = y.f177509a;
        String r63 = String.format(Locale.US, "%.2f%c", Arrays.copyOf(new Object[]{Double.valueOf(r62 / Math.pow(1000000.0d, r02)), Character.valueOf("MBTPE".charAt(r02 - 1))}, 2));
        p.k(r63, "format(...)");
        return r63;
    L5:
        return "" + c.b(Double.valueOf(r6));
    }

    public static final String b(long r6, int r8, boolean r9, int r10, boolean r11) {
        if (r6 < r10) goto L5;
        double r62 = r6;
        int r102 = (int) (Math.log(r62) / Math.log(1000.0d));
        double r02 = r102;
        double r4 = r62 / Math.pow(1000.0d, r02);
        if (r11 == false) goto L9;
        double r63 = r62 / Math.pow(1000.0d, r02);
        double r03 = r8;
        r4 = Math.floor(r63 * Math.pow(10.0d, r03)) / Math.pow(10.0d, r03);
    L9:
        y r64 = y.f177509a;
        if (r9 == false) goto L12;
        Locale r65 = Locale.GERMANY;
    L13:
        String r66 = String.format(r65, "%." + r8 + "f%c", Arrays.copyOf(new Object[]{Double.valueOf(r4), Character.valueOf("KMBTPE".charAt(r102 - 1))}, 2));
        p.k(r66, "format(...)");
        return r66;
    L12:
        r65 = Locale.US;
        goto L13
    L5:
        return "" + c.b(Double.valueOf(r6));
    }

    public static final String c(String r4, boolean r5, int r6, boolean r7, int r8, boolean r9) {
        p.l(r4, "<this>");
        boolean r3 = false;
        if (B.g0(r4, "-", false, 2, null) == false) goto L5;
        r4 = new Regex("-").m(r4, "");
        r3 = true;
    L5:
        long r02 = kotlin.math.d.f(com.stockbit.domain.helper.d.d(r4));
        if (r5 == false) goto L8;
        String r42 = b(r02, r6, r7, r8, r9);
    L9:
        if (r3 == true) goto L11;
        return r42;
    L11:
        return '-' + r42;
    L8:
        r42 = a(r02);
        goto L9
    }

    public static /* synthetic */ String d(String r6, boolean r7, int r8, boolean r9, int r10, boolean r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        r8 = 2;
    L5:
        int r2 = r8;
        if ((r12 & 4) == 0) goto L8;
        boolean r3 = false;
    L10:
        if ((r12 & 8) == 0) goto L12;
        r10 = 1000;
    L12:
        int r4 = r10;
        if ((r12 & 16) == 0) goto L16;
        boolean r5 = false;
    L18:
        return c(r6, r7, r2, r3, r4, r5);
    L16:
        r5 = r11;
        goto L18
    L8:
        r3 = r9;
        goto L10
    }
}
