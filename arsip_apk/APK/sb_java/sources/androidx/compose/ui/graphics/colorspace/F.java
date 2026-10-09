package androidx.compose.ui.graphics.colorspace;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final double f17201a;

    /* renamed from: b, reason: collision with root package name */
    public final double f17202b;

    /* renamed from: c, reason: collision with root package name */
    public final double f17203c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f17204e;

    /* renamed from: f, reason: collision with root package name */
    public final double f17205f;

    /* renamed from: g, reason: collision with root package name */
    public final double f17206g;

    static {
    }

    public F(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        this.f17201a = r2;
        this.f17202b = r4;
        this.f17203c = r6;
        this.d = r8;
        this.f17204e = r10;
        this.f17205f = r12;
        this.f17206g = r14;
        if (Double.isNaN(r4) == true) goto L63;
        if (Double.isNaN(r6) == true) goto L63;
        if (Double.isNaN(r8) == true) goto L63;
        if (Double.isNaN(r10) == true) goto L63;
        if (Double.isNaN(r12) == true) goto L63;
        if (Double.isNaN(r14) == true) goto L63;
        if (Double.isNaN(r2) == true) goto L63;
        if (G.a(r2) == false) goto L19;
        return;
    L19:
        if (r10 < 0.0d) goto L60;
        if (r10 > 1.0d) goto L60;
        if (r10 != 0.0d) goto L32;
        if (r4 == 0.0d) goto L30;
        if (r2 != 0.0d) goto L32;
    L30:
        throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
    L32:
        if (r10 < 1.0d) goto L39;
        if (r8 != 0.0d) goto L39;
        throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
    L39:
        if (r4 == 0.0d) goto L44;
        if (r2 == 0.0d) goto L44;
    L49:
        if (r8 < 0.0d) goto L58;
        if (r4 < 0.0d) goto L56;
        if (r2 < 0.0d) goto L56;
        return;
    L56:
        throw new IllegalArgumentException("The transfer function must be positive or increasing");
    L58:
        throw new IllegalArgumentException("The transfer function must be increasing");
    L44:
        if (r8 != 0.0d) goto L49;
        throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
    L60:
        throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + r10);
    L63:
        throw new IllegalArgumentException("Parameters cannot be NaN");
    }

    public final double a() {
        return this.f17202b;
    }

    public final double b() {
        return this.f17203c;
    }

    public final double c() {
        return this.d;
    }

    public final double d() {
        return this.f17204e;
    }

    public final double e() {
        return this.f17205f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof F) == true) goto L8;
        return false;
    L8:
        F r82 = (F) r8;
        if (Double.compare(this.f17201a, r82.f17201a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f17202b, r82.f17202b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f17203c, r82.f17203c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f17204e, r82.f17204e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f17205f, r82.f17205f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f17206g, r82.f17206g) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final double f() {
        return this.f17206g;
    }

    public final double g() {
        return this.f17201a;
    }

    public final boolean h() {
        if (this.f17201a != (-3.0d)) goto L6;
        return true;
    L6:
        return false;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f17201a) * 31) + Double.hashCode(this.f17202b)) * 31) + Double.hashCode(this.f17203c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f17204e)) * 31) + Double.hashCode(this.f17205f)) * 31) + Double.hashCode(this.f17206g);
    }

    public final boolean i() {
        if (this.f17201a != (-2.0d)) goto L6;
        return true;
    L6:
        return false;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f17201a + ", a=" + this.f17202b + ", b=" + this.f17203c + ", c=" + this.d + ", d=" + this.f17204e + ", e=" + this.f17205f + ", f=" + this.f17206g + ')';
    }

    public /* synthetic */ F(double r19, double r21, double r23, double r25, double r27, double r29, double r31, int r33, kotlin.jvm.internal.i r34) {
        if ((r33 & 32) == 0) goto L5;
        double r14 = 0.0d;
    L7:
        if ((r33 & 64) == 0) goto L10;
        double r16 = 0.0d;
    L11:
        this(r19, r21, r23, r25, r27, r14, r16);
        return;
    L10:
        r16 = r31;
        goto L11
    L5:
        r14 = r29;
        goto L7
    }
}
