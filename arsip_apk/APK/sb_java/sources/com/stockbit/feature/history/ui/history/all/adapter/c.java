package com.stockbit.feature.history.ui.history.all.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class c {
    public static final /* synthetic */ float a(View r02) {
        return b(r02);
    }

    public static final float b(View r1) {
        ViewGroup.LayoutParams r12 = r1.getLayoutParams();
        if ((r12 instanceof LinearLayout.LayoutParams) == false) goto L7;
        return ((LinearLayout.LayoutParams) r12).weight;
    L7:
        if ((r12 instanceof ConstraintLayout.LayoutParams) == true) goto L9;
        return 0.0f;
    L9:
        return ((ConstraintLayout.LayoutParams) r12).f22202L;
    }

    public static final void c(View r3, int r4, float r5) {
        p.l(r3, "<this>");
        ViewGroup.LayoutParams r02 = r3.getLayoutParams();
        if ((r02 instanceof LinearLayout.LayoutParams) == false) goto L12;
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) r02;
        if (r1.width == r4) goto L7;
    L9:
        r1.width = r4;
        r1.weight = r5;
        r3.setLayoutParams(r02);
        return;
    L7:
        if (r1.weight != r5) goto L9;
        return;
    L12:
        if ((r02 instanceof ConstraintLayout.LayoutParams) == false) goto L20;
        ConstraintLayout.LayoutParams r12 = (ConstraintLayout.LayoutParams) r02;
        if (((ViewGroup.MarginLayoutParams) r12).width == r4) goto L16;
    L18:
        ((ViewGroup.MarginLayoutParams) r12).width = r4;
        r12.f22202L = r5;
        r3.setLayoutParams(r02);
        return;
    L16:
        if (r12.f22202L != r5) goto L18;
        return;
    }
}
