package io.sentry.android.replay.util;

import io.sentry.util.Random;

/* loaded from: classes3.dex */
public abstract class m {
    public static final boolean a(Random r3, Double r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        if (r4 != null) goto L5;
    L8:
        return false;
    L5:
        if (r4.doubleValue() < r3.c()) goto L8;
        return true;
    }
}
