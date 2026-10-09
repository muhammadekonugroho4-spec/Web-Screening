package com.stockbit.usecase.social.subscription.utils;

import com.stockbit.domain.helper.c;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {
    public static final String a(String r14, String r15) {
        p.l(r14, "<this>");
        p.l(r15, "newFormat");
        Date r8 = c.k(r14, null, null, null, null, 15, null);
        if (r8 == null) goto L5;
        String r142 = c.f(r8, r15, null, null, 6, null);
    L6:
        if (r142 != null) goto L9;
        return "";
    L9:
        return r142;
    L5:
        r142 = null;
        goto L6
    }

    public static final String b(double r3) {
        NumberFormat r02 = NumberFormat.getInstance(Locale.US);
        r02.setMinimumFractionDigits(0);
        r02.setMaximumFractionDigits(0);
        r02.setRoundingMode(RoundingMode.HALF_EVEN);
        return "Rp" + r02.format(r3);
    L5:
        return "Rp-";
    }
}
