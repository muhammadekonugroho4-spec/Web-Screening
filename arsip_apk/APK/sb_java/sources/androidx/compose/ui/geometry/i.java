package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final a f17059i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final i f17060j = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f17061a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17062b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17063c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17064e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17065f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17066g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17067h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f17059i = new a(null);
        f17060j = j.d(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.geometry.a.f17045a.a());
    }

    public /* synthetic */ i(float r1, float r2, float r3, float r4, long r5, long r7, long r9, long r11, kotlin.jvm.internal.i r13) {
        this(r1, r2, r3, r4, r5, r7, r9, r11);
    }

    public final float a() {
        return this.d;
    }

    public final long b() {
        return this.f17067h;
    }

    public final long c() {
        return this.f17066g;
    }

    public final float d() {
        return this.d - this.f17062b;
    }

    public final float e() {
        return this.f17061a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (Float.compare(this.f17061a, r82.f17061a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f17062b, r82.f17062b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f17063c, r82.f17063c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (androidx.compose.ui.geometry.a.c(this.f17064e, r82.f17064e) == true) goto L24;
        return false;
    L24:
        if (androidx.compose.ui.geometry.a.c(this.f17065f, r82.f17065f) == true) goto L27;
        return false;
    L27:
        if (androidx.compose.ui.geometry.a.c(this.f17066g, r82.f17066g) == true) goto L30;
        return false;
    L30:
        if (androidx.compose.ui.geometry.a.c(this.f17067h, r82.f17067h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final float f() {
        return this.f17063c;
    }

    public final float g() {
        return this.f17062b;
    }

    public final long h() {
        return this.f17064e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f17061a) * 31) + Float.hashCode(this.f17062b)) * 31) + Float.hashCode(this.f17063c)) * 31) + Float.hashCode(this.d)) * 31) + androidx.compose.ui.geometry.a.d(this.f17064e)) * 31) + androidx.compose.ui.geometry.a.d(this.f17065f)) * 31) + androidx.compose.ui.geometry.a.d(this.f17066g)) * 31) + androidx.compose.ui.geometry.a.d(this.f17067h);
    }

    public final long i() {
        return this.f17065f;
    }

    public final float j() {
        return this.f17063c - this.f17061a;
    }

    public String toString() {
        long r02 = this.f17064e;
        long r2 = this.f17065f;
        long r4 = this.f17066g;
        long r6 = this.f17067h;
        String r8 = b.a(this.f17061a, 1) + ", " + b.a(this.f17062b, 1) + ", " + b.a(this.f17063c, 1) + ", " + b.a(this.d, 1);
        if (androidx.compose.ui.geometry.a.c(r02, r2) == false) goto L15;
        if (androidx.compose.ui.geometry.a.c(r2, r4) == false) goto L15;
        if (androidx.compose.ui.geometry.a.c(r4, r6) == false) goto L15;
        int r22 = (int) (r02 >> 32);
        int r03 = (int) (r02 & 4294967295L);
        if (Float.intBitsToFloat(r22) != Float.intBitsToFloat(r03)) goto L13;
        return "RoundRect(rect=" + r8 + ", radius=" + b.a(Float.intBitsToFloat(r22), 1) + ')';
    L13:
        return "RoundRect(rect=" + r8 + ", x=" + b.a(Float.intBitsToFloat(r22), 1) + ", y=" + b.a(Float.intBitsToFloat(r03), 1) + ')';
    L15:
        return "RoundRect(rect=" + r8 + ", topLeft=" + androidx.compose.ui.geometry.a.e(r02) + ", topRight=" + androidx.compose.ui.geometry.a.e(r2) + ", bottomRight=" + androidx.compose.ui.geometry.a.e(r4) + ", bottomLeft=" + androidx.compose.ui.geometry.a.e(r6) + ')';
    }

    public i(float r1, float r2, float r3, float r4, long r5, long r7, long r9, long r11) {
        this.f17061a = r1;
        this.f17062b = r2;
        this.f17063c = r3;
        this.d = r4;
        this.f17064e = r5;
        this.f17065f = r7;
        this.f17066g = r9;
        this.f17067h = r11;
    }
}
