package io.sentry.util;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class v {
    public static boolean a(Object r02, Object r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    public static int b(Object... r02) {
        return Arrays.hashCode(r02);
    }

    public static Object c(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new IllegalArgumentException(r1);
    }
}
