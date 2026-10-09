package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* renamed from: kotlin.collections.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11776u {
    public static List a(List r1) {
        kotlin.jvm.internal.p.l(r1, "builder");
        return ((ListBuilder) r1).r();
    }

    public static final Object[] b(Object[] r1, boolean r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        if (r2 == true) goto L5;
    L7:
        Object[] r12 = Arrays.copyOf(r1, r1.length, Object[].class);
        kotlin.jvm.internal.p.k(r12, "copyOf(...)");
        return r12;
    L5:
        if (kotlin.jvm.internal.p.g(r1.getClass(), Object[].class) == false) goto L7;
        return r1;
    }

    public static List c() {
        int r3 = 0;
        return new ListBuilder(r3, 1, null);
    }

    public static List d(int r1) {
        return new ListBuilder(r1);
    }

    public static List e(Object r1) {
        List r12 = Collections.singletonList(r1);
        kotlin.jvm.internal.p.k(r12, "singletonList(...)");
        return r12;
    }

    public static List f(Iterable r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        List r12 = F.B1(r1);
        Collections.shuffle(r12);
        return r12;
    }

    public static Object[] g(int r1, Object[] r2) {
        kotlin.jvm.internal.p.l(r2, "array");
        if (r1 >= r2.length) goto L5;
        r2[r1] = null;
    L5:
        return r2;
    }
}
