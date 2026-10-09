package com.stockbit.android.extension;

import android.content.res.Resources;

/* loaded from: classes6.dex */
public abstract class E0 {
    public static final int a(int r1) {
        return (int) (r1 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int b(int r1) {
        return (int) (r1 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int c(int r2) {
        return (int) Math.ceil(r2 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final boolean d(int r02) {
        if (r02 != 0) goto L5;
        return true;
    L5:
        return false;
    }
}
