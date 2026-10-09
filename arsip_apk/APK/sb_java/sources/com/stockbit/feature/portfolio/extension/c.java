package com.stockbit.feature.portfolio.extension;

import java.util.Arrays;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;

/* loaded from: classes9.dex */
public abstract class c {
    public static final String a(double r1) {
        y r02 = y.f177509a;
        String r12 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(r1)}, 1));
        p.k(r12, "format(...)");
        return r12;
    }
}
