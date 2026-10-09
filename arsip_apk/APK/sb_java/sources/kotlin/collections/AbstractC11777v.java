package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: kotlin.collections.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11777v extends AbstractC11776u {
    public static ArrayList h(Object... r2) {
        kotlin.jvm.internal.p.l(r2, "elements");
        if (r2.length != 0) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(i(r2, true));
    }

    public static final Collection i(Object[] r1, boolean r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new C11768l(r1, r2);
    }

    public static /* synthetic */ Collection j(Object[] r02, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return i(r02, r1);
    }

    public static final int k(List r2, int r3, int r4, kotlin.jvm.functions.l r5) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r5, "comparison");
        w(r2.size(), r3, r4);
        int r42 = r4 - 1;
    L3:
        if (r3 > r42) goto L11;
        int r02 = (r3 + r42) >>> 1;
        int r1 = ((Number) r5.invoke(r2.get(r02))).intValue();
        if (r1 < 0) goto L6;
        if (r1 <= 0) goto L9;
        r42 = r02 - 1;
        goto L3
    L9:
        return r02;
    L6:
        r3 = r02 + 1;
        goto L3
    L11:
        return -(r3 + 1);
    }

    public static final int l(List r2, Comparable r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        w(r2.size(), r4, r5);
        int r52 = r5 - 1;
    L3:
        if (r4 > r52) goto L11;
        int r02 = (r4 + r52) >>> 1;
        int r1 = kotlin.comparisons.b.d((Comparable) r2.get(r02), r3);
        if (r1 < 0) goto L6;
        if (r1 <= 0) goto L9;
        r52 = r02 - 1;
        goto L3
    L9:
        return r02;
    L6:
        r4 = r02 + 1;
        goto L3
    L11:
        return -(r4 + 1);
    }

    public static /* synthetic */ int m(List r02, int r1, int r2, kotlin.jvm.functions.l r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.size();
    L9:
        return k(r02, r1, r2, r3);
    }

    public static /* synthetic */ int n(List r02, Comparable r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = r02.size();
    L9:
        return l(r02, r1, r2, r3);
    }

    public static List o() {
        return EmptyList.f177333a;
    }

    public static kotlin.ranges.j p(Collection r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        return new kotlin.ranges.j(0, r2.size() - 1);
    }

    public static int q(List r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return r1.size() - 1;
    }

    public static List r(Object... r1) {
        kotlin.jvm.internal.p.l(r1, "elements");
        if (r1.length <= 0) goto L7;
        return AbstractC11772p.g(r1);
    L7:
        return o();
    }

    public static List s(Object r02) {
        if (r02 == null) goto L6;
        return AbstractC11776u.e(r02);
    L6:
        return o();
    }

    public static List t(Object... r1) {
        kotlin.jvm.internal.p.l(r1, "elements");
        return r.m0(r1);
    }

    public static List u(Object... r2) {
        kotlin.jvm.internal.p.l(r2, "elements");
        if (r2.length != 0) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(i(r2, true));
    }

    public static final List v(List r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.size();
        if (r02 == 0) goto L10;
        if (r02 == 1) goto L8;
        return r2;
    L8:
        return AbstractC11776u.e(r2.get(0));
    L10:
        return o();
    }

    public static final void w(int r3, int r4, int r5) {
        if (r4 > r5) goto L12;
        if (r4 < 0) goto L10;
        if (r5 > r3) goto L8;
        return;
    L8:
        throw new IndexOutOfBoundsException("toIndex (" + r5 + ") is greater than size (" + r3 + ").");
    L10:
        throw new IndexOutOfBoundsException("fromIndex (" + r4 + ") is less than zero.");
    L12:
        throw new IllegalArgumentException("fromIndex (" + r4 + ") is greater than toIndex (" + r5 + ").");
    }

    public static void x() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void y() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
