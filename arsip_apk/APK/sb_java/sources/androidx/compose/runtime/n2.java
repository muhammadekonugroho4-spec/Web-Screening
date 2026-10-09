package androidx.compose.runtime;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n2 {
    public static final void a(ArrayList r02) {
        r02.clear();
    }

    public static ArrayList b(ArrayList r02) {
        return r02;
    }

    public static /* synthetic */ ArrayList c(ArrayList r02, int r1, kotlin.jvm.internal.i r2) {
        if ((r1 & 1) == 0) goto L6;
        r02 = new ArrayList();
    L6:
        return b(r02);
    }

    public static final int d(ArrayList r02) {
        return r02.size();
    }

    public static final boolean e(ArrayList r02) {
        return r02.isEmpty();
    }

    public static final boolean f(ArrayList r02) {
        return !e(r02);
    }

    public static final Object g(ArrayList r1) {
        return r1.get(d(r1) - 1);
    }

    public static final Object h(ArrayList r02, int r1) {
        return r02.get(r1);
    }

    public static final Object i(ArrayList r1) {
        return r1.remove(d(r1) - 1);
    }

    public static final boolean j(ArrayList r02, Object r1) {
        return r02.add(r1);
    }

    public static final Object[] k(ArrayList r4) {
        int r02 = r4.size();
        Object[] r1 = new Object[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = r4.get(r2);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }
}
