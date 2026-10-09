package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f85043a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85044b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85045c;
    public final double d;

    public b(String r2, String r3, String r4, double r5) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "board");
        kotlin.jvm.internal.p.l(r4, "channelCode");
        this.f85043a = r2;
        this.f85044b = r3;
        this.f85045c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f85044b;
    }

    public final String b() {
        return this.f85045c;
    }

    public final String c() {
        return this.f85043a;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (kotlin.jvm.internal.p.g(this.f85043a, r82.f85043a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85044b, r82.f85044b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85045c, r82.f85045c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85043a.hashCode() * 31) + this.f85044b.hashCode()) * 31) + this.f85045c.hashCode()) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "HistoryAdditionalInfoNegoEntity(orderId=" + this.f85043a + ", board=" + this.f85044b + ", channelCode=" + this.f85045c + ", otcFee=" + this.d + ")";
    }
}
