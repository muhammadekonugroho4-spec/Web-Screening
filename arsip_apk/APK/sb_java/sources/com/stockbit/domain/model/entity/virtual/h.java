package com.stockbit.domain.model.entity.virtual;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f83869a;

    /* renamed from: b, reason: collision with root package name */
    public String f83870b;

    /* renamed from: c, reason: collision with root package name */
    public double f83871c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83872e;

    /* renamed from: f, reason: collision with root package name */
    public String f83873f;

    /* renamed from: g, reason: collision with root package name */
    public String f83874g;

    /* renamed from: h, reason: collision with root package name */
    public double f83875h;

    /* renamed from: i, reason: collision with root package name */
    public double f83876i;

    /* renamed from: j, reason: collision with root package name */
    public double f83877j;

    /* renamed from: k, reason: collision with root package name */
    public double f83878k;

    /* renamed from: l, reason: collision with root package name */
    public double f83879l;

    /* renamed from: m, reason: collision with root package name */
    public double f83880m;

    /* renamed from: n, reason: collision with root package name */
    public double f83881n;

    /* renamed from: o, reason: collision with root package name */
    public double f83882o;

    /* renamed from: p, reason: collision with root package name */
    public String f83883p;

    /* renamed from: q, reason: collision with root package name */
    public final VirtualPortfolioResultExercise f83884q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f83885r;

    /* renamed from: s, reason: collision with root package name */
    public String f83886s;

    public h(String r1, String r2, double r3, String r5, String r6, String r7, String r8, double r9, double r11, double r13, double r15, double r17, double r19, double r21, double r23, String r25, VirtualPortfolioResultExercise r26, Integer r27, String r28) {
        this.f83869a = r1;
        this.f83870b = r2;
        this.f83871c = r3;
        this.d = r5;
        this.f83872e = r6;
        this.f83873f = r7;
        this.f83874g = r8;
        this.f83875h = r9;
        this.f83876i = r11;
        this.f83877j = r13;
        this.f83878k = r15;
        this.f83879l = r17;
        this.f83880m = r19;
        this.f83881n = r21;
        this.f83882o = r23;
        this.f83883p = r25;
        this.f83884q = r26;
        this.f83885r = r27;
        this.f83886s = r28;
    }

    public final Integer a() {
        return this.f83885r;
    }

    public final String b() {
        return this.f83870b;
    }

    public final String c() {
        return this.d;
    }

    public final double d() {
        return this.f83871c;
    }

    public final String e() {
        return this.f83872e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f83869a, r82.f83869a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83870b, r82.f83870b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f83871c, r82.f83871c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83872e, r82.f83872e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83873f, r82.f83873f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83874g, r82.f83874g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f83875h, r82.f83875h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f83876i, r82.f83876i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f83877j, r82.f83877j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f83878k, r82.f83878k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f83879l, r82.f83879l) == 0) goto L45;
        return false;
    L45:
        if (Double.compare(this.f83880m, r82.f83880m) == 0) goto L48;
        return false;
    L48:
        if (Double.compare(this.f83881n, r82.f83881n) == 0) goto L51;
        return false;
    L51:
        if (Double.compare(this.f83882o, r82.f83882o) == 0) goto L54;
        return false;
    L54:
        if (p.g(this.f83883p, r82.f83883p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f83884q, r82.f83884q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f83885r, r82.f83885r) == true) goto L63;
        return false;
    L63:
        if (p.g(this.f83886s, r82.f83886s) == true) goto L65;
        return false;
    L65:
        return true;
    }

    public final VirtualPortfolioResultExercise f() {
        return this.f83884q;
    }

    public final double g() {
        return this.f83876i;
    }

    public final double h() {
        return this.f83877j;
    }

    public int hashCode() {
        String r02 = this.f83869a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83870b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (((r04 + r22) * 31) + Double.hashCode(this.f83871c)) * 31;
        String r23 = this.d;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.f83872e;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83873f;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83874g;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (((((((((((((((((r08 + r210) * 31) + Double.hashCode(this.f83875h)) * 31) + Double.hashCode(this.f83876i)) * 31) + Double.hashCode(this.f83877j)) * 31) + Double.hashCode(this.f83878k)) * 31) + Double.hashCode(this.f83879l)) * 31) + Double.hashCode(this.f83880m)) * 31) + Double.hashCode(this.f83881n)) * 31) + Double.hashCode(this.f83882o)) * 31;
        String r211 = this.f83883p;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        VirtualPortfolioResultExercise r213 = this.f83884q;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Integer r215 = this.f83885r;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83886s;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final double i() {
        return this.f83878k;
    }

    public final double j() {
        return this.f83879l;
    }

    public final String k() {
        return this.f83883p;
    }

    public final String l() {
        return this.f83873f;
    }

    public final String m() {
        return this.f83874g;
    }

    public final String n() {
        return this.f83886s;
    }

    public final String o() {
        return this.f83869a;
    }

    public final double p() {
        return this.f83875h;
    }

    public final double q() {
        return this.f83882o;
    }

    public final double r() {
        return this.f83880m;
    }

    public final double s() {
        return this.f83881n;
    }

    public String toString() {
        return "VirtualPortfolioLatest(symbol=" + this.f83869a + ", availableLot=" + this.f83870b + ", balanceLot=" + this.f83871c + ", availableShare=" + this.d + ", balanceShare=" + this.f83872e + ", sellOpen=" + this.f83873f + ", sellOpenToday=" + this.f83874g + ", total=" + this.f83875h + ", price=" + this.f83876i + ", priceAverage=" + this.f83877j + ", priceAverageFee=" + this.f83878k + ", priceLatest=" + this.f83879l + ", unrealisedMarketvalue=" + this.f83880m + ", unrealisedProfitloss=" + this.f83881n + ", unrealisedGain=" + this.f83882o + ", security=" + this.f83883p + ", exerciseData=" + this.f83884q + ", allowOrder=" + this.f83885r + ", stockOnHand=" + this.f83886s + ')';
    }

    public /* synthetic */ h(String r30, String r31, double r32, String r34, String r35, String r36, String r37, double r38, double r40, double r42, double r44, double r46, double r48, double r50, double r52, String r54, VirtualPortfolioResultExercise r55, Integer r56, String r57, int r58, i r59) {
        if ((r58 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r58 & 2) == 0) goto L9;
        String r3 = null;
    L10:
        double r5 = 0.0d;
        if ((r58 & 4) == 0) goto L13;
        double r7 = 0.0d;
    L15:
        if ((r58 & 8) == 0) goto L17;
        String r4 = null;
    L19:
        if ((r58 & 16) == 0) goto L21;
        String r9 = null;
    L23:
        if ((r58 & 32) == 0) goto L25;
        String r10 = null;
    L27:
        if ((r58 & 64) == 0) goto L29;
        String r11 = null;
    L31:
        if ((r58 & 128) == 0) goto L33;
        double r12 = 0.0d;
    L35:
        if ((r58 & 256) == 0) goto L37;
        double r14 = 0.0d;
    L39:
        if ((r58 & 512) == 0) goto L41;
        double r16 = 0.0d;
    L43:
        if ((r58 & 1024) == 0) goto L45;
        double r18 = 0.0d;
    L47:
        if ((r58 & 2048) == 0) goto L49;
        double r20 = 0.0d;
    L51:
        if ((r58 & 4096) == 0) goto L53;
        double r22 = 0.0d;
    L55:
        if ((r58 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        double r24 = 0.0d;
    L59:
        if ((r58 & 16384) != 0) goto L63;
        r5 = r52;
    L63:
        if ((32768 & r58) == 0) goto L65;
        String r2 = null;
    L67:
        if ((r58 & 65536) == 0) goto L69;
        VirtualPortfolioResultExercise r26 = null;
    L71:
        if ((r58 & 131072) == 0) goto L73;
        Integer r27 = 1;
    L75:
        if ((r58 & 262144) == 0) goto L78;
        String r582 = null;
    L79:
        this(r1, r3, r7, r4, r9, r10, r11, r12, r14, r16, r18, r20, r22, r24, r5, r2, r26, r27, r582);
        return;
    L78:
        r582 = r57;
        goto L79
    L73:
        r27 = r56;
        goto L75
    L69:
        r26 = r55;
        goto L71
    L65:
        r2 = r54;
        goto L67
    L57:
        r24 = r50;
        goto L59
    L53:
        r22 = r48;
        goto L55
    L49:
        r20 = r46;
        goto L51
    L45:
        r18 = r44;
        goto L47
    L41:
        r16 = r42;
        goto L43
    L37:
        r14 = r40;
        goto L39
    L33:
        r12 = r38;
        goto L35
    L29:
        r11 = r37;
        goto L31
    L25:
        r10 = r36;
        goto L27
    L21:
        r9 = r35;
        goto L23
    L17:
        r4 = r34;
        goto L19
    L13:
        r7 = r32;
        goto L15
    L9:
        r3 = r31;
        goto L10
    L5:
        r1 = r30;
        goto L7
    }
}
