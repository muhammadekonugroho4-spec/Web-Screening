package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: kotlin.collections.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11770n {
    public static final Object[] a(Object[] r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "reference");
        Object r12 = Array.newInstance(r1.getClass().getComponentType(), r2);
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) r12;
    }

    public static int b(Object[] r02) {
        return Arrays.deepHashCode(r02);
    }

    public static final void c(int r3, int r4) {
        if (r3 > r4) goto L5;
        return;
    L5:
        throw new IndexOutOfBoundsException("toIndex (" + r3 + ") is greater than size (" + r4 + ").");
    }
}
