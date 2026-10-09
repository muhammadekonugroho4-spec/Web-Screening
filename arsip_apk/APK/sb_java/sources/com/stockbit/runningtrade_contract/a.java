package com.stockbit.runningtrade_contract;

import java.util.Calendar;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f131624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131625b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131626c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Calendar f131627e;

    /* renamed from: f, reason: collision with root package name */
    public final Calendar f131628f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131629g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131630h;

    /* renamed from: i, reason: collision with root package name */
    public final String f131631i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131632j;

    public a(String r2, String r3, String r4, String r5, Calendar r6, Calendar r7, String r8, String r9, String r10, String r11) {
        p.l(r2, "symbol");
        p.l(r3, "symbolLogo");
        p.l(r4, "companyName");
        p.l(r8, "chartType");
        p.l(r9, "investorType");
        p.l(r10, "marketType");
        p.l(r11, "companyType");
        this.f131624a = r2;
        this.f131625b = r3;
        this.f131626c = r4;
        this.d = r5;
        this.f131627e = r6;
        this.f131628f = r7;
        this.f131629g = r8;
        this.f131630h = r9;
        this.f131631i = r10;
        this.f131632j = r11;
    }

    public final String a() {
        return this.f131629g;
    }

    public final String b() {
        return this.f131626c;
    }

    public final String c() {
        return this.f131632j;
    }

    public final String d() {
        return this.f131630h;
    }

    public final String e() {
        return this.f131631i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f131624a, r52.f131624a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f131625b, r52.f131625b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f131626c, r52.f131626c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f131627e, r52.f131627e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f131628f, r52.f131628f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f131629g, r52.f131629g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f131630h, r52.f131630h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f131631i, r52.f131631i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f131632j, r52.f131632j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final Calendar g() {
        return this.f131627e;
    }

    public final Calendar h() {
        return this.f131628f;
    }

    public int hashCode() {
        int r02 = ((((this.f131624a.hashCode() * 31) + this.f131625b.hashCode()) * 31) + this.f131626c.hashCode()) * 31;
        String r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Calendar r13 = this.f131627e;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        Calendar r15 = this.f131628f;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((((((((r04 + r2) * 31) + this.f131629g.hashCode()) * 31) + this.f131630h.hashCode()) * 31) + this.f131631i.hashCode()) * 31) + this.f131632j.hashCode();
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f131624a;
    }

    public final String j() {
        return this.f131625b;
    }

    public String toString() {
        return "BrokerFlowNavParam(symbol=" + this.f131624a + ", symbolLogo=" + this.f131625b + ", companyName=" + this.f131626c + ", period=" + this.d + ", periodFrom=" + this.f131627e + ", periodTo=" + this.f131628f + ", chartType=" + this.f131629g + ", investorType=" + this.f131630h + ", marketType=" + this.f131631i + ", companyType=" + this.f131632j + ')';
    }
}
