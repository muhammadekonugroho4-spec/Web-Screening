package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20635b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final float f20636c = 0.0f;
    public static final float d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f20637e = 0.0f;

    /* renamed from: a, reason: collision with root package name */
    public final float f20638a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final float a() {
            return i.a();
        }

        public final float b() {
            return i.b();
        }

        public final float c() {
            return i.c();
        }

        public a() {
        }
    }

    static {
        f20635b = new a(null);
        f20636c = h(0.0f);
        d = h(Float.POSITIVE_INFINITY);
        f20637e = h(Float.NaN);
    }

    public /* synthetic */ i(float r1) {
        this.f20638a = r1;
    }

    public static final /* synthetic */ float a() {
        return f20636c;
    }

    public static final /* synthetic */ float b() {
        return d;
    }

    public static final /* synthetic */ float c() {
        return f20637e;
    }

    public static final /* synthetic */ i d(float r1) {
        return new i(r1);
    }

    public static int g(float r1, float r2) {
        if (b.f20618b == false) goto L14;
        if (Float.isNaN(r1) == false) goto L7;
        return 0;
    L7:
        if (Float.isNaN(r2) == false) goto L10;
        return 0;
    L10:
        return Float.compare(r1, r2);
    L14:
        return Float.compare(r1, r2);
    }

    public static float h(float r02) {
        return r02;
    }

    public static boolean i(float r2, Object r3) {
        if ((r3 instanceof i) == true) goto L6;
        return false;
    L6:
        if (Float.compare(r2, ((i) r3).m()) == 0) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean j(float r02, float r1) {
        if (Float.compare(r02, r1) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int k(float r02) {
        return Float.hashCode(r02);
    }

    public static String l(float r1) {
        if (Float.isNaN(r1) == false) goto L7;
        return "Dp.Unspecified";
    L7:
        return r1 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return e(((i) r1).m());
    }

    public int e(float r2) {
        return g(this.f20638a, r2);
    }

    public boolean equals(Object r2) {
        return i(this.f20638a, r2);
    }

    public int hashCode() {
        return k(this.f20638a);
    }

    public final /* synthetic */ float m() {
        return this.f20638a;
    }

    public String toString() {
        return l(this.f20638a);
    }
}
