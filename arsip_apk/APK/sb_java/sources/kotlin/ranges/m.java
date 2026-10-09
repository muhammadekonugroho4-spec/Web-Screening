package kotlin.ranges;

/* loaded from: classes3.dex */
public final class m extends k implements f, o {

    /* renamed from: e, reason: collision with root package name */
    public static final a f177561e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final m f177562f = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a() {
            return m.j();
        }

        public a() {
        }
    }

    static {
        f177561e = new a(null);
        f177562f = new m(1, 0);
    }

    public m(long r8, long r10) {
        super(r8, r10, 1);
    }

    public static final /* synthetic */ m j() {
        return f177562f;
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ Comparable b() {
        return m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.o
    public /* bridge */ /* synthetic */ boolean contains(Comparable r3) {
        return l(((Number) r3).longValue());
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ Comparable d() {
        return n();
    }

    @Override // kotlin.ranges.k
    public boolean equals(Object r5) {
        if ((r5 instanceof m) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        m r52 = (m) r5;
        if (e() == r52.e()) goto L11;
        return false;
    L11:
        if (f() != r52.f()) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((m) r5).isEmpty() == false) goto L8;
        return true;
    }

    @Override // kotlin.ranges.k
    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (int) ((31 * (e() ^ (e() >>> 32))) + (f() ^ (f() >>> 32)));
    }

    @Override // kotlin.ranges.k, kotlin.ranges.f
    public boolean isEmpty() {
        if (e() <= f()) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean l(long r3) {
        if (e() <= r3) goto L5;
        return false;
    L5:
        if (r3 > f()) goto L10;
        return true;
    L10:
        return false;
    }

    public Long m() {
        return Long.valueOf(f());
    }

    public Long n() {
        return Long.valueOf(e());
    }

    @Override // kotlin.ranges.k
    public String toString() {
        return e() + ".." + f();
    }
}
