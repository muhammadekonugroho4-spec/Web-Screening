package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f88549a;

    /* renamed from: b, reason: collision with root package name */
    public final d f88550b;

    /* renamed from: c, reason: collision with root package name */
    public final d f88551c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final d f88552e;

    public f(d r2, d r3, d r4, d r5, d r6) {
        p.l(r2, "professionName");
        p.l(r3, "professionCompanyName");
        p.l(r4, "professionCompanyWorkplace");
        p.l(r5, "professionCompanyAddress");
        p.l(r6, "professionCompanyPosition");
        this.f88549a = r2;
        this.f88550b = r3;
        this.f88551c = r4;
        this.d = r5;
        this.f88552e = r6;
    }

    public final d a() {
        return this.d;
    }

    public final d b() {
        return this.f88550b;
    }

    public final d c() {
        return this.f88552e;
    }

    public final d d() {
        return this.f88551c;
    }

    public final d e() {
        return this.f88549a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f88549a, r52.f88549a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88550b, r52.f88550b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88551c, r52.f88551c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f88552e, r52.f88552e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f88549a.hashCode() * 31) + this.f88550b.hashCode()) * 31) + this.f88551c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f88552e.hashCode();
    }

    public String toString() {
        return "TradingProfileProfessionUIState(professionName=" + this.f88549a + ", professionCompanyName=" + this.f88550b + ", professionCompanyWorkplace=" + this.f88551c + ", professionCompanyAddress=" + this.d + ", professionCompanyPosition=" + this.f88552e + ")";
    }
}
