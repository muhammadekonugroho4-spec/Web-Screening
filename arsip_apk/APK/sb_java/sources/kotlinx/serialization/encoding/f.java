package kotlinx.serialization.encoding;

import kotlin.jvm.internal.p;
import kotlinx.serialization.m;

/* loaded from: classes3.dex */
public interface f {
    default void A(m r2, Object r3) {
        p.l(r2, "serializer");
        if (r2.getDescriptor().b() == false) goto L6;
        e(r2, r3);
        return;
    L6:
        if (r3 != null) goto L9;
        C();
        return;
    L9:
        F();
        e(r2, r3);
    }

    void B(long r1);

    void C();

    void E(char r1);

    default void F() {
    }

    d a(kotlinx.serialization.descriptors.f r1);

    kotlinx.serialization.modules.b c();

    default void e(m r2, Object r3) {
        p.l(r2, "serializer");
        r2.serialize(this, r3);
    }

    void f(byte r1);

    void g(kotlinx.serialization.descriptors.f r1, int r2);

    f h(kotlinx.serialization.descriptors.f r1);

    void k(short r1);

    void l(boolean r1);

    void m(float r1);

    void s(int r1);

    void v(String r1);

    void x(double r1);

    default d z(kotlinx.serialization.descriptors.f r1, int r2) {
        p.l(r1, "descriptor");
        return a(r1);
    }
}
