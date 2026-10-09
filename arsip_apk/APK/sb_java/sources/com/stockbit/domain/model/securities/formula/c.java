package com.stockbit.domain.model.securities.formula;

import com.clevertap.android.sdk.Constants;
import com.stockbit.company.CompanyEntryPoint;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85177c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85178e;

    /* renamed from: f, reason: collision with root package name */
    public final double f85179f;

    /* renamed from: g, reason: collision with root package name */
    public final double f85180g;

    /* renamed from: h, reason: collision with root package name */
    public final double f85181h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85182i;

    public c(String r2, String r3, String r4, List r5, String r6, double r7, double r9, double r11, double r13) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, CompanyEntryPoint.EXTRA_DESC);
        p.l(r4, "subtitle");
        p.l(r5, "compositions");
        p.l(r6, "exchangeFeeTotalTitle");
        this.f85175a = r2;
        this.f85176b = r3;
        this.f85177c = r4;
        this.d = r5;
        this.f85178e = r6;
        this.f85179f = r7;
        this.f85180g = r9;
        this.f85181h = r11;
        this.f85182i = r13;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f85176b;
    }

    public final double c() {
        return this.f85179f;
    }

    public final double d() {
        return this.f85181h;
    }

    public final double e() {
        return this.f85182i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f85175a, r82.f85175a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85176b, r82.f85176b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85177c, r82.f85177c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85178e, r82.f85178e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f85179f, r82.f85179f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f85180g, r82.f85180g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f85181h, r82.f85181h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85182i, r82.f85182i) == 0) goto L35;
        return false;
    L35:
        return true;
    }

    public final double f() {
        return this.f85180g;
    }

    public final String g() {
        return this.f85178e;
    }

    public final String h() {
        return this.f85177c;
    }

    public int hashCode() {
        return (((((((((((((((this.f85175a.hashCode() * 31) + this.f85176b.hashCode()) * 31) + this.f85177c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85178e.hashCode()) * 31) + Double.hashCode(this.f85179f)) * 31) + Double.hashCode(this.f85180g)) * 31) + Double.hashCode(this.f85181h)) * 31) + Double.hashCode(this.f85182i);
    }

    public final String i() {
        return this.f85175a;
    }

    public String toString() {
        return "ExchangeEntity(title=" + this.f85175a + ", desc=" + this.f85176b + ", subtitle=" + this.f85177c + ", compositions=" + this.d + ", exchangeFeeTotalTitle=" + this.f85178e + ", exchangeFeeTotalBuy=" + this.f85179f + ", exchangeFeeTotalSell=" + this.f85180g + ", exchangeFeeTotalCaBuy=" + this.f85181h + ", exchangeFeeTotalCaSell=" + this.f85182i + ")";
    }
}
