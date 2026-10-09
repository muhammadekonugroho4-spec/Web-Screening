package com.stockbit.component.lazyasynclayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public interface a {
    static /* synthetic */ View F2(a r6, Integer r7, int r8, LayoutInflater r9, ViewGroup r10, boolean r11, int r12, Object r13) {
        if (r13 != null) goto L9;
        if ((r12 & 16) == 0) goto L7;
        r11 = false;
    L7:
        return r6.n0(r7, r8, r9, r10, r11);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLazyLayoutView");
    }

    void T1();

    View n0(Integer r1, int r2, LayoutInflater r3, ViewGroup r4, boolean r5);
}
