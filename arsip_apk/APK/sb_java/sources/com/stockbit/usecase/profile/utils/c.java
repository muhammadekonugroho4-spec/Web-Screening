package com.stockbit.usecase.profile.utils;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class c {
    public static final String a(int r9) {
        if (r9 <= 0) goto L14;
        String r1 = String.valueOf(r9);
        int r3 = 1;
        if (r9 >= 100000) goto L7;
    L10:
        String r92 = d.d(r1, true, r3, true, 100000, false, 16, null);
        if (r92 != null) goto L13;
        return "0";
    L13:
        return r92;
    L7:
        if ((r9 - 100000) > 100) goto L10;
        r3 = 0;
        goto L10
    L14:
        return "0";
    }

    public static final String b(Double r3) {
        NumberFormat r02 = NumberFormat.getInstance(Locale.US);
        r02.setMinimumFractionDigits(0);
        r02.setMaximumFractionDigits(0);
        r02.setRoundingMode(RoundingMode.HALF_EVEN);
        if ((r02 instanceof DecimalFormat) == false) goto L6;
        ((DecimalFormat) r02).setDecimalSeparatorAlwaysShown(false);
    L6:
        return r02.format(r3);
    }
}
