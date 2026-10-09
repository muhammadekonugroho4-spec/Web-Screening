package com.stockbit.uikit.utils;

import android.content.res.Resources;

/* loaded from: classes11.dex */
public abstract class b {
    public static final float a(float r1) {
        return r1 * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int b(int r1) {
        return (int) (r1 * Resources.getSystem().getDisplayMetrics().density);
    }
}
