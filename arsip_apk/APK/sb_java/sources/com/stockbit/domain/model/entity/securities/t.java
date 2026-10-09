package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f83563a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f83564b;

    public t(String r1, Integer r2) {
        this.f83563a = r1;
        this.f83564b = r2;
    }

    public final String a() {
        return this.f83563a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f83563a, r52.f83563a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83564b, r52.f83564b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83563a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f83564b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingAmend(orderid=" + this.f83563a + ", orderCount=" + this.f83564b + ')';
    }

    public /* synthetic */ t(String r1, Integer r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
