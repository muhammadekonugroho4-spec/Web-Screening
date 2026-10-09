package com.stockbit.domain.model.topstock;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f85886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85887b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85888c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85889e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85890f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85891g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85892h;

    public d(int r2, int r3, String r4, String r5, int r6, String r7, String r8, String r9) {
        p.l(r4, "startDate");
        p.l(r5, "endDate");
        p.l(r7, "valueType");
        p.l(r8, "investorType");
        p.l(r9, "marketType");
        this.f85886a = r2;
        this.f85887b = r3;
        this.f85888c = r4;
        this.d = r5;
        this.f85889e = r6;
        this.f85890f = r7;
        this.f85891g = r8;
        this.f85892h = r9;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f85891g;
    }

    public final int c() {
        return this.f85887b;
    }

    public final String d() {
        return this.f85892h;
    }

    public final int e() {
        return this.f85889e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f85886a == r52.f85886a) goto L12;
        return false;
    L12:
        if (this.f85887b == r52.f85887b) goto L15;
        return false;
    L15:
        if (p.g(this.f85888c, r52.f85888c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f85889e == r52.f85889e) goto L24;
        return false;
    L24:
        if (p.g(this.f85890f, r52.f85890f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85891g, r52.f85891g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85892h, r52.f85892h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int f() {
        return this.f85886a;
    }

    public final String g() {
        return this.f85888c;
    }

    public final String h() {
        return this.f85890f;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f85886a) * 31) + Integer.hashCode(this.f85887b)) * 31) + this.f85888c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f85889e)) * 31) + this.f85890f.hashCode()) * 31) + this.f85891g.hashCode()) * 31) + this.f85892h.hashCode();
    }

    public String toString() {
        return "TopStockInfoEntity(page=" + this.f85886a + ", limit=" + this.f85887b + ", startDate=" + this.f85888c + ", endDate=" + this.d + ", maxDayDuration=" + this.f85889e + ", valueType=" + this.f85890f + ", investorType=" + this.f85891g + ", marketType=" + this.f85892h + ")";
    }
}
