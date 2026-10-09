package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f178354a = null;

    /* renamed from: b, reason: collision with root package name */
    public static a f178355b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f178356a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f178357b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f178358c;
        public final Method d;

        public a(Method r1, Method r2, Method r3, Method r4) {
            this.f178356a = r1;
            this.f178357b = r2;
            this.f178358c = r3;
            this.d = r4;
        }

        public final Method a() {
            return this.f178357b;
        }

        public final Method b() {
            return this.d;
        }

        public final Method c() {
            return this.f178358c;
        }

        public final Method d() {
            return this.f178356a;
        }
    }

    static {
        f178354a = new b();
    }

    public b() {
    }

    public final a a() {
        return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
    L6:
        return new a(null, null, null, null);
    }

    public final a b() {
        a r02 = f178355b;
        if (r02 != null) goto L6;
        a r03 = a();
        f178355b = r03;
        return r03;
    L6:
        return r02;
    }

    public final Class[] c(Class r3) {
        kotlin.jvm.internal.p.l(r3, "clazz");
        Method r02 = b().a();
        if (r02 != null) goto L5;
        return null;
    L5:
        Object r32 = r02.invoke(r3, null);
        kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) r32;
    }

    public final Object[] d(Class r3) {
        kotlin.jvm.internal.p.l(r3, "clazz");
        Method r02 = b().b();
        if (r02 != null) goto L6;
        return null;
    L6:
        return (Object[]) r02.invoke(r3, null);
    }

    public final Boolean e(Class r3) {
        kotlin.jvm.internal.p.l(r3, "clazz");
        Method r02 = b().c();
        if (r02 != null) goto L5;
        return null;
    L5:
        Object r32 = r02.invoke(r3, null);
        kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) r32;
    }

    public final Boolean f(Class r3) {
        kotlin.jvm.internal.p.l(r3, "clazz");
        Method r02 = b().d();
        if (r02 != null) goto L5;
        return null;
    L5:
        Object r32 = r02.invoke(r3, null);
        kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) r32;
    }
}
