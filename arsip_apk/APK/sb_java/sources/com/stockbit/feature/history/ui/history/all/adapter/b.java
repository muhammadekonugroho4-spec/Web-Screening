package com.stockbit.feature.history.ui.history.all.adapter;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final View[] f97982a;

    /* renamed from: b, reason: collision with root package name */
    public final List f97983b;

    /* renamed from: c, reason: collision with root package name */
    public final List f97984c;

    static {
    }

    public b(View... r6) {
        p.l(r6, "views");
        this.f97982a = r6;
        ArrayList r02 = new ArrayList(r6.length);
        int r1 = r6.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        ViewGroup.LayoutParams r4 = r6[r3].getLayoutParams();
        if (r4 == null) goto L7;
        int r42 = r4.width;
    L8:
        r02.add(Integer.valueOf(r42));
        r3 = r3 + 1;
        goto L3
    L7:
        r42 = 0;
        goto L8
    L9:
        this.f97983b = r02;
        View[] r62 = this.f97982a;
        ArrayList r03 = new ArrayList(r62.length);
        int r12 = r62.length;
    L10:
        if (r2 >= r12) goto L12;
        r03.add(Float.valueOf(c.a(r62[r2])));
        r2 = r2 + 1;
        goto L10
    L12:
        this.f97984c = r03;
    }

    public final void a() {
        View[] r02 = this.f97982a;
        int r1 = r02.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        c.c(r02[r2], ((Number) this.f97983b.get(r3)).intValue(), ((Number) this.f97984c.get(r3)).floatValue());
        r2 = r2 + 1;
        r3 = r3 + 1;
        goto L3
    }
}
