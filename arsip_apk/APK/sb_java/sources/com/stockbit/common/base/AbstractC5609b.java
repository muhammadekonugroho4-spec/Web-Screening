package com.stockbit.common.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: com.stockbit.common.base.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5609b {
    public static final void a(Activity r1, Context r2, float r3) {
        if (r2 == null) goto L7;
        Resources r22 = r2.getResources();     // Catch: Exception -> L14
        if (r22 == null) goto L7;
        Configuration r23 = r22.getConfiguration();     // Catch: Exception -> L14
    L8:
        Configuration r02 = new Configuration(r23);     // Catch: Exception -> L14
        if (com.stockbit.common.extension.h.I(Float.valueOf(r02.fontScale)) <= r3) goto L11;
        r02.fontScale = r3;     // Catch: Exception -> L14
    L11:
        if (r1 == null) goto L17;
        r1.applyOverrideConfiguration(r02);     // Catch: Exception -> L14
        return;
    L17:
        return;
    L7:
        r23 = null;
    }

    public static /* synthetic */ void b(Activity r02, Context r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 1.3f;
    L5:
        a(r02, r1, r2);
    }
}
