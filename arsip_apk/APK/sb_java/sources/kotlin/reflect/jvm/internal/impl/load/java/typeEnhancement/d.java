package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f178719e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final d f178720f = null;

    /* renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f178721a;

    /* renamed from: b, reason: collision with root package name */
    public final MutabilityQualifier f178722b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f178723c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a() {
            return d.a();
        }

        public a() {
        }
    }

    static {
        f178719e = new a(null);
        NullabilityQualifier r3 = null;
        MutabilityQualifier r4 = null;
        boolean r5 = false;
        boolean r6 = false;
        f178720f = new d(r3, r4, r5, r6, 8, null);
    }

    public d(NullabilityQualifier r1, MutabilityQualifier r2, boolean r3, boolean r4) {
        this.f178721a = r1;
        this.f178722b = r2;
        this.f178723c = r3;
        this.d = r4;
    }

    public static final /* synthetic */ d a() {
        return f178720f;
    }

    public final boolean b() {
        return this.f178723c;
    }

    public final MutabilityQualifier c() {
        return this.f178722b;
    }

    public final NullabilityQualifier d() {
        return this.f178721a;
    }

    public final boolean e() {
        return this.d;
    }

    public /* synthetic */ d(NullabilityQualifier r1, MutabilityQualifier r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = false;
    L5:
        this(r1, r2, r3, r4);
    }
}
