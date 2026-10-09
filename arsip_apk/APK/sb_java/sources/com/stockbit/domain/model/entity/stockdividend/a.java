package com.stockbit.domain.model.entity.stockdividend;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83583a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83584b;

    /* renamed from: c, reason: collision with root package name */
    public final b f83585c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83586e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83587f;

    public a(String r2, boolean r3, b r4, String r5, String r6, String r7) {
        p.l(r2, "companySymbol");
        p.l(r4, "dates");
        p.l(r5, "eventNote");
        p.l(r6, "factor");
        p.l(r7, "ratiosFormatted");
        this.f83583a = r2;
        this.f83584b = r3;
        this.f83585c = r4;
        this.d = r5;
        this.f83586e = r6;
        this.f83587f = r7;
    }

    public final String a() {
        return this.f83583a;
    }

    public final b b() {
        return this.f83585c;
    }

    public final String c() {
        return this.f83586e;
    }

    public final String d() {
        return this.f83587f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f83583a, r52.f83583a) == true) goto L12;
        return false;
    L12:
        if (this.f83584b == r52.f83584b) goto L15;
        return false;
    L15:
        if (p.g(this.f83585c, r52.f83585c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83586e, r52.f83586e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83587f, r52.f83587f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f83583a.hashCode() * 31) + Boolean.hashCode(this.f83584b)) * 31) + this.f83585c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83586e.hashCode()) * 31) + this.f83587f.hashCode();
    }

    public String toString() {
        return "StockDividend(companySymbol=" + this.f83583a + ", corpActionActive=" + this.f83584b + ", dates=" + this.f83585c + ", eventNote=" + this.d + ", factor=" + this.f83586e + ", ratiosFormatted=" + this.f83587f + ')';
    }
}
