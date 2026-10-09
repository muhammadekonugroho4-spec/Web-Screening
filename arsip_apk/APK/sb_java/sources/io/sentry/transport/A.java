package io.sentry.transport;

/* loaded from: classes3.dex */
public abstract class A {

    public static /* synthetic */ class a {
    }

    public static final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        public final int f176782a;

        public b(int r2) {
            super(null);
            this.f176782a = r2;
        }

        @Override // io.sentry.transport.A
        public int c() {
            return this.f176782a;
        }

        @Override // io.sentry.transport.A
        public boolean d() {
            return false;
        }
    }

    public static final class c extends A {

        /* renamed from: a, reason: collision with root package name */
        public static final c f176783a = null;

        static {
            f176783a = new c();
        }

        public c() {
            super(null);
        }

        @Override // io.sentry.transport.A
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.A
        public boolean d() {
            return true;
        }
    }

    public /* synthetic */ A(a r1) {
        this();
    }

    public static A a() {
        return b(-1);
    }

    public static A b(int r1) {
        return new b(r1);
    }

    public static A e() {
        return c.f176783a;
    }

    public abstract int c();

    public abstract boolean d();

    public A() {
    }
}
