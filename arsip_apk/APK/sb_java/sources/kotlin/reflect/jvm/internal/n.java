package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public abstract class n {

    public static class a extends c implements kotlin.jvm.functions.a {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.functions.a f180267b;

        /* renamed from: c, reason: collision with root package name */
        public volatile SoftReference f180268c;

        public a(Object r2, kotlin.jvm.functions.a r3) {
            if (r3 != null) goto L4;
            d(0);
        L4:
            this.f180268c = null;
            this.f180267b = r3;
            if (r2 == null) goto L8;
            this.f180268c = new SoftReference(a(r2));
            return;
        }

        public static /* synthetic */ void d(int r2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        @Override // kotlin.reflect.jvm.internal.n.c, kotlin.jvm.functions.a
        public Object invoke() {
            SoftReference r02 = this.f180268c;
            if (r02 == null) goto L8;
            Object r03 = r02.get();
            if (r03 == null) goto L8;
            return c(r03);
        L8:
            Object r04 = this.f180267b.invoke();
            this.f180268c = new SoftReference(a(r04));
            return r04;
        }
    }

    public static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.functions.a f180269b;

        /* renamed from: c, reason: collision with root package name */
        public volatile Object f180270c;

        public b(kotlin.jvm.functions.a r2) {
            if (r2 != null) goto L4;
            d(0);
        L4:
            this.f180270c = null;
            this.f180269b = r2;
        }

        private static /* synthetic */ void d(int r2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        @Override // kotlin.reflect.jvm.internal.n.c, kotlin.jvm.functions.a
        public Object invoke() {
            Object r02 = this.f180270c;
            if (r02 != null) goto L5;
            Object r03 = this.f180269b.invoke();
            this.f180270c = a(r03);
            return r03;
        L5:
            return c(r02);
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final Object f180271a = null;

        public static class a {
            public a() {
            }
        }

        static {
            f180271a = new a();
        }

        public c() {
        }

        public Object a(Object r1) {
            if (r1 == null) goto L4;
            return r1;
        L4:
            return f180271a;
        }

        public final Object b(Object r1, Object r2) {
            return invoke();
        }

        public Object c(Object r2) {
            if (r2 != f180271a) goto L6;
            return null;
        L6:
            return r2;
        }

        public abstract Object invoke();
    }

    public static /* synthetic */ void a(int r3) {
        Object[] r02 = new Object[3];
        r02[0] = "initializer";
        r02[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (r3 == 1) goto L6;
        if (r3 == 2) goto L6;
        r02[2] = "lazy";
    L8:
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", r02));
    L6:
        r02[2] = "lazySoft";
        goto L8
    }

    public static b b(kotlin.jvm.functions.a r1) {
        if (r1 != null) goto L5;
        a(0);
    L5:
        return new b(r1);
    }

    public static a c(Object r1, kotlin.jvm.functions.a r2) {
        if (r2 != null) goto L5;
        a(1);
    L5:
        return new a(r1, r2);
    }

    public static a d(kotlin.jvm.functions.a r1) {
        if (r1 != null) goto L5;
        a(2);
    L5:
        return c(null, r1);
    }
}
