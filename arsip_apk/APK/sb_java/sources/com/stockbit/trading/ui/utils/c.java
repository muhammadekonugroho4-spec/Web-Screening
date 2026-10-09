package com.stockbit.trading.ui.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.widget.l;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class c {
    public static final /* synthetic */ TextView a(Context r02, int r1) {
        return b(r02, r1);
    }

    public static final TextView b(Context r3, int r4) {
        TextView r02 = new TextView(r3, null, 0, r4);
        TypedArray r32 = r3.obtainStyledAttributes(r4, new int[]{androidx.appcompat.a.f2289J});
        p.k(r32, "obtainStyledAttributes(...)");
        l.j(r02, r32.getDimensionPixelSize(0, r02.getLineHeight()));
        r32.recycle();
        return r02;
    }
}
