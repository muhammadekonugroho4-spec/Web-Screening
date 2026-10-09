package androidx.compose.ui.graphics.vector;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17781a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17782b;

    public static final class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17783c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17784e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f17785f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f17786g;

        /* renamed from: h, reason: collision with root package name */
        public final float f17787h;

        /* renamed from: i, reason: collision with root package name */
        public final float f17788i;

        static {
        }

        public a(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17783c = r4;
            this.d = r5;
            this.f17784e = r6;
            this.f17785f = r7;
            this.f17786g = r8;
            this.f17787h = r9;
            this.f17788i = r10;
        }

        public final float c() {
            return this.f17787h;
        }

        public final float d() {
            return this.f17788i;
        }

        public final float e() {
            return this.f17783c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (Float.compare(this.f17783c, r52.f17783c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17784e, r52.f17784e) == 0) goto L18;
            return false;
        L18:
            if (this.f17785f == r52.f17785f) goto L21;
            return false;
        L21:
            if (this.f17786g == r52.f17786g) goto L24;
            return false;
        L24:
            if (Float.compare(this.f17787h, r52.f17787h) == 0) goto L27;
            return false;
        L27:
            if (Float.compare(this.f17788i, r52.f17788i) == 0) goto L29;
            return false;
        L29:
            return true;
        }

        public final float f() {
            return this.f17784e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f17785f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f17783c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17784e)) * 31) + Boolean.hashCode(this.f17785f)) * 31) + Boolean.hashCode(this.f17786g)) * 31) + Float.hashCode(this.f17787h)) * 31) + Float.hashCode(this.f17788i);
        }

        public final boolean i() {
            return this.f17786g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f17783c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.f17784e + ", isMoreThanHalf=" + this.f17785f + ", isPositiveArc=" + this.f17786g + ", arcStartX=" + this.f17787h + ", arcStartY=" + this.f17788i + ')';
        }
    }

    public static final class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final b f17789c = null;

        static {
            f17789c = new b();
        }

        public b() {
            boolean r2 = false;
            super(r2, r2, 3, null);
        }
    }

    public static final class c extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17790c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17791e;

        /* renamed from: f, reason: collision with root package name */
        public final float f17792f;

        /* renamed from: g, reason: collision with root package name */
        public final float f17793g;

        /* renamed from: h, reason: collision with root package name */
        public final float f17794h;

        static {
        }

        public c(float r5, float r6, float r7, float r8, float r9, float r10) {
            boolean r2 = true;
            boolean r3 = false;
            super(r2, r3, 2, null);
            this.f17790c = r5;
            this.d = r6;
            this.f17791e = r7;
            this.f17792f = r8;
            this.f17793g = r9;
            this.f17794h = r10;
        }

        public final float c() {
            return this.f17790c;
        }

        public final float d() {
            return this.f17791e;
        }

        public final float e() {
            return this.f17793g;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (Float.compare(this.f17790c, r52.f17790c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17791e, r52.f17791e) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.f17792f, r52.f17792f) == 0) goto L21;
            return false;
        L21:
            if (Float.compare(this.f17793g, r52.f17793g) == 0) goto L24;
            return false;
        L24:
            if (Float.compare(this.f17794h, r52.f17794h) == 0) goto L26;
            return false;
        L26:
            return true;
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f17792f;
        }

        public final float h() {
            return this.f17794h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f17790c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17791e)) * 31) + Float.hashCode(this.f17792f)) * 31) + Float.hashCode(this.f17793g)) * 31) + Float.hashCode(this.f17794h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f17790c + ", y1=" + this.d + ", x2=" + this.f17791e + ", y2=" + this.f17792f + ", x3=" + this.f17793g + ", y3=" + this.f17794h + ')';
        }
    }

    public static final class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17795c;

        static {
        }

        public d(float r4) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17795c = r4;
        }

        public final float c() {
            return this.f17795c;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f17795c, ((d) r4).f17795c) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f17795c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f17795c + ')';
        }
    }

    public static final class e extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17796c;
        public final float d;

        static {
        }

        public e(float r4, float r5) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17796c = r4;
            this.d = r5;
        }

        public final float c() {
            return this.f17796c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (Float.compare(this.f17796c, r52.f17796c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17796c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "LineTo(x=" + this.f17796c + ", y=" + this.d + ')';
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.f$f, reason: collision with other inner class name */
    public static final class C0124f extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17797c;
        public final float d;

        static {
        }

        public C0124f(float r4, float r5) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17797c = r4;
            this.d = r5;
        }

        public final float c() {
            return this.f17797c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0124f) == true) goto L8;
            return false;
        L8:
            C0124f r52 = (C0124f) r5;
            if (Float.compare(this.f17797c, r52.f17797c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17797c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f17797c + ", y=" + this.d + ')';
        }
    }

    public static final class g extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17798c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17799e;

        /* renamed from: f, reason: collision with root package name */
        public final float f17800f;

        static {
        }

        public g(float r4, float r5, float r6, float r7) {
            boolean r2 = false;
            char r02 = 1 == true ? 1 : 0;
            super(r2, true, r02, null);
            this.f17798c = r4;
            this.d = r5;
            this.f17799e = r6;
            this.f17800f = r7;
        }

        public final float c() {
            return this.f17798c;
        }

        public final float d() {
            return this.f17799e;
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
            if (Float.compare(this.f17798c, r52.f17798c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17799e, r52.f17799e) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.f17800f, r52.f17800f) == 0) goto L20;
            return false;
        L20:
            return true;
        }

        public final float f() {
            return this.f17800f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f17798c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17799e)) * 31) + Float.hashCode(this.f17800f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f17798c + ", y1=" + this.d + ", x2=" + this.f17799e + ", y2=" + this.f17800f + ')';
        }
    }

    public static final class h extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17801c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17802e;

        /* renamed from: f, reason: collision with root package name */
        public final float f17803f;

        static {
        }

        public h(float r5, float r6, float r7, float r8) {
            boolean r2 = true;
            boolean r3 = false;
            super(r2, r3, 2, null);
            this.f17801c = r5;
            this.d = r6;
            this.f17802e = r7;
            this.f17803f = r8;
        }

        public final float c() {
            return this.f17801c;
        }

        public final float d() {
            return this.f17802e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof h) == true) goto L8;
            return false;
        L8:
            h r52 = (h) r5;
            if (Float.compare(this.f17801c, r52.f17801c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17802e, r52.f17802e) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.f17803f, r52.f17803f) == 0) goto L20;
            return false;
        L20:
            return true;
        }

        public final float f() {
            return this.f17803f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f17801c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17802e)) * 31) + Float.hashCode(this.f17803f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f17801c + ", y1=" + this.d + ", x2=" + this.f17802e + ", y2=" + this.f17803f + ')';
        }
    }

    public static final class i extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17804c;
        public final float d;

        static {
        }

        public i(float r4, float r5) {
            boolean r2 = false;
            char r02 = 1 == true ? 1 : 0;
            super(r2, true, r02, null);
            this.f17804c = r4;
            this.d = r5;
        }

        public final float c() {
            return this.f17804c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof i) == true) goto L8;
            return false;
        L8:
            i r52 = (i) r5;
            if (Float.compare(this.f17804c, r52.f17804c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17804c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f17804c + ", y=" + this.d + ')';
        }
    }

    public static final class j extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17805c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17806e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f17807f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f17808g;

        /* renamed from: h, reason: collision with root package name */
        public final float f17809h;

        /* renamed from: i, reason: collision with root package name */
        public final float f17810i;

        static {
        }

        public j(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17805c = r4;
            this.d = r5;
            this.f17806e = r6;
            this.f17807f = r7;
            this.f17808g = r8;
            this.f17809h = r9;
            this.f17810i = r10;
        }

        public final float c() {
            return this.f17809h;
        }

        public final float d() {
            return this.f17810i;
        }

        public final float e() {
            return this.f17805c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof j) == true) goto L8;
            return false;
        L8:
            j r52 = (j) r5;
            if (Float.compare(this.f17805c, r52.f17805c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17806e, r52.f17806e) == 0) goto L18;
            return false;
        L18:
            if (this.f17807f == r52.f17807f) goto L21;
            return false;
        L21:
            if (this.f17808g == r52.f17808g) goto L24;
            return false;
        L24:
            if (Float.compare(this.f17809h, r52.f17809h) == 0) goto L27;
            return false;
        L27:
            if (Float.compare(this.f17810i, r52.f17810i) == 0) goto L29;
            return false;
        L29:
            return true;
        }

        public final float f() {
            return this.f17806e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f17807f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f17805c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17806e)) * 31) + Boolean.hashCode(this.f17807f)) * 31) + Boolean.hashCode(this.f17808g)) * 31) + Float.hashCode(this.f17809h)) * 31) + Float.hashCode(this.f17810i);
        }

        public final boolean i() {
            return this.f17808g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f17805c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.f17806e + ", isMoreThanHalf=" + this.f17807f + ", isPositiveArc=" + this.f17808g + ", arcStartDx=" + this.f17809h + ", arcStartDy=" + this.f17810i + ')';
        }
    }

    public static final class k extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17811c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17812e;

        /* renamed from: f, reason: collision with root package name */
        public final float f17813f;

        /* renamed from: g, reason: collision with root package name */
        public final float f17814g;

        /* renamed from: h, reason: collision with root package name */
        public final float f17815h;

        static {
        }

        public k(float r5, float r6, float r7, float r8, float r9, float r10) {
            boolean r2 = true;
            boolean r3 = false;
            super(r2, r3, 2, null);
            this.f17811c = r5;
            this.d = r6;
            this.f17812e = r7;
            this.f17813f = r8;
            this.f17814g = r9;
            this.f17815h = r10;
        }

        public final float c() {
            return this.f17811c;
        }

        public final float d() {
            return this.f17812e;
        }

        public final float e() {
            return this.f17814g;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof k) == true) goto L8;
            return false;
        L8:
            k r52 = (k) r5;
            if (Float.compare(this.f17811c, r52.f17811c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17812e, r52.f17812e) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.f17813f, r52.f17813f) == 0) goto L21;
            return false;
        L21:
            if (Float.compare(this.f17814g, r52.f17814g) == 0) goto L24;
            return false;
        L24:
            if (Float.compare(this.f17815h, r52.f17815h) == 0) goto L26;
            return false;
        L26:
            return true;
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f17813f;
        }

        public final float h() {
            return this.f17815h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f17811c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17812e)) * 31) + Float.hashCode(this.f17813f)) * 31) + Float.hashCode(this.f17814g)) * 31) + Float.hashCode(this.f17815h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f17811c + ", dy1=" + this.d + ", dx2=" + this.f17812e + ", dy2=" + this.f17813f + ", dx3=" + this.f17814g + ", dy3=" + this.f17815h + ')';
        }
    }

    public static final class l extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17816c;

        static {
        }

        public l(float r4) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17816c = r4;
        }

        public final float c() {
            return this.f17816c;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof l) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f17816c, ((l) r4).f17816c) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f17816c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f17816c + ')';
        }
    }

    public static final class m extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17817c;
        public final float d;

        static {
        }

        public m(float r4, float r5) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17817c = r4;
            this.d = r5;
        }

        public final float c() {
            return this.f17817c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof m) == true) goto L8;
            return false;
        L8:
            m r52 = (m) r5;
            if (Float.compare(this.f17817c, r52.f17817c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17817c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f17817c + ", dy=" + this.d + ')';
        }
    }

    public static final class n extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17818c;
        public final float d;

        static {
        }

        public n(float r4, float r5) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17818c = r4;
            this.d = r5;
        }

        public final float c() {
            return this.f17818c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof n) == true) goto L8;
            return false;
        L8:
            n r52 = (n) r5;
            if (Float.compare(this.f17818c, r52.f17818c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17818c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f17818c + ", dy=" + this.d + ')';
        }
    }

    public static final class o extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17819c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17820e;

        /* renamed from: f, reason: collision with root package name */
        public final float f17821f;

        static {
        }

        public o(float r4, float r5, float r6, float r7) {
            boolean r2 = false;
            char r02 = 1 == true ? 1 : 0;
            super(r2, true, r02, null);
            this.f17819c = r4;
            this.d = r5;
            this.f17820e = r6;
            this.f17821f = r7;
        }

        public final float c() {
            return this.f17819c;
        }

        public final float d() {
            return this.f17820e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof o) == true) goto L8;
            return false;
        L8:
            o r52 = (o) r5;
            if (Float.compare(this.f17819c, r52.f17819c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17820e, r52.f17820e) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.f17821f, r52.f17821f) == 0) goto L20;
            return false;
        L20:
            return true;
        }

        public final float f() {
            return this.f17821f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f17819c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17820e)) * 31) + Float.hashCode(this.f17821f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f17819c + ", dy1=" + this.d + ", dx2=" + this.f17820e + ", dy2=" + this.f17821f + ')';
        }
    }

    public static final class p extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17822c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17823e;

        /* renamed from: f, reason: collision with root package name */
        public final float f17824f;

        static {
        }

        public p(float r5, float r6, float r7, float r8) {
            boolean r2 = true;
            boolean r3 = false;
            super(r2, r3, 2, null);
            this.f17822c = r5;
            this.d = r6;
            this.f17823e = r7;
            this.f17824f = r8;
        }

        public final float c() {
            return this.f17822c;
        }

        public final float d() {
            return this.f17823e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof p) == true) goto L8;
            return false;
        L8:
            p r52 = (p) r5;
            if (Float.compare(this.f17822c, r52.f17822c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.f17823e, r52.f17823e) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.f17824f, r52.f17824f) == 0) goto L20;
            return false;
        L20:
            return true;
        }

        public final float f() {
            return this.f17824f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f17822c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17823e)) * 31) + Float.hashCode(this.f17824f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f17822c + ", dy1=" + this.d + ", dx2=" + this.f17823e + ", dy2=" + this.f17824f + ')';
        }
    }

    public static final class q extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17825c;
        public final float d;

        static {
        }

        public q(float r4, float r5) {
            boolean r2 = false;
            char r02 = 1 == true ? 1 : 0;
            super(r2, true, r02, null);
            this.f17825c = r4;
            this.d = r5;
        }

        public final float c() {
            return this.f17825c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof q) == true) goto L8;
            return false;
        L8:
            q r52 = (q) r5;
            if (Float.compare(this.f17825c, r52.f17825c) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.d, r52.d) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17825c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f17825c + ", dy=" + this.d + ')';
        }
    }

    public static final class r extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17826c;

        static {
        }

        public r(float r4) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17826c = r4;
        }

        public final float c() {
            return this.f17826c;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof r) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f17826c, ((r) r4).f17826c) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f17826c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f17826c + ')';
        }
    }

    public static final class s extends f {

        /* renamed from: c, reason: collision with root package name */
        public final float f17827c;

        static {
        }

        public s(float r4) {
            boolean r2 = false;
            super(r2, r2, 3, null);
            this.f17827c = r4;
        }

        public final float c() {
            return this.f17827c;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof s) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f17827c, ((s) r4).f17827c) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f17827c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f17827c + ')';
        }
    }

    static {
    }

    public /* synthetic */ f(boolean r1, boolean r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public final boolean a() {
        return this.f17781a;
    }

    public final boolean b() {
        return this.f17782b;
    }

    public f(boolean r1, boolean r2) {
        this.f17781a = r1;
        this.f17782b = r2;
    }

    public /* synthetic */ f(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3, null);
    }
}
