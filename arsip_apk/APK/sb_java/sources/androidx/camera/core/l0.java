package androidx.camera.core;

import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.S0;

/* loaded from: classes.dex */
public interface l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f5751a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f5752b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f5753c = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l0 f5754a;

        /* renamed from: b, reason: collision with root package name */
        public long f5755b;

        public a(l0 r3) {
            this.f5754a = r3;
            this.f5755b = r3.a();
        }

        public l0 a() {
            l0 r02 = this.f5754a;
            if ((r02 instanceof J0) == false) goto L7;
            return ((J0) r02).b(this.f5755b);
        L7:
            return new S0(this.f5755b, this.f5754a);
        }
    }

    public interface b {
        long a();

        Throwable getCause();

        int getStatus();
    }

    public static final class c {
        public static final c d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final c f5756e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final c f5757f = null;

        /* renamed from: g, reason: collision with root package name */
        public static c f5758g;

        /* renamed from: a, reason: collision with root package name */
        public final long f5759a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5760b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f5761c;

        static {
            d = new c(false, 0);
            f5756e = new c(true);
            f5757f = new c(true, 100);
            f5758g = new c(false, 0, true);
        }

        public c(boolean r3) {
            this(r3, a());
        }

        public static long a() {
            return 500;
        }

        public long b() {
            return this.f5759a;
        }

        public boolean c() {
            return this.f5761c;
        }

        public boolean d() {
            return this.f5760b;
        }

        public c(boolean r2, long r3) {
            this(r2, r3, false);
        }

        public c(boolean r1, long r2, boolean r4) {
            this.f5760b = r1;
            this.f5759a = r2;
            if (r4 == false) goto L5;
            androidx.core.util.h.b(!r1, "shouldRetry must be false when completeWithoutFailure is set to true");
        L5:
            this.f5761c = r4;
        }
    }

    static {
        f5751a = new k0();
        f5752b = new I.b(c());
        f5753c = new androidx.camera.core.impl.I(c());
    }

    static long c() {
        return 6000;
    }

    static /* synthetic */ c e(b r02) {
        return c.d;
    }

    default long a() {
        return 0;
    }

    c d(b r1);
}
