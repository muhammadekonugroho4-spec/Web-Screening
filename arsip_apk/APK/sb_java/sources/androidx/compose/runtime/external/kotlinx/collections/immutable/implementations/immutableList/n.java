package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* loaded from: classes.dex */
public abstract class n {
    public static final int a(int r02, int r1) {
        return (r02 >> r1) & 31;
    }

    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.e b() {
        return l.f16200c.a();
    }

    public static final Object[] c(Object r2) {
        Object[] r02 = new Object[32];
        r02[0] = r2;
        return r02;
    }

    public static final int d(int r02) {
        return (r02 - 1) & (-32);
    }
}
