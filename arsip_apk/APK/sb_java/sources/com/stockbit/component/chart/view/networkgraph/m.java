package com.stockbit.component.chart.view.networkgraph;

import java.util.Arrays;

/* loaded from: classes7.dex */
public abstract class m {
    public static final String a(double r4) {
        long r02 = (long) r4;
        if (r4 != r02) goto L6;
        StringBuilder r42 = new StringBuilder();
        r42.append(r02);
        r42.append('%');
        return r42.toString();
    L6:
        StringBuilder r03 = new StringBuilder();
        String r43 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(r4)}, 1));
        kotlin.jvm.internal.p.k(r43, "format(...)");
        r03.append(r43);
        r03.append('%');
        return r03.toString();
    }
}
