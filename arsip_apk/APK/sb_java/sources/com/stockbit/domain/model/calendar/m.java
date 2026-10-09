package com.stockbit.domain.model.calendar;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final List f81082a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81083b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81084c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f81085e;

    /* renamed from: f, reason: collision with root package name */
    public final List f81086f;

    /* renamed from: g, reason: collision with root package name */
    public final List f81087g;

    /* renamed from: h, reason: collision with root package name */
    public final List f81088h;

    /* renamed from: i, reason: collision with root package name */
    public final List f81089i;

    /* renamed from: j, reason: collision with root package name */
    public final List f81090j;

    /* renamed from: k, reason: collision with root package name */
    public final List f81091k;

    /* renamed from: l, reason: collision with root package name */
    public final List f81092l;

    public m(List r2, List r3, List r4, List r5, List r6, List r7, List r8, List r9, List r10, List r11, List r12, List r13) {
        p.l(r2, "dividends");
        p.l(r3, "stockSplits");
        p.l(r4, "reverseSplits");
        p.l(r5, "rightIssues");
        p.l(r6, "warrants");
        p.l(r7, "bonuses");
        p.l(r8, "tenderOffers");
        p.l(r9, "rupses");
        p.l(r10, "publicExposes");
        p.l(r11, "ipos");
        p.l(r12, "economics");
        p.l(r13, "stockDividends");
        this.f81082a = r2;
        this.f81083b = r3;
        this.f81084c = r4;
        this.d = r5;
        this.f81085e = r6;
        this.f81086f = r7;
        this.f81087g = r8;
        this.f81088h = r9;
        this.f81089i = r10;
        this.f81090j = r11;
        this.f81091k = r12;
        this.f81092l = r13;
    }

    public final List a() {
        return this.f81086f;
    }

    public final List b() {
        return this.f81082a;
    }

    public final List c() {
        return this.f81090j;
    }

    public final List d() {
        return this.f81089i;
    }

    public final List e() {
        return this.f81084c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f81082a, r52.f81082a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81083b, r52.f81083b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81084c, r52.f81084c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81085e, r52.f81085e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81086f, r52.f81086f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81087g, r52.f81087g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81088h, r52.f81088h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81089i, r52.f81089i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81090j, r52.f81090j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81091k, r52.f81091k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81092l, r52.f81092l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final List f() {
        return this.d;
    }

    public final List g() {
        return this.f81088h;
    }

    public final List h() {
        return this.f81092l;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f81082a.hashCode() * 31) + this.f81083b.hashCode()) * 31) + this.f81084c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81085e.hashCode()) * 31) + this.f81086f.hashCode()) * 31) + this.f81087g.hashCode()) * 31) + this.f81088h.hashCode()) * 31) + this.f81089i.hashCode()) * 31) + this.f81090j.hashCode()) * 31) + this.f81091k.hashCode()) * 31) + this.f81092l.hashCode();
    }

    public final List i() {
        return this.f81083b;
    }

    public final List j() {
        return this.f81087g;
    }

    public final List k() {
        return this.f81085e;
    }

    public String toString() {
        return "CalendarTodayEntity(dividends=" + this.f81082a + ", stockSplits=" + this.f81083b + ", reverseSplits=" + this.f81084c + ", rightIssues=" + this.d + ", warrants=" + this.f81085e + ", bonuses=" + this.f81086f + ", tenderOffers=" + this.f81087g + ", rupses=" + this.f81088h + ", publicExposes=" + this.f81089i + ", ipos=" + this.f81090j + ", economics=" + this.f81091k + ", stockDividends=" + this.f81092l + ")";
    }
}
