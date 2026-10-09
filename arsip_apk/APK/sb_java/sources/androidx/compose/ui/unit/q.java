package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f20648e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final q f20649f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f20650a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20652c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final q a() {
            return q.a();
        }

        public a() {
        }
    }

    static {
        f20648e = new a(null);
        f20649f = new q(0, 0, 0, 0);
    }

    public q(int r1, int r2, int r3, int r4) {
        this.f20650a = r1;
        this.f20651b = r2;
        this.f20652c = r3;
        this.d = r4;
    }

    public static final /* synthetic */ q a() {
        return f20649f;
    }

    public static /* synthetic */ q c(q r02, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f20650a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f20651b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f20652c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.b(r1, r2, r3, r4);
    }

    public final q b(int r2, int r3, int r4, int r5) {
        return new q(r2, r3, r4, r5);
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.d - this.f20651b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f20650a == r52.f20650a) goto L12;
        return false;
    L12:
        if (this.f20651b == r52.f20651b) goto L15;
        return false;
    L15:
        if (this.f20652c == r52.f20652c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int f() {
        return this.f20650a;
    }

    public final int g() {
        return this.f20652c;
    }

    public final long h() {
        return s.c((e() & 4294967295L) | (k() << 32));
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f20650a) * 31) + Integer.hashCode(this.f20651b)) * 31) + Integer.hashCode(this.f20652c)) * 31) + Integer.hashCode(this.d);
    }

    public final int i() {
        return this.f20651b;
    }

    public final long j() {
        return o.f((this.f20651b & 4294967295L) | (this.f20650a << 32));
    }

    public final int k() {
        return this.f20652c - this.f20650a;
    }

    public final boolean l() {
        if (this.f20650a < this.f20652c) goto L5;
        return true;
    L5:
        if (this.f20651b >= this.d) goto L11;
        return false;
    L11:
        return true;
    }

    public final q m(int r5, int r6) {
        return new q(this.f20650a + r5, this.f20651b + r6, this.f20652c + r5, this.d + r6);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f20650a + ", " + this.f20651b + ", " + this.f20652c + ", " + this.d + ')';
    }
}
