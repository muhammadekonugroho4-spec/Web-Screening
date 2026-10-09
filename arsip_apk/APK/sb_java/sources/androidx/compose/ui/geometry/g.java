package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f17054e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final g f17055f = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f17056a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17057b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17058c;
    public final float d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a() {
            return g.a();
        }

        public a() {
        }
    }

    static {
        f17054e = new a(null);
        f17055f = new g(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public g(float r1, float r2, float r3, float r4) {
        this.f17056a = r1;
        this.f17057b = r2;
        this.f17058c = r3;
        this.d = r4;
    }

    public static final /* synthetic */ g a() {
        return f17055f;
    }

    public static /* synthetic */ g d(g r02, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f17056a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f17057b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f17058c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.c(r1, r2, r3, r4);
    }

    public final boolean b(long r5) {
        float r02 = Float.intBitsToFloat((int) (r5 >> 32));
        float r52 = Float.intBitsToFloat((int) (r5 & 4294967295L));
        boolean r1 = false;
        if (r02 < this.f17056a) goto L5;
        boolean r6 = true;
    L7:
        if (r02 >= this.f17058c) goto L9;
        boolean r03 = true;
    L10:
        boolean r62 = r6 & r03;
        if (r52 < this.f17057b) goto L13;
        boolean r04 = true;
    L14:
        boolean r63 = r62 & r04;
        if (r52 >= this.d) goto L18;
        r1 = true;
    L18:
        return r63 & r1;
    L13:
        r04 = false;
        goto L14
    L9:
        r03 = false;
        goto L10
    L5:
        r6 = false;
        goto L7
    }

    public final g c(float r2, float r3, float r4, float r5) {
        return new g(r2, r3, r4, r5);
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (Float.compare(this.f17056a, r52.f17056a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f17057b, r52.f17057b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f17058c, r52.f17058c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public final long f() {
        float r02 = this.f17056a + ((l() - k()) / 2.0f);
        float r1 = this.d;
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final long g() {
        float r02 = this.f17056a;
        float r1 = this.d;
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final long h() {
        float r02 = this.f17058c;
        float r1 = this.d;
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f17056a) * 31) + Float.hashCode(this.f17057b)) * 31) + Float.hashCode(this.f17058c)) * 31) + Float.hashCode(this.d);
    }

    public final long i() {
        float r02 = this.f17056a + ((l() - k()) / 2.0f);
        float r1 = this.f17057b + ((e() - n()) / 2.0f);
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final float j() {
        return e() - n();
    }

    public final float k() {
        return this.f17056a;
    }

    public final float l() {
        return this.f17058c;
    }

    public final long m() {
        float r02 = l() - k();
        float r1 = e() - n();
        long r2 = Float.floatToRawIntBits(r02);
        return k.d((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final float n() {
        return this.f17057b;
    }

    public final long o() {
        float r02 = this.f17056a + ((l() - k()) / 2.0f);
        float r1 = this.f17057b;
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final long p() {
        float r02 = this.f17056a;
        float r1 = this.f17057b;
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final long q() {
        float r02 = this.f17058c;
        float r1 = this.f17057b;
        long r2 = Float.floatToRawIntBits(r02);
        return e.e((Float.floatToRawIntBits(r1) & 4294967295L) | (r2 << 32));
    }

    public final float r() {
        return l() - k();
    }

    public final g s(float r3, float r4, float r5, float r6) {
        return new g(Math.max(this.f17056a, r3), Math.max(this.f17057b, r4), Math.min(this.f17058c, r5), Math.min(this.d, r6));
    }

    public final g t(g r6) {
        return new g(Math.max(this.f17056a, r6.f17056a), Math.max(this.f17057b, r6.f17057b), Math.min(this.f17058c, r6.f17058c), Math.min(this.d, r6.d));
    }

    public String toString() {
        return "Rect.fromLTRB(" + b.a(this.f17056a, 1) + ", " + b.a(this.f17057b, 1) + ", " + b.a(this.f17058c, 1) + ", " + b.a(this.d, 1) + ')';
    }

    public final boolean u() {
        boolean r1 = false;
        if (this.f17056a < this.f17058c) goto L5;
        boolean r02 = true;
    L7:
        if (this.f17057b < this.d) goto L10;
        r1 = true;
    L10:
        return r02 | r1;
    L5:
        r02 = false;
        goto L7
    }

    public final boolean v(g r6) {
        boolean r1 = false;
        if (this.f17056a >= r6.f17058c) goto L5;
        boolean r02 = true;
    L7:
        if (r6.f17056a >= this.f17058c) goto L9;
        boolean r3 = true;
    L10:
        boolean r03 = r02 & r3;
        if (this.f17057b >= r6.d) goto L13;
        boolean r32 = true;
    L14:
        boolean r04 = r03 & r32;
        if (r6.f17057b >= this.d) goto L18;
        r1 = true;
    L18:
        return r04 & r1;
    L13:
        r32 = false;
        goto L14
    L9:
        r3 = false;
        goto L10
    L5:
        r02 = false;
        goto L7
    }

    public final g w(float r5, float r6) {
        return new g(this.f17056a + r5, this.f17057b + r6, this.f17058c + r5, this.d + r6);
    }

    public final g x(long r7) {
        int r2 = (int) (r7 >> 32);
        int r72 = (int) (r7 & 4294967295L);
        return new g(this.f17056a + Float.intBitsToFloat(r2), this.f17057b + Float.intBitsToFloat(r72), this.f17058c + Float.intBitsToFloat(r2), this.d + Float.intBitsToFloat(r72));
    }
}
