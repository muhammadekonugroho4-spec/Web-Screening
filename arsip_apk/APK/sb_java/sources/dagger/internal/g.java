package dagger.internal;

/* loaded from: classes2.dex */
public abstract class g {
    public static void a(Object r1, Class r2) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new IllegalStateException(r2.getCanonicalName() + " must be set");
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

    public static Object d(Object r2, String r3, Object r4) {
        if (r2 == null) goto L4;
        return r2;
    L4:
        if (r3.contains("%s") == false) goto L15;
        if (r3.indexOf("%s") != r3.lastIndexOf("%s")) goto L13;
        if ((r4 instanceof Class) == false) goto L11;
        r4 = ((Class) r4).getCanonicalName();
    L11:
        throw new NullPointerException(r3.replace("%s", String.valueOf(r4)));
    L13:
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    L15:
        throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }

    public static Object e(Object r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
