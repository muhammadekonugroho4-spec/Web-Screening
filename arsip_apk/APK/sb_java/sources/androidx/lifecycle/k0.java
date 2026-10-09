package androidx.lifecycle;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class k0 {
    public static final InterfaceC4025u a(View r3) {
        kotlin.jvm.internal.p.l(r3, "<this>");
    L4:
        if (r3 == null) goto L15;
        Object r1 = r3.getTag(androidx.lifecycle.runtime.a.f25730a);
        if ((r1 instanceof InterfaceC4025u) == false) goto L8;
        InterfaceC4025u r12 = (InterfaceC4025u) r1;
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

    public static final void b(View r1, InterfaceC4025u r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        r1.setTag(androidx.lifecycle.runtime.a.f25730a, r2);
    }
}
