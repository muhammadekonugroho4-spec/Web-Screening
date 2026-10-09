package dagger.hilt.internal;

/* loaded from: classes2.dex */
public abstract class d {
    public static void a(boolean r02, String r1, Object... r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.format(r1, r2));
    }

    public static Object b(Object r02) {
        r02.getClass();
        return r02;
    }

    public static Object c(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static void d(boolean r02, String r1, Object... r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.format(r1, r2));
    }
}
