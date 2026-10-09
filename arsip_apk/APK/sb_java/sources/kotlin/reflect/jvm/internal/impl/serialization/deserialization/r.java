package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes3.dex */
public abstract class r {
    public static final kotlin.reflect.jvm.internal.impl.name.b a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.reflect.jvm.internal.impl.name.b r12 = kotlin.reflect.jvm.internal.impl.name.b.f(r1.a(r2), r1.b(r2));
        kotlin.jvm.internal.p.k(r12, "fromString(getQualifiedC… isLocalClassName(index))");
        return r12;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.f b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.reflect.jvm.internal.impl.name.f r12 = kotlin.reflect.jvm.internal.impl.name.f.e(r1.getString(r2));
        kotlin.jvm.internal.p.k(r12, "guessByFirstCharacter(getString(index))");
        return r12;
    }
}
