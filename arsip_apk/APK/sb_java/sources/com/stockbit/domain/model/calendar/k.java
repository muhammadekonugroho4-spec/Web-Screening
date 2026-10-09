package com.stockbit.domain.model.calendar;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f81055a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81056b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81057c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81058e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81059f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81060g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81061h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81062i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81063j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81064k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81065l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81066m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f81067n;

    /* renamed from: o, reason: collision with root package name */
    public final String f81068o;

    public k(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, boolean r30, String r31) {
        p.l(r17, "companySymbol");
        p.l(r18, "cumDate");
        p.l(r19, "exDate");
        p.l(r20, "recDate");
        p.l(r21, "ratio");
        p.l(r22, "new");
        p.l(r23, "old");
        p.l(r24, "factor");
        p.l(r25, "lock");
        p.l(r26, "created");
        p.l(r27, "newShare");
        p.l(r28, "newPrice");
        p.l(r29, "lastUpdate");
        p.l(r31, "eventNote");
        this.f81055a = r17;
        this.f81056b = r18;
        this.f81057c = r19;
        this.d = r20;
        this.f81058e = r21;
        this.f81059f = r22;
        this.f81060g = r23;
        this.f81061h = r24;
        this.f81062i = r25;
        this.f81063j = r26;
        this.f81064k = r27;
        this.f81065l = r28;
        this.f81066m = r29;
        this.f81067n = r30;
        this.f81068o = r31;
    }

    public final String a() {
        return this.f81055a;
    }

    public final String b() {
        return this.f81056b;
    }

    public final String c() {
        return this.f81068o;
    }

    public final String d() {
        return this.f81057c;
    }

    public final String e() {
        return this.f81061h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f81055a, r52.f81055a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81056b, r52.f81056b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81057c, r52.f81057c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81058e, r52.f81058e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81059f, r52.f81059f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81060g, r52.f81060g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81061h, r52.f81061h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81062i, r52.f81062i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81063j, r52.f81063j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81064k, r52.f81064k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81065l, r52.f81065l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81066m, r52.f81066m) == true) goto L48;
        return false;
    L48:
        if (this.f81067n == r52.f81067n) goto L51;
        return false;
    L51:
        if (p.g(this.f81068o, r52.f81068o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f81059f;
    }

    public final String g() {
        return this.f81060g;
    }

    public final String h() {
        return this.f81058e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f81055a.hashCode() * 31) + this.f81056b.hashCode()) * 31) + this.f81057c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81058e.hashCode()) * 31) + this.f81059f.hashCode()) * 31) + this.f81060g.hashCode()) * 31) + this.f81061h.hashCode()) * 31) + this.f81062i.hashCode()) * 31) + this.f81063j.hashCode()) * 31) + this.f81064k.hashCode()) * 31) + this.f81065l.hashCode()) * 31) + this.f81066m.hashCode()) * 31) + Boolean.hashCode(this.f81067n)) * 31) + this.f81068o.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.f81067n;
    }

    public String toString() {
        return "CalendarStockSplitEntity(companySymbol=" + this.f81055a + ", cumDate=" + this.f81056b + ", exDate=" + this.f81057c + ", recDate=" + this.d + ", ratio=" + this.f81058e + ", new=" + this.f81059f + ", old=" + this.f81060g + ", factor=" + this.f81061h + ", lock=" + this.f81062i + ", created=" + this.f81063j + ", newShare=" + this.f81064k + ", newPrice=" + this.f81065l + ", lastUpdate=" + this.f81066m + ", isCorpActionActive=" + this.f81067n + ", eventNote=" + this.f81068o + ")";
    }
}
