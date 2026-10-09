package com.stockbit.domain.model.alert;

import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f80603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80605c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80606e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f80607f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80608g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f80609h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80610i;

    /* renamed from: j, reason: collision with root package name */
    public final List f80611j;

    public i(String r2, String r3, String r4, BigDecimal r5, String r6, BigDecimal r7, String r8, BigDecimal r9, String r10, List r11) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "companyName");
        kotlin.jvm.internal.p.l(r4, "iconUrl");
        kotlin.jvm.internal.p.l(r5, "latestPrice");
        kotlin.jvm.internal.p.l(r6, "latestPriceFormatted");
        kotlin.jvm.internal.p.l(r7, "priceChange");
        kotlin.jvm.internal.p.l(r8, "priceChangeFormatted");
        kotlin.jvm.internal.p.l(r9, "priceChangePercentage");
        kotlin.jvm.internal.p.l(r10, "priceChangePercentageFormatted");
        kotlin.jvm.internal.p.l(r11, "alerts");
        this.f80603a = r2;
        this.f80604b = r3;
        this.f80605c = r4;
        this.d = r5;
        this.f80606e = r6;
        this.f80607f = r7;
        this.f80608g = r8;
        this.f80609h = r9;
        this.f80610i = r10;
        this.f80611j = r11;
    }

    public final List a() {
        return this.f80611j;
    }

    public final String b() {
        return this.f80604b;
    }

    public final String c() {
        return this.f80605c;
    }

    public final BigDecimal d() {
        return this.d;
    }

    public final BigDecimal e() {
        return this.f80607f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f80603a, r52.f80603a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80604b, r52.f80604b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80605c, r52.f80605c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80606e, r52.f80606e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f80607f, r52.f80607f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f80608g, r52.f80608g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f80609h, r52.f80609h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f80610i, r52.f80610i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f80611j, r52.f80611j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final BigDecimal f() {
        return this.f80609h;
    }

    public final String g() {
        return this.f80603a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f80603a.hashCode() * 31) + this.f80604b.hashCode()) * 31) + this.f80605c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80606e.hashCode()) * 31) + this.f80607f.hashCode()) * 31) + this.f80608g.hashCode()) * 31) + this.f80609h.hashCode()) * 31) + this.f80610i.hashCode()) * 31) + this.f80611j.hashCode();
    }

    public String toString() {
        return "AlertGroupEntity(symbol=" + this.f80603a + ", companyName=" + this.f80604b + ", iconUrl=" + this.f80605c + ", latestPrice=" + this.d + ", latestPriceFormatted=" + this.f80606e + ", priceChange=" + this.f80607f + ", priceChangeFormatted=" + this.f80608g + ", priceChangePercentage=" + this.f80609h + ", priceChangePercentageFormatted=" + this.f80610i + ", alerts=" + this.f80611j + ")";
    }
}
