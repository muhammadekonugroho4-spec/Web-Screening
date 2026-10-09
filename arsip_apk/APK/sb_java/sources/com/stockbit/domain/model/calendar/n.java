package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f81093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81095c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81096e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81097f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81098g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81099h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81100i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81101j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81102k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81103l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81104m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f81105n;

    public n(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, boolean r15) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companyId");
        p.l(r4, "companySymbol");
        p.l(r5, "serie");
        p.l(r6, "excPrice");
        p.l(r7, "tradingFrom");
        p.l(r8, "tradingEnd");
        p.l(r9, "excFrom");
        p.l(r10, "excEnd");
        p.l(r11, "total");
        p.l(r12, "lastUpdate");
        p.l(r13, "note");
        p.l(r14, "priceFormatted");
        this.f81093a = r2;
        this.f81094b = r3;
        this.f81095c = r4;
        this.d = r5;
        this.f81096e = r6;
        this.f81097f = r7;
        this.f81098g = r8;
        this.f81099h = r9;
        this.f81100i = r10;
        this.f81101j = r11;
        this.f81102k = r12;
        this.f81103l = r13;
        this.f81104m = r14;
        this.f81105n = r15;
    }

    public final String a() {
        return this.f81095c;
    }

    public final String b() {
        return this.f81100i;
    }

    public final String c() {
        return this.f81099h;
    }

    public final String d() {
        return this.f81096e;
    }

    public final String e() {
        return this.f81093a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f81093a, r52.f81093a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81094b, r52.f81094b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81095c, r52.f81095c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81096e, r52.f81096e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81097f, r52.f81097f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81098g, r52.f81098g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81099h, r52.f81099h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81100i, r52.f81100i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81101j, r52.f81101j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81102k, r52.f81102k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81103l, r52.f81103l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81104m, r52.f81104m) == true) goto L48;
        return false;
    L48:
        if (this.f81105n == r52.f81105n) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f81103l;
    }

    public final String g() {
        return this.f81104m;
    }

    public final String h() {
        return this.f81098g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f81093a.hashCode() * 31) + this.f81094b.hashCode()) * 31) + this.f81095c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81096e.hashCode()) * 31) + this.f81097f.hashCode()) * 31) + this.f81098g.hashCode()) * 31) + this.f81099h.hashCode()) * 31) + this.f81100i.hashCode()) * 31) + this.f81101j.hashCode()) * 31) + this.f81102k.hashCode()) * 31) + this.f81103l.hashCode()) * 31) + this.f81104m.hashCode()) * 31) + Boolean.hashCode(this.f81105n);
    }

    public final String i() {
        return this.f81097f;
    }

    public final boolean j() {
        return this.f81105n;
    }

    public String toString() {
        return "CalendarWarrantEntity(id=" + this.f81093a + ", companyId=" + this.f81094b + ", companySymbol=" + this.f81095c + ", serie=" + this.d + ", excPrice=" + this.f81096e + ", tradingFrom=" + this.f81097f + ", tradingEnd=" + this.f81098g + ", excFrom=" + this.f81099h + ", excEnd=" + this.f81100i + ", total=" + this.f81101j + ", lastUpdate=" + this.f81102k + ", note=" + this.f81103l + ", priceFormatted=" + this.f81104m + ", isCorpActionActive=" + this.f81105n + ")";
    }
}
