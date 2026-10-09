package com.stockbit.domain.model.screener;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f84898a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84900c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84902f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84903g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84904h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84905i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f84906j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f84907k;

    /* renamed from: l, reason: collision with root package name */
    public final List f84908l;

    /* renamed from: m, reason: collision with root package name */
    public final List f84909m;

    /* renamed from: n, reason: collision with root package name */
    public final List f84910n;

    /* renamed from: o, reason: collision with root package name */
    public final List f84911o;

    /* renamed from: p, reason: collision with root package name */
    public final a f84912p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84913q;

    public i(int r7, String r8, int r9, int r10, String r11, int r12, int r13, String r14, String r15, boolean r16, boolean r17, List r18, List r19, List r20, List r21, a r22, String r23) {
        p.l(r8, "universe");
        p.l(r11, "sort");
        p.l(r14, "screenName");
        p.l(r15, "screenDesc");
        p.l(r18, "calcs");
        p.l(r19, "rules");
        p.l(r20, "columns");
        p.l(r21, "sequence");
        this.f84898a = r7;
        this.f84899b = r8;
        this.f84900c = r9;
        this.d = r10;
        this.f84901e = r11;
        this.f84902f = r12;
        this.f84903g = r13;
        this.f84904h = r14;
        this.f84905i = r15;
        this.f84906j = r16;
        this.f84907k = r17;
        this.f84908l = r18;
        this.f84909m = r19;
        this.f84910n = r20;
        this.f84911o = r21;
        this.f84912p = r22;
        this.f84913q = r23;
    }

    public final a a() {
        return this.f84912p;
    }

    public final List b() {
        return this.f84908l;
    }

    public final List c() {
        return this.f84910n;
    }

    public final int d() {
        return this.f84903g;
    }

    public final boolean e() {
        return this.f84906j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f84898a == r52.f84898a) goto L12;
        return false;
    L12:
        if (p.g(this.f84899b, r52.f84899b) == true) goto L15;
        return false;
    L15:
        if (this.f84900c == r52.f84900c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f84901e, r52.f84901e) == true) goto L24;
        return false;
    L24:
        if (this.f84902f == r52.f84902f) goto L27;
        return false;
    L27:
        if (this.f84903g == r52.f84903g) goto L30;
        return false;
    L30:
        if (p.g(this.f84904h, r52.f84904h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84905i, r52.f84905i) == true) goto L36;
        return false;
    L36:
        if (this.f84906j == r52.f84906j) goto L39;
        return false;
    L39:
        if (this.f84907k == r52.f84907k) goto L42;
        return false;
    L42:
        if (p.g(this.f84908l, r52.f84908l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84909m, r52.f84909m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84910n, r52.f84910n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f84911o, r52.f84911o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84912p, r52.f84912p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84913q, r52.f84913q) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.f84902f;
    }

    public final List h() {
        return this.f84909m;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((Integer.hashCode(this.f84898a) * 31) + this.f84899b.hashCode()) * 31) + Integer.hashCode(this.f84900c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f84901e.hashCode()) * 31) + Integer.hashCode(this.f84902f)) * 31) + Integer.hashCode(this.f84903g)) * 31) + this.f84904h.hashCode()) * 31) + this.f84905i.hashCode()) * 31) + Boolean.hashCode(this.f84906j)) * 31) + Boolean.hashCode(this.f84907k)) * 31) + this.f84908l.hashCode()) * 31) + this.f84909m.hashCode()) * 31) + this.f84910n.hashCode()) * 31) + this.f84911o.hashCode()) * 31;
        a r1 = this.f84912p;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f84913q;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f84905i;
    }

    public final String j() {
        return this.f84904h;
    }

    public final int k() {
        return this.f84898a;
    }

    public final List l() {
        return this.f84911o;
    }

    public final String m() {
        return this.f84901e;
    }

    public final int n() {
        return this.f84900c;
    }

    public final String o() {
        return this.f84913q;
    }

    public final String p() {
        return this.f84899b;
    }

    public final boolean q() {
        return this.f84907k;
    }

    public String toString() {
        return "ScreenerScreenEntity(screenerId=" + this.f84898a + ", universe=" + this.f84899b + ", totalRows=" + this.f84900c + ", order=" + this.d + ", sort=" + this.f84901e + ", perPage=" + this.f84902f + ", curPage=" + this.f84903g + ", screenName=" + this.f84904h + ", screenDesc=" + this.f84905i + ", favorite=" + this.f84906j + ", isGuru=" + this.f84907k + ", calcs=" + this.f84908l + ", rules=" + this.f84909m + ", columns=" + this.f84910n + ", sequence=" + this.f84911o + ", badges=" + this.f84912p + ", type=" + this.f84913q + ")";
    }
}
