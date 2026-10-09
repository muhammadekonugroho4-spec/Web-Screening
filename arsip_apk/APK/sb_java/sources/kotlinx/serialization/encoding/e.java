package kotlinx.serialization.encoding;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public interface e {
    boolean B();

    boolean E();

    default Object H(kotlinx.serialization.a r2) {
        p.l(r2, "deserializer");
        return r2.deserialize(this);
    }

    byte I();

    c a(kotlinx.serialization.descriptors.f r1);

    Void h();

    long i();

    short n();

    double o();

    char p();

    String r();

    int t(kotlinx.serialization.descriptors.f r1);

    int v();

    e y(kotlinx.serialization.descriptors.f r1);

    float z();
}
