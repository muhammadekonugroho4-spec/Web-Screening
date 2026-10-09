package androidx.paging;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: g, reason: collision with root package name */
    public static final a f26672g = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f26673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26675c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26676e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26677f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f26672g = new a(null);
    }

    public G(int r1, int r2, boolean r3, int r4, int r5, int r6) {
        this.f26673a = r1;
        this.f26674b = r2;
        this.f26675c = r3;
        this.d = r4;
        this.f26676e = r5;
        this.f26677f = r6;
        if (r3 == true) goto L9;
        if (r2 != 0) goto L9;
        throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
    L9:
        if (r5 == Integer.MAX_VALUE) goto L16;
        if (r5 >= ((r2 * 2) + r1)) goto L16;
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + r1 + ", prefetchDist=" + r2 + ", maxSize=" + r5);
    L16:
        if (r6 == Integer.MIN_VALUE) goto L21;
        if (r6 <= 0) goto L20;
        return;
    L20:
        throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
    }

    public /* synthetic */ G(int r1, int r2, boolean r3, int r4, int r5, int r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 2) == 0) goto L6;
        r2 = r1;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r3 = true;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r4 = r1 * 3;
    L12:
        if ((r7 & 16) == 0) goto L15;
        r5 = Integer.MAX_VALUE;
    L15:
        if ((r7 & 32) == 0) goto L17;
        r6 = Integer.MIN_VALUE;
    L17:
        int r72 = r6;
        int r62 = r5;
        int r52 = r4;
        boolean r42 = r3;
        this(r1, r2, r42, r52, r62, r72);
    }
}
