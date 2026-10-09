package com.stockbit.usecase.company.utils;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a {
    public static final String a(double r2) {
        NumberFormat r02 = NumberFormat.getInstance(Locale.US);
        r02.setMinimumFractionDigits(0);
        r02.setMaximumFractionDigits(0);
        r02.setRoundingMode(RoundingMode.HALF_EVEN);
        return "Rp" + r02.format(r2);
    L5:
        return "Rp-";
    }
}
