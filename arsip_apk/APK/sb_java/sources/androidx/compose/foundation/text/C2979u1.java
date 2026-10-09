package androidx.compose.foundation.text;

/* renamed from: androidx.compose.foundation.text.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979u1 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f11024g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final C2979u1 f11025h = null;

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f11026a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f11027b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.l f11028c;
    public final kotlin.jvm.functions.l d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.l f11029e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.jvm.functions.l f11030f;

    /* renamed from: androidx.compose.foundation.text.u1$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C2979u1 a() {
            return C2979u1.a();
        }

        public a() {
        }
    }

    static {
        f11024g = new a(null);
        kotlin.jvm.functions.l r3 = null;
        kotlin.jvm.functions.l r4 = null;
        kotlin.jvm.functions.l r5 = null;
        kotlin.jvm.functions.l r6 = null;
        kotlin.jvm.functions.l r7 = null;
        kotlin.jvm.functions.l r8 = null;
        f11025h = new C2979u1(r3, r4, r5, r6, r7, r8, 63, null);
    }

    public C2979u1(kotlin.jvm.functions.l r1, kotlin.jvm.functions.l r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.l r4, kotlin.jvm.functions.l r5, kotlin.jvm.functions.l r6) {
        this.f11026a = r1;
        this.f11027b = r2;
        this.f11028c = r3;
        this.d = r4;
        this.f11029e = r5;
        this.f11030f = r6;
    }

    public static final /* synthetic */ C2979u1 a() {
        return f11025h;
    }

    public final kotlin.jvm.functions.l b() {
        return this.f11026a;
    }

    public final kotlin.jvm.functions.l c() {
        return this.f11027b;
    }

    public final kotlin.jvm.functions.l d() {
        return this.f11028c;
    }

    public final kotlin.jvm.functions.l e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2979u1) == true) goto L8;
        return false;
    L8:
        C2979u1 r52 = (C2979u1) r5;
        if (this.f11026a == r52.f11026a) goto L11;
    L21:
        return false;
    L11:
        if (this.f11027b != r52.f11027b) goto L21;
        if (this.f11028c != r52.f11028c) goto L21;
        if (this.d != r52.d) goto L21;
        if (this.f11029e != r52.f11029e) goto L21;
        if (this.f11030f != r52.f11030f) goto L21;
        return true;
    }

    public final kotlin.jvm.functions.l f() {
        return this.f11029e;
    }

    public final kotlin.jvm.functions.l g() {
        return this.f11030f;
    }

    public int hashCode() {
        kotlin.jvm.functions.l r02 = this.f11026a;
        int r1 = 0;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        int r04 = r03 * 31;
        kotlin.jvm.functions.l r2 = this.f11027b;
        if (r2 == null) goto L9;
        int r22 = r2.hashCode();
    L10:
        int r05 = (r04 + r22) * 31;
        kotlin.jvm.functions.l r23 = this.f11028c;
        if (r23 == null) goto L13;
        int r24 = r23.hashCode();
    L14:
        int r06 = (r05 + r24) * 31;
        kotlin.jvm.functions.l r25 = this.d;
        if (r25 == null) goto L17;
        int r26 = r25.hashCode();
    L18:
        int r07 = (r06 + r26) * 31;
        kotlin.jvm.functions.l r27 = this.f11029e;
        if (r27 == null) goto L21;
        int r28 = r27.hashCode();
    L22:
        int r08 = (r07 + r28) * 31;
        kotlin.jvm.functions.l r29 = this.f11030f;
        if (r29 == null) goto L26;
        r1 = r29.hashCode();
    L26:
        return r08 + r1;
    L21:
        r28 = 0;
        goto L22
    L17:
        r26 = 0;
        goto L18
    L13:
        r24 = 0;
        goto L14
    L9:
        r22 = 0;
        goto L10
    L5:
        r03 = 0;
        goto L6
    }

    public /* synthetic */ C2979u1(kotlin.jvm.functions.l r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.l r4, kotlin.jvm.functions.l r5, kotlin.jvm.functions.l r6, kotlin.jvm.functions.l r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        kotlin.jvm.functions.l r82 = null;
    L20:
        kotlin.jvm.functions.l r72 = r6;
        kotlin.jvm.functions.l r62 = r5;
        kotlin.jvm.functions.l r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
