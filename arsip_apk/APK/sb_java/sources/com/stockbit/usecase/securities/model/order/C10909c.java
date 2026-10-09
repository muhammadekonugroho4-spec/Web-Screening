package com.stockbit.usecase.securities.model.order;

/* renamed from: com.stockbit.usecase.securities.model.order.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10909c {

    /* renamed from: a, reason: collision with root package name */
    public final C10910d f161212a;

    /* renamed from: b, reason: collision with root package name */
    public final C10910d f161213b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161214c;

    public C10909c(C10910d r2, C10910d r3, String r4) {
        kotlin.jvm.internal.p.l(r4, "buyPrice");
        this.f161212a = r2;
        this.f161213b = r3;
        this.f161214c = r4;
    }

    public final String a() {
        return this.f161214c;
    }

    public final C10910d b() {
        return this.f161212a;
    }

    public final C10910d c() {
        return this.f161213b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10909c) == true) goto L8;
        return false;
    L8:
        C10909c r52 = (C10909c) r5;
        if (kotlin.jvm.internal.p.g(this.f161212a, r52.f161212a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161213b, r52.f161213b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161214c, r52.f161214c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        C10910d r02 = this.f161212a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        C10910d r2 = this.f161213b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((r04 + r1) * 31) + this.f161214c.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BracketOrder(stopLossBracketOrder=" + this.f161212a + ", takeProfitBracketOrder=" + this.f161213b + ", buyPrice=" + this.f161214c + ")";
    }
}
