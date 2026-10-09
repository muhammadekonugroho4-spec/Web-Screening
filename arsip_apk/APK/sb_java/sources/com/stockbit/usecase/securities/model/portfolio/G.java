package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final String f161606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161608c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161609e;

    public G(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "percentage");
        kotlin.jvm.internal.p.l(r4, "currentPrice");
        kotlin.jvm.internal.p.l(r5, "averagePrice");
        kotlin.jvm.internal.p.l(r6, "iconUrl");
        this.f161606a = r2;
        this.f161607b = r3;
        this.f161608c = r4;
        this.d = r5;
        this.f161609e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f161608c;
    }

    public final String c() {
        return this.f161609e;
    }

    public final String d() {
        return this.f161607b;
    }

    public final String e() {
        return this.f161606a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof G) == true) goto L8;
        return false;
    L8:
        G r52 = (G) r5;
        if (kotlin.jvm.internal.p.g(this.f161606a, r52.f161606a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161607b, r52.f161607b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161608c, r52.f161608c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161609e, r52.f161609e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f161606a.hashCode() * 31) + this.f161607b.hashCode()) * 31) + this.f161608c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161609e.hashCode();
    }

    public String toString() {
        return "PortfolioShareUIState(symbol=" + this.f161606a + ", percentage=" + this.f161607b + ", currentPrice=" + this.f161608c + ", averagePrice=" + this.d + ", iconUrl=" + this.f161609e + ")";
    }

    public /* synthetic */ G(String r2, String r3, String r4, String r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
