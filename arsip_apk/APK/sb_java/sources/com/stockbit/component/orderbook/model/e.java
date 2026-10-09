package com.stockbit.component.orderbook.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: q, reason: collision with root package name */
    public static final a f73060q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final e f73061r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final e f73062s = null;

    /* renamed from: a, reason: collision with root package name */
    public final b f73063a;

    /* renamed from: b, reason: collision with root package name */
    public final b f73064b;

    /* renamed from: c, reason: collision with root package name */
    public final b f73065c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final b f73066e;

    /* renamed from: f, reason: collision with root package name */
    public final b f73067f;

    /* renamed from: g, reason: collision with root package name */
    public final b f73068g;

    /* renamed from: h, reason: collision with root package name */
    public final b f73069h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f73070i;

    /* renamed from: j, reason: collision with root package name */
    public final b f73071j;

    /* renamed from: k, reason: collision with root package name */
    public final b f73072k;

    /* renamed from: l, reason: collision with root package name */
    public final b f73073l;

    /* renamed from: m, reason: collision with root package name */
    public final double f73074m;

    /* renamed from: n, reason: collision with root package name */
    public final b f73075n;

    /* renamed from: o, reason: collision with root package name */
    public final b f73076o;

    /* renamed from: p, reason: collision with root package name */
    public final b f73077p;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a() {
            return e.a();
        }

        public final e b() {
            return e.b();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f73078c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f73079a;

        /* renamed from: b, reason: collision with root package name */
        public final OrderBookColor f73080b;

        static {
        }

        public b(String r2, OrderBookColor r3) {
            p.l(r2, "value");
            p.l(r3, Constants.KEY_COLOR);
            this.f73079a = r2;
            this.f73080b = r3;
        }

        public final OrderBookColor a() {
            return this.f73080b;
        }

        public final String b() {
            return this.f73079a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f73079a, r52.f73079a) == true) goto L12;
            return false;
        L12:
            if (this.f73080b == r52.f73080b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f73079a.hashCode() * 31) + this.f73080b.hashCode();
        }

        public String toString() {
            return "Field(value=" + this.f73079a + ", color=" + this.f73080b + ')';
        }

        public /* synthetic */ b(String r1, OrderBookColor r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = OrderBookColor.PRIMARY;
        L5:
            this(r1, r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f73060q = new a(null);
        int r4 = 2;
        b r3 = new b("840", 0 == true ? 1 : 0, r4, 0 == true ? 1 : 0);
        b r02 = new b("690", 0 == true ? 1 : 0, r4, 0 == true ? 1 : 0);
        OrderBookColor r7 = OrderBookColor.RED;
        b r6 = new b("699", r7);
        String r9 = "-";
        b r62 = new b(r9, 0 == true ? 1 : 0, r4, 0 == true ? 1 : 0);
        b r10 = new b(r9, 0 == true ? 1 : 0, r4, 0 == true ? 1 : 0);
        b r8 = new b("725", r7);
        OrderBookColor r13 = OrderBookColor.GREEN;
        int r2 = 2;
        f73061r = new e(r3, r02, r6, r62, r10, r8, new b("770", r13), new b("81.51K", 0 == true ? 1 : 0, r4, 0 == true ? 1 : 0), true, new b("273.27K", r7), new b("690", r7), new b("690", r7), 765.0d, new b("765", null, r2, 0 == true ? 1 : 0), new b("770", r13), new b("19.10B", r7));
        f73062s = new e(new b(r9, null, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), false, new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), 0.0d, new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0), new b(r9, 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0));
    }

    public e(b r17, b r18, b r19, b r20, b r21, b r22, b r23, b r24, boolean r25, b r26, b r27, b r28, double r29, b r31, b r32, b r33) {
        p.l(r17, "araPrice");
        p.l(r18, "arbPrice");
        p.l(r19, "averagePrice");
        p.l(r20, "fBuyPrice");
        p.l(r21, "fSellPrice");
        p.l(r22, "highPrice");
        p.l(r23, "iepPrice");
        p.l(r24, "ievPrice");
        p.l(r26, "lot");
        p.l(r27, "lowPrice");
        p.l(r28, "openPrice");
        p.l(r31, "previousPriceFormatted");
        p.l(r32, "totalFrequency");
        p.l(r33, "value");
        this.f73063a = r17;
        this.f73064b = r18;
        this.f73065c = r19;
        this.d = r20;
        this.f73066e = r21;
        this.f73067f = r22;
        this.f73068g = r23;
        this.f73069h = r24;
        this.f73070i = r25;
        this.f73071j = r26;
        this.f73072k = r27;
        this.f73073l = r28;
        this.f73074m = r29;
        this.f73075n = r31;
        this.f73076o = r32;
        this.f73077p = r33;
    }

    public static final /* synthetic */ e a() {
        return f73061r;
    }

    public static final /* synthetic */ e b() {
        return f73062s;
    }

    public static /* synthetic */ e d(e r17, b r18, b r19, b r20, b r21, b r22, b r23, b r24, b r25, boolean r26, b r27, b r28, b r29, double r30, b r32, b r33, b r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        b r2 = r17.f73063a;
    L7:
        if ((r35 & 2) == 0) goto L9;
        b r3 = r17.f73064b;
    L11:
        if ((r35 & 4) == 0) goto L13;
        b r4 = r17.f73065c;
    L15:
        if ((r35 & 8) == 0) goto L17;
        b r5 = r17.d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        b r6 = r17.f73066e;
    L23:
        if ((r35 & 32) == 0) goto L25;
        b r7 = r17.f73067f;
    L27:
        if ((r35 & 64) == 0) goto L29;
        b r8 = r17.f73068g;
    L31:
        if ((r35 & 128) == 0) goto L33;
        b r9 = r17.f73069h;
    L35:
        if ((r35 & 256) == 0) goto L37;
        boolean r10 = r17.f73070i;
    L39:
        if ((r35 & 512) == 0) goto L41;
        b r11 = r17.f73071j;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        b r12 = r17.f73072k;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        b r13 = r17.f73073l;
    L51:
        if ((r35 & 4096) == 0) goto L53;
        double r14 = r17.f73074m;
    L54:
        b r182 = r2;
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        b r210 = r17.f73075n;
    L58:
        b r192 = r210;
        if ((r35 & 16384) == 0) goto L61;
        b r211 = r17.f73076o;
    L63:
        if ((r35 & 32768) == 0) goto L66;
        b r352 = r17.f73077p;
    L68:
        return r17.c(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r192, r211, r352);
    L66:
        r352 = r34;
        goto L68
    L61:
        r211 = r33;
        goto L63
    L57:
        r210 = r32;
        goto L58
    L53:
        r14 = r30;
        goto L54
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final e c(b r20, b r21, b r22, b r23, b r24, b r25, b r26, b r27, boolean r28, b r29, b r30, b r31, double r32, b r34, b r35, b r36) {
        p.l(r20, "araPrice");
        p.l(r21, "arbPrice");
        p.l(r22, "averagePrice");
        p.l(r23, "fBuyPrice");
        p.l(r24, "fSellPrice");
        p.l(r25, "highPrice");
        p.l(r26, "iepPrice");
        p.l(r27, "ievPrice");
        p.l(r29, "lot");
        p.l(r30, "lowPrice");
        p.l(r31, "openPrice");
        p.l(r34, "previousPriceFormatted");
        p.l(r35, "totalFrequency");
        p.l(r36, "value");
        return new e(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36);
    }

    public final b e() {
        return this.f73063a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f73063a, r82.f73063a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f73064b, r82.f73064b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73065c, r82.f73065c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f73066e, r82.f73066e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f73067f, r82.f73067f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f73068g, r82.f73068g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f73069h, r82.f73069h) == true) goto L33;
        return false;
    L33:
        if (this.f73070i == r82.f73070i) goto L36;
        return false;
    L36:
        if (p.g(this.f73071j, r82.f73071j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f73072k, r82.f73072k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f73073l, r82.f73073l) == true) goto L45;
        return false;
    L45:
        if (Double.compare(this.f73074m, r82.f73074m) == 0) goto L48;
        return false;
    L48:
        if (p.g(this.f73075n, r82.f73075n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f73076o, r82.f73076o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f73077p, r82.f73077p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final b f() {
        return this.f73064b;
    }

    public final b g() {
        return this.f73065c;
    }

    public final b h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f73063a.hashCode() * 31) + this.f73064b.hashCode()) * 31) + this.f73065c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f73066e.hashCode()) * 31) + this.f73067f.hashCode()) * 31) + this.f73068g.hashCode()) * 31) + this.f73069h.hashCode()) * 31) + Boolean.hashCode(this.f73070i)) * 31) + this.f73071j.hashCode()) * 31) + this.f73072k.hashCode()) * 31) + this.f73073l.hashCode()) * 31) + Double.hashCode(this.f73074m)) * 31) + this.f73075n.hashCode()) * 31) + this.f73076o.hashCode()) * 31) + this.f73077p.hashCode();
    }

    public final b i() {
        return this.f73066e;
    }

    public final b j() {
        return this.f73067f;
    }

    public final b k() {
        return this.f73068g;
    }

    public final b l() {
        return this.f73069h;
    }

    public final b m() {
        return this.f73071j;
    }

    public final b n() {
        return this.f73072k;
    }

    public final b o() {
        return this.f73073l;
    }

    public final double p() {
        return this.f73074m;
    }

    public final b q() {
        return this.f73075n;
    }

    public final b r() {
        return this.f73076o;
    }

    public final b s() {
        return this.f73077p;
    }

    public final boolean t() {
        return this.f73070i;
    }

    public String toString() {
        return "OrderBookComposeOHLCUIState(araPrice=" + this.f73063a + ", arbPrice=" + this.f73064b + ", averagePrice=" + this.f73065c + ", fBuyPrice=" + this.d + ", fSellPrice=" + this.f73066e + ", highPrice=" + this.f73067f + ", iepPrice=" + this.f73068g + ", ievPrice=" + this.f73069h + ", isForeignGroupVisible=" + this.f73070i + ", lot=" + this.f73071j + ", lowPrice=" + this.f73072k + ", openPrice=" + this.f73073l + ", previousPrice=" + this.f73074m + ", previousPriceFormatted=" + this.f73075n + ", totalFrequency=" + this.f73076o + ", value=" + this.f73077p + ')';
    }
}
