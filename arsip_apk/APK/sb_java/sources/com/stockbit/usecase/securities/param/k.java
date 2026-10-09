package com.stockbit.usecase.securities.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final a f161998i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final k f161999j = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f162000a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162001b;

    /* renamed from: c, reason: collision with root package name */
    public final double f162002c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f162003e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162004f;

    /* renamed from: g, reason: collision with root package name */
    public final String f162005g;

    /* renamed from: h, reason: collision with root package name */
    public final String f162006h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a() {
            return k.a();
        }

        public a() {
        }
    }

    static {
        f161998i = new a(null);
        f161999j = new k("", "", 0.0d, "", 0.0d, false, "", "");
    }

    public k(String r2, String r3, double r4, String r6, double r7, boolean r9, String r10, String r11) {
        p.l(r2, "uiRef");
        p.l(r3, "companySymbol");
        p.l(r6, "counterPartyId");
        p.l(r10, "purpose");
        p.l(r11, "reason");
        this.f162000a = r2;
        this.f162001b = r3;
        this.f162002c = r4;
        this.d = r6;
        this.f162003e = r7;
        this.f162004f = r9;
        this.f162005g = r10;
        this.f162006h = r11;
    }

    public static final /* synthetic */ k a() {
        return f161999j;
    }

    public final String b() {
        return this.f162001b;
    }

    public final String c() {
        return this.d;
    }

    public final double d() {
        return this.f162002c;
    }

    public final double e() {
        return this.f162003e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (p.g(this.f162000a, r82.f162000a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162001b, r82.f162001b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f162002c, r82.f162002c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f162003e, r82.f162003e) == 0) goto L24;
        return false;
    L24:
        if (this.f162004f == r82.f162004f) goto L27;
        return false;
    L27:
        if (p.g(this.f162005g, r82.f162005g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f162006h, r82.f162006h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f162005g;
    }

    public final String g() {
        return this.f162006h;
    }

    public final String h() {
        return this.f162000a;
    }

    public int hashCode() {
        return (((((((((((((this.f162000a.hashCode() * 31) + this.f162001b.hashCode()) * 31) + Double.hashCode(this.f162002c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f162003e)) * 31) + Boolean.hashCode(this.f162004f)) * 31) + this.f162005g.hashCode()) * 31) + this.f162006h.hashCode();
    }

    public final boolean i() {
        return this.f162004f;
    }

    public String toString() {
        return "PostOrderNegoUIParam(uiRef=" + this.f162000a + ", companySymbol=" + this.f162001b + ", lot=" + this.f162002c + ", counterPartyId=" + this.d + ", price=" + this.f162003e + ", isPrivateOrder=" + this.f162004f + ", purpose=" + this.f162005g + ", reason=" + this.f162006h + ")";
    }
}
