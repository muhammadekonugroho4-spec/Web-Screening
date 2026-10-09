package com.stockbit.domain.model.calendar;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81004b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81005c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81006e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81007f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81008g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81009h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81010i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81011j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81012k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81013l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81014m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f81015n;

    /* renamed from: o, reason: collision with root package name */
    public final String f81016o;

    public g(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, boolean r30, String r31) {
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
        this.f81003a = r17;
        this.f81004b = r18;
        this.f81005c = r19;
        this.d = r20;
        this.f81006e = r21;
        this.f81007f = r22;
        this.f81008g = r23;
        this.f81009h = r24;
        this.f81010i = r25;
        this.f81011j = r26;
        this.f81012k = r27;
        this.f81013l = r28;
        this.f81014m = r29;
        this.f81015n = r30;
        this.f81016o = r31;
    }

    public final String a() {
        return this.f81003a;
    }

    public final String b() {
        return this.f81004b;
    }

    public final String c() {
        return this.f81016o;
    }

    public final String d() {
        return this.f81005c;
    }

    public final String e() {
        return this.f81009h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81003a, r52.f81003a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81004b, r52.f81004b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81005c, r52.f81005c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81006e, r52.f81006e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81007f, r52.f81007f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81008g, r52.f81008g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81009h, r52.f81009h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81010i, r52.f81010i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81011j, r52.f81011j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81012k, r52.f81012k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81013l, r52.f81013l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81014m, r52.f81014m) == true) goto L48;
        return false;
    L48:
        if (this.f81015n == r52.f81015n) goto L51;
        return false;
    L51:
        if (p.g(this.f81016o, r52.f81016o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f81007f;
    }

    public final String g() {
        return this.f81008g;
    }

    public final String h() {
        return this.f81006e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f81003a.hashCode() * 31) + this.f81004b.hashCode()) * 31) + this.f81005c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81006e.hashCode()) * 31) + this.f81007f.hashCode()) * 31) + this.f81008g.hashCode()) * 31) + this.f81009h.hashCode()) * 31) + this.f81010i.hashCode()) * 31) + this.f81011j.hashCode()) * 31) + this.f81012k.hashCode()) * 31) + this.f81013l.hashCode()) * 31) + this.f81014m.hashCode()) * 31) + Boolean.hashCode(this.f81015n)) * 31) + this.f81016o.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.f81015n;
    }

    public String toString() {
        return "CalendarReverseSplitEntity(companySymbol=" + this.f81003a + ", cumDate=" + this.f81004b + ", exDate=" + this.f81005c + ", recDate=" + this.d + ", ratio=" + this.f81006e + ", new=" + this.f81007f + ", old=" + this.f81008g + ", factor=" + this.f81009h + ", lock=" + this.f81010i + ", created=" + this.f81011j + ", newShare=" + this.f81012k + ", newPrice=" + this.f81013l + ", lastUpdate=" + this.f81014m + ", isCorpActionActive=" + this.f81015n + ", eventNote=" + this.f81016o + ")";
    }
}
