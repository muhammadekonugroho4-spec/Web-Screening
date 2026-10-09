package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.collections.AbstractC11772p;

/* loaded from: classes.dex */
public abstract class x {
    public static final /* synthetic */ Object[] a(Object[] r02, int r1, Object r2, Object r3) {
        return g(r02, r1, r2, r3);
    }

    public static final /* synthetic */ Object[] b(Object[] r02, int r1) {
        return h(r02, r1);
    }

    public static final /* synthetic */ Object[] c(Object[] r02, int r1) {
        return i(r02, r1);
    }

    public static final /* synthetic */ Object[] d(Object[] r02, int r1, int r2, t r3) {
        return j(r02, r1, r2, r3);
    }

    public static final /* synthetic */ Object[] e(Object[] r02, int r1, int r2, Object r3, Object r4) {
        return k(r02, r1, r2, r3, r4);
    }

    public static final int f(int r02, int r1) {
        return (r02 >> r1) & 31;
    }

    public static final Object[] g(Object[] r8, int r9, Object r10, Object r11) {
        Object[] r2 = new Object[r8.length + 2];
        AbstractC11772p.t(r8, r2, 0, 0, r9, 6, null);
        AbstractC11772p.o(r8, r2, r9 + 2, r9, r8.length);
        r2[r9] = r10;
        r2[r9 + 1] = r11;
        return r2;
    }

    public static final Object[] h(Object[] r8, int r9) {
        Object[] r2 = new Object[r8.length - 2];
        AbstractC11772p.t(r8, r2, 0, 0, r9, 6, null);
        AbstractC11772p.o(r8, r2, r9, r9 + 2, r8.length);
        return r2;
    }

    public static final Object[] i(Object[] r8, int r9) {
        Object[] r2 = new Object[r8.length - 1];
        AbstractC11772p.t(r8, r2, 0, 0, r9, 6, null);
        AbstractC11772p.o(r8, r2, r9, r9 + 1, r8.length);
        return r2;
    }

    public static final Object[] j(Object[] r9, int r10, int r11, t r12) {
        Object[] r3 = new Object[r9.length - 1];
        AbstractC11772p.t(r9, r3, 0, 0, r10, 6, null);
        AbstractC11772p.o(r9, r3, r10, r10 + 2, r11);
        r3[r11 - 2] = r12;
        AbstractC11772p.o(r9, r3, r11 - 1, r11, r9.length);
        return r3;
    }

    public static final Object[] k(Object[] r3, int r4, int r5, Object r6, Object r7) {
        Object[] r02 = Arrays.copyOf(r3, r3.length + 1);
        kotlin.jvm.internal.p.k(r02, "copyOf(...)");
        AbstractC11772p.o(r02, r02, r4 + 2, r4 + 1, r3.length);
        AbstractC11772p.o(r02, r02, r5 + 2, r5, r4);
        r02[r5] = r6;
        r02[r5 + 1] = r7;
        return r02;
    }
}
