package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20653b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f20654c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20655a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return s.a();
        }

        public a() {
        }
    }

    static {
        f20653b = new a(null);
        f20654c = c(0);
    }

    public /* synthetic */ s(long r1) {
        this.f20655a = r1;
    }

    public static final /* synthetic */ long a() {
        return f20654c;
    }

    public static final /* synthetic */ s b(long r1) {
        return new s(r1);
    }

    public static long c(long r02) {
        return r02;
    }

    public static boolean d(long r4, Object r6) {
        if ((r6 instanceof s) == true) goto L6;
        return false;
    L6:
        if (r4 == ((s) r6).j()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean e(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final int f(long r2) {
        return (int) (r2 & 4294967295L);
    }

    public static final int g(long r1) {
        return (int) (r1 >> 32);
    }

    public static int h(long r02) {
        return Long.hashCode(r02);
    }

    public static String i(long r3) {
        return ((int) (r3 >> 32)) + " x " + ((int) (r3 & 4294967295L));
    }

    public boolean equals(Object r3) {
        return d(this.f20655a, r3);
    }

    public int hashCode() {
        return h(this.f20655a);
    }

    public final /* synthetic */ long j() {
        return this.f20655a;
    }

    public String toString() {
        return i(this.f20655a);
    }
}
