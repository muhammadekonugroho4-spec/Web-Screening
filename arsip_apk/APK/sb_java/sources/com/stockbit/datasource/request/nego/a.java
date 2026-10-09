package com.stockbit.datasource.request.nego;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80115c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80116e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80117f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80118g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80119h;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "assetCode");
        p.l(r3, "referenceId");
        p.l(r4, "orderPrice");
        p.l(r5, "side");
        p.l(r6, "pageSize");
        p.l(r7, "pageToken");
        p.l(r8, "sortBy");
        p.l(r9, "sortOrder");
        this.f80113a = r2;
        this.f80114b = r3;
        this.f80115c = r4;
        this.d = r5;
        this.f80116e = r6;
        this.f80117f = r7;
        this.f80118g = r8;
        this.f80119h = r9;
    }

    public final String a() {
        return this.f80113a;
    }

    public final String b() {
        return this.f80115c;
    }

    public final String c() {
        return this.f80116e;
    }

    public final String d() {
        return this.f80117f;
    }

    public final String e() {
        return this.f80114b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80113a, r52.f80113a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80114b, r52.f80114b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80115c, r52.f80115c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80116e, r52.f80116e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80117f, r52.f80117f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80118g, r52.f80118g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80119h, r52.f80119h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f80118g;
    }

    public final String h() {
        return this.f80119h;
    }

    public int hashCode() {
        return (((((((((((((this.f80113a.hashCode() * 31) + this.f80114b.hashCode()) * 31) + this.f80115c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80116e.hashCode()) * 31) + this.f80117f.hashCode()) * 31) + this.f80118g.hashCode()) * 31) + this.f80119h.hashCode();
    }

    public String toString() {
        return "OrderNegoDataParam(assetCode=" + this.f80113a + ", referenceId=" + this.f80114b + ", orderPrice=" + this.f80115c + ", side=" + this.d + ", pageSize=" + this.f80116e + ", pageToken=" + this.f80117f + ", sortBy=" + this.f80118g + ", sortOrder=" + this.f80119h + ")";
    }
}
