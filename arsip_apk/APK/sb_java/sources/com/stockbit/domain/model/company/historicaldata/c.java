package com.stockbit.domain.model.company.historicaldata;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81536a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81537b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81538c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81539e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81540f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81541g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81542h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81543i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81544j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81545k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81546l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81547m;

    /* renamed from: n, reason: collision with root package name */
    public final String f81548n;

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "average");
        p.l(r4, "change");
        p.l(r5, "changePercentage");
        p.l(r6, Constants.KEY_HIDE_CLOSE);
        p.l(r7, "foreignBuy");
        p.l(r8, "foreignSell");
        p.l(r9, Constants.KEY_FREQUENCY);
        p.l(r10, Constants.PRIORITY_HIGH);
        p.l(r11, "low");
        p.l(r12, "netForeign");
        p.l(r13, "open");
        p.l(r14, "value");
        p.l(r15, "volume");
        this.f81536a = r2;
        this.f81537b = r3;
        this.f81538c = r4;
        this.d = r5;
        this.f81539e = r6;
        this.f81540f = r7;
        this.f81541g = r8;
        this.f81542h = r9;
        this.f81543i = r10;
        this.f81544j = r11;
        this.f81545k = r12;
        this.f81546l = r13;
        this.f81547m = r14;
        this.f81548n = r15;
    }

    public final String a() {
        return this.f81537b;
    }

    public final String b() {
        return this.f81538c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f81539e;
    }

    public final String e() {
        return this.f81536a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81536a, r52.f81536a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81537b, r52.f81537b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81538c, r52.f81538c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81539e, r52.f81539e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81540f, r52.f81540f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81541g, r52.f81541g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81542h, r52.f81542h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81543i, r52.f81543i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81544j, r52.f81544j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81545k, r52.f81545k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81546l, r52.f81546l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81547m, r52.f81547m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f81548n, r52.f81548n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f81540f;
    }

    public final String g() {
        return this.f81541g;
    }

    public final String h() {
        return this.f81542h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f81536a.hashCode() * 31) + this.f81537b.hashCode()) * 31) + this.f81538c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81539e.hashCode()) * 31) + this.f81540f.hashCode()) * 31) + this.f81541g.hashCode()) * 31) + this.f81542h.hashCode()) * 31) + this.f81543i.hashCode()) * 31) + this.f81544j.hashCode()) * 31) + this.f81545k.hashCode()) * 31) + this.f81546l.hashCode()) * 31) + this.f81547m.hashCode()) * 31) + this.f81548n.hashCode();
    }

    public final String i() {
        return this.f81543i;
    }

    public final String j() {
        return this.f81544j;
    }

    public final String k() {
        return this.f81545k;
    }

    public final String l() {
        return this.f81546l;
    }

    public final String m() {
        return this.f81547m;
    }

    public final String n() {
        return this.f81548n;
    }

    public String toString() {
        return "HistoricalDataResultEntity(date=" + this.f81536a + ", average=" + this.f81537b + ", change=" + this.f81538c + ", changePercentage=" + this.d + ", close=" + this.f81539e + ", foreignBuy=" + this.f81540f + ", foreignSell=" + this.f81541g + ", frequency=" + this.f81542h + ", high=" + this.f81543i + ", low=" + this.f81544j + ", netForeign=" + this.f81545k + ", open=" + this.f81546l + ", value=" + this.f81547m + ", volume=" + this.f81548n + ")";
    }
}
