package kotlin.ranges;

/* loaded from: classes3.dex */
public final class j extends h implements f, o {

    /* renamed from: e, reason: collision with root package name */
    public static final a f177553e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final j f177554f = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a() {
            return j.j();
        }

        public a() {
        }
    }

    static {
        f177553e = new a(null);
        f177554f = new j(1, 0);
    }

    public j(int r2, int r3) {
        super(r2, r3, 1);
    }

    public static final /* synthetic */ j j() {
        return f177554f;
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ Comparable b() {
        return m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.o
    public /* bridge */ /* synthetic */ boolean contains(Comparable r1) {
        return l(((Number) r1).intValue());
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ Comparable d() {
        return n();
    }

    @Override // kotlin.ranges.h
    public boolean equals(Object r3) {
        if ((r3 instanceof j) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        j r32 = (j) r3;
        if (e() == r32.e()) goto L11;
        return false;
    L11:
        if (f() != r32.f()) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((j) r3).isEmpty() == false) goto L8;
        return true;
    }

    @Override // kotlin.ranges.h
    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (e() * 31) + f();
    }

    @Override // kotlin.ranges.h, kotlin.ranges.f
    public boolean isEmpty() {
        if (e() <= f()) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean l(int r2) {
        if (e() <= r2) goto L5;
        return false;
    L5:
        if (r2 > f()) goto L10;
        return true;
    L10:
        return false;
    }

    public Integer m() {
        return Integer.valueOf(f());
    }

    public Integer n() {
        return Integer.valueOf(e());
    }

    @Override // kotlin.ranges.h
    public String toString() {
        return e() + ".." + f();
    }
}
