package com.stockbit.domain.model.entity.amendbuy;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f82552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82554c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f82555e;

    /* renamed from: f, reason: collision with root package name */
    public final double f82556f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82557g;

    public e(String r2, String r3, String r4, String r5, BigDecimal r6, double r7, boolean r9) {
        p.l(r2, "symbol");
        p.l(r6, "sharesDialogData");
        this.f82552a = r2;
        this.f82553b = r3;
        this.f82554c = r4;
        this.d = r5;
        this.f82555e = r6;
        this.f82556f = r7;
        this.f82557g = r9;
    }

    public final String a() {
        return this.f82553b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f82554c;
    }

    public final double d() {
        return this.f82556f;
    }

    public final BigDecimal e() {
        return this.f82555e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f82552a, r82.f82552a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82553b, r82.f82553b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82554c, r82.f82554c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82555e, r82.f82555e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f82556f, r82.f82556f) == 0) goto L27;
        return false;
    L27:
        if (this.f82557g == r82.f82557g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f82552a;
    }

    public final boolean g() {
        return this.f82557g;
    }

    public int hashCode() {
        int r02 = this.f82552a.hashCode() * 31;
        String r1 = this.f82553b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f82554c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((((((r04 + r2) * 31) + this.f82555e.hashCode()) * 31) + Double.hashCode(this.f82556f)) * 31) + Boolean.hashCode(this.f82557g);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "AmendBuyDialogOrderEntity(symbol=" + this.f82552a + ", cost=" + this.f82553b + ", price=" + this.f82554c + ", lot=" + this.d + ", sharesDialogData=" + this.f82555e + ", priceDialogData=" + this.f82556f + ", isValueReady=" + this.f82557g + ')';
    }
}
