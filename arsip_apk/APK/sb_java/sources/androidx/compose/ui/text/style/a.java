package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0138a f20244b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final float f20245c = 0.0f;
    public static final float d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f20246e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f20247f = 0.0f;

    /* renamed from: a, reason: collision with root package name */
    public final float f20248a;

    /* renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name */
    public static final class C0138a {
        public /* synthetic */ C0138a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final float a() {
            return a.a();
        }

        public final float b() {
            return a.b();
        }

        public final float c() {
            return a.c();
        }

        public C0138a() {
        }
    }

    static {
        f20244b = new C0138a(null);
        f20245c = e(0.5f);
        d = e(-0.5f);
        f20246e = e(0.0f);
        f20247f = e(Float.NaN);
    }

    public /* synthetic */ a(float r1) {
        this.f20248a = r1;
    }

    public static final /* synthetic */ float a() {
        return f20246e;
    }

    public static final /* synthetic */ float b() {
        return d;
    }

    public static final /* synthetic */ float c() {
        return f20245c;
    }

    public static final /* synthetic */ a d(float r1) {
        return new a(r1);
    }

    public static float e(float r02) {
        return r02;
    }

    public static boolean f(float r2, Object r3) {
        if ((r3 instanceof a) == true) goto L6;
        return false;
    L6:
        if (Float.compare(r2, ((a) r3).j()) == 0) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean g(float r02, float r1) {
        if (Float.compare(r02, r1) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int h(float r02) {
        return Float.hashCode(r02);
    }

    public static String i(float r2) {
        return "BaselineShift(multiplier=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return f(this.f20248a, r2);
    }

    public int hashCode() {
        return h(this.f20248a);
    }

    public final /* synthetic */ float j() {
        return this.f20248a;
    }

    public String toString() {
        return i(this.f20248a);
    }
}
