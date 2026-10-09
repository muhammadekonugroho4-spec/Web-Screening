package kotlin;

/* loaded from: classes3.dex */
public final class p implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f177521b = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f177522a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f177521b = new a(null);
    }

    public /* synthetic */ p(int r1) {
        this.f177522a = r1;
    }

    public static final /* synthetic */ p a(int r1) {
        return new p(r1);
    }

    public static int b(int r02) {
        return r02;
    }

    public static boolean c(int r2, Object r3) {
        if ((r3 instanceof p) == true) goto L6;
        return false;
    L6:
        if (r2 == ((p) r3).g()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(int r02) {
        return Integer.hashCode(r02);
    }

    public static String e(int r4) {
        return String.valueOf(r4 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r2) {
        int r22 = ((p) r2).g();
        return x.a(g(), r22);
    }

    public boolean equals(Object r2) {
        return c(this.f177522a, r2);
    }

    public final /* synthetic */ int g() {
        return this.f177522a;
    }

    public int hashCode() {
        return d(this.f177522a);
    }

    public String toString() {
        return e(this.f177522a);
    }
}
