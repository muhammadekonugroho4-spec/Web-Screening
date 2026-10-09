package com.stockbit.domain.model.entity.company;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.stockbit.domain.model.type.RunningTradeDataItemColor;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f82679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82680b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82681c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82682e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82683f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82684g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82685h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82686i;

    /* renamed from: j, reason: collision with root package name */
    public final long f82687j;

    /* renamed from: k, reason: collision with root package name */
    public final RunningTradeDataItemColor f82688k;

    /* renamed from: l, reason: collision with root package name */
    public final RunningTradeDataItemColor f82689l;

    /* renamed from: m, reason: collision with root package name */
    public final RunningTradeDataItemColor f82690m;

    /* renamed from: n, reason: collision with root package name */
    public final RunningTradeDataItemColor f82691n;

    /* renamed from: o, reason: collision with root package name */
    public final RunningTradeDataItemColor f82692o;

    /* renamed from: p, reason: collision with root package name */
    public final int f82693p;

    /* renamed from: q, reason: collision with root package name */
    public final double f82694q;

    /* renamed from: r, reason: collision with root package name */
    public final double f82695r;

    /* renamed from: s, reason: collision with root package name */
    public final String f82696s;

    /* renamed from: t, reason: collision with root package name */
    public final double f82697t;

    /* renamed from: u, reason: collision with root package name */
    public final String f82698u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f82699v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f82700w;

    /* renamed from: x, reason: collision with root package name */
    public final String f82701x;

    /* renamed from: y, reason: collision with root package name */
    public final String f82702y;

    /* renamed from: z, reason: collision with root package name */
    public final String f82703z;

    public c(String r17, String r18, String r19, String r20, String r21, boolean r22, boolean r23, String r24, String r25, long r26, RunningTradeDataItemColor r28, RunningTradeDataItemColor r29, RunningTradeDataItemColor r30, RunningTradeDataItemColor r31, RunningTradeDataItemColor r32, int r33, double r34, double r36, String r38, double r39, String r41, boolean r42, boolean r43, String r44, String r45, String r46) {
        p.l(r17, CrashHianalyticsData.TIME);
        p.l(r18, "code");
        p.l(r19, FirebaseAnalytics.Param.PRICE);
        p.l(r20, Constants.KEY_ACTION);
        p.l(r21, "lot");
        p.l(r24, "buyer");
        p.l(r25, "seller");
        p.l(r28, "buyerColor");
        p.l(r29, "sellerColor");
        p.l(r30, "colorPrice");
        p.l(r31, "colorAction");
        p.l(r32, "colorVal");
        p.l(r38, "value");
        p.l(r41, "marketType");
        p.l(r44, "buyOrderNumber");
        p.l(r45, "sellOrderNumber");
        p.l(r46, "groupOrderNumber");
        this.f82679a = r17;
        this.f82680b = r18;
        this.f82681c = r19;
        this.d = r20;
        this.f82682e = r21;
        this.f82683f = r22;
        this.f82684g = r23;
        this.f82685h = r24;
        this.f82686i = r25;
        this.f82687j = r26;
        this.f82688k = r28;
        this.f82689l = r29;
        this.f82690m = r30;
        this.f82691n = r31;
        this.f82692o = r32;
        this.f82693p = r33;
        this.f82694q = r34;
        this.f82695r = r36;
        this.f82696s = r38;
        this.f82697t = r39;
        this.f82698u = r41;
        this.f82699v = r42;
        this.f82700w = r43;
        this.f82701x = r44;
        this.f82702y = r45;
        this.f82703z = r46;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f82701x;
    }

    public final String c() {
        return this.f82685h;
    }

    public final RunningTradeDataItemColor d() {
        return this.f82688k;
    }

    public final String e() {
        return this.f82680b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f82679a, r82.f82679a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82680b, r82.f82680b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82681c, r82.f82681c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82682e, r82.f82682e) == true) goto L24;
        return false;
    L24:
        if (this.f82683f == r82.f82683f) goto L27;
        return false;
    L27:
        if (this.f82684g == r82.f82684g) goto L30;
        return false;
    L30:
        if (p.g(this.f82685h, r82.f82685h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82686i, r82.f82686i) == true) goto L36;
        return false;
    L36:
        if (this.f82687j == r82.f82687j) goto L39;
        return false;
    L39:
        if (this.f82688k == r82.f82688k) goto L42;
        return false;
    L42:
        if (this.f82689l == r82.f82689l) goto L45;
        return false;
    L45:
        if (this.f82690m == r82.f82690m) goto L48;
        return false;
    L48:
        if (this.f82691n == r82.f82691n) goto L51;
        return false;
    L51:
        if (this.f82692o == r82.f82692o) goto L54;
        return false;
    L54:
        if (this.f82693p == r82.f82693p) goto L57;
        return false;
    L57:
        if (Double.compare(this.f82694q, r82.f82694q) == 0) goto L60;
        return false;
    L60:
        if (Double.compare(this.f82695r, r82.f82695r) == 0) goto L63;
        return false;
    L63:
        if (p.g(this.f82696s, r82.f82696s) == true) goto L66;
        return false;
    L66:
        if (Double.compare(this.f82697t, r82.f82697t) == 0) goto L69;
        return false;
    L69:
        if (p.g(this.f82698u, r82.f82698u) == true) goto L72;
        return false;
    L72:
        if (this.f82699v == r82.f82699v) goto L75;
        return false;
    L75:
        if (this.f82700w == r82.f82700w) goto L78;
        return false;
    L78:
        if (p.g(this.f82701x, r82.f82701x) == true) goto L81;
        return false;
    L81:
        if (p.g(this.f82702y, r82.f82702y) == true) goto L84;
        return false;
    L84:
        if (p.g(this.f82703z, r82.f82703z) == true) goto L86;
        return false;
    L86:
        return true;
    }

    public final RunningTradeDataItemColor f() {
        return this.f82691n;
    }

    public final RunningTradeDataItemColor g() {
        return this.f82690m;
    }

    public final RunningTradeDataItemColor h() {
        return this.f82692o;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.f82679a.hashCode() * 31) + this.f82680b.hashCode()) * 31) + this.f82681c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82682e.hashCode()) * 31) + Boolean.hashCode(this.f82683f)) * 31) + Boolean.hashCode(this.f82684g)) * 31) + this.f82685h.hashCode()) * 31) + this.f82686i.hashCode()) * 31) + Long.hashCode(this.f82687j)) * 31) + this.f82688k.hashCode()) * 31) + this.f82689l.hashCode()) * 31) + this.f82690m.hashCode()) * 31) + this.f82691n.hashCode()) * 31) + this.f82692o.hashCode()) * 31) + Integer.hashCode(this.f82693p)) * 31) + Double.hashCode(this.f82694q)) * 31) + Double.hashCode(this.f82695r)) * 31) + this.f82696s.hashCode()) * 31) + Double.hashCode(this.f82697t)) * 31) + this.f82698u.hashCode()) * 31) + Boolean.hashCode(this.f82699v)) * 31) + Boolean.hashCode(this.f82700w)) * 31) + this.f82701x.hashCode()) * 31) + this.f82702y.hashCode()) * 31) + this.f82703z.hashCode();
    }

    public final String i() {
        return this.f82703z;
    }

    public final String j() {
        return this.f82682e;
    }

    public final double k() {
        return this.f82695r;
    }

    public final String l() {
        return this.f82698u;
    }

    public final String m() {
        return this.f82681c;
    }

    public final int n() {
        return this.f82693p;
    }

    public final String o() {
        return this.f82702y;
    }

    public final String p() {
        return this.f82686i;
    }

    public final RunningTradeDataItemColor q() {
        return this.f82689l;
    }

    public final String r() {
        return this.f82679a;
    }

    public final long s() {
        return this.f82687j;
    }

    public final String t() {
        return this.f82696s;
    }

    public String toString() {
        return "RunningTradeItemData(time=" + this.f82679a + ", code=" + this.f82680b + ", price=" + this.f82681c + ", action=" + this.d + ", lot=" + this.f82682e + ", isBigLot=" + this.f82683f + ", isBigValue=" + this.f82684g + ", buyer=" + this.f82685h + ", seller=" + this.f82686i + ", tradeNumber=" + this.f82687j + ", buyerColor=" + this.f82688k + ", sellerColor=" + this.f82689l + ", colorPrice=" + this.f82690m + ", colorAction=" + this.f82691n + ", colorVal=" + this.f82692o + ", priceInt=" + this.f82693p + ", percentageDouble=" + this.f82694q + ", lotDouble=" + this.f82695r + ", value=" + this.f82696s + ", valueDouble=" + this.f82697t + ", marketType=" + this.f82698u + ", isBuyerHighlighted=" + this.f82699v + ", isSellerHighlighted=" + this.f82700w + ", buyOrderNumber=" + this.f82701x + ", sellOrderNumber=" + this.f82702y + ", groupOrderNumber=" + this.f82703z + ')';
    }

    public final double u() {
        return this.f82697t;
    }

    public final boolean v() {
        return this.f82683f;
    }

    public final boolean w() {
        return this.f82684g;
    }

    public final boolean x() {
        return this.f82699v;
    }

    public final boolean y() {
        return this.f82700w;
    }

    public /* synthetic */ c(String r31, String r32, String r33, String r34, String r35, boolean r36, boolean r37, String r38, String r39, long r40, RunningTradeDataItemColor r42, RunningTradeDataItemColor r43, RunningTradeDataItemColor r44, RunningTradeDataItemColor r45, RunningTradeDataItemColor r46, int r47, double r48, double r50, String r52, double r53, String r55, boolean r56, boolean r57, String r58, String r59, String r60, int r61, i r62) {
        if ((r61 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r61 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r61 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r61 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r61 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r61 & 32) == 0) goto L25;
        boolean r7 = false;
    L27:
        if ((r61 & 64) == 0) goto L29;
        boolean r9 = false;
    L31:
        if ((r61 & 128) == 0) goto L33;
        String r10 = "";
    L35:
        if ((r61 & 256) == 0) goto L37;
        String r11 = "";
    L39:
        if ((r61 & 512) == 0) goto L41;
        long r12 = 0;
    L43:
        if ((r61 & 1024) == 0) goto L45;
        RunningTradeDataItemColor r14 = RunningTradeDataItemColor.GRAY;
    L47:
        if ((r61 & 2048) == 0) goto L49;
        RunningTradeDataItemColor r15 = RunningTradeDataItemColor.GRAY;
    L51:
        if ((r61 & 4096) == 0) goto L53;
        RunningTradeDataItemColor r8 = RunningTradeDataItemColor.GRAY;
    L54:
        String r622 = r1;
        if ((r61 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        RunningTradeDataItemColor r13 = RunningTradeDataItemColor.GRAY;
    L58:
        RunningTradeDataItemColor r322 = r13;
        if ((r61 & 16384) == 0) goto L61;
        RunningTradeDataItemColor r16 = RunningTradeDataItemColor.GRAY;
    L63:
        if ((r61 & 32768) == 0) goto L65;
        int r162 = 0;
    L66:
        double r18 = 0.0d;
        if ((r61 & 65536) == 0) goto L69;
        double r20 = 0.0d;
    L71:
        if ((r61 & 131072) == 0) goto L73;
        double r22 = 0.0d;
    L75:
        if ((r61 & 262144) == 0) goto L77;
        String r17 = "";
    L79:
        if ((r61 & 524288) != 0) goto L83;
        r18 = r53;
    L83:
        if ((r61 & 1048576) == 0) goto L85;
        String r24 = "";
    L87:
        if ((r61 & 2097152) == 0) goto L89;
        boolean r25 = false;
    L91:
        if ((r61 & 4194304) == 0) goto L93;
        boolean r26 = false;
    L95:
        if ((r61 & 8388608) == 0) goto L97;
        String r27 = "";
    L99:
        if ((r61 & 16777216) == 0) goto L101;
        String r28 = "";
    L103:
        if ((r61 & 33554432) == 0) goto L106;
        String r612 = "";
    L107:
        this(r622, r3, r4, r5, r6, r7, r9, r10, r11, r12, r14, r15, r8, r322, r16, r162, r20, r22, r17, r18, r24, r25, r26, r27, r28, r612);
        return;
    L106:
        r612 = r60;
        goto L107
    L101:
        r28 = r59;
        goto L103
    L97:
        r27 = r58;
        goto L99
    L93:
        r26 = r57;
        goto L95
    L89:
        r25 = r56;
        goto L91
    L85:
        r24 = r55;
        goto L87
    L77:
        r17 = r52;
        goto L79
    L73:
        r22 = r50;
        goto L75
    L69:
        r20 = r48;
        goto L71
    L65:
        r162 = r47;
        goto L66
    L61:
        r16 = r46;
        goto L63
    L57:
        r13 = r45;
        goto L58
    L53:
        r8 = r44;
        goto L54
    L49:
        r15 = r43;
        goto L51
    L45:
        r14 = r42;
        goto L47
    L41:
        r12 = r40;
        goto L43
    L37:
        r11 = r39;
        goto L39
    L33:
        r10 = r38;
        goto L35
    L29:
        r9 = r37;
        goto L31
    L25:
        r7 = r36;
        goto L27
    L21:
        r6 = r35;
        goto L23
    L17:
        r5 = r34;
        goto L19
    L13:
        r4 = r33;
        goto L15
    L9:
        r3 = r32;
        goto L11
    L5:
        r1 = r31;
        goto L7
    }
}
