package kotlin;

/* loaded from: classes3.dex */
public final class h implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f177429e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final h f177430f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f177431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177432b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177433c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f177429e = new a(null);
        f177430f = i.a();
    }

    public h(int r1, int r2, int r3) {
        this.f177431a = r1;
        this.f177432b = r2;
        this.f177433c = r3;
        this.d = b(r1, r2, r3);
    }

    public int a(h r2) {
        kotlin.jvm.internal.p.l(r2, "other");
        return this.d - r2.d;
    }

    public final int b(int r3, int r4, int r5) {
        if (r3 < 0) goto L12;
        if (r3 >= 256) goto L12;
        if (r4 < 0) goto L12;
        if (r4 >= 256) goto L12;
        if (r5 < 0) goto L12;
        if (r5 >= 256) goto L12;
        return ((r3 << 16) + (r4 << 8)) + r5;
    L12:
        throw new IllegalArgumentException(("Version components are out of range: " + r3 + '.' + r4 + '.' + r5).toString());
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((h) r1);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == false) goto L8;
        h r42 = (h) r4;
    L10:
        if (r42 != null) goto L13;
        return false;
    L13:
        if (this.d != r42.d) goto L15;
        return true;
    L15:
        return false;
    L8:
        r42 = null;
        goto L10
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(this.f177431a);
        r02.append('.');
        r02.append(this.f177432b);
        r02.append('.');
        r02.append(this.f177433c);
        return r02.toString();
    }

    public h(int r2, int r3) {
        this(r2, r3, 0);
    }
}
