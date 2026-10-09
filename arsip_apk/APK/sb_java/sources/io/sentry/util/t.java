package io.sentry.util;

import io.sentry.Q;
import io.sentry.SentryLevel;

/* loaded from: classes3.dex */
public abstract class t {
    public static void a(Class r1, Object r2, Q r3) {
        SentryLevel r02 = SentryLevel.DEBUG;
        if (r2 == null) goto L5;
        String r22 = r2.getClass().getCanonicalName();
    L6:
        r3.c(r02, "%s is not %s", new Object[]{r22, r1.getCanonicalName()});
        return;
    L5:
        r22 = "Hint";
        goto L6
    }
}
