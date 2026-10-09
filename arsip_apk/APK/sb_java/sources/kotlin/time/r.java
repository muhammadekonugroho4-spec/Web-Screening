package kotlin.time;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final a f180425e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final r f180426f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final r f180427g = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f180428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f180429b;

    /* renamed from: c, reason: collision with root package name */
    public final long f180430c;
    public final long d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final r a() {
            return r.b();
        }

        public final r b() {
            return r.c();
        }

        public a() {
        }
    }

    static {
        f180425e = new a(null);
        f180426f = new r(4611686018427387903L, true);
        f180427g = new r(Long.MAX_VALUE, false);
    }

    public r(long r5, boolean r7) {
        this.f180428a = r5;
        this.f180429b = r7;
        long r02 = 10;
        this.f180430c = r5 / r02;
        this.d = r5 % r02;
    }

    public static final /* synthetic */ boolean a(r r02) {
        return r02.f180429b;
    }

    public static final /* synthetic */ r b() {
        return f180427g;
    }

    public static final /* synthetic */ r c() {
        return f180426f;
    }

    public static final /* synthetic */ long d(r r2) {
        return r2.d;
    }

    public static final /* synthetic */ long e(r r2) {
        return r2.f180428a;
    }

    public static final /* synthetic */ long f(r r2) {
        return r2.f180430c;
    }
}
