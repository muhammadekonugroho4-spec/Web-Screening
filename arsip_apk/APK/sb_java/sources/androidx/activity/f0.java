package androidx.activity;

import android.view.View;

/* loaded from: classes.dex */
public abstract class f0 {
    public static final a0 a(View r3) {
        kotlin.jvm.internal.p.l(r3, "<this>");
    L4:
        if (r3 == null) goto L15;
        Object r1 = r3.getTag(b0.f2121b);
        if ((r1 instanceof a0) == false) goto L8;
        a0 r12 = (a0) r1;
    L9:
        if (r12 != null) goto L10;
        Object r32 = androidx.core.viewtree.b.a(r3);
        if ((r32 instanceof View) == true) goto L13;
        r3 = null;
        goto L4
    L13:
        r3 = (View) r32;
        goto L4
    L10:
        return r12;
    L8:
        r12 = null;
        goto L9
    L15:
        return null;
    }

    public static final void b(View r1, a0 r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "onBackPressedDispatcherOwner");
        r1.setTag(b0.f2121b, r2);
    }
}
