package androidx.compose.ui.node;

/* renamed from: androidx.compose.ui.node.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3635o {

    /* renamed from: f, reason: collision with root package name */
    public static final a f18805f = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f18806a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18807b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18808c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18809e;

    /* renamed from: androidx.compose.ui.node.o$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f18805f = new a(null);
    }

    public /* synthetic */ C3635o(float r1, float r2, float r3, float r4, boolean r5, kotlin.jvm.internal.i r6) {
        this(r1, r2, r3, r4, r5);
    }

    public final long a(androidx.compose.ui.unit.e r7) {
        return r0.d(r0.f18811a.c(r7.B1(this.f18806a), r7.B1(this.f18807b), r7.B1(this.f18808c), r7.B1(this.d), this.f18809e));
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3635o) == true) goto L8;
        return false;
    L8:
        C3635o r52 = (C3635o) r5;
        if (androidx.compose.ui.unit.i.j(this.f18806a, r52.f18806a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f18807b, r52.f18807b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.unit.i.j(this.f18808c, r52.f18808c) == true) goto L18;
        return false;
    L18:
        if (androidx.compose.ui.unit.i.j(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f18809e == r52.f18809e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.unit.i.k(this.f18806a) * 31) + androidx.compose.ui.unit.i.k(this.f18807b)) * 31) + androidx.compose.ui.unit.i.k(this.f18808c)) * 31) + androidx.compose.ui.unit.i.k(this.d)) * 31) + Boolean.hashCode(this.f18809e);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + androidx.compose.ui.unit.i.l(this.f18806a) + ", top=" + androidx.compose.ui.unit.i.l(this.f18807b) + ", end=" + androidx.compose.ui.unit.i.l(this.f18808c) + ", bottom=" + androidx.compose.ui.unit.i.l(this.d) + ", isLayoutDirectionAware=" + this.f18809e + ')';
    }

    public C3635o(float r3, float r4, float r5, float r6, boolean r7) {
        this.f18806a = r3;
        this.f18807b = r4;
        this.f18808c = r5;
        this.d = r6;
        this.f18809e = r7;
        boolean r02 = false;
        if (r3 < 0.0f) goto L5;
        boolean r32 = true;
    L6:
        if (r32 == true) goto L9;
        androidx.compose.ui.internal.a.a("Left must be non-negative");
    L9:
        if (r4 < 0.0f) goto L11;
        boolean r33 = true;
    L12:
        if (r33 == true) goto L15;
        androidx.compose.ui.internal.a.a("Top must be non-negative");
    L15:
        if (r5 < 0.0f) goto L17;
        boolean r34 = true;
    L18:
        if (r34 == true) goto L21;
        androidx.compose.ui.internal.a.a("Right must be non-negative");
    L21:
        if (r6 < 0.0f) goto L23;
        r02 = true;
    L23:
        if (r02 == true) goto L26;
        androidx.compose.ui.internal.a.a("Bottom must be non-negative");
        return;
    L26:
        return;
    L17:
        r34 = false;
        goto L18
    L11:
        r33 = false;
        goto L12
    L5:
        r32 = false;
        goto L6
    }
}
