package androidx.compose.runtime.collection;

import java.util.List;

/* loaded from: classes.dex */
public abstract class d {
    public static final void a(List r02, int r1) {
        int r03 = r02.size();
        if (r1 < 0) goto L7;
        if (r1 >= r03) goto L7;
        return;
    L7:
        c(r1, r03);
    }

    public static final void b(List r02, int r1, int r2) {
        if (r1 <= r2) goto L4;
        f(r1, r2);
    L4:
        if (r1 >= 0) goto L7;
        d(r1);
    L7:
        if (r2 <= r02.size()) goto L10;
        e(r2, r02.size());
        return;
    }

    private static final void c(int r3, int r4) {
        throw new IndexOutOfBoundsException("Index " + r3 + " is out of bounds. The list has " + r4 + " elements.");
    }

    private static final void d(int r3) {
        throw new IndexOutOfBoundsException("fromIndex (" + r3 + ") is less than 0.");
    }

    private static final void e(int r3, int r4) {
        throw new IndexOutOfBoundsException("toIndex (" + r3 + ") is more than than the list size (" + r4 + ')');
    }

    private static final void f(int r3, int r4) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + r3 + ") is greater than toIndex (" + r4 + ").");
    }
}
