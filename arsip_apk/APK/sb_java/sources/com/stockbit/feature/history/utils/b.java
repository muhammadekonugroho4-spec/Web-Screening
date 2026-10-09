package com.stockbit.feature.history.utils;

import android.content.Context;
import android.widget.TextView;
import com.stockbit.feature.history.d;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class b {
    public static final void a(TextView r7, Context r8) {
        p.l(r8, "context");
        if (r7 == null) goto L6;
        r7.setTextColor(com.stockbit.uikit.utils.a.b(r8, d.f96684b, null, false, 6, null));
        return;
    }

    public static final void b(TextView r7, Context r8) {
        p.l(r8, "context");
        if (r7 == null) goto L6;
        r7.setTextColor(com.stockbit.uikit.utils.a.b(r8, d.f96685c, null, false, 6, null));
        return;
    }

    public static final void c(TextView r7, Context r8) {
        p.l(r8, "context");
        if (r7 == null) goto L6;
        r7.setTextColor(com.stockbit.uikit.utils.a.b(r8, d.d, null, false, 6, null));
        return;
    }
}
