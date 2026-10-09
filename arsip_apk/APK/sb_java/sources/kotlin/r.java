package kotlin;

/* loaded from: classes3.dex */
public final class r implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f177529b = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f177530a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f177529b = new a(null);
    }

    public /* synthetic */ r(long r1) {
        this.f177530a = r1;
    }

    public static final /* synthetic */ r a(long r1) {
        return new r(r1);
    }

    public static long b(long r02) {
        return r02;
    }

    public static boolean c(long r4, Object r6) {
        if ((r6 instanceof r) == true) goto L6;
        return false;
    L6:
        if (r4 == ((r) r6).h()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean d(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static int e(long r02) {
        return Long.hashCode(r02);
    }

    public static String g(long r1) {
        return x.d(r1, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r5) {
        long r02 = ((r) r5).h();
        return x.b(h(), r02);
    }

    public boolean equals(Object r3) {
        return c(this.f177530a, r3);
    }

    public final /* synthetic */ long h() {
        return this.f177530a;
    }

    public int hashCode() {
        return e(this.f177530a);
    }

    public String toString() {
        return g(this.f177530a);
    }
}
