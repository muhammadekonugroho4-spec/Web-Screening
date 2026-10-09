package kotlin.reflect;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Object a(d r2, Object r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (r2.p(r3) == false) goto L7;
        kotlin.jvm.internal.p.j(r3, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        return r3;
    L7:
        throw new ClassCastException("Value cannot be cast to " + r2.d());
    }

    public static final Object b(d r1, Object r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        if (r1.p(r2) == false) goto L6;
        kotlin.jvm.internal.p.j(r2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return r2;
    L6:
        return null;
    }
}
