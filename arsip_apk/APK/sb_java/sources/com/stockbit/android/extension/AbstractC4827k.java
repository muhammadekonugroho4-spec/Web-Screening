package com.stockbit.android.extension;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.stockbit.android.extension.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4827k {
    public static final void a(View r4, boolean r5) {
        kotlin.jvm.internal.p.l(r4, "view");
        if (r4.getContext().getResources().getConfiguration().fontScale <= 1.0f) goto L8;
        if (r5 == false) goto L9;
        ViewGroup.LayoutParams r52 = r4.getLayoutParams();
        r52.height = (int) (r4.getLayoutParams().height * 1.05d);
        r4.setLayoutParams(r52);
        return;
    L9:
        return;
    }

    public static final void b(View r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "view");
        float r02 = r2.getContext().getResources().getConfiguration().fontScale;
        if (r02 <= 1.0f) goto L8;
        if (r3 == false) goto L9;
        ViewGroup.LayoutParams r32 = r2.getLayoutParams();
        r32.width = (int) (r02 * r2.getLayoutParams().width);
        r2.setLayoutParams(r32);
        return;
    L9:
        return;
    }
}
