package io.sentry.util;

import java.util.Set;

/* renamed from: io.sentry.util.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11678g {
    public static Throwable a(Throwable r1) {
        v.c(r1, "throwable cannot be null");
    L4:
        if (r1.getCause() == null) goto L8;
        if (r1.getCause() == r1) goto L8;
        r1 = r1.getCause();
    L8:
        return r1;
    }

    public static boolean b(Set r02, Throwable r1) {
        return r02.contains(r1.getClass());
    }
}
