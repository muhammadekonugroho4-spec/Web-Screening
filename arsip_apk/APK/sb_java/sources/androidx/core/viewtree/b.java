package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class b {
    public static final ViewParent a(View r1) {
        p.l(r1, "<this>");
        ViewParent r02 = r1.getParent();
        if (r02 == null) goto L5;
        return r02;
    L5:
        Object r12 = r1.getTag(a.f23358a);
        if ((r12 instanceof ViewParent) == true) goto L8;
        return null;
    L8:
        return (ViewParent) r12;
    }

    public static final void b(View r1, ViewParent r2) {
        p.l(r1, "<this>");
        r1.setTag(a.f23358a, r2);
    }
}
