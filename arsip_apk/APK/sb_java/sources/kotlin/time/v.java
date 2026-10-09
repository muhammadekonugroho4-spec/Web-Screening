package kotlin.time;

import kotlin.time.b;

/* loaded from: classes3.dex */
public interface v {

    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public static final a f180433a = null;

        /* renamed from: kotlin.time.v$a$a, reason: collision with other inner class name */
        public static final class C1922a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final long f180434a;

            public /* synthetic */ C1922a(long r1) {
                this.f180434a = r1;
            }

            public static final /* synthetic */ C1922a b(long r1) {
                return new C1922a(r1);
            }

            public static long d(long r02) {
                return r02;
            }

            public static long e(long r1) {
                return t.f180431a.c(r1);
            }

            public static boolean g(long r4, Object r6) {
                if ((r6 instanceof C1922a) == true) goto L6;
                return false;
            L6:
                if (r4 == ((C1922a) r6).l()) goto L8;
                return false;
            L8:
                return true;
            }

            public static int h(long r02) {
                return Long.hashCode(r02);
            }

            public static final long i(long r1, long r3) {
                return t.f180431a.b(r1, r3);
            }

            public static long j(long r3, b r5) {
                kotlin.jvm.internal.p.l(r5, "other");
                if ((r5 instanceof C1922a) == false) goto L7;
                return i(r3, ((C1922a) r5).l());
            L7:
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + k(r3) + " and " + r5);
            }

            public static String k(long r2) {
                return "ValueTimeMark(reading=" + r2 + ')';
            }

            @Override // kotlin.time.u
            public long a() {
                return e(this.f180434a);
            }

            public /* bridge */ int c(b r1) {
                return b.a.a(this, r1);
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(Object r1) {
                return c((b) r1);
            }

            public boolean equals(Object r3) {
                return g(this.f180434a, r3);
            }

            @Override // kotlin.time.b
            public long f(b r3) {
                kotlin.jvm.internal.p.l(r3, "other");
                return j(this.f180434a, r3);
            }

            public int hashCode() {
                return h(this.f180434a);
            }

            public final /* synthetic */ long l() {
                return this.f180434a;
            }

            public String toString() {
                return k(this.f180434a);
            }
        }

        static {
            f180433a = new a();
        }

        public a() {
        }

        @Override // kotlin.time.v
        public /* bridge */ /* synthetic */ u a() {
            return C1922a.b(b());
        }

        public long b() {
            return t.f180431a.d();
        }

        public String toString() {
            return t.f180431a.toString();
        }
    }

    u a();
}
