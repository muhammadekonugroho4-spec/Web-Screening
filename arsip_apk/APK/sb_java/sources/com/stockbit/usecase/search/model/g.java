package com.stockbit.usecase.search.model;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f160008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160009b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160010c;

    public g(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "formattedLot");
        kotlin.jvm.internal.p.l(r3, "formattedValue");
        kotlin.jvm.internal.p.l(r4, "formattedFrequency");
        this.f160008a = r2;
        this.f160009b = r3;
        this.f160010c = r4;
    }

    public final String a() {
        return this.f160010c;
    }

    public final String b() {
        return this.f160008a;
    }

    public final String c() {
        return this.f160009b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f160008a, r52.f160008a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160009b, r52.f160009b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160010c, r52.f160010c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160008a.hashCode() * 31) + this.f160009b.hashCode()) * 31) + this.f160010c.hashCode();
    }

    public String toString() {
        return "MarketDataTotalUIState(formattedLot=" + this.f160008a + ", formattedValue=" + this.f160009b + ", formattedFrequency=" + this.f160010c + ")";
    }

    public /* synthetic */ g(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "-";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "-";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "-";
    L11:
        this(r2, r3, r4);
    }
}
