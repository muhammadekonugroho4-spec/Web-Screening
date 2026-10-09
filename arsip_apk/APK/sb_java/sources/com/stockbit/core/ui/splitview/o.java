package com.stockbit.core.ui.splitview;

import android.content.res.Resources;

/* loaded from: classes8.dex */
public abstract class o {
    public static final int a(int r1, Resources r2) {
        kotlin.jvm.internal.p.l(r2, "resources");
        return (int) (r1 * r2.getDisplayMetrics().density);
    }

    public static final int b(int r1, Resources r2) {
        kotlin.jvm.internal.p.l(r2, "resources");
        return (int) (r1 / r2.getDisplayMetrics().density);
    }
}
