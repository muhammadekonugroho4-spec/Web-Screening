package com.stockbit.usecase.securities.model.history;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f160653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160654b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160655c;
    public final double d;

    public b(String r2, String r3, String r4, double r5) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "board");
        kotlin.jvm.internal.p.l(r4, "channelCode");
        this.f160653a = r2;
        this.f160654b = r3;
        this.f160655c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f160654b;
    }

    public final String b() {
        return this.f160655c;
    }

    public final String c() {
        return this.f160653a;
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
        if (kotlin.jvm.internal.p.g(this.f160653a, r82.f160653a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160654b, r82.f160654b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160655c, r82.f160655c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f160653a.hashCode() * 31) + this.f160654b.hashCode()) * 31) + this.f160655c.hashCode()) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "HistoryAdditionalInfoNegoUIState(orderId=" + this.f160653a + ", board=" + this.f160654b + ", channelCode=" + this.f160655c + ", otcFee=" + this.d + ")";
    }
}
