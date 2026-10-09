package com.stockbit.search.utils;

import android.widget.TextView;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f135531a = null;

    static {
        f135531a = new c();
    }

    public c() {
    }

    public static final void a(TextView r3, Integer r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        if (r4 != null) goto L5;
        String r42 = "";
    L6:
        r3.setText(r42);
        return;
    L5:
        r42 = r3.getContext().getString(com.stockbit.search.i.f133835l0, new Object[]{r3.getContext().getString(r4.intValue())});
        goto L6
    }
}
