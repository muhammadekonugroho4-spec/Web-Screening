package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class n {
    public static final j a(View r3) {
        p.l(r3, "<this>");
    L4:
        if (r3 == null) goto L15;
        Object r1 = r3.getTag(a.f28016a);
        if ((r1 instanceof j) == false) goto L8;
        j r12 = (j) r1;
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

    public static final void b(View r1, j r2) {
        p.l(r1, "<this>");
        r1.setTag(a.f28016a, r2);
    }
}
