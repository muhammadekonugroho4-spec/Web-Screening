package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20660b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f20661c = 0;
    public static final long d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final long f20662e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20663a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return x.a();
        }

        public final long b() {
            return x.b();
        }

        public final long c() {
            return x.c();
        }

        public a() {
        }
    }

    static {
        f20660b = new a(null);
        f20661c = e(0);
        d = e(4294967296L);
        f20662e = e(8589934592L);
    }

    public /* synthetic */ x(long r1) {
        this.f20663a = r1;
    }

    public static final /* synthetic */ long a() {
        return f20662e;
    }

    public static final /* synthetic */ long b() {
        return d;
    }

    public static final /* synthetic */ long c() {
        return f20661c;
    }

    public static final /* synthetic */ x d(long r1) {
        return new x(r1);
    }

    public static long e(long r02) {
        return r02;
    }

    public static boolean f(long r4, Object r6) {
        if ((r6 instanceof x) == true) goto L6;
        return false;
    L6:
        if (r4 == ((x) r6).j()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean g(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static int h(long r02) {
        return Long.hashCode(r02);
    }

    public static String i(long r2) {
        if (g(r2, f20661c) == false) goto L7;
        return "Unspecified";
    L7:
        if (g(r2, d) == false) goto L11;
        return "Sp";
    L11:
        if (g(r2, f20662e) == false) goto L14;
        return "Em";
    L14:
        return "Invalid";
    }

    public boolean equals(Object r3) {
        return f(this.f20663a, r3);
    }

    public int hashCode() {
        return h(this.f20663a);
    }

    public final /* synthetic */ long j() {
        return this.f20663a;
    }

    public String toString() {
        return i(this.f20663a);
    }
}
