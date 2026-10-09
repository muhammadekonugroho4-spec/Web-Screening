package androidx.compose.runtime;

/* renamed from: androidx.compose.runtime.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3387d {
    Object a();

    void b(int r1, int r2);

    default void c() {
    }

    void clear();

    default void d() {
        Object r02 = a();
        if ((r02 instanceof InterfaceC3422o) == false) goto L5;
        InterfaceC3422o r03 = (InterfaceC3422o) r02;
    L6:
        if (r03 == null) goto L9;
        r03.l();
        return;
    L9:
        return;
    L5:
        r03 = null;
        goto L6
    }

    default void e() {
    }

    void f(int r1, int r2, int r3);

    default void g(kotlin.jvm.functions.p r2, Object r3) {
        r2.invoke(a(), r3);
    }

    void h(int r1, Object r2);

    void i(int r1, Object r2);

    void j(Object r1);

    void k();
}
