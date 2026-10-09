package com.stockbit.watchlist.ui.main.adapter.company.delegate;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public abstract class A {
    public static final /* synthetic */ int a(Context r02, int r1) {
        return b(r02, r1);
    }

    public static final int b(Context r1, int r2) {
        TypedArray r12 = r1.obtainStyledAttributes(new TypedValue().data, new int[]{r2});
        kotlin.jvm.internal.p.k(r12, "obtainStyledAttributes(...)");
        int r22 = r12.getColor(0, 0);
        r12.recycle();
        return r22;
    }
}
