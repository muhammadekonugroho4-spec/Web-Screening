package kotlin.collections;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class B extends A {
    public static final /* synthetic */ int R(List r02, int r1) {
        return W(r02, r1);
    }

    public static final /* synthetic */ int S(List r02, int r1) {
        return X(r02, r1);
    }

    public static final /* synthetic */ int T(List r02, int r1) {
        return Y(r02, r1);
    }

    public static List U(List r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new X(r1);
    }

    public static List V(List r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new W(r1);
    }

    public static final int W(List r3, int r4) {
        if (r4 < 0) goto L8;
        if (r4 > AbstractC11777v.q(r3)) goto L8;
        return AbstractC11777v.q(r3) - r4;
    L8:
        throw new IndexOutOfBoundsException("Element index " + r4 + " must be in range [" + new kotlin.ranges.j(0, AbstractC11777v.q(r3)) + "].");
    }

    public static final int X(List r02, int r1) {
        return AbstractC11777v.q(r02) - r1;
    }

    public static final int Y(List r3, int r4) {
        if (r4 < 0) goto L8;
        if (r4 > r3.size()) goto L8;
        return r3.size() - r4;
    L8:
        throw new IndexOutOfBoundsException("Position index " + r4 + " must be in range [" + new kotlin.ranges.j(0, r3.size()) + "].");
    }
}
