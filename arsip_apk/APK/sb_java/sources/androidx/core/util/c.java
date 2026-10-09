package androidx.core.util;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c {
    public static boolean a(Object r02, Object r1) {
        return Objects.equals(r02, r1);
    }

    public static int b(Object... r02) {
        return Objects.hash(r02);
    }

    public static Object c(Object r02) {
        r02.getClass();
        return r02;
    }

    public static Object d(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static String e(Object r02, String r1) {
        if (r02 != null) goto L4;
        return r1;
    L4:
        return r02.toString();
    }
}
