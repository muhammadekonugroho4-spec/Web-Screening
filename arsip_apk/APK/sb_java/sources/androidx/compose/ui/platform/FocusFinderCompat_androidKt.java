package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class FocusFinderCompat_androidKt {
    public static final /* synthetic */ void a(View r02, ArrayList r1, int r2) {
        d(r02, r1, r2);
    }

    public static final /* synthetic */ View b(View r02, View r1, int r2) {
        return e(r02, r1, r2);
    }

    public static final /* synthetic */ View c(View r02, View r1, int r2) {
        return h(r02, r1, r2);
    }

    public static final void d(View r1, ArrayList r2, int r3) {
        r1.addFocusables(r2, r3, r1.isInTouchMode() ? 1 : 0);
    }

    public static final View e(final View r3, final View r4, int r5) {
        if (r5 == 1) goto L13;
        if (r5 == 2) goto L7;
        return null;
    L7:
        int r52 = r3.getNextFocusForwardId();
        if (r52 != (-1)) goto L11;
        return null;
    L11:
        return h(r4, r3, r52);
    L13:
        if (r3.getId() != (-1)) goto L16;
        return null;
    L16:
        return f(r4, r3, new FocusFinderCompat_androidKt$findUserSetNextFocus$1(r4, r3));
    }

    public static final View f(View r4, View r5, kotlin.jvm.functions.l r6) {
        View r1 = null;
    L3:
        View r12 = g(r5, r6, r1);
        if (r12 != null) goto L14;
        if (r5 == r4) goto L14;
        Object r13 = r5.getParent();
        if (r13 == null) goto L13;
        if ((r13 instanceof View) == false) goto L13;
        View r14 = (View) r13;
        r1 = r5;
        r5 = r14;
    L13:
        return null;
    L14:
        return r12;
    }

    public static final View g(View r3, kotlin.jvm.functions.l r4, View r5) {
        if (((Boolean) r4.invoke(r3)).booleanValue() == false) goto L6;
        return r3;
    L6:
        if ((r3 instanceof ViewGroup) == false) goto L15;
        ViewGroup r32 = (ViewGroup) r3;
        int r02 = r32.getChildCount();
        int r1 = 0;
    L8:
        if (r1 >= r02) goto L21;
        View r2 = r32.getChildAt(r1);
        if (r2 == r5) goto L14;
        View r22 = g(r2, r4, r5);
        if (r22 == null) goto L14;
        return r22;
    L14:
        r1 = r1 + 1;
        goto L8
    L21:
        return null;
    L15:
        return null;
    }

    public static final View h(View r1, View r2, final int r3) {
        return f(r1, r2, new FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1(r3));
    }
}
