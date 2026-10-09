package com.stockbit.usecase.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f154668a;

    /* renamed from: b, reason: collision with root package name */
    public final ProfitUIType f154669b;

    public o(String r2, ProfitUIType r3) {
        p.l(r2, "value");
        p.l(r3, "profitType");
        this.f154668a = r2;
        this.f154669b = r3;
    }

    public final ProfitUIType a() {
        return this.f154669b;
    }

    public final String b() {
        return this.f154668a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (p.g(this.f154668a, r52.f154668a) == true) goto L12;
        return false;
    L12:
        if (this.f154669b == r52.f154669b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154668a.hashCode() * 31) + this.f154669b.hashCode();
    }

    public String toString() {
        return "ValueWithProfitType(value=" + this.f154668a + ", profitType=" + this.f154669b + ")";
    }

    public /* synthetic */ o(String r1, ProfitUIType r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = ProfitUIType.NEUTRAL;
    L8:
        this(r1, r2);
    }
}
