package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class a0 extends Z {
    public static Set e() {
        return EmptySet.f177335a;
    }

    public static HashSet f(Object... r2) {
        kotlin.jvm.internal.p.l(r2, "elements");
        return (HashSet) r.C1(r2, new HashSet(Q.e(r2.length)));
    }

    public static LinkedHashSet g(Object... r2) {
        kotlin.jvm.internal.p.l(r2, "elements");
        return (LinkedHashSet) r.C1(r2, new LinkedHashSet(Q.e(r2.length)));
    }

    public static Set h(Object... r2) {
        kotlin.jvm.internal.p.l(r2, "elements");
        return (Set) r.C1(r2, new LinkedHashSet(Q.e(r2.length)));
    }

    public static final Set i(Set r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.size();
        if (r02 == 0) goto L10;
        if (r02 == 1) goto L8;
        return r2;
    L8:
        return Z.d(r2.iterator().next());
    L10:
        return e();
    }

    public static Set j(Object... r1) {
        kotlin.jvm.internal.p.l(r1, "elements");
        return r.X1(r1);
    }

    public static Set k(Object r02) {
        if (r02 == null) goto L6;
        return Z.d(r02);
    L6:
        return e();
    }

    public static Set l(Object... r1) {
        kotlin.jvm.internal.p.l(r1, "elements");
        return (Set) r.n0(r1, new LinkedHashSet());
    }
}
