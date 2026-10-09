package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class b {
    public static /* synthetic */ int a(l[] r02, Object r1, Object r2) {
        return c(r02, r1, r2);
    }

    public static Comparator b(final l... r1) {
        p.l(r1, "selectors");
        if (r1.length <= 0) goto L7;
        return new a(r1);
    L7:
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int c(l[] r02, Object r1, Object r2) {
        return f(r1, r2, r02);
    }

    public static int d(Comparable r02, Comparable r1) {
        if (r02 != r1) goto L5;
        return 0;
    L5:
        if (r02 != null) goto L8;
        return -1;
    L8:
        if (r1 != null) goto L12;
        return 1;
    L12:
        return r02.compareTo(r1);
    }

    public static int e(Object r1, Object r2, l... r3) {
        p.l(r3, "selectors");
        if (r3.length <= 0) goto L7;
        return f(r1, r2, r3);
    L7:
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int f(Object r5, Object r6, l[] r7) {
        int r02 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L8;
        l r3 = r7[r2];
        int r32 = d((Comparable) r3.invoke(r5), (Comparable) r3.invoke(r6));
        if (r32 != 0) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r32;
    L8:
        return 0;
    }

    public static Comparator g() {
        d r02 = d.f177403a;
        p.j(r02, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return r02;
    }

    public static Comparator h() {
        e r02 = e.f177404a;
        p.j(r02, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return r02;
    }
}
