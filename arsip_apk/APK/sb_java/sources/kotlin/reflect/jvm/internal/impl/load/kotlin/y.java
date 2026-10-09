package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: k, reason: collision with root package name */
    public static final a f178875k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final y f178876l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final y f178877m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final y f178878n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final y f178879o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final y f178880p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final y f178881q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final y f178882r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final y f178883s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final y f178884t = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f178885a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f178886b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f178887c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f178888e;

    /* renamed from: f, reason: collision with root package name */
    public final y f178889f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f178890g;

    /* renamed from: h, reason: collision with root package name */
    public final y f178891h;

    /* renamed from: i, reason: collision with root package name */
    public final y f178892i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f178893j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178894a = null;

        static {
            int[] r02 = new int[Variance.values().length];
            r02[Variance.IN_VARIANCE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r02[Variance.INVARIANT.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            f178894a = r02;
        }
    }

    static {
        f178875k = new a(null);
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        y r8 = null;
        boolean r9 = false;
        y r10 = null;
        y r11 = null;
        boolean r12 = false;
        y r82 = new y(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, 1023, null);
        f178876l = r82;
        boolean r102 = false;
        boolean r112 = false;
        boolean r13 = false;
        boolean r14 = false;
        y r15 = null;
        boolean r16 = false;
        y r17 = null;
        y r18 = null;
        boolean r19 = true;
        y r92 = new y(r102, r112, r12, r13, r14, r15, r16, r17, r18, r19, 511, null);
        f178877m = r92;
        boolean r172 = false;
        boolean r182 = true;
        boolean r192 = false;
        boolean r20 = false;
        boolean r21 = false;
        y r22 = null;
        boolean r23 = false;
        y r24 = null;
        y r25 = null;
        boolean r26 = false;
        f178878n = new y(r172, r182, r192, r20, r21, r22, r23, r24, r25, r26, 1021, null);
        boolean r93 = false;
        y r103 = null;
        y r113 = null;
        f178879o = new y(r3, r4, r5, r6, r7, r82, r93, r103, r113, r12, 988, null);
        boolean r104 = false;
        boolean r114 = false;
        boolean r132 = false;
        boolean r142 = false;
        boolean r162 = false;
        y r173 = null;
        y r183 = null;
        boolean r193 = true;
        f178880p = new y(r104, r114, r12, r132, r142, r92, r162, r173, r183, r193, 476, null);
        kotlin.jvm.internal.i r143 = null;
        boolean r42 = true;
        boolean r94 = false;
        y r105 = null;
        y r115 = null;
        f178881q = new y(r3, r42, r5, r6, r7, r82, r94, r105, r115, r12, 988, r143);
        boolean r43 = false;
        boolean r62 = true;
        f178882r = new y(r3, r43, r5, r62, r7, r82, r94, r105, r115, r12, 983, r143);
        f178883s = new y(r3, r43, r5, r62, r7, r82, r94, r105, r115, r12, 919, r143);
        boolean r52 = true;
        boolean r63 = false;
        f178884t = new y(r3, r43, r52, r63, r7, r82, r94, r105, r115, r12, 984, r143);
    }

    public y(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, y r6, boolean r7, y r8, y r9, boolean r10) {
        this.f178885a = r1;
        this.f178886b = r2;
        this.f178887c = r3;
        this.d = r4;
        this.f178888e = r5;
        this.f178889f = r6;
        this.f178890g = r7;
        this.f178891h = r8;
        this.f178892i = r9;
        this.f178893j = r10;
    }

    public final boolean a() {
        return this.f178890g;
    }

    public final boolean b() {
        return this.f178893j;
    }

    public final boolean c() {
        return this.f178886b;
    }

    public final boolean d() {
        return this.f178885a;
    }

    public final boolean e() {
        return this.f178887c;
    }

    public final y f(Variance r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "effectiveVariance");
        if (r3 == true) goto L5;
    L7:
        int r22 = b.f178894a[r2.ordinal()];
        if (r22 != 1) goto L10;
        y r23 = this.f178891h;
        if (r23 != null) goto L22;
    L21:
        return this;
    L22:
        return r23;
    L10:
        if (r22 == 2) goto L15;
        y r24 = this.f178889f;
        if (r24 == null) goto L21;
        return r24;
    L15:
        y r25 = this.f178892i;
        if (r25 == null) goto L21;
        return r25;
    L5:
        if (this.f178887c == false) goto L7;
        goto L7
    }

    public final y g() {
        boolean r2 = true;
        boolean r10 = false;
        return new y(this.f178885a, r2, this.f178887c, this.d, this.f178888e, this.f178889f, this.f178890g, this.f178891h, this.f178892i, r10, 512, null);
    }

    public /* synthetic */ y(boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, y r8, boolean r9, y r10, y r11, boolean r12, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = true;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = true;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = true;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = r8;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = r8;
    L30:
        if ((r13 & 512) == 0) goto L33;
        boolean r132 = false;
    L32:
        y r122 = r11;
        y r112 = r10;
        boolean r102 = r9;
        y r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L33:
        r132 = r12;
        goto L32
    }
}
