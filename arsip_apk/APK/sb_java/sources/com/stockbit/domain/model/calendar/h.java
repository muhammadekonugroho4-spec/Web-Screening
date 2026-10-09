package com.stockbit.domain.model.calendar;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f81017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81019c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81020e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81021f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81022g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81023h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81024i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81025j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81026k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81027l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81028m;

    /* renamed from: n, reason: collision with root package name */
    public final String f81029n;

    /* renamed from: o, reason: collision with root package name */
    public final String f81030o;

    /* renamed from: p, reason: collision with root package name */
    public final String f81031p;

    /* renamed from: q, reason: collision with root package name */
    public final String f81032q;

    /* renamed from: r, reason: collision with root package name */
    public final String f81033r;

    /* renamed from: s, reason: collision with root package name */
    public final String f81034s;

    /* renamed from: t, reason: collision with root package name */
    public final String f81035t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f81036u;

    /* renamed from: v, reason: collision with root package name */
    public final String f81037v;

    /* renamed from: w, reason: collision with root package name */
    public final String f81038w;

    public h(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, boolean r37, String r38, String r39) {
        p.l(r17, "rightIssueId");
        p.l(r18, "companyId");
        p.l(r19, "companySymbol");
        p.l(r20, "cumDate");
        p.l(r21, "exDate");
        p.l(r22, "ratio");
        p.l(r23, "recDate");
        p.l(r24, "tradingStart");
        p.l(r25, "tradingEnd");
        p.l(r26, "old");
        p.l(r27, "new");
        p.l(r28, "factor");
        p.l(r29, "priceFactor");
        p.l(r30, FirebaseAnalytics.Param.PRICE);
        p.l(r31, "subDate");
        p.l(r32, "created");
        p.l(r33, "priceAdj");
        p.l(r34, "adjFactor");
        p.l(r35, "lastUpdate");
        p.l(r36, "newShare");
        p.l(r38, "eventNote");
        p.l(r39, "priceFormatted");
        this.f81017a = r17;
        this.f81018b = r18;
        this.f81019c = r19;
        this.d = r20;
        this.f81020e = r21;
        this.f81021f = r22;
        this.f81022g = r23;
        this.f81023h = r24;
        this.f81024i = r25;
        this.f81025j = r26;
        this.f81026k = r27;
        this.f81027l = r28;
        this.f81028m = r29;
        this.f81029n = r30;
        this.f81030o = r31;
        this.f81031p = r32;
        this.f81032q = r33;
        this.f81033r = r34;
        this.f81034s = r35;
        this.f81035t = r36;
        this.f81036u = r37;
        this.f81037v = r38;
        this.f81038w = r39;
    }

    public final String a() {
        return this.f81018b;
    }

    public final String b() {
        return this.f81019c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f81037v;
    }

    public final String e() {
        return this.f81020e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f81017a, r52.f81017a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81018b, r52.f81018b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81019c, r52.f81019c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81020e, r52.f81020e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81021f, r52.f81021f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81022g, r52.f81022g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81023h, r52.f81023h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81024i, r52.f81024i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81025j, r52.f81025j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81026k, r52.f81026k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81027l, r52.f81027l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81028m, r52.f81028m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f81029n, r52.f81029n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f81030o, r52.f81030o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f81031p, r52.f81031p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f81032q, r52.f81032q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f81033r, r52.f81033r) == true) goto L63;
        return false;
    L63:
        if (p.g(this.f81034s, r52.f81034s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f81035t, r52.f81035t) == true) goto L69;
        return false;
    L69:
        if (this.f81036u == r52.f81036u) goto L72;
        return false;
    L72:
        if (p.g(this.f81037v, r52.f81037v) == true) goto L75;
        return false;
    L75:
        if (p.g(this.f81038w, r52.f81038w) == true) goto L77;
        return false;
    L77:
        return true;
    }

    public final String f() {
        return this.f81027l;
    }

    public final String g() {
        return this.f81026k;
    }

    public final String h() {
        return this.f81025j;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((this.f81017a.hashCode() * 31) + this.f81018b.hashCode()) * 31) + this.f81019c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81020e.hashCode()) * 31) + this.f81021f.hashCode()) * 31) + this.f81022g.hashCode()) * 31) + this.f81023h.hashCode()) * 31) + this.f81024i.hashCode()) * 31) + this.f81025j.hashCode()) * 31) + this.f81026k.hashCode()) * 31) + this.f81027l.hashCode()) * 31) + this.f81028m.hashCode()) * 31) + this.f81029n.hashCode()) * 31) + this.f81030o.hashCode()) * 31) + this.f81031p.hashCode()) * 31) + this.f81032q.hashCode()) * 31) + this.f81033r.hashCode()) * 31) + this.f81034s.hashCode()) * 31) + this.f81035t.hashCode()) * 31) + Boolean.hashCode(this.f81036u)) * 31) + this.f81037v.hashCode()) * 31) + this.f81038w.hashCode();
    }

    public final String i() {
        return this.f81029n;
    }

    public final String j() {
        return this.f81038w;
    }

    public final String k() {
        return this.f81022g;
    }

    public final String l() {
        return this.f81024i;
    }

    public final String m() {
        return this.f81023h;
    }

    public final boolean n() {
        return this.f81036u;
    }

    public String toString() {
        return "CalendarRightIssueEntity(rightIssueId=" + this.f81017a + ", companyId=" + this.f81018b + ", companySymbol=" + this.f81019c + ", cumDate=" + this.d + ", exDate=" + this.f81020e + ", ratio=" + this.f81021f + ", recDate=" + this.f81022g + ", tradingStart=" + this.f81023h + ", tradingEnd=" + this.f81024i + ", old=" + this.f81025j + ", new=" + this.f81026k + ", factor=" + this.f81027l + ", priceFactor=" + this.f81028m + ", price=" + this.f81029n + ", subDate=" + this.f81030o + ", created=" + this.f81031p + ", priceAdj=" + this.f81032q + ", adjFactor=" + this.f81033r + ", lastUpdate=" + this.f81034s + ", newShare=" + this.f81035t + ", isCorpActionActive=" + this.f81036u + ", eventNote=" + this.f81037v + ", priceFormatted=" + this.f81038w + ")";
    }
}
