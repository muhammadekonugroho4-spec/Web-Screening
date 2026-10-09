package com.stockbit.usecase.securities.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final a f160545i = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f160546a;

    /* renamed from: b, reason: collision with root package name */
    public final double f160547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160548c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160549e;

    /* renamed from: f, reason: collision with root package name */
    public final double f160550f;

    /* renamed from: g, reason: collision with root package name */
    public final float f160551g;

    /* renamed from: h, reason: collision with root package name */
    public final OrderBookColorType f160552h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a() {
            return new f("", 0.0d, "", 0.0d, "", 0.0d, 0.0f, OrderBookColorType.NORMAL);
        }

        public a() {
        }
    }

    static {
        f160545i = new a(null);
    }

    public f(String r2, double r3, String r5, double r6, String r8, double r9, float r11, OrderBookColorType r12) {
        p.l(r2, "freq");
        p.l(r5, "lot");
        p.l(r8, "value");
        p.l(r12, "type");
        this.f160546a = r2;
        this.f160547b = r3;
        this.f160548c = r5;
        this.d = r6;
        this.f160549e = r8;
        this.f160550f = r9;
        this.f160551g = r11;
        this.f160552h = r12;
    }

    public final String a() {
        return this.f160546a;
    }

    public final double b() {
        return this.f160547b;
    }

    public final float c() {
        return this.f160551g;
    }

    public final String d() {
        return this.f160548c;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f160546a, r82.f160546a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f160547b, r82.f160547b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f160548c, r82.f160548c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f160549e, r82.f160549e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f160550f, r82.f160550f) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.f160551g, r82.f160551g) == 0) goto L30;
        return false;
    L30:
        if (this.f160552h == r82.f160552h) goto L32;
        return false;
    L32:
        return true;
    }

    public final OrderBookColorType f() {
        return this.f160552h;
    }

    public final String g() {
        return this.f160549e;
    }

    public final double h() {
        return this.f160550f;
    }

    public int hashCode() {
        return (((((((((((((this.f160546a.hashCode() * 31) + Double.hashCode(this.f160547b)) * 31) + this.f160548c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f160549e.hashCode()) * 31) + Double.hashCode(this.f160550f)) * 31) + Float.hashCode(this.f160551g)) * 31) + this.f160552h.hashCode();
    }

    public String toString() {
        return "OrderBookBidAskUIState(freq=" + this.f160546a + ", freqDouble=" + this.f160547b + ", lot=" + this.f160548c + ", lotDouble=" + this.d + ", value=" + this.f160549e + ", valueDouble=" + this.f160550f + ", indicator=" + this.f160551g + ", type=" + this.f160552h + ")";
    }
}
