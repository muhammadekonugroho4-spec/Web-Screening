package com.stockbit.component.pulltorefresh;

import com.stockbit.component.pulltorefresh.AbstractC6521a;

/* loaded from: classes7.dex */
public interface u {
    default float a(int r1) {
        return 0.56f;
    }

    default AbstractC6521a b() {
        if (f() == false) goto L7;
        return AbstractC6521a.e.f74247a;
    L7:
        return AbstractC6521a.d.f74246a;
    }

    int c();

    int d();

    boolean e();

    boolean f();
}
