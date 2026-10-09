package io.sentry.util;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final b f176837a = null;

    public static /* synthetic */ class a {
    }

    public static class b extends ThreadLocal {
        public b() {
        }

        public Random a() {
            return new Random();
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }

        public /* synthetic */ b(a r1) {
            this();
        }
    }

    static {
        f176837a = new b(null);
    }

    public static Random a() {
        return (Random) f176837a.get();
    }
}
