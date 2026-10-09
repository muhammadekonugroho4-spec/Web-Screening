package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC3894r0;
import androidx.core.view.g1;

/* loaded from: classes.dex */
public class E extends M {
    public E() {
    }

    @Override // androidx.activity.N
    public void b(d0 r2, d0 r3, Window r4, View r5, boolean r6, boolean r7) {
        kotlin.jvm.internal.p.l(r2, "statusBarStyle");
        kotlin.jvm.internal.p.l(r3, "navigationBarStyle");
        kotlin.jvm.internal.p.l(r4, "window");
        kotlin.jvm.internal.p.l(r5, "view");
        AbstractC3894r0.b(r4, false);
        r4.setStatusBarColor(r2.c(r6));
        r4.setNavigationBarColor(r3.c(r7));
        g1 r22 = new g1(r4, r5);
        r22.f(!r6);
        r22.e(!r7);
    }
}
