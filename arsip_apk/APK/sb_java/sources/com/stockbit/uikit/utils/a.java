package com.stockbit.uikit.utils;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {
    public static final int a(Context r1, int r2, TypedValue r3, boolean r4) {
        p.l(r1, "<this>");
        p.l(r3, "typedValue");
        r1.getTheme().resolveAttribute(r2, r3, r4);
        return r3.data;
    }

    public static /* synthetic */ int b(Context r02, int r1, TypedValue r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = new TypedValue();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = true;
    L9:
        return a(r02, r1, r2, r3);
    }

    public static final int c(Context r1, int r2, TypedValue r3, boolean r4) {
        p.l(r1, "<this>");
        p.l(r3, "typedValue");
        r1.getTheme().resolveAttribute(r2, r3, r4);
        return r3.resourceId;
    }

    public static /* synthetic */ int d(Context r02, int r1, TypedValue r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = new TypedValue();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = true;
    L9:
        return c(r02, r1, r2, r3);
    }
}
