package com.stockbit.usecase.securities.model.history;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f160817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160819c;
    public final String d;

    public o(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "sourceAccNo");
        kotlin.jvm.internal.p.l(r3, "sourceName");
        kotlin.jvm.internal.p.l(r4, "destinationAccNo");
        kotlin.jvm.internal.p.l(r5, "destinationName");
        this.f160817a = r2;
        this.f160818b = r3;
        this.f160819c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f160817a;
    }

    public final String c() {
        return this.f160818b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f160817a, r52.f160817a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160818b, r52.f160818b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160819c, r52.f160819c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f160817a.hashCode() * 31) + this.f160818b.hashCode()) * 31) + this.f160819c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RealizedMoveStockCashUIState(sourceAccNo=" + this.f160817a + ", sourceName=" + this.f160818b + ", destinationAccNo=" + this.f160819c + ", destinationName=" + this.d + ")";
    }

    public /* synthetic */ o(String r2, String r3, String r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
