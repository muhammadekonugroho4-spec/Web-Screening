package timber.log;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1946a f184289a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f184290b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile b[] f184291c;

    /* renamed from: timber.log.a$a, reason: collision with other inner class name */
    public static final class C1946a extends b {
        public /* synthetic */ C1946a(i r1) {
            this();
        }

        @Override // timber.log.a.b
        public void a(String r6, Object... r7) {
            p.l(r7, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].a(r6, Arrays.copyOf(r7, r7.length));
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void b(String r6, Object... r7) {
            p.l(r7, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].b(r6, Arrays.copyOf(r7, r7.length));
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void c(Throwable r5) {
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].c(r5);
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void d(Throwable r6, String r7, Object... r8) {
            p.l(r8, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].d(r6, r7, Arrays.copyOf(r8, r8.length));
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void f(String r6, Object... r7) {
            p.l(r7, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].f(r6, Arrays.copyOf(r7, r7.length));
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void g(Throwable r5) {
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].g(r5);
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void h(String r6, Object... r7) {
            p.l(r7, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].h(r6, Arrays.copyOf(r7, r7.length));
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void i(String r6, Object... r7) {
            p.l(r7, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].i(r6, Arrays.copyOf(r7, r7.length));
            r2 = r2 + 1;
            goto L3
        }

        @Override // timber.log.a.b
        public void j(Throwable r6, String r7, Object... r8) {
            p.l(r8, "args");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            r02[r2].j(r6, r7, Arrays.copyOf(r8, r8.length));
            r2 = r2 + 1;
            goto L3
        }

        public final b k(String r5) {
            p.l(r5, "tag");
            b[] r02 = a.a();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L5;
            b r3 = r02[r2];
            r2 = r2 + 1;
            r3.e().set(r5);
            goto L3
        L5:
            return this;
        }

        public C1946a() {
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal f184292a;

        public b() {
            this.f184292a = new ThreadLocal();
        }

        public abstract void a(String r1, Object... r2);

        public abstract void b(String r1, Object... r2);

        public abstract void c(Throwable r1);

        public abstract void d(Throwable r1, String r2, Object... r3);

        public final /* synthetic */ ThreadLocal e() {
            return this.f184292a;
        }

        public abstract void f(String r1, Object... r2);

        public abstract void g(Throwable r1);

        public abstract void h(String r1, Object... r2);

        public abstract void i(String r1, Object... r2);

        public abstract void j(Throwable r1, String r2, Object... r3);
    }

    static {
        f184289a = new C1946a(null);
        f184290b = new ArrayList();
        f184291c = new b[0];
    }

    public static final /* synthetic */ b[] a() {
        return f184291c;
    }

    public static void b(String r1, Object... r2) {
        f184289a.b(r1, r2);
    }

    public static void c(String r1, Object... r2) {
        f184289a.f(r1, r2);
    }

    public static void d(String r1, Object... r2) {
        f184289a.h(r1, r2);
    }
}
