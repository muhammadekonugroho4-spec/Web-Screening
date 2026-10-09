package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11811a {

    /* renamed from: a, reason: collision with root package name */
    public static final C11811a f178350a = null;

    /* renamed from: b, reason: collision with root package name */
    public static C1884a f178351b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a, reason: collision with other inner class name */
    public static final class C1884a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f178352a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f178353b;

        public C1884a(Method r1, Method r2) {
            this.f178352a = r1;
            this.f178353b = r2;
        }

        public final Method a() {
            return this.f178353b;
        }

        public final Method b() {
            return this.f178352a;
        }
    }

    static {
        f178350a = new C11811a();
    }

    public C11811a() {
    }

    public final C1884a a(Object r5) {
        Class<?> r52 = r5.getClass();
        return new C1884a(r52.getMethod("getType", null), r52.getMethod("getAccessor", null));
    L6:
        return new C1884a(null, null);
    }

    public final C1884a b(Object r2) {
        C1884a r02 = f178351b;
        if (r02 != null) goto L6;
        C1884a r22 = a(r2);
        f178351b = r22;
        return r22;
    L6:
        return r02;
    }

    public final Method c(Object r3) {
        kotlin.jvm.internal.p.l(r3, "recordComponent");
        Method r02 = b(r3).a();
        if (r02 != null) goto L5;
        return null;
    L5:
        Object r32 = r02.invoke(r3, null);
        kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) r32;
    }

    public final Class d(Object r3) {
        kotlin.jvm.internal.p.l(r3, "recordComponent");
        Method r02 = b(r3).b();
        if (r02 != null) goto L5;
        return null;
    L5:
        Object r32 = r02.invoke(r3, null);
        kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) r32;
    }
}
