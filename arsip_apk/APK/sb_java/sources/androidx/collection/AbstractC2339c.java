package androidx.collection;

import java.lang.reflect.Array;

/* renamed from: androidx.collection.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2339c {
    public static Object[] a(Object[] r1, int r2) {
        if (r1.length >= r2) goto L7;
        return (Object[]) Array.newInstance(r1.getClass().getComponentType(), r2);
    L7:
        if (r1.length <= r2) goto L9;
        r1[r2] = null;
    L9:
        return r1;
    }
}
