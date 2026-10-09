package dagger.hilt;

import dagger.hilt.internal.b;

/* loaded from: classes2.dex */
public abstract class a {
    public static Object a(Object r2, Class r3) {
        if ((r2 instanceof dagger.hilt.internal.a) == false) goto L7;
        return r3.cast(r2);
    L7:
        if ((r2 instanceof b) == false) goto L11;
        return a(((b) r2).L2(), r3);
    L11:
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{r2.getClass(), dagger.hilt.internal.a.class, b.class}));
    }
}
