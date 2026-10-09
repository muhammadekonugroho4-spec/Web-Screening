package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;

/* loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f179680a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f179681b = 0;

        static {
            f179680a = new a();
            d.a r02 = d.f179683c;
            int r1 = r02.b();
            int r2 = r02.d();
            f179681b = (~(r02.i() | r2)) & r1;
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return f179681b;
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f179682a = null;

        static {
            f179682a = new b();
        }

        public b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return 0;
        }
    }

    public c() {
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
