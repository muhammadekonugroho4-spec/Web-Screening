package com.skydoves.balloon.extensions;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class f {
    public static /* synthetic */ void a(View r02, long r1) {
        c(r02, r1);
    }

    public static final /* synthetic */ void b(final View r1, final long r2) {
        p.l(r1, "<this>");
        r1.setVisibility(4);
        r1.post(new e(r1, r2));
    }

    public static final void c(View r4, long r5) {
        p.l(r4, "$this_circularRevealed");
        if (r4.isAttachedToWindow() == false) goto L6;
        r4.setVisibility(0);
        Animator r42 = ViewAnimationUtils.createCircularReveal(r4, (r4.getLeft() + r4.getRight()) / 2, (r4.getTop() + r4.getBottom()) / 2, 0.0f, Math.max(r4.getWidth(), r4.getHeight()));
        r42.setDuration(r5);
        r42.start();
        return;
    }

    public static final /* synthetic */ int d(View r2, boolean r3) {
        p.l(r2, "<this>");
        Rect r02 = new Rect();
        Context r22 = r2.getContext();
        if ((r22 instanceof Activity) == false) goto L7;
        if (r3 == false) goto L9;
        ((Activity) r22).getWindow().getDecorView().getWindowVisibleDisplayFrame(r02);
        return r02.top;
    L9:
        return 0;
    L7:
        return 0;
    }

    public static final /* synthetic */ Point e(View r3) {
        p.l(r3, "<this>");
        int[] r1 = {0, 0};
        r3.getLocationOnScreen(r1);
        return new Point(r1[0], r1[1]);
    }

    public static final /* synthetic */ void f(View r1, boolean r2) {
        p.l(r1, "<this>");
        if (r2 == false) goto L5;
        int r22 = 0;
    L6:
        r1.setVisibility(r22);
        return;
    L5:
        r22 = 8;
        goto L6
    }
}
