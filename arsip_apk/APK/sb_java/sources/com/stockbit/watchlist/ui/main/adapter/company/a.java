package com.stockbit.watchlist.ui.main.adapter.company;

import android.content.Context;
import android.view.View;
import com.stockbit.common.e;
import com.stockbit.uikit.b;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {
    default View h() {
        return null;
    }

    default View i() {
        return null;
    }

    View n();

    default void q(boolean r8, boolean r9) {
        View r02 = n();
        if (r8 == false) goto L6;
        int r92 = b.f151238T;
    L5:
        int r2 = r92;
        Context r1 = r02.getContext();
        p.k(r1, "getContext(...)");
        r02.setBackgroundColor(com.stockbit.uikit.utils.a.b(r1, r2, null, false, 6, null));
        View r03 = i();
        if (r03 == null) goto L12;
        Context r12 = r03.getContext();
        p.k(r12, "getContext(...)");
        r03.setBackgroundColor(com.stockbit.uikit.utils.a.b(r12, r2, null, false, 6, null));
    L12:
        View r04 = h();
        if (r04 == null) goto L19;
        if (r8 == false) goto L16;
        Context r13 = r04.getContext();
        p.k(r13, "getContext(...)");
        int r82 = com.stockbit.uikit.utils.a.b(r13, b.f151238T, null, false, 6, null);
    L17:
        r04.setBackgroundColor(r82);
        return;
    L16:
        r82 = 0;
        goto L17
    L19:
        return;
    L6:
        if (r9 == false) goto L8;
        r92 = e.f60456R;
        goto L5
    L8:
        r92 = b.f151237S;
        goto L5
    }
}
